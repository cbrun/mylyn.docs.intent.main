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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.AbstractDocument;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.CopyOnWriteTextStore;
import org.eclipse.jface.text.DefaultLineTracker;
import org.eclipse.jface.text.GapTextStore;
import org.eclipse.jface.text.IDocument;
import org.eclipse.mylyn.docs.intent.client.ui.logger.IntentUiLogger;
import org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnit;
import org.eclipse.mylyn.docs.intent.serializer.IntentSerializer;
import org.eclipse.mylyn.docs.intent.serializer.ParsedElementPosition;
import org.eclipse.swt.widgets.Display;

/**
 * Document representing an IntentElement located on a Repository.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public class IntentEditorDocument extends AbstractDocument implements IDocument {

	public static final String MODELING_PREFIX_DECORATION = "\n";

	public static final String MODELING_SUFFIX_DECORATION = MODELING_PREFIX_DECORATION;

	/**
	 * The ast of this document (recreated for each save on this document).
	 */
	private EObject lastSavedAst;

	/**
	 * The last ast dowloaded from the repository (recreated for each commit on this document).
	 */
	private EObject lastRepositoryAST;

	/**
	 * The serializer used to serialized the given Intent elements.
	 */
	private IntentSerializer serializer;

	/**
	 * IntentDocument constructor.
	 * 
	 * @param root
	 *            the element to associate to this IntentDocument.
	 */
	public IntentEditorDocument(EObject root) {
		super();
		serializer = new IntentSerializer(MODELING_PREFIX_DECORATION, MODELING_SUFFIX_DECORATION);
		this.lastSavedAst = root;
		this.lastRepositoryAST = this.lastSavedAst;

		setTextStore(new CopyOnWriteTextStore(new GapTextStore()));
		setLineTracker(new DefaultLineTracker());
		super.completeInitialization();
		set(serializer.serialize(root));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.text.AbstractDocument#set(java.lang.String)
	 */
	@Override
	public void set(String text) {
		super.set(text);
	}

	/**
	 * Returns the ast of this document (recreated for each save on this document).
	 * 
	 * @return the ast of this document (recreated for each save on this document)
	 */
	public Object getAST() {
		return this.lastSavedAst;
	}

	/**
	 * Sets the ast to use.
	 * 
	 * @param newAST
	 *            the ast to use
	 * @param isSynchronizedWithRepository
	 *            indicates if the given ast is synchronized with the repository or is a local version.
	 */
	public void setAST(EObject newAST, boolean isSynchronizedWithRepository) {
		if (isSynchronizedWithRepository) {
			this.lastRepositoryAST = newAST;
		}
		this.lastSavedAst = newAST;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.text.AbstractDocument#replace(int, int, java.lang.String)
	 */
	@Override
	public void replace(int pos, int length, String text) throws BadLocationException {
		// We don't allow the replacement of a decorated line
		if (!containsDecorationLine(pos, length, text.length() - length >= 0)) {
			this.serializer.updatePositions(pos, text.length() - length);
			super.replace(pos, length, text);
		}
	}

	/**
	 * Sets this document's serializer ; can be used for providing new positions informations.
	 * 
	 * @param serializer
	 *            the serializer to set
	 */
	public void setSerializer(IntentSerializer serializer) {
		this.serializer = serializer;
	}

	/**
	 * Sets the new value of the ast and refresh the document.
	 * 
	 * @param newAST
	 *            the new value of the ast
	 * @param isSynchronizedWithRepository
	 *            indicates if the given ast is synchronized with the repository or is a local version.
	 * @param string
	 */
	public void reloadFromAST(final EObject newAST, final boolean isSynchronizedWithRepository) {
		Display.getDefault().syncExec(new Runnable() {

			public void run() {

				try {
					String serializedForm = serializer.serialize(newAST);
					if (!get().equals(serializedForm)) {
						replace(0, getLength(), serializedForm);
					}
					setAST(newAST, isSynchronizedWithRepository);
				} catch (BadLocationException e) {
					IntentUiLogger.logError("Error encountered while refreshing the document ", e);
				}
			}
		});

	}

	/**
	 * Returns the position of the given element (if the document contains it).
	 * 
	 * @param element
	 *            element from which we want the position
	 * @return the position of the given element if the document contains it, null otherwise
	 */
	public ParsedElementPosition getIntentPosition(EObject element) {

		ParsedElementPosition positionForElement = this.serializer.getPositionForElement(element);
		return positionForElement;
	}

	/**
	 * Returns the element located at the given position.
	 * 
	 * @param offset
	 *            the current offset
	 * @return the element located at the given position
	 */
	public EObject getElementAtOffset(int offset) {
		return this.serializer.getElementAtPosition(offset);
	}

	/**
	 * Returns the element corresponding to the given position.
	 * 
	 * @param offset
	 *            the current offset
	 * @return the element corresponding to the given position
	 */
	public EObject getElementAtPosition(int offset) {
		return this.serializer.getElementAtPosition(offset);
	}

	/**
	 * Handle the fact that the content off this document has been deleted by other users.
	 */
	public void unsynchronize() {
		Display.getDefault().syncExec(new Runnable() {

			public void run() {

				set("The opened elements are out of sync. (have been deleted by another user. )");
				// TODO : make the editor and the document unsavable and stop the automatic parsing of the AST
			}
		});
	}

	/**
	 * Indicates if the line at the selection starting at the given offset is a decoration line (and shouldn't
	 * be editable, for example).
	 * 
	 * @param offset
	 *            starting offset of the selection
	 * @param length
	 *            of the selection
	 * @param addingMode
	 *            indicates if the current modification is not removing any content
	 * @return true if the line at the given offset have been decorated, false otherwise.
	 */
	boolean containsDecorationLine(int offset, int length, boolean addingMode) {
		// try {
		// boolean containsDecorationLine = false;
		//
		// int selectionCursor = offset;
		// while (selectionCursor <= (offset + length)) {
		//
		// IRegion lineInformation = this.getLineInformationOfOffset(selectionCursor);
		// containsDecorationLine = this.serializer.isDecorationLine(lineInformation.getOffset());
		//
		// if (!addingMode
		// && this.getLineInformationOfOffset(selectionCursor + 1).getOffset() != lineInformation
		// .getOffset()) {
		// containsDecorationLine = containsDecorationLine
		// || this.serializer.isDecorationLine(this.getLineInformationOfOffset(
		// selectionCursor + 1).getOffset());
		// }
		// if (!addingMode
		// && this.getLineInformationOfOffset(selectionCursor - 1).getOffset() != lineInformation
		// .getOffset()) {
		// containsDecorationLine = containsDecorationLine
		// || this.serializer.isDecorationLine(this.getLineInformationOfOffset(
		// selectionCursor - 1).getOffset());
		// }
		//
		// if (lineInformation.getLength() > 0) {
		// selectionCursor += lineInformation.getLength();
		// } else {
		// selectionCursor += 1;
		// }
		// }
		// return containsDecorationLine;
		// } catch (BadLocationException e) {
		// return false;
		// }
		return false;
	}

	/**
	 * Returns the size of the decoration added by this document before the given Modeling Unit.
	 * 
	 * @param element
	 *            the modelingUnit to inspect
	 * @return the size of the decoration added by this document before the given Modeling Unit
	 */
	public int getModelingUnitPrefixDecorationSize(ModelingUnit element) {
		return MODELING_PREFIX_DECORATION.length() + this.serializer.getIndentationLevelForElement(element);
	}

	/**
	 * Returns the size of the decoration added by this document after the given Modeling Unit.
	 * 
	 * @param element
	 *            the modelingUnit to inspect
	 * @return the size of the decoration added by this document after the given Modeling Unit
	 */
	public int getModelingUnitSuffixDecorationSize(ModelingUnit element) {
		return MODELING_SUFFIX_DECORATION.length();
	}

}
