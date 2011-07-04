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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mylyn.docs.intent.markup.markup.ListItem#isIsList <em>Is List</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mylyn.docs.intent.markup.markup.MarkupPackage#getListItem()
 * @model
 * @generated
 */
public interface ListItem extends Block, List, BlockContent {
	/**
	 * Returns the value of the '<em><b>Is List</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is List</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is List</em>' attribute.
	 * @see #setIsList(boolean)
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.MarkupPackage#getListItem_IsList()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsList();

	/**
	 * Sets the value of the '{@link org.eclipse.mylyn.docs.intent.markup.markup.ListItem#isIsList <em>Is List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is List</em>' attribute.
	 * @see #isIsList()
	 * @generated
	 */
	void setIsList(boolean value);

} // ListItem
