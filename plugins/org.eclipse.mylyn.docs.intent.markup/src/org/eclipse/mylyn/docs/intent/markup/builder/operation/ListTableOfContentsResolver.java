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

import java.util.ArrayList;

import org.eclipse.mylyn.docs.intent.markup.markup.BlockContent;
import org.eclipse.mylyn.docs.intent.markup.markup.Link;
import org.eclipse.mylyn.docs.intent.markup.markup.List;
import org.eclipse.mylyn.docs.intent.markup.markup.ListType;

/**
 * For a given list, determine if it's a table of contents or a regular list.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public class ListTableOfContentsResolver {
	/**
	 * List to study in order to determine if it's a table of contents.
	 */
	private List list;

	/**
	 * Constructor of this resolver. 
	 * @param listForConstruct list to assign.
	 */
	public ListTableOfContentsResolver(List listForConstruct) {
		this.list = listForConstruct;
	}

	/**
	 * Set the list's type to tableOfContents if all the elements are internal links.
	 */
	public void resolveTableOfContents() {

		boolean isTOC = onlyLinksElements(list);
		
		if (isTOC) {
			list.setListType(ListType.TABLE_OF_CONTENT);
		}
	}

	/**
	 * Returns true if the given list is only composed of links or lists that are only composed of
	 * links.
	 * 
	 * @param listToStudy
	 *            the List Item to study
	 * @return true if the given list is only composed of links or lists that are only composed of
	 *         links.
	 */
	private boolean onlyLinksElements(List listToStudy) {
		
		ArrayList<BlockContent> contentAndItems = new ArrayList<BlockContent>();
		contentAndItems.addAll(listToStudy.getContent());
		contentAndItems.addAll(listToStudy.getItems());
		boolean isTOC = !contentAndItems.isEmpty();
		
		// For each element of the list (traditionnal content like text or sublists)
		for (BlockContent blockContent : contentAndItems) {
			
			// All the elements have to be instance of link or list
			if (blockContent instanceof Link) {
				// If the element is a list, it matches a TOC element only if
				// 1. it's an internal one (starts with '#').
				isTOC = ((Link)blockContent).getHrefOrHashName().startsWith("#");
				// 2. it hasn't been declared in HTML
				isTOC = isTOC && !((Link)blockContent).isHasBeenDeclaredWithHTMLSyntax();
				
				if (!isTOC) {
					break;
				}
				
			} else {
				// If it's a list
				if (blockContent instanceof List) {
					// Then we use the same method to determine if it's a toc.
					isTOC = isTOC && onlyLinksElements((List)blockContent);
				} else {
					isTOC = false;
					break;
				}
			}
		}
		return isTOC;
	}

}
