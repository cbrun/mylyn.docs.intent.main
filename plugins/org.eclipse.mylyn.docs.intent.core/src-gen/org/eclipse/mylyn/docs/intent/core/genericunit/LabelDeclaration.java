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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Label Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.genericunit.LabelDeclaration#getLabelValue <em>Label Value</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.genericunit.LabelDeclaration#getTextToPrint <em>Text To Print</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.genericunit.LabelDeclaration#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mylyn.docs.intent.core.genericunit.GenericUnitPackage#getLabelDeclaration()
 * @model
 * @generated
 */
public interface LabelDeclaration extends UnitInstruction {
	/**
	 * Returns the value of the '<em><b>Label Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label Value</em>' attribute.
	 * @see #setLabelValue(String)
	 * @see org.eclipse.mylyn.docs.intent.core.genericunit.GenericUnitPackage#getLabelDeclaration_LabelValue()
	 * @model required="true"
	 * @generated
	 */
	String getLabelValue();

	/**
	 * Sets the value of the '{@link org.eclipse.mylyn.docs.intent.core.genericunit.LabelDeclaration#getLabelValue <em>Label Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label Value</em>' attribute.
	 * @see #getLabelValue()
	 * @generated
	 */
	void setLabelValue(String value);

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
	 * @see org.eclipse.mylyn.docs.intent.core.genericunit.GenericUnitPackage#getLabelDeclaration_TextToPrint()
	 * @model required="true"
	 * @generated
	 */
	String getTextToPrint();

	/**
	 * Sets the value of the '{@link org.eclipse.mylyn.docs.intent.core.genericunit.LabelDeclaration#getTextToPrint <em>Text To Print</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text To Print</em>' attribute.
	 * @see #getTextToPrint()
	 * @generated
	 */
	void setTextToPrint(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.mylyn.docs.intent.core.genericunit.TypeLabel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.mylyn.docs.intent.core.genericunit.TypeLabel
	 * @see #setType(TypeLabel)
	 * @see org.eclipse.mylyn.docs.intent.core.genericunit.GenericUnitPackage#getLabelDeclaration_Type()
	 * @model required="true"
	 * @generated
	 */
	TypeLabel getType();

	/**
	 * Sets the value of the '{@link org.eclipse.mylyn.docs.intent.core.genericunit.LabelDeclaration#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.mylyn.docs.intent.core.genericunit.TypeLabel
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeLabel value);

} // LabelDeclaration
