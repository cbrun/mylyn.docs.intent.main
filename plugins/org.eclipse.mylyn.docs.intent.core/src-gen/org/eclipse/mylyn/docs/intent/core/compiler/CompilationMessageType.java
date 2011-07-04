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
package org.eclipse.mylyn.docs.intent.core.compiler;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '
 * <em><b>Compilation Message Type</b></em>', and utility methods for working with them. <!-- end-user-doc -->
 * @see org.eclipse.mylyn.docs.intent.core.compiler.CompilerPackage#getCompilationMessageType()
 * @model
 * @generated
 */
public enum CompilationMessageType implements Enumerator {
	/**
	 * The '<em><b>RESOLVE ERROR</b></em>' literal object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #RESOLVE_ERROR_VALUE
	 * @generated
	 * @ordered
	 */
	RESOLVE_ERROR(0, "RESOLVE_ERROR", "RESOLVE_ERROR"),

	/**
	 * The '<em><b>PACKAGE NOT FOUND ERROR</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #PACKAGE_NOT_FOUND_ERROR_VALUE
	 * @generated
	 * @ordered
	 */
	PACKAGE_NOT_FOUND_ERROR(1, "PACKAGE_NOT_FOUND_ERROR", "PACKAGE_NOT_FOUND_ERROR"),

	/**
	 * The '<em><b>PACKAGE REGISTRATION ERROR</b></em>' literal object.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #PACKAGE_REGISTRATION_ERROR_VALUE
	 * @generated
	 * @ordered
	 */
	PACKAGE_REGISTRATION_ERROR(2, "PACKAGE_REGISTRATION_ERROR", "PACKAGE_REGISTRATION_ERROR"),

	/**
	 * The '<em><b>INVALID REFERENCE ERROR</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #INVALID_REFERENCE_ERROR_VALUE
	 * @generated
	 * @ordered
	 */
	INVALID_REFERENCE_ERROR(3, "INVALID_REFERENCE_ERROR", "INVALID_REFERENCE_ERROR"),

	/**
	 * The '<em><b>VALIDATION ERROR</b></em>' literal object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #VALIDATION_ERROR_VALUE
	 * @generated
	 * @ordered
	 */
	VALIDATION_ERROR(4, "VALIDATION_ERROR", "VALIDATION_ERROR"),

	/**
	 * The '<em><b>INVALID VALUE ERROR</b></em>' literal object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #INVALID_VALUE_ERROR_VALUE
	 * @generated
	 * @ordered
	 */
	INVALID_VALUE_ERROR(5, "INVALID_VALUE_ERROR", "INVALID_VALUE_ERROR"),

	/**
	 * The '<em><b>GENERAL WARNING</b></em>' literal object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #GENERAL_WARNING_VALUE
	 * @generated
	 * @ordered
	 */
	GENERAL_WARNING(6, "GENERAL_WARNING", "GENERAL_WARNING"), /**
																 * The '<em><b>SYNCHRONIZER WARNING</b></em>' literal object.
																 * <!-- begin-user-doc -->
																 * <!-- end-user-doc -->
																 * @see #SYNCHRONIZER_WARNING_VALUE
																 * @generated
																 * @ordered
																 */
	SYNCHRONIZER_WARNING(7, "SYNCHRONIZER_WARNING", "SYNCHRONIZER_WARNING");

	/**
	 * The '<em><b>RESOLVE ERROR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RESOLVE ERROR</b></em>' literal object isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RESOLVE_ERROR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RESOLVE_ERROR_VALUE = 0;

	/**
	 * The '<em><b>PACKAGE NOT FOUND ERROR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PACKAGE NOT FOUND ERROR</b></em>' literal object isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PACKAGE_NOT_FOUND_ERROR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PACKAGE_NOT_FOUND_ERROR_VALUE = 1;

	/**
	 * The '<em><b>PACKAGE REGISTRATION ERROR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PACKAGE REGISTRATION ERROR</b></em>' literal object isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PACKAGE_REGISTRATION_ERROR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PACKAGE_REGISTRATION_ERROR_VALUE = 2;

	/**
	 * The '<em><b>INVALID REFERENCE ERROR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INVALID REFERENCE ERROR</b></em>' literal object isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INVALID_REFERENCE_ERROR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INVALID_REFERENCE_ERROR_VALUE = 3;

	/**
	 * The '<em><b>VALIDATION ERROR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VALIDATION ERROR</b></em>' literal object isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VALIDATION_ERROR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VALIDATION_ERROR_VALUE = 4;

	/**
	 * The '<em><b>INVALID VALUE ERROR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INVALID VALUE ERROR</b></em>' literal object isn't clear, there really should
	 * be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INVALID_VALUE_ERROR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INVALID_VALUE_ERROR_VALUE = 5;

	/**
	 * The '<em><b>GENERAL WARNING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GENERAL WARNING</b></em>' literal object isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GENERAL_WARNING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GENERAL_WARNING_VALUE = 6;

	/**
	 * The '<em><b>SYNCHRONIZER WARNING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SYNCHRONIZER WARNING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SYNCHRONIZER_WARNING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SYNCHRONIZER_WARNING_VALUE = 7;

	/**
	 * An array of all the '<em><b>Compilation Message Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CompilationMessageType[] VALUES_ARRAY = new CompilationMessageType[] {RESOLVE_ERROR,
			PACKAGE_NOT_FOUND_ERROR, PACKAGE_REGISTRATION_ERROR, INVALID_REFERENCE_ERROR, VALIDATION_ERROR,
			INVALID_VALUE_ERROR, GENERAL_WARNING, SYNCHRONIZER_WARNING,
	};

	/**
	 * A public read-only list of all the '<em><b>Compilation Message Type</b></em>' enumerators. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final List<CompilationMessageType> VALUES = Collections.unmodifiableList(Arrays
			.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Compilation Message Type</b></em>' literal with the specified literal value. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static CompilationMessageType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CompilationMessageType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Compilation Message Type</b></em>' literal with the specified name. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static CompilationMessageType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CompilationMessageType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Compilation Message Type</b></em>' literal with the specified integer value. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static CompilationMessageType get(int value) {
		switch (value) {
			case RESOLVE_ERROR_VALUE:
				return RESOLVE_ERROR;
			case PACKAGE_NOT_FOUND_ERROR_VALUE:
				return PACKAGE_NOT_FOUND_ERROR;
			case PACKAGE_REGISTRATION_ERROR_VALUE:
				return PACKAGE_REGISTRATION_ERROR;
			case INVALID_REFERENCE_ERROR_VALUE:
				return INVALID_REFERENCE_ERROR;
			case VALIDATION_ERROR_VALUE:
				return VALIDATION_ERROR;
			case INVALID_VALUE_ERROR_VALUE:
				return INVALID_VALUE_ERROR;
			case GENERAL_WARNING_VALUE:
				return GENERAL_WARNING;
			case SYNCHRONIZER_WARNING_VALUE:
				return SYNCHRONIZER_WARNING;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private CompilationMessageType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} // CompilationMessageType
