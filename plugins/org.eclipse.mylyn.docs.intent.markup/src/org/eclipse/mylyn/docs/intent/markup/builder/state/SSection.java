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
import org.eclipse.mylyn.docs.intent.markup.markup.MarkupFactory;
import org.eclipse.mylyn.docs.intent.markup.markup.Section;
import org.eclipse.mylyn.wikitext.core.parser.Attributes;
import org.eclipse.mylyn.wikitext.core.parser.DocumentBuilder.SpanType;

/**
 * class defining the behaviors of the parser if the current element is a section.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public class SSection extends AbstractSContainer {

	/**
	 * Section to manage.
	 */
	private Section section;

	/**
	 * SSection constructor.
	 * 
	 * @param previous
	 *            previous state
	 * @param newSection
	 *            Model element to stock.
	 */
	public SSection(BuilderState previous, Section newSection) {
		super(previous, newSection);
		this.section = newSection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.markup.builder.BuilderState#characters(java.lang.String)
	 */
	@Override
	public BuilderState characters(String text) {
		Block block = MarkupFactory.eINSTANCE.createBlock();
		this.section.setTitle(block);
		return new SBlock(this, block).characters(text);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.markup.builder.BuilderState#beginSpan(org.eclipse.mylyn.wikitext.core.parser.DocumentBuilder.SpanType,
	 *      org.eclipse.mylyn.wikitext.core.parser.Attributes)
	 */
	@Override
	public BuilderState beginSpan(SpanType type, Attributes attributes) {
		Block block = MarkupFactory.eINSTANCE.createBlock();
		this.section.setTitle(block);
		return new SBlock(this, block).beginSpan(type, attributes);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.markup.builder.BuilderState#entityReference(java.lang.String)
	 */
	@Override
	public BuilderState entityReference(String entity) {
		Block block = MarkupFactory.eINSTANCE.createBlock();
		this.section.setTitle(block);
		return new SBlock(this, block).entityReference(entity);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.markup.builder.BuilderState#endHeading()
	 */
	@Override
	public BuilderState endHeading() {
		return this;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.markup.builder.state.AbstractSContainer#beginHeading(int,
	 *      org.eclipse.mylyn.wikitext.core.parser.Attributes)
	 */
	@Override
	public BuilderState beginHeading(int level, Attributes attributes) {
		removeUselessBlocks();
		// If the current section must contain the new section
		if (level > this.section.getLevel()) {
			Section newSection = MarkupFactory.eINSTANCE.createSection();
			new HasAttributeCopyAttributes(newSection).setValues(attributes);
			newSection.setLevel(level);
			this.section.getContent().add(newSection);
			return new SSection(this, newSection);
		} else {
			return previousState().beginHeading(level, attributes);
		}
	}

}
