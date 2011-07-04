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
package org.eclipse.mylyn.docs.intent.serializer.genericunit;

import org.eclipse.mylyn.docs.intent.core.genericunit.IntentSectionReferenceInstruction;
import org.eclipse.mylyn.docs.intent.core.genericunit.LabelReferenceInstruction;
import org.eclipse.mylyn.docs.intent.core.genericunit.UnitInstruction;

import org.eclipse.mylyn.docs.intent.parser.IntentKeyWords;

/**
 * Returns the serialized form of the given ModelingUnit LabelOrSectionReferenceSerializer element.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public final class LabelOrSectionReferenceSerializer {

	/**
	 * LabelOrSectionReferenceSerializer constructor.
	 */
	private LabelOrSectionReferenceSerializer() {

	}

	/**
	 * Return the textual form of the given LabelOrSectionReferenceSerializer.
	 * 
	 * @param labelOrReferenceDeclaration
	 *            the element to serialize
	 * @param tabulationPrefix
	 *            the prefix to use for this labelDeclaration
	 * @return the textual form of the given LabelOrSectionReferenceSerializer.
	 */
	public static String serialize(UnitInstruction labelOrReferenceDeclaration, String tabulationPrefix) {

		String renderedForm = tabulationPrefix + IntentKeyWords.INTENT_FCT_REFERENCE + IntentKeyWords.INTENT_WHITESPACE;

		if (labelOrReferenceDeclaration instanceof IntentSectionReferenceInstruction) {
			IntentSectionReferenceInstruction ref = (IntentSectionReferenceInstruction)labelOrReferenceDeclaration;
			renderedForm += '"' + ref.getReferencedObject().getIntentHref() + '"';
			if (ref.getTextToPrint() != null) {
				renderedForm += IntentKeyWords.INTENT_WHITESPACE + '"' + ref.getTextToPrint() + '"';
			}

		}
		if (labelOrReferenceDeclaration instanceof LabelReferenceInstruction) {
			LabelReferenceInstruction ref = (LabelReferenceInstruction)labelOrReferenceDeclaration;
			renderedForm += '"' + ref.getReferencedLabel().getIntentHref() + '"';
		}

		if (labelOrReferenceDeclaration.isLineBreak()) {
			renderedForm += IntentKeyWords.INTENT_LINEBREAK + tabulationPrefix;
		} else {
			renderedForm += IntentKeyWords.INTENT_WHITESPACE;
		}

		// modelingUnitElementDispatcher.setPositionForInstruction(labelinModelingUnit,
		// modelingUnitElementDispatcher.getCurrentOffset(), renderedForm.length());
		// modelingUnitElementDispatcher.setCurrentOffset(modelingUnitElementDispatcher.getCurrentOffset()
		// + renderedForm.length());

		return renderedForm;
	}
}
