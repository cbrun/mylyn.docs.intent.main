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
package org.eclipse.mylyn.docs.intent.collab.ide.utils;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IProgressMonitorWithBlocking;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.Monitor;

/**
 * Utility class that provides facilities for monitoring clients of a repository.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public final class MonitoringUtil {

	/**
	 * MonitoringUtil constructor.
	 */
	private MonitoringUtil() {

	}

	/**
	 * This will create an EMF {@link Monitor progress monitor} that can be used standalone to display
	 * comparison progress to the user. If <code>delegate</code> isn't <code>null</code>, the created monitor
	 * will delegate all calls to it.
	 * 
	 * @param delegate
	 *            The delegate progress monitor. Can be <code>null</code> or Eclipse specific monitors.
	 * @return The created progress monitor.
	 * @since 1.0
	 */
	public static Monitor createProgressMonitor(Object delegate) {
		final Monitor monitor;
		if (delegate instanceof IProgressMonitorWithBlocking) {
			monitor = BasicMonitor.toMonitor((IProgressMonitorWithBlocking)delegate);
		} else if (delegate instanceof IProgressMonitor) {
			monitor = BasicMonitor.toMonitor((IProgressMonitor)delegate);
		} else {
			monitor = new BasicMonitor();
		}
		return monitor;
	}
}
