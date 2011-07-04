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

import static org.eclipse.mylyn.docs.intent.markup.markup.MarkupPackage.CONTAINER;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.mylyn.docs.intent.markup.markup.Annotations;
import org.eclipse.mylyn.docs.intent.markup.markup.Block;
import org.eclipse.mylyn.docs.intent.markup.markup.BlockContent;
import org.eclipse.mylyn.docs.intent.markup.markup.Code;
import org.eclipse.mylyn.docs.intent.markup.markup.Div;
import org.eclipse.mylyn.docs.intent.markup.markup.Document;
import org.eclipse.mylyn.docs.intent.markup.markup.Entity;
import org.eclipse.mylyn.docs.intent.markup.markup.FootNote;
import org.eclipse.mylyn.docs.intent.markup.markup.Formatting;
import org.eclipse.mylyn.docs.intent.markup.markup.HasAttributes;
import org.eclipse.mylyn.docs.intent.markup.markup.Image;
import org.eclipse.mylyn.docs.intent.markup.markup.Information;
import org.eclipse.mylyn.docs.intent.markup.markup.Link;
import org.eclipse.mylyn.docs.intent.markup.markup.List;
import org.eclipse.mylyn.docs.intent.markup.markup.ListItem;
import org.eclipse.mylyn.docs.intent.markup.markup.ListType;
import org.eclipse.mylyn.docs.intent.markup.markup.MarkupFactory;
import org.eclipse.mylyn.docs.intent.markup.markup.MarkupPackage;
import org.eclipse.mylyn.docs.intent.markup.markup.Note;
import org.eclipse.mylyn.docs.intent.markup.markup.Panel;
import org.eclipse.mylyn.docs.intent.markup.markup.Paragraph;
import org.eclipse.mylyn.docs.intent.markup.markup.Preformatted;
import org.eclipse.mylyn.docs.intent.markup.markup.Quote;
import org.eclipse.mylyn.docs.intent.markup.markup.Section;
import org.eclipse.mylyn.docs.intent.markup.markup.SimpleContainer;
import org.eclipse.mylyn.docs.intent.markup.markup.StructureElement;
import org.eclipse.mylyn.docs.intent.markup.markup.Table;
import org.eclipse.mylyn.docs.intent.markup.markup.TableCell;
import org.eclipse.mylyn.docs.intent.markup.markup.TableRow;
import org.eclipse.mylyn.docs.intent.markup.markup.Text;
import org.eclipse.mylyn.docs.intent.markup.markup.Tip;
import org.eclipse.mylyn.docs.intent.markup.markup.Warning;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MarkupPackageImpl extends EPackageImpl implements MarkupPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structureElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hasAttributesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paragraphEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass warningEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass informationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass noteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass panelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass divEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass footNoteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass quoteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preformattedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableRowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableCellEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum formattingEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum listTypeEEnum = null;

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
	 * @see org.eclipse.mylyn.docs.intent.markup.markup.MarkupPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MarkupPackageImpl() {
		super(eNS_URI, MarkupFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MarkupPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MarkupPackage init() {
		if (isInited) return (MarkupPackage)EPackage.Registry.INSTANCE.getEPackage(MarkupPackage.eNS_URI);

		// Obtain or create and register package
		MarkupPackageImpl theMarkupPackage = (MarkupPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MarkupPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MarkupPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theMarkupPackage.createPackageContents();

		// Initialize created meta-data
		theMarkupPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMarkupPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MarkupPackage.eNS_URI, theMarkupPackage);
		return theMarkupPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocument() {
		return documentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleContainer() {
		return simpleContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructureElement() {
		return structureElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSection() {
		return sectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSection_Title() {
		return (EReference)sectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSection_Level() {
		return (EAttribute)sectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainer() {
		return containerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainer_Content() {
		return (EReference)containerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImage() {
		return imageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImage_Url() {
		return (EAttribute)imageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntity() {
		return entityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getText() {
		return textEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getText_Data() {
		return (EAttribute)textEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getText_Format() {
		return (EAttribute)textEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getText_LineBreak() {
		return (EAttribute)textEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLink() {
		return linkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLink_Name() {
		return (EReference)linkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLink_HrefOrHashName() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLink_Target() {
		return (EReference)linkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLink_HasBeenDeclaredWithHTMLSyntax() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlock() {
		return blockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlock_Content() {
		return (EReference)blockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotations() {
		return annotationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotations_Id() {
		return (EAttribute)annotationsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotations_CSSStyle() {
		return (EAttribute)annotationsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotations_Language() {
		return (EAttribute)annotationsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotations_Title() {
		return (EAttribute)annotationsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotations_CSSClass() {
		return (EAttribute)annotationsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHasAttributes() {
		return hasAttributesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHasAttributes_Attributes() {
		return (EReference)hasAttributesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlockContent() {
		return blockContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParagraph() {
		return paragraphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTip() {
		return tipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWarning() {
		return warningEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInformation() {
		return informationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNote() {
		return noteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPanel() {
		return panelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiv() {
		return divEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFootNote() {
		return footNoteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuote() {
		return quoteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPreformatted() {
		return preformattedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCode() {
		return codeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getList() {
		return listEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getList_ListType() {
		return (EAttribute)listEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getList_Items() {
		return (EReference)listEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getList_ImbricationLevel() {
		return (EAttribute)listEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListItem() {
		return listItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListItem_IsList() {
		return (EAttribute)listItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTable() {
		return tableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTableRow() {
		return tableRowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTableCell() {
		return tableCellEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableCell_IsCellHeader() {
		return (EAttribute)tableCellEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableCell_ColsPan() {
		return (EAttribute)tableCellEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFormatting() {
		return formattingEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getListType() {
		return listTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarkupFactory getMarkupFactory() {
		return (MarkupFactory)getEFactoryInstance();
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
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		documentEClass = createEClass(DOCUMENT);

		simpleContainerEClass = createEClass(SIMPLE_CONTAINER);

		structureElementEClass = createEClass(STRUCTURE_ELEMENT);

		sectionEClass = createEClass(SECTION);
		createEReference(sectionEClass, SECTION__TITLE);
		createEAttribute(sectionEClass, SECTION__LEVEL);

		containerEClass = createEClass(CONTAINER);
		createEReference(containerEClass, CONTAINER__CONTENT);

		imageEClass = createEClass(IMAGE);
		createEAttribute(imageEClass, IMAGE__URL);

		entityEClass = createEClass(ENTITY);

		textEClass = createEClass(TEXT);
		createEAttribute(textEClass, TEXT__DATA);
		createEAttribute(textEClass, TEXT__FORMAT);
		createEAttribute(textEClass, TEXT__LINE_BREAK);

		linkEClass = createEClass(LINK);
		createEReference(linkEClass, LINK__NAME);
		createEAttribute(linkEClass, LINK__HREF_OR_HASH_NAME);
		createEReference(linkEClass, LINK__TARGET);
		createEAttribute(linkEClass, LINK__HAS_BEEN_DECLARED_WITH_HTML_SYNTAX);

		blockEClass = createEClass(BLOCK);
		createEReference(blockEClass, BLOCK__CONTENT);

		annotationsEClass = createEClass(ANNOTATIONS);
		createEAttribute(annotationsEClass, ANNOTATIONS__ID);
		createEAttribute(annotationsEClass, ANNOTATIONS__CSS_STYLE);
		createEAttribute(annotationsEClass, ANNOTATIONS__LANGUAGE);
		createEAttribute(annotationsEClass, ANNOTATIONS__TITLE);
		createEAttribute(annotationsEClass, ANNOTATIONS__CSS_CLASS);

		hasAttributesEClass = createEClass(HAS_ATTRIBUTES);
		createEReference(hasAttributesEClass, HAS_ATTRIBUTES__ATTRIBUTES);

		blockContentEClass = createEClass(BLOCK_CONTENT);

		paragraphEClass = createEClass(PARAGRAPH);

		tipEClass = createEClass(TIP);

		warningEClass = createEClass(WARNING);

		informationEClass = createEClass(INFORMATION);

		noteEClass = createEClass(NOTE);

		panelEClass = createEClass(PANEL);

		divEClass = createEClass(DIV);

		footNoteEClass = createEClass(FOOT_NOTE);

		quoteEClass = createEClass(QUOTE);

		preformattedEClass = createEClass(PREFORMATTED);

		codeEClass = createEClass(CODE);

		listEClass = createEClass(LIST);
		createEAttribute(listEClass, LIST__LIST_TYPE);
		createEReference(listEClass, LIST__ITEMS);
		createEAttribute(listEClass, LIST__IMBRICATION_LEVEL);

		listItemEClass = createEClass(LIST_ITEM);
		createEAttribute(listItemEClass, LIST_ITEM__IS_LIST);

		tableEClass = createEClass(TABLE);

		tableRowEClass = createEClass(TABLE_ROW);

		tableCellEClass = createEClass(TABLE_CELL);
		createEAttribute(tableCellEClass, TABLE_CELL__IS_CELL_HEADER);
		createEAttribute(tableCellEClass, TABLE_CELL__COLS_PAN);

		// Create enums
		formattingEEnum = createEEnum(FORMATTING);
		listTypeEEnum = createEEnum(LIST_TYPE);
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
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		documentEClass.getESuperTypes().add(this.getContainer());
		simpleContainerEClass.getESuperTypes().add(this.getContainer());
		sectionEClass.getESuperTypes().add(this.getStructureElement());
		sectionEClass.getESuperTypes().add(this.getContainer());
		sectionEClass.getESuperTypes().add(this.getHasAttributes());
		imageEClass.getESuperTypes().add(this.getBlockContent());
		imageEClass.getESuperTypes().add(this.getHasAttributes());
		entityEClass.getESuperTypes().add(this.getText());
		textEClass.getESuperTypes().add(this.getBlockContent());
		textEClass.getESuperTypes().add(this.getHasAttributes());
		linkEClass.getESuperTypes().add(this.getBlockContent());
		linkEClass.getESuperTypes().add(this.getHasAttributes());
		blockEClass.getESuperTypes().add(this.getStructureElement());
		blockEClass.getESuperTypes().add(this.getHasAttributes());
		paragraphEClass.getESuperTypes().add(this.getBlock());
		tipEClass.getESuperTypes().add(this.getBlock());
		warningEClass.getESuperTypes().add(this.getBlock());
		informationEClass.getESuperTypes().add(this.getBlock());
		noteEClass.getESuperTypes().add(this.getBlock());
		panelEClass.getESuperTypes().add(this.getBlock());
		divEClass.getESuperTypes().add(this.getBlock());
		footNoteEClass.getESuperTypes().add(this.getBlock());
		quoteEClass.getESuperTypes().add(this.getBlock());
		preformattedEClass.getESuperTypes().add(this.getBlock());
		codeEClass.getESuperTypes().add(this.getBlock());
		listEClass.getESuperTypes().add(this.getBlock());
		listItemEClass.getESuperTypes().add(this.getBlock());
		listItemEClass.getESuperTypes().add(this.getList());
		listItemEClass.getESuperTypes().add(this.getBlockContent());
		tableEClass.getESuperTypes().add(this.getBlock());
		tableRowEClass.getESuperTypes().add(this.getBlock());
		tableRowEClass.getESuperTypes().add(this.getBlockContent());
		tableCellEClass.getESuperTypes().add(this.getBlock());
		tableCellEClass.getESuperTypes().add(this.getBlockContent());

		// Initialize classes and features; add operations and parameters
		initEClass(documentEClass, Document.class, "Document", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(simpleContainerEClass, SimpleContainer.class, "SimpleContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(structureElementEClass, StructureElement.class, "StructureElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sectionEClass, Section.class, "Section", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSection_Title(), this.getBlock(), null, "title", null, 1, 1, Section.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSection_Level(), ecorePackage.getEInt(), "level", null, 0, 1, Section.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containerEClass, org.eclipse.mylyn.docs.intent.markup.markup.Container.class, "Container", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContainer_Content(), this.getStructureElement(), null, "content", null, 0, -1, org.eclipse.mylyn.docs.intent.markup.markup.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(imageEClass, Image.class, "Image", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImage_Url(), ecorePackage.getEString(), "url", null, 1, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityEClass, Entity.class, "Entity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(textEClass, Text.class, "Text", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getText_Data(), ecorePackage.getEString(), "data", null, 1, 1, Text.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getText_Format(), this.getFormatting(), "format", null, 1, -1, Text.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getText_LineBreak(), ecorePackage.getEBoolean(), "lineBreak", null, 0, 1, Text.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkEClass, Link.class, "Link", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLink_Name(), this.getBlock(), null, "name", null, 1, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLink_HrefOrHashName(), ecorePackage.getEString(), "hrefOrHashName", null, 1, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLink_Target(), this.getHasAttributes(), null, "target", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLink_HasBeenDeclaredWithHTMLSyntax(), ecorePackage.getEBoolean(), "hasBeenDeclaredWithHTMLSyntax", "false", 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(blockEClass, Block.class, "Block", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBlock_Content(), this.getBlockContent(), null, "content", null, 0, -1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotationsEClass, Annotations.class, "Annotations", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnnotations_Id(), ecorePackage.getEString(), "id", null, 0, 1, Annotations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnnotations_CSSStyle(), ecorePackage.getEString(), "CSSStyle", null, 0, 1, Annotations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnnotations_Language(), ecorePackage.getEString(), "language", null, 0, 1, Annotations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnnotations_Title(), ecorePackage.getEString(), "title", null, 0, 1, Annotations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnnotations_CSSClass(), ecorePackage.getEString(), "CSSClass", null, 0, 1, Annotations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hasAttributesEClass, HasAttributes.class, "HasAttributes", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHasAttributes_Attributes(), this.getAnnotations(), null, "attributes", null, 0, 1, HasAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(blockContentEClass, BlockContent.class, "BlockContent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(paragraphEClass, Paragraph.class, "Paragraph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tipEClass, Tip.class, "Tip", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(warningEClass, Warning.class, "Warning", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(informationEClass, Information.class, "Information", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(noteEClass, Note.class, "Note", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(panelEClass, Panel.class, "Panel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(divEClass, Div.class, "Div", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(footNoteEClass, FootNote.class, "FootNote", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(quoteEClass, Quote.class, "Quote", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(preformattedEClass, Preformatted.class, "Preformatted", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(codeEClass, Code.class, "Code", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(listEClass, List.class, "List", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getList_ListType(), this.getListType(), "listType", null, 1, 1, List.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getList_Items(), this.getListItem(), null, "items", null, 0, -1, List.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getList_ImbricationLevel(), ecorePackage.getEInt(), "imbricationLevel", "1", 1, 1, List.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listItemEClass, ListItem.class, "ListItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getListItem_IsList(), ecorePackage.getEBoolean(), "isList", "false", 1, 1, ListItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableEClass, Table.class, "Table", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tableRowEClass, TableRow.class, "TableRow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tableCellEClass, TableCell.class, "TableCell", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTableCell_IsCellHeader(), ecorePackage.getEBoolean(), "isCellHeader", "false", 1, 1, TableCell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableCell_ColsPan(), ecorePackage.getEInt(), "colsPan", "1", 1, 1, TableCell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(formattingEEnum, Formatting.class, "Formatting");
		addEEnumLiteral(formattingEEnum, Formatting.NONE);
		addEEnumLiteral(formattingEEnum, Formatting.EMPHASIS);
		addEEnumLiteral(formattingEEnum, Formatting.STRONG);
		addEEnumLiteral(formattingEEnum, Formatting.ITALIC);
		addEEnumLiteral(formattingEEnum, Formatting.BOLD);
		addEEnumLiteral(formattingEEnum, Formatting.CITATION);
		addEEnumLiteral(formattingEEnum, Formatting.DELETED);
		addEEnumLiteral(formattingEEnum, Formatting.INSERTED);
		addEEnumLiteral(formattingEEnum, Formatting.SUPERSCRIPT);
		addEEnumLiteral(formattingEEnum, Formatting.SUBSCRIPT);
		addEEnumLiteral(formattingEEnum, Formatting.SPAN);
		addEEnumLiteral(formattingEEnum, Formatting.CODE);
		addEEnumLiteral(formattingEEnum, Formatting.MONOSPACE);
		addEEnumLiteral(formattingEEnum, Formatting.UNDERLINED);
		addEEnumLiteral(formattingEEnum, Formatting.QUOTE);

		initEEnum(listTypeEEnum, ListType.class, "ListType");
		addEEnumLiteral(listTypeEEnum, ListType.BULLETED);
		addEEnumLiteral(listTypeEEnum, ListType.NUMERIC);
		addEEnumLiteral(listTypeEEnum, ListType.TABLE_OF_CONTENT);

		// Create resource
		createResource(eNS_URI);
	}

} //MarkupPackageImpl
