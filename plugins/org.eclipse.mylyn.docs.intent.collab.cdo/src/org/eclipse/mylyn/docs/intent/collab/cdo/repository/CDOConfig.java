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
package org.eclipse.mylyn.docs.intent.collab.cdo.repository;

/**
 * Class representing the configuration of a CDORepository.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public class CDOConfig {

	/**
	 * Address of the CDO Server (example : 'localhost:2036').
	 */
	private String serverAdress;

	/**
	 * Name of the CDO repository (example :'repository1' ).
	 */
	private String repositoryName;

	/**
	 * CDOConfig constructor.
	 * 
	 * @param serverAdress
	 *            Address of the CDO Server (example : 'localhost:2036')
	 * @param repositoryName
	 *            name of the repository (example :'repository1' )
	 */
	public CDOConfig(String serverAdress, String repositoryName) {
		this.serverAdress = serverAdress;
		this.repositoryName = repositoryName;
	}

	/**
	 * Returns the address of the CDO Server (example : 'localhost:2036').
	 * 
	 * @return the address of the CDO Server (example : 'localhost:2036').
	 */
	public String getServerAdress() {
		return serverAdress;
	}

	/**
	 * Returns the name of the CDO repository (example :'repository1' ).
	 * 
	 * @return the name of the CDO repository (example :'repository1' ).
	 */
	public String getRepositoryName() {
		return repositoryName;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return serverAdress + "/" + repositoryName;
	}
}
