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
package org.eclipse.mylyn.docs.intent.core.genericunit;

import org.eclipse.mylyn.docs.intent.core.document.IntentSectionOrParagraphReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Intent Section Reference Instruction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.genericunit.IntentSectionReferenceInstruction#getReferencedObject <em>Referenced Object</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.genericunit.IntentSectionReferenceInstruction#getTextToPrint <em>Text To Print</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mylyn.docs.intent.core.genericunit.GenericUnitPackage#getIntentSectionReferenceInstruction()
 * @model
 * @generated
 */
public interface IntentSectionReferenceInstruction extends UnitInstruction {
	/**
	 * Returns the value of the '<em><b>Referenced Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Object</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Object</em>' containment reference.
	 * @see #setReferencedObject(IntentSectionOrParagraphReference)
	 * @see org.eclipse.mylyn.docs.intent.core.genericunit.GenericUnitPackage#getIntentSectionReferenceInstruction_ReferencedObject()
	 * @model containment="true" resolveProxies="true" required="true"
	 * @generated
	 */
	IntentSectionOrParagraphReference getReferencedObject();

	/**
	 * Sets the value of the '{@link org.eclipse.mylyn.docs.intent.core.genericunit.IntentSectionReferenceInstruction#getReferencedObject <em>Referenced Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Object</em>' containment reference.
	 * @see #getReferencedObject()
	 * @generated
	 */
	void setReferencedObject(IntentSectionOrParagraphReference value);

	/**
	 * Returns the value of the '<em><b>Text To Print</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text To Print</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text To Print</em>' attribute.
	 * @see #setTextToPrint(String)
	 * @see org.eclipse.mylyn.docs.intent.core.genericunit.GenericUnitPackage#getIntentSectionReferenceInstruction_TextToPrint()
	 * @model
	 * @generated
	 */
	String getTextToPrint();

	/**
	 * Sets the value of the '{@link org.eclipse.mylyn.docs.intent.core.genericunit.IntentSectionReferenceInstruction#getTextToPrint <em>Text To Print</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text To Print</em>' attribute.
	 * @see #getTextToPrint()
	 * @generated
	 */
	void setTextToPrint(String value);

} // IntentSectionReferenceInstruction
