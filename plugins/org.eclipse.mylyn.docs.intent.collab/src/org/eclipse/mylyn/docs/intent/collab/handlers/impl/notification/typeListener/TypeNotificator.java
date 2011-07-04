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
package org.eclipse.mylyn.docs.intent.collab.handlers.impl.notification.typeListener;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.mylyn.docs.intent.collab.handlers.RepositoryObjectHandler;
import org.eclipse.mylyn.docs.intent.collab.handlers.notification.Notificator;
import org.eclipse.mylyn.docs.intent.collab.handlers.notification.RepositoryChangeNotification;

/**
 * Notificator listening for the changes that occure on a session and filter them according to the given type.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public class TypeNotificator implements Notificator {

	/**
	 * List of RepositoryObectHandlers to notify if any change occures on any listened object.
	 */
	private Set<RepositoryObjectHandler> listeningHandlers;

	/**
	 * Set of the listened types : if any change occures on any instance of theses types, this Notificator
	 * will prevent its associated RepositoryObjectHandlers.
	 */
	private Set<EStructuralFeature> listenedTypes;

	/**
	 * TypeNotificator constructor.
	 * 
	 * @param listenedTypes
	 *            the types to listen
	 */
	public TypeNotificator(Set<EStructuralFeature> listenedTypes) {
		this.listenedTypes = listenedTypes;
		this.listeningHandlers = new HashSet<RepositoryObjectHandler>();
	}

	/**
	 * TypeNotificator constructor.
	 * 
	 * @param listenedTypes
	 *            the types to listen
	 * @param listeningHandlers
	 *            handlers that listens this Notificator.
	 */
	public TypeNotificator(Set<EStructuralFeature> listenedTypes,
			Set<RepositoryObjectHandler> listeningHandlers) {
		this.listenedTypes = listenedTypes;
		this.listeningHandlers = new HashSet<RepositoryObjectHandler>();
		for (RepositoryObjectHandler listeningHandler : listeningHandlers) {
			addRepositoryObjectHandler(listeningHandler);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.collab.handlers.notification.Notificator#stop()
	 */
	public void stop() {
		for (RepositoryObjectHandler handler : listeningHandlers) {
			removeRepositoryObjectHandler(handler);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.collab.handlers.notification.Notificator#addRepositoryObjectHandler(org.eclipse.mylyn.docs.intent.collab.handlers.RepositoryObjectHandler)
	 */
	public void addRepositoryObjectHandler(RepositoryObjectHandler listener) {
		listeningHandlers.add(listener);
		if (listener.getRepositoryAdapter() != null) {
			listener.getRepositoryAdapter().attachSessionListenerForTypes(this, listenedTypes);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.collab.handlers.notification.Notificator#removeRepositoryObjectHandler(org.eclipse.mylyn.docs.intent.collab.handlers.RepositoryObjectHandler)
	 */
	public void removeRepositoryObjectHandler(RepositoryObjectHandler listener) {
		if (listener.getRepositoryAdapter() != null) {
			listener.getRepositoryAdapter().detachSessionListenerForTypes(this);
		}
		listeningHandlers.remove(listener);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.collab.handlers.notification.Notificator#notifyHandlers(org.eclipse.mylyn.docs.intent.collab.handlers.notification.RepositoryChangeNotification)
	 */
	public void notifyHandlers(RepositoryChangeNotification changeNotification) {
		for (RepositoryObjectHandler handler : listeningHandlers) {
			handler.handleChangeNotification(changeNotification);
		}
	}

	/**
	 * Returns all the structuralFeatures recursively contained in the given class (all EAttributes,
	 * EReferences...).
	 * 
	 * @param eClass
	 *            the class to inspect
	 * @return a list of the structuralFeatures recursively contained in the given class (all EAttributes,
	 *         EReferences...)
	 */
	public static List<EStructuralFeature> getStructuralFeaturesForEClass(EClass eClass) {
		List<EStructuralFeature> classFeatures = new ArrayList<EStructuralFeature>();
		classFeatures.addAll(eClass.getEAllStructuralFeatures());
		return classFeatures;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.collab.handlers.notification.Notificator#addObjectsToListen(java.util.List)
	 */
	public void addObjectsToListen(List<EObject> objectsToHandle) {
		// For now on, we throw an exception
		// TODO if the needs are justified, implement this dynamic add
		throw new UnsupportedOperationException("A type Notificator cannot be dynamicly changed");
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.collab.handlers.notification.Notificator#removeObjectsToListen(java.util.List)
	 */
	public void removeObjectsToListen(List<Object> objectsToRemove) {
		// For now on, we throw an exception
		// TODO if the needs are justified, implement this dynamic remove
		throw new UnsupportedOperationException("A type Notificator cannot be dynamicly changed");
	}

}
