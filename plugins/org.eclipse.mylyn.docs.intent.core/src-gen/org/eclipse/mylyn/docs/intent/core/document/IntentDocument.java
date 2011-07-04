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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Intent Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.document.IntentDocument#getChapters <em>Chapters</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.document.IntentDocument#getHeaders <em>Headers</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mylyn.docs.intent.core.document.IntentDocumentPackage#getIntentDocument()
 * @model
 * @generated
 */
public interface IntentDocument extends IntentStructuredElement {
	/**
	 * Returns the value of the '<em><b>Chapters</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mylyn.docs.intent.core.document.IntentChapter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chapters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chapters</em>' containment reference list.
	 * @see org.eclipse.mylyn.docs.intent.core.document.IntentDocumentPackage#getIntentDocument_Chapters()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<IntentChapter> getChapters();

	/**
	 * Returns the value of the '<em><b>Headers</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mylyn.docs.intent.core.document.IntentHeaderDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Headers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Headers</em>' containment reference list.
	 * @see org.eclipse.mylyn.docs.intent.core.document.IntentDocumentPackage#getIntentDocument_Headers()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<IntentHeaderDeclaration> getHeaders();

} // IntentDocument
