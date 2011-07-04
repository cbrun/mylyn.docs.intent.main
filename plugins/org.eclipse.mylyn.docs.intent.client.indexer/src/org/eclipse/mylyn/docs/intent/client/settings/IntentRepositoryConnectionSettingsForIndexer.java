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
package org.eclipse.mylyn.docs.intent.client.settings;

/**
 * Define the setting for connecting to the repository.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public interface IntentRepositoryConnectionSettingsForIndexer {

	/**
	 * Address of the machine hosting the repository (for example : localhost or 192.33.33.33).
	 */
	String REPOSITORY_HOST_ADRESS = "192.168.30.118";

	/**
	 * Complete adress of the repository : host adress ':' [port of the repository].
	 */
	String REPOSITORY_COMPLETE_ADRESS = REPOSITORY_HOST_ADRESS + ":2036";

	/**
	 * Name of the repository to connect on.
	 */
	String REPOSITORY_NAME = "repo1";

}
