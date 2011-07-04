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

import org.eclipse.mylyn.wikitext.core.parser.Attributes;
import org.eclipse.mylyn.wikitext.core.parser.DocumentBuilder.BlockType;
import org.eclipse.mylyn.wikitext.core.parser.DocumentBuilder.SpanType;

/**
 * Represents a generic State of a Wikitext parsor StateMachine.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public class BuilderState {

	/**
	 * The previous state of the stateMachine.
	 */
	private BuilderState previous;

	/**
	 * BuilderState constructor.
	 * 
	 * @param previous
	 *            the previous state of the state machine.
	 */
	public BuilderState(BuilderState previous) {
		this.previous = previous;
	}

	/**
	 * Returns the previous state in the state machine.
	 * 
	 * @return the previous state in the state machine
	 */
	protected BuilderState previousState() {
		return previous;
	}

	/**
	 * Indicates the detection of an accronym.
	 * 
	 * @param text
	 *            Identifier of this accronym
	 * @param definition
	 *            definiton of the given text
	 * @return the new state of the state machine
	 */
	public BuilderState acronym(String text, String definition) {
		return this;

	}

	/**
	 * Indicates the beginning of a new Bloc.
	 * 
	 * @param type
	 *            type of the bloc (LIST, PARAGRAPH..)
	 * @param attributes
	 *            attributes associated to this bloc (CSSStyle, CSSClass...)
	 * @return the new state of the state machine
	 */
	public BuilderState beginBlock(BlockType type, Attributes attributes) {
		return this;

	}

	/**
	 * Indicates the beginning of a new Document.
	 * 
	 * @return the new state of the state machine
	 */
	public BuilderState beginDocument() {
		return this;

	}

	/**
	 * Indicates the beginning of a heading (h1, h2...) element.
	 * 
	 * @param level
	 *            level of this heading (between 1 and 5)
	 * @param attributes
	 *            attributes associated to this bloc (CSSStyle, CSSClass...)
	 * @return the new state of the state machine
	 */
	public BuilderState beginHeading(int level, Attributes attributes) {
		return this;

	}

	/**
	 * Indicates the beginning of a new span.
	 * 
	 * @param type
	 *            type of the span (CODE, ITALIC...)
	 * @param attributes
	 *            attributes associated to this span (CSSStyle, CSSClass...)
	 * @return the new state of the state machine
	 */
	public BuilderState beginSpan(SpanType type, Attributes attributes) {
		return this;

	}

	/**
	 * Indicates the detection of a characters suite.
	 * 
	 * @param text
	 *            String detected
	 * @return the new state of the state machine
	 */
	public BuilderState characters(String text) {
		return this;

	}

	/**
	 * Indicates the detection of characters unescaped (example : <a href="#">,</a> ...).
	 * 
	 * @param literal
	 *            value of these characters
	 * @return the new state of the state machine
	 */
	public BuilderState charactersUnescaped(String literal) {
		return this;

	}

	/**
	 * Indicates the detection of an entity (example : (c), (tm) ...).
	 * 
	 * @param entity
	 *            String corresponding to an entity
	 * @return the new state of the state machine
	 */
	public BuilderState entityReference(String entity) {
		return this;
	}

	/**
	 * Indicates the detection of an image link.
	 * 
	 * @param attributes
	 *            attributes associated to this element (CSSStyle, CSSClass...)
	 * @param url
	 *            URL of the image
	 * @return the new state of the state machine
	 */
	public BuilderState image(Attributes attributes, String url) {
		return this;

	}

	/**
	 * Indicates the detection of an image link.
	 * 
	 * @param linkAttributes
	 *            attributes associated to the link (CSSStyle, CSSClass...)
	 * @param imageAttributes
	 *            attributes associated to the image (CSSStyle, CSSClass...)
	 * @param href
	 *            address associated to the link
	 * @param imageUrl
	 *            address associated to the image
	 * @return the new state of the state machine
	 */
	public BuilderState imageLink(Attributes linkAttributes, Attributes imageAttributes, String href,
			String imageUrl) {
		return this;

	}

	/**
	 * Indicates a lineBreak.
	 * 
	 * @return the new state of the state machine
	 */
	public BuilderState lineBreak() {
		return this;

	}

	/**
	 * Indicates a link declaration.
	 * 
	 * @param attributes
	 *            attributes associated to this element (CSSStyle, CSSClass, LinkTitle...)
	 * @param hrefOrHashName
	 *            address associated to this link
	 * @param text
	 *            name of this link
	 * @return the new state of the state machine
	 */
	public BuilderState link(Attributes attributes, String hrefOrHashName, String text) {
		return this;

	}

	/**
	 * Indicates the end of a block.
	 * 
	 * @return the new state of the state machine
	 */
	public BuilderState endBlock() {
		return this;

	}

	/**
	 * Indicates the end of a document.
	 * 
	 * @return the new state of the state machine
	 */
	public BuilderState endDocument() {
		return this;

	}

	/**
	 * Indicates the end of an heading.
	 * 
	 * @return the new state of the state machine
	 */
	public BuilderState endHeading() {
		return this;

	}

	/**
	 * Indicates the end of a span.
	 * 
	 * @return the new state of the state machine
	 */
	public BuilderState endSpan() {
		return this;

	}

}
