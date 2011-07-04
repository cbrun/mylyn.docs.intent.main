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
package org.eclipse.mylyn.docs.intent.core.modelingunit;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contribution Instruction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.modelingunit.ContributionInstruction#getReferencedElement <em>Referenced Element</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.modelingunit.ContributionInstruction#getContributions <em>Contributions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnitPackage#getContributionInstruction()
 * @model
 * @generated
 */
public interface ContributionInstruction extends ModelingUnitInstruction {
	/**
	 * Returns the value of the '<em><b>Referenced Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Element</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Element</em>' containment reference.
	 * @see #setReferencedElement(ModelingUnitInstructionReference)
	 * @see org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnitPackage#getContributionInstruction_ReferencedElement()
	 * @model containment="true" resolveProxies="true" required="true"
	 * @generated
	 */
	ModelingUnitInstructionReference getReferencedElement();

	/**
	 * Sets the value of the '{@link org.eclipse.mylyn.docs.intent.core.modelingunit.ContributionInstruction#getReferencedElement <em>Referenced Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Element</em>' containment reference.
	 * @see #getReferencedElement()
	 * @generated
	 */
	void setReferencedElement(ModelingUnitInstructionReference value);

	/**
	 * Returns the value of the '<em><b>Contributions</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnitInstruction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contributions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contributions</em>' containment reference list.
	 * @see org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnitPackage#getContributionInstruction_Contributions()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<ModelingUnitInstruction> getContributions();

} // ContributionInstruction
