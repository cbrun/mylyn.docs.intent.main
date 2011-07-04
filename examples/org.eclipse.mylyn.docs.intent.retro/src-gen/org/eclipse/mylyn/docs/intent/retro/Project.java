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
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mylyn.docs.intent.retro.Project#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.retro.Project#getUnitTests <em>Unit Tests</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.retro.Project#getAcceptanceTests <em>Acceptance Tests</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mylyn.docs.intent.retro.RetroPackage#getProject()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Project extends CDOObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2010, 2011 Obeo.\r\nAll rights reserved. This program and the accompanying materials\r\nare made available under the terms of the Eclipse Public License v1.0\r\nwhich accompanies this distribution, and is available at\r\nhttp://www.eclipse.org/legal/epl-v10.html\r\n\r\nContributors:\r\n\tObeo - initial API and implementation\r\n";

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.eclipse.mylyn.docs.intent.retro.RetroPackage#getProject_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.mylyn.docs.intent.retro.Project#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Unit Tests</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mylyn.docs.intent.retro.UnitTest}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit Tests</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit Tests</em>' containment reference list.
	 * @see org.eclipse.mylyn.docs.intent.retro.RetroPackage#getProject_UnitTests()
	 * @model containment="true" keys="junitClassQualifiedName"
	 * @generated
	 */
	EList<UnitTest> getUnitTests();

	/**
	 * Returns the value of the '<em><b>Acceptance Tests</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mylyn.docs.intent.retro.AcceptanceTest}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Acceptance Tests</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acceptance Tests</em>' containment reference list.
	 * @see org.eclipse.mylyn.docs.intent.retro.RetroPackage#getProject_AcceptanceTests()
	 * @model containment="true" keys="swtBotClassName"
	 * @generated
	 */
	EList<AcceptanceTest> getAcceptanceTests();

} // Project
