/**
 * Copyright (c) 2010, 2011 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * 	Obeo - initial API and implementation
 * 
 */
package org.eclipse.mylyn.docs.intent.retro;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mylyn.docs.intent.retro.UnitTest#getJunitClassQualifiedName <em>Junit Class Qualified Name</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.retro.UnitTest#getIsTesting <em>Is Testing</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mylyn.docs.intent.retro.RetroPackage#getUnitTest()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface UnitTest extends CDOObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2010, 2011 Obeo.\r\nAll rights reserved. This program and the accompanying materials\r\nare made available under the terms of the Eclipse Public License v1.0\r\nwhich accompanies this distribution, and is available at\r\nhttp://www.eclipse.org/legal/epl-v10.html\r\n\r\nContributors:\r\n\tObeo - initial API and implementation\r\n";

	/**
	 * Returns the value of the '<em><b>Junit Class Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Junit Class Qualified Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Junit Class Qualified Name</em>' attribute.
	 * @see #setJunitClassQualifiedName(String)
	 * @see org.eclipse.mylyn.docs.intent.retro.RetroPackage#getUnitTest_JunitClassQualifiedName()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getJunitClassQualifiedName();

	/**
	 * Sets the value of the '{@link org.eclipse.mylyn.docs.intent.retro.UnitTest#getJunitClassQualifiedName <em>Junit Class Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Junit Class Qualified Name</em>' attribute.
	 * @see #getJunitClassQualifiedName()
	 * @generated
	 */
	void setJunitClassQualifiedName(String value);

	/**
	 * Returns the value of the '<em><b>Is Testing</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mylyn.docs.intent.retro.API}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.mylyn.docs.intent.retro.API#getTestedBy <em>Tested By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Testing</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Testing</em>' reference list.
	 * @see org.eclipse.mylyn.docs.intent.retro.RetroPackage#getUnitTest_IsTesting()
	 * @see org.eclipse.mylyn.docs.intent.retro.API#getTestedBy
	 * @model opposite="testedBy" required="true"
	 * @generated
	 */
	EList<API> getIsTesting();

} // UnitTest
