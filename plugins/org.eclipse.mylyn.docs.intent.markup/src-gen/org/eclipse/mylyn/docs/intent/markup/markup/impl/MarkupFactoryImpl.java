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
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.mylyn.docs.intent.markup.markup.*;
import org.eclipse.mylyn.docs.intent.markup.markup.Annotations;
import org.eclipse.mylyn.docs.intent.markup.markup.Block;
import org.eclipse.mylyn.docs.intent.markup.markup.Code;
import org.eclipse.mylyn.docs.intent.markup.markup.Div;
import org.eclipse.mylyn.docs.intent.markup.markup.Document;
import org.eclipse.mylyn.docs.intent.markup.markup.Entity;
import org.eclipse.mylyn.docs.intent.markup.markup.FootNote;
import org.eclipse.mylyn.docs.intent.markup.markup.Formatting;
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
import org.eclipse.mylyn.docs.intent.markup.markup.Table;
import org.eclipse.mylyn.docs.intent.markup.markup.TableCell;
import org.eclipse.mylyn.docs.intent.markup.markup.TableRow;
import org.eclipse.mylyn.docs.intent.markup.markup.Text;
import org.eclipse.mylyn.docs.intent.markup.markup.Tip;
import org.eclipse.mylyn.docs.intent.markup.markup.Warning;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MarkupFactoryImpl extends EFactoryImpl implements MarkupFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MarkupFactory init() {
		try {
			MarkupFactory theMarkupFactory = (MarkupFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/intent/markup/0.7"); 
			if (theMarkupFactory != null) {
				return theMarkupFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MarkupFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarkupFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MarkupPackage.DOCUMENT: return (EObject)createDocument();
			case MarkupPackage.SIMPLE_CONTAINER: return (EObject)createSimpleContainer();
			case MarkupPackage.SECTION: return (EObject)createSection();
			case MarkupPackage.IMAGE: return (EObject)createImage();
			case MarkupPackage.ENTITY: return (EObject)createEntity();
			case MarkupPackage.TEXT: return (EObject)createText();
			case MarkupPackage.LINK: return (EObject)createLink();
			case MarkupPackage.BLOCK: return (EObject)createBlock();
			case MarkupPackage.ANNOTATIONS: return (EObject)createAnnotations();
			case MarkupPackage.PARAGRAPH: return (EObject)createParagraph();
			case MarkupPackage.TIP: return (EObject)createTip();
			case MarkupPackage.WARNING: return (EObject)createWarning();
			case MarkupPackage.INFORMATION: return (EObject)createInformation();
			case MarkupPackage.NOTE: return (EObject)createNote();
			case MarkupPackage.PANEL: return (EObject)createPanel();
			case MarkupPackage.DIV: return (EObject)createDiv();
			case MarkupPackage.FOOT_NOTE: return (EObject)createFootNote();
			case MarkupPackage.QUOTE: return (EObject)createQuote();
			case MarkupPackage.PREFORMATTED: return (EObject)createPreformatted();
			case MarkupPackage.CODE: return (EObject)createCode();
			case MarkupPackage.LIST: return (EObject)createList();
			case MarkupPackage.LIST_ITEM: return (EObject)createListItem();
			case MarkupPackage.TABLE: return (EObject)createTable();
			case MarkupPackage.TABLE_ROW: return (EObject)createTableRow();
			case MarkupPackage.TABLE_CELL: return (EObject)createTableCell();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case MarkupPackage.FORMATTING:
				return createFormattingFromString(eDataType, initialValue);
			case MarkupPackage.LIST_TYPE:
				return createListTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case MarkupPackage.FORMATTING:
				return convertFormattingToString(eDataType, instanceValue);
			case MarkupPackage.LIST_TYPE:
				return convertListTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Document createDocument() {
		DocumentImpl document = new DocumentImpl();
		return document;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleContainer createSimpleContainer() {
		SimpleContainerImpl simpleContainer = new SimpleContainerImpl();
		return simpleContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Section createSection() {
		SectionImpl section = new SectionImpl();
		return section;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Image createImage() {
		ImageImpl image = new ImageImpl();
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity createEntity() {
		EntityImpl entity = new EntityImpl();
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text createText() {
		TextImpl text = new TextImpl();
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link createLink() {
		LinkImpl link = new LinkImpl();
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block createBlock() {
		BlockImpl block = new BlockImpl();
		return block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotations createAnnotations() {
		AnnotationsImpl annotations = new AnnotationsImpl();
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Paragraph createParagraph() {
		ParagraphImpl paragraph = new ParagraphImpl();
		return paragraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tip createTip() {
		TipImpl tip = new TipImpl();
		return tip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Warning createWarning() {
		WarningImpl warning = new WarningImpl();
		return warning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Information createInformation() {
		InformationImpl information = new InformationImpl();
		return information;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Note createNote() {
		NoteImpl note = new NoteImpl();
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Panel createPanel() {
		PanelImpl panel = new PanelImpl();
		return panel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Div createDiv() {
		DivImpl div = new DivImpl();
		return div;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FootNote createFootNote() {
		FootNoteImpl footNote = new FootNoteImpl();
		return footNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quote createQuote() {
		QuoteImpl quote = new QuoteImpl();
		return quote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Preformatted createPreformatted() {
		PreformattedImpl preformatted = new PreformattedImpl();
		return preformatted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code createCode() {
		CodeImpl code = new CodeImpl();
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List createList() {
		ListImpl list = new ListImpl();
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListItem createListItem() {
		ListItemImpl listItem = new ListItemImpl();
		return listItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table createTable() {
		TableImpl table = new TableImpl();
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableRow createTableRow() {
		TableRowImpl tableRow = new TableRowImpl();
		return tableRow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableCell createTableCell() {
		TableCellImpl tableCell = new TableCellImpl();
		return tableCell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Formatting createFormattingFromString(EDataType eDataType, String initialValue) {
		Formatting result = Formatting.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFormattingToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListType createListTypeFromString(EDataType eDataType, String initialValue) {
		ListType result = ListType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertListTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarkupPackage getMarkupPackage() {
		return (MarkupPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MarkupPackage getPackage() {
		return MarkupPackage.eINSTANCE;
	}

} //MarkupFactoryImpl
