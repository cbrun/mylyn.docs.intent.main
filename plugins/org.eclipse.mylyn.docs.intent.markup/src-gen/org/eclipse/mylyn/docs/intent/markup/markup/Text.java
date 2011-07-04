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
package org.eclipse.mylyn.docs.intent.markup.markup;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mylyn.docs.intent.markup.markup.Text#getData <em>Data</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.markup.markup.Text#getFormat <em>Format</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.markup.markup.Text#isLineBreak <em>Line Break</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mylyn.docs.intent.markup.markup.MarkupPackage#getText()
 * @model
 * @generated
 */
public interface Text extends BlockContent, HasAttributes {
	/**
	 * Returns the value of the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' attribute.
	 * @see #setData(String)
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.MarkupPackage#getText_Data()
	 * @model required="true"
	 * @generated
	 */
	String getData();

	/**
	 * Sets the value of the '{@link org.eclipse.mylyn.docs.intent.markup.markup.Text#getData <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' attribute.
	 * @see #getData()
	 * @generated
	 */
	void setData(String value);

	/**
	 * Returns the value of the '<em><b>Format</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.mylyn.docs.intent.markup.markup.Formatting}.
	 * The literals are from the enumeration {@link org.eclipse.mylyn.docs.intent.markup.markup.Formatting}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Format</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format</em>' attribute list.
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.Formatting
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.MarkupPackage#getText_Format()
	 * @model required="true"
	 * @generated
	 */
	EList<Formatting> getFormat();

	/**
	 * Returns the value of the '<em><b>Line Break</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Break</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Break</em>' attribute.
	 * @see #setLineBreak(boolean)
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.MarkupPackage#getText_LineBreak()
	 * @model
	 * @generated
	 */
	boolean isLineBreak();

	/**
	 * Sets the value of the '{@link org.eclipse.mylyn.docs.intent.markup.markup.Text#isLineBreak <em>Line Break</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Break</em>' attribute.
	 * @see #isLineBreak()
	 * @generated
	 */
	void setLineBreak(boolean value);

} // Text
