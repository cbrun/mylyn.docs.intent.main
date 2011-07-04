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
package org.eclipse.mylyn.docs.intent.core.modelingunit;

import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.modelingunit.AnnotationDeclaration#getAnnotationID <em>Annotation ID</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.modelingunit.AnnotationDeclaration#getMap <em>Map</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnitPackage#getAnnotationDeclaration()
 * @model
 * @generated
 */
public interface AnnotationDeclaration extends ModelingUnitInstruction, ModelingUnitInstructionReference {
	/**
	 * Returns the value of the '<em><b>Annotation ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotation ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation ID</em>' attribute.
	 * @see #setAnnotationID(String)
	 * @see org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnitPackage#getAnnotationDeclaration_AnnotationID()
	 * @model required="true"
	 * @generated
	 */
	String getAnnotationID();

	/**
	 * Sets the value of the '{@link org.eclipse.mylyn.docs.intent.core.modelingunit.AnnotationDeclaration#getAnnotationID <em>Annotation ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotation ID</em>' attribute.
	 * @see #getAnnotationID()
	 * @generated
	 */
	void setAnnotationID(String value);

	/**
	 * Returns the value of the '<em><b>Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Map</em>' map.
	 * @see org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnitPackage#getAnnotationDeclaration_Map()
	 * @model mapType="org.eclipse.mylyn.docs.intent.core.modelingunit.KeyValForAnnotation<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>"
	 * @generated
	 */
	EMap<String, String> getMap();

} // AnnotationDeclaration
