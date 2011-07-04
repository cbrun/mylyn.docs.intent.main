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

import org.eclipse.acceleo.engine.generation.strategy.IAcceleoGenerationStrategy;

/**
 * Entry point of the 'LatexGenDocument' generation module.
 * 
 */
public class LatexGenDocumentDiagnose extends LatexGenDocument {

	private GenDiagnoseStrategy genDiagnoseStrategy = new GenDiagnoseStrategy();
	

	public IAcceleoGenerationStrategy getGenerationStrategy() {
		return genDiagnoseStrategy;
	}

}
