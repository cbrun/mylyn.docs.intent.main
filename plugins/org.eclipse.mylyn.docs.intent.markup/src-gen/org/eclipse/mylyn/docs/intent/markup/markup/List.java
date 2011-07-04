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
 * A representation of the model object '<em><b>List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mylyn.docs.intent.markup.markup.List#getListType <em>List Type</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.markup.markup.List#getItems <em>Items</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.markup.markup.List#getImbricationLevel <em>Imbrication Level</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mylyn.docs.intent.markup.markup.MarkupPackage#getList()
 * @model
 * @generated
 */
public interface List extends Block {
	/**
	 * Returns the value of the '<em><b>List Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.mylyn.docs.intent.markup.markup.ListType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Type</em>' attribute.
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.ListType
	 * @see #setListType(ListType)
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.MarkupPackage#getList_ListType()
	 * @model required="true"
	 * @generated
	 */
	ListType getListType();

	/**
	 * Sets the value of the '{@link org.eclipse.mylyn.docs.intent.markup.markup.List#getListType <em>List Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Type</em>' attribute.
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.ListType
	 * @see #getListType()
	 * @generated
	 */
	void setListType(ListType value);

	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mylyn.docs.intent.markup.markup.ListItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Items</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.MarkupPackage#getList_Items()
	 * @model containment="true"
	 * @generated
	 */
	EList<ListItem> getItems();

	/**
	 * Returns the value of the '<em><b>Imbrication Level</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imbrication Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imbrication Level</em>' attribute.
	 * @see #setImbricationLevel(int)
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.MarkupPackage#getList_ImbricationLevel()
	 * @model default="1" required="true"
	 * @generated
	 */
	int getImbricationLevel();

	/**
	 * Sets the value of the '{@link org.eclipse.mylyn.docs.intent.markup.markup.List#getImbricationLevel <em>Imbrication Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imbrication Level</em>' attribute.
	 * @see #getImbricationLevel()
	 * @generated
	 */
	void setImbricationLevel(int value);

} // List
