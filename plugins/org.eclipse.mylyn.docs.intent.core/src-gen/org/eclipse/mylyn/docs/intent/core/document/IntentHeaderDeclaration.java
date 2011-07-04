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
package org.eclipse.mylyn.docs.intent.core.document;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.mylyn.docs.intent.core.modelingunit.ResourceReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Intent Header Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.document.IntentHeaderDeclaration#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.document.IntentHeaderDeclaration#getImports <em>Imports</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.document.IntentHeaderDeclaration#getAnnotationMappings <em>Annotation Mappings</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.document.IntentHeaderDeclaration#getResource <em>Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mylyn.docs.intent.core.document.IntentDocumentPackage#getIntentHeaderDeclaration()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface IntentHeaderDeclaration extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.mylyn.docs.intent.core.document.IntentDocumentPackage#getIntentHeaderDeclaration_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.mylyn.docs.intent.core.document.IntentHeaderDeclaration#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Imports</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imports</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' attribute list.
	 * @see org.eclipse.mylyn.docs.intent.core.document.IntentDocumentPackage#getIntentHeaderDeclaration_Imports()
	 * @model dataType="org.eclipse.mylyn.docs.intent.core.document.URI"
	 * @generated
	 */
	EList<Object> getImports();

	/**
	 * Returns the value of the '<em><b>Annotation Mappings</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.Object},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotation Mappings</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation Mappings</em>' map.
	 * @see org.eclipse.mylyn.docs.intent.core.document.IntentDocumentPackage#getIntentHeaderDeclaration_AnnotationMappings()
	 * @model mapType="org.eclipse.mylyn.docs.intent.core.document.AnnotationMapping<org.eclipse.emf.ecore.EString, org.eclipse.mylyn.docs.intent.core.document.URI>"
	 * @generated
	 */
	EMap<String, Object> getAnnotationMappings();

	/**
	 * Returns the value of the '<em><b>Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' containment reference.
	 * @see #setResource(ResourceReference)
	 * @see org.eclipse.mylyn.docs.intent.core.document.IntentDocumentPackage#getIntentHeaderDeclaration_Resource()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	ResourceReference getResource();

	/**
	 * Sets the value of the '{@link org.eclipse.mylyn.docs.intent.core.document.IntentHeaderDeclaration#getResource <em>Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' containment reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(ResourceReference value);

} // IntentHeaderDeclaration
