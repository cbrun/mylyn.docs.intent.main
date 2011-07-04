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
package org.eclipse.mylyn.docs.intent.core.query;

import org.eclipse.mylyn.docs.intent.core.document.IntentStructuredElement;
import org.eclipse.mylyn.docs.intent.markup.markup.Block;

/**
 * Provides usefull methods for getting informations about Structured Element.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public final class StructuredElementHelper {

	/**
	 * StructuredElementHelper constructor.
	 */
	private StructuredElementHelper() {

	}

	/**
	 * Returns the title of a modeling Unit.
	 * 
	 * @param element
	 *            the element from which the title must be extracted
	 * @return the title of a modeling Unit (empty String if no title).
	 */
	public static String getTitle(IntentStructuredElement element) {
		return getTitle(element, Integer.MAX_VALUE);
	}

	/**
	 * Returns the title of a StructuredElement.
	 * 
	 * @param element
	 *            the element from which the title must be extracted
	 * @param maxSize
	 *            the maximum size of the returned title
	 * @return the title of a modeling Unit (empty String if no title).
	 */
	public static String getTitle(IntentStructuredElement element, int maxSize) {

		Block block = ((IntentStructuredElement)element).getTitle();
		return DescriptionUnitHelper.getLabelForMarkupElement(block, maxSize);
	}
}
