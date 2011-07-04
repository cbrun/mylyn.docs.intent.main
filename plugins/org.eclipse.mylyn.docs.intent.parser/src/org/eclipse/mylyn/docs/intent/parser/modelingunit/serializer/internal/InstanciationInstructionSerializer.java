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

import org.eclipse.mylyn.docs.intent.core.modelingunit.InstanciationInstruction;
import org.eclipse.mylyn.docs.intent.core.modelingunit.StructuralFeatureAffectation;

import org.eclipse.mylyn.docs.intent.parser.modelingunit.serializer.ModelingUnitSerializer;

/**
 * Returns the serialized form of the given ModelingUnit instanciationInstruction element.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public final class InstanciationInstructionSerializer {

	/**
	 * InstanciationInstructionSerializer constructor.
	 */
	private InstanciationInstructionSerializer() {

	}

	/**
	 * Return the textual form of the given ModelingUnit instanciationInstruction.
	 * 
	 * @param instanciationInstruction
	 *            the element to serialize
	 * @param dispatcher
	 *            the ModelingUnitElementDispatcher to call
	 * @return the textual form of the given ModelingUnit instanciationInstruction.
	 */
	public static String render(InstanciationInstruction instanciationInstruction,
			ModelingUnitElementDispatcher dispatcher) {

		int initialOffset = dispatcher.getCurrentOffset();
		String renderedForm = "new" + ModelingUnitSerializer.WHITESPACE;

		dispatcher.setCurrentOffset(initialOffset + renderedForm.length());
		renderedForm += dispatcher.doSwitch(instanciationInstruction.getMetaType())
				+ ModelingUnitSerializer.WHITESPACE;
		if (instanciationInstruction.getName() != null) {
			renderedForm += instanciationInstruction.getName() + ModelingUnitSerializer.WHITESPACE;
		}
		int declarationLength = renderedForm.length();

		renderedForm += "{";
		if (instanciationInstruction.getStructuralFeatures().size() > 0) {
			renderedForm += ModelingUnitSerializer.LINE_BREAK;
		}

		for (StructuralFeatureAffectation affectation : instanciationInstruction.getStructuralFeatures()) {
			dispatcher.setCurrentOffset(initialOffset + renderedForm.length());
			renderedForm += dispatcher.doSwitch(affectation);
		}
		renderedForm += "}";
		if (instanciationInstruction.isLineBreak()) {
			renderedForm += ModelingUnitSerializer.LINE_BREAK;
		}

		dispatcher.setDeclarationPositionForInstruction(instanciationInstruction, initialOffset,
				renderedForm.length(), declarationLength);
		dispatcher.setCurrentOffset(initialOffset + renderedForm.length());

		return renderedForm;
	}
}
