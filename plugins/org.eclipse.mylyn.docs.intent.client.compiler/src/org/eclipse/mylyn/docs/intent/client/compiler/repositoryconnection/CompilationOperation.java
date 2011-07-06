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
package org.eclipse.mylyn.docs.intent.client.compiler.repositoryconnection;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.Monitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.mylyn.docs.intent.client.compiler.ModelingUnitCompiler;
import org.eclipse.mylyn.docs.intent.client.compiler.generator.modellinking.ModelingUnitLinkResolver;
import org.eclipse.mylyn.docs.intent.client.compiler.utils.IntentCompilerInformationHolder;
import org.eclipse.mylyn.docs.intent.collab.common.location.IntentLocations;
import org.eclipse.mylyn.docs.intent.collab.handlers.RepositoryObjectHandler;
import org.eclipse.mylyn.docs.intent.collab.repository.Repository;
import org.eclipse.mylyn.docs.intent.collab.repository.RepositoryConnectionException;
import org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnit;
import org.eclipse.mylyn.docs.intent.core.query.UnitGetter;

/**
 * Represents a compilation operation, that compiles all the modeling units contained in the repository.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public class CompilationOperation implements Runnable {
	/**
	 * The repository Object Handler to use for receiving notification.
	 */
	private RepositoryObjectHandler repositoryObjectHandler;

	/**
	 * The repository to use for acces to package registry and several informations.
	 */
	private Repository repository;

	private CompilerRepositoryClient compilerRepositoryClient;

	/**
	 * The progressMonitor to use for compilation ; if canceled, the compilation will stop immediately.
	 */
	private Monitor progressMonitor;

	/**
	 * CompilationOperation constructor.
	 * 
	 * @param repositoryObjectHandler
	 *            the repository Object Handler to use for receiving notification
	 * @param repository
	 *            the repository to use for access to package registry and several informations
	 * @param compilerRepositoryClient
	 *            the client that launched this compilation operation
	 */
	public CompilationOperation(RepositoryObjectHandler repositoryObjectHandler, Repository repository,
			CompilerRepositoryClient compilerRepositoryClient, Monitor progressMonitor) {
		this.repositoryObjectHandler = repositoryObjectHandler;
		this.repository = repository;
		this.compilerRepositoryClient = compilerRepositoryClient;
		this.progressMonitor = progressMonitor;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see java.lang.Runnable#run()
	 */
	public void run() {
		try {

			if (!progressMonitor.isCanceled()) {
				ModelingUnitCompiler compiler = null;
				ModelingUnitLinkResolver resolver = null;
				List<ModelingUnit> modelingUnitsToCompile = new ArrayList<ModelingUnit>();

				// InformationHolder Initialization
				final Resource resourceIndex = repositoryObjectHandler.getRepositoryAdapter().getResource(
						IntentLocations.INTENT_INDEX);

				IntentCompilerInformationHolder informationHolder = IntentCompilerInformationHolder
						.getInstance();
				informationHolder.initialize();

				// LinkResolver initialization

				if (!progressMonitor.isCanceled()) {
					resolver = new ModelingUnitLinkResolver(repository, informationHolder);
				}

				// Compiler initialization
				if (!progressMonitor.isCanceled()) {
					compiler = new ModelingUnitCompiler(repository, resolver, informationHolder,
							progressMonitor);

					for (EObject resourceContent : resourceIndex.getContents()) {
						modelingUnitsToCompile.addAll(UnitGetter
								.getAllModelingUnitsContainedInElement(resourceContent));
					}
				}

				// Compilation
				if (!progressMonitor.isCanceled()) {
					compiler.compile(modelingUnitsToCompile);
				}
				// Saving the new compilations errors
				if (!progressMonitor.isCanceled()) {
					System.err.println("[Compiler] compiled : "
							+ informationHolder.getDeclaredResources().size() + " resources. ");
					System.err.println("[Compiler] saving...");
					compilerRepositoryClient.saveCompilationInformations(informationHolder);
					System.err.println("[Compiler] =====================> saved.");
				}
			}
			Thread.currentThread().join(1);
		} catch (RepositoryConnectionException e) {
			e.printStackTrace();
			System.err.println("[Compiler] Compilation  Failed");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
