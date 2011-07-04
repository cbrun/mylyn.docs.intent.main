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
package org.eclipse.mylyn.docs.intent.collab.test.suite;


import org.eclipse.mylyn.docs.intent.collab.test.ide.ElementListListenerTest;
import org.eclipse.mylyn.docs.intent.collab.test.ide.WorkspaceSessionAndFileEvents;
import org.eclipse.mylyn.docs.intent.collab.test.ide.WorkspaceSessionAndTypeListenersTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * This suite will launch all the tests relative to the WorkspaceRepository behavior.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({WorkspaceSessionAndTypeListenersTest.class, ElementListListenerTest.class,
		WorkspaceSessionAndFileEvents.class,
})
public final class IDETestSuite {

	/**
	 * IDETestSuite constructor.
	 */
	private IDETestSuite() {
	}
}
