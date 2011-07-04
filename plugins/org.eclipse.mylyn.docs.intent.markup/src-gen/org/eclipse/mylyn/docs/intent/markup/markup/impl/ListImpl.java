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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.mylyn.docs.intent.markup.markup.List;
import org.eclipse.mylyn.docs.intent.markup.markup.ListItem;
import org.eclipse.mylyn.docs.intent.markup.markup.ListType;
import org.eclipse.mylyn.docs.intent.markup.markup.MarkupPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mylyn.docs.intent.markup.markup.impl.ListImpl#getListType <em>List Type</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.markup.markup.impl.ListImpl#getItems <em>Items</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.markup.markup.impl.ListImpl#getImbricationLevel <em>Imbrication Level</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ListImpl extends BlockImpl implements List {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MarkupPackage.Literals.LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListType getListType() {
		return (ListType)eGet(MarkupPackage.Literals.LIST__LIST_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListType(ListType newListType) {
		eSet(MarkupPackage.Literals.LIST__LIST_TYPE, newListType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ListItem> getItems() {
		return (EList<ListItem>)eGet(MarkupPackage.Literals.LIST__ITEMS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getImbricationLevel() {
		return (Integer)eGet(MarkupPackage.Literals.LIST__IMBRICATION_LEVEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImbricationLevel(int newImbricationLevel) {
		eSet(MarkupPackage.Literals.LIST__IMBRICATION_LEVEL, newImbricationLevel);
	}

} //ListImpl
