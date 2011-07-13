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

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.mylyn.docs.intent.client.compiler.ModelingUnitCompiler;
import org.eclipse.mylyn.docs.intent.client.compiler.generator.modellinking.ModelingUnitLinkResolver;
import org.eclipse.mylyn.docs.intent.client.compiler.utils.IntentCompilerInformationHolder;
import org.eclipse.mylyn.docs.intent.collab.common.location.IntentLocations;
import org.eclipse.mylyn.docs.intent.collab.repository.RepositoryConnectionException;
import org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnit;
import org.eclipse.mylyn.docs.intent.core.query.UnitGetter;

/**
 * Represents a compilation operation, that compiles all the modeling units contained in the repository.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 * @author <a href="mailto:william.piers@obeo.fr">William Piers</a>
 */
public class CompilationJob extends Job {
	/**
	 * Name to associate to this job.
	 */
	public static final String COMPILATION_JOB_NAME = "Compiling";

	private CompilerRepositoryClient client;

	/**
	 * CompilationOperation constructor.
	 * 
	 * @param compilerRepositoryClient
	 *            the client that launched this compilation operation
	 */
	public CompilationJob(CompilerRepositoryClient compilerRepositoryClient) {
		super(COMPILATION_JOB_NAME);
		this.client = compilerRepositoryClient;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.core.runtime.jobs.Job#run(org.eclipse.core.runtime.Imonitor)
	 */
	@Override
	protected IStatus run(IProgressMonitor monitor) {
		try {
			if (!monitor.isCanceled()) {
				ModelingUnitCompiler compiler = null;
				ModelingUnitLinkResolver resolver = null;
				List<ModelingUnit> modelingUnitsToCompile = new ArrayList<ModelingUnit>();

				// InformationHolder Initialization
				final Resource resourceIndex = client.getRepositoryObjectHandler().getRepositoryAdapter()
						.getResource(IntentLocations.INTENT_INDEX);

				IntentCompilerInformationHolder informationHolder = IntentCompilerInformationHolder
						.getInstance();
				informationHolder.initialize();

				// LinkResolver initialization

				if (!monitor.isCanceled()) {
					resolver = new ModelingUnitLinkResolver(client.getRepository(), informationHolder);
				}

				// Compiler initialization
				if (!monitor.isCanceled()) {
					compiler = new ModelingUnitCompiler(client.getRepository(), resolver, informationHolder,
							BasicMonitor.toMonitor(monitor));
					

					for (EObject resourceContent : resourceIndex.getContents()) {
						modelingUnitsToCompile.addAll(UnitGetter
								.getAllModelingUnitsContainedInElement(resourceContent));
					}
				}

				// Compilation
				if (!monitor.isCanceled()) {
					compiler.compile(modelingUnitsToCompile);
				}
				// Saving the new compilations errors
				if (!monitor.isCanceled()) {
					System.err.println("[Compiler] compiled : "
							+ informationHolder.getDeclaredResources().size() + " resources. ");
					System.err.println("[Compiler] saving...");
					client.saveCompilationInformations(informationHolder);
					System.err.println("[Compiler] =====================> saved.");
				}
			}
		} catch (RepositoryConnectionException e) {
			e.printStackTrace();
			System.err.println("[Compiler] Compilation  Failed");
		}
		return Status.OK_STATUS;
	}
}
