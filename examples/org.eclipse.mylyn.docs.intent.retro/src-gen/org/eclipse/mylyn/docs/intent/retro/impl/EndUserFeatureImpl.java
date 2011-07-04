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

import org.eclipse.emf.ecore.EClass;

import org.eclipse.mylyn.docs.intent.retro.AcceptanceTest;
import org.eclipse.mylyn.docs.intent.retro.EndUserFeature;
import org.eclipse.mylyn.docs.intent.retro.Interaction;
import org.eclipse.mylyn.docs.intent.retro.RetroPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>End User Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mylyn.docs.intent.retro.impl.EndUserFeatureImpl#getIsTestedBy <em>Is Tested By</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.retro.impl.EndUserFeatureImpl#getAccessibleThrough <em>Accessible Through</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EndUserFeatureImpl extends FeatureImpl implements EndUserFeature {
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
	protected EndUserFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RetroPackage.Literals.END_USER_FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcceptanceTest getIsTestedBy() {
		return (AcceptanceTest)eGet(RetroPackage.Literals.END_USER_FEATURE__IS_TESTED_BY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsTestedBy(AcceptanceTest newIsTestedBy) {
		eSet(RetroPackage.Literals.END_USER_FEATURE__IS_TESTED_BY, newIsTestedBy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interaction getAccessibleThrough() {
		return (Interaction)eGet(RetroPackage.Literals.END_USER_FEATURE__ACCESSIBLE_THROUGH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessibleThrough(Interaction newAccessibleThrough) {
		eSet(RetroPackage.Literals.END_USER_FEATURE__ACCESSIBLE_THROUGH, newAccessibleThrough);
	}

} //EndUserFeatureImpl
