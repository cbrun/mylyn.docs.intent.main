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

import org.eclipse.mylyn.docs.intent.retro.API;
import org.eclipse.mylyn.docs.intent.retro.RetroPackage;
import org.eclipse.mylyn.docs.intent.retro.UnitTest;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unit Test</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mylyn.docs.intent.retro.impl.UnitTestImpl#getJunitClassQualifiedName <em>Junit Class Qualified Name</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.retro.impl.UnitTestImpl#getIsTesting <em>Is Testing</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnitTestImpl extends CDOObjectImpl implements UnitTest {
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
	protected UnitTestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RetroPackage.Literals.UNIT_TEST;
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
	public String getJunitClassQualifiedName() {
		return (String)eGet(RetroPackage.Literals.UNIT_TEST__JUNIT_CLASS_QUALIFIED_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJunitClassQualifiedName(String newJunitClassQualifiedName) {
		eSet(RetroPackage.Literals.UNIT_TEST__JUNIT_CLASS_QUALIFIED_NAME, newJunitClassQualifiedName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<API> getIsTesting() {
		return (EList<API>)eGet(RetroPackage.Literals.UNIT_TEST__IS_TESTING, true);
	}

} //UnitTestImpl
