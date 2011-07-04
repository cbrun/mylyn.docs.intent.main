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
package org.eclipse.mylyn.docs.intent.parser;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.mylyn.docs.intent.parser.descriptionunit.DescriptionUnitParser;
import org.eclipse.mylyn.docs.intent.parser.internal.IntentDocumentParser;
import org.eclipse.mylyn.docs.intent.parser.modelingunit.ModelingUnitParserImpl;
import org.eclipse.mylyn.docs.intent.parser.modelingunit.ParseException;

/**
 * High-level parser that delegates the parsing to the correct parser according to the possible entry points
 * for a Modeling Unit.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public class IntentParser {

	/**
	 * Parser for IntentStructuredElements : IntentDocument, Chapter and Section.
	 */
	private IntentDocumentParser documentParser;

	/**
	 * Parser for Modeling Units (based on Xtext).
	 */
	private ModelingUnitParserImpl modelingUnitParser;

	/**
	 * Parser for Description Units (based on the WikiText syntax and the markup meta-model).
	 */
	private DescriptionUnitParser descriptionUnitParser;

	/**
	 * IntentParser constructor.
	 */
	public IntentParser() {
		this.documentParser = new IntentDocumentParser();
		this.modelingUnitParser = new ModelingUnitParserImpl();
		this.descriptionUnitParser = new DescriptionUnitParser();
	}

	/**
	 * Parse the given content and return the described element.
	 * 
	 * @param contentToParse
	 *            textual form of an Intent entity (can be a IntentDocument, a Section, a Chapter, a
	 *            Modeling Unit or a Description Unit).
	 * @return the given content and return the described element
	 * @throws ParseException
	 *             if the given content contain error or doesn't describe an Intent entity
	 */
	public EObject parse(String contentToParse) throws ParseException {
		EObject generatedObject = null;

		try {
			// We have 3 possibilities for the type of the element to parse :
			// If it matches "@M (.*) M@", it's a modelingUnit
			if (modelingUnitParser.isParserFor(contentToParse)) {

				generatedObject = modelingUnitParser.parseString(contentToParse);

			} else {
				// If it starts with a IntentDocument's Keyword (like "Section, Document, Chapter..."
				if (documentParser.isParserFor(contentToParse)) {

					generatedObject = documentParser.parse(contentToParse);

				} else {
					// In the other cases, we consider that the given contentToParse is a DescriptionUnit

					generatedObject = descriptionUnitParser.parse(contentToParse);

				}
			}
			return generatedObject;
		} catch (ParseException e) {
			ParseException parseException = new ParseException(e.getMessage(), e.getErrorOffset(),
					e.getErrorLength());
			parseException.setStackTrace(e.getStackTrace());
			throw parseException;
		}

	}

}
