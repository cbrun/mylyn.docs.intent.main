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
package org.eclipse.mylyn.docs.intent.markup.markup;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mylyn.docs.intent.markup.markup.Link#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.markup.markup.Link#getHrefOrHashName <em>Href Or Hash Name</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.markup.markup.Link#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.markup.markup.Link#isHasBeenDeclaredWithHTMLSyntax <em>Has Been Declared With HTML Syntax</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mylyn.docs.intent.markup.markup.MarkupPackage#getLink()
 * @model
 * @generated
 */
public interface Link extends BlockContent, HasAttributes {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(Block)
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.MarkupPackage#getLink_Name()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Block getName();

	/**
	 * Sets the value of the '{@link org.eclipse.mylyn.docs.intent.markup.markup.Link#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(Block value);

	/**
	 * Returns the value of the '<em><b>Href Or Hash Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Href Or Hash Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Href Or Hash Name</em>' attribute.
	 * @see #setHrefOrHashName(String)
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.MarkupPackage#getLink_HrefOrHashName()
	 * @model required="true"
	 * @generated
	 */
	String getHrefOrHashName();

	/**
	 * Sets the value of the '{@link org.eclipse.mylyn.docs.intent.markup.markup.Link#getHrefOrHashName <em>Href Or Hash Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Href Or Hash Name</em>' attribute.
	 * @see #getHrefOrHashName()
	 * @generated
	 */
	void setHrefOrHashName(String value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(HasAttributes)
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.MarkupPackage#getLink_Target()
	 * @model
	 * @generated
	 */
	HasAttributes getTarget();

	/**
	 * Sets the value of the '{@link org.eclipse.mylyn.docs.intent.markup.markup.Link#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(HasAttributes value);

	/**
	 * Returns the value of the '<em><b>Has Been Declared With HTML Syntax</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Been Declared With HTML Syntax</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Been Declared With HTML Syntax</em>' attribute.
	 * @see #setHasBeenDeclaredWithHTMLSyntax(boolean)
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.MarkupPackage#getLink_HasBeenDeclaredWithHTMLSyntax()
	 * @model default="false"
	 * @generated
	 */
	boolean isHasBeenDeclaredWithHTMLSyntax();

	/**
	 * Sets the value of the '{@link org.eclipse.mylyn.docs.intent.markup.markup.Link#isHasBeenDeclaredWithHTMLSyntax <em>Has Been Declared With HTML Syntax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Been Declared With HTML Syntax</em>' attribute.
	 * @see #isHasBeenDeclaredWithHTMLSyntax()
	 * @generated
	 */
	void setHasBeenDeclaredWithHTMLSyntax(boolean value);

} // Link
