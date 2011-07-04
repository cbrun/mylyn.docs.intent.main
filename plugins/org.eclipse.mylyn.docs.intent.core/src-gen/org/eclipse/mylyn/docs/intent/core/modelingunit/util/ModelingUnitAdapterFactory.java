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
package org.eclipse.mylyn.docs.intent.core.modelingunit.util;

import java.util.Map;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mylyn.docs.intent.core.document.IntentGenericElement;
import org.eclipse.mylyn.docs.intent.core.document.IntentReference;
import org.eclipse.mylyn.docs.intent.core.genericunit.GenericUnit;
import org.eclipse.mylyn.docs.intent.core.genericunit.IntentSectionReferenceInstruction;
import org.eclipse.mylyn.docs.intent.core.genericunit.LabelDeclaration;
import org.eclipse.mylyn.docs.intent.core.genericunit.UnitInstruction;
import org.eclipse.mylyn.docs.intent.core.modelingunit.AnnotationDeclaration;
import org.eclipse.mylyn.docs.intent.core.modelingunit.ContributionInstruction;
import org.eclipse.mylyn.docs.intent.core.modelingunit.InstanceLevelInstruction;
import org.eclipse.mylyn.docs.intent.core.modelingunit.InstanciationInstruction;
import org.eclipse.mylyn.docs.intent.core.modelingunit.InstanciationInstructionReference;
import org.eclipse.mylyn.docs.intent.core.modelingunit.IntentSectionReferenceinModelingUnit;
import org.eclipse.mylyn.docs.intent.core.modelingunit.LabelinModelingUnit;
import org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnit;
import org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnitInstruction;
import org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnitInstructionReference;
import org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnitPackage;
import org.eclipse.mylyn.docs.intent.core.modelingunit.NativeValueForStructuralFeature;
import org.eclipse.mylyn.docs.intent.core.modelingunit.NewObjectValueForStructuralFeature;
import org.eclipse.mylyn.docs.intent.core.modelingunit.ReferenceValueForStructuralFeature;
import org.eclipse.mylyn.docs.intent.core.modelingunit.ResourceDeclaration;
import org.eclipse.mylyn.docs.intent.core.modelingunit.ResourceReference;
import org.eclipse.mylyn.docs.intent.core.modelingunit.StructuralFeatureAffectation;
import org.eclipse.mylyn.docs.intent.core.modelingunit.TypeReference;
import org.eclipse.mylyn.docs.intent.core.modelingunit.ValueForStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnitPackage
 * @generated
 */
