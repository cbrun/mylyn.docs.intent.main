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

import org.eclipse.mylyn.docs.intent.core.document.IntentReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instruction Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnitInstructionReference#getReferencedElement <em>Referenced Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnitPackage#getModelingUnitInstructionReference()
 * @model
 * @generated
 */
public interface ModelingUnitInstructionReference extends IntentReference {
	/**
	 * Returns the value of the '<em><b>Referenced Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Element</em>' reference.
	 * @see #setReferencedElement(ModelingUnitInstruction)
	 * @see org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnitPackage#getModelingUnitInstructionReference_ReferencedElement()
	 * @model
	 * @generated
	 */
	ModelingUnitInstruction getReferencedElement();

	/**
	 * Sets the value of the '{@link org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnitInstructionReference#getReferencedElement <em>Referenced Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Element</em>' reference.
	 * @see #getReferencedElement()
	 * @generated
	 */
	void setReferencedElement(ModelingUnitInstruction value);

} // ModelingUnitInstructionReference
