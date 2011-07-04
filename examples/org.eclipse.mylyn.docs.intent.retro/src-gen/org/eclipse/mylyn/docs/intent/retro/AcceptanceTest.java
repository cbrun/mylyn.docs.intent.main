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
 * A representation of the model object '<em><b>Acceptance Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mylyn.docs.intent.retro.AcceptanceTest#getSwtBotClassName <em>Swt Bot Class Name</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.retro.AcceptanceTest#getIsTesting <em>Is Testing</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.retro.AcceptanceTest#getPackage <em>Package</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mylyn.docs.intent.retro.RetroPackage#getAcceptanceTest()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface AcceptanceTest extends CDOObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2010, 2011 Obeo.\r\nAll rights reserved. This program and the accompanying materials\r\nare made available under the terms of the Eclipse Public License v1.0\r\nwhich accompanies this distribution, and is available at\r\nhttp://www.eclipse.org/legal/epl-v10.html\r\n\r\nContributors:\r\n\tObeo - initial API and implementation\r\n";

	/**
	 * Returns the value of the '<em><b>Swt Bot Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Swt Bot Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Swt Bot Class Name</em>' attribute.
	 * @see #setSwtBotClassName(String)
	 * @see org.eclipse.mylyn.docs.intent.retro.RetroPackage#getAcceptanceTest_SwtBotClassName()
	 * @model
	 * @generated
	 */
	String getSwtBotClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.mylyn.docs.intent.retro.AcceptanceTest#getSwtBotClassName <em>Swt Bot Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Swt Bot Class Name</em>' attribute.
	 * @see #getSwtBotClassName()
	 * @generated
	 */
	void setSwtBotClassName(String value);

	/**
	 * Returns the value of the '<em><b>Is Testing</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mylyn.docs.intent.retro.EndUserFeature}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.mylyn.docs.intent.retro.EndUserFeature#getIsTestedBy <em>Is Tested By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Testing</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Testing</em>' reference list.
	 * @see org.eclipse.mylyn.docs.intent.retro.RetroPackage#getAcceptanceTest_IsTesting()
	 * @see org.eclipse.mylyn.docs.intent.retro.EndUserFeature#getIsTestedBy
	 * @model opposite="isTestedBy"
	 * @generated
	 */
	EList<EndUserFeature> getIsTesting();

	/**
	 * Returns the value of the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' attribute.
	 * @see #setPackage(String)
	 * @see org.eclipse.mylyn.docs.intent.retro.RetroPackage#getAcceptanceTest_Package()
	 * @model
	 * @generated
	 */
	String getPackage();

	/**
	 * Sets the value of the '{@link org.eclipse.mylyn.docs.intent.retro.AcceptanceTest#getPackage <em>Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' attribute.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(String value);

} // AcceptanceTest
