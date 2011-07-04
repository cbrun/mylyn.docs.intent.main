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
package org.eclipse.mylyn.docs.intent.client.ui.editor.outline;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.mylyn.docs.intent.core.descriptionunit.DescriptionUnit;
import org.eclipse.mylyn.docs.intent.core.document.IntentGenericElement;
import org.eclipse.mylyn.docs.intent.core.document.IntentStructuredElement;
import org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnitInstructionReference;
import org.eclipse.mylyn.docs.intent.core.modelingunit.NewObjectValueForStructuralFeature;
import org.eclipse.mylyn.docs.intent.core.modelingunit.ResourceDeclaration;

/**
 * This will be used as the content provider of our content outline and quick outline view.
 * 
 * @author <a href="mailto:laurent.goubet@obeo.fr">Laurent Goubet</a>
 */
public class OutlineContentProvider extends AdapterFactoryContentProvider {

	/**
	 * Indicates if this content provider must hide the description units content.
	 */
	private boolean hideDescriptionUnitsContent;

	/**
	 * The root element of the content to provide.
	 */
	private Object rootElement;

	/**
	 * QuickOutlineContentProvider constructor.
	 * 
	 * @param adapterFactory
	 *            the adapter factory to use
	 * @param rootElement
	 *            the root element of the content to provide
	 */
	public OutlineContentProvider(AdapterFactory adapterFactory, Object rootElement) {
		this(adapterFactory, rootElement, false);
	}

	/**
	 * QuickOutlineContentProvider constructor.
	 * 
	 * @param hideDescriptionUnitsContent
	 *            indicates if this content provider will have to hide description units content
	 * @param adapterFactory
	 *            the adapter factory to use
	 * @param rootElement
	 *            the root element of the content to provide
	 */
	public OutlineContentProvider(AdapterFactory adapterFactory, Object rootElement,
			boolean hideDescriptionUnitsContent) {
		super(adapterFactory);
		this.hideDescriptionUnitsContent = hideDescriptionUnitsContent;
		this.rootElement = rootElement;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider#getChildren(java.lang.Object)
	 */
	@Override
	public Object[] getChildren(Object object) {

		Set<EObject> children = new LinkedHashSet<EObject>();

		if (object instanceof IntentGenericElement) {

			// If the given element is a Resource Declaration, we only add its content
			if (object instanceof ResourceDeclaration) {
				ResourceDeclaration resourceDeclaration = (ResourceDeclaration)object;

				for (ModelingUnitInstructionReference root : resourceDeclaration.getContent()) {
					children.add(root);
				}
			}

			// If the given element is a description unit and
			// if this content provider has to hide description unit contents
			// we return an empty table
			if (!(hideDescriptionUnitsContent && (object instanceof DescriptionUnit))) {

				// We add all the IntentGenericElements contained in this element
				EObject element = (EObject)object;
				for (EObject containedElement : element.eContents()) {

					if (containedElement instanceof IntentGenericElement) {

						children.add(getValueForChildren((IntentGenericElement)containedElement));
					}
				}
			}

		}
		return children.toArray();
	}

	/**
	 * Returns the value of the given children according to its type.
	 * 
	 * @param children
	 *            the children to inspect
	 * @return the value of the given children according to its type
	 */
	private EObject getValueForChildren(IntentGenericElement children) {

		EObject valueForChildren = null;
		// If the instruction is a new Object value, we directly render the contained
		// instantiation instruction
		if (children instanceof NewObjectValueForStructuralFeature) {
			valueForChildren = ((NewObjectValueForStructuralFeature)children).getValue();
		} else {
			valueForChildren = children;
		}
		return valueForChildren;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider#getElements(java.lang.Object)
	 */
	@Override
	public Object[] getElements(Object object) {
		Set<EObject> children = new LinkedHashSet<EObject>();
		// For a IntentOutlineInformationHolder
		if (object instanceof IntentOutlineInformationHolder) {

			IntentOutlineInformationHolder informationHolder = (IntentOutlineInformationHolder)object;

			// If the element is the root of the document
			if (informationHolder.isRoot()) {
				// We define it as the only returned element
				children.add(informationHolder.getElement());
			}
		}
		if (object instanceof IntentStructuredElement) {
			EObject element = (EObject)object;

			// We add all the IntentGenericElements contained in this element
			for (EObject containedElement : element.eContents()) {

				if (containedElement instanceof IntentGenericElement) {

					children.add(containedElement);

				}
			}

		}
		return children.toArray();

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider#hasChildren(java.lang.Object)
	 */
	@Override
	public boolean hasChildren(Object object) {

		boolean hasChildren = false;

		// If we have to ignore description units content
		if ((this.hideDescriptionUnitsContent) && (object instanceof DescriptionUnit)) {
			return false;
		}

		// An object has children if it's a Genericelement and contains at least one IntentGenericElement.
		if (object instanceof IntentGenericElement) {
			if (object instanceof ResourceDeclaration) {
				hasChildren = true;
			}
			Iterator<EObject> contentIterator = ((EObject)object).eContents().iterator();
			while (!hasChildren && contentIterator.hasNext()) {
				hasChildren = contentIterator.next() instanceof IntentGenericElement;
			}
		}
		return hasChildren;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider#notifyChanged(org.eclipse.emf.common.notify.Notification)
	 */
	@Override
	public void notifyChanged(Notification notification) {
		// Bypass notifications
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider#getParent(java.lang.Object)
	 */
	@Override
	public Object getParent(Object object) {

		if (object == rootElement) {
			return null;
		}
		return super.getParent(object);
	}
}
