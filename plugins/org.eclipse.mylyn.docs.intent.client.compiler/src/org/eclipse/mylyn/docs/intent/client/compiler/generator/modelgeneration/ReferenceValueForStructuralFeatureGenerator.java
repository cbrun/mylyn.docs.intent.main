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
package org.eclipse.mylyn.docs.intent.client.compiler.generator.modelgeneration;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.mylyn.docs.intent.client.compiler.generator.modellinking.ModelingUnitLinkResolver;
import org.eclipse.mylyn.docs.intent.core.compiler.CompilerFactory;
import org.eclipse.mylyn.docs.intent.core.compiler.UnresolvedReferenceHolder;
import org.eclipse.mylyn.docs.intent.core.modelingunit.ReferenceValueForStructuralFeature;

/**
 * Returns the value described by the given {@link ReferenceValueForStructuralFeature} instruction.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public final class ReferenceValueForStructuralFeatureGenerator {

	/**
	 * ReferenceValueForStructuralFeatureGenerator constructor.
	 */
	private ReferenceValueForStructuralFeatureGenerator() {

	}

	/**
	 * Generates the object described in the given instanciationInstruction.
	 * 
	 * @param referenceValueInstruction
	 *            the ReferenceValueForStructuralFeature instruction to inspect
	 * @param linkResolver
	 *            the entity used in order to resolve links
	 * @param modelingUnitGenerator
	 *            the dispatcher to use for calling the correct generator on sub-elements
	 * @return the object described in the given instanciationInstruction
	 */
	public static EObject generate(ReferenceValueForStructuralFeature referenceValueInstruction,
			ModelingUnitLinkResolver linkResolver, ModelingUnitGenerator modelingUnitGenerator) {

		ModelingUnitGenerator.clearCompilationStatus(referenceValueInstruction);
		// For now on, we simply return a stub value, as this reference
		// will be resolved during the linking step
		UnresolvedReferenceHolder referenceHolder = CompilerFactory.eINSTANCE
				.createUnresolvedReferenceHolder();
		referenceHolder.setTextualReference(referenceValueInstruction.getReferencedElement().getIntentHref());
		referenceHolder.setInstructionContainer(referenceValueInstruction);

		return referenceHolder;

	}
}
