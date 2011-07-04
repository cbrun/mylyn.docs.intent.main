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
package org.eclipse.mylyn.docs.intent.markup.builder.state;

import org.eclipse.mylyn.docs.intent.markup.builder.BuilderState;
import org.eclipse.mylyn.docs.intent.markup.builder.operation.HasAttributeCopyAttributes;
import org.eclipse.mylyn.docs.intent.markup.markup.Block;
import org.eclipse.mylyn.docs.intent.markup.markup.Link;
import org.eclipse.mylyn.docs.intent.markup.markup.MarkupFactory;
import org.eclipse.mylyn.docs.intent.markup.markup.Text;
import org.eclipse.mylyn.wikitext.core.parser.Attributes;

/**
 * class defining the behaviors of the parser if the current element is a link (detected as a span by the
 * WikiText parser).
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public class SLink extends SBlock {
	/**
	 * Represents a left parenthesis (used to extract the style of a link).
	 */
	private static final String LEFT_PAR = "(";

	/**
	 * Represents a right parenthesis (used to extract the style of a link).
	 */
	private static final String RIGHT_PAR = ")";

	private Link currentLink;

	/**
	 * SLink constructor.
	 * 
	 * @param previous
	 *            previous state
	 * @param linkName
	 *            Block (name) associated to this link
	 * @param link
	 *            the link to manage
	 */
	public SLink(BuilderState previous, Block linkName, Link link) {
		super(previous, linkName);
		currentLink = link;

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.markup.builder.state.SBlock#characters(java.lang.String)
	 */
	@Override
	public BuilderState characters(String text) {
		String linkText = text;
		// If the link's text contains parenthesis
		if (text.contains(LEFT_PAR) && text.contains(RIGHT_PAR)) {
			Attributes linkAttributes = new Attributes();
			int indiceLastPar = text.lastIndexOf(LEFT_PAR);
			linkText = text.substring(0, indiceLastPar);
			String linkTitle = text.replace(linkText, "").replace(LEFT_PAR, "").replace(RIGHT_PAR, "");
			linkAttributes.setTitle(linkTitle);
			new HasAttributeCopyAttributes(currentLink).setValues(linkAttributes);
		}

		Text newText = MarkupFactory.eINSTANCE.createText();
		newText.setData(linkText);

		// We also add to this text the current formats in use.
		addAllFormatsFromStack(newText);
		currentText = newText;

		this.block.getContent().add(newText);
		return this;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.markup.builder.state.SBlock#charactersUnescaped(java.lang.String)
	 */
	@Override
	public BuilderState charactersUnescaped(String literal) {
		return previousState().charactersUnescaped(literal);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.markup.builder.state.SBlock#endSpan()
	 */
	@Override
	public BuilderState endSpan() {
		// If there is no format anymore, it means that the endSpan indicates the end of the link
		if (this.spanStack.isEmpty()) {
			return previousState();
		} else {
			return super.endSpan();
		}
	}
}
