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
import org.eclipse.mylyn.docs.intent.markup.markup.BlockContent;
import org.eclipse.mylyn.docs.intent.markup.markup.List;
import org.eclipse.mylyn.docs.intent.markup.markup.ListItem;
import org.eclipse.mylyn.docs.intent.markup.markup.ListType;
import org.eclipse.mylyn.docs.intent.markup.markup.SimpleContainer;

/**
 * Class which purpose is to serialize a List element from a WikiText document.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public final class ListSerializer {

	public static final String BULLETED_SYMBOL = "*";

	public static final String NUMERIC_SYMBOL = "#";

	public static final String TABLE_OF_CONTENT_SYMBOL = "{toc}";

	/**
	 * ListSerializer constructor.
	 */
	private ListSerializer() {

	}

	/**
	 * Render the given list by rendering its contained listItems.
	 * 
	 * @param list
	 *            WikiText list to render
	 * @param dispatcher
	 *            Dispatcher used to call the correct renderring method on the listItems.
	 * @return the list serialized in the Textile Syntax.
	 */
	public static String render(List list, WikiTextElementDispatcher dispatcher) {
		// If the list is a table of contents
		if (isTableofContent(list)) {
			return WikiTextResourceSerializer.LINE_BREAK + WikiTextResourceSerializer.LINE_BREAK
					+ TABLE_OF_CONTENT_SYMBOL;
		}

		String renderedForm = "";
		// calculate the prefix associated to this list.
		String prefix = getPrefixFromListType(list.getListType());
		String listPrefix = "";
		// According to the imbrication level, we will use the correct number of prefix
		for (int i = 0; i < list.getImbricationLevel(); i++) {
			listPrefix += prefix;
		}
		// saving the Style associated to this list.
		String currentStyle = AttributeStyleSerializer.renderAttributeForBloc(list.getAttributes());

		// We first render the text of this list (given by getContent())
		for (BlockContent blockContent : list.getContent()) {
			renderedForm += dispatcher.doSwitch(blockContent);
		}

		if (!"".equals(renderedForm)) {
			renderedForm = listPrefix + currentStyle + " " + renderedForm
					+ WikiTextResourceSerializer.LINE_BREAK;
			currentStyle = "";
		}
		// Then we render all the list Items
		for (ListItem listItem : list.getItems()) {
			renderedForm += dispatcher.doSwitch(listItem);
		}

		// We then manage the carriage returns before and after of the list
		if (!(list instanceof ListItem)) {
			if (!SectionSerializer.isFirstElementOfSection(list)) {
				renderedForm = WikiTextResourceSerializer.LINE_BREAK + renderedForm;
			}

			if (!isContainedinSimpleContainer(list)) {
				if (!SectionSerializer.isLastElementOfSection(list)) {
					renderedForm += WikiTextResourceSerializer.LINE_BREAK;
				}
			}

		}
		return renderedForm;
	}

	/**
	 * Returns true if the list is a table of content.
	 * 
	 * @param list
	 *            list to analyse.
	 * @return true if the list is a table of content, false otherwise.
	 */
	private static boolean isTableofContent(List list) {
		return list.getListType().equals(ListType.TABLE_OF_CONTENT);
	}

	/**
	 * Indicates if the given List is contained in a simpleContainer.
	 * 
	 * @param list
	 *            the list
	 * @return true if the given list is contained in a simpleContainer, false otherwise.
	 */
	private static boolean isContainedinSimpleContainer(List list) {
		EObject container = list.eContainer();
		return container instanceof SimpleContainer;
	}

	/**
	 * Returns the prefix matching with the type of the list.
	 * 
	 * @param listType
	 *            type of a list
	 * @return the prefix matching with the type of the list.
	 */
	public static String getPrefixFromListType(ListType listType) {
		int listTypeValue = listType.getValue();
		String prefix = "";

		switch (listTypeValue) {
			case ListType.NUMERIC_VALUE:
				prefix = NUMERIC_SYMBOL;
				break;
			default:
				prefix = BULLETED_SYMBOL;
				break;
		}
		return prefix;

	}

}
