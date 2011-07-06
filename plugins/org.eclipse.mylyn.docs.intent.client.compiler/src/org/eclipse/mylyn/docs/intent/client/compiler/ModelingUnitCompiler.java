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
package org.eclipse.mylyn.docs.intent.client.compiler;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.Monitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.mylyn.docs.intent.client.compiler.errors.AbstractRuntimeCompilationException;
import org.eclipse.mylyn.docs.intent.client.compiler.errors.CompilationErrorType;
import org.eclipse.mylyn.docs.intent.client.compiler.errors.CompilationException;
import org.eclipse.mylyn.docs.intent.client.compiler.errors.InvalidReferenceException;
import org.eclipse.mylyn.docs.intent.client.compiler.errors.InvalidValueException;
import org.eclipse.mylyn.docs.intent.client.compiler.errors.PackageNotFoundResolveException;
import org.eclipse.mylyn.docs.intent.client.compiler.errors.PackageRegistrationException;
import org.eclipse.mylyn.docs.intent.client.compiler.errors.ResolveException;
import org.eclipse.mylyn.docs.intent.client.compiler.generator.modelgeneration.ModelingUnitGenerator;
import org.eclipse.mylyn.docs.intent.client.compiler.generator.modelgeneration.StructuralFeatureGenerator;
import org.eclipse.mylyn.docs.intent.client.compiler.generator.modellinking.ModelingUnitLinkResolver;
import org.eclipse.mylyn.docs.intent.client.compiler.utils.IntentCompilerInformationHolder;
import org.eclipse.mylyn.docs.intent.client.compiler.validator.GeneratedElementValidator;
import org.eclipse.mylyn.docs.intent.collab.repository.Repository;
import org.eclipse.mylyn.docs.intent.collab.repository.RepositoryConnectionException;
import org.eclipse.mylyn.docs.intent.core.compiler.UnresolvedContributionHolder;
import org.eclipse.mylyn.docs.intent.core.compiler.UnresolvedReferenceHolder;
import org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnit;
import org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnitInstructionReference;
import org.eclipse.mylyn.docs.intent.core.modelingunit.ResourceDeclaration;

