/*******************************************************************************
 * Copyright (c) 2011 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.mylyn.docs.intent.client.ui.ide.navigator;

import org.eclipse.jface.action.IMenuManager;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.navigator.CommonActionProvider;
import org.eclipse.ui.navigator.CommonViewer;
import org.eclipse.ui.navigator.ICommonActionConstants;
import org.eclipse.ui.navigator.ICommonActionExtensionSite;

/**
 * Provides actions for the repository displayed in the Project Explorer.
 * 
 * @author <a href="mailto:william.piers@obeo.fr">William Piers</a>
 */
public class RepositoryActionProvider extends CommonActionProvider {
	private OpenEditorAction doubleClickAction;

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.ui.navigator.CommonActionProvider#init(org.eclipse.ui.navigator.ICommonActionExtensionSite)
	 */
	@Override
	public void init(ICommonActionExtensionSite aSite) {
		super.init(aSite);
		doubleClickAction = new OpenEditorAction((CommonViewer)aSite.getStructuredViewer());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.ui.actions.ActionGroup#fillActionBars(org.eclipse.ui.IActionBars)
	 */
	@Override
	public void fillActionBars(IActionBars actionBars) {
		super.fillActionBars(actionBars);
		// forward doubleClick to doubleClickAction
		doubleClickAction.setForceNewEditor(false);
		actionBars.setGlobalActionHandler(ICommonActionConstants.OPEN, doubleClickAction);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.ui.actions.ActionGroup#fillContextMenu(org.eclipse.jface.action.IMenuManager)
	 */
	@Override
	public void fillContextMenu(IMenuManager menu) {
		super.fillContextMenu(menu);
		doubleClickAction.setForceNewEditor(true);
		menu.add(doubleClickAction);
	}
}
