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
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.mylyn.docs.intent.markup.markup.Annotations;
import org.eclipse.mylyn.docs.intent.markup.markup.MarkupPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Annotations</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mylyn.docs.intent.markup.markup.impl.AnnotationsImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.markup.markup.impl.AnnotationsImpl#getCSSStyle <em>CSS Style</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.markup.markup.impl.AnnotationsImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.markup.markup.impl.AnnotationsImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.markup.markup.impl.AnnotationsImpl#getCSSClass <em>CSS Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnnotationsImpl extends CDOObjectImpl implements Annotations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MarkupPackage.Literals.ANNOTATIONS;
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
	public String getId() {
		return (String)eGet(MarkupPackage.Literals.ANNOTATIONS__ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		eSet(MarkupPackage.Literals.ANNOTATIONS__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCSSStyle() {
		return (String)eGet(MarkupPackage.Literals.ANNOTATIONS__CSS_STYLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCSSStyle(String newCSSStyle) {
		eSet(MarkupPackage.Literals.ANNOTATIONS__CSS_STYLE, newCSSStyle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLanguage() {
		return (String)eGet(MarkupPackage.Literals.ANNOTATIONS__LANGUAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguage(String newLanguage) {
		eSet(MarkupPackage.Literals.ANNOTATIONS__LANGUAGE, newLanguage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return (String)eGet(MarkupPackage.Literals.ANNOTATIONS__TITLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		eSet(MarkupPackage.Literals.ANNOTATIONS__TITLE, newTitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCSSClass() {
		return (String)eGet(MarkupPackage.Literals.ANNOTATIONS__CSS_CLASS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCSSClass(String newCSSClass) {
		eSet(MarkupPackage.Literals.ANNOTATIONS__CSS_CLASS, newCSSClass);
	}

} //AnnotationsImpl
