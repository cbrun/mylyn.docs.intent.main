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
import org.eclipse.mylyn.docs.intent.markup.markup.BlockContent;
import org.eclipse.mylyn.docs.intent.markup.markup.List;
import org.eclipse.mylyn.docs.intent.markup.markup.ListItem;
import org.eclipse.mylyn.docs.intent.markup.markup.ListType;
import org.eclipse.mylyn.docs.intent.markup.markup.MarkupPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mylyn.docs.intent.markup.markup.impl.ListItemImpl#getListType <em>List Type</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.markup.markup.impl.ListItemImpl#getItems <em>Items</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.markup.markup.impl.ListItemImpl#getImbricationLevel <em>Imbrication Level</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.markup.markup.impl.ListItemImpl#isIsList <em>Is List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ListItemImpl extends BlockImpl implements ListItem {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MarkupPackage.Literals.LIST_ITEM;
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsList() {
		return (Boolean)eGet(MarkupPackage.Literals.LIST_ITEM__IS_LIST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsList(boolean newIsList) {
		eSet(MarkupPackage.Literals.LIST_ITEM__IS_LIST, newIsList);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == List.class) {
			switch (derivedFeatureID) {
				case MarkupPackage.LIST_ITEM__LIST_TYPE: return MarkupPackage.LIST__LIST_TYPE;
				case MarkupPackage.LIST_ITEM__ITEMS: return MarkupPackage.LIST__ITEMS;
				case MarkupPackage.LIST_ITEM__IMBRICATION_LEVEL: return MarkupPackage.LIST__IMBRICATION_LEVEL;
				default: return -1;
			}
		}
		if (baseClass == BlockContent.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == List.class) {
			switch (baseFeatureID) {
				case MarkupPackage.LIST__LIST_TYPE: return MarkupPackage.LIST_ITEM__LIST_TYPE;
				case MarkupPackage.LIST__ITEMS: return MarkupPackage.LIST_ITEM__ITEMS;
				case MarkupPackage.LIST__IMBRICATION_LEVEL: return MarkupPackage.LIST_ITEM__IMBRICATION_LEVEL;
				default: return -1;
			}
		}
		if (baseClass == BlockContent.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ListItemImpl
