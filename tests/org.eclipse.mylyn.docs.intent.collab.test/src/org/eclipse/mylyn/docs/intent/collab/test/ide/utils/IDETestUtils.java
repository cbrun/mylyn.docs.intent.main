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
package org.eclipse.mylyn.docs.intent.collab.test.ide.utils;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;

/**
 * Utility class providing facilities for Workspace manipulation.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public final class IDETestUtils {

	/**
	 * IDETestUtils constructor.
	 */
	private IDETestUtils() {

	}

	/**
	 * Creates a new Project of the given name in the current workspace.
	 * 
	 * @param projectName
	 *            the name of the project to create
	 * @return the created Project
	 * @throws CoreException
	 *             if the project cannot be created
	 */
	public static IProject createNewProjet(String projectName) throws CoreException {
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IWorkspaceRoot root = workspace.getRoot();
		IProject project = root.getProject(projectName);
		// at this point, no resources have been created
		if (!project.exists()) {
			project.create(null);
		}
		return project;
	}

	/**
	 * Returns the absolute path of the file located at the given workspace relative path.
	 * 
	 * @param workspaceRelativePath
	 *            the location of the file (from the workspace root)
	 * @return the absolute path of the file located at the given workspace relative path
	 */
	public static String getAbsolutePath(String workspaceRelativePath) {
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IWorkspaceRoot root = workspace.getRoot();
		String workspaceRootURI = root.getLocationURI().toString();
		workspaceRootURI = workspaceRootURI.replace("file:\\", "").replace("file:/", "");
		return workspaceRootURI + workspaceRelativePath;

	}

	/**
	 * Returns the IFile located at the given path (from the root of the workspace).
	 * 
	 * @param workspaceRelativePath
	 *            the location of the file (from the workspace root)
	 * @return the IFile located at the given path
	 */
	public static IFile getIFile(String workspaceRelativePath) {
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IWorkspaceRoot root = workspace.getRoot();
		IPath path = new Path(workspaceRelativePath);
		IFile file = root.getFile(path);
		return file;
	}

	/**
	 * Returns the content of the given iFile as a String.
	 * 
	 * @param iFile
	 *            the iFile to read
	 * @return the content of the given iFile (as a String)
	 * @throws IOException
	 *             if any I/O exception occurred
	 */
	public static String getIFileContent(IFile iFile) throws IOException {
		try {
			StringBuilder buffer = new StringBuilder();
			BufferedReader bufferedReader = null;
			try {
				InputStream inputStream = iFile.getContents();
				Reader reader = new InputStreamReader(inputStream);
				bufferedReader = new BufferedReader(reader);
				String line = bufferedReader.readLine();
				while (line != null) {
					buffer.append(line);
					line = bufferedReader.readLine();
				}
			} finally {
				if (bufferedReader != null) {
					bufferedReader.close();
				}
			}
			return buffer.toString();
		} catch (CoreException e) {
			throw new IOException(e.getMessage());
		}
	}

	/**
	 * Sets the given content to the given iFile.
	 * 
	 * @param iFileToModify
	 *            the iFile to modify
	 * @param newContent
	 *            the content to set to the given iFile
	 * @throws IOException
	 *             if any I/O exception occurred
	 */
	public static void setIFileContent(IFile iFileToModify, String newContent) throws IOException {

		byte[] bytes = newContent.getBytes();
		InputStream inputStream = new ByteArrayInputStream(bytes);
		IProgressMonitor progressMonitor = new NullProgressMonitor();
		try {
			iFileToModify.setContents(inputStream, true, false, progressMonitor);
		} catch (CoreException e) {
			throw new IOException(e.getMessage());
		}
	}
}
