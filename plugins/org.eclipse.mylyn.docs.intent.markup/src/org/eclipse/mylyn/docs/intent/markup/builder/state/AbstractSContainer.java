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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.mylyn.docs.intent.markup.builder.BuilderState;
import org.eclipse.mylyn.docs.intent.markup.builder.operation.HasAttributeCopyAttributes;
import org.eclipse.mylyn.docs.intent.markup.markup.Block;
import org.eclipse.mylyn.docs.intent.markup.markup.Container;
import org.eclipse.mylyn.docs.intent.markup.markup.List;
import org.eclipse.mylyn.docs.intent.markup.markup.ListType;
import org.eclipse.mylyn.docs.intent.markup.markup.MarkupFactory;
import org.eclipse.mylyn.docs.intent.markup.markup.Section;
import org.eclipse.mylyn.docs.intent.markup.markup.Table;
import org.eclipse.mylyn.wikitext.core.parser.Attributes;
import org.eclipse.mylyn.wikitext.core.parser.DocumentBuilder.BlockType;

/**
 * Abstract class defining the default behavior of a container (Section for example).
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public abstract class AbstractSContainer extends BuilderState {

	/**
	 * Container managed by this SContainer.
	 */
	private Container root;

	/**
	 * AbstractSContainer constructor.
	 * 
	 * @param previous
	 *            previous state
	 * @param doc
	 *            Model element to stock.
	 */
	public AbstractSContainer(BuilderState previous, Container doc) {
		super(previous);
		this.root = doc;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.markup.builder.BuilderState#endDocument()
	 */
	@Override
	public BuilderState endDocument() {
		removeUselessBlocks();
		return previousState();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.markup.builder.BuilderState#beginHeading(int,
	 *      org.eclipse.mylyn.wikitext.core.parser.Attributes)
	 */
	@Override
	public BuilderState beginHeading(int level, Attributes attributes) {
		Section newSec = MarkupFactory.eINSTANCE.createSection();
		new HasAttributeCopyAttributes(newSec).setValues(attributes);
		newSec.setLevel(level);
		root.getContent().add(newSec);
		return new SSection(this, newSec);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.markup.builder.BuilderState#beginBlock(org.eclipse.mylyn.wikitext.core.parser.DocumentBuilder.BlockType,
	 *      org.eclipse.mylyn.wikitext.core.parser.Attributes)
	 */
	@Override
	public BuilderState beginBlock(BlockType type, Attributes attributes) {
		BuilderState resultState = null;

		removeUselessBlocks();
		Block created = MarkupFactory.eINSTANCE.createBlock();
		switch (type) {
			case PARAGRAPH:
				created = MarkupFactory.eINSTANCE.createParagraph();
				new HasAttributeCopyAttributes(created).setValues(attributes);
				break;
			case QUOTE:
				created = MarkupFactory.eINSTANCE.createQuote();
				new HasAttributeCopyAttributes(created).setValues(attributes);
				break;
			case CODE:
				created = MarkupFactory.eINSTANCE.createCode();
				new HasAttributeCopyAttributes(created).setValues(attributes);
				break;
			case PREFORMATTED:
				created = MarkupFactory.eINSTANCE.createPreformatted();
				new HasAttributeCopyAttributes(created).setValues(attributes);
				break;
			case BULLETED_LIST:
			case NUMERIC_LIST:
				List newList = MarkupFactory.eINSTANCE.createList();
				new HasAttributeCopyAttributes(newList).setValues(attributes);
				// According to the blockType, we assign the correct listType to this list.
				if (type.equals(BlockType.BULLETED_LIST)) {
					newList.setListType(ListType.BULLETED);
				} else {
					newList.setListType(ListType.NUMERIC);
				}
				new HasAttributeCopyAttributes(newList).setValues(attributes);
				root.getContent().add(newList);
				resultState = new SList(this, newList);
				break;
			case TABLE:
				Table newTable = MarkupFactory.eINSTANCE.createTable();
				new HasAttributeCopyAttributes(newTable).setValues(attributes);
				root.getContent().add(newTable);
				resultState = new STable(this, newTable);
				break;
			default:
				break;
		}
		root.getContent().add(created);
		if (resultState == null) {
			resultState = new SBlock(this, created);
		}
		return resultState;
	}

	/**
	 * Removes the current block if it has no content (usefull to remove blocks detected by parser but not
	 * significant).
	 */
	protected void removeUselessBlocks() {
		if (root.getContent().size() >= 1) {
			EObject lastElement = root.getContent().get(root.getContent().size() - 1);
			if (lastElement instanceof Block) {
				Block block = (Block)lastElement;
				if (isUselessBlock(block)) {
					root.getContent().remove(block);
				}
			}
		}
	}

	/**
	 * Indicates if the considered block is Useless and must be deleted.
	 * 
	 * @param block
	 *            block to inspect.
	 * @return true if the considered block is Useless and must be deleted, false otherwise.
	 */
	private boolean isUselessBlock(Block block) {
		if (block instanceof List) {
			return ((List)block).getItems().isEmpty();
		} else {
			return block.getContent().isEmpty();
		}
	}

}
