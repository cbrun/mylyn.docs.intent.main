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
package org.eclipse.mylyn.docs.intent.core.indexer;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>INDEX ENTRY TYPE</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.mylyn.docs.intent.core.indexer.IntentIndexerPackage#getINDEX_ENTRY_TYPE()
 * @model
 * @generated
 */
public enum INDEX_ENTRY_TYPE implements Enumerator {
	/**
	 * The '<em><b>Intent Document</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTENT_DOCUMENT_VALUE
	 * @generated
	 * @ordered
	 */
	INTENT_DOCUMENT(0, "IntentDocument", "IntentDocument"),

	/**
	 * The '<em><b>Intent Chapter</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTENT_CHAPTER_VALUE
	 * @generated
	 * @ordered
	 */
	INTENT_CHAPTER(1, "IntentChapter", "IntentChapter"),

	/**
	 * The '<em><b>Intent Section</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTENT_SECTION_VALUE
	 * @generated
	 * @ordered
	 */
	INTENT_SECTION(2, "IntentSection", "IntentSection");

	/**
	 * The '<em><b>Intent Document</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Intent Document</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTENT_DOCUMENT
	 * @model name="IntentDocument"
	 * @generated
	 * @ordered
	 */
	public static final int INTENT_DOCUMENT_VALUE = 0;

	/**
	 * The '<em><b>Intent Chapter</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Intent Chapter</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTENT_CHAPTER
	 * @model name="IntentChapter"
	 * @generated
	 * @ordered
	 */
	public static final int INTENT_CHAPTER_VALUE = 1;

	/**
	 * The '<em><b>Intent Section</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Intent Section</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTENT_SECTION
	 * @model name="IntentSection"
	 * @generated
	 * @ordered
	 */
	public static final int INTENT_SECTION_VALUE = 2;

	/**
	 * An array of all the '<em><b>INDEX ENTRY TYPE</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final INDEX_ENTRY_TYPE[] VALUES_ARRAY =
		new INDEX_ENTRY_TYPE[] {
			INTENT_DOCUMENT,
			INTENT_CHAPTER,
			INTENT_SECTION,
		};

	/**
	 * A public read-only list of all the '<em><b>INDEX ENTRY TYPE</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<INDEX_ENTRY_TYPE> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>INDEX ENTRY TYPE</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static INDEX_ENTRY_TYPE get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			INDEX_ENTRY_TYPE result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>INDEX ENTRY TYPE</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static INDEX_ENTRY_TYPE getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			INDEX_ENTRY_TYPE result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>INDEX ENTRY TYPE</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static INDEX_ENTRY_TYPE get(int value) {
		switch (value) {
			case INTENT_DOCUMENT_VALUE: return INTENT_DOCUMENT;
			case INTENT_CHAPTER_VALUE: return INTENT_CHAPTER;
			case INTENT_SECTION_VALUE: return INTENT_SECTION;
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
	private INDEX_ENTRY_TYPE(int value, String name, String literal) {
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
	
} //INDEX_ENTRY_TYPE
