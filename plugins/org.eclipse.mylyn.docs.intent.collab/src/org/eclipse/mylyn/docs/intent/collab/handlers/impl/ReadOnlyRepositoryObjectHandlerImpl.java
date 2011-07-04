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
package org.eclipse.mylyn.docs.intent.collab.handlers.impl;

import org.eclipse.mylyn.docs.intent.collab.handlers.ReadOnlyRepositoryObjectHandler;

/**
 * Handles the management of Objects from the Intent Repository : notifies the subscribed clients in case of
 * distant changes on the handled objects ; doesn't allow to save any of these objects.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public class ReadOnlyRepositoryObjectHandlerImpl extends AbstractRepositoryObjectHandler implements ReadOnlyRepositoryObjectHandler {

}
