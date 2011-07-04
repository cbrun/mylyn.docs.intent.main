/**
 * Copyright (c) 2010, 2011 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * 	Obeo - initial API and implementation
 * 
 */
package org.eclipse.mylyn.docs.intent.retro.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import org.eclipse.mylyn.docs.intent.retro.Bundle;
import org.eclipse.mylyn.docs.intent.retro.Category;
import org.eclipse.mylyn.docs.intent.retro.Feature;
import org.eclipse.mylyn.docs.intent.retro.Interaction;
import org.eclipse.mylyn.docs.intent.retro.Product;
import org.eclipse.mylyn.docs.intent.retro.RetroPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mylyn.docs.intent.retro.impl.ProductImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.retro.impl.ProductImpl#getBundles <em>Bundles</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.retro.impl.ProductImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.retro.impl.ProductImpl#getCategories <em>Categories</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.retro.impl.ProductImpl#getInteractions <em>Interactions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProductImpl extends CDOObjectImpl implements Product {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2010, 2011 Obeo.\r\nAll rights reserved. This program and the accompanying materials\r\nare made available under the terms of the Eclipse Public License v1.0\r\nwhich accompanies this distribution, and is available at\r\nhttp://www.eclipse.org/legal/epl-v10.html\r\n\r\nContributors:\r\n\tObeo - initial API and implementation\r\n";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RetroPackage.Literals.PRODUCT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(RetroPackage.Literals.PRODUCT__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(RetroPackage.Literals.PRODUCT__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Bundle> getBundles() {
		return (EList<Bundle>)eGet(RetroPackage.Literals.PRODUCT__BUNDLES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Feature> getFeatures() {
		return (EList<Feature>)eGet(RetroPackage.Literals.PRODUCT__FEATURES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Category> getCategories() {
		return (EList<Category>)eGet(RetroPackage.Literals.PRODUCT__CATEGORIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Interaction> getInteractions() {
		return (EList<Interaction>)eGet(RetroPackage.Literals.PRODUCT__INTERACTIONS, true);
	}

} //ProductImpl
