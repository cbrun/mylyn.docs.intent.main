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
package org.eclipse.mylyn.docs.intent.compare.match;

import org.eclipse.emf.compare.match.engine.IMatchScope;
import org.eclipse.emf.compare.match.engine.IMatchScopeProvider;
import org.eclipse.emf.compare.match.filter.IResourceFilter;
import org.eclipse.emf.ecore.EObject;

/**
 * Scope Provider for Intent elements.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public class IntentScopeProvider implements IMatchScopeProvider {

	private IntentScope leftScope;

	private IntentScope rightScope;

	/**
	 * IntentScopeProvider constructor.
	 * 
	 * @param leftObject
	 *            the object from which we will create the left scope
	 * @param rightObject
	 *            the object from which we will create the right scope
	 */
	public IntentScopeProvider(EObject leftObject, EObject rightObject) {
		this.leftScope = new IntentScope(leftObject);
		this.rightScope = new IntentScope(rightObject);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.compare.match.engine.IMatchScopeProvider#getLeftScope()
	 */
	public IMatchScope getLeftScope() {
		return this.leftScope;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.compare.match.engine.IMatchScopeProvider#getRightScope()
	 */
	public IMatchScope getRightScope() {
		return this.rightScope;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.compare.match.engine.IMatchScopeProvider#getAncestorScope()
	 */
	public IMatchScope getAncestorScope() {
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.compare.match.engine.IMatchScopeProvider#applyResourceFilter(org.eclipse.emf.compare.match.filter.IResourceFilter)
	 */
	public void applyResourceFilter(IResourceFilter filter) {

	}
}
