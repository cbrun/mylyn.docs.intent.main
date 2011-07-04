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
package org.eclipse.mylyn.docs.intent.client.compiler.utils;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.mylyn.docs.intent.client.compiler.errors.CompilationErrorType;
import org.eclipse.mylyn.docs.intent.core.compiler.CompilationMessageType;
import org.eclipse.mylyn.docs.intent.core.compiler.CompilationStatusSeverity;

/**
 * Converts different kind of information into compilationSatus.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public final class CompilationStatusConverter {

	/**
	 * CompilationStatusConverter constructor.
	 */
	private CompilationStatusConverter() {

	}

	/**
	 * Returns the StatusSeverity according to the given diagnostic.
	 * 
	 * @param diagnostic
	 *            a diagnostic given by an EMF validator.
	 * @return the StatusSeverity according to the given diagnostic
	 */
	public static CompilationStatusSeverity createStatusSeverityFromDiagnosticSeverity(Diagnostic diagnostic) {

		CompilationStatusSeverity returnedSeverity = null;
		switch (diagnostic.getSeverity()) {
			case Diagnostic.INFO:
				returnedSeverity = CompilationStatusSeverity.INFO;
				break;
			case Diagnostic.ERROR:
				returnedSeverity = CompilationStatusSeverity.WARNING;
				break;
			case Diagnostic.WARNING:
				returnedSeverity = CompilationStatusSeverity.WARNING;
				break;
			default:
				returnedSeverity = CompilationStatusSeverity.OK;
		}

		return returnedSeverity;
	}

	/**
	 * Returns the CompilationSatus's MessageType according to the given CompilationErrorType.
	 * 
	 * @param type
	 *            the type of a compilationException
	 * @return the CompilationSatus messageType.
	 */
	public static CompilationMessageType createStatusTypeFromCompilationExceptionErrorType(
			CompilationErrorType type) {
		CompilationMessageType returnedMessageType = null;
		switch (type) {
			case INVALID_REFRENCE_ERROR:
				returnedMessageType = CompilationMessageType.INVALID_REFERENCE_ERROR;
				break;
			case INVALID_VALUE_ERROR:
				returnedMessageType = CompilationMessageType.INVALID_VALUE_ERROR;
				break;
			case PACKAGE_NOT_FOUND_ERROR:
				returnedMessageType = CompilationMessageType.PACKAGE_NOT_FOUND_ERROR;
				break;
			case PACKAGE_REGISTRATION_ERROR:
				returnedMessageType = CompilationMessageType.PACKAGE_REGISTRATION_ERROR;
				break;
			case RESOLVE_ERROR:
				returnedMessageType = CompilationMessageType.RESOLVE_ERROR;
				break;
			case VALIDATION_ERROR:
				returnedMessageType = CompilationMessageType.VALIDATION_ERROR;
				break;
			default:
				returnedMessageType = CompilationMessageType.GENERAL_WARNING;
		}

		return returnedMessageType;
	}

	/**
	 * Returns the StatusSeverity according to the given compilationErrorType.
	 * 
	 * @param type
	 *            the type of a compilationException
	 * @return the corresponding CompilationStatus Severity
	 */
	public static CompilationStatusSeverity createStatusSeverityFromCompilationExceptionErrorType(
			CompilationErrorType type) {
		CompilationStatusSeverity returnedSeverity = null;
		switch (type) {
			case INVALID_REFRENCE_ERROR:
				returnedSeverity = CompilationStatusSeverity.ERROR;
				break;
			case INVALID_VALUE_ERROR:
				returnedSeverity = CompilationStatusSeverity.ERROR;
				break;
			case PACKAGE_NOT_FOUND_ERROR:
				returnedSeverity = CompilationStatusSeverity.ERROR;
				break;
			case PACKAGE_REGISTRATION_ERROR:
				returnedSeverity = CompilationStatusSeverity.ERROR;
				break;
			case RESOLVE_ERROR:
				returnedSeverity = CompilationStatusSeverity.ERROR;
				break;
			case VALIDATION_ERROR:
				returnedSeverity = CompilationStatusSeverity.WARNING;
				break;
			default:
				returnedSeverity = CompilationStatusSeverity.INFO;
		}

		return returnedSeverity;
	}
}
