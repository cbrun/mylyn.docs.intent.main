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
package org.eclipse.mylyn.docs.intent.markup.builder.operation;

import com.google.common.collect.Iterators;
import com.google.common.collect.Maps;

import java.util.Iterator;
import java.util.Map;

import org.eclipse.mylyn.docs.intent.markup.markup.Document;
import org.eclipse.mylyn.docs.intent.markup.markup.HasAttributes;
import org.eclipse.mylyn.docs.intent.markup.markup.Link;

/**
 * Resolve all links contained in the document (by setting the "target" attribute of each Link).
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public class DocumentLinkResolver {

	/**
	 * Document to manage.
	 */
	private Document doc;

	/**
	 * DocumentLinkResolver constructor.
	 * 
	 * @param doc
	 *            Document to manage
	 */
	public DocumentLinkResolver(Document doc) {
		this.doc = doc;
	}

	/**
	 * Resolve all links contained in the document (by setting the "target" attribute of each Link).
	 */
	public void resolveLinks() {

		Map<String, HasAttributes> idsToElements = Maps.newHashMap();

		Iterator<HasAttributes> it = Iterators.filter(doc.eAllContents(), HasAttributes.class);
		while (it.hasNext()) {
			HasAttributes cur = it.next();
			if (cur.getAttributes() != null) {
				if (cur.getAttributes().getId() != null) {
					idsToElements.put(cur.getAttributes().getId(), cur);
				}
			}
		}

		Iterator<Link> it2 = Iterators.filter(doc.eAllContents(), Link.class);
		while (it2.hasNext()) {
			Link lnk = it2.next();
			HasAttributes target = idsToElements.get(lnk.getHrefOrHashName().substring(1));
			if (target != null) {
				lnk.setTarget(target);
			}
		}
	}

}
