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
package org.eclipse.mylyn.docs.intent.core.modelingunit.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.mylyn.docs.intent.core.modelingunit.AffectationOperator;
import org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnitPackage;
import org.eclipse.mylyn.docs.intent.core.modelingunit.StructuralFeatureAffectation;
import org.eclipse.mylyn.docs.intent.core.modelingunit.ValueForStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structural Feature Affectation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.modelingunit.impl.StructuralFeatureAffectationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.modelingunit.impl.StructuralFeatureAffectationImpl#getUsedOperator <em>Used Operator</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.modelingunit.impl.StructuralFeatureAffectationImpl#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StructuralFeatureAffectationImpl extends InstanceLevelInstructionImpl implements StructuralFeatureAffectation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructuralFeatureAffectationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelingUnitPackage.Literals.STRUCTURAL_FEATURE_AFFECTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(ModelingUnitPackage.Literals.STRUCTURAL_FEATURE_AFFECTATION__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(ModelingUnitPackage.Literals.STRUCTURAL_FEATURE_AFFECTATION__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AffectationOperator getUsedOperator() {
		return (AffectationOperator)eGet(
				ModelingUnitPackage.Literals.STRUCTURAL_FEATURE_AFFECTATION__USED_OPERATOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsedOperator(AffectationOperator newUsedOperator) {
		eSet(ModelingUnitPackage.Literals.STRUCTURAL_FEATURE_AFFECTATION__USED_OPERATOR, newUsedOperator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ValueForStructuralFeature> getValues() {
		return (EList<ValueForStructuralFeature>)eGet(
				ModelingUnitPackage.Literals.STRUCTURAL_FEATURE_AFFECTATION__VALUES, true);
	}

} //StructuralFeatureAffectationImpl
