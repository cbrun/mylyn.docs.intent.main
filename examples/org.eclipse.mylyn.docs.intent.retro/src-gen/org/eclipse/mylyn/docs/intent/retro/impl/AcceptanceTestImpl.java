/**
 * Copyright (c) 2010, 2011 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * 	Obeo - initial API and implementation
 * 
 */
package org.eclipse.mylyn.docs.intent.retro.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import org.eclipse.mylyn.docs.intent.retro.AcceptanceTest;
import org.eclipse.mylyn.docs.intent.retro.EndUserFeature;
import org.eclipse.mylyn.docs.intent.retro.RetroPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Acceptance Test</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mylyn.docs.intent.retro.impl.AcceptanceTestImpl#getSwtBotClassName <em>Swt Bot Class Name</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.retro.impl.AcceptanceTestImpl#getIsTesting <em>Is Testing</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.retro.impl.AcceptanceTestImpl#getPackage <em>Package</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AcceptanceTestImpl extends CDOObjectImpl implements AcceptanceTest {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2010, 2011 Obeo.\r\nAll rights reserved. This program and the accompanying materials\r\nare made available under the terms of the Eclipse Public License v1.0\r\nwhich accompanies this distribution, and is available at\r\nhttp://www.eclipse.org/legal/epl-v10.html\r\n\r\nContributors:\r\n\tObeo - initial API and implementation\r\n";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AcceptanceTestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RetroPackage.Literals.ACCEPTANCE_TEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSwtBotClassName() {
		return (String)eGet(RetroPackage.Literals.ACCEPTANCE_TEST__SWT_BOT_CLASS_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwtBotClassName(String newSwtBotClassName) {
		eSet(RetroPackage.Literals.ACCEPTANCE_TEST__SWT_BOT_CLASS_NAME, newSwtBotClassName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<EndUserFeature> getIsTesting() {
		return (EList<EndUserFeature>)eGet(RetroPackage.Literals.ACCEPTANCE_TEST__IS_TESTING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPackage() {
		return (String)eGet(RetroPackage.Literals.ACCEPTANCE_TEST__PACKAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackage(String newPackage) {
		eSet(RetroPackage.Literals.ACCEPTANCE_TEST__PACKAGE, newPackage);
	}

} //AcceptanceTestImpl
