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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.mylyn.docs.intent.markup.markup.Container;

import org.eclipse.mylyn.docs.intent.markup.wikigen.GenLatexDocument;
import org.eclipse.mylyn.docs.intent.markup.wikigen.WikigenPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Latex Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mylyn.docs.intent.markup.wikigen.impl.GenLatexDocumentImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.markup.wikigen.impl.GenLatexDocumentImpl#getFilename <em>Filename</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.markup.wikigen.impl.GenLatexDocumentImpl#getRoots <em>Roots</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.markup.wikigen.impl.GenLatexDocumentImpl#getAuthors <em>Authors</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenLatexDocumentImpl extends EObjectImpl implements GenLatexDocument {
	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFilename() <em>Filename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilename()
	 * @generated
	 * @ordered
	 */
	protected static final String FILENAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFilename() <em>Filename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilename()
	 * @generated
	 * @ordered
	 */
	protected String filename = FILENAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRoots() <em>Roots</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoots()
	 * @generated
	 * @ordered
	 */
	protected EList<Container> roots;

	/**
	 * The cached value of the '{@link #getAuthors() <em>Authors</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthors()
	 * @generated
	 * @ordered
	 */
	protected EList<String> authors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenLatexDocumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WikigenPackage.Literals.GEN_LATEX_DOCUMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WikigenPackage.GEN_LATEX_DOCUMENT__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFilename() {
		return filename;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilename(String newFilename) {
		String oldFilename = filename;
		filename = newFilename;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WikigenPackage.GEN_LATEX_DOCUMENT__FILENAME, oldFilename, filename));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Container> getRoots() {
		if (roots == null) {
			roots = new EObjectResolvingEList<Container>(Container.class, this, WikigenPackage.GEN_LATEX_DOCUMENT__ROOTS);
		}
		return roots;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getAuthors() {
		if (authors == null) {
			authors = new EDataTypeUniqueEList<String>(String.class, this, WikigenPackage.GEN_LATEX_DOCUMENT__AUTHORS);
		}
		return authors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WikigenPackage.GEN_LATEX_DOCUMENT__TITLE:
				return getTitle();
			case WikigenPackage.GEN_LATEX_DOCUMENT__FILENAME:
				return getFilename();
			case WikigenPackage.GEN_LATEX_DOCUMENT__ROOTS:
				return getRoots();
			case WikigenPackage.GEN_LATEX_DOCUMENT__AUTHORS:
				return getAuthors();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WikigenPackage.GEN_LATEX_DOCUMENT__TITLE:
				setTitle((String)newValue);
				return;
			case WikigenPackage.GEN_LATEX_DOCUMENT__FILENAME:
				setFilename((String)newValue);
				return;
			case WikigenPackage.GEN_LATEX_DOCUMENT__ROOTS:
				getRoots().clear();
				getRoots().addAll((Collection<? extends Container>)newValue);
				return;
			case WikigenPackage.GEN_LATEX_DOCUMENT__AUTHORS:
				getAuthors().clear();
				getAuthors().addAll((Collection<? extends String>)newValue);
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
			case WikigenPackage.GEN_LATEX_DOCUMENT__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case WikigenPackage.GEN_LATEX_DOCUMENT__FILENAME:
				setFilename(FILENAME_EDEFAULT);
				return;
			case WikigenPackage.GEN_LATEX_DOCUMENT__ROOTS:
				getRoots().clear();
				return;
			case WikigenPackage.GEN_LATEX_DOCUMENT__AUTHORS:
				getAuthors().clear();
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
			case WikigenPackage.GEN_LATEX_DOCUMENT__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case WikigenPackage.GEN_LATEX_DOCUMENT__FILENAME:
				return FILENAME_EDEFAULT == null ? filename != null : !FILENAME_EDEFAULT.equals(filename);
			case WikigenPackage.GEN_LATEX_DOCUMENT__ROOTS:
				return roots != null && !roots.isEmpty();
			case WikigenPackage.GEN_LATEX_DOCUMENT__AUTHORS:
				return authors != null && !authors.isEmpty();
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
		result.append(" (title: ");
		result.append(title);
		result.append(", filename: ");
		result.append(filename);
		result.append(", authors: ");
		result.append(authors);
		result.append(')');
		return result.toString();
	}

} //GenLatexDocumentImpl
