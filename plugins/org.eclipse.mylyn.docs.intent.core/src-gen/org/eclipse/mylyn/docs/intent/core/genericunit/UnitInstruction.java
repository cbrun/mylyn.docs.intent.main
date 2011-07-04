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
package org.eclipse.mylyn.docs.intent.core.genericunit;

import org.eclipse.mylyn.docs.intent.core.document.IntentGenericElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit Instruction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.genericunit.UnitInstruction#getUnit <em>Unit</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.genericunit.UnitInstruction#isLineBreak <em>Line Break</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mylyn.docs.intent.core.genericunit.GenericUnitPackage#getUnitInstruction()
 * @model abstract="true"
 * @generated
 */
public interface UnitInstruction extends IntentGenericElement {
	/**
	 * Returns the value of the '<em><b>Unit</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.mylyn.docs.intent.core.genericunit.GenericUnit#getInstructions <em>Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' container reference.
	 * @see #setUnit(GenericUnit)
	 * @see org.eclipse.mylyn.docs.intent.core.genericunit.GenericUnitPackage#getUnitInstruction_Unit()
	 * @see org.eclipse.mylyn.docs.intent.core.genericunit.GenericUnit#getInstructions
	 * @model opposite="instructions" transient="false"
	 * @generated
	 */
	GenericUnit getUnit();

	/**
	 * Sets the value of the '{@link org.eclipse.mylyn.docs.intent.core.genericunit.UnitInstruction#getUnit <em>Unit</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' container reference.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(GenericUnit value);

	/**
	 * Returns the value of the '<em><b>Line Break</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Break</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Break</em>' attribute.
	 * @see #setLineBreak(boolean)
	 * @see org.eclipse.mylyn.docs.intent.core.genericunit.GenericUnitPackage#getUnitInstruction_LineBreak()
	 * @model default="false"
	 * @generated
	 */
	boolean isLineBreak();

	/**
	 * Sets the value of the '{@link org.eclipse.mylyn.docs.intent.core.genericunit.UnitInstruction#isLineBreak <em>Line Break</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Break</em>' attribute.
	 * @see #isLineBreak()
	 * @generated
	 */
	void setLineBreak(boolean value);

} // UnitInstruction
