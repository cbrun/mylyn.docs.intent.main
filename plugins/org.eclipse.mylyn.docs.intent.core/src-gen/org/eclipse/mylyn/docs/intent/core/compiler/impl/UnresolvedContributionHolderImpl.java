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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.mylyn.docs.intent.core.compiler.CompilerPackage;
import org.eclipse.mylyn.docs.intent.core.compiler.UnresolvedContributionHolder;
import org.eclipse.mylyn.docs.intent.core.modelingunit.ContributionInstruction;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Unresolved Contribution Holder</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.compiler.impl.UnresolvedContributionHolderImpl#isResolved <em>Resolved</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.compiler.impl.UnresolvedContributionHolderImpl#getReferencedContribution <em>Referenced Contribution</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnresolvedContributionHolderImpl extends CDOObjectImpl implements UnresolvedContributionHolder {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected UnresolvedContributionHolderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CompilerPackage.Literals.UNRESOLVED_CONTRIBUTION_HOLDER;
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
	public boolean isResolved() {
		return (Boolean)eGet(CompilerPackage.Literals.UNRESOLVED_CONTRIBUTION_HOLDER__RESOLVED, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setResolved(boolean newResolved) {
		eSet(CompilerPackage.Literals.UNRESOLVED_CONTRIBUTION_HOLDER__RESOLVED, newResolved);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ContributionInstruction getReferencedContribution() {
		return (ContributionInstruction)eGet(
				CompilerPackage.Literals.UNRESOLVED_CONTRIBUTION_HOLDER__REFERENCED_CONTRIBUTION, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedContribution(ContributionInstruction newReferencedContribution) {
		eSet(CompilerPackage.Literals.UNRESOLVED_CONTRIBUTION_HOLDER__REFERENCED_CONTRIBUTION,
				newReferencedContribution);
	}

} // UnresolvedContributionHolderImpl
