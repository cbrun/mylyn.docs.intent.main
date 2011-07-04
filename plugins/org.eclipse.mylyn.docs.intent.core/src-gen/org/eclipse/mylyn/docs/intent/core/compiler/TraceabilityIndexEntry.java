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

import java.math.BigInteger;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mylyn.docs.intent.core.document.IntentGenericElement;
import org.eclipse.mylyn.docs.intent.core.modelingunit.ResourceDeclaration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traceability Index Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.compiler.TraceabilityIndexEntry#getGeneratedResourcePath <em>Generated Resource Path</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.compiler.TraceabilityIndexEntry#getCompilationTime <em>Compilation Time</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.compiler.TraceabilityIndexEntry#getResourceDeclaration <em>Resource Declaration</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.compiler.TraceabilityIndexEntry#getContainedElementToInstructions <em>Contained Element To Instructions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mylyn.docs.intent.core.compiler.CompilerPackage#getTraceabilityIndexEntry()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface TraceabilityIndexEntry extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Generated Resource Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generated Resource Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Resource Path</em>' attribute.
	 * @see #setGeneratedResourcePath(String)
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.CompilerPackage#getTraceabilityIndexEntry_GeneratedResourcePath()
	 * @model required="true"
	 * @generated
	 */
	String getGeneratedResourcePath();

	/**
	 * Sets the value of the '{@link org.eclipse.mylyn.docs.intent.core.compiler.TraceabilityIndexEntry#getGeneratedResourcePath <em>Generated Resource Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generated Resource Path</em>' attribute.
	 * @see #getGeneratedResourcePath()
	 * @generated
	 */
	void setGeneratedResourcePath(String value);

	/**
	 * Returns the value of the '<em><b>Compilation Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compilation Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compilation Time</em>' attribute.
	 * @see #setCompilationTime(BigInteger)
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.CompilerPackage#getTraceabilityIndexEntry_CompilationTime()
	 * @model required="true"
	 * @generated
	 */
	BigInteger getCompilationTime();

	/**
	 * Sets the value of the '{@link org.eclipse.mylyn.docs.intent.core.compiler.TraceabilityIndexEntry#getCompilationTime <em>Compilation Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compilation Time</em>' attribute.
	 * @see #getCompilationTime()
	 * @generated
	 */
	void setCompilationTime(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Resource Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Declaration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Declaration</em>' reference.
	 * @see #setResourceDeclaration(ResourceDeclaration)
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.CompilerPackage#getTraceabilityIndexEntry_ResourceDeclaration()
	 * @model required="true"
	 * @generated
	 */
	ResourceDeclaration getResourceDeclaration();

	/**
	 * Sets the value of the '{@link org.eclipse.mylyn.docs.intent.core.compiler.TraceabilityIndexEntry#getResourceDeclaration <em>Resource Declaration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Declaration</em>' reference.
	 * @see #getResourceDeclaration()
	 * @generated
	 */
	void setResourceDeclaration(ResourceDeclaration value);

	/**
	 * Returns the value of the '<em><b>Contained Element To Instructions</b></em>' map.
	 * The key is of type {@link org.eclipse.emf.ecore.EObject},
	 * and the value is of type {@link org.eclipse.mylyn.docs.intent.core.document.IntentGenericElement},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Element To Instructions</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Element To Instructions</em>' map.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.CompilerPackage#getTraceabilityIndexEntry_ContainedElementToInstructions()
	 * @model mapType="org.eclipse.mylyn.docs.intent.core.compiler.CompiledElementToInstructionEntry<org.eclipse.emf.ecore.EObject, org.eclipse.mylyn.docs.intent.core.document.IntentGenericElement>"
	 * @generated
	 */
	EMap<EObject, IntentGenericElement> getContainedElementToInstructions();

} // TraceabilityIndexEntry
