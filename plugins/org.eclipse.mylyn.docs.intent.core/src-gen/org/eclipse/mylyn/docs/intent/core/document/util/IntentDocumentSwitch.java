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
package org.eclipse.mylyn.docs.intent.core.document.util;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mylyn.docs.intent.core.document.IntentChapter;
import org.eclipse.mylyn.docs.intent.core.document.IntentDocument;
import org.eclipse.mylyn.docs.intent.core.document.IntentDocumentPackage;
import org.eclipse.mylyn.docs.intent.core.document.IntentGenericElement;
import org.eclipse.mylyn.docs.intent.core.document.IntentHeaderDeclaration;
import org.eclipse.mylyn.docs.intent.core.document.IntentReference;
import org.eclipse.mylyn.docs.intent.core.document.IntentSection;
import org.eclipse.mylyn.docs.intent.core.document.IntentSectionOrParagraphReference;
import org.eclipse.mylyn.docs.intent.core.document.IntentSectionReference;
import org.eclipse.mylyn.docs.intent.core.document.IntentStructuredElement;
import org.eclipse.mylyn.docs.intent.core.document.IntentSubSectionContainer;
import org.eclipse.mylyn.docs.intent.markup.markup.Container;
import org.eclipse.mylyn.docs.intent.markup.markup.HasAttributes;
import org.eclipse.mylyn.docs.intent.markup.markup.Section;
import org.eclipse.mylyn.docs.intent.markup.markup.StructureElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.mylyn.docs.intent.core.document.IntentDocumentPackage
 * @generated
 */
public class IntentDocumentSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IntentDocumentPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntentDocumentSwitch() {
		if (modelPackage == null) {
			modelPackage = IntentDocumentPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		} else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return eSuperTypes.isEmpty() ? defaultCase(theEObject) : doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case IntentDocumentPackage.INTENT_GENERIC_ELEMENT: {
				IntentGenericElement intentGenericElement = (IntentGenericElement)theEObject;
				T result = caseIntentGenericElement(intentGenericElement);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case IntentDocumentPackage.INTENT_STRUCTURED_ELEMENT: {
				IntentStructuredElement intentStructuredElement = (IntentStructuredElement)theEObject;
				T result = caseIntentStructuredElement(intentStructuredElement);
				if (result == null)
					result = caseSection(intentStructuredElement);
				if (result == null)
					result = caseIntentGenericElement(intentStructuredElement);
				if (result == null)
					result = caseStructureElement(intentStructuredElement);
				if (result == null)
					result = caseContainer(intentStructuredElement);
				if (result == null)
					result = caseHasAttributes(intentStructuredElement);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case IntentDocumentPackage.ANNOTATION_MAPPING: {
				@SuppressWarnings("unchecked")
				Map.Entry<String, Object> annotationMapping = (Map.Entry<String, Object>)theEObject;
				T result = caseAnnotationMapping(annotationMapping);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case IntentDocumentPackage.INTENT_REFERENCE: {
				IntentReference intentReference = (IntentReference)theEObject;
				T result = caseIntentReference(intentReference);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case IntentDocumentPackage.INTENT_SECTION_REFERENCE: {
				IntentSectionReference intentSectionReference = (IntentSectionReference)theEObject;
				T result = caseIntentSectionReference(intentSectionReference);
				if (result == null)
					result = caseIntentReference(intentSectionReference);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case IntentDocumentPackage.INTENT_SECTION_OR_PARAGRAPH_REFERENCE: {
				IntentSectionOrParagraphReference intentSectionOrParagraphReference = (IntentSectionOrParagraphReference)theEObject;
				T result = caseIntentSectionOrParagraphReference(intentSectionOrParagraphReference);
				if (result == null)
					result = caseIntentReference(intentSectionOrParagraphReference);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case IntentDocumentPackage.INTENT_DOCUMENT: {
				IntentDocument intentDocument = (IntentDocument)theEObject;
				T result = caseIntentDocument(intentDocument);
				if (result == null)
					result = caseIntentStructuredElement(intentDocument);
				if (result == null)
					result = caseSection(intentDocument);
				if (result == null)
					result = caseIntentGenericElement(intentDocument);
				if (result == null)
					result = caseStructureElement(intentDocument);
				if (result == null)
					result = caseContainer(intentDocument);
				if (result == null)
					result = caseHasAttributes(intentDocument);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case IntentDocumentPackage.INTENT_SUB_SECTION_CONTAINER: {
				IntentSubSectionContainer intentSubSectionContainer = (IntentSubSectionContainer)theEObject;
				T result = caseIntentSubSectionContainer(intentSubSectionContainer);
				if (result == null)
					result = caseIntentStructuredElement(intentSubSectionContainer);
				if (result == null)
					result = caseSection(intentSubSectionContainer);
				if (result == null)
					result = caseIntentGenericElement(intentSubSectionContainer);
				if (result == null)
					result = caseStructureElement(intentSubSectionContainer);
				if (result == null)
					result = caseContainer(intentSubSectionContainer);
				if (result == null)
					result = caseHasAttributes(intentSubSectionContainer);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case IntentDocumentPackage.INTENT_CHAPTER: {
				IntentChapter intentChapter = (IntentChapter)theEObject;
				T result = caseIntentChapter(intentChapter);
				if (result == null)
					result = caseIntentSubSectionContainer(intentChapter);
				if (result == null)
					result = caseIntentStructuredElement(intentChapter);
				if (result == null)
					result = caseSection(intentChapter);
				if (result == null)
					result = caseIntentGenericElement(intentChapter);
				if (result == null)
					result = caseStructureElement(intentChapter);
				if (result == null)
					result = caseContainer(intentChapter);
				if (result == null)
					result = caseHasAttributes(intentChapter);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case IntentDocumentPackage.INTENT_SECTION: {
				IntentSection intentSection = (IntentSection)theEObject;
				T result = caseIntentSection(intentSection);
				if (result == null)
					result = caseIntentSubSectionContainer(intentSection);
				if (result == null)
					result = caseIntentStructuredElement(intentSection);
				if (result == null)
					result = caseSection(intentSection);
				if (result == null)
					result = caseIntentGenericElement(intentSection);
				if (result == null)
					result = caseStructureElement(intentSection);
				if (result == null)
					result = caseContainer(intentSection);
				if (result == null)
					result = caseHasAttributes(intentSection);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case IntentDocumentPackage.INTENT_HEADER_DECLARATION: {
				IntentHeaderDeclaration intentHeaderDeclaration = (IntentHeaderDeclaration)theEObject;
				T result = caseIntentHeaderDeclaration(intentHeaderDeclaration);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			default:
				return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Intent Generic Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intent Generic Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntentGenericElement(IntentGenericElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationMapping(Map.Entry<String, Object> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Intent Structured Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intent Structured Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntentStructuredElement(IntentStructuredElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Intent Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intent Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntentReference(IntentReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Intent Section Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intent Section Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntentSectionReference(IntentSectionReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Intent Section Or Paragraph Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intent Section Or Paragraph Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntentSectionOrParagraphReference(IntentSectionOrParagraphReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Intent Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intent Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntentDocument(IntentDocument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Intent Sub Section Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intent Sub Section Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntentSubSectionContainer(IntentSubSectionContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Intent Chapter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intent Chapter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntentChapter(IntentChapter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Intent Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intent Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntentSection(IntentSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Intent Header Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intent Header Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntentHeaderDeclaration(IntentHeaderDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructureElement(StructureElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainer(Container object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Has Attributes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Has Attributes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHasAttributes(HasAttributes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSection(Section object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //IntentDocumentSwitch
