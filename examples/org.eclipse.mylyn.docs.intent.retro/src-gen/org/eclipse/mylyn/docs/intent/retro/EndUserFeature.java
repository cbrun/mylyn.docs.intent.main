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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>End User Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mylyn.docs.intent.retro.EndUserFeature#getIsTestedBy <em>Is Tested By</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.retro.EndUserFeature#getAccessibleThrough <em>Accessible Through</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mylyn.docs.intent.retro.RetroPackage#getEndUserFeature()
 * @model
 * @generated
 */
public interface EndUserFeature extends Feature {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2010, 2011 Obeo.\r\nAll rights reserved. This program and the accompanying materials\r\nare made available under the terms of the Eclipse Public License v1.0\r\nwhich accompanies this distribution, and is available at\r\nhttp://www.eclipse.org/legal/epl-v10.html\r\n\r\nContributors:\r\n\tObeo - initial API and implementation\r\n";

	/**
	 * Returns the value of the '<em><b>Is Tested By</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.mylyn.docs.intent.retro.AcceptanceTest#getIsTesting <em>Is Testing</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Tested By</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Tested By</em>' reference.
	 * @see #setIsTestedBy(AcceptanceTest)
	 * @see org.eclipse.mylyn.docs.intent.retro.RetroPackage#getEndUserFeature_IsTestedBy()
	 * @see org.eclipse.mylyn.docs.intent.retro.AcceptanceTest#getIsTesting
	 * @model opposite="isTesting" required="true"
	 * @generated
	 */
	AcceptanceTest getIsTestedBy();

	/**
	 * Sets the value of the '{@link org.eclipse.mylyn.docs.intent.retro.EndUserFeature#getIsTestedBy <em>Is Tested By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Tested By</em>' reference.
	 * @see #getIsTestedBy()
	 * @generated
	 */
	void setIsTestedBy(AcceptanceTest value);

	/**
	 * Returns the value of the '<em><b>Accessible Through</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accessible Through</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accessible Through</em>' reference.
	 * @see #setAccessibleThrough(Interaction)
	 * @see org.eclipse.mylyn.docs.intent.retro.RetroPackage#getEndUserFeature_AccessibleThrough()
	 * @model required="true"
	 * @generated
	 */
	Interaction getAccessibleThrough();

	/**
	 * Sets the value of the '{@link org.eclipse.mylyn.docs.intent.retro.EndUserFeature#getAccessibleThrough <em>Accessible Through</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accessible Through</em>' reference.
	 * @see #getAccessibleThrough()
	 * @generated
	 */
	void setAccessibleThrough(Interaction value);

} // EndUserFeature
