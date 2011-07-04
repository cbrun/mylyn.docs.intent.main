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
package org.eclipse.mylyn.docs.intent.core.modelingunit.util;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mylyn.docs.intent.core.document.IntentGenericElement;
import org.eclipse.mylyn.docs.intent.core.document.IntentReference;
import org.eclipse.mylyn.docs.intent.core.genericunit.GenericUnit;
import org.eclipse.mylyn.docs.intent.core.genericunit.IntentSectionReferenceInstruction;
import org.eclipse.mylyn.docs.intent.core.genericunit.LabelDeclaration;
import org.eclipse.mylyn.docs.intent.core.genericunit.UnitInstruction;
import org.eclipse.mylyn.docs.intent.core.modelingunit.AnnotationDeclaration;
import org.eclipse.mylyn.docs.intent.core.modelingunit.ContributionInstruction;
import org.eclipse.mylyn.docs.intent.core.modelingunit.InstanceLevelInstruction;
import org.eclipse.mylyn.docs.intent.core.modelingunit.InstanciationInstruction;
import org.eclipse.mylyn.docs.intent.core.modelingunit.InstanciationInstructionReference;
import org.eclipse.mylyn.docs.intent.core.modelingunit.IntentSectionReferenceinModelingUnit;
import org.eclipse.mylyn.docs.intent.core.modelingunit.LabelinModelingUnit;
import org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnit;
import org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnitInstruction;
import org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnitInstructionReference;
import org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnitPackage;
import org.eclipse.mylyn.docs.intent.core.modelingunit.NativeValueForStructuralFeature;
import org.eclipse.mylyn.docs.intent.core.modelingunit.NewObjectValueForStructuralFeature;
import org.eclipse.mylyn.docs.intent.core.modelingunit.ReferenceValueForStructuralFeature;
import org.eclipse.mylyn.docs.intent.core.modelingunit.ResourceDeclaration;
import org.eclipse.mylyn.docs.intent.core.modelingunit.ResourceReference;
import org.eclipse.mylyn.docs.intent.core.modelingunit.StructuralFeatureAffectation;
import org.eclipse.mylyn.docs.intent.core.modelingunit.TypeReference;
import org.eclipse.mylyn.docs.intent.core.modelingunit.ValueForStructuralFeature;

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
 * @see org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnitPackage
 * @generated
 */