public class ModelingUnitAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModelingUnitPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelingUnitAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ModelingUnitPackage.eINSTANCE;
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
	protected ModelingUnitSwitch<Adapter> modelSwitch = new ModelingUnitSwitch<Adapter>() {
		@Override
		public Adapter caseKeyValForAnnotation(Map.Entry<String, String> object) {
			return createKeyValForAnnotationAdapter();
		}

		@Override
		public Adapter caseModelingUnit(ModelingUnit object) {
			return createModelingUnitAdapter();
		}

		@Override
		public Adapter caseModelingUnitInstruction(ModelingUnitInstruction object) {
			return createModelingUnitInstructionAdapter();
		}

		@Override
		public Adapter caseResourceReference(ResourceReference object) {
			return createResourceReferenceAdapter();
		}

		@Override
		public Adapter caseModelingUnitInstructionReference(ModelingUnitInstructionReference object) {
			return createModelingUnitInstructionReferenceAdapter();
		}

		@Override
		public Adapter caseInstanciationInstructionReference(InstanciationInstructionReference object) {
			return createInstanciationInstructionReferenceAdapter();
		}

		@Override
		public Adapter caseResourceDeclaration(ResourceDeclaration object) {
			return createResourceDeclarationAdapter();
		}

		@Override
		public Adapter caseIntentSectionReferenceinModelingUnit(IntentSectionReferenceinModelingUnit object) {
			return createIntentSectionReferenceinModelingUnitAdapter();
		}

		@Override
		public Adapter caseLabelinModelingUnit(LabelinModelingUnit object) {
			return createLabelinModelingUnitAdapter();
		}

		@Override
		public Adapter caseAnnotationDeclaration(AnnotationDeclaration object) {
			return createAnnotationDeclarationAdapter();
		}

		@Override
		public Adapter caseTypeReference(TypeReference object) {
			return createTypeReferenceAdapter();
		}

		@Override
		public Adapter caseInstanceLevelInstruction(InstanceLevelInstruction object) {
			return createInstanceLevelInstructionAdapter();
		}

		@Override
		public Adapter caseInstanciationInstruction(InstanciationInstruction object) {
			return createInstanciationInstructionAdapter();
		}

		@Override
		public Adapter caseStructuralFeatureAffectation(StructuralFeatureAffectation object) {
			return createStructuralFeatureAffectationAdapter();
		}

		@Override
		public Adapter caseValueForStructuralFeature(ValueForStructuralFeature object) {
			return createValueForStructuralFeatureAdapter();
		}

		@Override
		public Adapter caseNativeValueForStructuralFeature(NativeValueForStructuralFeature object) {
			return createNativeValueForStructuralFeatureAdapter();
		}

		@Override
		public Adapter caseNewObjectValueForStructuralFeature(NewObjectValueForStructuralFeature object) {
			return createNewObjectValueForStructuralFeatureAdapter();
		}

		@Override
		public Adapter caseReferenceValueForStructuralFeature(ReferenceValueForStructuralFeature object) {
			return createReferenceValueForStructuralFeatureAdapter();
		}

		@Override
		public Adapter caseContributionInstruction(ContributionInstruction object) {
			return createContributionInstructionAdapter();
		}

		@Override
		public Adapter caseIntentGenericElement(IntentGenericElement object) {
			return createIntentGenericElementAdapter();
		}

		@Override
		public Adapter caseGenericUnit(GenericUnit object) {
			return createGenericUnitAdapter();
		}

		@Override
		public Adapter caseUnitInstruction(UnitInstruction object) {
			return createUnitInstructionAdapter();
		}

		@Override
		public Adapter caseIntentReference(IntentReference object) {
			return createIntentReferenceAdapter();
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
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>Key Val For Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createKeyValForAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnit <em>Modeling Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnit
	 * @generated
	 */
	public Adapter createModelingUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnitInstruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnitInstruction
	 * @generated
	 */
	public Adapter createModelingUnitInstructionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mylyn.docs.intent.core.modelingunit.ResourceReference <em>Resource Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mylyn.docs.intent.core.modelingunit.ResourceReference
	 * @generated
	 */
	public Adapter createResourceReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnitInstructionReference <em>Instruction Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnitInstructionReference
	 * @generated
	 */
	public Adapter createModelingUnitInstructionReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mylyn.docs.intent.core.modelingunit.InstanciationInstructionReference <em>Instanciation Instruction Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mylyn.docs.intent.core.modelingunit.InstanciationInstructionReference
	 * @generated
	 */
	public Adapter createInstanciationInstructionReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mylyn.docs.intent.core.modelingunit.ResourceDeclaration <em>Resource Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mylyn.docs.intent.core.modelingunit.ResourceDeclaration
	 * @generated
	 */
	public Adapter createResourceDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mylyn.docs.intent.core.modelingunit.IntentSectionReferenceinModelingUnit <em>Intent Section Referencein Modeling Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mylyn.docs.intent.core.modelingunit.IntentSectionReferenceinModelingUnit
	 * @generated
	 */
	public Adapter createIntentSectionReferenceinModelingUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mylyn.docs.intent.core.modelingunit.LabelinModelingUnit <em>Labelin Modeling Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mylyn.docs.intent.core.modelingunit.LabelinModelingUnit
	 * @generated
	 */
	public Adapter createLabelinModelingUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mylyn.docs.intent.core.modelingunit.AnnotationDeclaration <em>Annotation Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mylyn.docs.intent.core.modelingunit.AnnotationDeclaration
	 * @generated
	 */
	public Adapter createAnnotationDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mylyn.docs.intent.core.modelingunit.TypeReference <em>Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mylyn.docs.intent.core.modelingunit.TypeReference
	 * @generated
	 */
	public Adapter createTypeReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mylyn.docs.intent.core.modelingunit.InstanceLevelInstruction <em>Instance Level Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mylyn.docs.intent.core.modelingunit.InstanceLevelInstruction
	 * @generated
	 */
	public Adapter createInstanceLevelInstructionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mylyn.docs.intent.core.modelingunit.InstanciationInstruction <em>Instanciation Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mylyn.docs.intent.core.modelingunit.InstanciationInstruction
	 * @generated
	 */
	public Adapter createInstanciationInstructionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mylyn.docs.intent.core.modelingunit.StructuralFeatureAffectation <em>Structural Feature Affectation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mylyn.docs.intent.core.modelingunit.StructuralFeatureAffectation
	 * @generated
	 */
	public Adapter createStructuralFeatureAffectationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mylyn.docs.intent.core.modelingunit.ValueForStructuralFeature <em>Value For Structural Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mylyn.docs.intent.core.modelingunit.ValueForStructuralFeature
	 * @generated
	 */
	public Adapter createValueForStructuralFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mylyn.docs.intent.core.modelingunit.NativeValueForStructuralFeature <em>Native Value For Structural Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mylyn.docs.intent.core.modelingunit.NativeValueForStructuralFeature
	 * @generated
	 */
	public Adapter createNativeValueForStructuralFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mylyn.docs.intent.core.modelingunit.NewObjectValueForStructuralFeature <em>New Object Value For Structural Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mylyn.docs.intent.core.modelingunit.NewObjectValueForStructuralFeature
	 * @generated
	 */
	public Adapter createNewObjectValueForStructuralFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mylyn.docs.intent.core.modelingunit.ReferenceValueForStructuralFeature <em>Reference Value For Structural Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mylyn.docs.intent.core.modelingunit.ReferenceValueForStructuralFeature
	 * @generated
	 */
	public Adapter createReferenceValueForStructuralFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mylyn.docs.intent.core.modelingunit.ContributionInstruction <em>Contribution Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mylyn.docs.intent.core.modelingunit.ContributionInstruction
	 * @generated
	 */
	public Adapter createContributionInstructionAdapter() {
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

} //ModelingUnitAdapterFactory
