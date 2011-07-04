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
package org.eclipse.mylyn.docs.intent.markup.markup.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.mylyn.docs.intent.markup.markup.MarkupPackage;
import org.eclipse.mylyn.docs.intent.markup.markup.TableCell;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table Cell</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mylyn.docs.intent.markup.markup.impl.TableCellImpl#isIsCellHeader <em>Is Cell Header</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.markup.markup.impl.TableCellImpl#getColsPan <em>Cols Pan</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TableCellImpl extends BlockImpl implements TableCell {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableCellImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MarkupPackage.Literals.TABLE_CELL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsCellHeader() {
		return (Boolean)eGet(MarkupPackage.Literals.TABLE_CELL__IS_CELL_HEADER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsCellHeader(boolean newIsCellHeader) {
		eSet(MarkupPackage.Literals.TABLE_CELL__IS_CELL_HEADER, newIsCellHeader);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getColsPan() {
		return (Integer)eGet(MarkupPackage.Literals.TABLE_CELL__COLS_PAN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColsPan(int newColsPan) {
		eSet(MarkupPackage.Literals.TABLE_CELL__COLS_PAN, newColsPan);
	}

} //TableCellImpl
