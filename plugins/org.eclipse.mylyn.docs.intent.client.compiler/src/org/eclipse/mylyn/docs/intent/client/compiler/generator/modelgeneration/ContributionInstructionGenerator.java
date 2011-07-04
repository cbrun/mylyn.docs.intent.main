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
import org.eclipse.mylyn.docs.intent.client.compiler.errors.InvalidReferenceException;
import org.eclipse.mylyn.docs.intent.client.compiler.generator.modellinking.ModelingUnitLinkResolver;
import org.eclipse.mylyn.docs.intent.core.modelingunit.ContributionInstruction;
import org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnitInstruction;
import org.eclipse.mylyn.docs.intent.core.modelingunit.StructuralFeatureAffectation;

/**
 * Returns the value described by the given {@link ContributionInstruction} instruction.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public final class ContributionInstructionGenerator {

	/**
	 * ContributionInstructionGenerator constructor.
	 */
	private ContributionInstructionGenerator() {

	}

	/**
	 * Generates the object described in the given ContributionInstruction.
	 * 
	 * @param contributionInstruction
	 *            the ContributionInstruction instruction to inspect
	 * @param linkResolver
	 *            the entity used in order to resolve links
	 * @param modelingUnitGenerator
	 *            the dispatcher to use for calling the correct generator on sub-elements
	 */
	public static void generate(ContributionInstruction contributionInstruction,
			ModelingUnitGenerator modelingUnitGenerator, ModelingUnitLinkResolver linkResolver) {

		ModelingUnitGenerator.clearCompilationStatus(contributionInstruction);

		String instanceTextualReference = contributionInstruction.getReferencedElement().getIntentHref();

		// If this contribution has already been generated during previous step, we do nothing
		if (modelingUnitGenerator.getInformationHolder().isUnresolvedContribution(contributionInstruction)) {

			try {
				// If this contribution can be resolved
				EObject referencedElement = linkResolver.resolveReferenceinElementList(
						contributionInstruction, null, instanceTextualReference);

				// We contribute to the generated element.
				for (ModelingUnitInstruction instruction : contributionInstruction.getContributions()) {
					if (instruction instanceof StructuralFeatureAffectation) {
						StructuralFeatureGenerator.generateFeatureAndAddToClass(
								(StructuralFeatureAffectation)instruction, referencedElement, linkResolver,
								modelingUnitGenerator);
					}
				}

				// We add this contribution to the unresolvedcontribution list and set it as resolved
				modelingUnitGenerator.getInformationHolder().addUnresolvedContribution(
						instanceTextualReference, contributionInstruction);

				modelingUnitGenerator.getInformationHolder().setContributionInstructionAsResolved(
						contributionInstruction);

			} catch (InvalidReferenceException e) {
				// here the referenced element has not been generated yet
				// We register this contribution as unresolved
				modelingUnitGenerator.getInformationHolder().addUnresolvedContribution(
						instanceTextualReference, contributionInstruction);

			}
		}
	}

}
