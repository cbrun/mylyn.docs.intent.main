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

import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.mylyn.docs.intent.client.compiler.errors.CompilationErrorType;
import org.eclipse.mylyn.docs.intent.client.compiler.errors.CompilationException;
import org.eclipse.mylyn.docs.intent.client.compiler.errors.ResolveException;
import org.eclipse.mylyn.docs.intent.client.compiler.generator.modellinking.ModelingUnitLinkResolver;
import org.eclipse.mylyn.docs.intent.core.compiler.UnresolvedContributionHolder;
import org.eclipse.mylyn.docs.intent.core.genericunit.UnitInstruction;
import org.eclipse.mylyn.docs.intent.core.modelingunit.InstanciationInstruction;
import org.eclipse.mylyn.docs.intent.core.modelingunit.StructuralFeatureAffectation;

/**
 * Generates objects described by an Intent InstanciationInstruction.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public final class InstanciationInstructionGenerator {

	/**
	 * InstanciationInstructionGenerator constructor.
	 */
	private InstanciationInstructionGenerator() {

	}

	/**
	 * Generates the object described in the given instanciationInstruction.
	 * 
	 * @param instanciationInstruction
	 *            the instantiation instruction to inspect
	 * @param importedPackageURIS
	 *            the URIs corresponding to all the packages imported in this ModelingUnit
	 * @param linkResolver
	 *            the entity used in order to resolve links
	 * @param modelingUnitGenerator
	 *            the dispatcher to use for calling the correct generator on sub-elements
	 * @return the object described in the given instanciationInstruction
	 */
	public static EObject generate(InstanciationInstruction instanciationInstruction,
			List<String> importedPackageURIS, ModelingUnitLinkResolver linkResolver,
			ModelingUnitGenerator modelingUnitGenerator) {

		ModelingUnitGenerator.clearCompilationStatus(instanciationInstruction);

		EObject createdElement = null;
		// Step 1 : resolving the link to the metaType (thanks to the linkResolver)
		String metaTypeHref = instanciationInstruction.getMetaType().getIntentHref();
		try {
			EClass metaType = (EClass)linkResolver.resolveEClassifierUsingPackage(instanciationInstruction,
					importedPackageURIS, metaTypeHref);

			// Step 2 : instantiate correctly this entity
			// Step 2.1 : Creation using the factory
			createdElement = metaType.getEPackage().getEFactoryInstance().create(metaType);

			// Step 2.2 : If a name has been associated to this instance
			if (instanciationInstruction.getName() != null) {
				// We determine if this name can be assigned to any attribute
				for (EAttribute attribute : metaType.getEAllAttributes()) {
					if (isConcernedByNameAttribute(attribute)) {
						// if so, we set this attribute
						createdElement.eSet(attribute, instanciationInstruction.getName());
					}
				}
			}
			// Step 2.3 : We set all the structuralFeatureAffectation associated to this instance
			// leaving the other attributes to default values.
			for (StructuralFeatureAffectation sfa : instanciationInstruction.getStructuralFeatures()) {
				StructuralFeatureGenerator.generateFeatureAndAddToClass(sfa, createdElement, linkResolver,
						modelingUnitGenerator);
			}
		} catch (ResolveException e) {
			// If the metaType of the element to generate cannot be resolved
			// We generate a compilation status
			modelingUnitGenerator.getInformationHolder().registerCompilationExceptionAsCompilationStatus(
					new CompilationException(e.getInvalidInstruction(),
							CompilationErrorType.INVALID_REFRENCE_ERROR, e.getMessage()));
			// And we create a sample object, in order to let the compilation running
			createdElement = EcoreFactory.eINSTANCE.createEObject();
		}

		// Step 3 : Registration of the generated element
		// Step 3.1 : We register the generated element to the package registry (if it's an EPackage)
		registerGeneratedElementsInPackageRegistry(instanciationInstruction, linkResolver, createdElement);

		// Step 3.2 : we add the generated element in the current created Elements list
		modelingUnitGenerator.getInformationHolder().addNameToCreatedElementEntry(
				instanciationInstruction.getName(), createdElement, instanciationInstruction);

		// Step 3.3 : if any unresolved contribution instructions were contributed to this element
		// We resolve these contributions

		for (final UnresolvedContributionHolder contributionHolder : modelingUnitGenerator
				.getInformationHolder().getContributionsAssociatedTo(instanciationInstruction.getName())) {
			ContributionInstructionGenerator.generate(contributionHolder.getReferencedContribution(),
					modelingUnitGenerator, linkResolver);
		}

		return createdElement;
	}

	/**
	 * Register the generated element if it's necessary (typically if it's an ePackage).
	 * 
	 * @param linkResolver
	 *            the entity used in order to resolve links
	 * @param generatedElement
	 *            the generated element to register (if necessary)
	 * @param instruction
	 *            the instruction that need to register the generated element
	 */
	private static void registerGeneratedElementsInPackageRegistry(UnitInstruction instruction,
			ModelingUnitLinkResolver linkResolver, EObject generatedElement) {
		if (generatedElement instanceof EPackage) {
			linkResolver.registerInPackageRegistry(instruction, (EPackage)generatedElement);
		}
	}

	/**
	 * Returns true if we can set the given attribute with a "name" feature of an instanciationInstruction.
	 * 
	 * @param attribute
	 *            the attribute to inspect
	 * @return true if the given attribute is of type EString and is named 'name' or is an ID attribute
	 */
	private static boolean isConcernedByNameAttribute(EAttribute attribute) {

		// Case 1 : true if the attribute is defined as ID and is of type EString
		boolean isConcernedByNameAttribute = attribute.isID()
				&& ("EString".equals(attribute.getEAttributeType().getName()));

		// Case 2 : true if the attribute's name is "name" and is of type EString
		isConcernedByNameAttribute = isConcernedByNameAttribute
				|| ("name".equals(attribute.getName()) && ("EString".equals(attribute.getEAttributeType()
						.getName())));
		return isConcernedByNameAttribute;
	}

	/**
	 * Returns true if the given Instantiation instruction instantiates an EPackage.
	 * 
	 * @param instruction
	 *            the InstantiationInstruction to consider.
	 * @return true if the given Instantiation instruction instantiates an EPackage, false otherwise
	 */
	public static boolean isEPackageInstanciation(InstanciationInstruction instruction) {
		return "EPackage".equals(instruction.getMetaType().getIntentHref());
	}
}
