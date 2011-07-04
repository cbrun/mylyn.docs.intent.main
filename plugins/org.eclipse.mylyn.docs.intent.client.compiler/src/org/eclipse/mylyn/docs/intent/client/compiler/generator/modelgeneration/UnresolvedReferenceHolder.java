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
package org.eclipse.mylyn.docs.intent.client.compiler.generator.modelgeneration;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.mylyn.docs.intent.core.genericunit.UnitInstruction;

/**
 * Symbolize a unresolved reference to an element in an Intent StructuralFeature Affectation.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public class UnresolvedReferenceHolder extends EObjectImpl implements EObject {

	/**
	 * Instruction that made the reference.
	 */
	private final UnitInstruction instruction;

	/**
	 * The Structural feature containing the unresolved reference.
	 */
	private EStructuralFeature feature;

	/**
	 * Indicates if the hold reference should be contained or not.
	 */
	private boolean isContainedReference;

	/**
	 * The textual form of the given reference.
	 */
	private String href;

	/**
	 * UnresolvedReferenceHolder constructor.
	 * 
	 * @param referenceDeclaration
	 *            the reference declaration containing the textual form of the reference to resolve.
	 * @param href
	 *            the textual value of the reference to contain
	 */
	public UnresolvedReferenceHolder(UnitInstruction referenceDeclaration, String href) {
		this.instruction = referenceDeclaration;
		this.href = href;
		this.isContainedReference = false;
	}

	/**
	 * Sets the Structural feature containing the unresolved reference.
	 * 
	 * @param targetFeature
	 *            the Structural feature containing the unresolved reference
	 */
	public void setStructuralFeature(EStructuralFeature targetFeature) {
		this.feature = targetFeature;
		setContainedReference(((EReference)targetFeature).isContainment());
	}

	/**
	 * Returns the Structural feature containing the unresolved reference.
	 * 
	 * @return the feature the Structural feature containing the unresolved reference
	 */
	public EStructuralFeature getFeature() {
		return feature;
	}

	/**
	 * Returns the textual form of the given reference.
	 * 
	 * @return the textual form of the given reference
	 */
	public String getTextualTarget() {
		return this.href;
	}

	/**
	 * Returns the instruction that declared this reference.
	 * 
	 * @return the instruction that declared this reference
	 */
	public UnitInstruction getInstruction() {
		return instruction;
	}

	/**
	 * Indicates if the hold reference should be contained or not.
	 * 
	 * @param isContained
	 *            true if the hold reference should be contained or not, false otherwise
	 */
	private void setContainedReference(boolean isContained) {
		this.isContainedReference = isContained;
	}

	/**
	 * Indicates if the hold reference should be contained or not.
	 * 
	 * @return true if the hold reference is contained or not, false otherwise
	 */
	public boolean isContainedReference() {
		return this.isContainedReference;
	}
}
