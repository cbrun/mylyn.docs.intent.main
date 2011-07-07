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

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Iterators;
import com.google.common.collect.Multimap;

import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.mylyn.docs.intent.markup.markup.Container;
import org.eclipse.mylyn.docs.intent.markup.markup.Document;

/**
 * Define queries for Document elements.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public class DocumentQuery {

	/**
	 * Document to manage.
	 */
	private Document doc;

	/**
	 * DocumentQuery constructor.
	 * 
	 * @param doc
	 *            the document to manage.
	 */
	public DocumentQuery(Document doc) {
		this.doc = doc;
	}

	public Container getLastContainer(int i) {

		Multimap<Integer, Container> levelToContainers = HashMultimap.create();
		levelToContainers.put(Integer.valueOf(0), doc);
		updateLevelMap(0, levelToContainers, doc);

		return Iterators.getLast(levelToContainers.get(Integer.valueOf(i)).iterator());
	}

	private void updateLevelMap(int i, Multimap<Integer, Container> levelToContainers, EObject current) {
		Iterator<EObject> it = current.eContents().iterator();
		while (it.hasNext()) {
			EObject child = it.next();
			if (child instanceof Container) {
				Integer key = Integer.valueOf(i + 1);
				levelToContainers.put(key, (Container)child);
				updateLevelMap(i + 1, levelToContainers, child);
			} else {
				updateLevelMap(i, levelToContainers, child);
			}
		}

	}
}