public class ModelingUnitSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModelingUnitPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelingUnitSwitch() {
		if (modelPackage == null) {
			modelPackage = ModelingUnitPackage.eINSTANCE;
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
			case ModelingUnitPackage.KEY_VAL_FOR_ANNOTATION: {
				@SuppressWarnings("unchecked")
				Map.Entry<String, String> keyValForAnnotation = (Map.Entry<String, String>)theEObject;
				T result = caseKeyValForAnnotation(keyValForAnnotation);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case ModelingUnitPackage.MODELING_UNIT: {
				ModelingUnit modelingUnit = (ModelingUnit)theEObject;
				T result = caseModelingUnit(modelingUnit);
				if (result == null)
					result = caseGenericUnit(modelingUnit);
				if (result == null)
					result = caseIntentGenericElement(modelingUnit);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case ModelingUnitPackage.MODELING_UNIT_INSTRUCTION: {
				ModelingUnitInstruction modelingUnitInstruction = (ModelingUnitInstruction)theEObject;
				T result = caseModelingUnitInstruction(modelingUnitInstruction);
				if (result == null)
					result = caseUnitInstruction(modelingUnitInstruction);
				if (result == null)
					result = caseIntentGenericElement(modelingUnitInstruction);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case ModelingUnitPackage.RESOURCE_REFERENCE: {
				ResourceReference resourceReference = (ResourceReference)theEObject;
				T result = caseResourceReference(resourceReference);
				if (result == null)
					result = caseIntentReference(resourceReference);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case ModelingUnitPackage.MODELING_UNIT_INSTRUCTION_REFERENCE: {
				ModelingUnitInstructionReference modelingUnitInstructionReference = (ModelingUnitInstructionReference)theEObject;
				T result = caseModelingUnitInstructionReference(modelingUnitInstructionReference);
				if (result == null)
					result = caseIntentReference(modelingUnitInstructionReference);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case ModelingUnitPackage.INSTANCIATION_INSTRUCTION_REFERENCE: {
				InstanciationInstructionReference instanciationInstructionReference = (InstanciationInstructionReference)theEObject;
				T result = caseInstanciationInstructionReference(instanciationInstructionReference);
				if (result == null)
					result = caseIntentReference(instanciationInstructionReference);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case ModelingUnitPackage.RESOURCE_DECLARATION: {
				ResourceDeclaration resourceDeclaration = (ResourceDeclaration)theEObject;
				T result = caseResourceDeclaration(resourceDeclaration);
				if (result == null)
					result = caseModelingUnitInstruction(resourceDeclaration);
				if (result == null)
					result = caseUnitInstruction(resourceDeclaration);
				if (result == null)
					result = caseIntentGenericElement(resourceDeclaration);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case ModelingUnitPackage.INTENT_SECTION_REFERENCEIN_MODELING_UNIT: {
				IntentSectionReferenceinModelingUnit intentSectionReferenceinModelingUnit = (IntentSectionReferenceinModelingUnit)theEObject;
				T result = caseIntentSectionReferenceinModelingUnit(intentSectionReferenceinModelingUnit);
				if (result == null)
					result = caseIntentSectionReferenceInstruction(intentSectionReferenceinModelingUnit);
				if (result == null)
					result = caseModelingUnitInstruction(intentSectionReferenceinModelingUnit);
				if (result == null)
					result = caseModelingUnitInstructionReference(intentSectionReferenceinModelingUnit);
				if (result == null)
					result = caseUnitInstruction(intentSectionReferenceinModelingUnit);
				if (result == null)
					result = caseIntentReference(intentSectionReferenceinModelingUnit);
				if (result == null)
					result = caseIntentGenericElement(intentSectionReferenceinModelingUnit);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case ModelingUnitPackage.LABELIN_MODELING_UNIT: {
				LabelinModelingUnit labelinModelingUnit = (LabelinModelingUnit)theEObject;
				T result = caseLabelinModelingUnit(labelinModelingUnit);
				if (result == null)
					result = caseLabelDeclaration(labelinModelingUnit);
				if (result == null)
					result = caseModelingUnitInstruction(labelinModelingUnit);
				if (result == null)
					result = caseModelingUnitInstructionReference(labelinModelingUnit);
				if (result == null)
					result = caseUnitInstruction(labelinModelingUnit);
				if (result == null)
					result = caseIntentReference(labelinModelingUnit);
				if (result == null)
					result = caseIntentGenericElement(labelinModelingUnit);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case ModelingUnitPackage.ANNOTATION_DECLARATION: {
				AnnotationDeclaration annotationDeclaration = (AnnotationDeclaration)theEObject;
				T result = caseAnnotationDeclaration(annotationDeclaration);
				if (result == null)
					result = caseModelingUnitInstruction(annotationDeclaration);
				if (result == null)
					result = caseModelingUnitInstructionReference(annotationDeclaration);
				if (result == null)
					result = caseUnitInstruction(annotationDeclaration);
				if (result == null)
					result = caseIntentReference(annotationDeclaration);
				if (result == null)
					result = caseIntentGenericElement(annotationDeclaration);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case ModelingUnitPackage.TYPE_REFERENCE: {
				TypeReference typeReference = (TypeReference)theEObject;
				T result = caseTypeReference(typeReference);
				if (result == null)
					result = caseIntentReference(typeReference);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case ModelingUnitPackage.INSTANCE_LEVEL_INSTRUCTION: {
				InstanceLevelInstruction instanceLevelInstruction = (InstanceLevelInstruction)theEObject;
				T result = caseInstanceLevelInstruction(instanceLevelInstruction);
				if (result == null)
					result = caseModelingUnitInstruction(instanceLevelInstruction);
				if (result == null)
					result = caseUnitInstruction(instanceLevelInstruction);
				if (result == null)
					result = caseIntentGenericElement(instanceLevelInstruction);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case ModelingUnitPackage.INSTANCIATION_INSTRUCTION: {
				InstanciationInstruction instanciationInstruction = (InstanciationInstruction)theEObject;
				T result = caseInstanciationInstruction(instanciationInstruction);
				if (result == null)
					result = caseInstanceLevelInstruction(instanciationInstruction);
				if (result == null)
					result = caseModelingUnitInstruction(instanciationInstruction);
				if (result == null)
					result = caseUnitInstruction(instanciationInstruction);
				if (result == null)
					result = caseIntentGenericElement(instanciationInstruction);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case ModelingUnitPackage.STRUCTURAL_FEATURE_AFFECTATION: {
				StructuralFeatureAffectation structuralFeatureAffectation = (StructuralFeatureAffectation)theEObject;
				T result = caseStructuralFeatureAffectation(structuralFeatureAffectation);
				if (result == null)
					result = caseInstanceLevelInstruction(structuralFeatureAffectation);
				if (result == null)
					result = caseModelingUnitInstruction(structuralFeatureAffectation);
				if (result == null)
					result = caseUnitInstruction(structuralFeatureAffectation);
				if (result == null)
					result = caseIntentGenericElement(structuralFeatureAffectation);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case ModelingUnitPackage.VALUE_FOR_STRUCTURAL_FEATURE: {
				ValueForStructuralFeature valueForStructuralFeature = (ValueForStructuralFeature)theEObject;
				T result = caseValueForStructuralFeature(valueForStructuralFeature);
				if (result == null)
					result = caseModelingUnitInstruction(valueForStructuralFeature);
				if (result == null)
					result = caseUnitInstruction(valueForStructuralFeature);
				if (result == null)
					result = caseIntentGenericElement(valueForStructuralFeature);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case ModelingUnitPackage.NATIVE_VALUE_FOR_STRUCTURAL_FEATURE: {
				NativeValueForStructuralFeature nativeValueForStructuralFeature = (NativeValueForStructuralFeature)theEObject;
				T result = caseNativeValueForStructuralFeature(nativeValueForStructuralFeature);
				if (result == null)
					result = caseValueForStructuralFeature(nativeValueForStructuralFeature);
				if (result == null)
					result = caseModelingUnitInstruction(nativeValueForStructuralFeature);
				if (result == null)
					result = caseUnitInstruction(nativeValueForStructuralFeature);
				if (result == null)
					result = caseIntentGenericElement(nativeValueForStructuralFeature);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case ModelingUnitPackage.NEW_OBJECT_VALUE_FOR_STRUCTURAL_FEATURE: {
				NewObjectValueForStructuralFeature newObjectValueForStructuralFeature = (NewObjectValueForStructuralFeature)theEObject;
				T result = caseNewObjectValueForStructuralFeature(newObjectValueForStructuralFeature);
				if (result == null)
					result = caseValueForStructuralFeature(newObjectValueForStructuralFeature);
				if (result == null)
					result = caseModelingUnitInstruction(newObjectValueForStructuralFeature);
				if (result == null)
					result = caseUnitInstruction(newObjectValueForStructuralFeature);
				if (result == null)
					result = caseIntentGenericElement(newObjectValueForStructuralFeature);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case ModelingUnitPackage.REFERENCE_VALUE_FOR_STRUCTURAL_FEATURE: {
				ReferenceValueForStructuralFeature referenceValueForStructuralFeature = (ReferenceValueForStructuralFeature)theEObject;
				T result = caseReferenceValueForStructuralFeature(referenceValueForStructuralFeature);
				if (result == null)
					result = caseValueForStructuralFeature(referenceValueForStructuralFeature);
				if (result == null)
					result = caseModelingUnitInstruction(referenceValueForStructuralFeature);
				if (result == null)
					result = caseUnitInstruction(referenceValueForStructuralFeature);
				if (result == null)
					result = caseIntentGenericElement(referenceValueForStructuralFeature);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case ModelingUnitPackage.CONTRIBUTION_INSTRUCTION: {
				ContributionInstruction contributionInstruction = (ContributionInstruction)theEObject;
				T result = caseContributionInstruction(contributionInstruction);
				if (result == null)
					result = caseModelingUnitInstruction(contributionInstruction);
				if (result == null)
					result = caseUnitInstruction(contributionInstruction);
				if (result == null)
					result = caseIntentGenericElement(contributionInstruction);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			default:
				return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Key Val For Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Key Val For Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeyValForAnnotation(Map.Entry<String, String> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modeling Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modeling Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelingUnit(ModelingUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instruction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instruction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelingUnitInstruction(ModelingUnitInstruction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceReference(ResourceReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instruction Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instruction Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelingUnitInstructionReference(ModelingUnitInstructionReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instanciation Instruction Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instanciation Instruction Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstanciationInstructionReference(InstanciationInstructionReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceDeclaration(ResourceDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Intent Section Referencein Modeling Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intent Section Referencein Modeling Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntentSectionReferenceinModelingUnit(IntentSectionReferenceinModelingUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Labelin Modeling Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Labelin Modeling Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabelinModelingUnit(LabelinModelingUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationDeclaration(AnnotationDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeReference(TypeReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instance Level Instruction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instance Level Instruction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstanceLevelInstruction(InstanceLevelInstruction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instanciation Instruction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instanciation Instruction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstanciationInstruction(InstanciationInstruction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structural Feature Affectation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structural Feature Affectation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructuralFeatureAffectation(StructuralFeatureAffectation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value For Structural Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value For Structural Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueForStructuralFeature(ValueForStructuralFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Native Value For Structural Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Native Value For Structural Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNativeValueForStructuralFeature(NativeValueForStructuralFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>New Object Value For Structural Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>New Object Value For Structural Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNewObjectValueForStructuralFeature(NewObjectValueForStructuralFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference Value For Structural Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Value For Structural Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceValueForStructuralFeature(ReferenceValueForStructuralFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contribution Instruction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contribution Instruction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContributionInstruction(ContributionInstruction object) {
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

} //ModelingUnitSwitch
