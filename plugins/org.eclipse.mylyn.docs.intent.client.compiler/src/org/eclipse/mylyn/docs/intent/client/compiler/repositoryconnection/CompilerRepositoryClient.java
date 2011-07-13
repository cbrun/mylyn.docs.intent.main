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
package org.eclipse.mylyn.docs.intent.client.compiler.repositoryconnection;

import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.Monitor;
import org.eclipse.mylyn.docs.intent.client.compiler.saver.CompilerInformationsSaver;
import org.eclipse.mylyn.docs.intent.client.compiler.utils.IntentCompilerInformationHolder;
import org.eclipse.mylyn.docs.intent.collab.handlers.adapters.ReadOnlyException;
import org.eclipse.mylyn.docs.intent.collab.handlers.adapters.SaveException;
import org.eclipse.mylyn.docs.intent.collab.handlers.impl.AbstractRepositoryClient;
import org.eclipse.mylyn.docs.intent.collab.handlers.notification.RepositoryChangeNotification;
import org.eclipse.mylyn.docs.intent.collab.repository.Repository;

/**
 * In charge of communication between the repository and the compiler ; launch a compilation operation each
 * time a modification on modeling units is detected.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 * @author <a href="mailto:william.piers@obeo.fr">William Piers</a>
 */
public class CompilerRepositoryClient extends AbstractRepositoryClient {

	/**
	 * The repository to use for access to package registry and several informations.
	 */
	private Repository repository;

	/**
	 * The progressMonitor to use for compilation ; if canceled, the compilation will stop immediately.
	 */
	private Monitor progressMonitor;

	/**
	 * Sets the repository to use for saving and closing getConnexion.
	 * 
	 * @param repository
	 *            the repository to use for saving and closing getConnexion
	 */
	public void setRepository(Repository repository) {
		this.repository = repository;
		this.repository.register(this);
	}

	/**
	 * Saves the informations calculated during the compilationOperation.
	 * 
	 * @param compilationInformationHolder
	 *            the entity containing all informations needed by this compiler
	 */
	public void saveCompilationInformations(IntentCompilerInformationHolder compilationInformationHolder) {
		repositoryObjectHandler.getRepositoryAdapter().openSaveContext();
		CompilerInformationsSaver saver = new CompilerInformationsSaver(progressMonitor);
		if (progressMonitor != null && !progressMonitor.isCanceled()) {
			saver.saveOnRepository(compilationInformationHolder, repositoryObjectHandler);
		}
		try {
			repositoryObjectHandler.getRepositoryAdapter().save();
		} catch (ReadOnlyException e) {
			// We are sure that this compiler isn't in read-only mode
		} catch (SaveException e) {
			try {
				repositoryObjectHandler.getRepositoryAdapter().undo();
			} catch (ReadOnlyException e1) {
				// We are sure that this compiler isn't in read-only mode
			}

		}
		repositoryObjectHandler.getRepositoryAdapter().closeContext();

	}

	public Repository getRepository() {
		return repository;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.collab.handlers.impl.AbstractRepositoryClient#createNotificationJob(org.eclipse.mylyn.docs.intent.collab.handlers.notification.RepositoryChangeNotification)
	 */
	@Override
	protected Job createNotificationJob(RepositoryChangeNotification notification) {
		return new CompilationJob(this);
	}
}
