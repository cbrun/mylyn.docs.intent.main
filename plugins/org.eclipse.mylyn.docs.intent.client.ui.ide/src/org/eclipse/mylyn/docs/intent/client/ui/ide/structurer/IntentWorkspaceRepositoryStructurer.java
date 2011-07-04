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
package org.eclipse.mylyn.docs.intent.client.ui.ide.structurer;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.mylyn.docs.intent.collab.common.location.IntentLocations;
import org.eclipse.mylyn.docs.intent.collab.handlers.adapters.ReadOnlyException;
import org.eclipse.mylyn.docs.intent.collab.handlers.adapters.RepositoryAdapter;
import org.eclipse.mylyn.docs.intent.collab.ide.adapters.DefaultWorkspaceRepositoryStructurer;
import org.eclipse.mylyn.docs.intent.collab.ide.adapters.WorkspaceAdapter;
import org.eclipse.mylyn.docs.intent.core.descriptionunit.DescriptionUnit;
import org.eclipse.mylyn.docs.intent.core.document.IntentChapter;
import org.eclipse.mylyn.docs.intent.core.document.IntentDocument;
import org.eclipse.mylyn.docs.intent.core.document.IntentSection;
import org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnit;

/**
 * Structurer for a Workspace repository containing Intent informations.
 * <p>
 * Resource are spited according to the following heuristic :
 * <ul>
 * <li>Each structured element (IntentDocument, IntentChapter, IntentSection) is sorted according to its type (one folder
 * for each type) and is placed in its own resource.</li>
 * <li>Each ModelingUnit is placed in the ModelingUnit folder and in its own resource.</li>
 * <li>Each DecriptionUnit is placed in the DecriptionUnit folder and in its own resource.</li>
 * </ul>
 * </p>
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public class IntentWorkspaceRepositoryStructurer extends DefaultWorkspaceRepositoryStructurer {

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.collab.ide.adapters.RepositoryStructurer#structure(org.eclipse.mylyn.docs.intent.collab.handlers.adapters.RepositoryAdapter)
	 */
	@Override
	public void structure(RepositoryAdapter repositoryAdapter) throws ReadOnlyException {
		super.structure(repositoryAdapter);
		WorkspaceAdapter workspaceAdapter = (WorkspaceAdapter)repositoryAdapter;

		// We start splitting the elements from the IntentDocument
		Resource documentResource = workspaceAdapter.getResource(IntentLocations.INTENT_INDEX);
		for (EObject document : documentResource.getContents()) {
			splitElementAndSons(workspaceAdapter, document);
		}
	}

	/**
	 * Place the given element in the correct resource and splits its contained elements.
	 * 
	 * @param workspaceAdapter
	 *            the RepositoryAdapter to use for restructuring the repository
	 * @param element
	 *            the element to split
	 * @throws ReadOnlyException
	 *             if the current context associated to the given adapter is read-only
	 */
	protected void splitElementAndSons(WorkspaceAdapter workspaceAdapter, EObject element)
			throws ReadOnlyException {
		if (isElementToSplit(element)) {
			if (!(isCorrectlySplit(element))) {
				// We have to place this element in a new resource
				// The resource path follows the following structure :
				// <INTENT_FOLDER> <CLASS_NAME> / <IDENTIFIER>
				String newResourcePath = IntentLocations.INTENT_FOLDER + element.eClass().getName() + "/"
						+ getIdentifierForElement(workspaceAdapter, element);
				// We set the container's resource as modified
				element.eContainer().eResource().setModified(true);
				Resource newResource = workspaceAdapter.getOrCreateResource(newResourcePath);

				newResource.getContents().add(element);
				newResource.setTrackingModification(true);
			}
			for (EObject containedElement : element.eContents()) {
				splitElementAndSons(workspaceAdapter, containedElement);
			}
		}
	}

	/**
	 * Returns the resource identifier to associate with the given element.
	 * 
	 * @param workspaceAdapter
	 *            is the workspace adapter
	 * @param element
	 *            the element to consider
	 * @return the resource identifier to associate with the given element
	 */
	private String getIdentifierForElement(WorkspaceAdapter workspaceAdapter, EObject element) {
		// FIXME find a better identifier : can cause problems if two resources are created exactly at the
		// same time.
		String initialProposal = String.valueOf(System.currentTimeMillis() + "_"
				+ Math.ceil(Math.random() * 100));
		String proposal = initialProposal;
		// int i = 0;
		// while (workspaceAdapter.getResource(proposal) != null) {
		// proposal = initialProposal + "_" + String.valueOf(i);
		// }
		return proposal;
	}

	/**
	 * Indicates if the given element is correctly split.
	 * <p>
	 * We consider that a Intent element is correctly split if it's a IntentDocument <b>OR</b> : <br/>
	 * <ul>
	 * <li>its associated resource isn't null <b> AND </b></li>
	 * <li>it doesn't share the same resource as its container</li>
	 * </ul>
	 * </p>
	 * 
	 * @param element
	 * @return
	 */
	private boolean isCorrectlySplit(EObject element) {
		boolean isCorrectlySplit = true;
		isCorrectlySplit = element.eResource() != null;
		isCorrectlySplit = isCorrectlySplit && (element.eContainer() != null);
		if (isCorrectlySplit) {
			isCorrectlySplit = isCorrectlySplit && (element.eContainer().eResource() != element.eResource());
		}
		return isCorrectlySplit || (element instanceof IntentDocument);
	}

	/**
	 * Indicates if the given element should be placed in its own resource.
	 * 
	 * @param element
	 *            the element to inspect
	 * @return true if the given element should be placed in its own resource, false otherwise
	 */
	protected boolean isElementToSplit(EObject element) {
		boolean isElementToSplit = (element instanceof IntentDocument) || (element instanceof IntentChapter)
						|| (element instanceof IntentSection);
		return isElementToSplit || (element instanceof ModelingUnit) || (element instanceof DescriptionUnit);
	}
}
