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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>API</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mylyn.docs.intent.retro.API#getAvailableThrough <em>Available Through</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.retro.API#getTestedBy <em>Tested By</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mylyn.docs.intent.retro.RetroPackage#getAPI()
 * @model
 * @generated
 */
public interface API extends DevelopperFeature {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2010, 2011 Obeo.\r\nAll rights reserved. This program and the accompanying materials\r\nare made available under the terms of the Eclipse Public License v1.0\r\nwhich accompanies this distribution, and is available at\r\nhttp://www.eclipse.org/legal/epl-v10.html\r\n\r\nContributors:\r\n\tObeo - initial API and implementation\r\n";

	/**
	 * Returns the value of the '<em><b>Available Through</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mylyn.docs.intent.retro.NameSpace}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Available Through</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Available Through</em>' reference list.
	 * @see org.eclipse.mylyn.docs.intent.retro.RetroPackage#getAPI_AvailableThrough()
	 * @model required="true"
	 * @generated
	 */
	EList<NameSpace> getAvailableThrough();

	/**
	 * Returns the value of the '<em><b>Tested By</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mylyn.docs.intent.retro.UnitTest}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.mylyn.docs.intent.retro.UnitTest#getIsTesting <em>Is Testing</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tested By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tested By</em>' reference list.
	 * @see org.eclipse.mylyn.docs.intent.retro.RetroPackage#getAPI_TestedBy()
	 * @see org.eclipse.mylyn.docs.intent.retro.UnitTest#getIsTesting
	 * @model opposite="isTesting"
	 * @generated
	 */
	EList<UnitTest> getTestedBy();

} // API
