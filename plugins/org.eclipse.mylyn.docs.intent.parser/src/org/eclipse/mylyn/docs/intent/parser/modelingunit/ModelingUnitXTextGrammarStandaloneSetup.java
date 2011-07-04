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
package org.eclipse.mylyn.docs.intent.parser.modelingunit;

import com.google.inject.Injector;

/**
 * Initialization support for running Xtext languages without equinox extension registry.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public class ModelingUnitXTextGrammarStandaloneSetup extends ModelingUnitXTextGrammarStandaloneSetupGenerated {

	/**
	 * Does the setup.
	 */
	public static void doSetup() {
		new ModelingUnitXTextGrammarStandaloneSetup().createInjectorAndDoEMFRegistration();
	}

	/**
	 * Same as do setup, but returns the created injector.
	 * 
	 * @return the created injector.
	 */
	public static Injector doSetupAndReturnInjector() {
		return new ModelingUnitXTextGrammarStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
