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

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mylyn.docs.intent.core.descriptionunit.DescriptionUnit;
import org.eclipse.mylyn.docs.intent.core.document.IntentChapter;
import org.eclipse.mylyn.docs.intent.core.document.IntentDocument;
import org.eclipse.mylyn.docs.intent.core.document.IntentSection;
import org.eclipse.mylyn.docs.intent.core.genericunit.GenericUnit;
import org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnit;

/**
 * Class that provides useful services about Units (for example : getting all the modeling units or
 * description units contained in an element).
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public final class UnitGetter {

	/**
	 * ModelingUnitGetter constructor.
	 */
	private UnitGetter() {

	}

	/**
	 * Returns all the modeling units contained in the given element ; if the element is a modeling unit,
	 * return this modeling unit.
	 * 
	 * @param element
	 *            the element to inspect
	 * @return an EList containing all the modeling unit contained in the given element ; if the element is a
	 *         modeling unit, return this modeling unit ; if the element contains no modeling unit, return an
	 *         empty list.
	 */
	public static EList<ModelingUnit> getAllModelingUnitsContainedInElement(EObject element) {
		EList<ModelingUnit> containedModelingUnits = new BasicEList<ModelingUnit>();

		// If the given element is a Modeling Unit
		if (element instanceof ModelingUnit) {
			// We simply return a list containing this modeling unit
			containedModelingUnits.add((ModelingUnit)element);
		}
		// If the given element is a Section
		if (element instanceof IntentSection) {
			containedModelingUnits.addAll(getAllModelingUnitsContainedInSection((IntentSection)element));
		}
		// If the given element is a Chapter
		if (element instanceof IntentChapter) {
			containedModelingUnits.addAll(getAllModelingUnitsContainedInChapter((IntentChapter)element));
		}
		// If the given element is a IntentDocument
		if (element instanceof IntentDocument) {
			containedModelingUnits.addAll(getAllModelingUnitsContainedInIntentDocument((IntentDocument)element));
		}
		// In all other cases, we simply return an empty list

		return containedModelingUnits;
	}

	/**
	 * Returns all the modeling units contained in the given IntentDocument.
	 * 
	 * @param document
	 *            the IntentDocument to inspect
	 * @return a list containing all the modeling units contained in the given IntentDocument
	 */
	private static EList<ModelingUnit> getAllModelingUnitsContainedInIntentDocument(IntentDocument document) {
		EList<ModelingUnit> containedModelingUnits = new BasicEList<ModelingUnit>();
		for (IntentChapter chapter : document.getChapters()) {
			containedModelingUnits.addAll(getAllModelingUnitsContainedInChapter(chapter));
		}
		return containedModelingUnits;
	}

	/**
	 * Returns all the modeling units contained in the given Chapter.
	 * 
	 * @param chapter
	 *            the Chapter to inspect
	 * @return a list containing all the modeling units contained in the given Chapter
	 */
	private static EList<ModelingUnit> getAllModelingUnitsContainedInChapter(IntentChapter chapter) {
		EList<ModelingUnit> containedModelingUnits = new BasicEList<ModelingUnit>();
		for (IntentSection section : chapter.getSubSections()) {
			containedModelingUnits.addAll(getAllModelingUnitsContainedInSection(section));
		}
		return containedModelingUnits;
	}

	/**
	 * Returns all the modeling units contained (directly or via its sub-section) in the given Section.
	 * 
	 * @param section
	 *            the Section to inspect
	 * @return a list containing all the modeling units contained in the given Section
	 */
	private static EList<ModelingUnit> getAllModelingUnitsContainedInSection(IntentSection section) {
		EList<ModelingUnit> containedModelingUnits = new BasicEList<ModelingUnit>();

		// We first add the modeling units directly contained in this section
		for (GenericUnit unit : section.getUnits()) {
			if (unit instanceof ModelingUnit) {
				containedModelingUnits.add((ModelingUnit)unit);
			}
		}

		// Then we inspect its subsection (if any)
		for (IntentSection subSection : section.getSubSections()) {
			containedModelingUnits.addAll(getAllModelingUnitsContainedInSection(subSection));
		}

		return containedModelingUnits;

	}

	/**
	 * Returns all the Description units contained in the given element ; if the element is a Description
	 * unit, return this Description unit.
	 * 
	 * @param element
	 *            the element to inspect
	 * @return an EList containing all the Description unit contained in the given element ; if the element is
	 *         a Description unit, return this Description unit ; if the element contains no Description unit,
	 *         return an empty list.
	 */
	public static EList<DescriptionUnit> getAllDescriptionUnitsContainedInElement(EObject element) {
		EList<DescriptionUnit> containedDescriptionUnits = new BasicEList<DescriptionUnit>();

		// If the given element is a Description Unit
		if (element instanceof DescriptionUnit) {
			// We simply return a list containing this Description unit
			containedDescriptionUnits.add((DescriptionUnit)element);
		}
		// If the given element is a Section
		if (element instanceof IntentSection) {
			containedDescriptionUnits.addAll(getAllDescriptionUnitsContainedInSection((IntentSection)element));
		}
		// If the given element is a Chapter
		if (element instanceof IntentChapter) {
			containedDescriptionUnits.addAll(getAllDescriptionUnitsContainedInChapter((IntentChapter)element));
		}
		// If the given element is a IntentDocument
		if (element instanceof IntentDocument) {
			containedDescriptionUnits
					.addAll(getAllDescriptionUnitsContainedInIntentDocument((IntentDocument)element));
		}
		// In all other cases, we simply return an empty list

		return containedDescriptionUnits;
	}

	/**
	 * Returns all the Description units contained in the given IntentDocument.
	 * 
	 * @param document
	 *            the IntentDocument to inspect
	 * @return a list containing all the Description units contained in the given IntentDocument
	 */
	private static EList<DescriptionUnit> getAllDescriptionUnitsContainedInIntentDocument(IntentDocument document) {
		EList<DescriptionUnit> containedDescriptionUnits = new BasicEList<DescriptionUnit>();
		for (IntentChapter chapter : document.getChapters()) {
			containedDescriptionUnits.addAll(getAllDescriptionUnitsContainedInChapter(chapter));
		}
		return containedDescriptionUnits;
	}

	/**
	 * Returns all the Description units contained in the given Chapter.
	 * 
	 * @param chapter
	 *            the Chapter to inspect
	 * @return a list containing all the Description units contained in the given Chapter
	 */
	private static EList<DescriptionUnit> getAllDescriptionUnitsContainedInChapter(IntentChapter chapter) {
		EList<DescriptionUnit> containedDescriptionUnits = new BasicEList<DescriptionUnit>();

		containedDescriptionUnits.addAll(chapter.getDescriptionUnits());
		for (IntentSection section : chapter.getSubSections()) {
			containedDescriptionUnits.addAll(getAllDescriptionUnitsContainedInSection(section));
		}
		return containedDescriptionUnits;
	}

	/**
	 * Returns all the Description units contained (directly or via its sub-section) in the given Section.
	 * 
	 * @param section
	 *            the Section to inspect
	 * @return a list containing all the Description units contained in the given Section
	 */
	private static EList<DescriptionUnit> getAllDescriptionUnitsContainedInSection(IntentSection section) {
		EList<DescriptionUnit> containedDescriptionUnits = new BasicEList<DescriptionUnit>();

		// We first add the Description units directly contained in this section
		for (GenericUnit unit : section.getUnits()) {
			if (unit instanceof DescriptionUnit) {
				containedDescriptionUnits.add((DescriptionUnit)unit);
			}
		}

		// Then we inspect its subsection (if any)
		for (IntentSection subSection : section.getSubSections()) {
			containedDescriptionUnits.addAll(getAllDescriptionUnitsContainedInSection(subSection));
		}

		return containedDescriptionUnits;

	}
}
