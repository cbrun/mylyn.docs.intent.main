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
 * A representation of the model object '<em><b>Table Cell</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mylyn.docs.intent.markup.markup.TableCell#isIsCellHeader <em>Is Cell Header</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.markup.markup.TableCell#getColsPan <em>Cols Pan</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mylyn.docs.intent.markup.markup.MarkupPackage#getTableCell()
 * @model
 * @generated
 */
public interface TableCell extends Block, BlockContent {
	/**
	 * Returns the value of the '<em><b>Is Cell Header</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Cell Header</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Cell Header</em>' attribute.
	 * @see #setIsCellHeader(boolean)
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.MarkupPackage#getTableCell_IsCellHeader()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsCellHeader();

	/**
	 * Sets the value of the '{@link org.eclipse.mylyn.docs.intent.markup.markup.TableCell#isIsCellHeader <em>Is Cell Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Cell Header</em>' attribute.
	 * @see #isIsCellHeader()
	 * @generated
	 */
	void setIsCellHeader(boolean value);

	/**
	 * Returns the value of the '<em><b>Cols Pan</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cols Pan</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cols Pan</em>' attribute.
	 * @see #setColsPan(int)
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.MarkupPackage#getTableCell_ColsPan()
	 * @model default="1" required="true"
	 * @generated
	 */
	int getColsPan();

	/**
	 * Sets the value of the '{@link org.eclipse.mylyn.docs.intent.markup.markup.TableCell#getColsPan <em>Cols Pan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cols Pan</em>' attribute.
	 * @see #getColsPan()
	 * @generated
	 */
	void setColsPan(int value);

} // TableCell
