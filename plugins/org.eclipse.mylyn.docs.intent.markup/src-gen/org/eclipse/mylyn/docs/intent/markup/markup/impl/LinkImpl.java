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
package org.eclipse.mylyn.docs.intent.markup.markup.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.mylyn.docs.intent.markup.markup.Annotations;
import org.eclipse.mylyn.docs.intent.markup.markup.Block;
import org.eclipse.mylyn.docs.intent.markup.markup.HasAttributes;
import org.eclipse.mylyn.docs.intent.markup.markup.Link;
import org.eclipse.mylyn.docs.intent.markup.markup.MarkupPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mylyn.docs.intent.markup.markup.impl.LinkImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.markup.markup.impl.LinkImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.markup.markup.impl.LinkImpl#getHrefOrHashName <em>Href Or Hash Name</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.markup.markup.impl.LinkImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.markup.markup.impl.LinkImpl#isHasBeenDeclaredWithHTMLSyntax <em>Has Been Declared With HTML Syntax</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinkImpl extends BlockContentImpl implements Link {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MarkupPackage.Literals.LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotations getAttributes() {
		return (Annotations)eGet(MarkupPackage.Literals.HAS_ATTRIBUTES__ATTRIBUTES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributes(Annotations newAttributes) {
		eSet(MarkupPackage.Literals.HAS_ATTRIBUTES__ATTRIBUTES, newAttributes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block getName() {
		return (Block)eGet(MarkupPackage.Literals.LINK__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(Block newName) {
		eSet(MarkupPackage.Literals.LINK__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHrefOrHashName() {
		return (String)eGet(MarkupPackage.Literals.LINK__HREF_OR_HASH_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHrefOrHashName(String newHrefOrHashName) {
		eSet(MarkupPackage.Literals.LINK__HREF_OR_HASH_NAME, newHrefOrHashName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HasAttributes getTarget() {
		return (HasAttributes)eGet(MarkupPackage.Literals.LINK__TARGET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(HasAttributes newTarget) {
		eSet(MarkupPackage.Literals.LINK__TARGET, newTarget);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHasBeenDeclaredWithHTMLSyntax() {
		return (Boolean)eGet(MarkupPackage.Literals.LINK__HAS_BEEN_DECLARED_WITH_HTML_SYNTAX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasBeenDeclaredWithHTMLSyntax(boolean newHasBeenDeclaredWithHTMLSyntax) {
		eSet(MarkupPackage.Literals.LINK__HAS_BEEN_DECLARED_WITH_HTML_SYNTAX, newHasBeenDeclaredWithHTMLSyntax);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == HasAttributes.class) {
			switch (derivedFeatureID) {
				case MarkupPackage.LINK__ATTRIBUTES: return MarkupPackage.HAS_ATTRIBUTES__ATTRIBUTES;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == HasAttributes.class) {
			switch (baseFeatureID) {
				case MarkupPackage.HAS_ATTRIBUTES__ATTRIBUTES: return MarkupPackage.LINK__ATTRIBUTES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //LinkImpl
