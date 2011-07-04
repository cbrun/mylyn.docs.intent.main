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
package org.eclipse.mylyn.docs.intent.client.ui.editor.scanner;

import org.eclipse.jface.text.rules.Token;

/**
 * Represents an Intent token.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public class IntentToken extends Token {

	/**
	 * The starting offset of this token.
	 */
	private int offset;

	/**
	 * The length of this token.
	 */
	private int length;

	/**
	 * IntentToken constructor.
	 * 
	 * @param data
	 *            the data associated do this token
	 * @param offset
	 *            the starting offset of this token
	 * @param length
	 *            the length of this token
	 */
	public IntentToken(Object data, int offset, int length) {
		super(data);
		this.offset = offset;
		this.length = length;
	}

	/**
	 * Returns the starting offset of this token.
	 * 
	 * @return the starting offset of this token
	 */
	public int getOffset() {
		return offset;
	}

	/**
	 * Sets the starting offset of this token.
	 * 
	 * @param offset
	 *            the starting offset of this token.
	 */
	public void setOffset(int offset) {
		this.offset = offset;
	}

	/**
	 * Returns the length of this token.
	 * 
	 * @return the length of this token
	 */
	public int getLength() {
		return length;
	}

	/**
	 * Sets the length of this token.
	 * 
	 * @param length
	 *            the length of this token
	 */
	public void setLength(int length) {
		this.length = length;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "IntentToken " + this.getData() + " : " + offset + "(" + length + ")";
	}

}
