/*******************************************************************************
 * Copyright (c) 2010, 2011 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.mylyn.docs.intent.parser.modelingunit;

import com.google.inject.Injector;

import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.mylyn.docs.intent.core.genericunit.GenericUnitPackage;
import org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnit;
import org.eclipse.mylyn.docs.intent.parser.modelingunit.parser.antlr.ModelingUnitXTextGrammarParser;
import org.eclipse.mylyn.docs.intent.parser.modelingunit.parser.linker.ModelingUnitLinker;
import org.eclipse.mylyn.docs.intent.parser.modelingunit.parser.utils.FileToStringConverter;
import org.eclipse.mylyn.docs.intent.serializer.ParsedElementPosition;
import org.eclipse.xtext.parser.DefaultEcoreElementFactory;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.parser.IParser;
import org.eclipse.xtext.parser.ParseResult;
import org.eclipse.xtext.parser.antlr.IAntlrParser;
import org.eclipse.xtext.parsetree.AbstractNode;
import org.eclipse.xtext.parsetree.CompositeNode;
import org.eclipse.xtext.parsetree.NodeContentAdapter;
import org.eclipse.xtext.parsetree.SyntaxError;

/**
 * Modeling Unit parser which uses the XText parser in Standalone mode, and call this parser on several
 * elements.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public final class ModelingUnitParserImpl implements ModelingUnitParser {

	/**
	 * Number of characters to print in the getPreviousCharacters method.
	 */
	private static final int SIZE_OF_PREVIOUS_CHARACTERS = 25;

	/**
	 * Parser managed by this StandaloneParsingManager.
	 */
	private IParser parser;

	/**
	 * Mapping that associates each parsed element to a position (cleared at each new parsing).
	 */
	private final Map<EObject, ParsedElementPosition> elementToPosition;

	/**
	 * StandaloneParsingTests constructor.
	 */
	public ModelingUnitParserImpl() {
		init();
		elementToPosition = new HashMap<EObject, ParsedElementPosition>();
	}

	/**
	 * Returns true if the given String can be parsed by this parser.
	 * 
	 * @param contentToParse
	 *            the content to inspect
	 * @return true if the given string can be parsed by this parser (i.e is a modeling Unit : '@M ... M@')
	 */
	public boolean isParserFor(String contentToParse) {
		return contentToParse.startsWith(MODELING_UNIT_PREFIX)
				&& contentToParse.endsWith(MODELING_UNIT_SUFFIX);
	}

	/**
	 * Launch the XText parser in standalone mode and register EPackages.
	 */
	private void init() {

		// Step 1 : we register the EPackages in use
		registerEPackages();

		// Step 2 : we get the XText parser in standalone mode
		Injector guiceInjector = ModelingUnitXTextGrammarStandaloneSetup.doSetupAndReturnInjector();
		parser = guiceInjector.getInstance(IAntlrParser.class);
		// We define an alternative IASTElement factory to solve issues due to CDO's BasicEStoreELists
		DefaultEcoreElementFactory factory = (DefaultEcoreElementFactory)((ModelingUnitXTextGrammarParser)parser)
				.getElementFactory();
		CDOAstElementFactory newElementFactory = new CDOAstElementFactory(factory);
		((ModelingUnitXTextGrammarParser)parser).setElementFactory(newElementFactory);
	}

	/**
	 * Register the EPackages needed by the parser.
	 */
	private void registerEPackages() {
		GenericUnitPackage.eINSTANCE.eClass();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.parser.modelingunit.ModelingUnitParser#parseFile(java.lang.String)
	 */
	public EObject parseFile(String filePath) throws ParseException, IOException {
		String contentToParse = FileToStringConverter.getFileAsString(new File(filePath));
		return parseString(contentToParse);
		/*
		 * We could have used the XText Resource, but we would have lost the CDO sync. : ResourceSet
		 * resourceSet = new ResourceSetImpl(); URI uri = URI.createFileURI(new
		 * File(fileToParse).getAbsolutePath()); Resource resource = resourceSet.getResource(uri, true);
		 * return resource.getContents().get(0);
		 */
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.parser.modelingunit.ModelingUnitParser#parseString(java.lang.String)
	 */
	public EObject parseString(String stringToParse) throws ParseException {

		// Step 0 : we format the given String
		String formattedStringToParse = ModelingUnitFormatter.format(stringToParse);
		// Step 1 : we parse the given String and store the ParseResult
		IParseResult parseResult = parser.parse(new StringReader(formattedStringToParse));

		// Step 2 : we reStrucure the parseResult (Node's offsets initialization...)
		// IMPORTANT : the Link Resolving will have to be launched by the Resource itself (we can't resolve
		// @see links, because referenced Sections aren't in this AST)
		parseResult = restructureParseResult(parseResult);

		// Step 3 : if there is any error in the parsing, we construct an error message and throw a Parse
		// Exception
		List<SyntaxError> errors = parseResult.getParseErrors();
		if (!errors.isEmpty()) {

			String errorMessage = "";
			for (SyntaxError syntaxError : errors) {

				errorMessage += "- line " + syntaxError.getNode().getLine() + " : "
						+ syntaxError.getMessage() + " / " + getPreviousCharacters(syntaxError.getNode())
						+ syntaxError.getNode().serialize() + "\n";
				throw new ParseException(errorMessage, syntaxError.getNode().getOffset(), syntaxError
						.getNode().getLength());
			}

		}

		// Step 4 : we create the mapping between element and positions.
		elementToPosition.clear();
		generatedElementToPositionMapping(parseResult.getRootNode());

		return parseResult.getRootASTElement();
	}

	private void generatedElementToPositionMapping(AbstractNode node) {

		elementToPosition.put(node.getElement(),
				new ParsedElementPosition(node.getOffset(), node.getLength()));
		if (node instanceof CompositeNode) {
			for (AbstractNode s : ((CompositeNode)node).getChildren()) {
				generatedElementToPositionMapping(s);
			}
		}
	}

	/**
	 * Restructures the result of a parsing by adding node's offsets values.
	 * 
	 * @param parseResult
	 *            result of a parsing.
	 * @return the restructured version of the given parsingResult.
	 * @throws ParseException
	 *             if the restructuration cannot be done (linkage errors).
	 */
	private IParseResult restructureParseResult(final IParseResult parseResult) throws ParseException {
		IParseResult restructuredParseResult = parseResult;
		CompositeNode astNode = restructuredParseResult.getRootNode();

		if (astNode != null) {
			// Step 1 : we attach each Node of the parse result informations about parsing (line, offset...)
			if (!NodeContentAdapter.containsNodeContentAdapter(astNode)) {
				NodeContentAdapter.createAdapterAndAddToNode(astNode);
			}

			// Step 2 : we resolve the internal links
			ModelingUnit resolvedInternalLinks = new ModelingUnitLinker()
					.resolveInternalLinks((ModelingUnit)restructuredParseResult.getRootASTElement());
			restructuredParseResult = new ParseResult(resolvedInternalLinks,
					restructuredParseResult.getRootNode());
		}

		return restructuredParseResult;
	}

	/**
	 * Returns the serialized form of the Node preceding the given node.
	 * 
	 * @param node
	 *            Node corresponding to an error (for example)
	 * @return the serialized form of the Node preceding the given node, an empty String if it has no previous
	 *         node.
	 */
	private String getPreviousCharacters(AbstractNode node) {
		String previousNodeName = "";
		int indexOfNode = node.eContainer().eContents().indexOf(node);
		if (indexOfNode > 0) {
			AbstractNode previousNode = (AbstractNode)node.eContainer().eContents().get(indexOfNode - 1);
			previousNodeName = previousNode.serialize();
			previousNodeName = previousNodeName.replace("\n", "");
			if (previousNodeName.length() > SIZE_OF_PREVIOUS_CHARACTERS) {
				previousNodeName = "..."
						+ previousNodeName.substring(previousNodeName.length() - SIZE_OF_PREVIOUS_CHARACTERS,
								previousNodeName.length());
			}
		}
		return previousNodeName.trim();
	}
}
