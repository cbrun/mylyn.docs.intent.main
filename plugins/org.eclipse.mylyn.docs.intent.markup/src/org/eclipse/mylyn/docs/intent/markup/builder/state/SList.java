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
import org.eclipse.mylyn.docs.intent.markup.builder.operation.ListTableOfContentsResolver;
import org.eclipse.mylyn.docs.intent.markup.markup.List;
import org.eclipse.mylyn.docs.intent.markup.markup.ListItem;
import org.eclipse.mylyn.docs.intent.markup.markup.MarkupFactory;
import org.eclipse.mylyn.wikitext.core.parser.Attributes;
import org.eclipse.mylyn.wikitext.core.parser.DocumentBuilder.BlockType;

/**
 * class defining the behaviors of the parser if the current element is a list.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public class SList extends SBlock {

	/**
	 * Current list to manage.
	 */
	private List list;

	/**
	 * SList constructor.
	 * 
	 * @param previous
	 *            previous state
	 * @param block
	 *            Model element to stock.
	 */
	public SList(BuilderState previous, List block) {
		super(previous, block);
		this.list = block;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.markup.builder.state.SBlock#beginBlock(org.eclipse.mylyn.wikitext.core.parser.DocumentBuilder.BlockType,
	 *      org.eclipse.mylyn.wikitext.core.parser.Attributes)
	 */
	@Override
	public BuilderState beginBlock(BlockType type, Attributes attributes) {
		if (list instanceof ListItem) {
			((ListItem)list).setIsList(true);
		}

		// If the block to store is a list, we create a new List embedded in this one.
		if ((type == BlockType.BULLETED_LIST) || (type == BlockType.NUMERIC_LIST)) {

			ListItem newItem = MarkupFactory.eINSTANCE.createListItem();
			newItem.setListType(list.getListType());
			new HasAttributeCopyAttributes(newItem).setValues(attributes);
			newItem.setImbricationLevel(list.getImbricationLevel() + 1);
			list.getItems().add(newItem);
			return new SList(this, list);
		}

		// If it's a standard listItem, we just add it to the items of this list.
		if (type == BlockType.LIST_ITEM) {
			ListItem newItem = MarkupFactory.eINSTANCE.createListItem();
			newItem.setListType(list.getListType());
			newItem.setImbricationLevel(list.getImbricationLevel());
			new HasAttributeCopyAttributes(newItem).setValues(attributes);
			list.getItems().add(newItem);
			return new SBlock(this, newItem);
		}

		throw new RuntimeException();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.markup.builder.state.SBlock#endBlock()
	 */
	@Override
	public BuilderState endBlock() {
		// We determine if this list is a table of contents
		ListTableOfContentsResolver tocResolver = new ListTableOfContentsResolver(list);
		tocResolver.resolveTableOfContents();
		return previousState();
	}

}
