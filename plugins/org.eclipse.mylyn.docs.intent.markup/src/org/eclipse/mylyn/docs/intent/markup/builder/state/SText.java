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
import org.eclipse.mylyn.docs.intent.markup.markup.Block;
import org.eclipse.mylyn.docs.intent.markup.markup.Code;
import org.eclipse.mylyn.docs.intent.markup.markup.Entity;
import org.eclipse.mylyn.docs.intent.markup.markup.Formatting;
import org.eclipse.mylyn.docs.intent.markup.markup.MarkupFactory;
import org.eclipse.mylyn.docs.intent.markup.markup.Preformatted;
import org.eclipse.mylyn.docs.intent.markup.markup.Text;
import org.eclipse.mylyn.wikitext.core.parser.Attributes;
import org.eclipse.mylyn.wikitext.core.parser.DocumentBuilder.BlockType;
import org.eclipse.mylyn.wikitext.core.parser.DocumentBuilder.SpanType;

/**
 * class defining the behaviors of the parser if the current element is a Text or an Entity.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public class SText extends BuilderState {

	/**
	 * Text element to manage (can also be an Entity).
	 */
	private Text text;

	/**
	 * SText constructor.
	 * 
	 * @param previous
	 *            previous state
	 * @param txt
	 *            Model element to stock.
	 */
	public SText(BuilderState previous, Text txt) {
		super(previous);
		this.text = txt;
	}

	/**
	 * Returns true if the block is a preformated bloc.
	 * 
	 * @param block
	 *            The block to test.
	 * @return true if the block is a preformated bloc, false otherwise.
	 */
	private Boolean isPreformatted(Block block) {
		boolean isPreformatted = false;
		isPreformatted = isPreformatted || (block instanceof Preformatted);
		isPreformatted = isPreformatted || (block instanceof Code);
		return isPreformatted;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.markup.builder.BuilderState#characters(java.lang.String)
	 */
	@Override
	public BuilderState characters(String characters) {

		BuilderState returnState = null;
		// If the characters represent an entity, We create that entity,
		// add it to the current block and return to the previous state.
		if (this.text instanceof Entity) {
			Text newText = MarkupFactory.eINSTANCE.createText();
			newText.setData(characters);
			// We copy the format of the current entity, as it is embedded in the text.
			for (Formatting format : this.text.getFormat()) {
				if ((!format.equals(Formatting.NONE)) && (!newText.getFormat().contains(format))) {
					newText.getFormat().add(format);
				}
			}
			((Block)this.text.eContainer()).getContent().add(newText);
			returnState = previousState();
		} else {
			// If the current text is contained in a Preformatted bloc, We create
			// a new Text, add it to the current block and return to the previous state.
			if (isPreformatted((Block)this.text.eContainer())) {
				Text newText = MarkupFactory.eINSTANCE.createText();
				newText.setData(characters);
				((Block)this.text.eContainer()).getContent().add(newText);
				returnState = previousState();
			} else {
				// Otherwise, we simply set the Data to the text value.
				this.text.setData(characters);
				returnState = previousState();
			}
		}
		return returnState;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.markup.builder.BuilderState#entityReference(java.lang.String)
	 */
	@Override
	public BuilderState entityReference(String entity) {
		Entity newEntity = MarkupFactory.eINSTANCE.createEntity();
		newEntity.setData(entity);
		// We copy the format of the current entity, as it is embedded in the text.
		((Block)this.text.eContainer()).getContent().add(newEntity);
		return previousState();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.markup.builder.BuilderState#lineBreak()
	 */
	@Override
	public BuilderState lineBreak() {
		this.text.setLineBreak(true);
		return previousState();
	}

	/* Methods delegated to the container */

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.markup.builder.BuilderState#charactersUnescaped(java.lang.String)
	 */
	@Override
	public BuilderState charactersUnescaped(String literal) {
		// We let the container (bloc) handle this event.
		return previousState().charactersUnescaped(literal);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.markup.builder.BuilderState#image(org.eclipse.mylyn.wikitext.core.parser.Attributes,
	 *      java.lang.String)
	 */
	@Override
	public BuilderState image(Attributes attributes, String url) {
		return previousState().image(attributes, url);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.markup.builder.BuilderState#beginSpan(org.eclipse.mylyn.wikitext.core.parser.DocumentBuilder.SpanType,
	 *      org.eclipse.mylyn.wikitext.core.parser.Attributes)
	 */
	@Override
	public BuilderState beginSpan(SpanType type, Attributes attributes) {
		return previousState().beginSpan(type, attributes);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.markup.builder.BuilderState#beginBlock(org.eclipse.mylyn.wikitext.core.parser.DocumentBuilder.BlockType,
	 *      org.eclipse.mylyn.wikitext.core.parser.Attributes)
	 */
	@Override
	public BuilderState beginBlock(BlockType type, Attributes attributes) {
		return previousState().beginBlock(type, attributes);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.markup.builder.BuilderState#endSpan()
	 */
	@Override
	public BuilderState endSpan() {
		return previousState().endSpan();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.markup.builder.BuilderState#endBlock()
	 */
	@Override
	public BuilderState endBlock() {
		return previousState().endBlock();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.markup.builder.BuilderState#endHeading()
	 */
	@Override
	public BuilderState endHeading() {
		return previousState().endHeading();
	}

}
