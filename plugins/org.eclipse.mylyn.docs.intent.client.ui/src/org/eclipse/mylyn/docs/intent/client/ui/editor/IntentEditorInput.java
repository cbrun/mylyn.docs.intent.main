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
package org.eclipse.mylyn.docs.intent.client.ui.editor;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.mylyn.docs.intent.core.descriptionunit.DescriptionUnit;
import org.eclipse.mylyn.docs.intent.core.document.IntentStructuredElement;
import org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnit;
import org.eclipse.mylyn.docs.intent.core.query.DescriptionUnitHelper;
import org.eclipse.mylyn.docs.intent.core.query.StructuredElementHelper;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IPersistableElement;
import org.eclipse.ui.model.IWorkbenchAdapter;

/**
 * EditorInput for Intent elements.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public class IntentEditorInput implements IEditorInput {

	/**
	 * Maximum size for an input title.
	 */
	private static final int MAX_TITLE_SIZE = 25;

	/**
	 * The element that this EditorInput will handle.
	 */
	private EObject element;

	/**
	 * Name of this element to print.
	 */
	private String elementTitle;

	/**
	 * IntentEditorInput constructor.
	 * 
	 * @param elementToOpen
	 *            the element that this EditorInput will handle
	 */
	public IntentEditorInput(EObject elementToOpen) {
		this.element = elementToOpen;
		if (element instanceof ModelingUnit) {
			this.elementTitle = ((ModelingUnit)element).getUnitName();
			if ((elementTitle == null) || (elementTitle.length() < 1)) {
				this.elementTitle = "Untitled ModelingUnit";
			}
		}
		if (element instanceof DescriptionUnit) {
			this.elementTitle = DescriptionUnitHelper.getDescriptionUnitTitle((DescriptionUnit)element,
					MAX_TITLE_SIZE);
		}
		if (element instanceof IntentStructuredElement) {
			this.elementTitle = StructuredElementHelper.getTitle((IntentStructuredElement)element);
			if ((elementTitle == null) || (elementTitle.length() < 1)) {
				this.elementTitle = element.eClass().getName();
			}
		}
		if (this.elementTitle.length() > MAX_TITLE_SIZE) {
			this.elementTitle = this.elementTitle.substring(0, MAX_TITLE_SIZE);
		}

		// Object image = new IntentOutlinePageItemProvider(new IntentOutlinePageItemProviderAdapterFactory())
		// .getImage(this.element);
	}

	/**
	 * Returns the element associated to this editorInput.
	 * 
	 * @return the element associated to this editorInput
	 */
	public EObject getIntentElement() {
		return element;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.core.runtime.IAdaptable#getAdapter(java.lang.Class)
	 */
	public Object getAdapter(Class adapter) {

		if (IWorkbenchAdapter.class.equals(adapter)) {
			return new IWorkbenchAdapter() {

				public Object[] getChildren(Object o) {
					return new Object[0];
				}

				public ImageDescriptor getImageDescriptor(Object object) {
					return null;
				}

				public String getLabel(Object o) {
					return elementTitle;
				}

				public Object getParent(Object o) {
					return null;
				}
			};
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.ui.IEditorInput#exists()
	 */
	public boolean exists() {
		return true;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.ui.IEditorInput#getImageDescriptor()
	 */
	public ImageDescriptor getImageDescriptor() {
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.ui.IEditorInput#getName()
	 */
	public String getName() {
		return elementTitle;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.ui.IEditorInput#getPersistable()
	 */
	public IPersistableElement getPersistable() {
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.ui.IEditorInput#getToolTipText()
	 */
	public String getToolTipText() {
		return elementTitle;
	}

	/**
	 * Sets the name to return.
	 * 
	 * @param newName
	 *            the newName to return
	 */
	public void setName(String newName) {
		elementTitle = newName;
	}

}
