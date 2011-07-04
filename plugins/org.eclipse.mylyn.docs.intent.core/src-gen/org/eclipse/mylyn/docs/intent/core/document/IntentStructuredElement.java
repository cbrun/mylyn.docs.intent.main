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

import org.eclipse.mylyn.docs.intent.markup.markup.Section;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Intent Structured Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.document.IntentStructuredElement#getFormattedTitle <em>Formatted Title</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mylyn.docs.intent.core.document.IntentDocumentPackage#getIntentStructuredElement()
 * @model abstract="true"
 * @generated
 */
public interface IntentStructuredElement extends Section, IntentGenericElement {
	/**
	 * Returns the value of the '<em><b>Formatted Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formatted Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formatted Title</em>' attribute.
	 * @see #setFormattedTitle(String)
	 * @see org.eclipse.mylyn.docs.intent.core.document.IntentDocumentPackage#getIntentStructuredElement_FormattedTitle()
	 * @model id="true" derived="true"
	 * @generated
	 */
	String getFormattedTitle();

	/**
	 * Sets the value of the '{@link org.eclipse.mylyn.docs.intent.core.document.IntentStructuredElement#getFormattedTitle <em>Formatted Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Formatted Title</em>' attribute.
	 * @see #getFormattedTitle()
	 * @generated
	 */
	void setFormattedTitle(String value);

} // IntentStructuredElement
