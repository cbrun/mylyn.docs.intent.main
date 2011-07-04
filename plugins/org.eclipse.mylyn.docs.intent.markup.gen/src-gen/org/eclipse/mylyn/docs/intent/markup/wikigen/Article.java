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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Article</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mylyn.docs.intent.markup.wikigen.Article#getNbColumns <em>Nb Columns</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.markup.wikigen.Article#isGenerateTOC <em>Generate TOC</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mylyn.docs.intent.markup.wikigen.WikigenPackage#getArticle()
 * @model
 * @generated
 */
public interface Article extends HtmlProfile {
	/**
	 * Returns the value of the '<em><b>Nb Columns</b></em>' attribute.
	 * The default value is <code>"3"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nb Columns</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Columns</em>' attribute.
	 * @see #setNbColumns(int)
	 * @see org.eclipse.mylyn.docs.intent.markup.wikigen.WikigenPackage#getArticle_NbColumns()
	 * @model default="3" required="true"
	 * @generated
	 */
	int getNbColumns();

	/**
	 * Sets the value of the '{@link org.eclipse.mylyn.docs.intent.markup.wikigen.Article#getNbColumns <em>Nb Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Columns</em>' attribute.
	 * @see #getNbColumns()
	 * @generated
	 */
	void setNbColumns(int value);

	/**
	 * Returns the value of the '<em><b>Generate TOC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generate TOC</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generate TOC</em>' attribute.
	 * @see #setGenerateTOC(boolean)
	 * @see org.eclipse.mylyn.docs.intent.markup.wikigen.WikigenPackage#getArticle_GenerateTOC()
	 * @model
	 * @generated
	 */
	boolean isGenerateTOC();

	/**
	 * Sets the value of the '{@link org.eclipse.mylyn.docs.intent.markup.wikigen.Article#isGenerateTOC <em>Generate TOC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generate TOC</em>' attribute.
	 * @see #isGenerateTOC()
	 * @generated
	 */
	void setGenerateTOC(boolean value);

} // Article
