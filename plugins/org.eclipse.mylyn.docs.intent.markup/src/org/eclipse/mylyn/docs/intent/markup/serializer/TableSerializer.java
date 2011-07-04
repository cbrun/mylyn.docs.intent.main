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

import org.eclipse.mylyn.docs.intent.markup.markup.BlockContent;
import org.eclipse.mylyn.docs.intent.markup.markup.Table;
import org.eclipse.mylyn.docs.intent.markup.markup.TableCell;
import org.eclipse.mylyn.docs.intent.markup.markup.TableRow;

/**
 * Class which purpose is to serialize a Table element from a WikiText document.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public final class TableSerializer {

	private static final String TD_ALIGN_TOP = "text-align: top;";

	private static final String TD_ALIGN_TOP_TRADUCTION = "^";

	private static final String TD_ALIGN_CENTER = "text-align: center;";

	private static final String TD_ALIGN_CENTER_TRADUCTION = "-";

	private static final String TD_ALIGN_BOTTOM = "text-align: bottom;";

	private static final String TD_ALIGN_BOTTOM_TRADUCTION = Character.toString(TextSerializer.TILDE_SYMBOL);

	private static final String TD_HEADER_TRADUCTION = "_.";

	private static String TD_SPACE_TRADUCTION = "|";

	/**
	 * TableSerializer constructor.
	 */
	private TableSerializer() {

	}

	/**
	 * Serialize the given table by printing all rows and cells with the associated styles.
	 * 
	 * @param table
	 *            Table to serialize
	 * @param dispatcher
	 *            Wiki element dispatcher
	 * @return the serialized form of the given table.
	 */
	public static String render(Table table, WikiTextElementDispatcher dispatcher) {

		// Step 1 : rendering the table style (can be null).
		String renderedTable = "\n";
		if (table.getAttributes().getCSSClass() != null) {
			renderedTable += "table(" + table.getAttributes().getCSSClass() + ").";
		}

		// Step 2 : serialize the table's content
		// For each row of this table
		for (BlockContent blocContent : table.getContent()) {
			if (blocContent instanceof TableRow) {
				TableRow tr = (TableRow)blocContent;
				renderedTable += "\n";
				// serialize the tableRow style
				if (tr.getAttributes().getCSSClass() != null) {
					renderedTable += "(" + tr.getAttributes().getCSSClass() + "). ";
				}

				// For each cell of this row
				for (BlockContent bloc : tr.getContent()) {
					TableCell td = (TableCell)bloc;
					renderedTable += TD_SPACE_TRADUCTION;

					// Step 1 : style rendering
					if (td.isIsCellHeader()) {
						renderedTable += TD_HEADER_TRADUCTION + " ";
					}
					String cssStyle = td.getAttributes().getCSSStyle();
					if (cssStyle != null) {
						String[] renderedStyle = renderStyleFortableCell(cssStyle);
						cssStyle = renderedStyle[0];
						renderedTable += renderedStyle[1];
					}

					// Step 2 : We then render the td as a regular bloc
					renderedTable += dispatcher.doSwitch(td);
				}
				renderedTable += TD_SPACE_TRADUCTION;
			}
		}

		return renderedTable;
	}

	/**
	 * Returns the serialized form of a TableCell style (not handled by the AttirbuteStyleSerializer because
	 * specific to TableCells) .
	 * 
	 * @param styleToRender
	 *            Style associated to a TableCell
	 * @return serialized form of the given TableCell style
	 */
	private static String[] renderStyleFortableCell(String styleToRender) {
		String cssStyle = styleToRender;
		String renderedCellStyle = "";
		if (cssStyle.contains(TD_ALIGN_TOP)) {
			renderedCellStyle += TD_ALIGN_TOP_TRADUCTION;
			cssStyle = cssStyle.replace(TD_ALIGN_TOP, "");
		}
		if (cssStyle.contains(TD_ALIGN_CENTER)) {
			renderedCellStyle += TD_ALIGN_CENTER_TRADUCTION;
			cssStyle = cssStyle.replace(TD_ALIGN_CENTER, "");
		}
		if (cssStyle.contains(TD_ALIGN_BOTTOM)) {
			renderedCellStyle += TD_ALIGN_BOTTOM_TRADUCTION;
			cssStyle = cssStyle.replace(TD_ALIGN_BOTTOM, "");
		}

		if ((cssStyle.length() > 0) && (!"{}".equals(cssStyle))) {
			renderedCellStyle += "{" + cssStyle + "}";
		}

		renderedCellStyle += ". ";

		String[] result = new String[2];
		result[0] = cssStyle;
		result[1] = renderedCellStyle;
		return result;
	}
}
