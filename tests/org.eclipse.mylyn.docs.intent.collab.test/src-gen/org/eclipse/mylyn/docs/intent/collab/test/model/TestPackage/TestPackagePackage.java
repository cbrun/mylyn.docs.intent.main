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
package org.eclipse.mylyn.docs.intent.collab.test.model.TestPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.mylyn.docs.intent.collab.test.model.TestPackage.TestPackageFactory
 * @model kind="package"
 * @generated
 */
public interface TestPackagePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "TestPackage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/intent/testpackage/0.7";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "testPackage";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TestPackagePackage eINSTANCE = org.eclipse.mylyn.docs.intent.collab.test.model.TestPackage.impl.TestPackagePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.collab.test.model.TestPackage.impl.AbstractTestClassImpl <em>Abstract Test Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.collab.test.model.TestPackage.impl.AbstractTestClassImpl
	 * @see org.eclipse.mylyn.docs.intent.collab.test.model.TestPackage.impl.TestPackagePackageImpl#getAbstractTestClass()
	 * @generated
	 */
	int ABSTRACT_TEST_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TEST_CLASS__NAME = 0;

	/**
	 * The number of structural features of the '<em>Abstract Test Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TEST_CLASS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.collab.test.model.TestPackage.impl.TestClass1Impl <em>Test Class1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.collab.test.model.TestPackage.impl.TestClass1Impl
	 * @see org.eclipse.mylyn.docs.intent.collab.test.model.TestPackage.impl.TestPackagePackageImpl#getTestClass1()
	 * @generated
	 */
	int TEST_CLASS1 = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS1__NAME = ABSTRACT_TEST_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>The Attribute To Listen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS1__THE_ATTRIBUTE_TO_LISTEN = ABSTRACT_TEST_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Test Class1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS1_FEATURE_COUNT = ABSTRACT_TEST_CLASS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.collab.test.model.TestPackage.impl.TestClass2Impl <em>Test Class2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.collab.test.model.TestPackage.impl.TestClass2Impl
	 * @see org.eclipse.mylyn.docs.intent.collab.test.model.TestPackage.impl.TestPackagePackageImpl#getTestClass2()
	 * @generated
	 */
	int TEST_CLASS2 = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS2__NAME = ABSTRACT_TEST_CLASS__NAME;

	/**
	 * The number of structural features of the '<em>Test Class2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS2_FEATURE_COUNT = ABSTRACT_TEST_CLASS_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.collab.test.model.TestPackage.impl.TestIndexImpl <em>Test Index</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.collab.test.model.TestPackage.impl.TestIndexImpl
	 * @see org.eclipse.mylyn.docs.intent.collab.test.model.TestPackage.impl.TestPackagePackageImpl#getTestIndex()
	 * @generated
	 */
	int TEST_INDEX = 3;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_INDEX__ENTRIES = 0;

	/**
	 * The number of structural features of the '<em>Test Index</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_INDEX_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.collab.test.model.TestPackage.impl.TestIndexEntryImpl <em>Test Index Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.collab.test.model.TestPackage.impl.TestIndexEntryImpl
	 * @see org.eclipse.mylyn.docs.intent.collab.test.model.TestPackage.impl.TestPackagePackageImpl#getTestIndexEntry()
	 * @generated
	 */
	int TEST_INDEX_ENTRY = 4;

	/**
	 * The feature id for the '<em><b>Referenced Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_INDEX_ENTRY__REFERENCED_ELEMENT = 0;

	/**
	 * The number of structural features of the '<em>Test Index Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_INDEX_ENTRY_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link org.eclipse.mylyn.docs.intent.collab.test.model.TestPackage.AbstractTestClass <em>Abstract Test Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Test Class</em>'.
	 * @see org.eclipse.mylyn.docs.intent.collab.test.model.TestPackage.AbstractTestClass
	 * @generated
	 */
	EClass getAbstractTestClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mylyn.docs.intent.collab.test.model.TestPackage.AbstractTestClass#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.mylyn.docs.intent.collab.test.model.TestPackage.AbstractTestClass#getName()
	 * @see #getAbstractTestClass()
	 * @generated
	 */
	EAttribute getAbstractTestClass_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mylyn.docs.intent.collab.test.model.TestPackage.TestClass1 <em>Test Class1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Class1</em>'.
	 * @see org.eclipse.mylyn.docs.intent.collab.test.model.TestPackage.TestClass1
	 * @generated
	 */
	EClass getTestClass1();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mylyn.docs.intent.collab.test.model.TestPackage.TestClass1#getTheAttributeToListen <em>The Attribute To Listen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>The Attribute To Listen</em>'.
	 * @see org.eclipse.mylyn.docs.intent.collab.test.model.TestPackage.TestClass1#getTheAttributeToListen()
	 * @see #getTestClass1()
	 * @generated
	 */
	EAttribute getTestClass1_TheAttributeToListen();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mylyn.docs.intent.collab.test.model.TestPackage.TestClass2 <em>Test Class2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Class2</em>'.
	 * @see org.eclipse.mylyn.docs.intent.collab.test.model.TestPackage.TestClass2
	 * @generated
	 */
	EClass getTestClass2();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mylyn.docs.intent.collab.test.model.TestPackage.TestIndex <em>Test Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Index</em>'.
	 * @see org.eclipse.mylyn.docs.intent.collab.test.model.TestPackage.TestIndex
	 * @generated
	 */
	EClass getTestIndex();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.mylyn.docs.intent.collab.test.model.TestPackage.TestIndex#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entries</em>'.
	 * @see org.eclipse.mylyn.docs.intent.collab.test.model.TestPackage.TestIndex#getEntries()
	 * @see #getTestIndex()
	 * @generated
	 */
	EReference getTestIndex_Entries();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mylyn.docs.intent.collab.test.model.TestPackage.TestIndexEntry <em>Test Index Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Index Entry</em>'.
	 * @see org.eclipse.mylyn.docs.intent.collab.test.model.TestPackage.TestIndexEntry
	 * @generated
	 */
	EClass getTestIndexEntry();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mylyn.docs.intent.collab.test.model.TestPackage.TestIndexEntry#getReferencedElement <em>Referenced Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced Element</em>'.
	 * @see org.eclipse.mylyn.docs.intent.collab.test.model.TestPackage.TestIndexEntry#getReferencedElement()
	 * @see #getTestIndexEntry()
	 * @generated
	 */
	EReference getTestIndexEntry_ReferencedElement();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TestPackageFactory getTestPackageFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.collab.test.model.TestPackage.impl.AbstractTestClassImpl <em>Abstract Test Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.collab.test.model.TestPackage.impl.AbstractTestClassImpl
		 * @see org.eclipse.mylyn.docs.intent.collab.test.model.TestPackage.impl.TestPackagePackageImpl#getAbstractTestClass()
		 * @generated
		 */
		EClass ABSTRACT_TEST_CLASS = eINSTANCE.getAbstractTestClass();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_TEST_CLASS__NAME = eINSTANCE.getAbstractTestClass_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.collab.test.model.TestPackage.impl.TestClass1Impl <em>Test Class1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.collab.test.model.TestPackage.impl.TestClass1Impl
		 * @see org.eclipse.mylyn.docs.intent.collab.test.model.TestPackage.impl.TestPackagePackageImpl#getTestClass1()
		 * @generated
		 */
		EClass TEST_CLASS1 = eINSTANCE.getTestClass1();

		/**
		 * The meta object literal for the '<em><b>The Attribute To Listen</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS1__THE_ATTRIBUTE_TO_LISTEN = eINSTANCE.getTestClass1_TheAttributeToListen();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.collab.test.model.TestPackage.impl.TestClass2Impl <em>Test Class2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.collab.test.model.TestPackage.impl.TestClass2Impl
		 * @see org.eclipse.mylyn.docs.intent.collab.test.model.TestPackage.impl.TestPackagePackageImpl#getTestClass2()
		 * @generated
		 */
		EClass TEST_CLASS2 = eINSTANCE.getTestClass2();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.collab.test.model.TestPackage.impl.TestIndexImpl <em>Test Index</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.collab.test.model.TestPackage.impl.TestIndexImpl
		 * @see org.eclipse.mylyn.docs.intent.collab.test.model.TestPackage.impl.TestPackagePackageImpl#getTestIndex()
		 * @generated
		 */
		EClass TEST_INDEX = eINSTANCE.getTestIndex();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_INDEX__ENTRIES = eINSTANCE.getTestIndex_Entries();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.collab.test.model.TestPackage.impl.TestIndexEntryImpl <em>Test Index Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.collab.test.model.TestPackage.impl.TestIndexEntryImpl
		 * @see org.eclipse.mylyn.docs.intent.collab.test.model.TestPackage.impl.TestPackagePackageImpl#getTestIndexEntry()
		 * @generated
		 */
		EClass TEST_INDEX_ENTRY = eINSTANCE.getTestIndexEntry();

		/**
		 * The meta object literal for the '<em><b>Referenced Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_INDEX_ENTRY__REFERENCED_ELEMENT = eINSTANCE.getTestIndexEntry_ReferencedElement();

	}

} //TestPackagePackage
