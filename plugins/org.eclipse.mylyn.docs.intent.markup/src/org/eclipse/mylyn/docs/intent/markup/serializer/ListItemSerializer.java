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
import org.eclipse.mylyn.docs.intent.markup.markup.List;
import org.eclipse.mylyn.docs.intent.markup.markup.ListItem;

/**
 * Class which purpose is to serialize a ListItem element from a WikiText document.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public final class ListItemSerializer {

	/**
	 * ListItemSerializer constructor.
	 */
	private ListItemSerializer() {

	}

	/**
	 * Render the given listItem by considering it as a List or a Bloc (according to its isList attribute).
	 * 
	 * @param listItem
	 *            listItem to serializer
	 * @param dispatcher
	 *            Wikitext elements dispatcher to call
	 * @return the serialized form of the given listItem
	 */
	public static String render(ListItem listItem, WikiTextElementDispatcher dispatcher) {

		if (listItem.isIsList()) {
			return ListSerializer.render(listItem, dispatcher);
		} else {
			String prefix = ListSerializer.getPrefixFromListType(((List)listItem.eContainer()).getListType());
			String listItemPrefix = "";
			// According to the imbrication level, we will use the correct number of prefix
			for (int i = 0; i < listItem.getImbricationLevel(); i++) {
				listItemPrefix += prefix;
			}

			return BlockSerializer.renderWithBlocPrefix(listItem, dispatcher, listItemPrefix
					+ getListContainerStyle(listItem) + " ")
					+ WikiTextResourceSerializer.LINE_BREAK;
		}
	}

	/**
	 * If the given listItem is the first element of its list container, returns the style associated to this
	 * list.
	 * 
	 * @param listItem
	 *            The listItem to inspect
	 * @return If the given listItem is the first element of its list container, returns the style associated
	 *         to this list ; returns an empty String otherwise.
	 */
	private static String getListContainerStyle(ListItem listItem) {

		List containerList = getContainerListIfFirstElementofList(listItem);
		// If this listItem is the first element of the list
		if (containerList != null) {
			// We return the rendered attributes associated to this list.
			return AttributeStyleSerializer.renderAttributeForBloc(containerList.getAttributes());

		}
		return "";
	}

	/**
	 * Returns the container List of the given ListItem ONLY if it's the first element of this list.
	 * 
	 * @param element
	 *            the listItem to inspect.
	 * @return the container List of the given ListItem ONLY if it's the first element of this list, null
	 *         otherwise.
	 */
	private static List getContainerListIfFirstElementofList(ListItem element) {
		List returnedList = null;
		EObject container = element.eContainer();
		if (container instanceof List) {
			List containerList = (List)container;
			boolean isFirstOfList = ((List)container).getItems().indexOf(element) == 0;
			// If the given listItem is a level 2 listItem
			if (isFirstOfList && (containerList.eContainer() instanceof List)) {
				if (((List)containerList.eContainer()).getItems().indexOf(element) == 0) {
					returnedList = (List)containerList.eContainer();
				} else {
					returnedList = containerList;
				}
			}
		}
		return returnedList;
	}
}
