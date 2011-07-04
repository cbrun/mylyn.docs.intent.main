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

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITableItemLabelProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;

/**
 * Specific item provider adapter factory for the outline of the template editor.
 * 
 * @author <a href="mailto:jonathan.musset@obeo.fr">Jonathan Musset</a>
 */
public class IntentOutlinePageItemProviderAdapterFactory extends ReflectiveItemProviderAdapterFactory {

	/**
	 * Constructor.
	 */
	public IntentOutlinePageItemProviderAdapterFactory() {
		this(false);
	}

	/**
	 * constructor.
	 * 
	 * @param hideDescriptionUnitsContent
	 *            indicates if this content provider will have to hide description units content
	 */
	public IntentOutlinePageItemProviderAdapterFactory(boolean hideDescriptionUnitsContent) {
		reflectiveItemProviderAdapter = createReflectiveItemProvider(hideDescriptionUnitsContent);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemPropertySource.class);
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(ITableItemLabelProvider.class);
	}

	/**
	 * Creates the specific item provider for the template editor.
	 * 
	 * @param hideDescriptionUnitsContent
	 *            indicates if this content provider will have to hide description units content
	 * @return the item provider
	 */
	protected IntentOutlinePageItemProvider createReflectiveItemProvider(boolean hideDescriptionUnitsContent) {
		return new IntentOutlinePageItemProvider(this, hideDescriptionUnitsContent);
	}

}
