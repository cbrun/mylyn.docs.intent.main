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
package org.eclipse.mylyn.docs.intent.core.genericunit.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mylyn.docs.intent.core.document.IntentGenericElement;
import org.eclipse.mylyn.docs.intent.core.document.IntentReference;
import org.eclipse.mylyn.docs.intent.core.genericunit.AdressedAnnotation;
import org.eclipse.mylyn.docs.intent.core.genericunit.GenericUnit;
import org.eclipse.mylyn.docs.intent.core.genericunit.GenericUnitPackage;
import org.eclipse.mylyn.docs.intent.core.genericunit.IntentSectionReferenceInstruction;
import org.eclipse.mylyn.docs.intent.core.genericunit.LabelDeclaration;
import org.eclipse.mylyn.docs.intent.core.genericunit.LabelDeclarationReference;
import org.eclipse.mylyn.docs.intent.core.genericunit.LabelReferenceInstruction;
import org.eclipse.mylyn.docs.intent.core.genericunit.UnitInstruction;
import org.eclipse.mylyn.docs.intent.core.genericunit.UnitInstructionReference;

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
 * @see org.eclipse.mylyn.docs.intent.core.genericunit.GenericUnitPackage
 * @generated
 */
public class GenericUnitSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GenericUnitPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericUnitSwitch() {
		if (modelPackage == null) {
			modelPackage = GenericUnitPackage.eINSTANCE;
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
			case GenericUnitPackage.GENERIC_UNIT: {
				GenericUnit genericUnit = (GenericUnit)theEObject;
				T result = caseGenericUnit(genericUnit);
				if (result == null)
					result = caseIntentGenericElement(genericUnit);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case GenericUnitPackage.UNIT_INSTRUCTION: {
				UnitInstruction unitInstruction = (UnitInstruction)theEObject;
				T result = caseUnitInstruction(unitInstruction);
				if (result == null)
					result = caseIntentGenericElement(unitInstruction);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case GenericUnitPackage.UNIT_INSTRUCTION_REFERENCE: {
				UnitInstructionReference unitInstructionReference = (UnitInstructionReference)theEObject;
				T result = caseUnitInstructionReference(unitInstructionReference);
				if (result == null)
					result = caseIntentReference(unitInstructionReference);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case GenericUnitPackage.LABEL_DECLARATION_REFERENCE: {
				LabelDeclarationReference labelDeclarationReference = (LabelDeclarationReference)theEObject;
				T result = caseLabelDeclarationReference(labelDeclarationReference);
				if (result == null)
					result = caseIntentReference(labelDeclarationReference);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case GenericUnitPackage.INTENT_SECTION_REFERENCE_INSTRUCTION: {
				IntentSectionReferenceInstruction intentSectionReferenceInstruction = (IntentSectionReferenceInstruction)theEObject;
				T result = caseIntentSectionReferenceInstruction(intentSectionReferenceInstruction);
				if (result == null)
					result = caseUnitInstruction(intentSectionReferenceInstruction);
				if (result == null)
					result = caseIntentGenericElement(intentSectionReferenceInstruction);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case GenericUnitPackage.LABEL_DECLARATION: {
				LabelDeclaration labelDeclaration = (LabelDeclaration)theEObject;
				T result = caseLabelDeclaration(labelDeclaration);
				if (result == null)
					result = caseUnitInstruction(labelDeclaration);
				if (result == null)
					result = caseIntentGenericElement(labelDeclaration);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case GenericUnitPackage.LABEL_REFERENCE_INSTRUCTION: {
				LabelReferenceInstruction labelReferenceInstruction = (LabelReferenceInstruction)theEObject;
				T result = caseLabelReferenceInstruction(labelReferenceInstruction);
				if (result == null)
					result = caseUnitInstruction(labelReferenceInstruction);
				if (result == null)
					result = caseIntentGenericElement(labelReferenceInstruction);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case GenericUnitPackage.ADRESSED_ANNOTATION: {
				AdressedAnnotation adressedAnnotation = (AdressedAnnotation)theEObject;
				T result = caseAdressedAnnotation(adressedAnnotation);
				if (result == null)
					result = caseUnitInstruction(adressedAnnotation);
				if (result == null)
					result = caseIntentGenericElement(adressedAnnotation);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			default:
				return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generic Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generic Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenericUnit(GenericUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unit Instruction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unit Instruction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnitInstruction(UnitInstruction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unit Instruction Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unit Instruction Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnitInstructionReference(UnitInstructionReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label Declaration Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label Declaration Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabelDeclarationReference(LabelDeclarationReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Intent Section Reference Instruction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intent Section Reference Instruction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntentSectionReferenceInstruction(IntentSectionReferenceInstruction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabelDeclaration(LabelDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label Reference Instruction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label Reference Instruction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabelReferenceInstruction(LabelReferenceInstruction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Adressed Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adressed Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdressedAnnotation(AdressedAnnotation object) {
		return null;
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

} //GenericUnitSwitch
