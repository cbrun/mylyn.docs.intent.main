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

import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.acceleo.engine.generation.strategy.WorkspaceAwareStrategy;
import org.eclipse.acceleo.engine.generation.writers.AcceleoWorkspaceFileWriter;

public class GenDiagnoseStrategy extends WorkspaceAwareStrategy {

	@Override
	public void flushWriters(Map<String, Writer> preview) throws IOException {
		final Map<File, Writer> needsValidation = new HashMap<File, Writer>();
		for (Map.Entry<String, Writer> entry : preview.entrySet()) {
			final File targetFile = new File(entry.getKey());
			if (((AcceleoWorkspaceFileWriter) entry.getValue()).hasChanged()) {
				needsValidation.put(targetFile, entry.getValue());
			}
		}
		if (needsValidation.values().size() > 0)
			throw new RuntimeException("need regeneration:" + needsValidation);
	}
}
