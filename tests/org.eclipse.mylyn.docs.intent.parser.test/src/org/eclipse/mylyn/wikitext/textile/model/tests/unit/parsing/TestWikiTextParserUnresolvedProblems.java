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
package org.eclipse.mylyn.wikitext.textile.model.tests.unit.parsing;

import org.junit.Test;

/**
 * Tests the WikiText parser and show the unresolved problems.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public class TestWikiTextParserUnresolvedProblems {

	@Test
	public void unresolvedProblems() {
		// Objectives :
		// show that some problems remains
		TestWikiTextParserGeneral.compareTextSerialization("unresolvedProblems/fancyUnresolved.textile");
	}
}
