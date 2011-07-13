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

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.mylyn.docs.intent.client.synchronizer.listeners.GeneratedElementListener;
import org.eclipse.mylyn.docs.intent.client.synchronizer.synchronizer.IntentSynchronizer;
import org.eclipse.mylyn.docs.intent.collab.handlers.impl.AbstractRepositoryClient;
import org.eclipse.mylyn.docs.intent.collab.handlers.notification.RepositoryChangeNotification;
import org.eclipse.mylyn.docs.intent.core.compiler.CompilationMessageType;
import org.eclipse.mylyn.docs.intent.core.compiler.CompilationStatus;
import org.eclipse.mylyn.docs.intent.core.compiler.TraceabilityIndex;

/**
 * In charge of communication between the repository and the synchronizer ; launch a synchronization operation
 * each time a modification on the compiler's generated elements index is detected.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 * @author <a href="mailto:william.piers@obeo.fr">William Piers</a>
 */
public class SynchronizerRepositoryClient extends AbstractRepositoryClient {

	/**
	 * The synchronizer to use.
	 */
	private IntentSynchronizer synchronizer;

	/**
	 * The listened TraceAbilityIndex.
	 */
	private TraceabilityIndex traceabilityIndex;

	/**
	 * SynchronizerRepositoryClient constructor.
	 * 
	 * @param traceabilityIndex
	 *            the listened TraceAbilityIndex
	 */
	public SynchronizerRepositoryClient(TraceabilityIndex traceabilityIndex) {
		System.out.println("[Synchronizer] Initialised.");
		this.synchronizer = new IntentSynchronizer();
		this.traceabilityIndex = traceabilityIndex;
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
		synchronizer.setGeneratedElementListener(generatedElementListener);
		generatedElementListener.setSynchronizer(this);

	}

	public TraceabilityIndex getTraceabilityIndex() {
		return traceabilityIndex;
	}

	public void setTraceabilityIndex(TraceabilityIndex traceabilityIndex) {
		this.traceabilityIndex = traceabilityIndex;
	}

	public IntentSynchronizer getSynchronizer() {
		return synchronizer;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.collab.handlers.impl.AbstractRepositoryClient#createNotificationJob(org.eclipse.mylyn.docs.intent.collab.handlers.notification.RepositoryChangeNotification)
	 */
	@Override
	protected Job createNotificationJob(RepositoryChangeNotification notification) {
		return new SynchronizeRepositoryJob(this);
	}
}
