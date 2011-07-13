/*******************************************************************************
 * Copyright (c) 2011 Obeo.
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

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.mylyn.docs.intent.collab.handlers.adapters.ReadOnlyException;
import org.eclipse.mylyn.docs.intent.collab.handlers.adapters.SaveException;
import org.eclipse.mylyn.docs.intent.core.compiler.CompilationStatus;
import org.eclipse.mylyn.docs.intent.core.compiler.TraceabilityIndex;

/**
 * A job to launch the synchronization with the repository.
 * 
 * @author <a href="mailto:william.piers@obeo.fr">William Piers</a>
 */
public class SynchronizeRepositoryJob extends Job {

	/**
	 * Name to associate to this job.
	 */
	public static final String SYNCHRONIZE_REPOSITORY_JOB_NAME = "Synchronizing Repository";

	private SynchronizerRepositoryClient client;

	/**
	 * Constructor.
	 * 
	 * @param client
	 *            the synchronizer client
	 */
	public SynchronizeRepositoryJob(SynchronizerRepositoryClient client) {
		super(SYNCHRONIZE_REPOSITORY_JOB_NAME);
		this.client = client;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.core.runtime.jobs.Job#run(org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	protected IStatus run(IProgressMonitor monitor) {
		client.setTraceabilityIndex((TraceabilityIndex)client.getRepositoryObjectHandler()
				.getRepositoryAdapter().reload(client.getTraceabilityIndex()));

		System.out.println("[Synchroniser] Detected changes on the TraceabilityResourceIndex.");

		// We cancel the previous operation
		monitor.setCanceled(true);

		client.getRepositoryObjectHandler().getRepositoryAdapter().openSaveContext();

		// We get all the compilation Status to add
		Collection<? extends CompilationStatus> statusList = new ArrayList<CompilationStatus>();
		try {
			statusList = client.getSynchronizer().synchronize(
					client.getRepositoryObjectHandler().getRepositoryAdapter(),
					client.getTraceabilityIndex(), BasicMonitor.toMonitor(monitor));
		} catch (InterruptedException e) {
			// Nothing to do : it means that the operation has been canceled
			System.out.println("[Synchronizer] Canceled.");
			return Status.CANCEL_STATUS;
		}

		if (!monitor.isCanceled()) {
			client.addAllStatusToTargetElement(statusList);
		}

		if (!monitor.isCanceled()) {
			// We add these status to the targets Element
			try {
				client.getRepositoryObjectHandler().getRepositoryAdapter().save();
			} catch (ReadOnlyException e) {
				// As we have just opened a save context, we are sure that this will never happens
			} catch (SaveException e) {
				try {
					client.getRepositoryObjectHandler().getRepositoryAdapter().undo();
				} catch (ReadOnlyException e1) {
					// As we have just opened a save context, we are sure that this will never happens
				}
			}
			System.out.println("[Synchronizer] Done. Detected " + statusList.size()
					+ " synchronization issues");
		}
		client.getRepositoryObjectHandler().getRepositoryAdapter().closeContext();
		return Status.OK_STATUS;
	}
}
