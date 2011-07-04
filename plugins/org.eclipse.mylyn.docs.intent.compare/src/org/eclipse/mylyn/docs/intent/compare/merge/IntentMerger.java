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
package org.eclipse.mylyn.docs.intent.compare.merge;

import org.eclipse.emf.compare.diff.merge.DefaultMerger;

/**
 * Merger for Intent elements.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public class IntentMerger extends DefaultMerger {

	/**
	 * IntentMerger constructor.
	 */
	public IntentMerger() {

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.compare.diff.merge.DefaultMerger#canUndoInTarget()
	 */
	@Override
	public boolean canUndoInTarget() {
		return true;
	}
}
