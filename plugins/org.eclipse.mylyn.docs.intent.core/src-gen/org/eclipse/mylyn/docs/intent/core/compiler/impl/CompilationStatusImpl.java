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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.mylyn.docs.intent.core.compiler.CompilationMessageType;
import org.eclipse.mylyn.docs.intent.core.compiler.CompilationStatus;
import org.eclipse.mylyn.docs.intent.core.compiler.CompilationStatusSeverity;
import org.eclipse.mylyn.docs.intent.core.compiler.CompilerPackage;
import org.eclipse.mylyn.docs.intent.core.document.IntentGenericElement;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Compilation Status</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilationStatusImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilationStatusImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilationStatusImpl#getSeverity <em>Severity</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilationStatusImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompilationStatusImpl extends CDOObjectImpl implements CompilationStatus {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected CompilationStatusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CompilerPackage.Literals.COMPILATION_STATUS;
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
	public IntentGenericElement getTarget() {
		return (IntentGenericElement)eGet(CompilerPackage.Literals.COMPILATION_STATUS__TARGET, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(IntentGenericElement newTarget) {
		eSet(CompilerPackage.Literals.COMPILATION_STATUS__TARGET, newTarget);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getMessage() {
		return (String)eGet(CompilerPackage.Literals.COMPILATION_STATUS__MESSAGE, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessage(String newMessage) {
		eSet(CompilerPackage.Literals.COMPILATION_STATUS__MESSAGE, newMessage);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public CompilationStatusSeverity getSeverity() {
		return (CompilationStatusSeverity)eGet(CompilerPackage.Literals.COMPILATION_STATUS__SEVERITY, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeverity(CompilationStatusSeverity newSeverity) {
		eSet(CompilerPackage.Literals.COMPILATION_STATUS__SEVERITY, newSeverity);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public CompilationMessageType getType() {
		return (CompilationMessageType)eGet(CompilerPackage.Literals.COMPILATION_STATUS__TYPE, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(CompilationMessageType newType) {
		eSet(CompilerPackage.Literals.COMPILATION_STATUS__TYPE, newType);
	}

} // CompilationStatusImpl
