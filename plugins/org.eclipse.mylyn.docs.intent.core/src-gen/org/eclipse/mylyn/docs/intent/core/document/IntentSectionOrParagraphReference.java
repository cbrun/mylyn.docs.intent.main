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

import org.eclipse.mylyn.docs.intent.markup.markup.StructureElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Intent Section Or Paragraph Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.document.IntentSectionOrParagraphReference#getReferencedObject <em>Referenced Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mylyn.docs.intent.core.document.IntentDocumentPackage#getIntentSectionOrParagraphReference()
 * @model
 * @generated
 */
public interface IntentSectionOrParagraphReference extends IntentReference {
	/**
	 * Returns the value of the '<em><b>Referenced Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Object</em>' reference.
	 * @see #setReferencedObject(StructureElement)
	 * @see org.eclipse.mylyn.docs.intent.core.document.IntentDocumentPackage#getIntentSectionOrParagraphReference_ReferencedObject()
	 * @model
	 * @generated
	 */
	StructureElement getReferencedObject();

	/**
	 * Sets the value of the '{@link org.eclipse.mylyn.docs.intent.core.document.IntentSectionOrParagraphReference#getReferencedObject <em>Referenced Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Object</em>' reference.
	 * @see #getReferencedObject()
	 * @generated
	 */
	void setReferencedObject(StructureElement value);

} // IntentSectionOrParagraphReference
