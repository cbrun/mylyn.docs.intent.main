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
package org.eclipse.mylyn.docs.intent.core.indexer.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.mylyn.docs.intent.core.compiler.CompilerPackage;
import org.eclipse.mylyn.docs.intent.core.descriptionunit.DescriptionUnitPackage;
import org.eclipse.mylyn.docs.intent.core.document.IntentDocumentPackage;
import org.eclipse.mylyn.docs.intent.core.genericunit.GenericUnitPackage;
import org.eclipse.mylyn.docs.intent.core.indexer.IntentIndex;
import org.eclipse.mylyn.docs.intent.core.indexer.IntentIndexEntry;
import org.eclipse.mylyn.docs.intent.core.indexer.IntentIndexerFactory;
import org.eclipse.mylyn.docs.intent.core.indexer.IntentIndexerPackage;
import org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnitPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IntentIndexerPackageImpl extends EPackageImpl implements IntentIndexerPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intentIndexEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intentIndexEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum indeX_ENTRY_TYPEEEnum = null;

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
	 * @see org.eclipse.mylyn.docs.intent.core.indexer.IntentIndexerPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IntentIndexerPackageImpl() {
		super(eNS_URI, IntentIndexerFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link IntentIndexerPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static IntentIndexerPackage init() {
		if (isInited) return (IntentIndexerPackage)EPackage.Registry.INSTANCE.getEPackage(IntentIndexerPackage.eNS_URI);

		// Obtain or create and register package
		IntentIndexerPackageImpl theIntentIndexerPackage = (IntentIndexerPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof IntentIndexerPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new IntentIndexerPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ModelingUnitPackage.eINSTANCE.eClass();
		GenericUnitPackage.eINSTANCE.eClass();
		IntentDocumentPackage.eINSTANCE.eClass();
		CompilerPackage.eINSTANCE.eClass();
		DescriptionUnitPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theIntentIndexerPackage.createPackageContents();

		// Initialize created meta-data
		theIntentIndexerPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theIntentIndexerPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(IntentIndexerPackage.eNS_URI, theIntentIndexerPackage);
		return theIntentIndexerPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntentIndex() {
		return intentIndexEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntentIndex_Entries() {
		return (EReference)intentIndexEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntentIndexEntry() {
		return intentIndexEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntentIndexEntry_Name() {
		return (EAttribute)intentIndexEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntentIndexEntry_Type() {
		return (EAttribute)intentIndexEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntentIndexEntry_ReferencedElement() {
		return (EReference)intentIndexEntryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntentIndexEntry_SubEntries() {
		return (EReference)intentIndexEntryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getINDEX_ENTRY_TYPE() {
		return indeX_ENTRY_TYPEEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntentIndexerFactory getIntentIndexerFactory() {
		return (IntentIndexerFactory)getEFactoryInstance();
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
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		intentIndexEClass = createEClass(INTENT_INDEX);
		createEReference(intentIndexEClass, INTENT_INDEX__ENTRIES);

		intentIndexEntryEClass = createEClass(INTENT_INDEX_ENTRY);
		createEAttribute(intentIndexEntryEClass, INTENT_INDEX_ENTRY__NAME);
		createEAttribute(intentIndexEntryEClass, INTENT_INDEX_ENTRY__TYPE);
		createEReference(intentIndexEntryEClass, INTENT_INDEX_ENTRY__REFERENCED_ELEMENT);
		createEReference(intentIndexEntryEClass, INTENT_INDEX_ENTRY__SUB_ENTRIES);

		// Create enums
		indeX_ENTRY_TYPEEEnum = createEEnum(INDEX_ENTRY_TYPE);
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
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		IntentDocumentPackage theIntentDocumentPackage = (IntentDocumentPackage)EPackage.Registry.INSTANCE.getEPackage(IntentDocumentPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(intentIndexEClass, IntentIndex.class, "IntentIndex", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIntentIndex_Entries(), this.getIntentIndexEntry(), null, "entries", null, 0, -1, IntentIndex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(intentIndexEntryEClass, IntentIndexEntry.class, "IntentIndexEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntentIndexEntry_Name(), ecorePackage.getEString(), "name", null, 0, 1, IntentIndexEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntentIndexEntry_Type(), this.getINDEX_ENTRY_TYPE(), "type", null, 1, 1, IntentIndexEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntentIndexEntry_ReferencedElement(), theIntentDocumentPackage.getIntentGenericElement(), null, "referencedElement", null, 0, 1, IntentIndexEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntentIndexEntry_SubEntries(), this.getIntentIndexEntry(), null, "subEntries", null, 0, -1, IntentIndexEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(indeX_ENTRY_TYPEEEnum, org.eclipse.mylyn.docs.intent.core.indexer.INDEX_ENTRY_TYPE.class, "INDEX_ENTRY_TYPE");
		addEEnumLiteral(indeX_ENTRY_TYPEEEnum, org.eclipse.mylyn.docs.intent.core.indexer.INDEX_ENTRY_TYPE.INTENT_DOCUMENT);
		addEEnumLiteral(indeX_ENTRY_TYPEEEnum, org.eclipse.mylyn.docs.intent.core.indexer.INDEX_ENTRY_TYPE.INTENT_CHAPTER);
		addEEnumLiteral(indeX_ENTRY_TYPEEEnum, org.eclipse.mylyn.docs.intent.core.indexer.INDEX_ENTRY_TYPE.INTENT_SECTION);

		// Create resource
		createResource(eNS_URI);
	}

} //IntentIndexerPackageImpl
