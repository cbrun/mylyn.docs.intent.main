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
package org.eclipse.mylyn.docs.intent.client.compiler.errors;

import org.eclipse.mylyn.docs.intent.core.genericunit.UnitInstruction;

/**
 * Exception raised while an error occured during compilation.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public class CompilationException extends Exception {

	/**
	 * Generated serial version UID.
	 */
	private static final long serialVersionUID = 5836382350297708295L;

	/**
	 * The instruction that caused the error.
	 */
	private final UnitInstruction invalidInstruction;

	/**
	 * Type of this compilation error.
	 */
	private final CompilationErrorType type;

	/**
	 * Default constructor.
	 * 
	 * @param instruction
	 *            the instruction that caused the error
	 * @param type
	 *            Type of this compilation error
	 * @param message
	 *            message explaining the cause of the error
	 */
	public CompilationException(UnitInstruction instruction, CompilationErrorType type, String message) {
		super(message);
		this.invalidInstruction = instruction;
		this.type = type;
	}

	/**
	 * Returns the instruction that caused the error.
	 * 
	 * @return invalidInstruction the instruction that caused the error
	 */
	public UnitInstruction getInvalidInstruction() {
		return invalidInstruction;
	}

	/**
	 * Returns the type of this compilation error.
	 * 
	 * @return the type of this compilation error
	 */
	public CompilationErrorType getType() {
		return type;
	}
}
