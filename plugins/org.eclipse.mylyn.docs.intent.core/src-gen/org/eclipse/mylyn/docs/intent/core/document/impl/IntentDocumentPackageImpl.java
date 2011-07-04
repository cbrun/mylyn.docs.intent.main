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
package org.eclipse.mylyn.docs.intent.core.document.impl;

import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.mylyn.docs.intent.core.compiler.CompilerPackage;
import org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilerPackageImpl;
import org.eclipse.mylyn.docs.intent.core.descriptionunit.DescriptionUnitPackage;
import org.eclipse.mylyn.docs.intent.core.descriptionunit.impl.DescriptionUnitPackageImpl;
import org.eclipse.mylyn.docs.intent.core.document.IntentChapter;
import org.eclipse.mylyn.docs.intent.core.document.IntentDocument;
import org.eclipse.mylyn.docs.intent.core.document.IntentDocumentFactory;
import org.eclipse.mylyn.docs.intent.core.document.IntentDocumentPackage;
import org.eclipse.mylyn.docs.intent.core.document.IntentGenericElement;
import org.eclipse.mylyn.docs.intent.core.document.IntentHeaderDeclaration;
import org.eclipse.mylyn.docs.intent.core.document.IntentReference;
import org.eclipse.mylyn.docs.intent.core.document.IntentSection;
import org.eclipse.mylyn.docs.intent.core.document.IntentSectionOrParagraphReference;
import org.eclipse.mylyn.docs.intent.core.document.IntentSectionReference;
import org.eclipse.mylyn.docs.intent.core.document.IntentSectionVisibility;
import org.eclipse.mylyn.docs.intent.core.document.IntentStructuredElement;
import org.eclipse.mylyn.docs.intent.core.document.IntentSubSectionContainer;
import org.eclipse.mylyn.docs.intent.core.genericunit.GenericUnitPackage;
import org.eclipse.mylyn.docs.intent.core.genericunit.impl.GenericUnitPackageImpl;
import org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnitPackage;
import org.eclipse.mylyn.docs.intent.core.modelingunit.impl.ModelingUnitPackageImpl;
import org.eclipse.mylyn.docs.intent.markup.markup.MarkupPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IntentDocumentPackageImpl extends EPackageImpl implements IntentDocumentPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intentGenericElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intentStructuredElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intentReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intentSectionReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intentSectionOrParagraphReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intentDocumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intentSubSectionContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intentChapterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intentSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intentHeaderDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum intentSectionVisibilityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType uriEDataType = null;

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
	 * @see org.eclipse.mylyn.docs.intent.core.document.IntentDocumentPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IntentDocumentPackageImpl() {
		super(eNS_URI, IntentDocumentFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link IntentDocumentPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static IntentDocumentPackage init() {
		if (isInited)
			return (IntentDocumentPackage)EPackage.Registry.INSTANCE
					.getEPackage(IntentDocumentPackage.eNS_URI);

		// Obtain or create and register package
		IntentDocumentPackageImpl theIntentDocumentPackage = (IntentDocumentPackageImpl)(EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof IntentDocumentPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
				: new IntentDocumentPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		MarkupPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		ModelingUnitPackageImpl theModelingUnitPackage = (ModelingUnitPackageImpl)(EPackage.Registry.INSTANCE
				.getEPackage(ModelingUnitPackage.eNS_URI) instanceof ModelingUnitPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(ModelingUnitPackage.eNS_URI) : ModelingUnitPackage.eINSTANCE);
		GenericUnitPackageImpl theGenericUnitPackage = (GenericUnitPackageImpl)(EPackage.Registry.INSTANCE
				.getEPackage(GenericUnitPackage.eNS_URI) instanceof GenericUnitPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(GenericUnitPackage.eNS_URI) : GenericUnitPackage.eINSTANCE);
		CompilerPackageImpl theCompilerPackage = (CompilerPackageImpl)(EPackage.Registry.INSTANCE
				.getEPackage(CompilerPackage.eNS_URI) instanceof CompilerPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(CompilerPackage.eNS_URI) : CompilerPackage.eINSTANCE);
		DescriptionUnitPackageImpl theDescriptionUnitPackage = (DescriptionUnitPackageImpl)(EPackage.Registry.INSTANCE
				.getEPackage(DescriptionUnitPackage.eNS_URI) instanceof DescriptionUnitPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(DescriptionUnitPackage.eNS_URI) : DescriptionUnitPackage.eINSTANCE);

		// Create package meta-data objects
		theIntentDocumentPackage.createPackageContents();
		theModelingUnitPackage.createPackageContents();
		theGenericUnitPackage.createPackageContents();
		theCompilerPackage.createPackageContents();
		theDescriptionUnitPackage.createPackageContents();

		// Initialize created meta-data
		theIntentDocumentPackage.initializePackageContents();
		theModelingUnitPackage.initializePackageContents();
		theGenericUnitPackage.initializePackageContents();
		theCompilerPackage.initializePackageContents();
		theDescriptionUnitPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theIntentDocumentPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(IntentDocumentPackage.eNS_URI, theIntentDocumentPackage);
		return theIntentDocumentPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntentGenericElement() {
		return intentGenericElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntentGenericElement_CompilationStatus() {
		return (EReference)intentGenericElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotationMapping() {
		return annotationMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotationMapping_Key() {
		return (EAttribute)annotationMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotationMapping_Value() {
		return (EAttribute)annotationMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntentStructuredElement() {
		return intentStructuredElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntentStructuredElement_FormattedTitle() {
		return (EAttribute)intentStructuredElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntentReference() {
		return intentReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntentReference_IntentHref() {
		return (EAttribute)intentReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntentSectionReference() {
		return intentSectionReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntentSectionReference_ReferencedElement() {
		return (EReference)intentSectionReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntentSectionOrParagraphReference() {
		return intentSectionOrParagraphReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntentSectionOrParagraphReference_ReferencedObject() {
		return (EReference)intentSectionOrParagraphReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntentDocument() {
		return intentDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntentDocument_Chapters() {
		return (EReference)intentDocumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntentDocument_Headers() {
		return (EReference)intentDocumentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntentSubSectionContainer() {
		return intentSubSectionContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntentSubSectionContainer_IntentContent() {
		return (EReference)intentSubSectionContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntentSubSectionContainer_SubSections() {
		return (EReference)intentSubSectionContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntentSubSectionContainer_Units() {
		return (EReference)intentSubSectionContainerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntentSubSectionContainer_DescriptionUnits() {
		return (EReference)intentSubSectionContainerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntentChapter() {
		return intentChapterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntentSection() {
		return intentSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntentSection_Visibility() {
		return (EAttribute)intentSectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntentSection_CompleteLevel() {
		return (EAttribute)intentSectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntentSection_ModelingUnits() {
		return (EReference)intentSectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntentSection_ImportedHeaders() {
		return (EAttribute)intentSectionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntentSection_DeclaredHeaders() {
		return (EReference)intentSectionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntentHeaderDeclaration() {
		return intentHeaderDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntentHeaderDeclaration_Name() {
		return (EAttribute)intentHeaderDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntentHeaderDeclaration_Imports() {
		return (EAttribute)intentHeaderDeclarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntentHeaderDeclaration_AnnotationMappings() {
		return (EReference)intentHeaderDeclarationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntentHeaderDeclaration_Resource() {
		return (EReference)intentHeaderDeclarationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getIntentSectionVisibility() {
		return intentSectionVisibilityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getURI() {
		return uriEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntentDocumentFactory getIntentDocumentFactory() {
		return (IntentDocumentFactory)getEFactoryInstance();
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
		intentGenericElementEClass = createEClass(INTENT_GENERIC_ELEMENT);
		createEReference(intentGenericElementEClass, INTENT_GENERIC_ELEMENT__COMPILATION_STATUS);

		intentStructuredElementEClass = createEClass(INTENT_STRUCTURED_ELEMENT);
		createEAttribute(intentStructuredElementEClass, INTENT_STRUCTURED_ELEMENT__FORMATTED_TITLE);

		annotationMappingEClass = createEClass(ANNOTATION_MAPPING);
		createEAttribute(annotationMappingEClass, ANNOTATION_MAPPING__KEY);
		createEAttribute(annotationMappingEClass, ANNOTATION_MAPPING__VALUE);

		intentReferenceEClass = createEClass(INTENT_REFERENCE);
		createEAttribute(intentReferenceEClass, INTENT_REFERENCE__INTENT_HREF);

		intentSectionReferenceEClass = createEClass(INTENT_SECTION_REFERENCE);
		createEReference(intentSectionReferenceEClass, INTENT_SECTION_REFERENCE__REFERENCED_ELEMENT);

		intentSectionOrParagraphReferenceEClass = createEClass(INTENT_SECTION_OR_PARAGRAPH_REFERENCE);
		createEReference(intentSectionOrParagraphReferenceEClass,
				INTENT_SECTION_OR_PARAGRAPH_REFERENCE__REFERENCED_OBJECT);

		intentDocumentEClass = createEClass(INTENT_DOCUMENT);
		createEReference(intentDocumentEClass, INTENT_DOCUMENT__CHAPTERS);
		createEReference(intentDocumentEClass, INTENT_DOCUMENT__HEADERS);

		intentSubSectionContainerEClass = createEClass(INTENT_SUB_SECTION_CONTAINER);
		createEReference(intentSubSectionContainerEClass, INTENT_SUB_SECTION_CONTAINER__INTENT_CONTENT);
		createEReference(intentSubSectionContainerEClass, INTENT_SUB_SECTION_CONTAINER__SUB_SECTIONS);
		createEReference(intentSubSectionContainerEClass, INTENT_SUB_SECTION_CONTAINER__UNITS);
		createEReference(intentSubSectionContainerEClass, INTENT_SUB_SECTION_CONTAINER__DESCRIPTION_UNITS);

		intentChapterEClass = createEClass(INTENT_CHAPTER);

		intentSectionEClass = createEClass(INTENT_SECTION);
		createEAttribute(intentSectionEClass, INTENT_SECTION__VISIBILITY);
		createEAttribute(intentSectionEClass, INTENT_SECTION__COMPLETE_LEVEL);
		createEReference(intentSectionEClass, INTENT_SECTION__MODELING_UNITS);
		createEAttribute(intentSectionEClass, INTENT_SECTION__IMPORTED_HEADERS);
		createEReference(intentSectionEClass, INTENT_SECTION__DECLARED_HEADERS);

		intentHeaderDeclarationEClass = createEClass(INTENT_HEADER_DECLARATION);
		createEAttribute(intentHeaderDeclarationEClass, INTENT_HEADER_DECLARATION__NAME);
		createEAttribute(intentHeaderDeclarationEClass, INTENT_HEADER_DECLARATION__IMPORTS);
		createEReference(intentHeaderDeclarationEClass, INTENT_HEADER_DECLARATION__ANNOTATION_MAPPINGS);
		createEReference(intentHeaderDeclarationEClass, INTENT_HEADER_DECLARATION__RESOURCE);

		// Create enums
		intentSectionVisibilityEEnum = createEEnum(INTENT_SECTION_VISIBILITY);

		// Create data types
		uriEDataType = createEDataType(URI);
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
		CompilerPackage theCompilerPackage = (CompilerPackage)EPackage.Registry.INSTANCE
				.getEPackage(CompilerPackage.eNS_URI);
		MarkupPackage theMarkupPackage = (MarkupPackage)EPackage.Registry.INSTANCE
				.getEPackage(MarkupPackage.eNS_URI);
		GenericUnitPackage theGenericUnitPackage = (GenericUnitPackage)EPackage.Registry.INSTANCE
				.getEPackage(GenericUnitPackage.eNS_URI);
		DescriptionUnitPackage theDescriptionUnitPackage = (DescriptionUnitPackage)EPackage.Registry.INSTANCE
				.getEPackage(DescriptionUnitPackage.eNS_URI);
		ModelingUnitPackage theModelingUnitPackage = (ModelingUnitPackage)EPackage.Registry.INSTANCE
				.getEPackage(ModelingUnitPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		intentStructuredElementEClass.getESuperTypes().add(theMarkupPackage.getSection());
		intentStructuredElementEClass.getESuperTypes().add(this.getIntentGenericElement());
		intentSectionReferenceEClass.getESuperTypes().add(this.getIntentReference());
		intentSectionOrParagraphReferenceEClass.getESuperTypes().add(this.getIntentReference());
		intentDocumentEClass.getESuperTypes().add(this.getIntentStructuredElement());
		intentSubSectionContainerEClass.getESuperTypes().add(this.getIntentStructuredElement());
		intentChapterEClass.getESuperTypes().add(this.getIntentSubSectionContainer());
		intentSectionEClass.getESuperTypes().add(this.getIntentSubSectionContainer());

		// Initialize classes and features; add operations and parameters
		initEClass(intentGenericElementEClass, IntentGenericElement.class, "IntentGenericElement",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIntentGenericElement_CompilationStatus(),
				theCompilerPackage.getCompilationStatus(), null, "compilationStatus", null, 0, -1,
				IntentGenericElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(intentStructuredElementEClass, IntentStructuredElement.class, "IntentStructuredElement",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntentStructuredElement_FormattedTitle(), ecorePackage.getEString(),
				"formattedTitle", null, 0, 1, IntentStructuredElement.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(annotationMappingEClass, Map.Entry.class, "AnnotationMapping", !IS_ABSTRACT,
				!IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnnotationMapping_Key(), ecorePackage.getEString(), "key", null, 0, 1,
				Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnnotationMapping_Value(), this.getURI(), "value", null, 0, 1, Map.Entry.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(intentReferenceEClass, IntentReference.class, "IntentReference", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntentReference_IntentHref(), ecorePackage.getEString(), "IntentHref", null, 0, 1,
				IntentReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(intentSectionReferenceEClass, IntentSectionReference.class, "IntentSectionReference",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIntentSectionReference_ReferencedElement(), this.getIntentSection(), null,
				"referencedElement", null, 0, 1, IntentSectionReference.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(intentSectionOrParagraphReferenceEClass, IntentSectionOrParagraphReference.class,
				"IntentSectionOrParagraphReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIntentSectionOrParagraphReference_ReferencedObject(),
				theMarkupPackage.getStructureElement(), null, "referencedObject", null, 0, 1,
				IntentSectionOrParagraphReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(intentDocumentEClass, IntentDocument.class, "IntentDocument", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIntentDocument_Chapters(), this.getIntentChapter(), null, "chapters", null, 0, -1,
				IntentDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntentDocument_Headers(), this.getIntentHeaderDeclaration(), null, "headers", null,
				0, -1, IntentDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(intentSubSectionContainerEClass, IntentSubSectionContainer.class,
				"IntentSubSectionContainer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIntentSubSectionContainer_IntentContent(), ecorePackage.getEObject(), null,
				"intentContent", null, 0, -1, IntentSubSectionContainer.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getIntentSubSectionContainer_SubSections(), this.getIntentSection(), null,
				"subSections", null, 0, -1, IntentSubSectionContainer.class, !IS_TRANSIENT, IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED,
				IS_ORDERED);
		initEReference(getIntentSubSectionContainer_Units(), theGenericUnitPackage.getGenericUnit(), null,
				"units", null, 0, -1, IntentSubSectionContainer.class, !IS_TRANSIENT, IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getIntentSubSectionContainer_DescriptionUnits(),
				theDescriptionUnitPackage.getDescriptionUnit(), null, "descriptionUnits", null, 0, -1,
				IntentSubSectionContainer.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(intentChapterEClass, IntentChapter.class, "IntentChapter", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(intentSectionEClass, IntentSection.class, "IntentSection", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntentSection_Visibility(), this.getIntentSectionVisibility(), "visibility", null,
				0, 1, IntentSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntentSection_CompleteLevel(), ecorePackage.getEString(), "completeLevel", null, 0,
				1, IntentSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getIntentSection_ModelingUnits(), theModelingUnitPackage.getModelingUnit(), null,
				"modelingUnits", null, 0, -1, IntentSection.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntentSection_ImportedHeaders(), ecorePackage.getEString(), "importedHeaders",
				null, 0, -1, IntentSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntentSection_DeclaredHeaders(), this.getIntentHeaderDeclaration(), null,
				"declaredHeaders", null, 0, -1, IntentSection.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(intentHeaderDeclarationEClass, IntentHeaderDeclaration.class, "IntentHeaderDeclaration",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntentHeaderDeclaration_Name(), ecorePackage.getEString(), "name", null, 1, 1,
				IntentHeaderDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntentHeaderDeclaration_Imports(), this.getURI(), "imports", null, 0, -1,
				IntentHeaderDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntentHeaderDeclaration_AnnotationMappings(), this.getAnnotationMapping(), null,
				"annotationMappings", null, 0, -1, IntentHeaderDeclaration.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getIntentHeaderDeclaration_Resource(), theModelingUnitPackage.getResourceReference(),
				null, "resource", null, 0, 1, IntentHeaderDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(intentSectionVisibilityEEnum, IntentSectionVisibility.class, "IntentSectionVisibility");
		addEEnumLiteral(intentSectionVisibilityEEnum, IntentSectionVisibility.PUBLIC);
		addEEnumLiteral(intentSectionVisibilityEEnum, IntentSectionVisibility.HIDDEN);
		addEEnumLiteral(intentSectionVisibilityEEnum, IntentSectionVisibility.INTERNAL);

		// Initialize data types
		initEDataType(uriEDataType, String.class, "URI", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //IntentDocumentPackageImpl
