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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Class1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mylyn.docs.intent.collab.test.model.TestPackage.TestClass1#getTheAttributeToListen <em>The Attribute To Listen</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mylyn.docs.intent.collab.test.model.TestPackage.TestPackagePackage#getTestClass1()
 * @model
 * @generated
 */
public interface TestClass1 extends AbstractTestClass {
	/**
	 * Returns the value of the '<em><b>The Attribute To Listen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Attribute To Listen</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Attribute To Listen</em>' attribute.
	 * @see #setTheAttributeToListen(String)
	 * @see org.eclipse.mylyn.docs.intent.collab.test.model.TestPackage.TestPackagePackage#getTestClass1_TheAttributeToListen()
	 * @model
	 * @generated
	 */
	String getTheAttributeToListen();

	/**
	 * Sets the value of the '{@link org.eclipse.mylyn.docs.intent.collab.test.model.TestPackage.TestClass1#getTheAttributeToListen <em>The Attribute To Listen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Attribute To Listen</em>' attribute.
	 * @see #getTheAttributeToListen()
	 * @generated
	 */
	void setTheAttributeToListen(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" testParameterMany="true"
	 * @generated
	 */
	String testOperation(EList<Integer> testParameter);

} // TestClass1
