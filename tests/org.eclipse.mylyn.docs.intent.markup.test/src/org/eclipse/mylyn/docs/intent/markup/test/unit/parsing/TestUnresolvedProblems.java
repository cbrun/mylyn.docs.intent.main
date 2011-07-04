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
package org.eclipse.mylyn.docs.intent.markup.test.unit.parsing;

import org.junit.Test;

/**
 * Test unresolved problems.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public class TestUnresolvedProblems {

	@Test
	public void unresolvedProblems() {
		// Objectives :
		// show that some problems remains
		TestParsingTextual.compareTextSerialization("/unresolvedProblems/fancyUnresolved.textile");
	}
}
