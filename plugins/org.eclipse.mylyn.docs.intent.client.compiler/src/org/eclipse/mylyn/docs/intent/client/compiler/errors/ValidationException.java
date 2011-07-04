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

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mylyn.docs.intent.core.genericunit.UnitInstruction;

/**
 * Exception that occurred when failing to validate a generated element.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public class ValidationException extends CompilationException {

	/**
	 * Generated serial version UID.
	 */
	private static final long serialVersionUID = -1996338680173671147L;

	/**
	 * ResolveException constructor.
	 * 
	 * @param instruction
	 *            the instruction that caused the error
	 * @param message
	 *            the message explaining the cause of the error
	 * @param elementToValidate
	 */
	public ValidationException(UnitInstruction instruction, String message) {
		super(instruction, CompilationErrorType.VALIDATION_ERROR, message);
	}

	/**
	 * Returns a textual error message constructed with an elementToValidate and the associated diagnostic.
	 * 
	 * @param elementToValidate
	 *            the element to use for creating the error message
	 * @param diagnostic
	 *            the diagnostic to use for creating the error message
	 * @return a textual error message constructed with an elementToValidate and the associated diagnostic
	 */
	public static String getErrorMessageFrom(EObject elementToValidate, Diagnostic diagnostic) {
		String errorMessage = "";
		for (Diagnostic subDiagnostic : diagnostic.getChildren()) {
			errorMessage += "-" + subDiagnostic.getMessage() + "\n";
		}
		return errorMessage;
	}
}
