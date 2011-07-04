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

import org.eclipse.mylyn.docs.intent.core.genericunit.UnitInstruction;
import org.eclipse.mylyn.docs.intent.core.modelingunit.ContributionInstruction;

import org.eclipse.mylyn.docs.intent.parser.modelingunit.serializer.ModelingUnitSerializer;

/**
 * Returns the serialized form of the given ModelingUnit ContributionInstruction element.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public final class ContributionInstructionSerializer {

	/**
	 * ContributionInstructionSerializer constructor.
	 */
	private ContributionInstructionSerializer() {

	}

	/**
	 * Return the textual form of the given ModelingUnit ContributionInstruction.
	 * 
	 * @param contributionInstruction
	 *            the element to serialize
	 * @param dispatcher
	 *            the ModelingUnitElementDispatcher to call
	 * @return the textual form of the given ModelingUnit ContributionInstruction.
	 */
	public static String render(ContributionInstruction contributionInstruction,
			ModelingUnitElementDispatcher dispatcher) {

		int initialOffset = dispatcher.getCurrentOffset();

		String renderedForm = "";
		if (contributionInstruction.getReferencedElement() != null) {
			renderedForm += dispatcher.doSwitch(contributionInstruction.getReferencedElement());
		}
		int declarationLength = renderedForm.length();
		renderedForm += ModelingUnitSerializer.WHITESPACE + "{" + ModelingUnitSerializer.LINE_BREAK;

		dispatcher.setCurrentOffset(initialOffset + renderedForm.length());
		for (UnitInstruction instruction : contributionInstruction.getContributions()) {
			renderedForm += dispatcher.doSwitch(instruction);

		}
		renderedForm += "}";
		if (contributionInstruction.isLineBreak()) {
			renderedForm += ModelingUnitSerializer.LINE_BREAK;
		}

		dispatcher.setDeclarationPositionForInstruction(contributionInstruction, initialOffset,
				renderedForm.length(), declarationLength);
		dispatcher.setCurrentOffset(initialOffset + renderedForm.length());

		return renderedForm;
	}
}
