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
package org.eclipse.mylyn.docs.intent.core.document;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Intent Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.document.IntentReference#getIntentHref <em>Intent Href</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mylyn.docs.intent.core.document.IntentDocumentPackage#getIntentReference()
 * @model abstract="true"
 * @extends CDOObject
 * @generated
 */
public interface IntentReference extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Intent Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Href</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intent Href</em>' attribute.
	 * @see #setIntentHref(String)
	 * @see org.eclipse.mylyn.docs.intent.core.document.IntentDocumentPackage#getIntentReference_IntentHref()
	 * @model
	 * @generated
	 */
	String getIntentHref();

	/**
	 * Sets the value of the '{@link org.eclipse.mylyn.docs.intent.core.document.IntentReference#getIntentHref <em>Intent Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intent Href</em>' attribute.
	 * @see #getIntentHref()
	 * @generated
	 */
	void setIntentHref(String value);

} // IntentReference
