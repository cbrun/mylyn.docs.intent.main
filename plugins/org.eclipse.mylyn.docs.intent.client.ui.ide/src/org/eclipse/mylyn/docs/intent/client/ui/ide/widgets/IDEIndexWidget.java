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
package org.eclipse.mylyn.docs.intent.client.ui.ide.widgets;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.mylyn.docs.intent.client.ui.logger.IntentUiLogger;
import org.eclipse.mylyn.docs.intent.client.ui.utils.IntentEditorOpener;
import org.eclipse.mylyn.docs.intent.collab.common.location.IntentLocations;
import org.eclipse.mylyn.docs.intent.collab.handlers.adapters.RepositoryAdapter;
import org.eclipse.mylyn.docs.intent.collab.repository.Repository;
import org.eclipse.mylyn.docs.intent.collab.repository.RepositoryConnectionException;
import org.eclipse.mylyn.docs.intent.collab.utils.RepositoryCreatorHolder;
import org.eclipse.mylyn.docs.intent.core.document.IntentChapter;
import org.eclipse.mylyn.docs.intent.core.document.IntentDocument;
import org.eclipse.mylyn.docs.intent.core.document.IntentSection;
import org.eclipse.mylyn.docs.intent.core.document.IntentStructuredElement;
import org.eclipse.mylyn.docs.intent.core.document.IntentSubSectionContainer;
import org.eclipse.mylyn.docs.intent.core.genericunit.GenericUnit;
import org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnit;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

/**
 * Creates a selection widget allowing the user to select the Intent element to open.
 * 
 * @author <a href="mailto:william.piers@obeo.fr">William Piers</a>
 */
public final class IDEIndexWidget {

	private static final int SHELL_HEIGHT = 100;

	private static final int SHELL_WIDTH = 400;

	/**
	 * SelectionWidget constructor.
	 */
	private IDEIndexWidget() {

	}

	/**
	 * Creates a selection widget allowing the user to choose between all modeling units in the cdo repository
	 * and open an editor on it.
	 * 
	 * @param repository
	 *            The repository to use for this widget and for the launched editor
	 * @throws RepositoryConnectionException
	 *             if a connection to the repository cannot be made.
	 */
	public static void createIndexWidget(final Repository repository) throws RepositoryConnectionException {

		try {
			// Step 1 : we initialize the connection and the list of the modeling units
			final RepositoryAdapter repositoryAdapter = RepositoryCreatorHolder.getCreator()
					.createRepositoryAdapterForRepository(repository);
			repositoryAdapter.openReadOnlyContext();
			List<EObject> elementsList = getIntentElementsList(repositoryAdapter);

			// Step 2 : creation of the selection widget
			final Shell shell = new Shell(getShell());

			shell.setLayout(new FillLayout());
			shell.setSize(new Point(SHELL_WIDTH, SHELL_HEIGHT));
			shell.setToolTipText("Please select the Intent Element you which to open");

			Composite composite = new Composite(shell, SWT.BORDER);
			composite.setLayout(new FormLayout());

			final int padding = -5;

			Button ok = new Button(composite, SWT.PUSH);
			ok.setText("Ok");
			FormData formData = new FormData();
			formData.right = new FormAttachment(100, padding);
			formData.bottom = new FormAttachment(100, padding);
			ok.setLayoutData(formData);

			Button cancel = new Button(composite, SWT.PUSH);
			cancel.setText("Cancel");
			formData = new FormData();
			formData.right = new FormAttachment(ok, padding);
			formData.bottom = new FormAttachment(100, padding);
			cancel.setLayoutData(formData);

			Composite cvComposite = new Composite(composite, SWT.NONE);
			cvComposite.setLayout(new FillLayout());

			final ComboViewer comboViewer = new ComboViewer(cvComposite, SWT.BORDER);

			// TODO make a better input, content provider and label provider (using for instance the outline)
			comboViewer.setContentProvider(new ArrayContentProvider());
			comboViewer.setInput(elementsList);

			// creation of a label provider that print the name of each
			comboViewer.setLabelProvider(new LabelProvider() {
				@Override
				public String getText(Object element) {
					if (element instanceof ModelingUnit) {
						return ((ModelingUnit)element).getUnitName();
					} else {
						return element.toString();
					}
				}
			});

			formData = new FormData();
			formData.top = new FormAttachment(0, 5);
			formData.bottom = new FormAttachment(cancel, padding);
			formData.left = new FormAttachment(0, 5);
			formData.right = new FormAttachment(100, padding);
			cvComposite.setLayoutData(formData);

			// Selection listener : when the user presses "ok",
			// get the selected modeling unit and open an editor using the cdo id.
			ok.addSelectionListener(new SelectionAdapter() {

				public void widgetSelected(SelectionEvent e) {
					ISelection selection = comboViewer.getSelection();
					if (selection instanceof IStructuredSelection) {
						IStructuredSelection structSelection = (IStructuredSelection)selection;
						Object element = structSelection.getFirstElement();
						if ((element instanceof GenericUnit)
								|| (element instanceof IntentStructuredElement)) {
							shell.close();
							try {
								IntentEditorOpener.openIntentEditor(repository,
										repositoryAdapter.getIDFromElement((EObject)element), false, false);
							} catch (PartInitException exception) {
								IntentUiLogger.logError(exception);
							}
						}
					}

				}
			});

			cancel.addSelectionListener(new SelectionAdapter() {
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
				 */
				@Override
				public void widgetSelected(SelectionEvent e) {
					shell.close();
				}
			});

			shell.open();

			repositoryAdapter.closeContext();

		} catch (RepositoryConnectionException e1) {
			throw e1;
		}
	}

	/**
	 * Returns a list containing all the modeling units located on the repository.
	 * 
	 * @param repositoryAdapter
	 *            the view to use to interract with the repository.
	 * @return a list containing all the modeling units located on the repository
	 */
	private static List<EObject> getIntentElementsList(RepositoryAdapter repositoryAdapter) {
		// TODO Find a better way (using identifier seems irrelevant now that we don't use CDO
		// TODO The index seems to be the best way to do it
		List<EObject> identifierList = new ArrayList<EObject>();

		// Get or create resource
		Resource resourceIndex = repositoryAdapter.getResource(IntentLocations.INTENT_INDEX);

		for (EObject object : resourceIndex.getContents()) {
			identifierList.add(object);
			if (object instanceof IntentSubSectionContainer) {
				for (GenericUnit unit : ((IntentSubSectionContainer)object).getUnits()) {
					if (!identifierList.contains(unit)) {
						identifierList.add(unit);
					}
				}
			}
			if (object instanceof IntentDocument) {
				for (IntentChapter chapter : ((IntentDocument)object).getChapters()) {
					identifierList.add(chapter);
					for (IntentSection section : chapter.getSubSections()) {
						identifierList.add(section);
						identifierList.addAll(section.getUnits());
						for (IntentSection subSection : section.getSubSections()) {
							identifierList.add(section);
							identifierList.addAll(subSection.getUnits());
						}
					}
				}
			}
		}

		return identifierList;
	}

	/**
	 * Returns the current shell.
	 * 
	 * @return the current shell
	 */
	public static Shell getShell() {
		return PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
	}
}
