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

import org.eclipse.mylyn.docs.intent.markup.markup.Link;

/**
 * Serializer of Links elements.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public final class LinkSerializer {

	/**
	 * LinkSerializer constructor.
	 */
	private LinkSerializer() {

	}

	/**
	 * Returns the serialized form of the given link.
	 * 
	 * @param link
	 *            link to serialize
	 * @param dispatcher
	 *            the WikiTextElementDispatcher to use
	 * @return the serialized form of the given link
	 */
	public static String render(Link link, WikiTextElementDispatcher dispatcher) {

		String titleDeclaration = "";
		// We first determine the title value for this link (can be null).
		String linkTitle = null;
		if (link.getAttributes() != null) {
			linkTitle = link.getAttributes().getTitle();
		}

		// If the link has to be rendered with the HTML syntax
		if (link.isHasBeenDeclaredWithHTMLSyntax()) {
			if (linkTitle != null) {
				titleDeclaration = "\" title=\"" + linkTitle;
			}
			return "<a href=\"" + link.getHrefOrHashName() + titleDeclaration + "\">"
					+ dispatcher.doSwitch(link.getName()) + "</a>";
		} else {
			if (linkTitle != null) {
				titleDeclaration = "(" + linkTitle + ")";
			}
			return "\"" + dispatcher.doSwitch(link.getName()) + titleDeclaration + "\":"
					+ link.getHrefOrHashName();
		}

	}
}
