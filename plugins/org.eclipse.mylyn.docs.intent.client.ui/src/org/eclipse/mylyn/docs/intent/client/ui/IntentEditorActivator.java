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
package org.eclipse.mylyn.docs.intent.client.ui;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.internal.util.BundleUtility;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
@SuppressWarnings("restriction")
public class IntentEditorActivator extends AbstractUIPlugin {

	/**
	 * The plugin ID.
	 */
	public static final String PLUGIN_ID = "org.eclipse.mylyn.docs.intent.client.ui"; //$NON-NLS-1$

	/**
	 * The ReStrucured Models Editor ID.
	 */
	public static final String EDITOR_ID = "org.eclipse.mylyn.docs.intent.client.ui.IntentEditor";

	/**
	 * The shared instance of the plugin.
	 */
	private static IntentEditorActivator plugin;

	/**
	 * The images and icons related to this plugin.
	 */
	private Map<String, Image> imageMap = new HashMap<String, Image>();

	/**
	 * IntentEditorActivator constructor.
	 */
	public IntentEditorActivator() {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;

	}

	/**
	 * Returns the image at the given plug-in relative path ; if this image hasn't been loaded yet, load this
	 * image and add it to the imageMap.
	 * 
	 * @param path
	 *            path of the image to load (plug-in relative path)
	 * @return the image corresponding to the given path
	 */
	public Image getImage(String path) {
		Image result = imageMap.get(path);
		if (result == null) {
			ImageDescriptor descriptor = getImageDescriptor(path);
			if (descriptor != null) {
				result = descriptor.createImage();
				imageMap.put(path, result);
			}
		}
		return result;
	}

	/**
	 * Returns an image descriptor for the image file at the given plug-in relative path.
	 * 
	 * @param imagePath
	 *            path of the image to load (plug-in relative path)
	 * @return the image descriptor of the image corresponding to the given path
	 */
	private ImageDescriptor getImageDescriptor(String imagePath) {
		URL fullPathString = BundleUtility.find(getBundle(), imagePath);
		if (fullPathString == null) {
			try {
				fullPathString = new URL(imagePath);
			} catch (MalformedURLException e) {
				return null;
			}
		}
		return ImageDescriptor.createFromURL(fullPathString);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
		plugin = null;
		Iterator<Image> imageIterator = imageMap.values().iterator();
		while (imageIterator.hasNext()) {
			Image image = imageIterator.next();
			image.dispose();
		}
		imageMap.clear();
	}

	/**
	 * Returns the shared instance of this activator.
	 * 
	 * @return the shared instance of this activator
	 */
	public static IntentEditorActivator getDefault() {
		return plugin;
	}

}
