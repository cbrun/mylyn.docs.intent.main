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
package org.eclipse.mylyn.docs.intent.client.synchronizer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.Monitor;
import org.eclipse.mylyn.docs.intent.client.synchronizer.listeners.GeneratedElementListener;
import org.eclipse.mylyn.docs.intent.client.synchronizer.synchronizer.IntentSynchronizer;
import org.eclipse.mylyn.docs.intent.collab.handlers.RepositoryClient;
import org.eclipse.mylyn.docs.intent.collab.handlers.RepositoryObjectHandler;
import org.eclipse.mylyn.docs.intent.collab.handlers.adapters.ReadOnlyException;
import org.eclipse.mylyn.docs.intent.collab.handlers.adapters.SaveException;
import org.eclipse.mylyn.docs.intent.collab.handlers.notification.RepositoryChangeNotification;
import org.eclipse.mylyn.docs.intent.core.compiler.CompilationMessageType;
import org.eclipse.mylyn.docs.intent.core.compiler.CompilationStatus;
import org.eclipse.mylyn.docs.intent.core.compiler.TraceabilityIndex;

/**
 * In charge of communication between the repository and the synchronizer ; launch a synchronization operation
 * each time a modification on the compiler's generated elements index is detected.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public class SynchronizerRepositoryClient implements RepositoryClient {

	/**
	 * The repository Object Handler to use for receiving notification.
	 */
	private RepositoryObjectHandler repositoryObjectHandler;

	/**
	 * The synchronizer to use.
	 */
	private IntentSynchronizer synchronizer;

	/**
	 * The listened TraceAbilityIndex.
	 */
	private TraceabilityIndex traceabilityIndex;

	/**
	 * The progress Monitor to use for canceling a synchronization operation.
	 */
	private Monitor progressMonitor;

	/**
	 * SynchronizerRepositoryClient constructor.
	 * 
	 * @param traceabilityIndex
	 *            the listened TraceAbilityIndex
	 * @param progressMonitor
	 *            the progress Monitor to use for canceling a synchronization operation
	 */
	public SynchronizerRepositoryClient(TraceabilityIndex traceabilityIndex, Monitor progressMonitor) {
		System.out.println("[Synchronizer] Initialised.");
		this.synchronizer = new IntentSynchronizer();
		this.traceabilityIndex = traceabilityIndex;
		this.progressMonitor = progressMonitor;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.collab.handlers.RepositoryClient#addRepositoryObjectHandler(org.eclipse.mylyn.docs.intent.collab.handlers.RepositoryObjectHandler)
	 */
	public void addRepositoryObjectHandler(RepositoryObjectHandler handler) {
		handler.addClient(this);
		repositoryObjectHandler = handler;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.collab.handlers.RepositoryClient#removeRepositoryObjectHandler(org.eclipse.mylyn.docs.intent.collab.handlers.RepositoryObjectHandler)
	 */
	public void removeRepositoryObjectHandler(RepositoryObjectHandler handler) {
		handler.removeClient(this);
		repositoryObjectHandler = null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.collab.handlers.RepositoryClient#handleChangeNotification(org.eclipse.mylyn.docs.intent.collab.handlers.notification.RepositoryChangeNotification)
	 */
	public void handleChangeNotification(RepositoryChangeNotification notification) {
		// First we reload the index
		this.traceabilityIndex = (TraceabilityIndex)repositoryObjectHandler.getRepositoryAdapter().reload(
				this.traceabilityIndex);

		// this.traceabilityIndex = (TraceabilityIndex)notification.getRightRoots().get(0);
		System.out.println("[Synchroniser] Detected changes on the TraceabilityResourceIndex.");

		// We cancel the previous operation
		progressMonitor.setCanceled(true);

		repositoryObjectHandler.getRepositoryAdapter().openSaveContext();

		// We get all the compilation Status to add
		progressMonitor = new BasicMonitor();
		Collection<? extends CompilationStatus> statusList = new ArrayList<CompilationStatus>();
		try {
			statusList = synchronizer.synchronize(repositoryObjectHandler.getRepositoryAdapter(),
					this.traceabilityIndex, progressMonitor);
		} catch (InterruptedException e) {
			// Nothing to do : it means that the operation has been canceled
			System.out.println("[Synchronizer] Canceled.");
		}

		if (!progressMonitor.isCanceled()) {
			addAllStatusToTargetElement(statusList);
		}

		if (!progressMonitor.isCanceled()) {
			// We add these status to the targets Element
			try {
				repositoryObjectHandler.getRepositoryAdapter().save();
			} catch (ReadOnlyException e) {
				// As we have just opened a save context, we are sure that this will never happens
			} catch (SaveException e) {
				try {
					repositoryObjectHandler.getRepositoryAdapter().undo();
				} catch (ReadOnlyException e1) {
					// As we have just opened a save context, we are sure that this will never happens
				}
			}
			System.out.println("[Synchronizer] Done. Detected " + statusList.size()
					+ " synchronization issues");
		}
		repositoryObjectHandler.getRepositoryAdapter().closeContext();

	}

	/**
	 * Adds all the given compilationStatus to their targets instructions.
	 * 
	 * @param statusList
	 *            the list of status to add
	 */
	public void addAllStatusToTargetElement(Collection<? extends CompilationStatus> statusList) {

		// For each status to add
		for (CompilationStatus status : statusList) {
			// We first remove all the old synchronizer informations about this element (TODO should be done
			// while compiling)
			Iterator<CompilationStatus> iterator = status.getTarget().getCompilationStatus().iterator();
			while (iterator.hasNext()) {
				CompilationStatus next = iterator.next();
				if (next.getType() == CompilationMessageType.SYNCHRONIZER_WARNING) {
					iterator.remove();
				}
			}
			// We get the status associated to this target
			status.getTarget().getCompilationStatus().add(status);
		}
	}

	/**
	 * Sets the generatedElement listener, which will notify the Synchronizer if any generatedElement has
	 * changed.
	 * 
	 * @param generatedElementListener
	 *            the GeneratedElementListener
	 */
	public void setGeneratedElementListener(GeneratedElementListener generatedElementListener) {
		this.synchronizer.setGeneratedElementListener(generatedElementListener);
		generatedElementListener.setSynchronizer(this);

	}
}
