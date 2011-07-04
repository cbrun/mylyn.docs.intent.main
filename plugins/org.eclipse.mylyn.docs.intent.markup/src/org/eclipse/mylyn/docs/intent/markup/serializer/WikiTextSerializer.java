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
package org.eclipse.mylyn.docs.intent.markup.serializer;

import org.eclipse.emf.ecore.EObject;

/**
 * Serializes a Markup element under the textile format.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public class WikiTextSerializer {
	/**
	 * Dispatcher used to render the WikiText element according to its type.
	 */
	private WikiTextElementDispatcher dispatcher;

	/**
	 * Default constructor : create a new Dispatcher.
	 */
	public WikiTextSerializer() {
		dispatcher = new WikiTextElementDispatcher();
	}

	/**
	 * Serialize the given Markup element in a Textile form.
	 * 
	 * @param markupElement
	 *            the element to serialize
	 * @return the serialized form of the given Markup element
	 */
	public String serialize(EObject markupElement) {
		if (markupElement == null) {
			return "";
		}
		return dispatcher.doSwitch(markupElement);
	}
}
