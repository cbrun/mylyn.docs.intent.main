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
import java.util.Iterator;
import java.util.List;

import org.eclipse.mylyn.docs.intent.markup.markup.Document;
import org.eclipse.mylyn.docs.intent.markup.markup.MarkupFactory;
import org.eclipse.mylyn.docs.intent.markup.markup.Section;


/**
 * Merge several documents into a single one.
 * 
 * @author <a href="mailto:cedric.brun@obeo.fr">Cedric Brun</a>
 * 
 */
public class DocumentAggregator {

	private List<Document> roots;

	/**
	 * Create a new aggregator which will use the given roots and aggregate them
	 * in a single document.
	 * 
	 * @param roots
	 *            documents to aggregate in a single one.
	 */
	public DocumentAggregator(List<Document> roots) {
		this.roots = roots;
	}

	/**
	 * Do the actual work and move the original documents content to a new one.
	 * 
	 * @return the aggregated document.
	 */
	public Document merge() {
		Document result = MarkupFactory.eINSTANCE.createDocument();
		for (Document root : roots) {
			Iterator<Section> it = Iterators.filter(root.eAllContents(),
					Section.class);
			while (it.hasNext()) {
				Section sec = it.next();				
				sec.setLevel(sec.getLevel() + 1);
			}
			result.getContent().addAll(root.getContent());
		}
		return result;
	}
}
