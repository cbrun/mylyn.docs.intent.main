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
package org.eclipse.mylyn.docs.intent.markup.resource;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.mylyn.docs.intent.markup.builder.ModelDocumentBuilder;
import org.eclipse.mylyn.docs.intent.markup.serializer.WikiTextResourceSerializer;
import org.eclipse.mylyn.wikitext.core.parser.MarkupParser;
import org.eclipse.mylyn.wikitext.textile.core.TextileLanguage;

/**
 * Implementation of a wikitextResource.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public class WikitextResourceImpl extends ResourceImpl {

	/**
	 * WikitextResource constructor.
	 * 
	 * @param uri
	 *            URI of the resource
	 */
	public WikitextResourceImpl(URI uri) {
		super(uri);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.ecore.resource.impl.ResourceImpl#doLoad(java.io.InputStream, java.util.Map)
	 */
	@Override
	protected void doLoad(InputStream inputStream, Map<?, ?> options) throws IOException {
		MarkupParser parser = new MarkupParser(new TextileLanguage());
		ModelDocumentBuilder builder = new ModelDocumentBuilder();
		parser.setBuilder(builder);
		parser.parse(new InputStreamReader(inputStream), true);

		Collection<EObject> roots = builder.getRoots();
		getContents().addAll(roots);

		// FIXME ONLY FOR DEBUG
		// OutputStream output = new FileOutputStream(new File("traces/"
		// + ((Text)((Section)((Document)getContents().get(0)).getContent().get(0)).getTitle()
		// .getContent().get(0)).getData())
		// + ".trace");
		// for (EObject root : roots) {
		// output.write(Logger.inspectAndLog(root, 0).getBytes());
		// }
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.ecore.resource.impl.ResourceImpl#doSave(java.io.OutputStream, java.util.Map)
	 */
	@Override
	protected void doSave(OutputStream outputStream, Map<?, ?> options) throws IOException {
		WikiTextResourceSerializer serializer = WikiTextResourceSerializer.getSerializer();
		String serializedFrom = serializer.serialize(this);
		outputStream.write(serializedFrom.getBytes());
	}

	/**
	 * Save the WikiText ressource with encoding options.
	 * 
	 * @param outputStreamWriter
	 *            writer to use
	 * @throws IOException
	 *             if the outputStream throws an IOException
	 */
	public void doSaveWithEncoding(OutputStreamWriter outputStreamWriter) throws IOException {
		WikiTextResourceSerializer serializer = WikiTextResourceSerializer.getSerializer();
		String serializedFrom = serializer.serialize(this);
		outputStreamWriter.write(serializedFrom);
		outputStreamWriter.close();
		/*
		 * Example of call : final OutputStream fileOutputStream = new FileOutputStream("generatedDataTests/"
		 * + fileToGenerate); final OutputStreamWriter fileWriter = new OutputStreamWriter(fileOutputStream,
		 * "UTF-8"); ((WikitextResourceImpl)resourceTextile).doSaveWithEncoding(fileWriter);
		 */
	}
}
