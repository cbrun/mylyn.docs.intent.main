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
package org.eclipse.mylyn.docs.intent.parser.testSuite;

import org.eclipse.mylyn.wikitext.textile.model.tests.unit.parsing.TestWikiTextParserUnresolvedProblems;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Launches all the test that identify all known issues (such as Wikitext parser limitations).
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({TestWikiTextParserUnresolvedProblems.class
})
public class KnownIssuesTestSuite {

}
