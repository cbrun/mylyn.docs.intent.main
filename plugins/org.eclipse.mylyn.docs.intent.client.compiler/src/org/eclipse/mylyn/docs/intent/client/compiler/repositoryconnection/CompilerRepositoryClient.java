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

import org.eclipse.emf.common.util.Monitor;
import org.eclipse.emf.compare.util.EclipseModelUtils;
import org.eclipse.mylyn.docs.intent.client.compiler.saver.CompilerInformationsSaver;
import org.eclipse.mylyn.docs.intent.client.compiler.utils.IntentCompilerInformationHolder;
import org.eclipse.mylyn.docs.intent.collab.handlers.ReadWriteRepositoryObjectHandler;
import org.eclipse.mylyn.docs.intent.collab.handlers.RepositoryClient;
import org.eclipse.mylyn.docs.intent.collab.handlers.RepositoryObjectHandler;
import org.eclipse.mylyn.docs.intent.collab.handlers.adapters.ReadOnlyException;
import org.eclipse.mylyn.docs.intent.collab.handlers.adapters.SaveException;
import org.eclipse.mylyn.docs.intent.collab.handlers.notification.RepositoryChangeNotification;
import org.eclipse.mylyn.docs.intent.collab.repository.Repository;

/**
 * In charge of communication between the repository and the compiler ; launch a compilation operation each
 * time a modification on modeling units is detected.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public class CompilerRepositoryClient implements RepositoryClient {

	/**
	 * The repository Object Handler to use for receiving notification.
	 */
	private ReadWriteRepositoryObjectHandler repositoryObjectHandler;

	/**
	 * The repository to use for acces to package registry and several informations.
	 */
	private Repository repository;

	/**
	 * Operation that compiles all the modeling units contained in the repository.
	 */
	private CompilationOperation compilationOperation;

	/**
	 * Thread that holds the compilation Operation.
	 */
	private Thread currentThread;

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
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.handlers.RepositoryClient#addRepositoryObjectHandler(org.eclipse.mylyn.docs.intent.handlers.RepositoryObjectHandler)
	 */
	public void addRepositoryObjectHandler(RepositoryObjectHandler handler) {
		handler.addClient(this);
		repositoryObjectHandler = (ReadWriteRepositoryObjectHandler)handler;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.handlers.RepositoryClient#removeRepositoryObjectHandler(org.eclipse.mylyn.docs.intent.handlers.RepositoryObjectHandler)
	 */
	public void removeRepositoryObjectHandler(RepositoryObjectHandler handler) {
		handler.removeClient(this);
		repositoryObjectHandler = null;

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.handlers.RepositoryClient#handleChangeNotification(org.eclipse.mylyn.docs.intent.handlers.notification.RepositoryChangeNotification)
	 */
	public void handleChangeNotification(RepositoryChangeNotification notification) {

		System.err.println("[Compiler] Received Notification ");

		// If a compilationOperation is currently running
		if (progressMonitor != null && !progressMonitor.isCanceled()) {

			// we cancel it
			progressMonitor.setCanceled(true);
			try {
				System.err.println("[Compiler] cancelling...");
				currentThread.join(1);
				System.err.println("[Compiler] cancelled");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

		// We then launch a new Compilation Operation
		progressMonitor = EclipseModelUtils.createProgressMonitor(null);
		compilationOperation = new CompilationOperation(repositoryObjectHandler, repository, this,
				progressMonitor);
		currentThread = new Thread(compilationOperation);
		currentThread.start();
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
}
