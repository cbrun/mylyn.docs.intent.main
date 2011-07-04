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
package org.eclipse.mylyn.docs.intent.collab.common.location;

/**
 * Indicates the defaults path for structuring a Intent Repository.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public interface IntentLocations {

	/**
	 * Path indicating the location of the general index.
	 */
	String GENERAL_INDEX_PATH = "/IntentIndex";

	// -------------------------------------------------------
	// ------------- INTENT DOCUMENT INFORMATIONS

	/**
	 * Path indicating the location of the Intent folder, containing all the element allowing to
	 * describe a document (IntentDocument, IntentChapter, IntentSection, ModelingUnit, DescriptionUnit).
	 */
	String INTENT_FOLDER = "/INTENT/";

	/**
	 * Path indicating the location of the Intent root (IntentDocument).
	 */
	String INTENT_INDEX = INTENT_FOLDER + "IntentDocument";

	// -------------------------------------------------------
	// ------------- COMPILATION INFORMATIONS
	/**
	 * Path indicating the location of all generated (compiled) models.
	 */
	String GENERATED_RESOURCES_FOLDER_PATH = "/COMPILATION/GENERATED/";

	/**
	 * Path indicating the location of the folder containing all compilation status.
	 */
	String COMPILATION_STATUS_FOLDER_PATH = "/COMPILATION/STATUS/";

	/**
	 * Path indicating the location of the status index.
	 */
	String COMPILATION_STATUS_INDEX_PATH = COMPILATION_STATUS_FOLDER_PATH + "StatusIndex";

	/**
	 * Path indicating the folder containing all the traceability informations.
	 */
	String TRACEABILITY_INFOS_FOLDER_PATH = "/COMPILATION/TRACES/";

	/**
	 * Path indicating the location of the traceability index.
	 */
	String TRACEABILITY_INFOS_INDEX_PATH = TRACEABILITY_INFOS_FOLDER_PATH + "TraceabilityIndex";

	// -------------------------------------------------------
	// ------------- INDEXES LIST
	/**
	 * Represents all the indexes of a Intent Repository.
	 */
	String[] INDEXES_LIST = {GENERAL_INDEX_PATH, INTENT_INDEX, TRACEABILITY_INFOS_INDEX_PATH,
			COMPILATION_STATUS_INDEX_PATH,
	};
}
