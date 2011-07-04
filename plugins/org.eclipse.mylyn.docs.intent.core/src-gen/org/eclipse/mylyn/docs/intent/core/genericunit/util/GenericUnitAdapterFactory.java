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
package org.eclipse.mylyn.docs.intent.core.genericunit.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mylyn.docs.intent.core.document.IntentGenericElement;
import org.eclipse.mylyn.docs.intent.core.document.IntentReference;
import org.eclipse.mylyn.docs.intent.core.genericunit.AdressedAnnotation;
import org.eclipse.mylyn.docs.intent.core.genericunit.GenericUnit;
import org.eclipse.mylyn.docs.intent.core.genericunit.GenericUnitPackage;
import org.eclipse.mylyn.docs.intent.core.genericunit.IntentSectionReferenceInstruction;
import org.eclipse.mylyn.docs.intent.core.genericunit.LabelDeclaration;
import org.eclipse.mylyn.docs.intent.core.genericunit.LabelDeclarationReference;
import org.eclipse.mylyn.docs.intent.core.genericunit.LabelReferenceInstruction;
import org.eclipse.mylyn.docs.intent.core.genericunit.UnitInstruction;
import org.eclipse.mylyn.docs.intent.core.genericunit.UnitInstructionReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.mylyn.docs.intent.core.genericunit.GenericUnitPackage
 * @generated
 */
public class GenericUnitAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GenericUnitPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericUnitAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = GenericUnitPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenericUnitSwitch<Adapter> modelSwitch = new GenericUnitSwitch<Adapter>() {
		@Override
		public Adapter caseGenericUnit(GenericUnit object) {
			return createGenericUnitAdapter();
		}

		@Override
		public Adapter caseUnitInstruction(UnitInstruction object) {
			return createUnitInstructionAdapter();
		}

		@Override
		public Adapter caseUnitInstructionReference(UnitInstructionReference object) {
			return createUnitInstructionReferenceAdapter();
		}

		@Override
		public Adapter caseLabelDeclarationReference(LabelDeclarationReference object) {
			return createLabelDeclarationReferenceAdapter();
		}

		@Override
		public Adapter caseIntentSectionReferenceInstruction(IntentSectionReferenceInstruction object) {
			return createIntentSectionReferenceInstructionAdapter();
		}

		@Override
		public Adapter caseLabelDeclaration(LabelDeclaration object) {
			return createLabelDeclarationAdapter();
		}

		@Override
		public Adapter caseLabelReferenceInstruction(LabelReferenceInstruction object) {
			return createLabelReferenceInstructionAdapter();
		}

		@Override
		public Adapter caseAdressedAnnotation(AdressedAnnotation object) {
			return createAdressedAnnotationAdapter();
		}

		@Override
		public Adapter caseIntentGenericElement(IntentGenericElement object) {
			return createIntentGenericElementAdapter();
		}

		@Override
		public Adapter caseIntentReference(IntentReference object) {
			return createIntentReferenceAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mylyn.docs.intent.core.genericunit.GenericUnit <em>Generic Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mylyn.docs.intent.core.genericunit.GenericUnit
	 * @generated
	 */
	public Adapter createGenericUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mylyn.docs.intent.core.genericunit.UnitInstruction <em>Unit Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mylyn.docs.intent.core.genericunit.UnitInstruction
	 * @generated
	 */
	public Adapter createUnitInstructionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mylyn.docs.intent.core.genericunit.UnitInstructionReference <em>Unit Instruction Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mylyn.docs.intent.core.genericunit.UnitInstructionReference
	 * @generated
	 */
	public Adapter createUnitInstructionReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mylyn.docs.intent.core.genericunit.LabelDeclarationReference <em>Label Declaration Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mylyn.docs.intent.core.genericunit.LabelDeclarationReference
	 * @generated
	 */
	public Adapter createLabelDeclarationReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mylyn.docs.intent.core.genericunit.IntentSectionReferenceInstruction <em>Intent Section Reference Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mylyn.docs.intent.core.genericunit.IntentSectionReferenceInstruction
	 * @generated
	 */
	public Adapter createIntentSectionReferenceInstructionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mylyn.docs.intent.core.genericunit.LabelDeclaration <em>Label Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mylyn.docs.intent.core.genericunit.LabelDeclaration
	 * @generated
	 */
	public Adapter createLabelDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mylyn.docs.intent.core.genericunit.LabelReferenceInstruction <em>Label Reference Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mylyn.docs.intent.core.genericunit.LabelReferenceInstruction
	 * @generated
	 */
	public Adapter createLabelReferenceInstructionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mylyn.docs.intent.core.genericunit.AdressedAnnotation <em>Adressed Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mylyn.docs.intent.core.genericunit.AdressedAnnotation
	 * @generated
	 */
	public Adapter createAdressedAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mylyn.docs.intent.core.document.IntentGenericElement <em>Intent Generic Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mylyn.docs.intent.core.document.IntentGenericElement
	 * @generated
	 */
	public Adapter createIntentGenericElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mylyn.docs.intent.core.document.IntentReference <em>Intent Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mylyn.docs.intent.core.document.IntentReference
	 * @generated
	 */
	public Adapter createIntentReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //GenericUnitAdapterFactory
