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
package org.eclipse.mylyn.docs.intent.client.ui.ide.navigator;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.mylyn.docs.intent.client.ui.ide.launcher.IDEApplicationManager;
import org.eclipse.mylyn.docs.intent.client.ui.utils.IntentEditorOpener;
import org.eclipse.mylyn.docs.intent.collab.handlers.adapters.RepositoryAdapter;
import org.eclipse.mylyn.docs.intent.collab.repository.Repository;
import org.eclipse.mylyn.docs.intent.collab.repository.RepositoryConnectionException;
import org.eclipse.mylyn.docs.intent.collab.utils.RepositoryCreatorHolder;
import org.eclipse.mylyn.docs.intent.core.document.IntentGenericElement;
import org.eclipse.mylyn.docs.intent.core.indexer.IntentIndexEntry;
import org.eclipse.ui.PartInitException;

/**
 * Action that opens editor on the selected Project Explorer elements.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 * @author <a href="mailto:william.piers@obeo.fr">William Piers</a>
 */
public class OpenEditorAction extends Action {

	protected TreeViewer viewer;

	private boolean forceNewEditor;

	/**
	 * OpenEditorAction constructor.
	 * 
	 * @param viewer
	 *            the Common viewer
	 */
	public OpenEditorAction(TreeViewer viewer) {
		this.viewer = viewer;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.ui.IActionDelegate#run(org.eclipse.jface.action.IAction)
	 */
	public void run() {
		// We first test if the current selection is correct
		IntentGenericElement element = getIndexEntryFromSelection();

		if (element != null) {
			try {
				if (element.eResource() != null) {
					IProject project = findProjectForModelURI(element.eResource().getURI());
					Repository repository = IDEApplicationManager.getRepository(project);
					RepositoryAdapter repositoryAdapter = RepositoryCreatorHolder.getCreator()
							.createRepositoryAdapterForRepository(repository);

					IntentEditorOpener.openIntentEditor(repository,
							repositoryAdapter.getIDFromElement(repositoryAdapter.reload(element)), false,
							forceNewEditor);
				} else {
					// FIXME: the viewer needs a refresh
				}
			} catch (RepositoryConnectionException e) {
				// We just don't open the editor
			} catch (PartInitException e) {
				// We just don't open the editor
			}
		}

	}

	/**
	 * Returns the project containing the model.
	 * 
	 * @param modelURI
	 *            the model uri
	 * @return the project containing the model
	 */
	private IProject findProjectForModelURI(URI modelURI) {
		return ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(modelURI.toPlatformString(true)))
				.getProject();
	}

	/**
	 * Returns the indexEntry corresponding to the current Selection (can be null).
	 * 
	 * @return the indexEntry corresponding to the current Selection (can be null)
	 */
	private IntentGenericElement getIndexEntryFromSelection() {
		IntentGenericElement element = null;
		if (viewer.getSelection() instanceof TreeSelection) {
			TreeSelection selectedElements = (TreeSelection)viewer.getSelection();
			Object firstElement = selectedElements.getFirstElement();
			if (firstElement instanceof IntentIndexEntry) {
				element = ((IntentIndexEntry)firstElement).getReferencedElement();
			}
		}
		return element;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.action.Action#getText()
	 */
	@Override
	public String getText() {
		return "Open in Intent editor";
	}

	/**
	 * Setter for forceNewEditor.
	 * 
	 * @param forceNewEditor
	 *            if true, will open in a new editor anyway. If false, will open in a new editor or select
	 *            inside of an already opened editor
	 */
	public void setForceNewEditor(boolean forceNewEditor) {
		this.forceNewEditor = forceNewEditor;
	}
}
