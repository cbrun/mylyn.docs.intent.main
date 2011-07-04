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
import org.eclipse.mylyn.docs.intent.markup.markup.MarkupFactory;
import org.eclipse.mylyn.docs.intent.markup.markup.Table;
import org.eclipse.mylyn.docs.intent.markup.markup.TableCell;
import org.eclipse.mylyn.docs.intent.markup.markup.TableRow;
import org.eclipse.mylyn.wikitext.core.parser.Attributes;
import org.eclipse.mylyn.wikitext.core.parser.DocumentBuilder.BlockType;

/**
 * class defining the behaviors of the parser if the current element is a Table.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public class STable extends SBlock {

	/**
	 * Table element to manage.
	 */
	private Table table;

	/**
	 * Represents the currentTr ; a null value means that there is no current Tr.
	 */
	private TableRow currentTr;

	/**
	 * STable constructor.
	 * 
	 * @param previous
	 *            previous state
	 * @param table
	 *            Model element to stock.
	 */
	public STable(BuilderState previous, Table table) {
		super(previous, table);
		this.table = table;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.markup.builder.state.SBlock#beginBlock(org.eclipse.mylyn.wikitext.core.parser.DocumentBuilder.BlockType,
	 *      org.eclipse.mylyn.wikitext.core.parser.Attributes)
	 */
	@Override
	public BuilderState beginBlock(BlockType type, Attributes attributes) {
		switch (type) {
			case TABLE_ROW:
				TableRow tr = MarkupFactory.eINSTANCE.createTableRow();
				new HasAttributeCopyAttributes(tr).setValues(attributes);
				currentTr = tr;
				table.getContent().add(tr);
				break;

			case TABLE_CELL_HEADER:
			case TABLE_CELL_NORMAL:

				if (currentTr == null) {
					throw new UnsupportedOperationException(
							"Can't add a cell directly into a Table : must create a Tr.");
				}
				// We create the TableCell and let SBlock manage its content.
				TableCell td = MarkupFactory.eINSTANCE.createTableCell();
				new HasAttributeCopyAttributes(td).setValues(attributes);
				td.setIsCellHeader(type == BlockType.TABLE_CELL_HEADER);

				currentTr.getContent().add(td);
				return new SBlock(this, td);

			default:
				break;

		}
		return this;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.markup.builder.state.SBlock#endBlock()
	 */
	@Override
	public BuilderState endBlock() {
		// If the tr has been closed
		if (currentTr == null) {
			// We return the previous State
			return previousState();
		} else {
			// We close the tr
			currentTr = null;
			return this;
		}
	}

}
