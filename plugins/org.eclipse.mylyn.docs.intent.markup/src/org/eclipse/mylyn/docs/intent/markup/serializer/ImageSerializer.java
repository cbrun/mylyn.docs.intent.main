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

import org.eclipse.mylyn.docs.intent.markup.markup.Image;
import org.eclipse.mylyn.docs.intent.markup.markup.ListItem;

/**
 * Serializer of Image elements.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public final class ImageSerializer {

	/**
	 * ImageSerializer constructor.
	 */
	private ImageSerializer() {

	}

	/**
	 * Render the given Image.
	 * 
	 * @param object
	 *            image to serialize
	 * @return the serialized form of the given Image.
	 */
	public static String render(Image object) {

		String renderedImage = "!" + ((Image)object).getUrl() + "!";
		// If this image isn't linked in a list, we add a \n.
		if (!(object.eContainer() instanceof ListItem)) {
			renderedImage += WikiTextResourceSerializer.LINE_BREAK;
			if (!(BlockSerializer.isLastElementOfBlockAndSection(object))) {
				renderedImage += WikiTextResourceSerializer.LINE_BREAK;
			}
		}

		return renderedImage;
	}

}
