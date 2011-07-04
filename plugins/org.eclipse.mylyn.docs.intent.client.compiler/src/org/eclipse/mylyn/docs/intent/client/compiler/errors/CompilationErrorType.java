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

/**
 * Enumerate all the compilationError types that may be encountered while compiling.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public enum CompilationErrorType {

	/**
	 * Indicates an error while resolving links (for example if trying to instantiate a inexistent EClass).
	 */
	RESOLVE_ERROR,
	/**
	 * Indicates an error that occurred while trying to find an EPackage in the package registry.
	 */
	PACKAGE_NOT_FOUND_ERROR,
	/**
	 * Indicates an error that occurred while trying to register an EPackage in the package registry.
	 */
	PACKAGE_REGISTRATION_ERROR,
	/**
	 * Indicates an error that occurred when failing to resolve a reference to a created instance.
	 */
	INVALID_REFRENCE_ERROR,
	/**
	 * Indicates an error that occurred when failing to validate a generated element.
	 */
	VALIDATION_ERROR,
	/**
	 * Exception that occurred when failing to convert a value in a NativeValueForStructuralFeature
	 * instruction.
	 */
	INVALID_VALUE_ERROR;
}
