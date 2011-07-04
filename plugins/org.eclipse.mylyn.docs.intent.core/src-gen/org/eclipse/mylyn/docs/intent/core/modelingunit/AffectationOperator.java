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

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Affectation Operator</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnitPackage#getAffectationOperator()
 * @model
 * @generated
 */
public enum AffectationOperator implements Enumerator {
	/**
	 * The '<em><b>SINGLE VALUED AFFECTATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SINGLE_VALUED_AFFECTATION_VALUE
	 * @generated
	 * @ordered
	 */
	SINGLE_VALUED_AFFECTATION(0, "SINGLE_VALUED_AFFECTATION", "SINGLE_VALUED_AFFECTATION"),

	/**
	 * The '<em><b>MULTI VALUED AFFECTATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTI_VALUED_AFFECTATION_VALUE
	 * @generated
	 * @ordered
	 */
	MULTI_VALUED_AFFECTATION(1, "MULTI_VALUED_AFFECTATION", "MULTI_VALUED_AFFECTATION");

	/**
	 * The '<em><b>SINGLE VALUED AFFECTATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SINGLE VALUED AFFECTATION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SINGLE_VALUED_AFFECTATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SINGLE_VALUED_AFFECTATION_VALUE = 0;

	/**
	 * The '<em><b>MULTI VALUED AFFECTATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MULTI VALUED AFFECTATION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MULTI_VALUED_AFFECTATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MULTI_VALUED_AFFECTATION_VALUE = 1;

	/**
	 * An array of all the '<em><b>Affectation Operator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AffectationOperator[] VALUES_ARRAY = new AffectationOperator[] {
			SINGLE_VALUED_AFFECTATION, MULTI_VALUED_AFFECTATION,
	};

	/**
	 * A public read-only list of all the '<em><b>Affectation Operator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AffectationOperator> VALUES = Collections.unmodifiableList(Arrays
			.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Affectation Operator</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AffectationOperator get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AffectationOperator result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Affectation Operator</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AffectationOperator getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AffectationOperator result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Affectation Operator</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AffectationOperator get(int value) {
		switch (value) {
			case SINGLE_VALUED_AFFECTATION_VALUE:
				return SINGLE_VALUED_AFFECTATION;
			case MULTI_VALUED_AFFECTATION_VALUE:
				return MULTI_VALUED_AFFECTATION;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private AffectationOperator(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //AffectationOperator
