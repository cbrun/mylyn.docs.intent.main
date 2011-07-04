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
package org.eclipse.mylyn.docs.intent.client.synchronizer.factory;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;

/**
 * Utility class providing access to eObjects textual description.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public final class SynchonizerEObjectNameGetter {

	/**
	 * Adapter factory instance. This contains all factories registered in the global registry.
	 */
	private static final ComposedAdapterFactory FACTORY = createAdapterFactory();

	/** Label provider used to compute images and texts for the {@link EObject}s. */
	private static AdapterFactoryLabelProvider labelProvider;

	/**
	 * SynchonizerEObjectNameGetter constructor.
	 */
	private SynchonizerEObjectNameGetter() {

	}

	/**
	 * Computes the name of the given {@link EObject}.
	 * 
	 * @param eObject
	 *            Object for which we need the name.
	 * @return Name of the given {@link EObject}.
	 */
	public static String computeObjectName(EObject eObject) {
		String objectName = null;
		try {
			objectName = getLabelProvider().getText(eObject);
		} catch (IllegalArgumentException e) {
			objectName = null;
		}
		if (objectName == null || "".equals(objectName)) { //$NON-NLS-1$
			objectName = "untitled " + eObject.eClass().getName(); //$NON-NLS-1$
		}
		return objectName;
	}

	/**
	 * Returns the label provider wrapped around {@link EMFAdapterFactoryProvider#getAdapterFactory()}.
	 * 
	 * @return The label provider wrapped around {@link EMFAdapterFactoryProvider#getAdapterFactory()}.
	 */
	private static AdapterFactoryLabelProvider getLabelProvider() {
		if (labelProvider == null) {
			labelProvider = new AdapterFactoryLabelProvider(getAdapterFactory());
		}
		return labelProvider;
	}

	/**
	 * Returns a factory built with all the {@link AdapterFactory} instances available in the global registry.
	 * 
	 * @return A factory built with all the {@link AdapterFactory} instances available in the global registry.
	 */
	public static AdapterFactory getAdapterFactory() {
		return FACTORY;
	}

	/**
	 * Returns an adapter factory containing all the global EMF registry's factories.
	 * 
	 * @return An adapter factory made of all the adapter factories declared in the registry.
	 */
	private static ComposedAdapterFactory createAdapterFactory() {
		final List<AdapterFactory> factories = new ArrayList<AdapterFactory>();
		factories.add(new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE));
		factories.add(new ReflectiveItemProviderAdapterFactory());
		return new ComposedAdapterFactory(factories);
	}

}
