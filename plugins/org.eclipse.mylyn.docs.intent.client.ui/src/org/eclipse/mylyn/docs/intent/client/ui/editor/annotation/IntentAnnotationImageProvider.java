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

import java.util.HashMap;
import java.util.Map;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.text.source.Annotation;
import org.eclipse.mylyn.docs.intent.client.ui.IntentEditorActivator;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.texteditor.IAnnotationImageProvider;

/**
 * Provides icon for the annotations related to Intent document.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public class IntentAnnotationImageProvider implements IAnnotationImageProvider {

	private static String annotationImageFolderPath = "icon/annotation/";

	private Map<IntentAnnotationMessageType, String> annotationTypeToImagePath;

	private String defaultPath;

	/**
	 * IntentAnnotationImageProvider constructor.
	 */
	public IntentAnnotationImageProvider() {

		defaultPath = annotationImageFolderPath + "compiler-info.gif";

		annotationTypeToImagePath = new HashMap<IntentAnnotationMessageType, String>();

		annotationTypeToImagePath.put(IntentAnnotationMessageType.COMPILER_ERROR, annotationImageFolderPath
				+ "compiler-error.gif");
		annotationTypeToImagePath.put(IntentAnnotationMessageType.COMPILER_WARNING, annotationImageFolderPath
				+ "compiler-warning.gif");
		annotationTypeToImagePath.put(IntentAnnotationMessageType.COMPILER_INFO, annotationImageFolderPath
				+ "compiler-info.gif");
		annotationTypeToImagePath.put(IntentAnnotationMessageType.PARSER_ERROR, annotationImageFolderPath
				+ "syntaxerror.gif");
		annotationTypeToImagePath.put(IntentAnnotationMessageType.SYNC_WARNING, annotationImageFolderPath
				+ "sync-warning.gif");

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.ui.texteditor.IAnnotationImageProvider#getManagedImage(org.eclipse.jface.text.source.Annotation)
	 */
	public Image getManagedImage(Annotation annotation) {
		String imagePath = defaultPath;
		if (annotation instanceof IntentAnnotation) {
			imagePath = annotationTypeToImagePath.get(((IntentAnnotation)annotation).getMessageType());
		}
		return IntentEditorActivator.getDefault().getImage(imagePath);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.ui.texteditor.IAnnotationImageProvider#getImageDescriptorId(org.eclipse.jface.text.source.Annotation)
	 */
	public String getImageDescriptorId(Annotation annotation) {

		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.ui.texteditor.IAnnotationImageProvider#getImageDescriptor(java.lang.String)
	 */
	public ImageDescriptor getImageDescriptor(String imageDescritporId) {
		return null;
	}
}
