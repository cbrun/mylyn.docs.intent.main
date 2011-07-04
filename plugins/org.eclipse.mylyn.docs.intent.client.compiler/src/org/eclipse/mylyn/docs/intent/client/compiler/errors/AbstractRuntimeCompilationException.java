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
 * Represents any exception that may have occured during the compilation ; must be catch by the Compilator to
 * construct a CompilationException.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public class AbstractRuntimeCompilationException extends RuntimeException {

	/**
	 * Generated serial Version UID.
	 */
	private static final long serialVersionUID = 1643021584619533025L;

	/**
	 * The instruction that caused the error.
	 */
	private final UnitInstruction invalidInstruction;

	/**
	 * AbstractRuntimeCompilationException constructor.
	 * 
	 * @param instruction
	 *            the instruction that caused the error
	 * @param message
	 *            the message explaining the cause of the error
	 */
	public AbstractRuntimeCompilationException(UnitInstruction instruction, String message) {
		super(message);
		this.invalidInstruction = instruction;
	}

	/**
	 * Returns the instruction that caused the error.
	 * 
	 * @return the invalidInstruction the instruction that caused the error
	 */
	public UnitInstruction getInvalidInstruction() {
		return invalidInstruction;
	}

}
