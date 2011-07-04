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
package org.eclipse.mylyn.docs.intent.compare.match;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.compare.FactoryException;
import org.eclipse.emf.compare.match.engine.AbstractSimilarityChecker;
import org.eclipse.emf.compare.match.engine.GenericMatchEngine;
import org.eclipse.emf.compare.match.internal.statistic.NameSimilarity;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.mylyn.docs.intent.core.document.IntentDocumentPackage;
import org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnitPackage;

/**
 * Match Engine for Intent element.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
@SuppressWarnings("restriction")
public class IntentMatchEngine extends GenericMatchEngine {

	/**
	 * The root of the local AST of a Intent Element.
	 */
	private final EObject localRoot;

	/**
	 * The root of the repository AST for a Intent Element.
	 */
	private final EObject repositoryRoot;

	/**
	 * IntentMatchEngineconstructor.
	 * 
	 * @param localRoot
	 *            the root of the local AST of a Intent Element.
	 * @param repositoryRoot
	 *            the root of the repository AST for a Intent Element
	 */
	public IntentMatchEngine(EObject localRoot, EObject repositoryRoot) {
		this.localRoot = localRoot;
		this.repositoryRoot = repositoryRoot;

		// We use or own metamodel filer
		this.filter = new IntentElementFilter();

		// We define the list of features to ignore : basically all the resolved References.
		List<EStructuralFeature> featuresToIgnoreList = new ArrayList<EStructuralFeature>();
		featuresToIgnoreList.add(IntentDocumentPackage.eINSTANCE
				.getIntentSectionOrParagraphReference_ReferencedObject());
		featuresToIgnoreList.add(IntentDocumentPackage.eINSTANCE.getIntentSectionReference_ReferencedElement());
		featuresToIgnoreList
				.add(ModelingUnitPackage.eINSTANCE.getContributionInstruction_ReferencedElement());

		featuresToIgnoreList.add(ModelingUnitPackage.eINSTANCE
				.getModelingUnitInstructionReference_ReferencedElement());
		featuresToIgnoreList.add(ModelingUnitPackage.eINSTANCE.getResourceReference_ReferencedElement());
		featuresToIgnoreList.add(IntentDocumentPackage.eINSTANCE.getIntentGenericElement_CompilationStatus());
		featuresToIgnoreList.add(IntentDocumentPackage.eINSTANCE.getIntentStructuredElement_FormattedTitle());
		
		((IntentElementFilter)filter).defineFeaturesToIgnore(featuresToIgnoreList);

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.compare.match.engine.GenericMatchEngine#prepareChecker()
	 */
	@Override
	protected AbstractSimilarityChecker prepareChecker() {
		final IntentMatchEngine engine = this;
		AbstractGenericMatchEngineToCheckerBridge bridge = new AbstractGenericMatchEngineToCheckerBridge() {

			@Override
			public double nameSimilarity(EObject obj1, EObject obj2) {
				return engine.nameSimilarity(obj1, obj2);
			}

			@Override
			public double contentSimilarity(EObject obj1, EObject obj2) throws FactoryException {
				return engine.contentSimilarity(obj1, obj2);
			}
		};
		return new IntentSimilarityChecker(filter, bridge, localRoot, repositoryRoot);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	@Deprecated
	protected double nameSimilarity(EObject obj1, EObject obj2) {
		double similarity = 0d;

		try {

			similarity = NameSimilarity.nameSimilarityMetric(NameSimilarity.findName(obj1),
					NameSimilarity.findName(obj2));
		} catch (final FactoryException e) {
			// fails silently, will return a similarity of 0d
		}

		return similarity;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	@Deprecated
	protected double contentSimilarity(EObject obj1, EObject obj2) throws FactoryException {
		double similarity = 0d;
		similarity = NameSimilarity.nameSimilarityMetric(NameSimilarity.contentValue(obj1),
				NameSimilarity.contentValue(obj2));
		return similarity;
	}

}
