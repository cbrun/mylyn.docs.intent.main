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
package org.eclipse.mylyn.docs.intent.client.ui.editor.outline;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.provider.EcoreItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.mylyn.docs.intent.client.ui.editor.IntentEditor;
import org.eclipse.mylyn.docs.intent.core.descriptionunit.DescriptionUnit;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.views.contentoutline.ContentOutlinePage;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;

/**
 * Outline view associated to the Intent Editor.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public class IntentOutlinePage extends ContentOutlinePage implements IContentOutlinePage, ISelectionChangedListener {

	/**
	 * The editor associated with this view.
	 */
	protected IntentEditor editor;

	/**
	 * The adapter factory used by this outline view.
	 */
	protected AdapterFactory adapterFactory;

	/**
	 * The item provider of the outline page.
	 */
	protected IntentOutlinePageItemProviderAdapterFactory outlinePageItemProvider;

	/**
	 * The Job in charge of refreshing this outline view.
	 */
	private final RefreshOutlineJob refreshViewJob;

	/**
	 * The filter to use for hiding the description units (can be null at any time).
	 */
	private ViewerFilter descriptionUnitFilter;

	/**
	 * IntentOutlinePage constructor.
	 * 
	 * @param editor
	 *            the editor associated to this outlinePage.
	 */
	public IntentOutlinePage(IntentEditor editor) {
		super();
		this.editor = editor;
		outlinePageItemProvider = new IntentOutlinePageItemProviderAdapterFactory();
		List<AdapterFactory> factories = new ArrayList<AdapterFactory>();
		factories.add(outlinePageItemProvider);
		factories.add(new ResourceItemProviderAdapterFactory());
		factories.add(new EcoreItemProviderAdapterFactory());
		factories.add(new ReflectiveItemProviderAdapterFactory());
		adapterFactory = new ComposedAdapterFactory(factories);
		refreshViewJob = new RefreshOutlineJob(this);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.ui.views.contentoutline.ContentOutlinePage#createControl(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createControl(Composite parent) {
		super.createControl(parent);

		// Setting content and label providers
		EObject editorContent = this.editor.getIntentContent();
		getTreeViewer().setContentProvider(new OutlineContentProvider(adapterFactory, editorContent, false));
		getTreeViewer().setLabelProvider(new IntentOutlinePageLabelProvider(adapterFactory));
		// Setting input
		IntentOutlineInformationHolder input = new IntentOutlineInformationHolder(editorContent, true);
		getTreeViewer().setInput(input);
		getTreeViewer().expandToLevel(editorContent, 2);
	}

	/**
	 * Hide the description unit instructions in this outline.
	 */
	public void addDescriptionUnitFilter() {
		if (descriptionUnitFilter == null) {
			descriptionUnitFilter = new ViewerFilter() {

				@Override
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					return !(parentElement instanceof DescriptionUnit);
				}
			};
			getTreeViewer().addFilter(descriptionUnitFilter);
		}
	}

	/**
	 * Remove the description unit filter added (if any filter has been added).
	 */
	public void removeDescriptionUnitFilter() {
		if (descriptionUnitFilter == null) {
			getTreeViewer().removeFilter(descriptionUnitFilter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.ui.views.contentoutline.ContentOutlinePage#getTreeViewer()
	 */
	@Override
	public TreeViewer getTreeViewer() {
		return super.getTreeViewer();
	}

	/**
	 * Refreshes the given container and its children in the outline view.
	 * 
	 * @param element
	 *            is the container of the modified element
	 */
	public void refreshInternalContainer(Object element) {

		TreePath[] treePaths = getTreeViewer().getExpandedTreePaths();
		getTreeViewer().setInput(new IntentOutlineInformationHolder((EObject)element, true));
		getTreeViewer().setExpandedTreePaths(treePaths);
	}

	/**
	 * Refreshes the given element and its children in the outline view.
	 * 
	 * @param element
	 *            is the element to refresh
	 */
	public void refresh(final Object element) {
		refreshViewJob.refreshView(element);
	}

	/**
	 * Sets the selectedElement of this outline.
	 * 
	 * @param element
	 *            the element to select
	 */
	public void setSelectedElement(EObject element) {
		// System.err.println(((IntentOutlinePageLabelProvider)(getTreeViewer().getLabelProvider()))
		// .getText(element));

		// getTreeViewer().collapseAll();
		// getTreeViewer().reveal(element);
	}
}
