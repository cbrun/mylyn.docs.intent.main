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
package org.eclipse.mylyn.docs.intent.client.indexer;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.mylyn.docs.intent.client.indexer.tocmaker.TocMaker;
import org.eclipse.mylyn.docs.intent.collab.common.location.IntentLocations;
import org.eclipse.mylyn.docs.intent.collab.handlers.RepositoryClient;
import org.eclipse.mylyn.docs.intent.collab.handlers.RepositoryObjectHandler;
import org.eclipse.mylyn.docs.intent.collab.handlers.adapters.ReadOnlyException;
import org.eclipse.mylyn.docs.intent.collab.handlers.adapters.SaveException;
import org.eclipse.mylyn.docs.intent.collab.handlers.notification.RepositoryChangeNotification;
import org.eclipse.mylyn.docs.intent.core.document.IntentDocument;
import org.eclipse.mylyn.docs.intent.core.indexer.IntentIndex;
import org.eclipse.mylyn.docs.intent.core.indexer.IntentIndexerFactory;

/**
 * When notified about modifications on the listened elements, update the index.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public class IndexerRepositoryClient implements RepositoryClient {

	/**
	 * Entity used to compute index from a IntentDocument.
	 */
	private TocMaker indexComputor;

	/**
	 * The repositoryObjectHandler notifying this indexer about any modifications on the document.
	 */
	private RepositoryObjectHandler repositoryObjectHandler;

	/**
	 * Indexer constructor.
	 */
	public IndexerRepositoryClient() {
		indexComputor = new TocMaker();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.collab.handlers.RepositoryClient#addRepositoryObjectHandler(org.eclipse.mylyn.docs.intent.collab.handlers.RepositoryObjectHandler)
	 */
	public void addRepositoryObjectHandler(RepositoryObjectHandler handler) {
		handler.addClient(this);
		this.repositoryObjectHandler = handler;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.collab.handlers.RepositoryClient#removeRepositoryObjectHandler(org.eclipse.mylyn.docs.intent.collab.handlers.RepositoryObjectHandler)
	 */
	public void removeRepositoryObjectHandler(RepositoryObjectHandler handler) {
		handler.removeClient(this);
		this.repositoryObjectHandler = null;

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.collab.handlers.RepositoryClient#handleChangeNotification(org.eclipse.mylyn.docs.intent.collab.handlers.notification.RepositoryChangeNotification)
	 */
	public void handleChangeNotification(RepositoryChangeNotification notification) {
		System.out.println("[Index] Detected changes...");
		try {
			repositoryObjectHandler.getRepositoryAdapter().openSaveContext();
			makeToc();
			repositoryObjectHandler.getRepositoryAdapter().save();
		} catch (SaveException e) {
			try {
				repositoryObjectHandler.getRepositoryAdapter().undo();
			} catch (ReadOnlyException e1) {
				// TODO we can't do anything here
			}
		} catch (ReadOnlyException e) {
			// TODO we can't do anything here
		}
		repositoryObjectHandler.getRepositoryAdapter().closeContext();

	}

	/**
	 * Replace the repository index content with the repository document's table of contents.
	 */
	public void makeToc() {
		IntentIndex index = getIntentIndex();
		IntentDocument document = getIntentDocument();
		System.out.println("[Indexer] Making Toc on " + document.getChapters().size() + "chapters...");

		indexComputor.computeIndex(index, document);
		System.out.println("[Indexer] Toc made.");
	}

	/**
	 * Returns the IntentIndex stored on the repository.
	 * 
	 * @return the IntentIndex stored on the repository
	 */
	private IntentIndex getIntentIndex() {
		Resource indexResource = repositoryObjectHandler.getRepositoryAdapter().getResource(
				IntentLocations.GENERAL_INDEX_PATH);
		if (indexResource.getContents().isEmpty()) {
			indexResource.getContents().add(IntentIndexerFactory.eINSTANCE.createIntentIndex());
		}
		return (IntentIndex)indexResource.getContents().get(0);
	}

	/**
	 * Returns the IntentDocument stored on the repository.
	 * 
	 * @return the IntentDocument stored on the repository
	 */
	private IntentDocument getIntentDocument() {
		Resource indexResource = repositoryObjectHandler.getRepositoryAdapter().getResource(
				IntentLocations.INTENT_INDEX);
		if ((indexResource.getContents().size() > 0)
				&& ((indexResource.getContents().get(0) instanceof IntentDocument))) {
			return (IntentDocument)indexResource.getContents().get(0);
		}
		return null;
	}

}
