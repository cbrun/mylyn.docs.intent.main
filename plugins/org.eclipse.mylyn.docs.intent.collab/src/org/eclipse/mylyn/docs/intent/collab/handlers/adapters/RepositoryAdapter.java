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
package org.eclipse.mylyn.docs.intent.collab.handlers.adapters;

import java.util.Collection;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.mylyn.docs.intent.collab.handlers.notification.Notificator;

/**
 * Allows the RepositoryObjectHandler to work with any type of repository.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public interface RepositoryAdapter {

	// ----------------- GENERAL REPOSITORY INTERACTIONS
	/**
	 * Open and return a save context (connection in read/write mode).
	 * 
	 * @return a save context
	 */
	Object openSaveContext();

	/**
	 * Open and returns a readOnly context (connection in read-only mode - GET).
	 * 
	 * @return a connection in read-only mode (GET)
	 */
	Object openReadOnlyContext();

	/**
	 * Returns the context currently opened.
	 * 
	 * @return the context currently opened
	 */
	Object getContext();

	/**
	 * Close the current context.
	 */
	void closeContext();

	/**
	 * Save all the modifications made after the last save() action ; typically, can use a
	 * RepositoryStructurer for restructure the resource architecture of the repository.
	 * 
	 * @throws SaveException
	 *             if the save action is impossible or causes conflicts
	 * @throws ReadOnlyException
	 *             if the current context is readOnly
	 */
	void save() throws ReadOnlyException, SaveException;

	/**
	 * Undo the modifications made after the last save() action.
	 * 
	 * @throws ReadOnlyException
	 *             if the current context is readOnly
	 */
	void undo() throws ReadOnlyException;

	/**
	 * Returns the resource located at the given path.
	 * 
	 * @param repositoryRelativePath
	 *            path of the searched resource (from the root of the repository)
	 * @return the resource located at the given path, null if no element found
	 */
	Resource getResource(String repositoryRelativePath);

	/**
	 * Creates the resource located at the given path ; if a resource already exists, returns it.
	 * 
	 * @param path
	 *            path of the searched resource
	 * @throws ReadOnlyException
	 *             if the current context is readOnly
	 * @return the resource located at the given path or if the context don't allow such a creation (must be a
	 *         saveContext)
	 */
	Resource getOrCreateResource(String path) throws ReadOnlyException;

	/**
	 * Returns the element with the given ID.
	 * 
	 * @param id
	 *            id of the searched element
	 * @return the element with the given ID, null if no element found
	 */
	EObject getElementWithID(Object id);

	/**
	 * Returns the ID associated to the given element.
	 * 
	 * @param element
	 *            the element from which we want to get the ID
	 * @return the id associated to the given element, null if no ID
	 */
	Object getIDFromElement(EObject element);

	// ----------------- METHODS RELATIVE TO NOTIFYING MECHANISM
	/**
	 * Create a listener notifying the given typeNotificator each time an instance of one of the given types
	 * is modified, and attach this listener to the session.
	 * 
	 * @param typeNotificator
	 *            typeNotificator to notify whenever an instance of one of the given types is modified
	 * @param listenedTypes
	 *            types to watch
	 */
	void attachSessionListenerForTypes(Notificator typeNotificator, Set<EStructuralFeature> listenedTypes);

	/**
	 * Delete the listeners created with the attachSessionListenerForTypes method.
	 * 
	 * @param typeNotificator
	 *            typeNotificator to notify whenever an instance of one of the given types is modified
	 */
	void detachSessionListenerForTypes(Notificator typeNotificator);

	/**
	 * Attaches the given structurer to this adapter ; it should be used during the saving operation (for
	 * example) to structure the repository.
	 * 
	 * @param structurer
	 *            the structurer to attach to this adapter.
	 */
	void attachRepositoryStructurer(RepositoryStructurer structurer);

	/**
	 * Allow the save context to handle change Subscription.
	 */
	void allowChangeSubscriptionPolicy();

	/**
	 * Define the behavior of this adapter before a save action : send (or not) warning to the Session before
	 * saving according to the given parameter.
	 * <p>
	 * The session will ignore the next change notification relative to each saved resource.
	 * </p>
	 * 
	 * @param notifySessionBeforeSaving
	 *            indicates if this adapter should send or not warning to the Session before saving
	 */
	void setSendSessionWarningBeforeSaving(boolean notifySessionBeforeSaving);

	/**
	 * Define the behavior of this adapter before a save action.
	 * <ul>
	 * <li>modifications on resources starting with the given paths won't trigger a Session Warning
	 * <li>modifications on any other resource will trigger a Session Warning
	 * </ul>
	 * <p>
	 * The Session will ignore the next change notification relative to a resource if it has been warned.
	 * </p>
	 * 
	 * @param resourcesToIgnorePaths
	 *            a list of the path to ignore (can be the path to a single resource or a folder of a
	 *            repository)
	 */
	void setSendSessionWarningBeforeSaving(Collection<String> resourcesToIgnorePaths);

	/**
	 * Return the reloaded version of the given elementToReload (or this element if it hasn't change).
	 * <p>
	 * In concrete terms, if the given element is a proxy, use the repository technology to resolve this
	 * proxy.
	 * </p>
	 * 
	 * @param elementToReload
	 *            the element to reload
	 * @return the reloaded version of the given element
	 */
	EObject reload(EObject elementToReload);

}
