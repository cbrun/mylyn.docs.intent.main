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
import java.util.Map.Entry;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.mylyn.docs.intent.core.modelingunit.AnnotationDeclaration;
import org.eclipse.mylyn.docs.intent.core.modelingunit.IntentSectionReferenceinModelingUnit;
import org.eclipse.mylyn.docs.intent.core.modelingunit.LabelinModelingUnit;
import org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnitInstruction;
import org.eclipse.mylyn.docs.intent.parser.modelingunit.ParseException;

/**
 * Sets the "href" and "referencedElement" values on AnnotationDeclarations.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public final class AnnotationDeclarationLinker {

	/**
	 * AnnotationDeclarationLinker constructor.
	 */
	private AnnotationDeclarationLinker() {

	}

	/**
	 * Sets the "href" and "referencedElement" values on the given AnnotationDeclaration.
	 * 
	 * @param annotationDeclaration
	 *            The annotationDeclaration on witch attach target.
	 * @throws ParseException
	 *             if the annotation can't be attached to any element.
	 */
	public static void attachAnnotationDeclaration(AnnotationDeclaration annotationDeclaration)
			throws ParseException {

		// Step 1 : we get the container of this AnnotationDeclaration
		EObject annotationContainer = annotationDeclaration.eContainer();
		int indexOfAnnotationDeclaration = annotationContainer.eContents().indexOf(annotationDeclaration);
		EObject targetForAnnotation = null;
		String literalFormOfTarget = "";
		// Step 2 : for each following element in this container
		if (indexOfAnnotationDeclaration < annotationContainer.eContents().size() - 1) {
			for (Iterator<EObject> iterator = annotationContainer.eContents().listIterator(
					indexOfAnnotationDeclaration); iterator.hasNext();) {
				EObject nextElement = iterator.next();
				// we determine if this element is a potentiel candidate
				if (isTargetforAnnotationDeclaration(nextElement)) {
					targetForAnnotation = nextElement;
					literalFormOfTarget = nextElement.toString();
					break;
				}
			}
		}

		// Step 3 : if no target has been found, we throw a parse Exception
		if (targetForAnnotation == null) {
			String errorMessage = "Can't attach the Annotation of type "
					+ annotationDeclaration.getAnnotationID() + " (values : ";
			for (Entry<String, String> keyVal : annotationDeclaration.getMap()) {
				errorMessage += keyVal.getKey() + "=" + keyVal.getValue() + " ";
			}
			errorMessage += ") to any element.";
			throw new ParseException(errorMessage);
		}

		// Step 4 : hre we can attach the given Annotation to its target
		annotationDeclaration.setIntentHref(literalFormOfTarget);
		annotationDeclaration.setReferencedElement((ModelingUnitInstruction)targetForAnnotation);
	}

	/**
	 * Returns true if the given EObject can be a target for an AnnotationDeclaration.
	 * 
	 * @param candidate
	 *            EObject to determine if it can be a target for an AnnotationDeclaration.
	 * @return true if the given EObject can be a target for an AnnotationDeclaration, false otherwise
	 */
	private static boolean isTargetforAnnotationDeclaration(EObject candidate) {
		boolean isCandidateTargetforAnnotationDeclaration = candidate instanceof ModelingUnitInstruction;
		isCandidateTargetforAnnotationDeclaration = isCandidateTargetforAnnotationDeclaration
				&& !(candidate instanceof LabelinModelingUnit);
		isCandidateTargetforAnnotationDeclaration = isCandidateTargetforAnnotationDeclaration
				&& !(candidate instanceof IntentSectionReferenceinModelingUnit);
		isCandidateTargetforAnnotationDeclaration = isCandidateTargetforAnnotationDeclaration
				&& !(candidate instanceof AnnotationDeclaration);
		return isCandidateTargetforAnnotationDeclaration;
	}
}
