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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.mylyn.docs.intent.markup.markup.Annotations;
import org.eclipse.mylyn.docs.intent.markup.markup.Block;
import org.eclipse.mylyn.docs.intent.markup.markup.Container;
import org.eclipse.mylyn.docs.intent.markup.markup.HasAttributes;
import org.eclipse.mylyn.docs.intent.markup.markup.MarkupPackage;
import org.eclipse.mylyn.docs.intent.markup.markup.Section;
import org.eclipse.mylyn.docs.intent.markup.markup.StructureElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mylyn.docs.intent.markup.markup.impl.SectionImpl#getContent <em>Content</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.markup.markup.impl.SectionImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.markup.markup.impl.SectionImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.markup.markup.impl.SectionImpl#getLevel <em>Level</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SectionImpl extends StructureElementImpl implements Section {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MarkupPackage.Literals.SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<StructureElement> getContent() {
		return (EList<StructureElement>)eGet(MarkupPackage.Literals.CONTAINER__CONTENT, true);
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
	public Block getTitle() {
		return (Block)eGet(MarkupPackage.Literals.SECTION__TITLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(Block newTitle) {
		eSet(MarkupPackage.Literals.SECTION__TITLE, newTitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLevel() {
		return (Integer)eGet(MarkupPackage.Literals.SECTION__LEVEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel(int newLevel) {
		eSet(MarkupPackage.Literals.SECTION__LEVEL, newLevel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Container.class) {
			switch (derivedFeatureID) {
				case MarkupPackage.SECTION__CONTENT: return MarkupPackage.CONTAINER__CONTENT;
				default: return -1;
			}
		}
		if (baseClass == HasAttributes.class) {
			switch (derivedFeatureID) {
				case MarkupPackage.SECTION__ATTRIBUTES: return MarkupPackage.HAS_ATTRIBUTES__ATTRIBUTES;
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
		if (baseClass == Container.class) {
			switch (baseFeatureID) {
				case MarkupPackage.CONTAINER__CONTENT: return MarkupPackage.SECTION__CONTENT;
				default: return -1;
			}
		}
		if (baseClass == HasAttributes.class) {
			switch (baseFeatureID) {
				case MarkupPackage.HAS_ATTRIBUTES__ATTRIBUTES: return MarkupPackage.SECTION__ATTRIBUTES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //SectionImpl
