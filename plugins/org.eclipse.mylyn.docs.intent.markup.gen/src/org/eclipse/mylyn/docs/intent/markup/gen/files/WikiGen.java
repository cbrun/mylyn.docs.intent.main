/*******************************************************************************
 * Copyright (c) 2010, 2011 Obeo. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse
 * Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.mylyn.docs.intent.markup.gen.files;

import java.io.File;
import java.io.IOException;
import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.mylyn.docs.intent.markup.builder.operation.DocumentAggregator;
import org.eclipse.mylyn.docs.intent.markup.markup.Document;
import org.eclipse.mylyn.docs.intent.markup.markup.MarkupPackage;
import org.eclipse.mylyn.docs.intent.markup.resource.WikimediaResourceFactory;
import org.eclipse.mylyn.docs.intent.markup.wikigen.WikigenPackage;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
/**
 * A java standalone program to generate document from a wikimedia URL
 * @author <a href="mailto:cedric.brun@obeo.fr">Cedric Brun</a>
 *
 */
public class WikiGen {

	public static void main(String[] args) {
		try {
			if (args.length < 2) {
				System.out
						.println("Arguments not valid : {folder, uri1 uri2 ...}.");
			} else if (args.length >= 2) {
				
				Authenticator.setDefault(new Authenticator() {
					 protected PasswordAuthentication getPasswordAuthentication()
                     {
                         return new PasswordAuthentication( "login",
                                                            "password".toCharArray() );
                     }
				});
				
				
				ResourceSet set = new ResourceSetImpl();
				set.getResourceFactoryRegistry()
						.getExtensionToFactoryMap()
						.put(set.getResourceFactoryRegistry().DEFAULT_EXTENSION,
								new WikimediaResourceFactory());

				List<Document> docPassedByArg = getDocsToGenerate(args, set);
				Document docToGenerate = null;
				if (docPassedByArg.size() > 1) {
					/*
					 * we need to aggregate the documents
					 */
					DocumentAggregator merger = new DocumentAggregator(
							docPassedByArg);
					docToGenerate = merger.merge();
					Resource newRes = set.createResource(URI
							.createURI("http://wiki.eclipse.org/index"));
					newRes.getContents().add(docToGenerate);
				} else {
					docToGenerate = docPassedByArg.get(0);
				}
				File folder = new File(args[0]);
				List<String> arguments = new ArrayList<String>();
				for (int i = 2; i < args.length; i++) {
					arguments.add(args[i]);
				}
				Html generator = new Html(docToGenerate, folder, Lists.newArrayList()) {

					@Override
					public void registerResourceFactories(ResourceSet set) {
						super.registerResourceFactories(set);
						Resource.Factory.Registry.INSTANCE
								.getExtensionToFactoryMap()
								.put(set.getResourceFactoryRegistry().DEFAULT_EXTENSION,
										new WikimediaResourceFactory());
						set.getResourceFactoryRegistry()
								.getExtensionToFactoryMap()
								.put(set.getResourceFactoryRegistry().DEFAULT_EXTENSION,
										new WikimediaResourceFactory());
					}

					@Override
					public void registerPackages(ResourceSet resourceSet) {
						super.registerPackages(resourceSet);
						resourceSet.getPackageRegistry().put(
								MarkupPackage.eNS_URI, MarkupPackage.eINSTANCE);
						resourceSet.getPackageRegistry().put(
								WikigenPackage.eNS_URI, WikigenPackage.eINSTANCE);
					}
				};
				generator.doGenerate(new BasicMonitor.Printing(System.out));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static List<Document> getDocsToGenerate(String[] args,
			ResourceSet set) {
		List<Document> result = Lists.newArrayList();
		for (int i = 1; i < args.length; i++) {
			URI uri = URI.createURI(args[i]);
			System.out.println("Getting:" + uri);
			Resource res = set.getResource(uri, true);
			result.addAll(Lists.newArrayList(Iterables.filter(
					res.getContents(), Document.class)));

		}
		return result;
	}

}
