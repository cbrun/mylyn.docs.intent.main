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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a create method for each non-abstract
 * class of the model. <!-- end-user-doc -->
 * @see org.eclipse.mylyn.docs.intent.core.compiler.CompilerPackage
 * @generated
 */
public interface CompilerFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	CompilerFactory eINSTANCE = org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilerFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>String To EObject Map</em>'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return a new object of class '<em>String To EObject Map</em>'.
	 * @generated
	 */
	StringToEObjectMap createStringToEObjectMap();

	/**
	 * Returns a new object of class '<em>Unresolved Reference Holder</em>'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return a new object of class '<em>Unresolved Reference Holder</em>'.
	 * @generated
	 */
	UnresolvedReferenceHolder createUnresolvedReferenceHolder();

	/**
	 * Returns a new object of class '<em>Compilation Status</em>'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return a new object of class '<em>Compilation Status</em>'.
	 * @generated
	 */
	CompilationStatus createCompilationStatus();

	/**
	 * Returns a new object of class '<em>Compilation Status Manager</em>'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return a new object of class '<em>Compilation Status Manager</em>'.
	 * @generated
	 */
	CompilationStatusManager createCompilationStatusManager();

	/**
	 * Returns a new object of class '<em>Compilation Information Holder</em>'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return a new object of class '<em>Compilation Information Holder</em>'.
	 * @generated
	 */
	CompilationInformationHolder createCompilationInformationHolder();

	/**
	 * Returns a new object of class '<em>Unresolved Contribution Holder</em>'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return a new object of class '<em>Unresolved Contribution Holder</em>'.
	 * @generated
	 */
	UnresolvedContributionHolder createUnresolvedContributionHolder();

	/**
	 * Returns a new object of class '<em>Traceability Index</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traceability Index</em>'.
	 * @generated
	 */
	TraceabilityIndex createTraceabilityIndex();

	/**
	 * Returns a new object of class '<em>Traceability Index Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traceability Index Entry</em>'.
	 * @generated
	 */
	TraceabilityIndexEntry createTraceabilityIndexEntry();

	/**
	 * Returns a new object of class '<em>Synchronizer Compilation Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Synchronizer Compilation Status</em>'.
	 * @generated
	 */
	SynchronizerCompilationStatus createSynchronizerCompilationStatus();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CompilerPackage getCompilerPackage();

} // CompilerFactory
