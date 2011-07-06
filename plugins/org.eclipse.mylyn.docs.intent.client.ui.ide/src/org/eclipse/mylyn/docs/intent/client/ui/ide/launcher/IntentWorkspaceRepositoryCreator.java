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
package org.eclipse.mylyn.docs.intent.client.ui.ide.launcher;

import com.google.common.base.Predicate;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.mylyn.docs.intent.client.ui.ide.structurer.IntentWorkspaceRepositoryStructurer;
import org.eclipse.mylyn.docs.intent.collab.handlers.adapters.RepositoryAdapter;
import org.eclipse.mylyn.docs.intent.collab.ide.adapters.WorkspaceAdapter;
import org.eclipse.mylyn.docs.intent.collab.ide.utils.WorkspaceRepositoryCreator;
import org.eclipse.mylyn.docs.intent.collab.repository.Repository;
import org.eclipse.mylyn.docs.intent.collab.repository.RepositoryConnectionException;
import org.eclipse.mylyn.docs.intent.core.indexer.IntentIndex;

/**
 * A {@link WorkspaceRepositoryCreator} customized for Intent.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public class IntentWorkspaceRepositoryCreator extends WorkspaceRepositoryCreator {

	/**
	 * Default constructor.
	 * 
	 * @param structurer
	 *            the structurer to attach to each created Workspace adapter
	 */
	public IntentWorkspaceRepositoryCreator(IntentWorkspaceRepositoryStructurer structurer) {
		super(structurer);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.collab.ide.utils.WorkspaceRepositoryCreator#createRepositoryAdapterForRepository(org.eclipse.mylyn.docs.intent.collab.repository.Repository)
	 */
	@Override
	public RepositoryAdapter createRepositoryAdapterForRepository(Repository repository)
			throws RepositoryConnectionException {
		WorkspaceAdapter workspaceAdapter = (WorkspaceAdapter)super
				.createRepositoryAdapterForRepository(repository);

		// We set a new unloadable Resource Predicate
		workspaceAdapter.setUnloadableResourcePredicate(new Predicate<Resource>() {

			public boolean apply(Resource resource) {
				// The Intent index should never be unloaded
				if (!resource.getContents().isEmpty()) {
					EObject root = resource.getContents().iterator().next();
					return root instanceof IntentIndex;
				}
				return false;
			}
		});
		return workspaceAdapter;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.collab.ide.utils.WorkspaceRepositoryCreator#initialisePackageRegistry(org.eclipse.mylyn.docs.intent.collab.repository.Repository)
	 */
	@Override
	protected void initialisePackageRegistry(Repository repository) throws RepositoryConnectionException {
		super.initialisePackageRegistry(repository);
		// Getting all registered EPackages and add them to the repository package registry
		for (String epackageURI : EPackage.Registry.INSTANCE.keySet()) {
			repository.getPackageRegistry().put(epackageURI, EPackage.Registry.INSTANCE.get(epackageURI));
		}
	}
}
