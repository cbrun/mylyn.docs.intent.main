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
package org.eclipse.mylyn.docs.intent.client.ui.editor.jobs;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.IDocumentPartitioner;
import org.eclipse.mylyn.docs.intent.client.ui.IntentEditorActivator;
import org.eclipse.mylyn.docs.intent.client.ui.editor.IntentDocumentProvider;
import org.eclipse.mylyn.docs.intent.client.ui.editor.IntentEditorDocument;
import org.eclipse.mylyn.docs.intent.client.ui.logger.IntentUiLogger;
import org.eclipse.mylyn.docs.intent.compare.IntentASTMerger;
import org.eclipse.mylyn.docs.intent.compare.MergingException;
import org.eclipse.mylyn.docs.intent.parser.IntentParser;
import org.eclipse.mylyn.docs.intent.parser.modelingunit.ParseException;
import org.eclipse.mylyn.docs.intent.serializer.IntentSerializer;

/**
 * Job used to parse a IntentEditorDocument and set the parsed AST to this document.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public class RefreshDocumentJob {

	/**
	 * Time to wait before launching the refresh job (we have to wait the user to stop typing).
	 */
	private static final int REFRESH_JOB_SHEDULE_VALUE = 300;

	/**
	 * Time to wait before launching the refresh job if another refreshing job was already running.
	 */
	private static final int REFRESH_JOB_SHEDULE_CONCURRENT_VALUE = 2000;

	/**
	 * The name of this job.
	 */
	private static final String REFRESH_AST_JOB_NAME = "Refreshing AST";

	private Job refreshASTJob;

	/**
	 * The document to parse.
	 */
	private IntentEditorDocument document;

	private IntentParser parser;

	private IntentSerializer serializer;

	private IDocumentPartitioner partitioner;

	private IntentDocumentProvider documentProvider;

	/**
	 * RefreshASTJob constructor.
	 * 
	 * @param intentDocumentProvider
	 *            the DocumentProvider to use for refreshing the given document
	 * @param document
	 *            the IntentEditorDocument to refresh
	 * @param partitioner
	 *            the partitioner to use for refreshing the given document
	 */
	public RefreshDocumentJob(IntentDocumentProvider intentDocumentProvider, IntentEditorDocument document,
			IDocumentPartitioner partitioner) {
		this.document = document;
		this.documentProvider = intentDocumentProvider;
		this.parser = new IntentParser();
		this.serializer = new IntentSerializer(IntentEditorDocument.MODELING_PREFIX_DECORATION,
				IntentEditorDocument.MODELING_SUFFIX_DECORATION);
		this.partitioner = partitioner;
	}

	/**
	 * Launches a job which purpose is to create a new AST from the given document content, and set this new
	 * AST to this document.
	 */
	public void refreshDocument() {
		int schedule = REFRESH_JOB_SHEDULE_VALUE;
		if (refreshASTJob != null) {
			refreshASTJob.cancel();
			schedule = REFRESH_JOB_SHEDULE_CONCURRENT_VALUE;
		}
		refreshASTJob = createRefreshASTJob();
		refreshASTJob.setPriority(Job.DECORATE);
		refreshASTJob.setSystem(true);
		refreshASTJob.schedule(schedule);
	}

	/**
	 * A method to cancel the current job.
	 */
	public void cancel() {
		if (refreshASTJob != null) {
			refreshASTJob.cancel();
		}
	}

	/**
	 * Creates the job that is able to refresh the AST.
	 * 
	 * @return the job
	 */
	private Job createRefreshASTJob() {
		return new Job(REFRESH_AST_JOB_NAME) { //$NON-NLS-1$
			@Override
			protected IStatus run(IProgressMonitor monitor) {

				try {
					documentProvider.removeSyntaxErrors();
					EObject newAST = parseAST(monitor);
					newAST = computeMergedAST(monitor, newAST);
					String serializedForm = serializeAST(monitor, newAST);
					refreshDocument(monitor, newAST, serializedForm);
				} catch (ParseException e) {
					documentProvider.createSyntaxErrorAnnotation(e.getMessage(), 0, 5);
				}
				return new Status(IStatus.OK, IntentEditorActivator.PLUGIN_ID, "Document Correctly Refreshed");

			}

			@Override
			protected void canceling() {
				super.canceling();
				// TODO delete dangling informations
			}

		};
	}

	/**
	 * If the monitor is not canceled, parse the content of the handled document and return the parsed AST.
	 * 
	 * @param monitor
	 *            the monitor indicating if the job has been canceled
	 * @return the parsed AST corresponding to the handled document content
	 * @throws ParseException
	 *             if the parsing raises an exception
	 */
	private EObject parseAST(IProgressMonitor monitor) throws ParseException {
		EObject newAST = null;
		if (!monitor.isCanceled()) {
			newAST = parser.parse(document.get());
		}
		return newAST;
	}

	/**
	 * Merges the newly created AST with a copy of the AST contained in the document.
	 * 
	 * @param monitor
	 *            the monitor indicating if the job has been canceled
	 * @param newAST
	 *            the AST newly created
	 * @return the merged AST
	 */
	private EObject computeMergedAST(IProgressMonitor monitor, EObject newAST) {
		IntentASTMerger merger = new IntentASTMerger();

		// EObject documentAST = EcoreUtil.copy((EObject)document.getAST());
		EObject documentAST = (EObject)document.getAST();
		// We impact the changes on the old ast
		try {
			merger.mergeFromLocalToRepository(newAST, documentAST);
		} catch (MergingException e) {
			IntentUiLogger.logError(e);
		} catch (NullPointerException npe) {
			IntentUiLogger.logError(npe);
		}
		return documentAST;
	}

	/**
	 * If the monitor is not canceled, returned the serialized form of the given AST.
	 * 
	 * @param monitor
	 *            the monitor indicating if the job has been canceled
	 * @param newAST
	 *            the newAST to serialize
	 * @return the new serializedForm corresponding to the given AST
	 */
	private String serializeAST(IProgressMonitor monitor, EObject newAST) {
		String serializedForm = null;
		// STEP 2 : SERIALIZING this AST
		if (!monitor.isCanceled()) {

			serializedForm = serializer.serialize(newAST);

		}
		return serializedForm;
	}

	/**
	 * If the monitor is not canceled, refreshes the document with the given AST and the given serializedForm.
	 * 
	 * @param monitor
	 *            the monitor indicating if the job has been canceled
	 * @param newAST
	 *            the newAST to refresh the document with
	 * @param serializedForm
	 *            the new serializedForm to refresh the document with
	 */
	private void refreshDocument(IProgressMonitor monitor, EObject newAST, String serializedForm) {
		if ((!monitor.isCanceled()) && (serializedForm != null)) {

			// We set the document's serializer
			document.setSerializer(serializer);
			serializer = new IntentSerializer(IntentEditorDocument.MODELING_PREFIX_DECORATION,
					IntentEditorDocument.MODELING_SUFFIX_DECORATION);

			// We set the new AST
			document.setAST(newAST, false);

			// We update the document Provider
			// We update the mapping between elements and documents
			documentProvider.addAllContentAsIntentElement(newAST, (IntentEditorDocument)document);

			// We refresh the document partitioner
			partitioner.disconnect();
			partitioner.connect(document);
		}
	}
}
