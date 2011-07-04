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
package org.eclipse.mylyn.docs.intent.parser.modelingunit.parser.linker;

import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.mylyn.docs.intent.core.modelingunit.AnnotationDeclaration;
import org.eclipse.mylyn.docs.intent.core.modelingunit.IntentSectionReferenceinModelingUnit;
import org.eclipse.mylyn.docs.intent.core.modelingunit.LabelinModelingUnit;
import org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnitInstruction;
import org.eclipse.mylyn.docs.intent.parser.modelingunit.ParseException;

/**
 * Sets the "href" and "referencedElement" values on SectioninModelingUnit.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public final class SectionReferenceinModelingUnitLinker {

	/**
	 * SectioninModelingUnitLinker constructor.
	 */
	private SectionReferenceinModelingUnitLinker() {

	}

	/**
	 * Sets the "href" and "referencedElement" values on the given SectionReferenceinModelingUnit.
	 * 
	 * @param sectioninModelingUnit
	 *            The SectioninModelingUnit on witch attach target.
	 * @throws ParseException
	 *             if the annotation can't be attached to any element.
	 */
	public static void attachSectioninModelingUnit(IntentSectionReferenceinModelingUnit sectioninModelingUnit)
			throws ParseException {

		// Step 1 : we get the container of this SectioninModelingUnit
		EObject annotationContainer = sectioninModelingUnit.eContainer();
		int indexOfSectioninModelingUnit = annotationContainer.eContents().indexOf(sectioninModelingUnit);
		EObject targetForAnnotation = null;
		String literalFormOfTarget = "";
		// Step 2 : for each following element in this container
		if (indexOfSectioninModelingUnit < annotationContainer.eContents().size() - 1) {
			for (Iterator<EObject> iterator = annotationContainer.eContents().listIterator(
					indexOfSectioninModelingUnit); iterator.hasNext();) {
				EObject nextElement = iterator.next();
				// we determine if this element is a potentiel candidate
				if (isTargetforSectioninModelingUnit(nextElement)) {
					targetForAnnotation = nextElement;
					literalFormOfTarget = nextElement.toString();
					break;
				}
			}
		}

		// Step 3 : if no target has been found, we throw a parse Exception
		if (targetForAnnotation == null) {
			String errorMessage = "Can't attach the SectionRefrence @see "
					+ sectioninModelingUnit.getReferencedObject().getIntentHref();
			if (sectioninModelingUnit.getTextToPrint() != null) {
				errorMessage += " (value : "

				+ sectioninModelingUnit.getTextToPrint();
			}
			errorMessage += " ) to any element.";
			throw new ParseException(errorMessage);
		}

		// Step 4 : hre we can attach the given Annotation to its target
		sectioninModelingUnit.setIntentHref(literalFormOfTarget);
		sectioninModelingUnit.setReferencedElement((ModelingUnitInstruction)targetForAnnotation);
	}

	/**
	 * Returns true if the given EObject can be a target for an SectioninModelingUnit.
	 * 
	 * @param candidate
	 *            EObject to determine if it can be a target for an SectioninModelingUnit.
	 * @return true if the given EObject can be a target for an SectioninModelingUnit, false otherwise
	 */
	private static boolean isTargetforSectioninModelingUnit(EObject candidate) {
		boolean isCandidateTargetforSectioninModelingUnit = candidate instanceof ModelingUnitInstruction;
		isCandidateTargetforSectioninModelingUnit = isCandidateTargetforSectioninModelingUnit
				&& !(candidate instanceof LabelinModelingUnit);
		isCandidateTargetforSectioninModelingUnit = isCandidateTargetforSectioninModelingUnit
				&& !(candidate instanceof IntentSectionReferenceinModelingUnit);
		isCandidateTargetforSectioninModelingUnit = isCandidateTargetforSectioninModelingUnit
				&& !(candidate instanceof AnnotationDeclaration);
		return isCandidateTargetforSectioninModelingUnit;
	}
}
