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


import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.mylyn.docs.intent.collab.test.model.TestPackage.TestClass1;
import org.eclipse.mylyn.docs.intent.collab.test.model.TestPackage.TestClass2;
import org.eclipse.mylyn.docs.intent.collab.test.model.TestPackage.TestIndex;
import org.eclipse.mylyn.docs.intent.collab.test.model.TestPackage.TestIndexEntry;
import org.eclipse.mylyn.docs.intent.collab.test.model.TestPackage.TestPackageFactory;
import org.eclipse.mylyn.docs.intent.collab.test.model.TestPackage.TestPackagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TestPackageFactoryImpl extends EFactoryImpl implements TestPackageFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TestPackageFactory init() {
		try {
			TestPackageFactory theTestPackageFactory = (TestPackageFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/intent/testpackage/0.7"); 
			if (theTestPackageFactory != null) {
				return theTestPackageFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TestPackageFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestPackageFactoryImpl() {
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
			case TestPackagePackage.TEST_CLASS1: return (EObject)createTestClass1();
			case TestPackagePackage.TEST_CLASS2: return (EObject)createTestClass2();
			case TestPackagePackage.TEST_INDEX: return (EObject)createTestIndex();
			case TestPackagePackage.TEST_INDEX_ENTRY: return (EObject)createTestIndexEntry();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestClass1 createTestClass1() {
		TestClass1Impl testClass1 = new TestClass1Impl();
		return testClass1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestClass2 createTestClass2() {
		TestClass2Impl testClass2 = new TestClass2Impl();
		return testClass2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestIndex createTestIndex() {
		TestIndexImpl testIndex = new TestIndexImpl();
		return testIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestIndexEntry createTestIndexEntry() {
		TestIndexEntryImpl testIndexEntry = new TestIndexEntryImpl();
		return testIndexEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestPackagePackage getTestPackagePackage() {
		return (TestPackagePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TestPackagePackage getPackage() {
		return TestPackagePackage.eINSTANCE;
	}

} //TestPackageFactoryImpl
