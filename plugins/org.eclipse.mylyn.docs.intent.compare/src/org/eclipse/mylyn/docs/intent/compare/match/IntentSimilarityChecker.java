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

import org.eclipse.emf.compare.FactoryException;
import org.eclipse.emf.compare.match.statistic.MetamodelFilter;
import org.eclipse.emf.ecore.EObject;

/**
 * Similarity checker using the Intent semantics to compare two Intent elements.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public class IntentSimilarityChecker extends StatisticBasedSimilarityChecker {

	/**
	 * Value taht represents a very strong similarity.
	 */
	private static final double MAX_SIMILARITY = 0.9999;

	private EObject localRoot;

	private EObject repositoryRoot;

	/**
	 * IntentSimilarityChecker constructor.
	 * 
	 * @param localRoot
	 *            the root of the local AST of a Intent Element.
	 * @param repositoryRoot
	 *            the root of the repository AST for a Intent Element
	 * @param metamodelFilter
	 *            a metamodel filter the checker can use to know whether a feature alwaas has the same value
	 *            or not in the models.
	 * @param bridge
	 *            utility class to keep API compatibility.
	 */
	public IntentSimilarityChecker(MetamodelFilter metamodelFilter,
			AbstractGenericMatchEngineToCheckerBridge bridge, EObject localRoot, EObject repositoryRoot) {
		super(metamodelFilter, bridge);
		this.localRoot = localRoot;
		this.repositoryRoot = repositoryRoot;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.compare.match.StatisticBasedSimilarityChecker#isSimilar(org.eclipse.emf.ecore.EObject,
	 *      org.eclipse.emf.ecore.EObject)
	 */
	@Override
	public boolean isSimilar(EObject obj1, EObject obj2) throws FactoryException {
		// If the two objects are the roots, we consider that they are similar in any circumstance
		if (areRoots(obj1, obj2)) {
			return true;
		}
		return super.isSimilar(obj1, obj2);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.compare.match.engine.AbstractSimilarityChecker#fastLookup(org.eclipse.emf.ecore.EObject)
	 */
	@Override
	public EObject fastLookup(EObject obj1) {
		if (obj1 == localRoot) {
			return repositoryRoot;
		}
		return super.fastLookup(obj1);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.client.ui.editor.merger.match.StatisticBasedSimilarityChecker#absoluteMetric(org.eclipse.emf.ecore.EObject,
	 *      org.eclipse.emf.ecore.EObject)
	 */
	@Override
	public double absoluteMetric(EObject obj1, EObject obj2) throws FactoryException {
		// If the two objects are the roots, we consider that they are similar in any circumstance
		if (areRoots(obj1, obj2)) {
			return MAX_SIMILARITY;
		}
		return super.absoluteMetric(obj1, obj2);
	}

	/**
	 * Indicates if the two given objects represent the roots of the compared element.
	 * 
	 * @param obj1
	 *            the first element to determine if it's a root
	 * @param obj2
	 *            the second element to determine if it's a root
	 * @return true if the two given objects represent the roots of the compared element, false otherwise
	 */
	private boolean areRoots(EObject obj1, EObject obj2) {
		return (obj1 == localRoot) && (obj2 == repositoryRoot);
	}

}
