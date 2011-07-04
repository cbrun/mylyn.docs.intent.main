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
	// We are sure that calling stop on the thread cannot dommage our application.
	public void handleChangeNotification(RepositoryChangeNotification notification) {

		System.err.println("[Compiler] Received Notification " + notification);
		if (compilationOperation == null) {
			compilationOperation = new CompilationOperation(repositoryObjectHandler, repository, this);
		}

		// If a compilationOperation is currently running
		// we cancel it and wait for the thread to die
		if ((currentThread != null) && (currentThread.isAlive())) {
			compilationOperation.setCanceled(true);
			System.err.println("[Compiler] cancelling...");
			try {
				currentThread.join();
			} catch (InterruptedException e) {
				// TODO handle such a case
			}
		}

		// Then we launch a new compilation Operation
		compilationOperation.setCanceled(false);
		System.err.println("[Compiler] compiling...");
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
		CompilerInformationsSaver saver = new CompilerInformationsSaver();
		saver.saveOnRepository(compilationInformationHolder, repositoryObjectHandler);

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
