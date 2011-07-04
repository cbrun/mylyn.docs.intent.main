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
package org.eclipse.mylyn.docs.intent.parser.modelingunit;

/**
 * Represents an exception thrown by the ModelingUnit parser.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public class ParseException extends Exception {

	/**
	 * Generated serial version UID.
	 */
	private static final long serialVersionUID = -4858214259408675441L;

	/**
	 * The offset of the encountered error.
	 */
	private final int errorOffset;

	/**
	 * The length of the encountered error.
	 */
	private final int errorLength;

	/**
	 * ParseException constructor.
	 * 
	 * @param errorMessage
	 *            the message explaining the parse error
	 */
	public ParseException(String errorMessage) {
		super(errorMessage);
		this.errorOffset = 0;
		this.errorLength = 1;
	}

	/**
	 * ParseExceptionconstructor.
	 * 
	 * @param errorMessage
	 *            the message explaining the parse error
	 * @param offset
	 *            the offset of the encountered error
	 * @param length
	 *            the length of the encountered error
	 */
	public ParseException(String errorMessage, int offset, int length) {
		super(errorMessage);
		this.errorOffset = offset;
		this.errorLength = length;
	}

	/**
	 * Returns the offset of the encountered error.
	 * 
	 * @return the offset of the encountered error
	 */
	public int getErrorOffset() {
		return errorOffset;
	}

	/**
	 * Returns the length of the encountered error.
	 * 
	 * @return the length of the encountered error
	 */
	public int getErrorLength() {
		return errorLength;
	}

}
