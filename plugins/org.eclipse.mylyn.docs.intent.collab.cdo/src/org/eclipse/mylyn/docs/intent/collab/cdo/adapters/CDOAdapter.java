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
package org.eclipse.mylyn.docs.intent.collab.cdo.adapters;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.cdo.common.CDOCommonSession.Options.PassiveUpdateMode;
import org.eclipse.emf.cdo.common.id.CDOID;
import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.cdo.util.CommitException;
import org.eclipse.emf.cdo.util.ReadOnlyException;
import org.eclipse.emf.cdo.view.CDOAdapterPolicy;
import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.mylyn.docs.intent.collab.handlers.adapters.RepositoryAdapter;
import org.eclipse.mylyn.docs.intent.collab.handlers.adapters.RepositoryStructurer;
import org.eclipse.mylyn.docs.intent.collab.handlers.adapters.SaveException;
import org.eclipse.mylyn.docs.intent.collab.handlers.notification.Notificator;
import org.eclipse.net4j.util.event.IListener;

/**
 * Adapter that allows the RepositoryObjectHandler to work with a CDO repository.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public class CDOAdapter implements RepositoryAdapter {

	/**
	 * The session used in this adapter.
	 */
	private CDOSession session;

	/**
	 * The current opened context.
	 */
	private CDOView currentContext;

	/**
	 * Indicates if the current opened context is ReadOnly (false if Read/Write).
	 */
	private boolean isReadOnlyContext;

	/**
	 * Map that associate Notificators to the typeListner created (used to close detach theses listeners).
	 */
	private Map<Notificator, Set<IListener>> notificatorToListener;

	/**
	 * Booleans indicating whether this adapter must allow changeSubscriptionPolicy on its transactions.
	 */
	private boolean allowChangeSubscriptionPolicy;

	/**
	 * CDOAdapter Constructor.
	 * 
	 * @param object
	 *            the session to use.
	 */
	public CDOAdapter(Object object) {
		this.notificatorToListener = new HashMap<Notificator, Set<IListener>>();
		this.allowChangeSubscriptionPolicy = false;
		setSession(object);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.collab.handlers.adapters.RepositoryAdapter#setSession(java.lang.Object)
	 */
	public void setSession(Object session) {
		if (session instanceof CDOSession) {
			this.session = (CDOSession)session;
		} else {
			throw new IllegalArgumentException("The session associated to CDOAdapter must be a CDOSession");
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.collab.handlers.adapters.RepositoryAdapter#getSession()
	 */
	public Object getSession() {
		return session;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @return
	 * @see org.eclipse.mylyn.docs.intent.collab.handlers.adapters.RepositoryAdapter#openSaveContext()
	 */
	public Object openSaveContext() {
		if (this.currentContext == null) {
			this.currentContext = session.openTransaction();
			setChangeSubscriptionPolicy();
			this.isReadOnlyContext = false;
		}
		return getContext();
	}

	/**
	 * Initialize a changeSubscriptionPolicy on the currentTransaction.
	 */
	private void setChangeSubscriptionPolicy() {
		if (this.allowChangeSubscriptionPolicy) {
			if (this.currentContext != null) {
				// The CDOAdapterPolicy.CDO means that we will only be notified by CDOAdapters (see CDO
				// documentation).
				this.currentContext.options().addChangeSubscriptionPolicy(CDOAdapterPolicy.ALL);
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.collab.handlers.adapters.RepositoryAdapter#openReadOnlyContext()
	 */
	public Object openReadOnlyContext() {
		this.isReadOnlyContext = true;
		if (this.currentContext == null) {
			this.currentContext = session.openView();
		}
		return null;
	}

	/**
	 * Use this method if a save context has already been launched and you want this Adapter to use it.
	 * 
	 * @param saveContext
	 *            the save context to use
	 */
	public void setSaveContext(Object saveContext) {
		this.currentContext = (CDOTransaction)saveContext;
		this.isReadOnlyContext = false;
		setChangeSubscriptionPolicy();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.collab.handlers.adapters.RepositoryAdapter#save()
	 */
	public void save() throws SaveException, ReadOnlyException {
		if (isReadOnlyContext) {
			throw new ReadOnlyException(
					"Cannot save with a read-only context. The context should have been started with the 'openSaveContext' method.");
		}
		try {
			((CDOTransaction)this.currentContext).commit();
		} catch (CommitException ce) {
			SaveException e = new SaveException(ce.getMessage());
			e.setStackTrace(ce.getStackTrace());
			throw e;
		} catch (ReadOnlyException roe) {
			SaveException e = new SaveException(roe.getMessage());
			e.setStackTrace(roe.getStackTrace());
			throw e;
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.collab.handlers.adapters.RepositoryAdapter#undo()
	 */
	public void undo() throws ReadOnlyException {
		if (this.isReadOnlyContext) {
			throw new ReadOnlyException(
					"Cannot undo action with a read-only context. The context should have been started with the 'openSaveContext' method.");
		}
		if (this.currentContext != null) {
			((CDOTransaction)this.currentContext).rollback();
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.collab.handlers.adapters.RepositoryAdapter#closeContext()
	 */
	public void closeContext() {
		if (this.currentContext != null) {
			this.currentContext.close();
			this.isReadOnlyContext = false;
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.collab.handlers.adapters.RepositoryAdapter#attachSessionListenerForTypes(org.eclipse.mylyn.docs.intent.collab.handlers.impl.notification.typeListener.TypeNotificator,
	 *      java.util.Set)
	 */
	public void attachSessionListenerForTypes(Notificator typeNotificator, Set<EStructuralFeature> types) {
		this.session.options().setPassiveUpdateMode(PassiveUpdateMode.ADDITIONS);
		CDOTypeListener typeListener = new CDOTypeListener(typeNotificator, types);
		if (this.notificatorToListener.get(typeNotificator) == null) {
			this.notificatorToListener.put(typeNotificator, new HashSet<IListener>());
		}
		this.notificatorToListener.get(typeNotificator).add(typeListener);
		this.session.addListener(typeListener);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.collab.handlers.adapters.RepositoryAdapter#detachSessionListenerForTypes(org.eclipse.mylyn.docs.intent.collab.handlers.impl.notification.typeListener.TypeNotificator)
	 */
	public void detachSessionListenerForTypes(Notificator typeNotificator) {
		for (IListener listenerToRemove : this.notificatorToListener.get(typeNotificator)) {
			this.session.removeListener(listenerToRemove);
		}

		this.notificatorToListener.remove(typeNotificator);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.collab.handlers.adapters.RepositoryAdapter#getContext()
	 */
	public Object getContext() {
		return this.currentContext;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.collab.handlers.adapters.RepositoryAdapter#allowChangeSubscriptionPolicy()
	 */
	public void allowChangeSubscriptionPolicy() {
		this.allowChangeSubscriptionPolicy = true;
		setChangeSubscriptionPolicy();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.collab.handlers.adapters.RepositoryAdapter#getResource(java.lang.String)
	 */
	public Resource getResource(String path) {
		return this.currentContext.getResource(path);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.collab.handlers.adapters.RepositoryAdapter#getOrCreateResource(java.lang.String)
	 */
	public Resource getOrCreateResource(String path) {
		if (this.isReadOnlyContext) {
			throw new ReadOnlyException(
					"Cannot create any resource with a read-only context. The context should have been started with the 'openSaveContext' method.");
		}
		if (this.currentContext != null) {
			return ((CDOTransaction)this.currentContext).getOrCreateResource(path);
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.collab.handlers.adapters.RepositoryAdapter#getElementWithID(java.lang.Object)
	 */
	public EObject getElementWithID(Object id) {
		if (id instanceof CDOID) {
			return this.currentContext.getObject((CDOID)id);
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.collab.handlers.adapters.RepositoryAdapter#getIDFromElement(java.lang.Object)
	 */
	public Object getIDFromElement(EObject element) {
		if (element instanceof CDOObject) {
			return ((CDOObject)element).cdoID();
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.collab.handlers.adapters.RepositoryAdapter#attachRepositoryStructurer(org.eclipse.mylyn.docs.intent.collab.handlers.adapters.RepositoryStructurer)
	 */
	public void attachRepositoryStructurer(RepositoryStructurer structurer) {
		// TODO if the use cases show this is useful, we should integrate a structurer to CDO Adapters.
		throw new UnsupportedOperationException("Can't define structurer on aCDO Repository.");

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.collab.handlers.adapters.RepositoryAdapter#setSendSessionWarningBeforeSaving(boolean)
	 */
	public void setSendSessionWarningBeforeSaving(boolean notifySessionBeforeSaving) {
		// Such a warning mechanism is already implemented between CDOResources and CDOSessions
		// That's why we don't have anything to do here.

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.collab.handlers.adapters.RepositoryAdapter#setSendSessionWarningBeforeSaving(java.util.Collection)
	 */
	public void setSendSessionWarningBeforeSaving(Collection<String> resourcesToIgnorePaths) {
		// TODO Auto-generated method stub

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.collab.handlers.adapters.RepositoryAdapter#reload(org.eclipse.emf.ecore.EObject)
	 */
	public EObject reload(EObject elementToReload) {
		if (elementToReload instanceof CDOObject) {
			((CDOObject)elementToReload).cdoReload();
			return elementToReload;
		}
		throw new IllegalArgumentException("Cannot reload an element which is not a CDOObject");

	}
}
