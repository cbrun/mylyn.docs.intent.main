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

import org.eclipse.emf.common.util.EList;
import org.eclipse.mylyn.docs.intent.core.document.IntentGenericElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generic Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.genericunit.GenericUnit#getInstructions <em>Instructions</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.genericunit.GenericUnit#getUnitName <em>Unit Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mylyn.docs.intent.core.genericunit.GenericUnitPackage#getGenericUnit()
 * @model abstract="true"
 * @generated
 */
public interface GenericUnit extends IntentGenericElement {
	/**
	 * Returns the value of the '<em><b>Instructions</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mylyn.docs.intent.core.genericunit.UnitInstruction}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.mylyn.docs.intent.core.genericunit.UnitInstruction#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instructions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instructions</em>' containment reference list.
	 * @see org.eclipse.mylyn.docs.intent.core.genericunit.GenericUnitPackage#getGenericUnit_Instructions()
	 * @see org.eclipse.mylyn.docs.intent.core.genericunit.UnitInstruction#getUnit
	 * @model opposite="unit" containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<UnitInstruction> getInstructions();

	/**
	 * Returns the value of the '<em><b>Unit Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit Name</em>' attribute.
	 * @see #setUnitName(String)
	 * @see org.eclipse.mylyn.docs.intent.core.genericunit.GenericUnitPackage#getGenericUnit_UnitName()
	 * @model
	 * @generated
	 */
	String getUnitName();

	/**
	 * Sets the value of the '{@link org.eclipse.mylyn.docs.intent.core.genericunit.GenericUnit#getUnitName <em>Unit Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit Name</em>' attribute.
	 * @see #getUnitName()
	 * @generated
	 */
	void setUnitName(String value);

} // GenericUnit
