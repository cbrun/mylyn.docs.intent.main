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
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.mylyn.docs.intent.markup.markup.Document;

import org.eclipse.mylyn.docs.intent.markup.wikigen.GenHtmlDocument;
import org.eclipse.mylyn.docs.intent.markup.wikigen.HtmlProfile;
import org.eclipse.mylyn.docs.intent.markup.wikigen.WikigenPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Html Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mylyn.docs.intent.markup.wikigen.impl.GenHtmlDocumentImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.markup.wikigen.impl.GenHtmlDocumentImpl#getRoots <em>Roots</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.markup.wikigen.impl.GenHtmlDocumentImpl#getFilename <em>Filename</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenHtmlDocumentImpl extends EObjectImpl implements GenHtmlDocument {
	/**
	 * The cached value of the '{@link #getStyle() <em>Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected HtmlProfile style;

	/**
	 * The cached value of the '{@link #getRoots() <em>Roots</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoots()
	 * @generated
	 * @ordered
	 */
	protected EList<Document> roots;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenHtmlDocumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WikigenPackage.Literals.GEN_HTML_DOCUMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HtmlProfile getStyle() {
		return style;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStyle(HtmlProfile newStyle, NotificationChain msgs) {
		HtmlProfile oldStyle = style;
		style = newStyle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WikigenPackage.GEN_HTML_DOCUMENT__STYLE, oldStyle, newStyle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyle(HtmlProfile newStyle) {
		if (newStyle != style) {
			NotificationChain msgs = null;
			if (style != null)
				msgs = ((InternalEObject)style).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WikigenPackage.GEN_HTML_DOCUMENT__STYLE, null, msgs);
			if (newStyle != null)
				msgs = ((InternalEObject)newStyle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WikigenPackage.GEN_HTML_DOCUMENT__STYLE, null, msgs);
			msgs = basicSetStyle(newStyle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WikigenPackage.GEN_HTML_DOCUMENT__STYLE, newStyle, newStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Document> getRoots() {
		if (roots == null) {
			roots = new EObjectResolvingEList<Document>(Document.class, this, WikigenPackage.GEN_HTML_DOCUMENT__ROOTS);
		}
		return roots;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WikigenPackage.GEN_HTML_DOCUMENT__FILENAME, oldFilename, filename));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WikigenPackage.GEN_HTML_DOCUMENT__STYLE:
				return basicSetStyle(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WikigenPackage.GEN_HTML_DOCUMENT__STYLE:
				return getStyle();
			case WikigenPackage.GEN_HTML_DOCUMENT__ROOTS:
				return getRoots();
			case WikigenPackage.GEN_HTML_DOCUMENT__FILENAME:
				return getFilename();
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
			case WikigenPackage.GEN_HTML_DOCUMENT__STYLE:
				setStyle((HtmlProfile)newValue);
				return;
			case WikigenPackage.GEN_HTML_DOCUMENT__ROOTS:
				getRoots().clear();
				getRoots().addAll((Collection<? extends Document>)newValue);
				return;
			case WikigenPackage.GEN_HTML_DOCUMENT__FILENAME:
				setFilename((String)newValue);
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
			case WikigenPackage.GEN_HTML_DOCUMENT__STYLE:
				setStyle((HtmlProfile)null);
				return;
			case WikigenPackage.GEN_HTML_DOCUMENT__ROOTS:
				getRoots().clear();
				return;
			case WikigenPackage.GEN_HTML_DOCUMENT__FILENAME:
				setFilename(FILENAME_EDEFAULT);
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
			case WikigenPackage.GEN_HTML_DOCUMENT__STYLE:
				return style != null;
			case WikigenPackage.GEN_HTML_DOCUMENT__ROOTS:
				return roots != null && !roots.isEmpty();
			case WikigenPackage.GEN_HTML_DOCUMENT__FILENAME:
				return FILENAME_EDEFAULT == null ? filename != null : !FILENAME_EDEFAULT.equals(filename);
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
		result.append(" (filename: ");
		result.append(filename);
		result.append(')');
		return result.toString();
	}

} //GenHtmlDocumentImpl
