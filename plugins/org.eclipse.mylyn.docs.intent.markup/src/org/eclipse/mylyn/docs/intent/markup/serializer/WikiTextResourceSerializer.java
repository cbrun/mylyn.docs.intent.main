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
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.mylyn.docs.intent.markup.resource.WikitextResourceImpl;

/**
 * Serializes a WikiTextResource under the textile format.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public final class WikiTextResourceSerializer {

	/**
	 * Define the symbol for lineBreak, used by all elements.
	 */
	public static final String LINE_BREAK = "\n";

	/**
	 * Instance of the Serializer (singleton).
	 */
	private static WikiTextResourceSerializer serializer;

	/**
	 * Dispatcher used to render the WikiText element according to its type.
	 */
	private WikiTextElementDispatcher dispatcher;

	/**
	 * Default constructor : create a new Dispatcher.
	 */
	private WikiTextResourceSerializer() {
		dispatcher = new WikiTextElementDispatcher();
	}

	/**
	 * Returns the current instance of the serializer.
	 * 
	 * @return the current instance of the serializer.
	 */
	public static WikiTextResourceSerializer getSerializer() {
		if (serializer == null) {
			serializer = new WikiTextResourceSerializer();
		}
		return serializer;
	}

	/**
	 * Serialize the given WikiTextResource in a Textile form.
	 * 
	 * @param wikiTextResource
	 *            resource to serialize.
	 * @return the serialized form of the given WikiTextResource
	 */
	public String serialize(Resource wikiTextResource) {
		if (!(wikiTextResource instanceof WikitextResourceImpl)) {
			throw new UnsupportedOperationException(
					"Can't serialize this resource : must be a WikiTextResourceImpl.");
		}

		String serializedForm = "";
		for (EObject root : wikiTextResource.getContents()) {
			serializedForm += dispatcher.doSwitch(root);
		}
		return serializedForm;
	}
}
