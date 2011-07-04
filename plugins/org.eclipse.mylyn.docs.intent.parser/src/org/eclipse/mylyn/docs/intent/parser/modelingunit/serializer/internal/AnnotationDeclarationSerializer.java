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

import java.util.Map.Entry;

import org.eclipse.mylyn.docs.intent.core.modelingunit.AnnotationDeclaration;

import org.eclipse.mylyn.docs.intent.parser.modelingunit.serializer.ModelingUnitSerializer;

/**
 * Returns the serialized form of the given ModelingUnit annotationDeclaration element.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public final class AnnotationDeclarationSerializer {

	/**
	 * annotationDeclarationSerializer constructor.
	 */
	private AnnotationDeclarationSerializer() {

	}

	/**
	 * Return the textual form of the given ModelingUnit annotationDeclaration.
	 * 
	 * @param annotationDeclaration
	 *            the element to serialize
	 * @param modelingUnitElementDispatcher
	 *            the modelingUnitElementDispatcher
	 * @return the textual form of the given ModelingUnit annotationDeclaration.
	 */
	public static String render(AnnotationDeclaration annotationDeclaration,
			ModelingUnitElementDispatcher modelingUnitElementDispatcher) {
		String renderedForm = "@Annotation" + ModelingUnitSerializer.WHITESPACE;
		renderedForm += annotationDeclaration.getAnnotationID() + ModelingUnitSerializer.WHITESPACE;

		int nbVals = 0;
		for (Entry<String, String> keyVal : annotationDeclaration.getMap()) {
			if (nbVals > 0) {
				renderedForm += "," + ModelingUnitSerializer.WHITESPACE;
			}
			renderedForm += keyVal.getKey() + "=" + keyVal.getValue();
			nbVals++;
		}

		if (annotationDeclaration.isLineBreak()) {
			renderedForm += ModelingUnitSerializer.LINE_BREAK;
		}

		modelingUnitElementDispatcher.setPositionForInstruction(annotationDeclaration,
				modelingUnitElementDispatcher.getCurrentOffset(), renderedForm.length());
		modelingUnitElementDispatcher.setCurrentOffset(modelingUnitElementDispatcher.getCurrentOffset()
				+ renderedForm.length());

		return renderedForm;
	}
}
