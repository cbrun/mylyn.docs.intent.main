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
 * Exception that occurred when failing to resolve a textual eference.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public class ResolveException extends AbstractRuntimeCompilationException {

	/**
	 * Generated serial version UID.
	 */
	private static final long serialVersionUID = -1996338680173671147L;

	/**
	 * ResolveException constructor.
	 * 
	 * @param message
	 *            the message explaining the cause of the error
	 * @param instruction
	 *            the instruction that caused the error
	 */
	public ResolveException(UnitInstruction instruction, String message) {
		super(instruction, message);
	}
}
