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
package org.eclipse.mylyn.docs.intent.parser.modelingunit.serializer.internal;

import org.eclipse.mylyn.docs.intent.core.genericunit.TypeLabel;
import org.eclipse.mylyn.docs.intent.core.modelingunit.LabelinModelingUnit;

import org.eclipse.mylyn.docs.intent.parser.modelingunit.serializer.ModelingUnitSerializer;

/**
 * Returns the serialized form of the given ModelingUnit LabelinModelingUnit element.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public final class LabelinModelingUnitSerializer {

	/**
	 * LabelinModelingUnitSerializer constructor.
	 */
	private LabelinModelingUnitSerializer() {

	}

	/**
	 * Return the textual form of the given ModelingUnit LabelinModelingUnit.
	 * 
	 * @param labelinModelingUnit
	 *            the element to serialize
	 * @param modelingUnitElementDispatcher
	 *            the modelingUnitElementDispatcher
	 * @return the textual form of the given ModelingUnit LabelinModelingUnit.
	 */
	public static String render(LabelinModelingUnit labelinModelingUnit,
			ModelingUnitElementDispatcher modelingUnitElementDispatcher) {
		String renderedForm = "";
		if (labelinModelingUnit.getType().equals(TypeLabel.EXPLICIT)) {
			renderedForm += "@label";
		} else {
			renderedForm += "@lazylabel";
		}
		renderedForm += ModelingUnitSerializer.WHITESPACE + labelinModelingUnit.getLabelValue();
		if (labelinModelingUnit.getTextToPrint() != null && labelinModelingUnit.getTextToPrint().length() > 0) {
			renderedForm += ModelingUnitSerializer.WHITESPACE + labelinModelingUnit.getTextToPrint();
		}

		if (labelinModelingUnit.isLineBreak()) {
			renderedForm += ModelingUnitSerializer.LINE_BREAK;
		}

		modelingUnitElementDispatcher.setPositionForInstruction(labelinModelingUnit,
				modelingUnitElementDispatcher.getCurrentOffset(), renderedForm.length());
		modelingUnitElementDispatcher.setCurrentOffset(modelingUnitElementDispatcher.getCurrentOffset()
				+ renderedForm.length());

		return renderedForm;
	}
}
