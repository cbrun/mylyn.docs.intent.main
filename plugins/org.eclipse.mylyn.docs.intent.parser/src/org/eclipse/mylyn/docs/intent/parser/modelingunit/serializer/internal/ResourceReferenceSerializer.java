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

import org.eclipse.mylyn.docs.intent.core.modelingunit.ResourceReference;

/**
 * Returns the serialized form of the given ModelingUnit ResourceReference element.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public final class ResourceReferenceSerializer {

	/**
	 * ResourceReferenceSerializer constructor.
	 */
	private ResourceReferenceSerializer() {

	}

	/**
	 * Return the textual form of the given ModelingUnit ResourceReference.
	 * 
	 * @param resourceReference
	 *            the element to serialize
	 * @param modelingUnitElementDispatcher
	 *            the modelingUnitElementDispatcher
	 * @return the textual form of the given ModelingUnit ResourceReference.
	 */
	public static String render(ResourceReference resourceReference,
			ModelingUnitElementDispatcher modelingUnitElementDispatcher) {
		String renderedForm = "[" + resourceReference.getIntentHref() + "]";

		// if (resourceReference.isLineBreak()) {
		// renderedForm += ModelingUnitSerializer.LINE_BREAK;
		// }
		modelingUnitElementDispatcher.setPositionForInstruction(resourceReference,
				modelingUnitElementDispatcher.getCurrentOffset(), renderedForm.length());
		modelingUnitElementDispatcher.setCurrentOffset(modelingUnitElementDispatcher.getCurrentOffset()
				+ renderedForm.length());
		return renderedForm;
	}
}
