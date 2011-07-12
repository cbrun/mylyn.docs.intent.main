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
package org.eclipse.mylyn.docs.intent.client.ui.editor.configuration;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.text.presentation.IPresentationReconciler;
import org.eclipse.jface.text.presentation.PresentationReconciler;
import org.eclipse.jface.text.quickassist.IQuickAssistAssistant;
import org.eclipse.jface.text.rules.DefaultDamagerRepairer;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.mylyn.docs.intent.client.ui.editor.IntentEditor;
import org.eclipse.mylyn.docs.intent.client.ui.editor.quickfix.IntentQuickAssistant;
import org.eclipse.mylyn.docs.intent.client.ui.editor.scanner.AbstractIntentScanner;
import org.eclipse.ui.editors.text.TextSourceViewerConfiguration;

/**
 * This class bundles the configuration space of an Intent editor. <br/>
 * Base on the IntentConfiguration :
 * 
 * @author <a href="mailto:jonathan.musset@obeo.fr">Jonathan Musset</a> <br/>
 *         contributed by @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public class IntentEditorConfiguration extends TextSourceViewerConfiguration {

	/**
	 * The delay after which the content assistant is automatically invoked if the cursor is behind an auto
	 * activation character.
	 */
	// private static final int COMPLETION_AUTO_ACTIVATION_DELAY = 1000;

	/**
	 * The editor.
	 */
	protected IntentEditor editor;

	/**
	 * The scanners of the source configuration.
	 */
	private AbstractIntentScanner[] scanners;

	/**
	 * Constructor.
	 * 
	 * @param editor
	 *            is the source editor
	 * @param preferenceStore
	 *            The preference store, can be read-only.
	 */
	public IntentEditorConfiguration(IntentEditor editor, IPreferenceStore preferenceStore) {
		this.editor = editor;
		this.fPreferenceStore = preferenceStore;
	}

	/**
	 * Gets the scanners of the source configuration.
	 * 
	 * @return the scanners
	 */
	protected AbstractIntentScanner[] getScanners() {
		if (scanners == null) {
			List<AbstractIntentScanner> list = new ArrayList<AbstractIntentScanner>();
//			list.add(new IntentModelingUnitScanner(editor.getColorManager()));
//			list.add(new IntentDescriptionUnitScanner(editor.getColorManager()));
//			list.add(new IntentStructuredElementScanner(editor.getColorManager()));
//			list.add(new IntentTitleScanner(editor.getColorManager()));
			scanners = list.toArray(new AbstractIntentScanner[list.size()]);
		}
		return scanners;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.text.source.SourceViewerConfiguration#getConfiguredContentTypes(org.eclipse.jface.text.source.ISourceViewer)
	 */
	@Override
	public String[] getConfiguredContentTypes(ISourceViewer sourceViewer) {
		AbstractIntentScanner[] usedScanners = getScanners();
		String[] result = new String[usedScanners.length];
		for (int i = 0; i < usedScanners.length; i++) {
			AbstractIntentScanner scanner = usedScanners[i];
			result[i] = scanner.getConfiguredContentType();
		}
		return result;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.text.source.SourceViewerConfiguration#getPresentationReconciler(org.eclipse.jface.text.source.ISourceViewer)
	 */
	@Override
	public IPresentationReconciler getPresentationReconciler(ISourceViewer sourceViewer) {
		PresentationReconciler reconciler = new PresentationReconciler();
		AbstractIntentScanner[] usedScanners = getScanners();
		for (int i = 0; i < usedScanners.length; i++) {
			AbstractIntentScanner scanner = usedScanners[i];
			DefaultDamagerRepairer dr = new DefaultDamagerRepairer(scanner);
			reconciler.setDamager(dr, scanner.getConfiguredContentType());
			reconciler.setRepairer(dr, scanner.getConfiguredContentType());
		}
		return reconciler;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.ui.editors.text.TextSourceViewerConfiguration#getQuickAssistAssistant(org.eclipse.jface.text.source.ISourceViewer)
	 */
	@Override
	public IQuickAssistAssistant getQuickAssistAssistant(ISourceViewer sourceViewer) {
		// We create an IntentQuickAssistant
		return new IntentQuickAssistant();
	}
}
