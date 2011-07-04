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
package org.eclipse.mylyn.docs.intent.client.ui.cdo.repositoryutils;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.cdo.eresource.EresourcePackage;
import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.mylyn.docs.intent.collab.cdo.adapters.CDOAdapter;
import org.eclipse.mylyn.docs.intent.collab.cdo.repository.CDOConfig;
import org.eclipse.mylyn.docs.intent.collab.cdo.repository.CDORepository;
import org.eclipse.mylyn.docs.intent.collab.cdo.utils.CDORepositoryCreator;
import org.eclipse.mylyn.docs.intent.collab.handlers.RepositoryObjectHandler;
import org.eclipse.mylyn.docs.intent.collab.handlers.adapters.RepositoryAdapter;
import org.eclipse.mylyn.docs.intent.collab.handlers.impl.ReadWriteRepositoryObjectHandlerImpl;
import org.eclipse.mylyn.docs.intent.collab.handlers.impl.notification.elementList.ElementListAdapter;
import org.eclipse.mylyn.docs.intent.collab.handlers.impl.notification.elementList.ElementListNotificator;
import org.eclipse.mylyn.docs.intent.collab.handlers.notification.Notificator;
import org.eclipse.mylyn.docs.intent.collab.repository.Repository;
import org.eclipse.mylyn.docs.intent.collab.repository.RepositoryConnectionException;
import org.eclipse.mylyn.docs.intent.core.compiler.CompilerPackage;
import org.eclipse.mylyn.docs.intent.core.descriptionunit.DescriptionUnitPackage;
import org.eclipse.mylyn.docs.intent.core.document.IntentDocumentPackage;
import org.eclipse.mylyn.docs.intent.core.genericunit.GenericUnitPackage;
import org.eclipse.mylyn.docs.intent.core.indexer.IntentIndexerPackage;
import org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnitPackage;
import org.eclipse.mylyn.docs.intent.markup.markup.MarkupPackage;

/**
 * Construct Repository according to configuration files.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public final class CDORepositoryCreatorForIntent extends CDORepositoryCreator {

	/**
	 * The current instance of the RepositoryCreator.
	 */
	private static CDORepositoryCreator currentInstance;

	/**
	 * RepositoryCreator constructor.
	 */
	public CDORepositoryCreatorForIntent() {
		super();
	}

	/**
	 * Constructs an Intent Repository according to configuration files.
	 * 
	 * @return the constructed repository
	 * @throws RepositoryConnectionException
	 *             if the repository connection cannot be established
	 */
	public Repository createRepository() throws RepositoryConnectionException {
		CDOConfig cdoConfig = new CDOConfig(IntentRepositoryConnectionSettingsForCDO.REPOSITORY_COMPLETE_ADRESS,
				IntentRepositoryConnectionSettingsForCDO.REPOSITORY_NAME);
		Repository repository = new CDORepository(cdoConfig);
		initialisePackageRegistry(repository);
		return repository;
	}

	/**
	 * Initializes the package registry of the given repository.
	 * 
	 * @param repository
	 *            the repository containing the package registry to initialize
	 * @throws RepositoryConnectionException
	 *             if the repository connection cannot be established
	 */
	private void initialisePackageRegistry(Repository repository) throws RepositoryConnectionException {
		repository.getPackageRegistry().put(IntentIndexerPackage.eNS_URI, IntentIndexerPackage.eINSTANCE);
		repository.getPackageRegistry().put(IntentDocumentPackage.eNS_URI, IntentDocumentPackage.eINSTANCE);
		repository.getPackageRegistry().put(ModelingUnitPackage.eNS_URI, ModelingUnitPackage.eINSTANCE);
		repository.getPackageRegistry().put(DescriptionUnitPackage.eNS_URI, DescriptionUnitPackage.eINSTANCE);
		repository.getPackageRegistry().put(GenericUnitPackage.eNS_URI, GenericUnitPackage.eINSTANCE);
		repository.getPackageRegistry().put(MarkupPackage.eNS_URI, MarkupPackage.eINSTANCE);
		repository.getPackageRegistry().put(CompilerPackage.eNS_URI, CompilerPackage.eINSTANCE);
		repository.getPackageRegistry().put(IntentDocumentPackage.eNS_URI, IntentDocumentPackage.eINSTANCE);
		repository.getPackageRegistry().put(EresourcePackage.eNS_URI, EresourcePackage.eINSTANCE);

	}

	/**
	 * Creates an handler notified of all changes made on any element of the resource at the given path.
	 * 
	 * @param repository
	 *            the repository containing the listened objects
	 * @param pathToListenedResource
	 *            the path of the listened resource
	 * @return a new handler that will be notified of all changes made on the element at the given path
	 * @throws RepositoryConnectionException
	 *             if the connection to the given repository is invalid
	 */
	public RepositoryObjectHandler createHandler(String pathToListenedResource, Repository repository)
			throws RepositoryConnectionException {
		// We first create an adapter to get the resource to listen
		RepositoryAdapter repositoryAdapter = this.createRepositoryAdapterForRepository(repository);
		repositoryAdapter.openSaveContext();
		Resource resourceFromPath = repositoryAdapter.getResource(pathToListenedResource);

		// We get the contained elements
		Set<EObject> listenedElements = new HashSet<EObject>();
		listenedElements.addAll(resourceFromPath.getContents());

		// We create the handler
		RepositoryObjectHandler elementHandler = new ReadWriteRepositoryObjectHandlerImpl(repositoryAdapter);
		ElementListAdapter adapter = new ElementListAdapter();
		Notificator listenedElementsNotificator = new ElementListNotificator(listenedElements, adapter);
		elementHandler.setNotificator(listenedElementsNotificator);

		return elementHandler;
	}

	/**
	 * Create and return a RepositoryAdapter for the given repository, according to the nature of the
	 * repository (CDO, Workspace...).
	 * 
	 * @param repository
	 *            the repository to use for creating this repositoryAdapter
	 * @return the created RepositoryAdapter for the given repository
	 * @throws RepositoryConnectionException
	 *             if the connection to the given repository is invalid
	 */
	public RepositoryAdapter createRepositoryAdapterForRepository(Repository repository)
			throws RepositoryConnectionException {
		return new CDOAdapter((CDOSession)repository.getOrCreateSession());
	}
}
