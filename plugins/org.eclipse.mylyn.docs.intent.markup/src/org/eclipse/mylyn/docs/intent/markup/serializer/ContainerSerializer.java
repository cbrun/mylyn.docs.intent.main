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

import org.eclipse.mylyn.docs.intent.markup.markup.Container;
import org.eclipse.mylyn.docs.intent.markup.markup.StructureElement;

/**
 * Serializes Container elements.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public final class ContainerSerializer {

	/**
	 * ContainerSerializer constructor.
	 */
	private ContainerSerializer() {

	}

	/**
	 * Simply concatenate the serialized form of each StructuredElement contained in the given container.
	 * 
	 * @param container
	 *            Container to serialize.
	 * @param dispatcher
	 *            Dispatcher used to call the correct serialization for each structured element
	 * @return the serialized form of this container
	 */
	public static String render(Container container, WikiTextElementDispatcher dispatcher) {
		String renderedContent = "";
		for (StructureElement wikiElement : container.getContent()) {
			renderedContent += dispatcher.doSwitch(wikiElement) + "\n";
		}
		return renderedContent;
	}

}
