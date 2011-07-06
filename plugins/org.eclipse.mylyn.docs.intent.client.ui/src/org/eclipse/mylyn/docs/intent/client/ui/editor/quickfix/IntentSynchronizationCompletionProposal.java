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
package org.eclipse.mylyn.docs.intent.client.ui.editor.quickfix;

import org.eclipse.compare.CompareConfiguration;
import org.eclipse.compare.CompareUI;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.compare.diff.metamodel.ComparisonResourceSnapshot;
import org.eclipse.emf.compare.diff.metamodel.DiffFactory;
import org.eclipse.emf.compare.diff.metamodel.DiffModel;
import org.eclipse.emf.compare.diff.service.DiffService;
import org.eclipse.emf.compare.match.metamodel.MatchModel;
import org.eclipse.emf.compare.match.service.MatchService;
import org.eclipse.emf.compare.ui.editor.ModelCompareEditorInput;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.contentassist.IContextInformation;
import org.eclipse.jface.text.source.Annotation;
import org.eclipse.mylyn.docs.intent.client.ui.IntentEditorActivator;
import org.eclipse.mylyn.docs.intent.client.ui.editor.annotation.IntentAnnotation;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;

/**
 * {@link ICompletionProposal} used to fix a Synchronization issue by opening the compare Editor.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public class IntentSynchronizationCompletionProposal implements ICompletionProposal {

	private static final String COMPARE_EDITOR_TITLE = "Comparing Intent Document and Working Copy";

	private IntentAnnotation syncAnnotation;

	/**
	 * Default constructor.
	 * 
	 * @param annotation
	 *            the {@link IntentAnnotation} describing the synchronization issue.
	 */
	public IntentSynchronizationCompletionProposal(Annotation annotation) {
		this.syncAnnotation = (IntentAnnotation)annotation;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.text.contentassist.ICompletionProposal#apply(org.eclipse.jface.text.IDocument)
	 */
	@Override
	public void apply(IDocument document) {
		// Step 1 : getting the resources to compare URI
		String generatedResourceURI = syncAnnotation.getAdditionalInformations().iterator().next();
		String workingCopyResourceURI = ((String)syncAnnotation.getAdditionalInformations().toArray()[1])
				.replace("\"", "");

		// Step 2 : loading the resources
		ResourceSetImpl rs = new ResourceSetImpl();
		Resource generatedResource = rs.getResource(URI.createURI(generatedResourceURI), true);
		ResourceSetImpl rs2 = new ResourceSetImpl();
		Resource workingCopyResource = rs.getResource(URI.createURI(workingCopyResourceURI), true);

		// Step 3 : opening a new Compare Editor on these two resources
		try {
			// Step 3.1 : making match and diff
			MatchModel match = MatchService.doResourceMatch(generatedResource, workingCopyResource, null);
			DiffModel diff = DiffService.doDiff(match, false);

			// Step 3.2 : creating a comparaison snapshot from this diff
			ComparisonResourceSnapshot snapshot = DiffFactory.eINSTANCE.createComparisonResourceSnapshot();
			snapshot.setDiff(diff);
			snapshot.setMatch(match);

			// Step 3.3 : open a compare dialog
			final CompareConfiguration compareConfig = new IntentCompareConfiguration(generatedResource,
					workingCopyResource);
			ModelCompareEditorInput input = new ModelCompareEditorInput(snapshot) {
				@Override
				public CompareConfiguration getCompareConfiguration() {
					return compareConfig;
				}
			};
			input.setTitle(COMPARE_EDITOR_TITLE + " (" + workingCopyResourceURI + ")");
			CompareUI.openCompareDialog(input);
		} catch (InterruptedException e) {
			// Editor will not be opened
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.text.contentassist.ICompletionProposal#getSelection(org.eclipse.jface.text.IDocument)
	 */
	@Override
	public Point getSelection(IDocument document) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.text.contentassist.ICompletionProposal#getAdditionalProposalInfo()
	 */
	@Override
	public String getAdditionalProposalInfo() {
		return "";
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.text.contentassist.ICompletionProposal#getDisplayString()
	 */
	@Override
	public String getDisplayString() {
		return "See differences in Compare Editor";
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.text.contentassist.ICompletionProposal#getImage()
	 */
	@Override
	public Image getImage() {
		return IntentEditorActivator.getDefault().getImage("icon/annotation/sync-warning.gif");
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.text.contentassist.ICompletionProposal#getContextInformation()
	 */
	@Override
	public IContextInformation getContextInformation() {
		return null;
	}

}
