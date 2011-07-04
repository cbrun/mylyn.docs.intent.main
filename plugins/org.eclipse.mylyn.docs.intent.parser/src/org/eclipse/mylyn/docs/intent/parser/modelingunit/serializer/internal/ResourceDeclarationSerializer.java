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

import org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnitInstructionReference;
import org.eclipse.mylyn.docs.intent.core.modelingunit.ResourceDeclaration;

import org.eclipse.mylyn.docs.intent.parser.modelingunit.serializer.ModelingUnitSerializer;

/**
 * Returns the serialized form of the given ModelingUnit ResourceDeclaration element.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public final class ResourceDeclarationSerializer {

	/**
	 * ResourceDeclarationSerializer constructor.
	 */
	private ResourceDeclarationSerializer() {

	}

	/**
	 * Return the textual form of the given ModelingUnit ResourceDeclaration.
	 * 
	 * @param resourceDeclaration
	 *            the element to serialize
	 * @param dispatcher
	 *            the ModelingUnitElementDispatcher to call
	 * @return the textual form of the given ModelingUnit ResourceDeclaration.
	 */
	public static String render(ResourceDeclaration resourceDeclaration,
			ModelingUnitElementDispatcher dispatcher) {

		int initialOffset = dispatcher.getCurrentOffset();
		String renderedForm = "Resource" + ModelingUnitSerializer.WHITESPACE;
		int declarationLength = renderedForm.length();
		if (resourceDeclaration.getName() != null && resourceDeclaration.getName().length() > 0) {
			renderedForm += resourceDeclaration.getName();
			declarationLength = renderedForm.length();
			renderedForm += ModelingUnitSerializer.WHITESPACE;
		}

		renderedForm += "{" + ModelingUnitSerializer.LINE_BREAK;

		if (resourceDeclaration.getUri() != null) {
			renderedForm += "URI" + ModelingUnitSerializer.WHITESPACE + "="
					+ ModelingUnitSerializer.WHITESPACE + resourceDeclaration.getUri() + ';'
					+ ModelingUnitSerializer.LINE_BREAK;
		}

		if (resourceDeclaration.getContentType() != null) {
			renderedForm += "contentType" + ModelingUnitSerializer.WHITESPACE + "="
					+ ModelingUnitSerializer.WHITESPACE + resourceDeclaration.getContentType() + ';'
					+ ModelingUnitSerializer.LINE_BREAK;
		}

		for (ModelingUnitInstructionReference content : resourceDeclaration.getContent()) {
			renderedForm += "content" + ModelingUnitSerializer.WHITESPACE + "+="
					+ ModelingUnitSerializer.WHITESPACE;

			dispatcher.setCurrentOffset(initialOffset + renderedForm.length());
			renderedForm += dispatcher.doSwitch(content) + ';' + ModelingUnitSerializer.LINE_BREAK;
		}

		renderedForm += "}";
		if (resourceDeclaration.isLineBreak()) {
			renderedForm += ModelingUnitSerializer.LINE_BREAK;
		}

		dispatcher.setDeclarationPositionForInstruction(resourceDeclaration, initialOffset,
				renderedForm.length(), declarationLength);
		dispatcher.setCurrentOffset(initialOffset + renderedForm.length());
		return renderedForm;
	}
}
