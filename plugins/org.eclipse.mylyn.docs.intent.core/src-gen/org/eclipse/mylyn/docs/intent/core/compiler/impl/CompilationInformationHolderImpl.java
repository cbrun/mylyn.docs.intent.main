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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.mylyn.docs.intent.core.compiler.CompilationInformationHolder;
import org.eclipse.mylyn.docs.intent.core.compiler.CompilerPackage;
import org.eclipse.mylyn.docs.intent.core.compiler.StringToEObjectMap;
import org.eclipse.mylyn.docs.intent.core.compiler.UnresolvedContributionHolder;
import org.eclipse.mylyn.docs.intent.core.compiler.UnresolvedReferenceHolder;
import org.eclipse.mylyn.docs.intent.core.genericunit.UnitInstruction;
import org.eclipse.mylyn.docs.intent.core.modelingunit.ResourceDeclaration;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Compilation Information Holder</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilationInformationHolderImpl#getGeneratedElementList <em>Generated Element List</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilationInformationHolderImpl#getElementToUnresolvedReferenceMap <em>Element To Unresolved Reference Map</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilationInformationHolderImpl#getTypeToNameToElementsMap <em>Type To Name To Elements Map</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilationInformationHolderImpl#getCreatedElementsToInstructions <em>Created Elements To Instructions</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilationInformationHolderImpl#getCurrentGeneratedElementList <em>Current Generated Element List</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilationInformationHolderImpl#getResourceToContainedElements <em>Resource To Contained Elements</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilationInformationHolderImpl#getUnresolvedContributions <em>Unresolved Contributions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompilationInformationHolderImpl extends CDOObjectImpl implements CompilationInformationHolder {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected CompilationInformationHolderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CompilerPackage.Literals.COMPILATION_INFORMATION_HOLDER;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<EObject> getGeneratedElementList() {
		return (EList<EObject>)eGet(
				CompilerPackage.Literals.COMPILATION_INFORMATION_HOLDER__GENERATED_ELEMENT_LIST, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EMap<EObject, EList<UnresolvedReferenceHolder>> getElementToUnresolvedReferenceMap() {
		return (EMap<EObject, EList<UnresolvedReferenceHolder>>)eGet(
				CompilerPackage.Literals.COMPILATION_INFORMATION_HOLDER__ELEMENT_TO_UNRESOLVED_REFERENCE_MAP,
				true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EMap<EClassifier, StringToEObjectMap> getTypeToNameToElementsMap() {
		return (EMap<EClassifier, StringToEObjectMap>)eGet(
				CompilerPackage.Literals.COMPILATION_INFORMATION_HOLDER__TYPE_TO_NAME_TO_ELEMENTS_MAP, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EMap<EObject, UnitInstruction> getCreatedElementsToInstructions() {
		return (EMap<EObject, UnitInstruction>)eGet(
				CompilerPackage.Literals.COMPILATION_INFORMATION_HOLDER__CREATED_ELEMENTS_TO_INSTRUCTIONS,
				true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<EObject> getCurrentGeneratedElementList() {
		return (EList<EObject>)eGet(
				CompilerPackage.Literals.COMPILATION_INFORMATION_HOLDER__CURRENT_GENERATED_ELEMENT_LIST, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EMap<ResourceDeclaration, EList<EObject>> getResourceToContainedElements() {
		return (EMap<ResourceDeclaration, EList<EObject>>)eGet(
				CompilerPackage.Literals.COMPILATION_INFORMATION_HOLDER__RESOURCE_TO_CONTAINED_ELEMENTS, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EMap<String, EList<UnresolvedContributionHolder>> getUnresolvedContributions() {
		return (EMap<String, EList<UnresolvedContributionHolder>>)eGet(
				CompilerPackage.Literals.COMPILATION_INFORMATION_HOLDER__UNRESOLVED_CONTRIBUTIONS, true);
	}

} // CompilationInformationHolderImpl
