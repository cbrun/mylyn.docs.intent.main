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
package org.eclipse.mylyn.docs.intent.core.query;

import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.mylyn.docs.intent.core.descriptionunit.DescriptionBloc;
import org.eclipse.mylyn.docs.intent.core.descriptionunit.DescriptionUnit;
import org.eclipse.mylyn.docs.intent.core.genericunit.UnitInstruction;
import org.eclipse.mylyn.docs.intent.markup.markup.Block;
import org.eclipse.mylyn.docs.intent.markup.markup.Section;
import org.eclipse.mylyn.docs.intent.markup.markup.StructureElement;
import org.eclipse.mylyn.docs.intent.markup.markup.Text;
import org.eclipse.mylyn.docs.intent.markup.serializer.TextSerializer;

/**
 * Class that provides useful services on DescriptionUnits element.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public final class DescriptionUnitHelper {

	/**
	 * DescriptionUnitHelper constructor.
	 */
	private DescriptionUnitHelper() {

	}

	/**
	 * Returns the title of the given description unit.
	 * 
	 * @param descriptionUnit
	 *            the element from which the title must be extracted
	 * @param maxSize
	 *            the maximum size of the returned title
	 * @return the title of the given description unit, an empty String if no title found
	 */
	public static String getDescriptionUnitTitle(DescriptionUnit descriptionUnit, int maxSize) {
		String title = "";
		Iterator<UnitInstruction> iterator = descriptionUnit.getInstructions().iterator();
		while (("".equals(title)) && (iterator.hasNext())) {
			UnitInstruction nextInstruction = iterator.next();
			if (nextInstruction instanceof DescriptionBloc) {
				title = getDescriptionBlocTitle((DescriptionBloc)nextInstruction, maxSize);
			}

		}
		return title;
	}

	/**
	 * Returns the title of the given description bloc.
	 * 
	 * @param descriptionBlock
	 *            the element from which the title must be extracted
	 * @param maxSize
	 *            the maximum size of the returned title
	 * @return the title of the given description bloc, an empty String if no title found
	 */
	public static String getDescriptionBlocTitle(DescriptionBloc descriptionBlock, int maxSize) {
		String title = "";
		Iterator<StructureElement> iterator = descriptionBlock.getDescriptionBloc().getContent().iterator();
		while (("".equals(title)) && (iterator.hasNext())) {
			title = getLabelForMarkupElement(iterator.next(), maxSize);
		}
		return title;

	}

	/**
	 * Calculate a title for the given Markup structured element.
	 * 
	 * @param element
	 *            the element from which the label must be extracted
	 * @param maxSize
	 *            the maximum size of the returned title
	 * @return the title for the given Markup structured element
	 */
	public static String getLabelForMarkupElement(StructureElement element, int maxSize) {
		String label = "";
		if (element instanceof Section) {
			label = getLabelForSection((Section)element, maxSize);
		}

		if (element instanceof Block) {
			label = getLabelForBlock((Block)element, maxSize);
		}
		return label;
	}

	/**
	 * Calculate a title for the given markup Section.
	 * 
	 * @param section
	 *            the element from which the label must be extracted
	 * @param maxSize
	 *            the maximum size of the returned title
	 * @return the title for the given markup Section
	 */
	private static String getLabelForSection(Section section, int maxSize) {
		return getLabelForBlock(section.getTitle(), maxSize);
	}

	/**
	 * Calculate a label for the given block.
	 * 
	 * @param block
	 *            the element from which the label must be extracted
	 * @param maxSize
	 *            the maximum size of the returned title
	 * @return the label for the given block
	 */
	private static String getLabelForBlock(Block block, int maxSize) {
		String title = "";
		// We concatenate each text blocs of this title until we have reached the max size
		for (EObject obj : block.eContents()) {
			String newTitleElement = "";
			if (obj instanceof Text) {
				newTitleElement = TextSerializer.render((Text)obj).replace("\t", "");

			} else {
				if (obj instanceof Block) {
					if (title.length() > 0) {
						newTitleElement += " , ";
					}
					newTitleElement += getLabelForBlock((Block)obj, maxSize);
				}
			}
			if (newTitleElement.length() + title.length() > maxSize) {
				title += newTitleElement.substring(0, maxSize - title.length());
			} else {
				title += newTitleElement;
			}
			if (title.length() > maxSize) {
				break;
			}
		}
		return title;
	}
}
