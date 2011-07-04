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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mylyn.docs.intent.markup.markup.BlockContent;
import org.eclipse.mylyn.docs.intent.markup.markup.Container;
import org.eclipse.mylyn.docs.intent.markup.markup.Section;
import org.eclipse.mylyn.docs.intent.markup.markup.SimpleContainer;
import org.eclipse.mylyn.docs.intent.markup.markup.StructureElement;

/**
 * Class which purpose is to serialize a Section element from a WikiText document.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public final class SectionSerializer {

	/**
	 * SectionSerializer constructor.
	 */
	private SectionSerializer() {

	}

	/**
	 * Serialize the given section and all its contained elements.
	 * 
	 * @param section
	 *            Section to serialize
	 * @param dispatcher
	 *            Wiki element dispatcher
	 * @return the serialized form of the given section
	 */
	public static String render(Section section, WikiTextElementDispatcher dispatcher) {

		// Step 1 : We first determine the number of lines to break
		// 0 if the section is contained in a simpleContainer
		// 1 if the section is the first of the document
		String breakLine = "";
		if (!isContainedinSimpleContainer(section)) {
			if (isFirstSection(section)) {
				breakLine = WikiTextResourceSerializer.LINE_BREAK;
			} else {
				// 2 in all other cases
				breakLine = WikiTextResourceSerializer.LINE_BREAK + WikiTextResourceSerializer.LINE_BREAK;
			}
		}

		// If the previous bloc was preformatted, this section
		// breaks this format.
		if (BlockSerializer.usePrefix()) {
			// What's more, we don't have to break a line before print this section.
			breakLine = "";
			BlockSerializer.breakPreformatted();
		}

		// Step 2 : serialize the Prefix and the style of this section.
		String style = AttributeStyleSerializer.renderAttributeForBloc(section.getAttributes());
		String renderedForm = "h" + section.getLevel() + style + ". ";

		// Step 3 : serialize the title
		// For all the Text and Entities that represent this section's title
		for (BlockContent titleElement : section.getTitle().getContent()) {
			// We render it
			renderedForm += dispatcher.doSwitch(titleElement);
		}
		renderedForm = breakLine + renderedForm + WikiTextResourceSerializer.LINE_BREAK
				+ WikiTextResourceSerializer.LINE_BREAK;

		// Step 4 : serialize the contents of this section by calling the dispatcher
		for (StructureElement blockContent : section.getContent()) {
			renderedForm += dispatcher.doSwitch(blockContent);
		}
		return renderedForm;
	}

	/**
	 * Indicates if the given section is contained in a simpleContainer.
	 * 
	 * @param section
	 *            the section
	 * @return true if the given section is contained in a simpleContainer, false otherwise.
	 */
	private static boolean isContainedinSimpleContainer(Section section) {
		return section.eContainer() instanceof SimpleContainer;
	}

	/**
	 * Indicates if the given section is the first of the document.
	 * 
	 * @param section
	 *            section to test
	 * @return true if the given section is the first of the document, false otherwise.
	 */
	private static boolean isFirstSection(Section section) {
		return section.eContainer().eContents().get(0) == section;
	}

	/**
	 * Returns true if the given element is the first element of its containing section.
	 * 
	 * @param element
	 *            the element to test
	 * @return true if the given element is the first element of its containing section
	 */
	static boolean isFirstElementOfSection(StructureElement element) {
		return element.eContainer().eContents().get(0) == element;
	}

	/**
	 * Returns true if the given element is the last element of its containing section.
	 * 
	 * @param element
	 *            the element to test
	 * @return true if the given element is the last element of its containing section
	 */
	static boolean isLastElementOfSection(StructureElement element) {
		EObject container = element.eContainer();
		EList<StructureElement> listOfContents = null;
		if (container instanceof Container) {
			listOfContents = ((Container)container).getContent();
			return listOfContents.lastIndexOf(element) == (listOfContents.size() - 1);
		}
		return false;
	}

}
