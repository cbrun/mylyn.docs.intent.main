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

import org.eclipse.emf.common.util.EList;
import org.eclipse.mylyn.docs.intent.core.genericunit.GenericUnit;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modeling Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnit#getUsedBy <em>Used By</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnit#getSeeAlso <em>See Also</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnit#getResource <em>Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnitPackage#getModelingUnit()
 * @model
 * @generated
 */
public interface ModelingUnit extends GenericUnit {
	/**
	 * Returns the value of the '<em><b>Used By</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnit}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnit#getSeeAlso <em>See Also</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Used By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used By</em>' reference list.
	 * @see org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnitPackage#getModelingUnit_UsedBy()
	 * @see org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnit#getSeeAlso
	 * @model opposite="seeAlso"
	 * @generated
	 */
	EList<ModelingUnit> getUsedBy();

	/**
	 * Returns the value of the '<em><b>See Also</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnit}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnit#getUsedBy <em>Used By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>See Also</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>See Also</em>' reference list.
	 * @see org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnitPackage#getModelingUnit_SeeAlso()
	 * @see org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnit#getUsedBy
	 * @model opposite="usedBy"
	 * @generated
	 */
	EList<ModelingUnit> getSeeAlso();

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
	 * @see org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnitPackage#getModelingUnit_Resource()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	ResourceReference getResource();

	/**
	 * Sets the value of the '{@link org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnit#getResource <em>Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' containment reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(ResourceReference value);

} // ModelingUnit
