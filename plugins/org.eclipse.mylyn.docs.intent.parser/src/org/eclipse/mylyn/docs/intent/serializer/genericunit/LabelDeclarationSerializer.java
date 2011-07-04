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

import org.eclipse.mylyn.docs.intent.core.genericunit.LabelDeclaration;
import org.eclipse.mylyn.docs.intent.core.genericunit.TypeLabel;

import org.eclipse.mylyn.docs.intent.parser.IntentKeyWords;

/**
 * Returns the serialized form of the given ModelingUnit LabelDeclarationSerializer element.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public final class LabelDeclarationSerializer {

	/**
	 * LabelDeclarationSerializer constructor.
	 */
	private LabelDeclarationSerializer() {

	}

	/**
	 * Return the textual form of the given LabelDeclarationSerializer.
	 * 
	 * @param labelDeclaration
	 *            the element to serialize
	 * @param tabulationPrefix
	 *            the prefix to use for this labelDeclaration
	 * @return the textual form of the given LabelDeclarationSerializer.
	 */
	public static String serialize(LabelDeclaration labelDeclaration, String tabulationPrefix) {

		String renderedForm = tabulationPrefix;
		if (labelDeclaration.getType().equals(TypeLabel.EXPLICIT)) {
			renderedForm += "@label";
		} else {
			renderedForm += "@lazylabel";
		}
		renderedForm += IntentKeyWords.INTENT_WHITESPACE + '"' + labelDeclaration.getLabelValue() + '"';
		if (labelDeclaration.getTextToPrint() != null && labelDeclaration.getTextToPrint().length() > 0) {
			renderedForm += IntentKeyWords.INTENT_WHITESPACE + '"' + labelDeclaration.getTextToPrint() + '"';
		}

		if (labelDeclaration.isLineBreak()) {
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
