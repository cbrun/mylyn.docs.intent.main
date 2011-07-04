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
package org.eclipse.mylyn.docs.intent.markup.builder.state;

import org.eclipse.mylyn.docs.intent.markup.builder.BuilderState;
import org.eclipse.mylyn.docs.intent.markup.markup.Document;

/**
 * Class defining the behaviors of the parser if the current element is a document.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public class SDocument extends AbstractSContainer {

	/**
	 * Current document.
	 */
	private Document doc;

	/**
	 * SDocument constructor.
	 * 
	 * @param previous
	 *            previous sate
	 * @param doc
	 *            Model element to represent
	 */
	public SDocument(BuilderState previous, Document doc) {
		super(previous, doc);
		this.doc = doc;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.markup.builder.state.AbstractSContainer#endDocument()
	 */
	@Override
	public BuilderState endDocument() {
		return previousState();
	}

}
