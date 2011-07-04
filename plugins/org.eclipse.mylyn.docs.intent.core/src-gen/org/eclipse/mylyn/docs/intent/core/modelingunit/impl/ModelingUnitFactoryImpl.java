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
package org.eclipse.mylyn.docs.intent.core.modelingunit.impl;

import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.mylyn.docs.intent.core.modelingunit.AffectationOperator;
import org.eclipse.mylyn.docs.intent.core.modelingunit.AnnotationDeclaration;
import org.eclipse.mylyn.docs.intent.core.modelingunit.ContributionInstruction;
import org.eclipse.mylyn.docs.intent.core.modelingunit.InstanciationInstruction;
import org.eclipse.mylyn.docs.intent.core.modelingunit.InstanciationInstructionReference;
import org.eclipse.mylyn.docs.intent.core.modelingunit.IntentSectionReferenceinModelingUnit;
import org.eclipse.mylyn.docs.intent.core.modelingunit.LabelinModelingUnit;
import org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnit;
import org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnitFactory;
import org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnitInstructionReference;
import org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnitPackage;
import org.eclipse.mylyn.docs.intent.core.modelingunit.NativeValueForStructuralFeature;
import org.eclipse.mylyn.docs.intent.core.modelingunit.NewObjectValueForStructuralFeature;
import org.eclipse.mylyn.docs.intent.core.modelingunit.ReferenceValueForStructuralFeature;
import org.eclipse.mylyn.docs.intent.core.modelingunit.ResourceDeclaration;
import org.eclipse.mylyn.docs.intent.core.modelingunit.ResourceReference;
import org.eclipse.mylyn.docs.intent.core.modelingunit.StructuralFeatureAffectation;
import org.eclipse.mylyn.docs.intent.core.modelingunit.TypeReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelingUnitFactoryImpl extends EFactoryImpl implements ModelingUnitFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModelingUnitFactory init() {
		try {
			ModelingUnitFactory theModelingUnitFactory = (ModelingUnitFactory)EPackage.Registry.INSTANCE
					.getEFactory("http://www.eclipse.org/intent/modelingunit/0.7");
			if (theModelingUnitFactory != null) {
				return theModelingUnitFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ModelingUnitFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelingUnitFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ModelingUnitPackage.KEY_VAL_FOR_ANNOTATION:
				return (EObject)createKeyValForAnnotation();
			case ModelingUnitPackage.MODELING_UNIT:
				return (EObject)createModelingUnit();
			case ModelingUnitPackage.RESOURCE_REFERENCE:
				return (EObject)createResourceReference();
			case ModelingUnitPackage.MODELING_UNIT_INSTRUCTION_REFERENCE:
				return (EObject)createModelingUnitInstructionReference();
			case ModelingUnitPackage.INSTANCIATION_INSTRUCTION_REFERENCE:
				return (EObject)createInstanciationInstructionReference();
			case ModelingUnitPackage.RESOURCE_DECLARATION:
				return (EObject)createResourceDeclaration();
			case ModelingUnitPackage.INTENT_SECTION_REFERENCEIN_MODELING_UNIT:
				return (EObject)createIntentSectionReferenceinModelingUnit();
			case ModelingUnitPackage.LABELIN_MODELING_UNIT:
				return (EObject)createLabelinModelingUnit();
			case ModelingUnitPackage.ANNOTATION_DECLARATION:
				return (EObject)createAnnotationDeclaration();
			case ModelingUnitPackage.TYPE_REFERENCE:
				return (EObject)createTypeReference();
			case ModelingUnitPackage.INSTANCIATION_INSTRUCTION:
				return (EObject)createInstanciationInstruction();
			case ModelingUnitPackage.STRUCTURAL_FEATURE_AFFECTATION:
				return (EObject)createStructuralFeatureAffectation();
			case ModelingUnitPackage.NATIVE_VALUE_FOR_STRUCTURAL_FEATURE:
				return (EObject)createNativeValueForStructuralFeature();
			case ModelingUnitPackage.NEW_OBJECT_VALUE_FOR_STRUCTURAL_FEATURE:
				return (EObject)createNewObjectValueForStructuralFeature();
			case ModelingUnitPackage.REFERENCE_VALUE_FOR_STRUCTURAL_FEATURE:
				return (EObject)createReferenceValueForStructuralFeature();
			case ModelingUnitPackage.CONTRIBUTION_INSTRUCTION:
				return (EObject)createContributionInstruction();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName()
						+ "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ModelingUnitPackage.AFFECTATION_OPERATOR:
				return createAffectationOperatorFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName()
						+ "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ModelingUnitPackage.AFFECTATION_OPERATOR:
				return convertAffectationOperatorToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName()
						+ "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, String> createKeyValForAnnotation() {
		KeyValForAnnotationImpl keyValForAnnotation = new KeyValForAnnotationImpl();
		return keyValForAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelingUnit createModelingUnit() {
		ModelingUnitImpl modelingUnit = new ModelingUnitImpl();
		return modelingUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceReference createResourceReference() {
		ResourceReferenceImpl resourceReference = new ResourceReferenceImpl();
		return resourceReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelingUnitInstructionReference createModelingUnitInstructionReference() {
		ModelingUnitInstructionReferenceImpl modelingUnitInstructionReference = new ModelingUnitInstructionReferenceImpl();
		return modelingUnitInstructionReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanciationInstructionReference createInstanciationInstructionReference() {
		InstanciationInstructionReferenceImpl instanciationInstructionReference = new InstanciationInstructionReferenceImpl();
		return instanciationInstructionReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceDeclaration createResourceDeclaration() {
		ResourceDeclarationImpl resourceDeclaration = new ResourceDeclarationImpl();
		return resourceDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntentSectionReferenceinModelingUnit createIntentSectionReferenceinModelingUnit() {
		IntentSectionReferenceinModelingUnitImpl intentSectionReferenceinModelingUnit = new IntentSectionReferenceinModelingUnitImpl();
		return intentSectionReferenceinModelingUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelinModelingUnit createLabelinModelingUnit() {
		LabelinModelingUnitImpl labelinModelingUnit = new LabelinModelingUnitImpl();
		return labelinModelingUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationDeclaration createAnnotationDeclaration() {
		AnnotationDeclarationImpl annotationDeclaration = new AnnotationDeclarationImpl();
		return annotationDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeReference createTypeReference() {
		TypeReferenceImpl typeReference = new TypeReferenceImpl();
		return typeReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanciationInstruction createInstanciationInstruction() {
		InstanciationInstructionImpl instanciationInstruction = new InstanciationInstructionImpl();
		return instanciationInstruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuralFeatureAffectation createStructuralFeatureAffectation() {
		StructuralFeatureAffectationImpl structuralFeatureAffectation = new StructuralFeatureAffectationImpl();
		return structuralFeatureAffectation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NativeValueForStructuralFeature createNativeValueForStructuralFeature() {
		NativeValueForStructuralFeatureImpl nativeValueForStructuralFeature = new NativeValueForStructuralFeatureImpl();
		return nativeValueForStructuralFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewObjectValueForStructuralFeature createNewObjectValueForStructuralFeature() {
		NewObjectValueForStructuralFeatureImpl newObjectValueForStructuralFeature = new NewObjectValueForStructuralFeatureImpl();
		return newObjectValueForStructuralFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceValueForStructuralFeature createReferenceValueForStructuralFeature() {
		ReferenceValueForStructuralFeatureImpl referenceValueForStructuralFeature = new ReferenceValueForStructuralFeatureImpl();
		return referenceValueForStructuralFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContributionInstruction createContributionInstruction() {
		ContributionInstructionImpl contributionInstruction = new ContributionInstructionImpl();
		return contributionInstruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AffectationOperator createAffectationOperatorFromString(EDataType eDataType, String initialValue) {
		AffectationOperator result = AffectationOperator.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue
					+ "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAffectationOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelingUnitPackage getModelingUnitPackage() {
		return (ModelingUnitPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ModelingUnitPackage getPackage() {
		return ModelingUnitPackage.eINSTANCE;
	}

} //ModelingUnitFactoryImpl
