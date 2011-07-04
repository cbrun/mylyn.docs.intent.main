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
package org.eclipse.mylyn.docs.intent.collab.test.clients;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.mylyn.docs.intent.collab.handlers.ReadWriteRepositoryObjectHandler;
import org.eclipse.mylyn.docs.intent.collab.handlers.adapters.ReadOnlyException;
import org.eclipse.mylyn.docs.intent.collab.handlers.adapters.SaveException;
import org.eclipse.mylyn.docs.intent.collab.handlers.notification.RepositoryChangeNotification;
import org.eclipse.mylyn.docs.intent.collab.test.ide.AbstractWorkspaceRepositoryTest;
import org.eclipse.mylyn.docs.intent.collab.test.model.TestPackage.AbstractTestClass;
import org.eclipse.mylyn.docs.intent.collab.test.model.TestPackage.TestClass1;
import org.eclipse.mylyn.docs.intent.collab.test.model.TestPackage.TestClass2;
import org.eclipse.mylyn.docs.intent.collab.test.model.TestPackage.TestIndex;
import org.eclipse.mylyn.docs.intent.collab.test.model.TestPackage.TestIndexEntry;
import org.eclipse.mylyn.docs.intent.collab.test.model.TestPackage.TestPackageFactory;
import org.eclipse.mylyn.docs.intent.collab.test.settings.TestCollabSettings;

/**
 * RepositoryClient that add content to the repository.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public class RepositoryWriterTestRepositoryClient extends AbstractTestRepositoryClient {

	/**
	 * constructor.
	 * 
	 * @param testToNotify
	 *            the test class to notify when receiving a change notification
	 */
	public RepositoryWriterTestRepositoryClient(AbstractWorkspaceRepositoryTest testToNotify) {
		super(testToNotify);
		// TODO Auto-generated constructor stub
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.mylyn.docs.intent.collab.test.clients.AbstractTestRepositoryClient#handleChangeNotification(org.eclipse.mylyn.docs.intent.collab.handlers.notification.RepositoryChangeNotification)
	 */
	@Override
	public void handleChangeNotification(RepositoryChangeNotification notification) {
		// We do nothing as this client should never receive any notification
	}

	/**
	 * Returns the TestIndex of the repository using the objectHandler.
	 * 
	 * @return the TestIndex of the repository
	 */
	public TestIndex getIndex() {

		// We get the TestIndex
		Resource indexResource = this.repositoryObjectHandler.getRepositoryAdapter().getResource(
				TestCollabSettings.TEST_INDEX);
		TestIndex testIndex = (TestIndex)indexResource.getContents().get(0);
		return testIndex;
	}

	/**
	 * Saves the modifications using the repositoryObjectHandler.
	 */
	private void saveModifications() {
		try {
			((ReadWriteRepositoryObjectHandler)this.repositoryObjectHandler).save();
		} catch (ReadOnlyException e) {
			// As we opened a save context, no exception can occur
		} catch (SaveException e) {
			// if a saveException occur, we have to undo the current transaction
			e.printStackTrace();
			try {
				((ReadWriteRepositoryObjectHandler)this.repositoryObjectHandler).undo();
			} catch (ReadOnlyException e1) {
				// As we opened a save context, no exception can occur
			}
		}
	}

	/**
	 * Creates an instance of the given eClass on the repository.
	 * 
	 * @param newElementEClass
	 *            the eClass of the element to create on the repository
	 * @param newElementName
	 *            the name to set to the element to create
	 * @return the created instance
	 */
	public AbstractTestClass createNewInstance(EClass newElementEClass, String newElementName) {

		TestIndex testIndex = getIndex();

		// We create a new instance and add it to the index
		AbstractTestClass createdElement = (AbstractTestClass)TestPackageFactory.eINSTANCE
				.create(newElementEClass);
		createdElement.setName(newElementName);
		if (createdElement instanceof TestClass1) {
			((TestClass1)createdElement).setTheAttributeToListen("attToListenValue");
		}
		TestIndexEntry indexEntry = TestPackageFactory.eINSTANCE.createTestIndexEntry();
		indexEntry.setReferencedElement(createdElement);
		testIndex.getEntries().add(indexEntry);

		// we save the modifications
		saveModifications();
		return createdElement;
	}

	/**
	 * Does a sample modification on the given element and commit the changes on the repository.
	 * 
	 * @param elementToModify
	 *            the element to modify
	 * @return the modified Element
	 */
	public AbstractTestClass modifyElementAndSave(AbstractTestClass elementToModify) {
		this.repositoryObjectHandler.getRepositoryAdapter().openSaveContext();

		AbstractTestClass updatedElementToModify = (AbstractTestClass)this.repositoryObjectHandler
				.getRepositoryAdapter().reload(elementToModify);
		modifyElement(updatedElementToModify);

		// we save the modifications
		saveModifications();
		this.repositoryObjectHandler.getRepositoryAdapter().closeContext();
		return updatedElementToModify;
	}

	/**
	 * Does a sample modification on the given element.
	 * 
	 * @param elementToModify
	 *            the element to modify
	 */
	public void modifyElement(AbstractTestClass elementToModify) {

		if (elementToModify instanceof TestClass1) {
			((TestClass1)elementToModify).setTheAttributeToListen("new"
					+ ((TestClass1)elementToModify).getTheAttributeToListen());
		} else {
			((TestClass2)elementToModify).setName("new" + ((TestClass2)elementToModify).getName());
		}
	}
}
