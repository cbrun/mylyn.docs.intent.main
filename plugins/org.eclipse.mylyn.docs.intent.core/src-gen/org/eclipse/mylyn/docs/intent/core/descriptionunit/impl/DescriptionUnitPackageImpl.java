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
package org.eclipse.mylyn.docs.intent.core.descriptionunit.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.mylyn.docs.intent.core.compiler.CompilerPackage;
import org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilerPackageImpl;
import org.eclipse.mylyn.docs.intent.core.descriptionunit.DescriptionBloc;
import org.eclipse.mylyn.docs.intent.core.descriptionunit.DescriptionUnit;
import org.eclipse.mylyn.docs.intent.core.descriptionunit.DescriptionUnitFactory;
import org.eclipse.mylyn.docs.intent.core.descriptionunit.DescriptionUnitInstruction;
import org.eclipse.mylyn.docs.intent.core.descriptionunit.DescriptionUnitPackage;
import org.eclipse.mylyn.docs.intent.core.document.IntentDocumentPackage;
import org.eclipse.mylyn.docs.intent.core.document.impl.IntentDocumentPackageImpl;
import org.eclipse.mylyn.docs.intent.core.genericunit.GenericUnitPackage;
import org.eclipse.mylyn.docs.intent.core.genericunit.impl.GenericUnitPackageImpl;
import org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnitPackage;
import org.eclipse.mylyn.docs.intent.core.modelingunit.impl.ModelingUnitPackageImpl;
import org.eclipse.mylyn.docs.intent.markup.markup.MarkupPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DescriptionUnitPackageImpl extends EPackageImpl implements DescriptionUnitPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass descriptionUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass descriptionUnitInstructionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass descriptionBlocEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.mylyn.docs.intent.core.descriptionunit.DescriptionUnitPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DescriptionUnitPackageImpl() {
		super(eNS_URI, DescriptionUnitFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link DescriptionUnitPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DescriptionUnitPackage init() {
		if (isInited)
			return (DescriptionUnitPackage)EPackage.Registry.INSTANCE
					.getEPackage(DescriptionUnitPackage.eNS_URI);

		// Obtain or create and register package
		DescriptionUnitPackageImpl theDescriptionUnitPackage = (DescriptionUnitPackageImpl)(EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof DescriptionUnitPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
				: new DescriptionUnitPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		MarkupPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		ModelingUnitPackageImpl theModelingUnitPackage = (ModelingUnitPackageImpl)(EPackage.Registry.INSTANCE
				.getEPackage(ModelingUnitPackage.eNS_URI) instanceof ModelingUnitPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(ModelingUnitPackage.eNS_URI) : ModelingUnitPackage.eINSTANCE);
		GenericUnitPackageImpl theGenericUnitPackage = (GenericUnitPackageImpl)(EPackage.Registry.INSTANCE
				.getEPackage(GenericUnitPackage.eNS_URI) instanceof GenericUnitPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(GenericUnitPackage.eNS_URI) : GenericUnitPackage.eINSTANCE);
		IntentDocumentPackageImpl theIntentDocumentPackage = (IntentDocumentPackageImpl)(EPackage.Registry.INSTANCE
				.getEPackage(IntentDocumentPackage.eNS_URI) instanceof IntentDocumentPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(IntentDocumentPackage.eNS_URI) : IntentDocumentPackage.eINSTANCE);
		CompilerPackageImpl theCompilerPackage = (CompilerPackageImpl)(EPackage.Registry.INSTANCE
				.getEPackage(CompilerPackage.eNS_URI) instanceof CompilerPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(CompilerPackage.eNS_URI) : CompilerPackage.eINSTANCE);

		// Create package meta-data objects
		theDescriptionUnitPackage.createPackageContents();
		theModelingUnitPackage.createPackageContents();
		theGenericUnitPackage.createPackageContents();
		theIntentDocumentPackage.createPackageContents();
		theCompilerPackage.createPackageContents();

		// Initialize created meta-data
		theDescriptionUnitPackage.initializePackageContents();
		theModelingUnitPackage.initializePackageContents();
		theGenericUnitPackage.initializePackageContents();
		theIntentDocumentPackage.initializePackageContents();
		theCompilerPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDescriptionUnitPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DescriptionUnitPackage.eNS_URI, theDescriptionUnitPackage);
		return theDescriptionUnitPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDescriptionUnit() {
		return descriptionUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDescriptionUnitInstruction() {
		return descriptionUnitInstructionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDescriptionBloc() {
		return descriptionBlocEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDescriptionBloc_DescriptionBloc() {
		return (EReference)descriptionBlocEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DescriptionUnitFactory getDescriptionUnitFactory() {
		return (DescriptionUnitFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		descriptionUnitEClass = createEClass(DESCRIPTION_UNIT);

		descriptionUnitInstructionEClass = createEClass(DESCRIPTION_UNIT_INSTRUCTION);

		descriptionBlocEClass = createEClass(DESCRIPTION_BLOC);
		createEReference(descriptionBlocEClass, DESCRIPTION_BLOC__DESCRIPTION_BLOC);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		GenericUnitPackage theGenericUnitPackage = (GenericUnitPackage)EPackage.Registry.INSTANCE
				.getEPackage(GenericUnitPackage.eNS_URI);
		MarkupPackage theMarkupPackage = (MarkupPackage)EPackage.Registry.INSTANCE
				.getEPackage(MarkupPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		descriptionUnitEClass.getESuperTypes().add(theGenericUnitPackage.getGenericUnit());
		descriptionUnitInstructionEClass.getESuperTypes().add(theGenericUnitPackage.getUnitInstruction());
		descriptionBlocEClass.getESuperTypes().add(this.getDescriptionUnitInstruction());

		// Initialize classes and features; add operations and parameters
		initEClass(descriptionUnitEClass, DescriptionUnit.class, "DescriptionUnit", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(descriptionUnitInstructionEClass, DescriptionUnitInstruction.class,
				"DescriptionUnitInstruction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(descriptionBlocEClass, DescriptionBloc.class, "DescriptionBloc", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDescriptionBloc_DescriptionBloc(), theMarkupPackage.getContainer(), null,
				"descriptionBloc", null, 0, 1, DescriptionBloc.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //DescriptionUnitPackageImpl
