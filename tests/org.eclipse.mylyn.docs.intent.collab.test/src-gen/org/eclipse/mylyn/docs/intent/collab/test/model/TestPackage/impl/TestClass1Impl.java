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


import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.mylyn.docs.intent.collab.test.model.TestPackage.TestClass1;
import org.eclipse.mylyn.docs.intent.collab.test.model.TestPackage.TestPackagePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Test Class1</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mylyn.docs.intent.collab.test.model.TestPackage.impl.TestClass1Impl#getTheAttributeToListen <em>The Attribute To Listen</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TestClass1Impl extends AbstractTestClassImpl implements TestClass1 {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected TestClass1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestPackagePackage.Literals.TEST_CLASS1;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getTheAttributeToListen() {
		return (String)eGet(TestPackagePackage.Literals.TEST_CLASS1__THE_ATTRIBUTE_TO_LISTEN, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheAttributeToListen(String newTheAttributeToListen) {
		eSet(TestPackagePackage.Literals.TEST_CLASS1__THE_ATTRIBUTE_TO_LISTEN, newTheAttributeToListen);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String testOperation(EList<Integer> testParameter) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.internal.cdo.CDOObjectImpl#toString()
	 */
	@Override
	public String toString() {
		return this.getName() + "/" + this.getTheAttributeToListen();
	}

} // TestClass1Impl
