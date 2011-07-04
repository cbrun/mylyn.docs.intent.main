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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Value For Structural Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.modelingunit.ReferenceValueForStructuralFeature#getReferencedElement <em>Referenced Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnitPackage#getReferenceValueForStructuralFeature()
 * @model
 * @generated
 */
public interface ReferenceValueForStructuralFeature extends ValueForStructuralFeature {
	/**
	 * Returns the value of the '<em><b>Referenced Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Element</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Element</em>' containment reference.
	 * @see #setReferencedElement(InstanciationInstructionReference)
	 * @see org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnitPackage#getReferenceValueForStructuralFeature_ReferencedElement()
	 * @model containment="true" resolveProxies="true" required="true"
	 * @generated
	 */
	InstanciationInstructionReference getReferencedElement();

	/**
	 * Sets the value of the '{@link org.eclipse.mylyn.docs.intent.core.modelingunit.ReferenceValueForStructuralFeature#getReferencedElement <em>Referenced Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Element</em>' containment reference.
	 * @see #getReferencedElement()
	 * @generated
	 */
	void setReferencedElement(InstanciationInstructionReference value);

} // ReferenceValueForStructuralFeature
