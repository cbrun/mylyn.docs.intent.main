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

import org.eclipse.mylyn.docs.intent.core.modelingunit.IntentSectionReferenceinModelingUnit;

import org.eclipse.mylyn.docs.intent.parser.modelingunit.serializer.ModelingUnitSerializer;

/**
 * Returns the serialized form of the given ModelingUnit SectionReferenceinModelingUnit element.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public final class IntentSectionReferenceinModelingUnitSerializer {

	/**
	 * SectionReferenceinModelingUnitSerializer constructor.
	 */
	private IntentSectionReferenceinModelingUnitSerializer() {

	}

	/**
	 * Return the textual form of the given ModelingUnit SectionReferenceinModelingUnit.
	 * 
	 * @param sectionReferenceinModelingUnit
	 *            the element to serialize
	 * @param modelingUnitElementDispatcher
	 *            the modelingUnitElementDispatcher
	 * @return the textual form of the given ModelingUnit SectionReferenceinModelingUnit.
	 */
	public static String render(IntentSectionReferenceinModelingUnit sectionReferenceinModelingUnit,
			ModelingUnitElementDispatcher modelingUnitElementDispatcher) {
		String renderedForm = "@see" + ModelingUnitSerializer.WHITESPACE;
		renderedForm += sectionReferenceinModelingUnit.getReferencedObject().getIntentHref();

		if (sectionReferenceinModelingUnit.getTextToPrint() != null
				&& sectionReferenceinModelingUnit.getTextToPrint().length() > 0) {
			renderedForm += ModelingUnitSerializer.WHITESPACE
					+ sectionReferenceinModelingUnit.getTextToPrint();
		}

		if (sectionReferenceinModelingUnit.isLineBreak()) {
			renderedForm += ModelingUnitSerializer.LINE_BREAK;
		}

		modelingUnitElementDispatcher.setPositionForInstruction(sectionReferenceinModelingUnit,
				modelingUnitElementDispatcher.getCurrentOffset(), renderedForm.length());
		modelingUnitElementDispatcher.setCurrentOffset(modelingUnitElementDispatcher.getCurrentOffset()
				+ renderedForm.length());
		return renderedForm;
	}
}
