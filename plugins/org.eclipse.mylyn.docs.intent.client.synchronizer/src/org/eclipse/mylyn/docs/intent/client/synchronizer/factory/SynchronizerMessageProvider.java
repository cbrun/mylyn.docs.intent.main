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
package org.eclipse.mylyn.docs.intent.client.synchronizer.factory;

import org.eclipse.emf.compare.diff.metamodel.AttributeChange;
import org.eclipse.emf.compare.diff.metamodel.DiffElement;
import org.eclipse.emf.compare.diff.metamodel.DiffPackage;
import org.eclipse.emf.compare.diff.metamodel.ModelElementChangeLeftTarget;
import org.eclipse.emf.compare.diff.metamodel.ModelElementChangeRightTarget;
import org.eclipse.emf.compare.diff.metamodel.ReferenceChange;
import org.eclipse.emf.compare.diff.metamodel.UpdateAttribute;
import org.eclipse.emf.compare.diff.metamodel.UpdateReference;
import org.eclipse.emf.compare.diff.metamodel.impl.UpdateAttributeImpl;
import org.eclipse.emf.compare.diff.metamodel.impl.UpdateReferenceImpl;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.mylyn.docs.intent.core.modelingunit.ResourceDeclaration;

/**
 * Provide messages created from a given DiffElement.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public final class SynchronizerMessageProvider {

	/**
	 * Represents a whitespace in a status message.
	 */
	private static final String SYNC_MESSAGES_WHITESPACE = " ";

	private static final String SYNC_MESSAGES_INTERNAL_MODEL = "<b>Current Document</b>";

	private static final String SYNC_MESSAGES_EXTERNAL_MODEL = "<b>Working Copy</b>";

	/**
	 * Represents the separation space between to status.
	 */
	private static final String SYNC_STATUS_SEPARATOR = "<br/><hr/><br/>";

	/**
	 * SynchronizerMessageProvider constructor.
	 */
	private SynchronizerMessageProvider() {

	}

	/**
	 * Create a message from the given {@link DiffElement}.
	 * 
	 * @param diffElement
	 *            the {@link DiffElement} used to create the returned message
	 * @return a message created from the given {@link DiffElement} element
	 */
	public static String createMessageFromDiffElement(DiffElement diffElement) {
		String returnedMessage = null;
		try {
			switch (diffElement.eClass().getClassifierID()) {
				case DiffPackage.ATTRIBUTE_CHANGE:
					returnedMessage = createMessageFromAttributeChange((AttributeChange)diffElement);
					break;

				case DiffPackage.REFERENCE_CHANGE:
					returnedMessage = createMessageFromReferenceChange((ReferenceChange)diffElement);
					break;

				case DiffPackage.UPDATE_ATTRIBUTE:
					returnedMessage = createMessageFromUpdateAttribute((UpdateAttribute)diffElement);
					break;
				case DiffPackage.UPDATE_REFERENCE:
					returnedMessage = createMessageFromUpdateReference((UpdateReference)diffElement);
					break;

				case DiffPackage.MODEL_ELEMENT_CHANGE_LEFT_TARGET:
					returnedMessage = createMessageFromModelElementChangeLeftTarget((ModelElementChangeLeftTarget)diffElement);
					break;
				case DiffPackage.MODEL_ELEMENT_CHANGE_RIGHT_TARGET:
					returnedMessage = createMessageFromModelElementChangeRightTarget((ModelElementChangeRightTarget)diffElement);
					break;
				case DiffPackage.REFERENCE_CHANGE_LEFT_TARGET:
					break;
				case DiffPackage.REFERENCE_CHANGE_RIGHT_TARGET:
					break;
				case DiffPackage.RESOURCE_DIFF:
					break;
				default:
					break;

			}
		} catch (IllegalArgumentException e) {
			returnedMessage = null;
		}
		if (returnedMessage == null) {
			returnedMessage = SynchonizerEObjectNameGetter.computeObjectName(diffElement);
		}
		return returnedMessage;
	}

	/**
	 * Create a message from the given AttributeChange element.
	 * 
	 * @param difference
	 *            the DiffElement used to create the returned message
	 * @return a message created from the given AttributeChange element
	 */
	public static String createMessageFromAttributeChange(AttributeChange difference) {
		return difference.toString();
	}

	/**
	 * Create a message from the given ReferenceChange element.
	 * 
	 * @param difference
	 *            the DiffElement used to create the returned message
	 * @return a message created from the given ReferenceChange element
	 */
	public static String createMessageFromReferenceChange(ReferenceChange difference) {
		return difference.toString();
	}

	/**
	 * Create a message from the given UpdateAttribute element.
	 * 
	 * @param difference
	 *            the DiffElement used to create the returned message
	 * @return a message created from the given UpdateAttribute element
	 */
	public static String createMessageFromUpdateAttribute(UpdateAttribute difference) {
		// We get the attribute
		EStructuralFeature attribute = ((UpdateAttributeImpl)difference).getAttribute();
		// <Attribute's class name> <attributename>
		String returnedMessage = attribute.eClass().getName() + SYNC_MESSAGES_WHITESPACE
				+ attribute.getName();
		// If the container of this attribute has a name, 'in' <name of the instance containing this
		// attribute>
		if (difference.getLeftElement() instanceof ENamedElement) {
			String name = ((ENamedElement)difference.getLeftElement()).getName();
			if (name != null) {
				returnedMessage += " in " + name;
			}
		}
		// Standard comparison message
		returnedMessage += createCompareValuesMessage(difference.getLeftElement().eGet(attribute), difference
				.getRightElement().eGet(attribute));
		return returnedMessage;
	}

	/**
	 * Create a message from the given UpdateAttribute element.
	 * 
	 * @param difference
	 *            the DiffElement used to create the returned message
	 * @return a message created from the given UpdateAttribute element
	 */
	public static String createMessageFromUpdateReference(UpdateReference difference) {
		EStructuralFeature reference = ((UpdateReferenceImpl)difference).getReference();
		String returnedMessage = reference.eClass().getName() + SYNC_MESSAGES_WHITESPACE
				+ reference.getName();

		if (difference.getLeftElement() instanceof ENamedElement) {
			String name = ((ENamedElement)difference.getLeftElement()).getName();
			if (name != null) {
				returnedMessage += " in " + name;
			}
		}
		returnedMessage += createCompareValuesMessage(difference.getLeftElement().eGet(reference), difference
				.getRightElement().eGet(reference));
		return returnedMessage;
	}

	/**
	 * Create a message from the given ModelElementChangeLeftTarget element.
	 * 
	 * @param difference
	 *            the DiffElement used to create the returned message
	 * @return a message created from the given ModelElementChangeLeftTarget element
	 */
	public static String createMessageFromModelElementChangeLeftTarget(ModelElementChangeLeftTarget difference) {
		String returnedMessage = "The " + difference.getLeftElement().eClass().getName();
		if (difference.getLeftElement() instanceof ENamedElement) {
			String name = ((ENamedElement)difference.getLeftElement()).getName();
			if (name != null) {
				returnedMessage += SYNC_MESSAGES_WHITESPACE + name;
			}
		}
		returnedMessage += " is defined in the " + SYNC_MESSAGES_INTERNAL_MODEL
				+ " model<br/>but not in the " + SYNC_MESSAGES_EXTERNAL_MODEL + " model.";
		return returnedMessage;
	}

	/**
	 * Create a message from the given ModelElementChangeRightTarget element.
	 * 
	 * @param difference
	 *            the DiffElement used to create the returned message
	 * @return a message created from the given ModelElementChangeRightTarget element
	 */
	public static String createMessageFromModelElementChangeRightTarget(
			ModelElementChangeRightTarget difference) {
		String returnedMessage = "The " + difference.getRightElement().eClass().getName();
		if (difference.getRightElement() instanceof ENamedElement) {
			String name = ((ENamedElement)difference.getRightElement()).getName();
			if (name != null) {
				returnedMessage += SYNC_MESSAGES_WHITESPACE + name;
			}
		}
		returnedMessage += " is defined in the " + SYNC_MESSAGES_EXTERNAL_MODEL
				+ " model<br/>but not in the " + SYNC_MESSAGES_INTERNAL_MODEL + " model.";
		return returnedMessage;
	}

	/**
	 * Create a standard comparison message between the given value from the repository and the given local
	 * value.
	 * 
	 * @param repositoryValue
	 *            the repositoryValue
	 * @param localValue
	 *            the localValue
	 * @return a standard comparison message between the two given values
	 */
	private static String createCompareValuesMessage(Object repositoryValue, Object localValue) {
		return " has changed.<br/>" + SYNC_MESSAGES_INTERNAL_MODEL + " : " + repositoryValue + "<br/>"
				+ SYNC_MESSAGES_EXTERNAL_MODEL + " : " + localValue;
	}

	/**
	 * Returns a String representing the separation space between to status.
	 * 
	 * @return a String representing the separation space between to status
	 */
	public static String getStatusSeparator() {
		return SYNC_STATUS_SEPARATOR;
	}

	/**
	 * Creates an error message indicating that the given resourceDeclaration hasn't been found externally.
	 * 
	 * @param resourceDeclaration
	 *            the resourceDeclaration that hasn't been found externally
	 * @return an error message indicating that the given resourceDeclaration hasn't been found externally
	 */
	public static String createMessageForNullExternalResource(ResourceDeclaration resourceDeclaration) {
		String returnedMessage = "";
		if (resourceDeclaration.getUri() != null) {
			returnedMessage += "Cannot locate Resource at URI : " + resourceDeclaration.getUri().toString();
		}
		returnedMessage += ".";
		return returnedMessage;
	}
}
