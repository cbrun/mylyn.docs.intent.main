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
package org.eclipse.mylyn.docs.intent.core.document.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.mylyn.docs.intent.core.descriptionunit.DescriptionUnit;
import org.eclipse.mylyn.docs.intent.core.document.IntentDocumentPackage;
import org.eclipse.mylyn.docs.intent.core.document.IntentSection;
import org.eclipse.mylyn.docs.intent.core.document.IntentSubSectionContainer;
import org.eclipse.mylyn.docs.intent.core.genericunit.GenericUnit;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Intent Sub Section Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.document.impl.IntentSubSectionContainerImpl#getIntentContent <em>Intent Content</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.document.impl.IntentSubSectionContainerImpl#getSubSections <em>Sub Sections</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.document.impl.IntentSubSectionContainerImpl#getUnits <em>Units</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.document.impl.IntentSubSectionContainerImpl#getDescriptionUnits <em>Description Units</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class IntentSubSectionContainerImpl extends IntentStructuredElementImpl implements IntentSubSectionContainer {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected IntentSubSectionContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IntentDocumentPackage.Literals.INTENT_SUB_SECTION_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<EObject> getIntentContent() {
		return (EList<EObject>)eGet(
				IntentDocumentPackage.Literals.INTENT_SUB_SECTION_CONTAINER__INTENT_CONTENT, true);
	}

	/**
	 * <!-- begin-user-doc --> Returns the sub-sections contained in the current element. <!-- end-user-doc
	 * -->
	 */
	public EList<IntentSection> getSubSections() {
		Collection<IntentSection> result = new ArrayList<IntentSection>();
		Iterator<EObject> it = getIntentContent().iterator();
		while (it.hasNext()) {
			EObject eObj = (EObject)it.next();
			if (eObj instanceof IntentSection)
				result.add((IntentSection)eObj);
		}
		return new EcoreEList.UnmodifiableEList<IntentSection>(eInternalContainer(),
				IntentDocumentPackage.eINSTANCE.getIntentSubSectionContainer_SubSections(), result.size(),
				result.toArray());
	}

	/**
	 * <!-- begin-user-doc --> Returns all the Units (Modeling, Description) contained in this section's
	 * IntentContent.<!-- end-user-doc -->
	 */
	public EList<GenericUnit> getUnits() {
		Collection<GenericUnit> result = new ArrayList<GenericUnit>();
		Iterator<EObject> it = getIntentContent().iterator();
		while (it.hasNext()) {
			EObject eObj = (EObject)it.next();
			if (eObj instanceof GenericUnit)
				result.add((GenericUnit)eObj);
		}
		return new EcoreEList.UnmodifiableEList<GenericUnit>(eInternalContainer(),
				IntentDocumentPackage.eINSTANCE.getIntentSubSectionContainer_Units(), result.size(),
				result.toArray());
	}

	/**
	 * <!-- begin-user-doc --> Returns the description units contained in the current element. <!--
	 * end-user-doc -->
	 */
	public EList<DescriptionUnit> getDescriptionUnits() {
		Collection<DescriptionUnit> result = new ArrayList<DescriptionUnit>();
		Iterator<EObject> it = getIntentContent().iterator();
		while (it.hasNext()) {
			EObject eObj = (EObject)it.next();
			if (eObj instanceof DescriptionUnit)
				result.add((DescriptionUnit)eObj);
		}
		return new EcoreEList.UnmodifiableEList<DescriptionUnit>(eInternalContainer(),
				IntentDocumentPackage.eINSTANCE.getIntentSubSectionContainer_DescriptionUnits(),
				result.size(), result.toArray());
	}

} // IntentSubSectionContainerImpl
