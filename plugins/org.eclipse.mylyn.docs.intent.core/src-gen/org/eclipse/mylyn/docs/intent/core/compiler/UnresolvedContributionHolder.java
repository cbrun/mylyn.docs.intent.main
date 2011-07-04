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
import org.eclipse.mylyn.docs.intent.core.modelingunit.ContributionInstruction;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Unresolved Contribution Holder</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.compiler.UnresolvedContributionHolder#isResolved <em>Resolved</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.compiler.UnresolvedContributionHolder#getReferencedContribution <em>Referenced Contribution</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mylyn.docs.intent.core.compiler.CompilerPackage#getUnresolvedContributionHolder()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface UnresolvedContributionHolder extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Resolved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolved</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolved</em>' attribute.
	 * @see #setResolved(boolean)
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.CompilerPackage#getUnresolvedContributionHolder_Resolved()
	 * @model required="true"
	 * @generated
	 */
	boolean isResolved();

	/**
	 * Sets the value of the '{@link org.eclipse.mylyn.docs.intent.core.compiler.UnresolvedContributionHolder#isResolved <em>Resolved</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolved</em>' attribute.
	 * @see #isResolved()
	 * @generated
	 */
	void setResolved(boolean value);

	/**
	 * Returns the value of the '<em><b>Referenced Contribution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Contribution</em>' reference isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Contribution</em>' reference.
	 * @see #setReferencedContribution(ContributionInstruction)
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.CompilerPackage#getUnresolvedContributionHolder_ReferencedContribution()
	 * @model required="true"
	 * @generated
	 */
	ContributionInstruction getReferencedContribution();

	/**
	 * Sets the value of the '{@link org.eclipse.mylyn.docs.intent.core.compiler.UnresolvedContributionHolder#getReferencedContribution <em>Referenced Contribution</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Contribution</em>' reference.
	 * @see #getReferencedContribution()
	 * @generated
	 */
	void setReferencedContribution(ContributionInstruction value);

} // UnresolvedContributionHolder
