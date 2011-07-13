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

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.mylyn.docs.intent.client.indexer.tocmaker.TocMaker;
import org.eclipse.mylyn.docs.intent.collab.common.location.IntentLocations;
import org.eclipse.mylyn.docs.intent.collab.handlers.adapters.ReadOnlyException;
import org.eclipse.mylyn.docs.intent.collab.handlers.adapters.SaveException;
import org.eclipse.mylyn.docs.intent.collab.handlers.impl.AbstractRepositoryClient;
import org.eclipse.mylyn.docs.intent.collab.handlers.notification.RepositoryChangeNotification;
import org.eclipse.mylyn.docs.intent.core.document.IntentDocument;
import org.eclipse.mylyn.docs.intent.core.indexer.IntentIndex;
import org.eclipse.mylyn.docs.intent.core.indexer.IntentIndexerFactory;

/**
 * When notified about modifications on the listened elements, update the index.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public class IndexerRepositoryClient extends AbstractRepositoryClient {

	/**
	 * Entity used to compute index from a IntentDocument.
	 */
	private TocMaker indexComputor;

	/**
	 * Indexer constructor.
	 */
	public IndexerRepositoryClient() {
		indexComputor = new TocMaker();
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

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.collab.handlers.impl.AbstractRepositoryClient#createNotificationJob(org.eclipse.mylyn.docs.intent.collab.handlers.notification.RepositoryChangeNotification)
	 */
	@Override
	protected Job createNotificationJob(final RepositoryChangeNotification notification) {
		return new Job("Indexing") {

			@Override
			protected IStatus run(IProgressMonitor monitor) {
				IStatus res = Status.OK_STATUS;
				System.out.println("[Index] Detected changes... " + notification);
				try {
					repositoryObjectHandler.getRepositoryAdapter().openSaveContext();
					makeToc();
					repositoryObjectHandler.getRepositoryAdapter().save();
				} catch (SaveException e) {
					try {
						repositoryObjectHandler.getRepositoryAdapter().undo();
					} catch (ReadOnlyException e1) {
						res = Status.CANCEL_STATUS;
					}
				} catch (ReadOnlyException e) {
					res = Status.CANCEL_STATUS;
				}
				repositoryObjectHandler.getRepositoryAdapter().closeContext();
				return res;
			}
		};
	}

}
