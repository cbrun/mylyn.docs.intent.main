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
package org.eclipse.mylyn.docs.intent.client.ui.editor;

import org.eclipse.jface.text.DocumentEvent;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.rules.FastPartitioner;
import org.eclipse.jface.text.rules.IPartitionTokenScanner;

/**
 * Document Partionner with standard behavior ; notifiy the editor whenever a document has changed and is
 * about to change.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public class IntentFastPartitionner extends FastPartitioner {

	private IntentEditor editor;

	/**
	 * target.target constructor.
	 * 
	 * @param scanner
	 *            the scanner this partitioner is supposed to use
	 * @param legalContentTypes
	 *            the legal content types of this partitioner
	 * @param editor
	 *            the Intent editor
	 */
	public IntentFastPartitionner(IPartitionTokenScanner scanner, String[] legalContentTypes, IntentEditor editor) {
		super(scanner, legalContentTypes);
		this.editor = editor;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.text.rules.FastPartitioner#documentChanged2(org.eclipse.jface.text.DocumentEvent)
	 */
	@Override
	public IRegion documentChanged2(DocumentEvent e) {
		if (e.getLength() == e.getDocument().getLength()) {
			editor.updateCursorPositionAfterReload();
		}
		return super.documentChanged2(e);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.text.rules.FastPartitioner#documentAboutToBeChanged(org.eclipse.jface.text.DocumentEvent)
	 */
	@Override
	public void documentAboutToBeChanged(DocumentEvent e) {
		if (e.getLength() == e.getDocument().getLength()) {
			editor.cursorWillChange();
		}
		super.documentAboutToBeChanged(e);
	}

}
