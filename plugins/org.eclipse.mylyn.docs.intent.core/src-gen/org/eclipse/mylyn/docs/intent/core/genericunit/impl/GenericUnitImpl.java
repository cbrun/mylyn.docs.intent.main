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
package org.eclipse.mylyn.docs.intent.core.genericunit.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.mylyn.docs.intent.core.document.impl.IntentGenericElementImpl;
import org.eclipse.mylyn.docs.intent.core.genericunit.GenericUnit;
import org.eclipse.mylyn.docs.intent.core.genericunit.GenericUnitPackage;
import org.eclipse.mylyn.docs.intent.core.genericunit.UnitInstruction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generic Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.genericunit.impl.GenericUnitImpl#getInstructions <em>Instructions</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.genericunit.impl.GenericUnitImpl#getUnitName <em>Unit Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class GenericUnitImpl extends IntentGenericElementImpl implements GenericUnit {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenericUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenericUnitPackage.Literals.GENERIC_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<UnitInstruction> getInstructions() {
		return (EList<UnitInstruction>)eGet(GenericUnitPackage.Literals.GENERIC_UNIT__INSTRUCTIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUnitName() {
		return (String)eGet(GenericUnitPackage.Literals.GENERIC_UNIT__UNIT_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnitName(String newUnitName) {
		eSet(GenericUnitPackage.Literals.GENERIC_UNIT__UNIT_NAME, newUnitName);
	}

} //GenericUnitImpl
