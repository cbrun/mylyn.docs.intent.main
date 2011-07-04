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
import org.eclipse.mylyn.docs.intent.core.document.IntentDocumentPackage;
import org.eclipse.mylyn.docs.intent.core.document.IntentHeaderDeclaration;
import org.eclipse.mylyn.docs.intent.core.document.IntentSection;
import org.eclipse.mylyn.docs.intent.core.document.IntentSectionVisibility;
import org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnit;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Intent Section</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.document.impl.IntentSectionImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.document.impl.IntentSectionImpl#getCompleteLevel <em>Complete Level</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.document.impl.IntentSectionImpl#getModelingUnits <em>Modeling Units</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.document.impl.IntentSectionImpl#getImportedHeaders <em>Imported Headers</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.document.impl.IntentSectionImpl#getDeclaredHeaders <em>Declared Headers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IntentSectionImpl extends IntentSubSectionContainerImpl implements IntentSection {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected IntentSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IntentDocumentPackage.Literals.INTENT_SECTION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public IntentSectionVisibility getVisibility() {
		return (IntentSectionVisibility)eGet(IntentDocumentPackage.Literals.INTENT_SECTION__VISIBILITY, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibility(IntentSectionVisibility newVisibility) {
		eSet(IntentDocumentPackage.Literals.INTENT_SECTION__VISIBILITY, newVisibility);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getCompleteLevel() {
		return (String)eGet(IntentDocumentPackage.Literals.INTENT_SECTION__COMPLETE_LEVEL, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompleteLevel(String newCompleteLevel) {
		eSet(IntentDocumentPackage.Literals.INTENT_SECTION__COMPLETE_LEVEL, newCompleteLevel);
	}

	/**
	 * <!-- begin-user-doc --> Returns all the Modeling Units contained in this section's IntentContent.<!--
	 * end-user-doc -->
	 */
	public EList<ModelingUnit> getModelingUnits() {
		Collection<ModelingUnit> result = new ArrayList<ModelingUnit>();
		Iterator<EObject> it = getIntentContent().iterator();
		while (it.hasNext()) {
			EObject eObj = (EObject)it.next();
			if (eObj instanceof ModelingUnit)
				result.add((ModelingUnit)eObj);
		}
		return new EcoreEList.UnmodifiableEList<ModelingUnit>(eInternalContainer(),
				IntentDocumentPackage.eINSTANCE.getIntentSection_ModelingUnits(), result.size(),
				result.toArray());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<String> getImportedHeaders() {
		return (EList<String>)eGet(IntentDocumentPackage.Literals.INTENT_SECTION__IMPORTED_HEADERS, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IntentHeaderDeclaration> getDeclaredHeaders() {
		return (EList<IntentHeaderDeclaration>)eGet(
				IntentDocumentPackage.Literals.INTENT_SECTION__DECLARED_HEADERS, true);
	}

} // IntentSectionImpl
