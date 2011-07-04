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
package org.eclipse.mylyn.docs.intent.markup.markup;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Formatting</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.mylyn.docs.intent.markup.markup.MarkupPackage#getFormatting()
 * @model
 * @generated
 */
public enum Formatting implements Enumerator {
	/**
	 * The '<em><b>None</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(0, "none", "none"),

	/**
	 * The '<em><b>Emphasis</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EMPHASIS_VALUE
	 * @generated
	 * @ordered
	 */
	EMPHASIS(1, "emphasis", "emphasis"),

	/**
	 * The '<em><b>Strong</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRONG_VALUE
	 * @generated
	 * @ordered
	 */
	STRONG(2, "strong", "strong"),

	/**
	 * The '<em><b>Italic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ITALIC_VALUE
	 * @generated
	 * @ordered
	 */
	ITALIC(3, "italic", "italic"),

	/**
	 * The '<em><b>Bold</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOLD_VALUE
	 * @generated
	 * @ordered
	 */
	BOLD(4, "bold", "bold"),

	/**
	 * The '<em><b>Citation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CITATION_VALUE
	 * @generated
	 * @ordered
	 */
	CITATION(5, "citation", "citation"),

	/**
	 * The '<em><b>Deleted</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DELETED_VALUE
	 * @generated
	 * @ordered
	 */
	DELETED(6, "deleted", "deleted"),

	/**
	 * The '<em><b>Inserted</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSERTED_VALUE
	 * @generated
	 * @ordered
	 */
	INSERTED(7, "inserted", "inserted"),

	/**
	 * The '<em><b>Superscript</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUPERSCRIPT_VALUE
	 * @generated
	 * @ordered
	 */
	SUPERSCRIPT(8, "superscript", "superscript"),

	/**
	 * The '<em><b>Subscript</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBSCRIPT_VALUE
	 * @generated
	 * @ordered
	 */
	SUBSCRIPT(9, "subscript", "subscript"),

	/**
	 * The '<em><b>Span</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPAN_VALUE
	 * @generated
	 * @ordered
	 */
	SPAN(10, "span", "span"),

	/**
	 * The '<em><b>Code</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CODE_VALUE
	 * @generated
	 * @ordered
	 */
	CODE(11, "code", "code"),

	/**
	 * The '<em><b>Monospace</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MONOSPACE_VALUE
	 * @generated
	 * @ordered
	 */
	MONOSPACE(12, "monospace", "monospace"),

	/**
	 * The '<em><b>Underlined</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNDERLINED_VALUE
	 * @generated
	 * @ordered
	 */
	UNDERLINED(13, "underlined", "underlined"),

	/**
	 * The '<em><b>Quote</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QUOTE_VALUE
	 * @generated
	 * @ordered
	 */
	QUOTE(14, "quote", "quote");

	/**
	 * The '<em><b>None</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>None</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @model name="none"
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 0;

	/**
	 * The '<em><b>Emphasis</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Emphasis</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EMPHASIS
	 * @model name="emphasis"
	 * @generated
	 * @ordered
	 */
	public static final int EMPHASIS_VALUE = 1;

	/**
	 * The '<em><b>Strong</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Strong</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STRONG
	 * @model name="strong"
	 * @generated
	 * @ordered
	 */
	public static final int STRONG_VALUE = 2;

	/**
	 * The '<em><b>Italic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Italic</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ITALIC
	 * @model name="italic"
	 * @generated
	 * @ordered
	 */
	public static final int ITALIC_VALUE = 3;

	/**
	 * The '<em><b>Bold</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bold</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BOLD
	 * @model name="bold"
	 * @generated
	 * @ordered
	 */
	public static final int BOLD_VALUE = 4;

	/**
	 * The '<em><b>Citation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Citation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CITATION
	 * @model name="citation"
	 * @generated
	 * @ordered
	 */
	public static final int CITATION_VALUE = 5;

	/**
	 * The '<em><b>Deleted</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Deleted</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DELETED
	 * @model name="deleted"
	 * @generated
	 * @ordered
	 */
	public static final int DELETED_VALUE = 6;

	/**
	 * The '<em><b>Inserted</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Inserted</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INSERTED
	 * @model name="inserted"
	 * @generated
	 * @ordered
	 */
	public static final int INSERTED_VALUE = 7;

	/**
	 * The '<em><b>Superscript</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Superscript</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUPERSCRIPT
	 * @model name="superscript"
	 * @generated
	 * @ordered
	 */
	public static final int SUPERSCRIPT_VALUE = 8;

	/**
	 * The '<em><b>Subscript</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Subscript</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUBSCRIPT
	 * @model name="subscript"
	 * @generated
	 * @ordered
	 */
	public static final int SUBSCRIPT_VALUE = 9;

	/**
	 * The '<em><b>Span</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Span</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPAN
	 * @model name="span"
	 * @generated
	 * @ordered
	 */
	public static final int SPAN_VALUE = 10;

	/**
	 * The '<em><b>Code</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Code</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CODE
	 * @model name="code"
	 * @generated
	 * @ordered
	 */
	public static final int CODE_VALUE = 11;

	/**
	 * The '<em><b>Monospace</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Monospace</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MONOSPACE
	 * @model name="monospace"
	 * @generated
	 * @ordered
	 */
	public static final int MONOSPACE_VALUE = 12;

	/**
	 * The '<em><b>Underlined</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Underlined</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNDERLINED
	 * @model name="underlined"
	 * @generated
	 * @ordered
	 */
	public static final int UNDERLINED_VALUE = 13;

	/**
	 * The '<em><b>Quote</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Quote</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #QUOTE
	 * @model name="quote"
	 * @generated
	 * @ordered
	 */
	public static final int QUOTE_VALUE = 14;

	/**
	 * An array of all the '<em><b>Formatting</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Formatting[] VALUES_ARRAY =
		new Formatting[] {
			NONE,
			EMPHASIS,
			STRONG,
			ITALIC,
			BOLD,
			CITATION,
			DELETED,
			INSERTED,
			SUPERSCRIPT,
			SUBSCRIPT,
			SPAN,
			CODE,
			MONOSPACE,
			UNDERLINED,
			QUOTE,
		};

	/**
	 * A public read-only list of all the '<em><b>Formatting</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Formatting> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Formatting</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Formatting get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Formatting result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Formatting</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Formatting getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Formatting result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Formatting</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Formatting get(int value) {
		switch (value) {
			case NONE_VALUE: return NONE;
			case EMPHASIS_VALUE: return EMPHASIS;
			case STRONG_VALUE: return STRONG;
			case ITALIC_VALUE: return ITALIC;
			case BOLD_VALUE: return BOLD;
			case CITATION_VALUE: return CITATION;
			case DELETED_VALUE: return DELETED;
			case INSERTED_VALUE: return INSERTED;
			case SUPERSCRIPT_VALUE: return SUPERSCRIPT;
			case SUBSCRIPT_VALUE: return SUBSCRIPT;
			case SPAN_VALUE: return SPAN;
			case CODE_VALUE: return CODE;
			case MONOSPACE_VALUE: return MONOSPACE;
			case UNDERLINED_VALUE: return UNDERLINED;
			case QUOTE_VALUE: return QUOTE;
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
	private Formatting(int value, String name, String literal) {
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
	
} //Formatting