/**
 * Modeling Unit Compiler : generate the elements described in modeling units and register those elements in
 * an information Handler ; also in charged of handling compilation errors if the described models are
 * incorrect.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public class ModelingUnitCompiler {

	/**
	 * Compilation mode : compiling modeling units defining EPackages only.
	 */
	private static final boolean EPACKAGE_DECLARATION_ONLY = true;

	/**
	 * Compilation mode : compiling all the other modeling units (mutual exclusion with the previous mode).
	 */
	private static final boolean ALL_MODELING_UNITS_EXCEPT_EPACKAGES_DECLARATION = false;

	/**
	 * The ModelingUnitGenerator used to generate the element described in one
	 * org.eclipse.mylyn.docs.intent.core.modelingunit.
	 */
	private final ModelingUnitGenerator modelingUnitGenerator;

	/**
	 * The entity used to hold informations about compilation.
	 */
	private final IntentCompilerInformationHolder informationHolder;

	/**
	 * The linkResolver used to resolved the links in modelingUnits.
	 */
	private final ModelingUnitLinkResolver linkResolver;

	/**
	 * The repository containing the modeling units to compile (and define available EPackages).
	 */
	private Repository repository;

	/**
	 * The progressMonitor to use for compilation ; if canceled, the compilation will stop immediately.
	 */
	private Monitor progressMonitor;

	/**
	 * ModelingUnitCompiler constructor.
	 * 
	 * @param repository
	 *            the repository containing the modeling units to compile
	 * @param linkResolver
	 *            the linkResolver used to resolved the links in modelingUnits
	 * @param informationHolder
	 *            the entity used to hold informations about compilation
	 * @param progressMonitor
	 *            the progressMonitor to use for compilation
	 */
	public ModelingUnitCompiler(Repository repository, ModelingUnitLinkResolver linkResolver,
			IntentCompilerInformationHolder informationHolder, Monitor progressMonitor) {
		this.repository = repository;
		this.informationHolder = informationHolder;
		this.modelingUnitGenerator = new ModelingUnitGenerator(linkResolver, informationHolder,
				progressMonitor);
		this.linkResolver = linkResolver;
		this.progressMonitor = progressMonitor;
	}

	/**
	 * Compile the given modelingUnits, compiling EPackages declaration first, and then other elements.
	 * 
	 * @param modelingUnits
	 *            the modeling units to compile
	 * @return the informationHolder containing all the needed informations (generated elements, errors,
	 *         mapping to resources).
	 */
	public IntentCompilerInformationHolder compile(List<ModelingUnit> modelingUnits) {
		if (!progressMonitor.isCanceled()) {
			// Step 0 : initialization of the information Holder
			informationHolder.initialize();
		}

		if (!progressMonitor.isCanceled()) {
			// Step 1 : compiling modeling units defining EPackages
			compileAllWithMode(modelingUnits, EPACKAGE_DECLARATION_ONLY);
		}

		if (!progressMonitor.isCanceled()) {
			// Step 2 : compiling all the other modeling units
			compileAllWithMode(modelingUnits, ALL_MODELING_UNITS_EXCEPT_EPACKAGES_DECLARATION);
		}

		if (!progressMonitor.isCanceled()) {
			// Step 3 : handle the unresolved contribution instructions
			for (String unresolvedName : informationHolder.getAllUnresolvedContributionsNames()) {
				// For each contribution instruction, we generate a compilationStatus
				for (UnresolvedContributionHolder unresolvedContributionHolder : informationHolder
						.getUnresolvedContributions(unresolvedName)) {
					if (!unresolvedContributionHolder.isResolved()) {
						informationHolder
								.registerCompilationExceptionAsCompilationStatus(new CompilationException(
										unresolvedContributionHolder.getReferencedContribution(),
										CompilationErrorType.INVALID_REFRENCE_ERROR,
										"The element "
												+ unresolvedName
												+ " cannot be resolved. This contribution instruction will be ignored. "));
					}
				}
			}
		}
		return IntentCompilerInformationHolder.getInstance();
	}

	/**
	 * Compile the given modeling units and register the generated objects into the informationHolder.
	 * 
	 * @param modelingUnits
	 *            the modelingUnits to compile
	 * @param generateOnlyEPackages
	 *            indicates if we only consider EPackages
	 */
	protected void compileAllWithMode(List<ModelingUnit> modelingUnits, boolean generateOnlyEPackages) {
		// Step 1 : initialization.

		// modelingUnitGenerator.clearResourceDeclarations();

		// Step 2.1 : Compilation of each org.eclipse.mylyn.docs.intent.core.modelingunit contained in the
		// list
		// (without resolving links)
		for (ModelingUnit modelingUnitToCompile : modelingUnits) {
			if (!progressMonitor.isCanceled()) {
				this.compileModelingUnit(modelingUnitToCompile, generateOnlyEPackages);
			}
		}

		// Step 2.3 : link Resolving
		if (!progressMonitor.isCanceled()) {
			resolveLinks();
		}

		// Step 2.4 : we associate each generated object in the given resource
		if (!progressMonitor.isCanceled()) {
			mapResourceDeclarationToGeneratedObjects();
		}
		// Step 2.5 : Validation
		if (!progressMonitor.isCanceled()) {
			validateGeneratedElement();
		}
		// TODO Handle compilation Time.

	}

	/**
	 * Maps the resource declarations detected by the generator to the generatedElements ; if invalid
	 * reference are found, register those errors as compilationStatus.
	 */
	protected void mapResourceDeclarationToGeneratedObjects() {

		// For each declared resource
		List<ResourceDeclaration> resourcesDeclarations = modelingUnitGenerator.getResourceDeclarations();
		for (ResourceDeclaration resource : resourcesDeclarations) {
			// For each reference to a generated Object
			for (ModelingUnitInstructionReference newContainedElementRefrence : resource.getContent()) {
				// We resolve this reference
				try {
					EObject newContainedElement = linkResolver.resolveReferenceinElementList(resource, null,
							newContainedElementRefrence.getIntentHref());
					// and add it to the resource mapping of the informationHolder
					informationHolder.addResourceToGeneratedElementMapping(resource, newContainedElement);
				} catch (InvalidReferenceException e) {
					// If the reference cannot be resolved, we register a new compilation status.
					informationHolder
							.registerCompilationExceptionAsCompilationStatus(new CompilationException(
									resource, CompilationErrorType.INVALID_REFRENCE_ERROR, e.getMessage()));
				}
			}
		}

	}

	/**
	 * Generates and return the elements described in the given modeling Unit, and register errors in the
	 * described model as compilationStatus.
	 * 
	 * @param modelingUnitToCompile
	 *            the modeling Unit to inspect
	 * @param generateOnlyEPackages
	 *            indicates if we only consider EPackages
	 * @return a list containing the elements described in the given modeling Unit
	 */
	protected List<EObject> compileModelingUnit(ModelingUnit modelingUnitToCompile,
			boolean generateOnlyEPackages) {

		List<EObject> generatedObjects = new ArrayList<EObject>();
		AbstractRuntimeCompilationException thrownException = null;
		CompilationErrorType compilationErrorType = null;
		informationHolder.setCurrentImportedPackages(getImportedPackages(modelingUnitToCompile,
				generateOnlyEPackages));

		try {
			modelingUnitGenerator.setGenerateOnlyEPackages(generateOnlyEPackages);
			modelingUnitGenerator.generate(modelingUnitToCompile);
			return generatedObjects;
		} catch (ResolveException e) {
			thrownException = e;
		} catch (PackageNotFoundResolveException e) {
			thrownException = e;
			compilationErrorType = CompilationErrorType.PACKAGE_NOT_FOUND_ERROR;
		} catch (PackageRegistrationException e) {
			thrownException = e;
			compilationErrorType = CompilationErrorType.PACKAGE_REGISTRATION_ERROR;
		} catch (InvalidReferenceException e) {
			thrownException = e;
			compilationErrorType = CompilationErrorType.INVALID_REFRENCE_ERROR;
		} catch (InvalidValueException e) {
			thrownException = e;
			compilationErrorType = CompilationErrorType.INVALID_VALUE_ERROR;
		}
		CompilationException compilationException = new CompilationException(
				thrownException.getInvalidInstruction(), compilationErrorType, thrownException.getMessage());
		compilationException.setStackTrace(thrownException.getStackTrace());

		return generatedObjects;
	}

	/**
	 * Returns the packages imported by the given modelingUnit.
	 * 
	 * @param modelingUnitToCompile
	 *            the modelingUnit to inspect
	 * @param generateOnlyEPackages
	 *            indicates if the compiler is currently genereting EPackages only
	 * @return the packages imported by the given modelingUnit
	 */
	@Deprecated
	protected List<String> getImportedPackages(ModelingUnit modelingUnitToCompile,
			boolean generateOnlyEPackages) {
		// TODO define a priority between EPackages to consider
		List<String> importedPackages = new ArrayList<String>();
		try {
			importedPackages.add(EcorePackage.eINSTANCE.getNsURI());
			for (String ePackage : repository.getPackageRegistry().keySet()) {
				importedPackages.add(ePackage);
			}
		} catch (RepositoryConnectionException e) {
			// Nothing to do, packages will not be correctly computed and a compilation error will be thrown
		}
		return importedPackages;
	}

	/**
	 * Resolves the unresolvedReference (registered in the InformationHolder) using a linkResolver.
	 * 
	 * @param generatedObjects
	 */
	protected void resolveLinks() {

		for (EObject elementContainingUnresolvedReference : informationHolder.getCurrentCreatedElements()) {
			for (UnresolvedReferenceHolder referenceHolder : informationHolder
					.getUnresolvedReferencesByGeneratedElement(elementContainingUnresolvedReference)) {

				// This list will contains the resolved value of the reference
				List<Object> referenceValue = new ArrayList<Object>();
				try {
					try {

						EObject referencedElement = linkResolver.resolveReferenceinElementList(
								referenceHolder.getInstructionContainer(),
								// should be referenceHolder.getConcernedFeature().eClass()
								null, referenceHolder.getTextualReference());
						referenceValue.add(referencedElement);

					} catch (InvalidReferenceException e) {
						// If the link to resolve is not an instance,
						// we can use the imported package to resolve it
						referenceValue.add(linkResolver.resolveEClassifierUsingPackage(
								referenceHolder.getInstructionContainer(),
								informationHolder.getCurrentImportedPackages(),
								referenceHolder.getTextualReference()));
					}

					StructuralFeatureGenerator.setFeatureValueInElement(elementContainingUnresolvedReference,
							referenceHolder.getConcernedFeature(), referenceValue);
				} catch (ResolveException e) {
					// If the reference cannot be resolved with both ways
					// we register a compilation status
					informationHolder
							.registerCompilationExceptionAsCompilationStatus(new CompilationException(e
									.getInvalidInstruction(), CompilationErrorType.INVALID_REFRENCE_ERROR, e
									.getMessage()));
				}
			}
		}
	}

	/**
	 * Validate the generated Elements and create a Compilation Status if the generation Failed.
	 */
	protected void validateGeneratedElement() {

		for (EObject generatedElement : informationHolder.getCurrentCreatedElements()) {
			GeneratedElementValidator validator = new GeneratedElementValidator(
					informationHolder.getInstructionByCreatedElement(generatedElement), generatedElement);
			Diagnostic diagnostic;
			try {
				diagnostic = validator.validate();

				informationHolder.registerDiagnosticAsCompilationStatusList(generatedElement, diagnostic);
			} catch (CompilationException e) {
				informationHolder.registerCompilationExceptionAsCompilationStatus(e);
			}
		}
	}

}
