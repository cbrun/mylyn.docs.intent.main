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
 * Sets the "href" and "referencedElement" values on LabelinModelingUnit.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public final class LabelinModelingUnitLinker {

	/**
	 * LabelinModelingUnitLinker constructor.
	 */
	private LabelinModelingUnitLinker() {

	}

	/**
	 * Sets the "href" and "referencedElement" values on the given LabelinModelingUnit.
	 * 
	 * @param labelinModelingUnit
	 *            The LabelinModelingUnit on witch attach target.
	 * @throws ParseException
	 *             if the annotation can't be attached to any element.
	 */
	public static void attachLabelinModelingUnit(LabelinModelingUnit labelinModelingUnit)
			throws ParseException {

		// Step 1 : we get the container of this LabelinModelingUnit
		EObject annotationContainer = labelinModelingUnit.eContainer();
		int indexOfLabelinModelingUnit = annotationContainer.eContents().indexOf(labelinModelingUnit);
		EObject targetForAnnotation = null;
		String literalFormOfTarget = "";
		// Step 2 : for each following element in this container
		if (indexOfLabelinModelingUnit < annotationContainer.eContents().size() - 1) {
			for (Iterator<EObject> iterator = annotationContainer.eContents().listIterator(
					indexOfLabelinModelingUnit); iterator.hasNext();) {
				EObject nextElement = iterator.next();
				// we determine if this element is a potentiel candidate
				if (isTargetforLabelinModelingUnit(nextElement)) {
					targetForAnnotation = nextElement;
					literalFormOfTarget = nextElement.toString();
					break;
				}
			}
		}

		// Step 3 : if no target has been found, we throw a parse Exception
		if (targetForAnnotation == null) {
			String errorMessage = "Can't attach the LabelDeclaration " + labelinModelingUnit.getLabelValue()
					+ " (value : " + labelinModelingUnit.getTextToPrint() + " ) to any element.";
			throw new ParseException(errorMessage);
		}

		// Step 4 : hre we can attach the given Annotation to its target
		labelinModelingUnit.setIntentHref(literalFormOfTarget);
		labelinModelingUnit.setReferencedElement((ModelingUnitInstruction)targetForAnnotation);
	}

	/**
	 * Returns true if the given EObject can be a target for an LabelinModelingUnit.
	 * 
	 * @param candidate
	 *            EObject to determine if it can be a target for an LabelinModelingUnit.
	 * @return true if the given EObject can be a target for an LabelinModelingUnit, false otherwise
	 */
	private static boolean isTargetforLabelinModelingUnit(EObject candidate) {
		boolean isCandidateTargetforLabelinModelingUnit = candidate instanceof ModelingUnitInstruction;
		isCandidateTargetforLabelinModelingUnit = isCandidateTargetforLabelinModelingUnit
				&& !(candidate instanceof LabelinModelingUnit);
		isCandidateTargetforLabelinModelingUnit = isCandidateTargetforLabelinModelingUnit
				&& !(candidate instanceof IntentSectionReferenceinModelingUnit);
		isCandidateTargetforLabelinModelingUnit = isCandidateTargetforLabelinModelingUnit
				&& !(candidate instanceof AnnotationDeclaration);
		return isCandidateTargetforLabelinModelingUnit;
	}
}
