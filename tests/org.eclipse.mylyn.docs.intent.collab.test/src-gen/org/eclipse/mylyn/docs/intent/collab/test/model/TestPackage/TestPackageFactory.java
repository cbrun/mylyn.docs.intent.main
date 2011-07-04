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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.mylyn.docs.intent.collab.test.model.TestPackage.TestPackagePackage
 * @generated
 */
public interface TestPackageFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TestPackageFactory eINSTANCE = org.eclipse.mylyn.docs.intent.collab.test.model.TestPackage.impl.TestPackageFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Test Class1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Class1</em>'.
	 * @generated
	 */
	TestClass1 createTestClass1();

	/**
	 * Returns a new object of class '<em>Test Class2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Class2</em>'.
	 * @generated
	 */
	TestClass2 createTestClass2();

	/**
	 * Returns a new object of class '<em>Test Index</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Index</em>'.
	 * @generated
	 */
	TestIndex createTestIndex();

	/**
	 * Returns a new object of class '<em>Test Index Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Index Entry</em>'.
	 * @generated
	 */
	TestIndexEntry createTestIndexEntry();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TestPackagePackage getTestPackagePackage();

} //TestPackageFactory
