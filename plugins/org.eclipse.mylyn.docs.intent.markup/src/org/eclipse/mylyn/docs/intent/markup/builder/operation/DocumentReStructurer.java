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

import com.google.common.collect.Multimap;
import com.google.common.collect.Multimaps;

import java.util.Iterator;
import java.util.Stack;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.mylyn.docs.intent.markup.markup.Container;
import org.eclipse.mylyn.docs.intent.markup.markup.Section;
import org.eclipse.mylyn.docs.intent.markup.markup.StructureElement;

/**
 * ReStructured of a Document element from the Markup model.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public class DocumentReStructurer {

	private Iterable<Container> roots;

	public DocumentReStructurer(Iterable<Container> roots) {
		this.roots = roots;
	}

	public void restructure() {
		for (Container root : roots) {
			restructure(root);
		}

	}

	private void restructure(Container root) {
		Stack<Container> stack = new Stack<Container>();
		stack.push(root);
		Iterator<EObject> it = root.eAllContents();
		Multimap<Container, StructureElement> roots2Childs = Multimaps.newHashMultimap();
		while (it.hasNext()) {
			EObject cur = it.next();
			if (cur instanceof StructureElement) {
				if (cur.eContainer() != stack.peek()) {
					roots2Childs.put(stack.peek(), (StructureElement)cur);
				}
			}
			if (cur instanceof Section) {
				if (stack.peek() instanceof Section) {
					if (((Section)cur).getLevel() < ((Section)stack.peek()).getLevel()) {
						stack.pop();
					}
				} else {
					stack.push((Container)cur);
				}
			}
		}

		for (Container container : roots2Childs.keys()) {
			for (StructureElement child : roots2Childs.get(container)) {
				container.getContent().add(child);
			}
		}

	}

}
