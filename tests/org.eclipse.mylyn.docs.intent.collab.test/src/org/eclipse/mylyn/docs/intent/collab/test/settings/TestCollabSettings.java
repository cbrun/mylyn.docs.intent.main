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
package org.eclipse.mylyn.docs.intent.collab.test.settings;

/**
 * Provides constants for the test repository structuration.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public interface TestCollabSettings {

	/**
	 * Indicates the location of the general index referencing all the classes.
	 */
	String TEST_INDEX = "/TestIndex";

	/**
	 * Indicates the location of the general folder.
	 */
	String TEST_CONTENT_FOLDER = "/Content/";

	/**
	 * Indicates the location of all the testClass1.
	 */
	String TEST_TESTCLASS1_FOLDER = TEST_CONTENT_FOLDER + "TestClass1/";

	/**
	 * Indicates the location of all the testClass2.
	 */
	String TEST_TESTCLASS2_FOLDER = TEST_CONTENT_FOLDER + "TestClass2/";

	/**
	 * List of all the indexes of the repository.
	 */
	String[] INDEXES_PATH = {TEST_INDEX,
	};
}
