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
package org.eclipse.mylyn.docs.intent.markup.wikigen.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.mylyn.docs.intent.markup.wikigen.Article;
import org.eclipse.mylyn.docs.intent.markup.wikigen.WikigenPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Article</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mylyn.docs.intent.markup.wikigen.impl.ArticleImpl#getNbColumns <em>Nb Columns</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.markup.wikigen.impl.ArticleImpl#isGenerateTOC <em>Generate TOC</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArticleImpl extends HtmlProfileImpl implements Article {
	/**
	 * The default value of the '{@link #getNbColumns() <em>Nb Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbColumns()
	 * @generated
	 * @ordered
	 */
	protected static final int NB_COLUMNS_EDEFAULT = 3;

	/**
	 * The cached value of the '{@link #getNbColumns() <em>Nb Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbColumns()
	 * @generated
	 * @ordered
	 */
	protected int nbColumns = NB_COLUMNS_EDEFAULT;

	/**
	 * The default value of the '{@link #isGenerateTOC() <em>Generate TOC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerateTOC()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GENERATE_TOC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGenerateTOC() <em>Generate TOC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerateTOC()
	 * @generated
	 * @ordered
	 */
	protected boolean generateTOC = GENERATE_TOC_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArticleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WikigenPackage.Literals.ARTICLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNbColumns() {
		return nbColumns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbColumns(int newNbColumns) {
		int oldNbColumns = nbColumns;
		nbColumns = newNbColumns;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WikigenPackage.ARTICLE__NB_COLUMNS, oldNbColumns, nbColumns));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGenerateTOC() {
		return generateTOC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenerateTOC(boolean newGenerateTOC) {
		boolean oldGenerateTOC = generateTOC;
		generateTOC = newGenerateTOC;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WikigenPackage.ARTICLE__GENERATE_TOC, oldGenerateTOC, generateTOC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WikigenPackage.ARTICLE__NB_COLUMNS:
				return getNbColumns();
			case WikigenPackage.ARTICLE__GENERATE_TOC:
				return isGenerateTOC();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WikigenPackage.ARTICLE__NB_COLUMNS:
				setNbColumns((Integer)newValue);
				return;
			case WikigenPackage.ARTICLE__GENERATE_TOC:
				setGenerateTOC((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case WikigenPackage.ARTICLE__NB_COLUMNS:
				setNbColumns(NB_COLUMNS_EDEFAULT);
				return;
			case WikigenPackage.ARTICLE__GENERATE_TOC:
				setGenerateTOC(GENERATE_TOC_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case WikigenPackage.ARTICLE__NB_COLUMNS:
				return nbColumns != NB_COLUMNS_EDEFAULT;
			case WikigenPackage.ARTICLE__GENERATE_TOC:
				return generateTOC != GENERATE_TOC_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (nbColumns: ");
		result.append(nbColumns);
		result.append(", generateTOC: ");
		result.append(generateTOC);
		result.append(')');
		return result.toString();
	}

} //ArticleImpl
