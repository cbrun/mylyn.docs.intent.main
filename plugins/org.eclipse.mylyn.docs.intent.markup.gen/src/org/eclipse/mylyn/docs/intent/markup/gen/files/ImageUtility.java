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
package org.eclipse.mylyn.docs.intent.markup.gen.files;

import org.eclipse.emf.common.util.URI;
import org.eclipse.mylyn.docs.intent.markup.markup.Image;
import org.eclipse.swt.graphics.ImageData;

/**
 * Service for Acceleo generator to get Image information.
 * 
 * @author <a href="mailto:cedric.brun@obeo.fr">Cedric Brun</a>
 */
public class ImageUtility {

	public String getImageWidth(Image imageDSL) {
		double ratio = getWidthRatio(imageDSL);
		return Double.valueOf(ratio).toString();
	}

	public Double getWidthRatio(Image imageDSL) {
		double textWidthResolution = 900d;
		ImageData data = getImageData(imageDSL);
		if (data != null) {
			double ratio = data.width / textWidthResolution;
			return ratio;
		}
		return 1d;
	}

	public Boolean hasLandscapeRatio(Image imageDSL) {
		return getWidthRatio(imageDSL) > 1;
	}

	public Boolean hasLongLandscapeRatio(Image imageDSL) {
		double widthRatio = getWidthRatio(imageDSL);
		return widthRatio > 1.3;
	}

	public Boolean isSmall(Image imageDSL) {
		ImageData data = getImageData(imageDSL);
		if (data != null) {
			return data.width <= 600;
		}
		return true;

	}

	private ImageData getImageData(Image imageDSL) {
		try {
			URI imageURI = URI.createURI(imageDSL.getUrl());
			String absoluteImagePath;
			if (imageURI.hasAbsolutePath()) {
				absoluteImagePath = imageURI.toString();
			} else {
				URI modelPath = imageDSL.eResource().getURI().trimSegments(1);
				absoluteImagePath = modelPath.toFileString() + "/"
						+ imageDSL.getUrl();
			}
			ImageData data = new ImageData(absoluteImagePath);
			return data;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
