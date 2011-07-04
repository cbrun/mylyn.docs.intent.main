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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structural Feature Affectation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.modelingunit.StructuralFeatureAffectation#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.modelingunit.StructuralFeatureAffectation#getUsedOperator <em>Used Operator</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.modelingunit.StructuralFeatureAffectation#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnitPackage#getStructuralFeatureAffectation()
 * @model
 * @generated
 */
public interface StructuralFeatureAffectation extends InstanceLevelInstruction {
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
	 * @see org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnitPackage#getStructuralFeatureAffectation_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.mylyn.docs.intent.core.modelingunit.StructuralFeatureAffectation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Used Operator</b></em>' attribute.
	 * The default value is <code>"SINGLE_VALUED_AFFECTATION"</code>.
	 * The literals are from the enumeration {@link org.eclipse.mylyn.docs.intent.core.modelingunit.AffectationOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Used Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used Operator</em>' attribute.
	 * @see org.eclipse.mylyn.docs.intent.core.modelingunit.AffectationOperator
	 * @see #setUsedOperator(AffectationOperator)
	 * @see org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnitPackage#getStructuralFeatureAffectation_UsedOperator()
	 * @model default="SINGLE_VALUED_AFFECTATION" required="true"
	 * @generated
	 */
	AffectationOperator getUsedOperator();

	/**
	 * Sets the value of the '{@link org.eclipse.mylyn.docs.intent.core.modelingunit.StructuralFeatureAffectation#getUsedOperator <em>Used Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Used Operator</em>' attribute.
	 * @see org.eclipse.mylyn.docs.intent.core.modelingunit.AffectationOperator
	 * @see #getUsedOperator()
	 * @generated
	 */
	void setUsedOperator(AffectationOperator value);

	/**
	 * Returns the value of the '<em><b>Values</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mylyn.docs.intent.core.modelingunit.ValueForStructuralFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' containment reference list.
	 * @see org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnitPackage#getStructuralFeatureAffectation_Values()
	 * @model containment="true" resolveProxies="true" required="true"
	 * @generated
	 */
	EList<ValueForStructuralFeature> getValues();

} // StructuralFeatureAffectation
