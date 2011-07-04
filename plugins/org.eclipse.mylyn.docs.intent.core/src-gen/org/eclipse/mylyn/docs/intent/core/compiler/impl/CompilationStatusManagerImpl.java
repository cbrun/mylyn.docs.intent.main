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
package org.eclipse.mylyn.docs.intent.core.compiler.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.mylyn.docs.intent.core.compiler.CompilationStatus;
import org.eclipse.mylyn.docs.intent.core.compiler.CompilationStatusManager;
import org.eclipse.mylyn.docs.intent.core.compiler.CompilerPackage;
import org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnit;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Compilation Status Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilationStatusManagerImpl#getCompilationStatusList <em>Compilation Status List</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilationStatusManagerImpl#getModelingUnitToStatusList <em>Modeling Unit To Status List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompilationStatusManagerImpl extends CDOObjectImpl implements CompilationStatusManager {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected CompilationStatusManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CompilerPackage.Literals.COMPILATION_STATUS_MANAGER;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<CompilationStatus> getCompilationStatusList() {
		return (EList<CompilationStatus>)eGet(
				CompilerPackage.Literals.COMPILATION_STATUS_MANAGER__COMPILATION_STATUS_LIST, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EMap<ModelingUnit, EList<CompilationStatus>> getModelingUnitToStatusList() {
		return (EMap<ModelingUnit, EList<CompilationStatus>>)eGet(
				CompilerPackage.Literals.COMPILATION_STATUS_MANAGER__MODELING_UNIT_TO_STATUS_LIST, true);
	}

} // CompilationStatusManagerImpl
