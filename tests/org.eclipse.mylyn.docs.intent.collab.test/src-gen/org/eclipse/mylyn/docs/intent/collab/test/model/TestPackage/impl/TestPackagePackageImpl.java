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
package org.eclipse.mylyn.docs.intent.collab.test.model.TestPackage.impl;


import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.mylyn.docs.intent.collab.test.model.TestPackage.AbstractTestClass;
import org.eclipse.mylyn.docs.intent.collab.test.model.TestPackage.TestClass1;
import org.eclipse.mylyn.docs.intent.collab.test.model.TestPackage.TestClass2;
import org.eclipse.mylyn.docs.intent.collab.test.model.TestPackage.TestIndex;
import org.eclipse.mylyn.docs.intent.collab.test.model.TestPackage.TestIndexEntry;
import org.eclipse.mylyn.docs.intent.collab.test.model.TestPackage.TestPackageFactory;
import org.eclipse.mylyn.docs.intent.collab.test.model.TestPackage.TestPackagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TestPackagePackageImpl extends EPackageImpl implements TestPackagePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractTestClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testClass1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testClass2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testIndexEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testIndexEntryEClass = null;

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
	 * @see org.eclipse.mylyn.docs.intent.collab.test.model.TestPackage.TestPackagePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TestPackagePackageImpl() {
		super(eNS_URI, TestPackageFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TestPackagePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TestPackagePackage init() {
		if (isInited) return (TestPackagePackage)EPackage.Registry.INSTANCE.getEPackage(TestPackagePackage.eNS_URI);

		// Obtain or create and register package
		TestPackagePackageImpl theTestPackagePackage = (TestPackagePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TestPackagePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TestPackagePackageImpl());

		isInited = true;

		// Create package meta-data objects
		theTestPackagePackage.createPackageContents();

		// Initialize created meta-data
		theTestPackagePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTestPackagePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TestPackagePackage.eNS_URI, theTestPackagePackage);
		return theTestPackagePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractTestClass() {
		return abstractTestClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractTestClass_Name() {
		return (EAttribute)abstractTestClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestClass1() {
		return testClass1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestClass1_TheAttributeToListen() {
		return (EAttribute)testClass1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestClass2() {
		return testClass2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestIndex() {
		return testIndexEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestIndex_Entries() {
		return (EReference)testIndexEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestIndexEntry() {
		return testIndexEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestIndexEntry_ReferencedElement() {
		return (EReference)testIndexEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestPackageFactory getTestPackageFactory() {
		return (TestPackageFactory)getEFactoryInstance();
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
		abstractTestClassEClass = createEClass(ABSTRACT_TEST_CLASS);
		createEAttribute(abstractTestClassEClass, ABSTRACT_TEST_CLASS__NAME);

		testClass1EClass = createEClass(TEST_CLASS1);
		createEAttribute(testClass1EClass, TEST_CLASS1__THE_ATTRIBUTE_TO_LISTEN);

		testClass2EClass = createEClass(TEST_CLASS2);

		testIndexEClass = createEClass(TEST_INDEX);
		createEReference(testIndexEClass, TEST_INDEX__ENTRIES);

		testIndexEntryEClass = createEClass(TEST_INDEX_ENTRY);
		createEReference(testIndexEntryEClass, TEST_INDEX_ENTRY__REFERENCED_ELEMENT);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		testClass1EClass.getESuperTypes().add(this.getAbstractTestClass());
		testClass2EClass.getESuperTypes().add(this.getAbstractTestClass());

		// Initialize classes and features; add operations and parameters
		initEClass(abstractTestClassEClass, AbstractTestClass.class, "AbstractTestClass", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractTestClass_Name(), ecorePackage.getEString(), "name", null, 0, 1, AbstractTestClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testClass1EClass, TestClass1.class, "TestClass1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTestClass1_TheAttributeToListen(), ecorePackage.getEString(), "theAttributeToListen", null, 0, 1, TestClass1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(testClass1EClass, ecorePackage.getEString(), "testOperation", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "testParameter", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(testClass2EClass, TestClass2.class, "TestClass2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(testIndexEClass, TestIndex.class, "TestIndex", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTestIndex_Entries(), this.getTestIndexEntry(), null, "entries", null, 0, -1, TestIndex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testIndexEntryEClass, TestIndexEntry.class, "TestIndexEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTestIndexEntry_ReferencedElement(), this.getAbstractTestClass(), null, "referencedElement", null, 1, 1, TestIndexEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //TestPackagePackageImpl
