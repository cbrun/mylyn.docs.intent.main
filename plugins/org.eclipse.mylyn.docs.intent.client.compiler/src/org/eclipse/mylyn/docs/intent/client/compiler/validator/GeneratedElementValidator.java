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
package org.eclipse.mylyn.docs.intent.client.compiler.validator;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.mylyn.docs.intent.client.compiler.errors.CompilationException;
import org.eclipse.mylyn.docs.intent.client.compiler.errors.ValidationException;
import org.eclipse.mylyn.docs.intent.core.genericunit.UnitInstruction;

/**
 * Class used to handle the validation of a generated object.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public class GeneratedElementValidator {

	/**
	 * The generated element to validate.
	 */
	private EObject elementToValidate;

	/**
	 * The instruction that declared this element.
	 */
	private UnitInstruction instruction;

	/**
	 * GeneratedElementValidator constructor.
	 * 
	 * @param instruction
	 *            the instruction that define the generated element
	 * @param generatedElement
	 *            the generated element to validate
	 */
	public GeneratedElementValidator(UnitInstruction instruction, EObject generatedElement) {
		this.instruction = instruction;
		this.elementToValidate = generatedElement;

	}

	/**
	 * Validate the generated element and returns the diagnostic ; throws a ValidationException if the
	 * validation failed.
	 * 
	 * @return the diagnostic of the generated element
	 * @throws CompilationException
	 *             if the diagnostic contains elements with high severity
	 */
	public Diagnostic validate() throws CompilationException {

		EValidator validator = EValidator.Registry.INSTANCE.getEValidator(elementToValidate.eClass()
				.getEPackage());
		Map<Object, Object> contextEntries = new HashMap<Object, Object>();
		contextEntries.put(EValidator.SubstitutionLabelProvider.class, new LabelProviderForValidator());
		Diagnostic diagnostic = null;
		try {
			diagnostic = Diagnostician.INSTANCE.validate(elementToValidate, contextEntries);
			// If the diagnostic's severity is more than a simple warning
			if (diagnostic.getSeverity() > 0) {
				throw new ValidationException(instruction, ValidationException.getErrorMessageFrom(
						elementToValidate, diagnostic));
			}
		} catch (NullPointerException npe) {
			throw new ValidationException(instruction,
					"An unexpected error occured during validation of this element.");
		}

		return diagnostic;
	}
}
