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
import org.eclipse.mylyn.docs.intent.core.document.IntentGenericElement;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Compilation Status</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.compiler.CompilationStatus#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.compiler.CompilationStatus#getMessage <em>Message</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.compiler.CompilationStatus#getSeverity <em>Severity</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.compiler.CompilationStatus#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mylyn.docs.intent.core.compiler.CompilerPackage#getCompilationStatus()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface CompilationStatus extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(IntentGenericElement)
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.CompilerPackage#getCompilationStatus_Target()
	 * @model required="true"
	 * @generated
	 */
	IntentGenericElement getTarget();

	/**
	 * Sets the value of the '{@link org.eclipse.mylyn.docs.intent.core.compiler.CompilationStatus#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(IntentGenericElement value);

	/**
	 * Returns the value of the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' attribute.
	 * @see #setMessage(String)
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.CompilerPackage#getCompilationStatus_Message()
	 * @model required="true"
	 * @generated
	 */
	String getMessage();

	/**
	 * Sets the value of the '{@link org.eclipse.mylyn.docs.intent.core.compiler.CompilationStatus#getMessage <em>Message</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' attribute.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(String value);

	/**
	 * Returns the value of the '<em><b>Severity</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.mylyn.docs.intent.core.compiler.CompilationStatusSeverity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Severity</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Severity</em>' attribute.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.CompilationStatusSeverity
	 * @see #setSeverity(CompilationStatusSeverity)
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.CompilerPackage#getCompilationStatus_Severity()
	 * @model required="true"
	 * @generated
	 */
	CompilationStatusSeverity getSeverity();

	/**
	 * Sets the value of the '{@link org.eclipse.mylyn.docs.intent.core.compiler.CompilationStatus#getSeverity <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Severity</em>' attribute.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.CompilationStatusSeverity
	 * @see #getSeverity()
	 * @generated
	 */
	void setSeverity(CompilationStatusSeverity value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.mylyn.docs.intent.core.compiler.CompilationMessageType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.CompilationMessageType
	 * @see #setType(CompilationMessageType)
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.CompilerPackage#getCompilationStatus_Type()
	 * @model required="true"
	 * @generated
	 */
	CompilationMessageType getType();

	/**
	 * Sets the value of the '{@link org.eclipse.mylyn.docs.intent.core.compiler.CompilationStatus#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.CompilationMessageType
	 * @see #getType()
	 * @generated
	 */
	void setType(CompilationMessageType value);

} // CompilationStatus
