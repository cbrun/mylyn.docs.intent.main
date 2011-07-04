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
package org.eclipse.mylyn.docs.intent.markup.builder;

import com.google.common.collect.Iterables;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.mylyn.docs.intent.markup.builder.operation.DocumentLinkResolver;
import org.eclipse.mylyn.docs.intent.markup.builder.state.SDocument;
import org.eclipse.mylyn.docs.intent.markup.markup.Document;
import org.eclipse.mylyn.docs.intent.markup.markup.MarkupFactory;
import org.eclipse.mylyn.wikitext.core.parser.Attributes;
import org.eclipse.mylyn.wikitext.core.parser.DocumentBuilder;

/**
 * Builder of a Markup model for a given Wikitext document.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public class ModelDocumentBuilder extends DocumentBuilder {

	/**
	 * Current state in the parser state machine.
	 */
	private BuilderState currentState;

	/**
	 * List of the roots of the Markup model.
	 */
	private Collection<EObject> roots = new ArrayList<EObject>(1);

	/**
	 * Returns the roots of the stored Markup model.
	 * 
	 * @return roots of the stored Markup model
	 */
	public Collection<EObject> getRoots() {
		return roots;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.wikitext.core.parser.DocumentBuilder#acronym(java.lang.String, java.lang.String)
	 */
	@Override
	public void acronym(String text, String definition) {
		// System.out.println("ModelDocumentBuilder.acronym()");
		currentState = currentState.acronym(text, definition);

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.wikitext.core.parser.DocumentBuilder#beginBlock(org.eclipse.mylyn.wikitext.core.parser.DocumentBuilder.BlockType,
	 *      org.eclipse.mylyn.wikitext.core.parser.Attributes)
	 */
	@Override
	public void beginBlock(BlockType type, Attributes attributes) {
		// System.out.println("ModelDocumentBuilder.beginBlock(" + type.name() + ") / state : "
		// + currentState.getClass().getName());
		currentState = currentState.beginBlock(type, attributes);

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.wikitext.core.parser.DocumentBuilder#beginDocument()
	 */
	@Override
	public void beginDocument() {
		// System.out.println("ModelDocumentBuilder.beginDocument()");
		Document doc = MarkupFactory.eINSTANCE.createDocument();
		// FIXME change null with a dummy or root state.
		currentState = new SDocument(null, doc);
		roots.add(doc);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.wikitext.core.parser.DocumentBuilder#beginHeading(int,
	 *      org.eclipse.mylyn.wikitext.core.parser.Attributes)
	 */
	@Override
	public void beginHeading(int level, Attributes attributes) {
		// System.out.println("ModelDocumentBuilder.beginHeading()");
		currentState = currentState.beginHeading(level, attributes);

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.wikitext.core.parser.DocumentBuilder#beginSpan(org.eclipse.mylyn.wikitext.core.parser.DocumentBuilder.SpanType,
	 *      org.eclipse.mylyn.wikitext.core.parser.Attributes)
	 */
	@Override
	public void beginSpan(SpanType type, Attributes attributes) {
		// System.out.println("ModelDocumentBuilder.beginSpan(" + type + ")/ " + currentState);
		currentState = currentState.beginSpan(type, attributes);

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.wikitext.core.parser.DocumentBuilder#characters(java.lang.String)
	 */
	@Override
	public void characters(String text) {
		// System.out.println("ModelDocumentBuilder.characters() / " + text + currentState);
		currentState = currentState.characters(text);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.wikitext.core.parser.DocumentBuilder#charactersUnescaped(java.lang.String)
	 */
	@Override
	public void charactersUnescaped(String literal) {
		// System.out.println("ModelDocumentBuilder.charactersUnescaped(" + literal + ") / " + currentState);
		currentState = currentState.charactersUnescaped(literal);

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.wikitext.core.parser.DocumentBuilder#endBlock()
	 */
	@Override
	public void endBlock() {
		// System.out.println("ModelDocumentBuilder.endBlock() /" + currentState);
		currentState = currentState.endBlock();

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.wikitext.core.parser.DocumentBuilder#endDocument()
	 */
	@Override
	public void endDocument() {
		// System.out.println("ModelDocumentBuilder.endDocument() /" + currentState);
		currentState = currentState.endDocument();
		for (Document doc : Iterables.filter(roots, Document.class)) {
			new DocumentLinkResolver(doc).resolveLinks();
		}
		// new
		// DocumentReStructurer(Iterables.filter(roots,Container.class)).restructure();

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.wikitext.core.parser.DocumentBuilder#endHeading()
	 */
	@Override
	public void endHeading() {
		// System.out.println("ModelDocumentBuilder.endHeading() /" + currentState);
		currentState = currentState.endHeading();

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.wikitext.core.parser.DocumentBuilder#endSpan()
	 */
	@Override
	public void endSpan() {
		// System.out.println("ModelDocumentBuilder.endSpan() /" + currentState);
		currentState = currentState.endSpan();

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.wikitext.core.parser.DocumentBuilder#entityReference(java.lang.String)
	 */
	@Override
	public void entityReference(String entity) {
		// System.out.println("ModelDocumentBuilder.entityReference(" + entity + ") / state : "
		// + currentState.getClass().getName());
		currentState = currentState.entityReference(entity);

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.wikitext.core.parser.DocumentBuilder#image(org.eclipse.mylyn.wikitext.core.parser.Attributes,
	 *      java.lang.String)
	 */
	@Override
	public void image(Attributes attributes, String url) {
		// System.out.println("ModelDocumentBuilder.image()");
		currentState = currentState.image(attributes, url);

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.wikitext.core.parser.DocumentBuilder#imageLink(org.eclipse.mylyn.wikitext.core.parser.Attributes,
	 *      org.eclipse.mylyn.wikitext.core.parser.Attributes, java.lang.String, java.lang.String)
	 */
	@Override
	public void imageLink(Attributes linkAttributes, Attributes imageAttributes, String href, String imageUrl) {
		// System.out.println("ModelDocumentBuilder.imageLink()");
		currentState = currentState.imageLink(linkAttributes, imageAttributes, href, imageUrl);

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.wikitext.core.parser.DocumentBuilder#lineBreak()
	 */
	@Override
	public void lineBreak() {
		// //System.out.println("ModelDocumentBuilder.lineBreak()");
		currentState = currentState.lineBreak();

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.wikitext.core.parser.DocumentBuilder#link(org.eclipse.mylyn.wikitext.core.parser.Attributes,
	 *      java.lang.String, java.lang.String)
	 */
	@Override
	public void link(Attributes attributes, String hrefOrHashName, String text) {
		// System.out.println("ModelDocumentBuilder.link()");
		currentState = currentState.link(attributes, hrefOrHashName, text);

	}

}
