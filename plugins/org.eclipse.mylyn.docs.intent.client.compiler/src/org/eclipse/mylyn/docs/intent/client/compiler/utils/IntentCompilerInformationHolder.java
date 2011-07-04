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

import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mylyn.docs.intent.client.compiler.errors.CompilationException;
import org.eclipse.mylyn.docs.intent.client.compiler.errors.InvalidValueException;
import org.eclipse.mylyn.docs.intent.core.compiler.CompilationInformationHolder;
import org.eclipse.mylyn.docs.intent.core.compiler.CompilationMessageType;
import org.eclipse.mylyn.docs.intent.core.compiler.CompilationStatus;
import org.eclipse.mylyn.docs.intent.core.compiler.CompilationStatusManager;
import org.eclipse.mylyn.docs.intent.core.compiler.CompilerFactory;
import org.eclipse.mylyn.docs.intent.core.compiler.StringToEObjectMap;
import org.eclipse.mylyn.docs.intent.core.compiler.UnresolvedContributionHolder;
import org.eclipse.mylyn.docs.intent.core.compiler.UnresolvedReferenceHolder;
import org.eclipse.mylyn.docs.intent.core.genericunit.UnitInstruction;
import org.eclipse.mylyn.docs.intent.core.modelingunit.ContributionInstruction;
import org.eclipse.mylyn.docs.intent.core.modelingunit.InstanciationInstruction;
import org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnit;
import org.eclipse.mylyn.docs.intent.core.modelingunit.ResourceDeclaration;

