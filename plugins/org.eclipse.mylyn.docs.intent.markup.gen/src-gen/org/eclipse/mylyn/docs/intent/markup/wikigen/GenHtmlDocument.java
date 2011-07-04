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
package org.eclipse.mylyn.docs.intent.markup.wikigen;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.mylyn.docs.intent.markup.markup.Document;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Html Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mylyn.docs.intent.markup.wikigen.GenHtmlDocument#getStyle <em>Style</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.markup.wikigen.GenHtmlDocument#getRoots <em>Roots</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.markup.wikigen.GenHtmlDocument#getFilename <em>Filename</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mylyn.docs.intent.markup.wikigen.WikigenPackage#getGenHtmlDocument()
 * @model
 * @generated
 */
public interface GenHtmlDocument extends EObject {
	/**
	 * Returns the value of the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style</em>' containment reference.
	 * @see #setStyle(HtmlProfile)
	 * @see org.eclipse.mylyn.docs.intent.markup.wikigen.WikigenPackage#getGenHtmlDocument_Style()
	 * @model containment="true"
	 * @generated
	 */
	HtmlProfile getStyle();

	/**
	 * Sets the value of the '{@link org.eclipse.mylyn.docs.intent.markup.wikigen.GenHtmlDocument#getStyle <em>Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' containment reference.
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(HtmlProfile value);

	/**
	 * Returns the value of the '<em><b>Roots</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mylyn.docs.intent.markup.markup.Document}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roots</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roots</em>' reference list.
	 * @see org.eclipse.mylyn.docs.intent.markup.wikigen.WikigenPackage#getGenHtmlDocument_Roots()
	 * @model
	 * @generated
	 */
	EList<Document> getRoots();

	/**
	 * Returns the value of the '<em><b>Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filename</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filename</em>' attribute.
	 * @see #setFilename(String)
	 * @see org.eclipse.mylyn.docs.intent.markup.wikigen.WikigenPackage#getGenHtmlDocument_Filename()
	 * @model required="true"
	 * @generated
	 */
	String getFilename();

	/**
	 * Sets the value of the '{@link org.eclipse.mylyn.docs.intent.markup.wikigen.GenHtmlDocument#getFilename <em>Filename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filename</em>' attribute.
	 * @see #getFilename()
	 * @generated
	 */
	void setFilename(String value);

} // GenHtmlDocument
