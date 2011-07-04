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
package org.eclipse.mylyn.docs.intent.core.compiler;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnit;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Compilation Status Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.compiler.CompilationStatusManager#getCompilationStatusList <em>Compilation Status List</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.compiler.CompilationStatusManager#getModelingUnitToStatusList <em>Modeling Unit To Status List</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mylyn.docs.intent.core.compiler.CompilerPackage#getCompilationStatusManager()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface CompilationStatusManager extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Compilation Status List</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mylyn.docs.intent.core.compiler.CompilationStatus}.
	 * <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Compilation Status List</em>' containment reference list isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compilation Status List</em>' reference list.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.CompilerPackage#getCompilationStatusManager_CompilationStatusList()
	 * @model
	 * @generated
	 */
	EList<CompilationStatus> getCompilationStatusList();

	/**
	 * Returns the value of the '<em><b>Modeling Unit To Status List</b></em>' map.
	 * The key is of type {@link org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnit},
	 * and the value is of type list of {@link org.eclipse.mylyn.docs.intent.core.compiler.CompilationStatus},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modeling Unit To Status List</em>' map isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modeling Unit To Status List</em>' map.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.CompilerPackage#getCompilationStatusManager_ModelingUnitToStatusList()
	 * @model mapType="org.eclipse.mylyn.docs.intent.core.compiler.ModelingUnitToStatusList<org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnit, org.eclipse.mylyn.docs.intent.core.compiler.CompilationStatus>"
	 * @generated
	 */
	EMap<ModelingUnit, EList<CompilationStatus>> getModelingUnitToStatusList();

} // CompilationStatusManager
