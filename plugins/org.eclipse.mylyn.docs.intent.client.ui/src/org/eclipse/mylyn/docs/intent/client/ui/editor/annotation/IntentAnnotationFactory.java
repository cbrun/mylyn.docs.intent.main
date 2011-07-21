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

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.text.source.Annotation;
import org.eclipse.mylyn.docs.intent.core.compiler.CompilationMessageType;
import org.eclipse.mylyn.docs.intent.core.compiler.CompilationStatus;
import org.eclipse.mylyn.docs.intent.core.compiler.SynchronizerCompilationStatus;

/**
 * Factory for creating Annotations used in the text editor.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public final class IntentAnnotationFactory {

	/**
	 * String that symbolizes the type of a compiler error.
	 */
	public static final String INTENT_ANNOT_COMPILER_ERROR = "org.eclipse.mylyn.docs.intent.client.ui.annotation.compiler.error";

	/**
	 * String that symbolizes the type of a compiler warning.
	 */
	public static final String INTENT_ANNOT_COMPILER_WARNING = "org.eclipse.mylyn.docs.intent.client.ui.annotation.compiler.warning";

	/**
	 * String that symbolizes the type of a general information.
	 */
	public static final String INTENT_ANNOT_GENERAL_INFO = "org.eclipse.mylyn.docs.intent.client.ui.annotation.info";

	/**
	 * String that symbolizes a syntax error.
	 */
	public static final String INTENT_ANNOT_SYNTAX_ERROR = "org.eclipse.mylyn.docs.intent.client.ui.annotation.syntaxerror";

	/**
	 * String that symbolizes a synchronization warning.
	 */
	public static final String INTENT_ANNOT_SYNC_WARNING = "org.eclipse.mylyn.docs.intent.client.ui.annotation.sync.warning";

	/**
	 * IntentAnnotationFactory constructor.
	 */
	private IntentAnnotationFactory() {

	}

	/**
	 * Creates an IntentAnnotation that can be used in a text Editor from the given CompilationStatus.
	 * 
	 * @param targetURI
	 *            additional URI that locates the Repository resource containing the annotation's target (can
	 *            be null)
	 * @param compilationStatus
	 *            the compilationStatus to use for creating the annotation
	 * @return an IntentAnnotation created from the given CompilationStatus
	 */
	public static Annotation createAnnotationFromCompilationStatus(URI targetURI,
			CompilationStatus compilationStatus) {
		IntentAnnotation annotation = new IntentAnnotation(true);

		// We determine the MessageType of the IntentAnnotation
		IntentAnnotationMessageType annotationMessageType = null;
		switch (compilationStatus.getSeverity()) {
			case ERROR:
				annotation.setType(INTENT_ANNOT_COMPILER_ERROR);
				annotationMessageType = IntentAnnotationMessageType.COMPILER_ERROR;
				break;
			case WARNING:
				if (compilationStatus.getType() == CompilationMessageType.SYNCHRONIZER_WARNING) {
					annotation.setType(INTENT_ANNOT_SYNC_WARNING);
					SynchronizerCompilationStatus syncStatus = (SynchronizerCompilationStatus)compilationStatus;
					Set<String> additionalInformations = new HashSet<String>();
					additionalInformations.add(syncStatus.getWorkingCopyResourceURI());
					if (targetURI != null) {
						additionalInformations.add(targetURI.toString());
					}
					annotation.setAdditionalInformations(additionalInformations);
					annotationMessageType = IntentAnnotationMessageType.SYNC_WARNING;
				} else {
					annotation.setType(INTENT_ANNOT_COMPILER_WARNING);
					annotationMessageType = IntentAnnotationMessageType.COMPILER_INFO;
				}
				break;
			default:
				annotation.setType(INTENT_ANNOT_GENERAL_INFO);
				annotationMessageType = IntentAnnotationMessageType.COMPILER_INFO;
				break;
		}
		annotation.setText(compilationStatus.getMessage());
		annotation.setMessageType(annotationMessageType);
		return annotation;
	}

	/**
	 * Creates a syntax error annotation.
	 * 
	 * @return a syntax error annotation
	 */
	public static IntentAnnotation createSyntaxErrorAnnotation() {
		IntentAnnotation annotation = new IntentAnnotation(true);
		annotation.setType(INTENT_ANNOT_SYNTAX_ERROR);
		annotation.setMessageType(IntentAnnotationMessageType.PARSER_ERROR);
		return annotation;
	}
}
