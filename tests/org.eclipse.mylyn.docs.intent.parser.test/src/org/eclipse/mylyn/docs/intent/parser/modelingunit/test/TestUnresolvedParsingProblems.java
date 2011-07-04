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
package org.eclipse.mylyn.docs.intent.parser.modelingunit.test;

import org.junit.Test;

/**
 * Points the different parsing issues that haven't been corrected yet.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public class TestUnresolvedParsingProblems {

	/**
	 * Single-affectation instructions on multi-valued attributes (like myAtt1 += "A") aren't serialized
	 * correctly. It should be corrected when we would be able to resolve the reference to the metaType of
	 * these attributes.
	 */
	@Test
	public void testMultiValuedFeatures() {
		// Operator += : meta-Type needed !
		TestModelingUnitSerialization.parseAndCompareSerializationToExpected(
				"unresolvedIssues/multivaluedFeatures", true);
	}
}
