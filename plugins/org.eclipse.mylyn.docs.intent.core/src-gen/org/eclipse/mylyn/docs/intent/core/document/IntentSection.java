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

import org.eclipse.emf.common.util.EList;
import org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnit;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Intent Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.document.IntentSection#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.document.IntentSection#getCompleteLevel <em>Complete Level</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.document.IntentSection#getModelingUnits <em>Modeling Units</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.document.IntentSection#getImportedHeaders <em>Imported Headers</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.document.IntentSection#getDeclaredHeaders <em>Declared Headers</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mylyn.docs.intent.core.document.IntentDocumentPackage#getIntentSection()
 * @model
 * @generated
 */
public interface IntentSection extends IntentSubSectionContainer {
	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.mylyn.docs.intent.core.document.IntentSectionVisibility}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visibility</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see org.eclipse.mylyn.docs.intent.core.document.IntentSectionVisibility
	 * @see #setVisibility(IntentSectionVisibility)
	 * @see org.eclipse.mylyn.docs.intent.core.document.IntentDocumentPackage#getIntentSection_Visibility()
	 * @model
	 * @generated
	 */
	IntentSectionVisibility getVisibility();

	/**
	 * Sets the value of the '{@link org.eclipse.mylyn.docs.intent.core.document.IntentSection#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see org.eclipse.mylyn.docs.intent.core.document.IntentSectionVisibility
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(IntentSectionVisibility value);

	/**
	 * Returns the value of the '<em><b>Complete Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Complete Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complete Level</em>' attribute.
	 * @see #setCompleteLevel(String)
	 * @see org.eclipse.mylyn.docs.intent.core.document.IntentDocumentPackage#getIntentSection_CompleteLevel()
	 * @model derived="true"
	 * @generated
	 */
	String getCompleteLevel();

	/**
	 * Sets the value of the '{@link org.eclipse.mylyn.docs.intent.core.document.IntentSection#getCompleteLevel <em>Complete Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Complete Level</em>' attribute.
	 * @see #getCompleteLevel()
	 * @generated
	 */
	void setCompleteLevel(String value);

	/**
	 * Returns the value of the '<em><b>Modeling Units</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modeling Units</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modeling Units</em>' reference list.
	 * @see org.eclipse.mylyn.docs.intent.core.document.IntentDocumentPackage#getIntentSection_ModelingUnits()
	 * @model volatile="true" derived="true"
	 * @generated
	 */
	EList<ModelingUnit> getModelingUnits();

	/**
	 * Returns the value of the '<em><b>Imported Headers</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imported Headers</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported Headers</em>' attribute list.
	 * @see org.eclipse.mylyn.docs.intent.core.document.IntentDocumentPackage#getIntentSection_ImportedHeaders()
	 * @model
	 * @generated
	 */
	EList<String> getImportedHeaders();

	/**
	 * Returns the value of the '<em><b>Declared Headers</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mylyn.docs.intent.core.document.IntentHeaderDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declared Headers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declared Headers</em>' containment reference list.
	 * @see org.eclipse.mylyn.docs.intent.core.document.IntentDocumentPackage#getIntentSection_DeclaredHeaders()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<IntentHeaderDeclaration> getDeclaredHeaders();

} // IntentSection
