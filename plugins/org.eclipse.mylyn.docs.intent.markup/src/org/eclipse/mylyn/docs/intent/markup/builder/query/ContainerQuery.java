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
package org.eclipse.mylyn.docs.intent.markup.builder.query;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.mylyn.docs.intent.markup.markup.Container;
import org.eclipse.mylyn.docs.intent.markup.markup.Document;

/**
 * Define queries for Container elements.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public class ContainerQuery {
	/**
	 * Container to manage.
	 */
	private Container container;

	/**
	 * ContainerQuery constructor.
	 * 
	 * @param root
	 *            the container to manage.
	 */
	public ContainerQuery(Container root) {
		this.container = root;
	}

	/**
	 * Return the parent of the current container.
	 * 
	 * @return the parent of the current container.
	 */
	public Document getParentDocument() {
		EObject cur = container;
		while (cur != null) {
			if (cur instanceof Document) {
				return (Document)cur;
			}
			cur = cur.eContainer();
		}
		return null;
	}
}