/**
 * Class storing all the informations that can be needed by any entity of the compilation process.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public final class IntentCompilerInformationHolder {

	/**
	 * Current instance of the information Holder (singleton).
	 */
	private static IntentCompilerInformationHolder currentInstance;

	/**
	 * The informationHolder used to store informations.
	 */
	private CompilationInformationHolder informationHolder;

	/**
	 * List of the currentImportedPackages.
	 */
	private List<String> currentImportedPackages;

	private CompilationStatusManager statusManager;

	/**
	 * IntentCompilerInformationHolder constructor.
	 */
	private IntentCompilerInformationHolder() {
		this.informationHolder = CompilerFactory.eINSTANCE.createCompilationInformationHolder();
	}

	/**
	 * Returns the current instance of the information Holder (singleton).
	 * 
	 * @return the current instance of the information Holder (singleton)
	 */
	public static IntentCompilerInformationHolder getInstance() {
		if (currentInstance == null) {
			currentInstance = new IntentCompilerInformationHolder();
		}
		return currentInstance;
	}

	/**
	 * Initialize this IntentCompilerInformationHolder by clearing all informations.
	 */
	public void initialize() {
		informationHolder = CompilerFactory.eINSTANCE.createCompilationInformationHolder();

		if (statusManager == null) {
			statusManager = CompilerFactory.eINSTANCE.createCompilationStatusManager();
		} else {
			statusManager.getCompilationStatusList().clear();
			statusManager.getModelingUnitToStatusList().clear();
		}
	}

	public CompilationStatusManager getStatusManager() {
		return statusManager;
	}

	/**
	 * Add the given element to the current created element list.
	 * 
	 * @param instruction
	 *            the instruction that declared this element
	 * @param createdElement
	 *            the element to register
	 */
	private void addCreatedElementsToCurrentList(UnitInstruction instruction, EObject createdElement) {
		if (createdElement != null) {
			this.getCurrentCreatedElements().add(createdElement);
			this.informationHolder.getCreatedElementsToInstructions().put(createdElement, instruction);
		}
	}

	/**
	 * Returns the instruction that declared the given element.
	 * 
	 * @param createdElement
	 *            the element to inspect
	 * @return the instruction that declared the given element
	 */
	public UnitInstruction getInstructionByCreatedElement(EObject createdElement) {
		return this.informationHolder.getCreatedElementsToInstructions().get(createdElement);
	}

	/**
	 * Returns the object associated to the given name (used for resolving reference).
	 * 
	 * @param type
	 *            the type of the researched element.
	 * @param name
	 *            Name of the searched object.
	 * @return the object associated to the given name
	 */
	public Object getCreatedInstanceByName(EClassifier type, String name) {
		Object createdInstance = null;
		if (type != null) {
			return this.informationHolder.getTypeToNameToElementsMap().get(type).getNameToElement().get(name);
		} else {
			// If type is null we search this instance for any type
			for (EClassifier possibleType : this.informationHolder.getTypeToNameToElementsMap().keySet()) {
				createdInstance = this.informationHolder.getTypeToNameToElementsMap().get(possibleType)
						.getNameToElement().get(name);
				if (createdInstance != null) {
					break;
				}
			}
			return createdInstance;
		}
	}

	/**
	 * Add the given generated element to the given resource's content list.
	 * 
	 * @param resource
	 *            the resource to map with the given element
	 * @param newContainedElement
	 *            the element to map with the given resource
	 */
	public void addResourceToGeneratedElementMapping(ResourceDeclaration resource, EObject newContainedElement) {
		if (this.informationHolder.getResourceToContainedElements().get(resource) == null) {
			this.informationHolder.getResourceToContainedElements().put(resource, new BasicEList<EObject>());
		}
		this.informationHolder.getResourceToContainedElements().get(resource).add(newContainedElement);

	}

	/**
	 * Returns the declared resources.
	 * 
	 * @return the declared resources.
	 */
	public Set<ResourceDeclaration> getDeclaredResources() {
		return this.informationHolder.getResourceToContainedElements().keySet();
	}

	/**
	 * Returns the given's resource content (generated elements).
	 * 
	 * @param resource
	 *            the resource to inspect
	 * @return the given's resource content (generated elements)
	 */
	public EList<EObject> getResourceContent(ResourceDeclaration resource) {
		return this.informationHolder.getResourceToContainedElements().get(resource);
	}

	/**
	 * Add to the unresolvedReference list of the given element the given referenceHolder.
	 * 
	 * @param generatedElement
	 *            the element that contains the unresolved reference to add
	 * @param referenceHolder
	 *            the referenceHolder containing the feature containing the unresolved reference and the
	 *            textual value of it
	 */
	public void addUnresolvedReference(EObject generatedElement, UnresolvedReferenceHolder referenceHolder) {
		if (this.informationHolder.getElementToUnresolvedReferenceMap().get(generatedElement) == null) {
			this.informationHolder.getElementToUnresolvedReferenceMap().put(generatedElement,
					new BasicEList<UnresolvedReferenceHolder>());
		}
		this.informationHolder.getElementToUnresolvedReferenceMap().get(generatedElement)
				.add(referenceHolder);
	}

	/**
	 * Returns a list containing the unresolved references for the given element.
	 * 
	 * @param elementContainingUnresolvedReference
	 *            the element to inspect
	 * @return a list containing the unresolved references for the given element
	 */
	public EList<UnresolvedReferenceHolder> getUnresolvedReferencesByGeneratedElement(
			EObject elementContainingUnresolvedReference) {
		EList<UnresolvedReferenceHolder> unresolvedRefs = this.informationHolder
				.getElementToUnresolvedReferenceMap().get(elementContainingUnresolvedReference);
		if (unresolvedRefs == null) {
			unresolvedRefs = new BasicEList<UnresolvedReferenceHolder>();
		}
		return unresolvedRefs;
	}

	/**
	 * Sets the list of current imported packages (URIs form).
	 * 
	 * @param importedPackages
	 *            the list of current imported packages (URIs form)
	 */
	public void setCurrentImportedPackages(List<String> importedPackages) {
		this.currentImportedPackages = importedPackages;
	}

	/**
	 * Returns the list of current imported packages (URIs form).
	 * 
	 * @return the list of current imported packages (URIs form)
	 */
	public List<String> getCurrentImportedPackages() {
		return currentImportedPackages;
	}

	public List<EObject> getCurrentCreatedElements() {
		return this.informationHolder.getCurrentGeneratedElementList();
	}

	/**
	 * Try to add the given createdElement identified by the given name ; throws an exception if an element
	 * has already been registered with this name.
	 * 
	 * @param name
	 *            name (identifier) of the element to register
	 * @param createdElement
	 *            the createdElement
	 * @param instruction
	 *            the instruction that declared this element
	 */
	public void addNameToCreatedElementEntry(String name, EObject createdElement,
			InstanciationInstruction instruction) {

		// If an element has already been registered with this name
		if (this.getNameToCreatedElement().get(name) != null) {
			throw new InvalidValueException(instruction, "The name " + name
					+ " has already been used to identify an element.");
		}

		// Otherwise, we register the given element
		if (this.getNameToCreatedElement().get(createdElement.eClass()) == null) {
			this.getNameToCreatedElement().put(createdElement.eClass(),
					CompilerFactory.eINSTANCE.createStringToEObjectMap());
		}
		this.getNameToCreatedElement().get(createdElement.eClass()).getNameToElement()
				.put(name, createdElement);
		this.addCreatedElementsToCurrentList(instruction, createdElement);

		// If there were unresolved contribution instructions associated to this element
		// if (this.informationHolder.getUnresolvedContributions().get(name) != null) {
		// this.informationHolder.getUnresolvedContributions().get(name).setResolved(true);
		// }
	}

	public boolean isUnresolvedContribution(ContributionInstruction contributionInstruction) {
		boolean isUnresolved = this.informationHolder.getUnresolvedContributions().get(
				contributionInstruction.getReferencedElement().getIntentHref()) == null;
		if (!isUnresolved) {
			isUnresolved = true;
			for (UnresolvedContributionHolder holder : this.informationHolder.getUnresolvedContributions()
					.get(contributionInstruction.getReferencedElement().getIntentHref())) {
				if (holder.getReferencedContribution() == contributionInstruction) {
					isUnresolved = isUnresolved && !holder.isResolved();
				}
			}
		}
		return isUnresolved;
	}

	public EList<UnresolvedContributionHolder> getContributionsAssociatedTo(String contributedElementName) {
		if (this.informationHolder.getUnresolvedContributions().get(contributedElementName) != null) {
			return new BasicEList<UnresolvedContributionHolder>(this.informationHolder
					.getUnresolvedContributions().get(contributedElementName));

		}
		return new BasicEList<UnresolvedContributionHolder>();
	}

	/**
	 * Return the list of unresolved contribution instructions for the element with the given name.
	 * 
	 * @param contributedElementName
	 *            the name of the element that is associated with unresolved contribution exceptions.
	 * @return the list of unresolved contribution instructions for the element with the given name
	 */
	public EList<UnresolvedContributionHolder> getUnresolvedContributions(String contributedElementName) {

		if (this.informationHolder.getUnresolvedContributions().get(contributedElementName) != null) {
			return this.informationHolder.getUnresolvedContributions().get(contributedElementName);
		}
		return new BasicEList<UnresolvedContributionHolder>();
	}

	/**
	 * Returns the textual reference that remained unresolved for contribution instructions.
	 * 
	 * @return the textual reference that remained unresolved for contribution instructions
	 */
	public Set<String> getAllUnresolvedContributionsNames() {
		return this.informationHolder.getUnresolvedContributions().keySet();
	}

	/**
	 * Returns a map associating created elements to their names and sorted by the elements type.
	 * 
	 * @return a map associating created elements to their names and sorted by the elements type
	 */
	private EMap<EClassifier, StringToEObjectMap> getNameToCreatedElement() {
		return this.informationHolder.getTypeToNameToElementsMap();
	}

	/**
	 * returns the validation informations related to the createdElements.
	 * 
	 * @return a mapping between ModelingUnits and the validation informations related to the createdElements
	 */
	public EList<CompilationStatus> getCompilationStatusList() {
		return this.statusManager.getCompilationStatusList();
	}

	/**
	 * Registers the given compilationException as a new CompilationStatus.
	 * 
	 * @param compilationException
	 *            the compilation Exception to register
	 */
	public void registerCompilationExceptionAsCompilationStatus(CompilationException compilationException) {

		EList<CompilationStatus> compilationStatusList = new BasicEList<CompilationStatus>();

		// Step 1 : we convert each the CompilationException in a CompilationStatus
		CompilationStatus newStatus = CompilerFactory.eINSTANCE.createCompilationStatus();
		newStatus.setMessage(compilationException.getMessage());
		newStatus.setSeverity(CompilationStatusConverter
				.createStatusSeverityFromCompilationExceptionErrorType(compilationException.getType()));
		newStatus.setType(CompilationStatusConverter
				.createStatusTypeFromCompilationExceptionErrorType(compilationException.getType()));
		newStatus.setTarget(compilationException.getInvalidInstruction());

		// and add this status to the diagnostic list.
		compilationStatusList.add(newStatus);

		// Step 2 : we register the new Diagnostics in the informationHolder
		addStatusListToInformationHolder(
				getModelingUnitForInstruction(compilationException.getInvalidInstruction()),
				compilationStatusList);
	}

	/**
	 * Register the given diagnostic for the given generatedElement as a new CompilationStatus.
	 * 
	 * @param generatedElement
	 *            the generatedElement containing diagnostic errors
	 * @param diagnostic
	 *            the diagnostic to register
	 */
	public void registerDiagnosticAsCompilationStatusList(EObject generatedElement, Diagnostic diagnostic) {
		EList<CompilationStatus> compilationStatusList = new BasicEList<CompilationStatus>();
		for (Diagnostic subDiagnostic : diagnostic.getChildren()) {
			// Step 1 : we convert each sub-diagnostic in a CompilationStatus
			CompilationStatus newStatus = CompilerFactory.eINSTANCE.createCompilationStatus();
			newStatus.setMessage(subDiagnostic.getMessage());
			newStatus.setSeverity(CompilationStatusConverter
					.createStatusSeverityFromDiagnosticSeverity(subDiagnostic));
			newStatus.setType(CompilationMessageType.VALIDATION_ERROR);
			newStatus.setTarget(this.getInstructionByCreatedElement(generatedElement));

			// and add this status to the diagnostic list.
			compilationStatusList.add(newStatus);
		}

		// Step 2 : we register the new Diagnostics in the informationHolder
		addStatusListToInformationHolder(
				getModelingUnitForInstruction(getInstructionByCreatedElement(generatedElement)),
				compilationStatusList);

	}

	/**
	 * Adds the given list of compilation status to the global status list and the map
	 * ModelingUnitToStatusList.
	 * 
	 * @param unit
	 *            the modeling unit containing the given status list
	 * @param compilationStatusList
	 *            the list of status to add
	 */
	private void addStatusListToInformationHolder(ModelingUnit unit,
			EList<CompilationStatus> compilationStatusList) {

		// First in the general Status List
		this.statusManager.getCompilationStatusList().addAll(compilationStatusList);

		// Then in the ModelingUnit to StatusList map.
		if (this.statusManager.getModelingUnitToStatusList().get(unit) == null) {
			this.statusManager.getModelingUnitToStatusList().put(unit, new BasicEList<CompilationStatus>());
		}
		this.statusManager.getModelingUnitToStatusList().get(unit).addAll(compilationStatusList);
	}

	/**
	 * Returns the modeling unit associated to the given instruction.
	 * 
	 * @param instruction
	 *            the instruction to inspect
	 * @return the modeling unit associated to the given instruction
	 */
	private ModelingUnit getModelingUnitForInstruction(UnitInstruction instruction) {
		ModelingUnit foundModelingUnit = (ModelingUnit)instruction.getUnit();
		UnitInstruction parentInstruction = instruction;

		while (foundModelingUnit == null) {
			parentInstruction = (UnitInstruction)parentInstruction.eContainer();
			if (parentInstruction != null) {
				foundModelingUnit = (ModelingUnit)parentInstruction.getUnit();
			} else {
				foundModelingUnit = null;
			}
		}
		return foundModelingUnit;
	}

	/**
	 * Add to the mapping between textual reference and contribution instructions the given contribution
	 * instruction.
	 * 
	 * @param instanceTextualReference
	 *            The textual reference to the contributed instance
	 * @param contributionInstruction
	 *            the contribution instruction to add to the unresolvedCOntribution.
	 */
	public void addUnresolvedContribution(String instanceTextualReference,
			ContributionInstruction contributionInstruction) {
		if (this.informationHolder.getUnresolvedContributions().get(instanceTextualReference) == null) {
			this.informationHolder.getUnresolvedContributions().put(instanceTextualReference,
					new BasicEList<UnresolvedContributionHolder>());
		}

		if (!isRegisteredUnresolvedContribution(contributionInstruction)) {
			UnresolvedContributionHolder holder = CompilerFactory.eINSTANCE
					.createUnresolvedContributionHolder();
			holder.setResolved(false);
			holder.setReferencedContribution(contributionInstruction);

			this.informationHolder.getUnresolvedContributions().get(instanceTextualReference).add(holder);
		}
	}

	public boolean isRegisteredUnresolvedContribution(ContributionInstruction contributionInstruction) {
		boolean isRegistered = false;
		for (UnresolvedContributionHolder holder : this.informationHolder.getUnresolvedContributions().get(
				contributionInstruction.getReferencedElement().getIntentHref())) {
			isRegistered = isRegistered || (holder.getReferencedContribution() == contributionInstruction);
		}
		return isRegistered;
	}

	/**
	 * Sets the given contribution instruction as resolved (i.e. remove it from its
	 * unresolvedContributionHolder) ; if the unresolvedContributionHolder associated to the textual reference
	 * is empty, we remove it from the map.
	 * 
	 * @param contributionInstruction
	 *            the contributionInstruction to consider as resolved.
	 */
	public void setContributionInstructionAsResolved(ContributionInstruction contributionInstruction) {

		for (UnresolvedContributionHolder holder : informationHolder.getUnresolvedContributions().get(
				contributionInstruction.getReferencedElement().getIntentHref())) {

			if (holder.getReferencedContribution() == contributionInstruction) {
				holder.setResolved(true);
			}
		}
	}
}
