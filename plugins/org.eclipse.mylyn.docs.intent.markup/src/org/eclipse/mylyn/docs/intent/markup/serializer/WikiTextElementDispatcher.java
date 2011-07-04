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
package org.eclipse.mylyn.docs.intent.markup.serializer;

import org.eclipse.mylyn.docs.intent.markup.markup.Block;
import org.eclipse.mylyn.docs.intent.markup.markup.Code;
import org.eclipse.mylyn.docs.intent.markup.markup.Container;
import org.eclipse.mylyn.docs.intent.markup.markup.Entity;
import org.eclipse.mylyn.docs.intent.markup.markup.Image;
import org.eclipse.mylyn.docs.intent.markup.markup.Link;
import org.eclipse.mylyn.docs.intent.markup.markup.List;
import org.eclipse.mylyn.docs.intent.markup.markup.ListItem;
import org.eclipse.mylyn.docs.intent.markup.markup.Paragraph;
import org.eclipse.mylyn.docs.intent.markup.markup.Preformatted;
import org.eclipse.mylyn.docs.intent.markup.markup.Quote;
import org.eclipse.mylyn.docs.intent.markup.markup.Section;
import org.eclipse.mylyn.docs.intent.markup.markup.Table;
import org.eclipse.mylyn.docs.intent.markup.markup.Text;
import org.eclipse.mylyn.docs.intent.markup.markup.util.MarkupSwitch;

/**
 * Call the correct serializer according to a WikiText element's type.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public class WikiTextElementDispatcher extends MarkupSwitch<String> {

	// These methods are ordered by alphabetic orders.

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.util.MarkupSwitch#caseBlock(org.eclipse.mylyn.docs.intent.markup.markup.Block)
	 */
	@Override
	public String caseBlock(Block object) {
		return BlockSerializer.render(object, this);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.util.MarkupSwitch#caseCode(org.eclipse.mylyn.docs.intent.markup.markup.Code)
	 */
	@Override
	public String caseCode(Code object) {
		String jumpLine = "";
		if (!BlockSerializer.usePrefix()) {
			jumpLine = WikiTextResourceSerializer.LINE_BREAK;
		}
		return BlockSerializer.renderWithBlocPrefix(object, this, jumpLine
				+ BlockSerializer.CODE_EXTENDED_PREFIX + ' ' + WikiTextResourceSerializer.LINE_BREAK);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.util.MarkupSwitch#caseContainer(org.eclipse.mylyn.docs.intent.markup.markup.Container)
	 */
	@Override
	public String caseContainer(Container object) {
		return ContainerSerializer.render(object, this);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.util.MarkupSwitch#caseEntity(org.eclipse.mylyn.docs.intent.markup.markup.Entity)
	 */
	@Override
	public String caseEntity(Entity object) {
		return EntitySerializer.render(object);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.util.MarkupSwitch#caseLink(org.eclipse.mylyn.docs.intent.markup.markup.Link)
	 */
	@Override
	public String caseLink(Link object) {
		return LinkSerializer.render(object, this);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.util.MarkupSwitch#caseList(org.eclipse.mylyn.docs.intent.markup.markup.List)
	 */
	@Override
	public String caseList(List object) {
		String prefix = "";
		if (BlockSerializer.usePrefix()) {
			prefix = WikiTextResourceSerializer.LINE_BREAK + BlockSerializer.PARAGRAPH_PREFIX + ' '
					+ WikiTextResourceSerializer.LINE_BREAK;
		}
		return prefix + ListSerializer.render(object, this);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.util.MarkupSwitch#caseListItem(org.eclipse.mylyn.docs.intent.markup.markup.ListItem)
	 */
	@Override
	public String caseListItem(ListItem object) {
		return ListItemSerializer.render(object, this);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.util.MarkupSwitch#caseImage(org.eclipse.mylyn.docs.intent.markup.markup.Image)
	 */
	@Override
	public String caseImage(Image object) {
		return ImageSerializer.render(object);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.util.MarkupSwitch#caseParagraph(org.eclipse.mylyn.docs.intent.markup.markup.Paragraph)
	 */
	@Override
	public String caseParagraph(Paragraph object) {
		if (BlockSerializer.usePrefix()) {
			return BlockSerializer.renderWithBlocPrefix(object, this, WikiTextResourceSerializer.LINE_BREAK
					+ BlockSerializer.PARAGRAPH_PREFIX + ' ' + WikiTextResourceSerializer.LINE_BREAK);
		} else {
			return BlockSerializer.render(object, this);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.util.MarkupSwitch#casePreformatted(org.eclipse.mylyn.docs.intent.markup.markup.Preformatted)
	 */
	@Override
	public String casePreformatted(Preformatted object) {
		return BlockSerializer.renderWithBlocPrefix(object, this, WikiTextResourceSerializer.LINE_BREAK
				+ BlockSerializer.PREFORMATTED_EXTENDED_PREFIX + " \n");
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.util.MarkupSwitch#caseQuote(org.eclipse.mylyn.docs.intent.markup.markup.Quote)
	 */
	@Override
	public String caseQuote(Quote object) {
		return BlockSerializer.renderWithBlocPrefix(object, this, WikiTextResourceSerializer.LINE_BREAK
				+ BlockSerializer.QUOTE_EXTENDED_PREFIX + " \n");
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.util.MarkupSwitch#caseSection(org.eclipse.mylyn.docs.intent.markup.markup.Section)
	 */
	@Override
	public String caseSection(Section section) {
		String jumpLine = "";
		if (BlockSerializer.usePrefix()) {
			jumpLine = WikiTextResourceSerializer.LINE_BREAK;
		}
		return jumpLine + SectionSerializer.render(section, this);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.util.MarkupSwitch#caseTable(org.eclipse.mylyn.docs.intent.markup.markup.Table)
	 */
	@Override
	public String caseTable(Table table) {
		return TableSerializer.render(table, this);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.util.MarkupSwitch#caseText(org.eclipse.mylyn.docs.intent.markup.markup.Text)
	 */
	@Override
	public String caseText(Text object) {
		return TextSerializer.render(object);
	}

}
