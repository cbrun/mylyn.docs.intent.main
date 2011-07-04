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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.mylyn.docs.intent.core.compiler.CompilerPackage;
import org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilerPackageImpl;
import org.eclipse.mylyn.docs.intent.core.descriptionunit.DescriptionUnitPackage;
import org.eclipse.mylyn.docs.intent.core.descriptionunit.impl.DescriptionUnitPackageImpl;
import org.eclipse.mylyn.docs.intent.core.document.IntentDocumentPackage;
import org.eclipse.mylyn.docs.intent.core.document.impl.IntentDocumentPackageImpl;
import org.eclipse.mylyn.docs.intent.core.genericunit.GenericUnitPackage;
import org.eclipse.mylyn.docs.intent.core.genericunit.impl.GenericUnitPackageImpl;
import org.eclipse.mylyn.docs.intent.core.modelingunit.AffectationOperator;
import org.eclipse.mylyn.docs.intent.core.modelingunit.AnnotationDeclaration;
import org.eclipse.mylyn.docs.intent.core.modelingunit.ContributionInstruction;
import org.eclipse.mylyn.docs.intent.core.modelingunit.InstanceLevelInstruction;
import org.eclipse.mylyn.docs.intent.core.modelingunit.InstanciationInstruction;
import org.eclipse.mylyn.docs.intent.core.modelingunit.InstanciationInstructionReference;
import org.eclipse.mylyn.docs.intent.core.modelingunit.IntentSectionReferenceinModelingUnit;
import org.eclipse.mylyn.docs.intent.core.modelingunit.LabelinModelingUnit;
import org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnit;
import org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnitFactory;
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
import org.eclipse.mylyn.docs.intent.markup.markup.MarkupPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelingUnitPackageImpl extends EPackageImpl implements ModelingUnitPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keyValForAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelingUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelingUnitInstructionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelingUnitInstructionReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanciationInstructionReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intentSectionReferenceinModelingUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelinModelingUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanceLevelInstructionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanciationInstructionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structuralFeatureAffectationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueForStructuralFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nativeValueForStructuralFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass newObjectValueForStructuralFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceValueForStructuralFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contributionInstructionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum affectationOperatorEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnitPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ModelingUnitPackageImpl() {
		super(eNS_URI, ModelingUnitFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ModelingUnitPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ModelingUnitPackage init() {
		if (isInited)
			return (ModelingUnitPackage)EPackage.Registry.INSTANCE.getEPackage(ModelingUnitPackage.eNS_URI);

		// Obtain or create and register package
		ModelingUnitPackageImpl theModelingUnitPackage = (ModelingUnitPackageImpl)(EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof ModelingUnitPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
				: new ModelingUnitPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		MarkupPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		GenericUnitPackageImpl theGenericUnitPackage = (GenericUnitPackageImpl)(EPackage.Registry.INSTANCE
				.getEPackage(GenericUnitPackage.eNS_URI) instanceof GenericUnitPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(GenericUnitPackage.eNS_URI) : GenericUnitPackage.eINSTANCE);
		IntentDocumentPackageImpl theIntentDocumentPackage = (IntentDocumentPackageImpl)(EPackage.Registry.INSTANCE
				.getEPackage(IntentDocumentPackage.eNS_URI) instanceof IntentDocumentPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(IntentDocumentPackage.eNS_URI) : IntentDocumentPackage.eINSTANCE);
		CompilerPackageImpl theCompilerPackage = (CompilerPackageImpl)(EPackage.Registry.INSTANCE
				.getEPackage(CompilerPackage.eNS_URI) instanceof CompilerPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(CompilerPackage.eNS_URI) : CompilerPackage.eINSTANCE);
		DescriptionUnitPackageImpl theDescriptionUnitPackage = (DescriptionUnitPackageImpl)(EPackage.Registry.INSTANCE
				.getEPackage(DescriptionUnitPackage.eNS_URI) instanceof DescriptionUnitPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(DescriptionUnitPackage.eNS_URI) : DescriptionUnitPackage.eINSTANCE);

		// Create package meta-data objects
		theModelingUnitPackage.createPackageContents();
		theGenericUnitPackage.createPackageContents();
		theIntentDocumentPackage.createPackageContents();
		theCompilerPackage.createPackageContents();
		theDescriptionUnitPackage.createPackageContents();

		// Initialize created meta-data
		theModelingUnitPackage.initializePackageContents();
		theGenericUnitPackage.initializePackageContents();
		theIntentDocumentPackage.initializePackageContents();
		theCompilerPackage.initializePackageContents();
		theDescriptionUnitPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theModelingUnitPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ModelingUnitPackage.eNS_URI, theModelingUnitPackage);
		return theModelingUnitPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKeyValForAnnotation() {
		return keyValForAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyValForAnnotation_Key() {
		return (EAttribute)keyValForAnnotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyValForAnnotation_Value() {
		return (EAttribute)keyValForAnnotationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelingUnit() {
		return modelingUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelingUnit_UsedBy() {
		return (EReference)modelingUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelingUnit_SeeAlso() {
		return (EReference)modelingUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelingUnit_Resource() {
		return (EReference)modelingUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelingUnitInstruction() {
		return modelingUnitInstructionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceReference() {
		return resourceReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceReference_ReferencedElement() {
		return (EReference)resourceReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceReference_LineBreak() {
		return (EAttribute)resourceReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelingUnitInstructionReference() {
		return modelingUnitInstructionReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelingUnitInstructionReference_ReferencedElement() {
		return (EReference)modelingUnitInstructionReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstanciationInstructionReference() {
		return instanciationInstructionReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstanciationInstructionReference_ReferencedElement() {
		return (EReference)instanciationInstructionReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceDeclaration() {
		return resourceDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceDeclaration_Uri() {
		return (EAttribute)resourceDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceDeclaration_Name() {
		return (EAttribute)resourceDeclarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceDeclaration_ContentType() {
		return (EAttribute)resourceDeclarationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceDeclaration_Content() {
		return (EReference)resourceDeclarationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntentSectionReferenceinModelingUnit() {
		return intentSectionReferenceinModelingUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLabelinModelingUnit() {
		return labelinModelingUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotationDeclaration() {
		return annotationDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotationDeclaration_AnnotationID() {
		return (EAttribute)annotationDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotationDeclaration_Map() {
		return (EReference)annotationDeclarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeReference() {
		return typeReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstanceLevelInstruction() {
		return instanceLevelInstructionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstanceLevelInstruction_MetaType() {
		return (EReference)instanceLevelInstructionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstanciationInstruction() {
		return instanciationInstructionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstanciationInstruction_Name() {
		return (EAttribute)instanciationInstructionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstanciationInstruction_StructuralFeatures() {
		return (EReference)instanciationInstructionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructuralFeatureAffectation() {
		return structuralFeatureAffectationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStructuralFeatureAffectation_Name() {
		return (EAttribute)structuralFeatureAffectationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStructuralFeatureAffectation_UsedOperator() {
		return (EAttribute)structuralFeatureAffectationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuralFeatureAffectation_Values() {
		return (EReference)structuralFeatureAffectationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueForStructuralFeature() {
		return valueForStructuralFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNativeValueForStructuralFeature() {
		return nativeValueForStructuralFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNativeValueForStructuralFeature_Value() {
		return (EAttribute)nativeValueForStructuralFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNewObjectValueForStructuralFeature() {
		return newObjectValueForStructuralFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNewObjectValueForStructuralFeature_Value() {
		return (EReference)newObjectValueForStructuralFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferenceValueForStructuralFeature() {
		return referenceValueForStructuralFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferenceValueForStructuralFeature_ReferencedElement() {
		return (EReference)referenceValueForStructuralFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContributionInstruction() {
		return contributionInstructionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContributionInstruction_ReferencedElement() {
		return (EReference)contributionInstructionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContributionInstruction_Contributions() {
		return (EReference)contributionInstructionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAffectationOperator() {
		return affectationOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelingUnitFactory getModelingUnitFactory() {
		return (ModelingUnitFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		keyValForAnnotationEClass = createEClass(KEY_VAL_FOR_ANNOTATION);
		createEAttribute(keyValForAnnotationEClass, KEY_VAL_FOR_ANNOTATION__KEY);
		createEAttribute(keyValForAnnotationEClass, KEY_VAL_FOR_ANNOTATION__VALUE);

		modelingUnitEClass = createEClass(MODELING_UNIT);
		createEReference(modelingUnitEClass, MODELING_UNIT__USED_BY);
		createEReference(modelingUnitEClass, MODELING_UNIT__SEE_ALSO);
		createEReference(modelingUnitEClass, MODELING_UNIT__RESOURCE);

		modelingUnitInstructionEClass = createEClass(MODELING_UNIT_INSTRUCTION);

		resourceReferenceEClass = createEClass(RESOURCE_REFERENCE);
		createEReference(resourceReferenceEClass, RESOURCE_REFERENCE__REFERENCED_ELEMENT);
		createEAttribute(resourceReferenceEClass, RESOURCE_REFERENCE__LINE_BREAK);

		modelingUnitInstructionReferenceEClass = createEClass(MODELING_UNIT_INSTRUCTION_REFERENCE);
		createEReference(modelingUnitInstructionReferenceEClass,
				MODELING_UNIT_INSTRUCTION_REFERENCE__REFERENCED_ELEMENT);

		instanciationInstructionReferenceEClass = createEClass(INSTANCIATION_INSTRUCTION_REFERENCE);
		createEReference(instanciationInstructionReferenceEClass,
				INSTANCIATION_INSTRUCTION_REFERENCE__REFERENCED_ELEMENT);

		resourceDeclarationEClass = createEClass(RESOURCE_DECLARATION);
		createEAttribute(resourceDeclarationEClass, RESOURCE_DECLARATION__URI);
		createEAttribute(resourceDeclarationEClass, RESOURCE_DECLARATION__NAME);
		createEAttribute(resourceDeclarationEClass, RESOURCE_DECLARATION__CONTENT_TYPE);
		createEReference(resourceDeclarationEClass, RESOURCE_DECLARATION__CONTENT);

		intentSectionReferenceinModelingUnitEClass = createEClass(INTENT_SECTION_REFERENCEIN_MODELING_UNIT);

		labelinModelingUnitEClass = createEClass(LABELIN_MODELING_UNIT);

		annotationDeclarationEClass = createEClass(ANNOTATION_DECLARATION);
		createEAttribute(annotationDeclarationEClass, ANNOTATION_DECLARATION__ANNOTATION_ID);
		createEReference(annotationDeclarationEClass, ANNOTATION_DECLARATION__MAP);

		typeReferenceEClass = createEClass(TYPE_REFERENCE);

		instanceLevelInstructionEClass = createEClass(INSTANCE_LEVEL_INSTRUCTION);
		createEReference(instanceLevelInstructionEClass, INSTANCE_LEVEL_INSTRUCTION__META_TYPE);

		instanciationInstructionEClass = createEClass(INSTANCIATION_INSTRUCTION);
		createEAttribute(instanciationInstructionEClass, INSTANCIATION_INSTRUCTION__NAME);
		createEReference(instanciationInstructionEClass, INSTANCIATION_INSTRUCTION__STRUCTURAL_FEATURES);

		structuralFeatureAffectationEClass = createEClass(STRUCTURAL_FEATURE_AFFECTATION);
		createEAttribute(structuralFeatureAffectationEClass, STRUCTURAL_FEATURE_AFFECTATION__NAME);
		createEAttribute(structuralFeatureAffectationEClass, STRUCTURAL_FEATURE_AFFECTATION__USED_OPERATOR);
		createEReference(structuralFeatureAffectationEClass, STRUCTURAL_FEATURE_AFFECTATION__VALUES);

		valueForStructuralFeatureEClass = createEClass(VALUE_FOR_STRUCTURAL_FEATURE);

		nativeValueForStructuralFeatureEClass = createEClass(NATIVE_VALUE_FOR_STRUCTURAL_FEATURE);
		createEAttribute(nativeValueForStructuralFeatureEClass, NATIVE_VALUE_FOR_STRUCTURAL_FEATURE__VALUE);

		newObjectValueForStructuralFeatureEClass = createEClass(NEW_OBJECT_VALUE_FOR_STRUCTURAL_FEATURE);
		createEReference(newObjectValueForStructuralFeatureEClass,
				NEW_OBJECT_VALUE_FOR_STRUCTURAL_FEATURE__VALUE);

		referenceValueForStructuralFeatureEClass = createEClass(REFERENCE_VALUE_FOR_STRUCTURAL_FEATURE);
		createEReference(referenceValueForStructuralFeatureEClass,
				REFERENCE_VALUE_FOR_STRUCTURAL_FEATURE__REFERENCED_ELEMENT);

		contributionInstructionEClass = createEClass(CONTRIBUTION_INSTRUCTION);
		createEReference(contributionInstructionEClass, CONTRIBUTION_INSTRUCTION__REFERENCED_ELEMENT);
		createEReference(contributionInstructionEClass, CONTRIBUTION_INSTRUCTION__CONTRIBUTIONS);

		// Create enums
		affectationOperatorEEnum = createEEnum(AFFECTATION_OPERATOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		GenericUnitPackage theGenericUnitPackage = (GenericUnitPackage)EPackage.Registry.INSTANCE
				.getEPackage(GenericUnitPackage.eNS_URI);
		IntentDocumentPackage theIntentDocumentPackage = (IntentDocumentPackage)EPackage.Registry.INSTANCE
				.getEPackage(IntentDocumentPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		modelingUnitEClass.getESuperTypes().add(theGenericUnitPackage.getGenericUnit());
		modelingUnitInstructionEClass.getESuperTypes().add(theGenericUnitPackage.getUnitInstruction());
		resourceReferenceEClass.getESuperTypes().add(theIntentDocumentPackage.getIntentReference());
		modelingUnitInstructionReferenceEClass.getESuperTypes().add(
				theIntentDocumentPackage.getIntentReference());
		instanciationInstructionReferenceEClass.getESuperTypes().add(
				theIntentDocumentPackage.getIntentReference());
		resourceDeclarationEClass.getESuperTypes().add(this.getModelingUnitInstruction());
		intentSectionReferenceinModelingUnitEClass.getESuperTypes().add(
				theGenericUnitPackage.getIntentSectionReferenceInstruction());
		intentSectionReferenceinModelingUnitEClass.getESuperTypes().add(this.getModelingUnitInstruction());
		intentSectionReferenceinModelingUnitEClass.getESuperTypes().add(
				this.getModelingUnitInstructionReference());
		labelinModelingUnitEClass.getESuperTypes().add(theGenericUnitPackage.getLabelDeclaration());
		labelinModelingUnitEClass.getESuperTypes().add(this.getModelingUnitInstruction());
		labelinModelingUnitEClass.getESuperTypes().add(this.getModelingUnitInstructionReference());
		annotationDeclarationEClass.getESuperTypes().add(this.getModelingUnitInstruction());
		annotationDeclarationEClass.getESuperTypes().add(this.getModelingUnitInstructionReference());
		typeReferenceEClass.getESuperTypes().add(theIntentDocumentPackage.getIntentReference());
		instanceLevelInstructionEClass.getESuperTypes().add(this.getModelingUnitInstruction());
		instanciationInstructionEClass.getESuperTypes().add(this.getInstanceLevelInstruction());
		structuralFeatureAffectationEClass.getESuperTypes().add(this.getInstanceLevelInstruction());
		valueForStructuralFeatureEClass.getESuperTypes().add(this.getModelingUnitInstruction());
		nativeValueForStructuralFeatureEClass.getESuperTypes().add(this.getValueForStructuralFeature());
		newObjectValueForStructuralFeatureEClass.getESuperTypes().add(this.getValueForStructuralFeature());
		referenceValueForStructuralFeatureEClass.getESuperTypes().add(this.getValueForStructuralFeature());
		contributionInstructionEClass.getESuperTypes().add(this.getModelingUnitInstruction());

		// Initialize classes and features; add operations and parameters
		initEClass(keyValForAnnotationEClass, Map.Entry.class, "KeyValForAnnotation", !IS_ABSTRACT,
				!IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKeyValForAnnotation_Key(), ecorePackage.getEString(), "key", null, 0, 1,
				Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeyValForAnnotation_Value(), ecorePackage.getEString(), "value", null, 0, 1,
				Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelingUnitEClass, ModelingUnit.class, "ModelingUnit", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelingUnit_UsedBy(), this.getModelingUnit(), this.getModelingUnit_SeeAlso(),
				"usedBy", null, 0, -1, ModelingUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelingUnit_SeeAlso(), this.getModelingUnit(), this.getModelingUnit_UsedBy(),
				"seeAlso", null, 0, -1, ModelingUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelingUnit_Resource(), this.getResourceReference(), null, "resource", null, 0, 1,
				ModelingUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelingUnitInstructionEClass, ModelingUnitInstruction.class, "ModelingUnitInstruction",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(resourceReferenceEClass, ResourceReference.class, "ResourceReference", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourceReference_ReferencedElement(), this.getResourceDeclaration(), null,
				"referencedElement", null, 0, 1, ResourceReference.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getResourceReference_LineBreak(), ecorePackage.getEBoolean(), "lineBreak", null, 1, 1,
				ResourceReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelingUnitInstructionReferenceEClass, ModelingUnitInstructionReference.class,
				"ModelingUnitInstructionReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelingUnitInstructionReference_ReferencedElement(),
				this.getModelingUnitInstruction(), null, "referencedElement", null, 0, 1,
				ModelingUnitInstructionReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instanciationInstructionReferenceEClass, InstanciationInstructionReference.class,
				"InstanciationInstructionReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInstanciationInstructionReference_ReferencedElement(),
				this.getInstanciationInstruction(), null, "referencedElement", null, 0, 1,
				InstanciationInstructionReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceDeclarationEClass, ResourceDeclaration.class, "ResourceDeclaration", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResourceDeclaration_Uri(), theIntentDocumentPackage.getURI(), "uri", null, 0, 1,
				ResourceDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				ResourceDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceDeclaration_ContentType(), ecorePackage.getEString(), "contentType", null,
				0, 1, ResourceDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceDeclaration_Content(), this.getModelingUnitInstructionReference(), null,
				"content", null, 0, -1, ResourceDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(intentSectionReferenceinModelingUnitEClass, IntentSectionReferenceinModelingUnit.class,
				"IntentSectionReferenceinModelingUnit", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(labelinModelingUnitEClass, LabelinModelingUnit.class, "LabelinModelingUnit", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(annotationDeclarationEClass, AnnotationDeclaration.class, "AnnotationDeclaration",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnnotationDeclaration_AnnotationID(), ecorePackage.getEString(), "annotationID",
				null, 1, 1, AnnotationDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnnotationDeclaration_Map(), this.getKeyValForAnnotation(), null, "map", null, 0,
				-1, AnnotationDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeReferenceEClass, TypeReference.class, "TypeReference", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(instanceLevelInstructionEClass, InstanceLevelInstruction.class,
				"InstanceLevelInstruction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInstanceLevelInstruction_MetaType(), this.getTypeReference(), null, "metaType",
				null, 0, 1, InstanceLevelInstruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instanciationInstructionEClass, InstanciationInstruction.class,
				"InstanciationInstruction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInstanciationInstruction_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				InstanciationInstruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInstanciationInstruction_StructuralFeatures(),
				this.getStructuralFeatureAffectation(), null, "structuralFeatures", null, 0, -1,
				InstanciationInstruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(structuralFeatureAffectationEClass, StructuralFeatureAffectation.class,
				"StructuralFeatureAffectation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStructuralFeatureAffectation_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				StructuralFeatureAffectation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStructuralFeatureAffectation_UsedOperator(), this.getAffectationOperator(),
				"usedOperator", "SINGLE_VALUED_AFFECTATION", 1, 1, StructuralFeatureAffectation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getStructuralFeatureAffectation_Values(), this.getValueForStructuralFeature(), null,
				"values", null, 1, -1, StructuralFeatureAffectation.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(valueForStructuralFeatureEClass, ValueForStructuralFeature.class,
				"ValueForStructuralFeature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nativeValueForStructuralFeatureEClass, NativeValueForStructuralFeature.class,
				"NativeValueForStructuralFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNativeValueForStructuralFeature_Value(), ecorePackage.getEString(), "value", null,
				0, 1, NativeValueForStructuralFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(newObjectValueForStructuralFeatureEClass, NewObjectValueForStructuralFeature.class,
				"NewObjectValueForStructuralFeature", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNewObjectValueForStructuralFeature_Value(), this.getInstanciationInstruction(),
				null, "value", null, 1, 1, NewObjectValueForStructuralFeature.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(referenceValueForStructuralFeatureEClass, ReferenceValueForStructuralFeature.class,
				"ReferenceValueForStructuralFeature", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReferenceValueForStructuralFeature_ReferencedElement(),
				this.getInstanciationInstructionReference(), null, "referencedElement", null, 1, 1,
				ReferenceValueForStructuralFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contributionInstructionEClass, ContributionInstruction.class, "ContributionInstruction",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContributionInstruction_ReferencedElement(),
				this.getModelingUnitInstructionReference(), null, "referencedElement", null, 1, 1,
				ContributionInstruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContributionInstruction_Contributions(), this.getModelingUnitInstruction(), null,
				"contributions", null, 0, -1, ContributionInstruction.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(affectationOperatorEEnum, AffectationOperator.class, "AffectationOperator");
		addEEnumLiteral(affectationOperatorEEnum, AffectationOperator.SINGLE_VALUED_AFFECTATION);
		addEEnumLiteral(affectationOperatorEEnum, AffectationOperator.MULTI_VALUED_AFFECTATION);

		// Create resource
		createResource(eNS_URI);
	}

} //ModelingUnitPackageImpl
