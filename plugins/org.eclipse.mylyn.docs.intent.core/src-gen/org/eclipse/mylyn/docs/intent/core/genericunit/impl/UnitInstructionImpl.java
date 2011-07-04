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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.mylyn.docs.intent.core.document.impl.IntentGenericElementImpl;
import org.eclipse.mylyn.docs.intent.core.genericunit.GenericUnit;
import org.eclipse.mylyn.docs.intent.core.genericunit.GenericUnitPackage;
import org.eclipse.mylyn.docs.intent.core.genericunit.UnitInstruction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unit Instruction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.genericunit.impl.UnitInstructionImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.genericunit.impl.UnitInstructionImpl#isLineBreak <em>Line Break</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class UnitInstructionImpl extends IntentGenericElementImpl implements UnitInstruction {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnitInstructionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenericUnitPackage.Literals.UNIT_INSTRUCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericUnit getUnit() {
		return (GenericUnit)eGet(GenericUnitPackage.Literals.UNIT_INSTRUCTION__UNIT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(GenericUnit newUnit) {
		eSet(GenericUnitPackage.Literals.UNIT_INSTRUCTION__UNIT, newUnit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLineBreak() {
		return (Boolean)eGet(GenericUnitPackage.Literals.UNIT_INSTRUCTION__LINE_BREAK, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineBreak(boolean newLineBreak) {
		eSet(GenericUnitPackage.Literals.UNIT_INSTRUCTION__LINE_BREAK, newLineBreak);
	}

} //UnitInstructionImpl
