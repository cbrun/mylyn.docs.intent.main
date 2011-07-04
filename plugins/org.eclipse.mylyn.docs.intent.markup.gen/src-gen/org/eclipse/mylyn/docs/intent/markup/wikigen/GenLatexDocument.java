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

import org.eclipse.mylyn.docs.intent.markup.markup.Container;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Latex Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mylyn.docs.intent.markup.wikigen.GenLatexDocument#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.markup.wikigen.GenLatexDocument#getFilename <em>Filename</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.markup.wikigen.GenLatexDocument#getRoots <em>Roots</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.markup.wikigen.GenLatexDocument#getAuthors <em>Authors</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mylyn.docs.intent.markup.wikigen.WikigenPackage#getGenLatexDocument()
 * @model
 * @generated
 */
public interface GenLatexDocument extends EObject {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see org.eclipse.mylyn.docs.intent.markup.wikigen.WikigenPackage#getGenLatexDocument_Title()
	 * @model required="true"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.eclipse.mylyn.docs.intent.markup.wikigen.GenLatexDocument#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

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
	 * @see org.eclipse.mylyn.docs.intent.markup.wikigen.WikigenPackage#getGenLatexDocument_Filename()
	 * @model dataType="org.eclipse.mylyn.docs.intent.markup.wikigen.URI" required="true"
	 * @generated
	 */
	String getFilename();

	/**
	 * Sets the value of the '{@link org.eclipse.mylyn.docs.intent.markup.wikigen.GenLatexDocument#getFilename <em>Filename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filename</em>' attribute.
	 * @see #getFilename()
	 * @generated
	 */
	void setFilename(String value);

	/**
	 * Returns the value of the '<em><b>Roots</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mylyn.docs.intent.markup.markup.Container}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roots</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roots</em>' reference list.
	 * @see org.eclipse.mylyn.docs.intent.markup.wikigen.WikigenPackage#getGenLatexDocument_Roots()
	 * @model
	 * @generated
	 */
	EList<Container> getRoots();

	/**
	 * Returns the value of the '<em><b>Authors</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authors</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authors</em>' attribute list.
	 * @see org.eclipse.mylyn.docs.intent.markup.wikigen.WikigenPackage#getGenLatexDocument_Authors()
	 * @model
	 * @generated
	 */
	EList<String> getAuthors();

} // GenLatexDocument
