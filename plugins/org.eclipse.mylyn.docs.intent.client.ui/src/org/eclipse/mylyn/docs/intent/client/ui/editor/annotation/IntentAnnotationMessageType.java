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
package org.eclipse.mylyn.docs.intent.client.ui.editor.annotation;

/**
 * Represents the type of an IntentAnnotation ; used for associated the correct icon in an editor.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public enum IntentAnnotationMessageType {

	COMPILER_WARNING, COMPILER_INFO, COMPILER_ERROR, PARSER_INFO, PARSER_WARNING, PARSER_ERROR, SYNC_WARNING, DEFAULT;
}
