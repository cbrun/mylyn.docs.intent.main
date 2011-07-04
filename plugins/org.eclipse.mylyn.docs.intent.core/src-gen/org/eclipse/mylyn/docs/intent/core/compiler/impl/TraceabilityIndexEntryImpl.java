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
package org.eclipse.mylyn.docs.intent.core.compiler.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.mylyn.docs.intent.core.compiler.CompilerPackage;
import org.eclipse.mylyn.docs.intent.core.compiler.TraceabilityIndexEntry;
import org.eclipse.mylyn.docs.intent.core.document.IntentGenericElement;
import org.eclipse.mylyn.docs.intent.core.modelingunit.ResourceDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traceability Index Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.compiler.impl.TraceabilityIndexEntryImpl#getGeneratedResourcePath <em>Generated Resource Path</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.compiler.impl.TraceabilityIndexEntryImpl#getCompilationTime <em>Compilation Time</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.compiler.impl.TraceabilityIndexEntryImpl#getResourceDeclaration <em>Resource Declaration</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.compiler.impl.TraceabilityIndexEntryImpl#getContainedElementToInstructions <em>Contained Element To Instructions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TraceabilityIndexEntryImpl extends CDOObjectImpl implements TraceabilityIndexEntry {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TraceabilityIndexEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CompilerPackage.Literals.TRACEABILITY_INDEX_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGeneratedResourcePath() {
		return (String)eGet(CompilerPackage.Literals.TRACEABILITY_INDEX_ENTRY__GENERATED_RESOURCE_PATH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneratedResourcePath(String newGeneratedResourcePath) {
		eSet(CompilerPackage.Literals.TRACEABILITY_INDEX_ENTRY__GENERATED_RESOURCE_PATH,
				newGeneratedResourcePath);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getCompilationTime() {
		return (BigInteger)eGet(CompilerPackage.Literals.TRACEABILITY_INDEX_ENTRY__COMPILATION_TIME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompilationTime(BigInteger newCompilationTime) {
		eSet(CompilerPackage.Literals.TRACEABILITY_INDEX_ENTRY__COMPILATION_TIME, newCompilationTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceDeclaration getResourceDeclaration() {
		return (ResourceDeclaration)eGet(
				CompilerPackage.Literals.TRACEABILITY_INDEX_ENTRY__RESOURCE_DECLARATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceDeclaration(ResourceDeclaration newResourceDeclaration) {
		eSet(CompilerPackage.Literals.TRACEABILITY_INDEX_ENTRY__RESOURCE_DECLARATION, newResourceDeclaration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EMap<EObject, IntentGenericElement> getContainedElementToInstructions() {
		return (EMap<EObject, IntentGenericElement>)eGet(
				CompilerPackage.Literals.TRACEABILITY_INDEX_ENTRY__CONTAINED_ELEMENT_TO_INSTRUCTIONS, true);
	}

} //TraceabilityIndexEntryImpl
