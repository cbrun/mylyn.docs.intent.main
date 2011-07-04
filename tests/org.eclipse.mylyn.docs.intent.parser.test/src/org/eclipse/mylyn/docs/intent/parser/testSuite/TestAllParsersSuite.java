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

import org.eclipse.mylyn.docs.intent.parser.modelingunit.test.TestModelingUnitSuite;
import org.eclipse.mylyn.docs.intent.parser.test.IntentParserTest;
import org.eclipse.mylyn.docs.intent.parser.test.descriptionunit.DescriptionUnitParserTest;
import org.eclipse.mylyn.wikitext.textile.model.tests.unit.parsing.TestWikiTextParserSuite;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Launch all the test files related to Modeling Unit Parsing Tests.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({TestModelingUnitSuite.class, TestWikiTextParserSuite.class,
		DescriptionUnitParserTest.class, IntentParserTest.class,

})
public class TestAllParsersSuite {

}
