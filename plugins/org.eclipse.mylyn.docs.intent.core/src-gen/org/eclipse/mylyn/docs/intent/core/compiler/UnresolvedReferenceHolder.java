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
package org.eclipse.mylyn.docs.intent.core.compiler;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.mylyn.docs.intent.core.genericunit.UnitInstruction;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Unresolved Reference Holder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.compiler.UnresolvedReferenceHolder#getTextualReference <em>Textual Reference</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.compiler.UnresolvedReferenceHolder#isContainmentReference <em>Containment Reference</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.compiler.UnresolvedReferenceHolder#getInstructionContainer <em>Instruction Container</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.compiler.UnresolvedReferenceHolder#getConcernedFeature <em>Concerned Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mylyn.docs.intent.core.compiler.CompilerPackage#getUnresolvedReferenceHolder()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface UnresolvedReferenceHolder extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Textual Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Textual Reference</em>' attribute isn't clear, there really should be more
	 * of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Textual Reference</em>' attribute.
	 * @see #setTextualReference(String)
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.CompilerPackage#getUnresolvedReferenceHolder_TextualReference()
	 * @model required="true"
	 * @generated
	 */
	String getTextualReference();

	/**
	 * Sets the value of the '{@link org.eclipse.mylyn.docs.intent.core.compiler.UnresolvedReferenceHolder#getTextualReference <em>Textual Reference</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Textual Reference</em>' attribute.
	 * @see #getTextualReference()
	 * @generated
	 */
	void setTextualReference(String value);

	/**
	 * Returns the value of the '<em><b>Containment Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containment Reference</em>' attribute isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containment Reference</em>' attribute.
	 * @see #setContainmentReference(boolean)
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.CompilerPackage#getUnresolvedReferenceHolder_ContainmentReference()
	 * @model required="true"
	 * @generated
	 */
	boolean isContainmentReference();

	/**
	 * Sets the value of the '{@link org.eclipse.mylyn.docs.intent.core.compiler.UnresolvedReferenceHolder#isContainmentReference <em>Containment Reference</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Containment Reference</em>' attribute.
	 * @see #isContainmentReference()
	 * @generated
	 */
	void setContainmentReference(boolean value);

	/**
	 * Returns the value of the '<em><b>Instruction Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instruction Container</em>' reference isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instruction Container</em>' reference.
	 * @see #setInstructionContainer(UnitInstruction)
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.CompilerPackage#getUnresolvedReferenceHolder_InstructionContainer()
	 * @model required="true"
	 * @generated
	 */
	UnitInstruction getInstructionContainer();

	/**
	 * Sets the value of the '{@link org.eclipse.mylyn.docs.intent.core.compiler.UnresolvedReferenceHolder#getInstructionContainer <em>Instruction Container</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instruction Container</em>' reference.
	 * @see #getInstructionContainer()
	 * @generated
	 */
	void setInstructionContainer(UnitInstruction value);

	/**
	 * Returns the value of the '<em><b>Concerned Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concerned Feature</em>' reference isn't clear, there really should be more
	 * of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concerned Feature</em>' reference.
	 * @see #setConcernedFeature(EStructuralFeature)
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.CompilerPackage#getUnresolvedReferenceHolder_ConcernedFeature()
	 * @model required="true"
	 * @generated
	 */
	EStructuralFeature getConcernedFeature();

	/**
	 * Sets the value of the '{@link org.eclipse.mylyn.docs.intent.core.compiler.UnresolvedReferenceHolder#getConcernedFeature <em>Concerned Feature</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concerned Feature</em>' reference.
	 * @see #getConcernedFeature()
	 * @generated
	 */
	void setConcernedFeature(EStructuralFeature value);

} // UnresolvedReferenceHolder
