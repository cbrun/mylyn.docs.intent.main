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

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mylyn.docs.intent.markup.markup.Annotations#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.markup.markup.Annotations#getCSSStyle <em>CSS Style</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.markup.markup.Annotations#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.markup.markup.Annotations#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.markup.markup.Annotations#getCSSClass <em>CSS Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mylyn.docs.intent.markup.markup.MarkupPackage#getAnnotations()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Annotations extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.MarkupPackage#getAnnotations_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.mylyn.docs.intent.markup.markup.Annotations#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>CSS Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CSS Style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CSS Style</em>' attribute.
	 * @see #setCSSStyle(String)
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.MarkupPackage#getAnnotations_CSSStyle()
	 * @model
	 * @generated
	 */
	String getCSSStyle();

	/**
	 * Sets the value of the '{@link org.eclipse.mylyn.docs.intent.markup.markup.Annotations#getCSSStyle <em>CSS Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CSS Style</em>' attribute.
	 * @see #getCSSStyle()
	 * @generated
	 */
	void setCSSStyle(String value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see #setLanguage(String)
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.MarkupPackage#getAnnotations_Language()
	 * @model
	 * @generated
	 */
	String getLanguage();

	/**
	 * Sets the value of the '{@link org.eclipse.mylyn.docs.intent.markup.markup.Annotations#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(String value);

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
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.MarkupPackage#getAnnotations_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.eclipse.mylyn.docs.intent.markup.markup.Annotations#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>CSS Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CSS Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CSS Class</em>' attribute.
	 * @see #setCSSClass(String)
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.MarkupPackage#getAnnotations_CSSClass()
	 * @model
	 * @generated
	 */
	String getCSSClass();

	/**
	 * Sets the value of the '{@link org.eclipse.mylyn.docs.intent.markup.markup.Annotations#getCSSClass <em>CSS Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CSS Class</em>' attribute.
	 * @see #getCSSClass()
	 * @generated
	 */
	void setCSSClass(String value);

} // Annotations
