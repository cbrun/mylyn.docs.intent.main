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

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.provider.EcoreItemProviderAdapterFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.jface.bindings.keys.KeySequence;
import org.eclipse.jface.bindings.keys.ParseException;
import org.eclipse.jface.bindings.keys.SWTKeySupport;
import org.eclipse.jface.dialogs.PopupDialog;
import org.eclipse.jface.text.IInformationControl;
import org.eclipse.jface.text.IInformationControlExtension;
import org.eclipse.jface.text.IInformationControlExtension2;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.mylyn.docs.intent.client.ui.IntentEditorActivator;
import org.eclipse.mylyn.docs.intent.client.ui.editor.IntentDocumentProvider;
import org.eclipse.mylyn.docs.intent.client.ui.editor.IntentEditor;
import org.eclipse.mylyn.docs.intent.collab.common.location.IntentLocations;
import org.eclipse.mylyn.docs.intent.collab.handlers.adapters.RepositoryAdapter;
import org.eclipse.mylyn.docs.intent.core.document.IntentDocument;
import org.eclipse.mylyn.docs.intent.core.document.IntentGenericElement;
import org.eclipse.mylyn.docs.intent.core.indexer.IntentIndex;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.ui.dialogs.FilteredTree;
import org.eclipse.ui.dialogs.PatternFilter;

/**
 * This control will provide all the informations needed to display the quick outline to the user.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public class IntentQuickOutlineControl extends PopupDialog implements IInformationControl, IInformationControlExtension, IInformationControlExtension2, DisposeListener {

	/**
	 * String representation of the KeySequence that should be used for toggling the QuickOutline mode.
	 */
	private static final String KEY_SEQUENCE_FOR_TOGGLING = "M1+O";

	/**
	 * ReStrucutred Model editor associated to this quick outline.
	 */
	protected final IntentEditor editor;

	/** Adapter factory used by the content and label providers. */
	private AdapterFactory adapterFactory;

	/** The filtered tree we're displaying. */
	private FilteredTree filteredTree;

	/** Actual viewer displaying the outline. */
	private TreeViewer treeViewer;

	/**
	 * The root of the quick outline in the scope of the current editor.
	 */
	private EObject editorScopedOutlineRoot;

	/**
	 * The root of the quick outline (instance of IntentDocument).
	 */
	private EObject wholeScopedOutlineRoot;

	/**
	 * Indicates if this quickOutline will calculate its root with the local AST (for example a Section) or
	 * use the whole hierarchy (until Document is reached).
	 */
	private boolean considerOnlyLocalASTElements;

	/**
	 * The KeyAdapter which will toggle the QuickOutline mode each time the right keySequence is pressed.
	 */
	private KeyAdapter togglingKeyAdapter;

	/**
	 * Creates a quick line control with the given shell as parent.
	 * 
	 * @param parentShell
	 *            the parent of this control's shell.
	 * @param shellStyle
	 *            The shell style.
	 * @param intentEditor
	 *            Editor to which this outline view is tied
	 * @param considerOnlyLocalASTElements
	 *            Indicates if this quickOutline will calculate its root with the local AST (for example a
	 *            Section) or use the whole hierarchy (until Document is reached)
	 */
	public IntentQuickOutlineControl(Shell parentShell, int shellStyle, IntentEditor intentEditor,
			boolean considerOnlyLocalASTElements) {
		super(parentShell, shellStyle, true, true, false, false, false, null, null);
		editor = intentEditor;
		this.considerOnlyLocalASTElements = considerOnlyLocalASTElements;
		editorScopedOutlineRoot = editor.getIntentContent();

		if (!(editorScopedOutlineRoot instanceof IntentDocument)) {
			setInfoText("Press 'Ctrl+O' to search in the whole document");
		} else {
			System.err.println(editorScopedOutlineRoot + "/" + wholeScopedOutlineRoot);
			setInfoText("Searching in the whole document");
		}
		create();
	}

	/**
	 * Returns the root to consider for this quick outline, according to the considerOnlyLocalASTElements
	 * attribute value.
	 * 
	 * @return the root to consider for this outline
	 */
	private EObject getQuickOutlineRoot() {

		if (considerOnlyLocalASTElements) {
			if (editorScopedOutlineRoot != wholeScopedOutlineRoot) {
				setInfoText("Press 'Ctrl+O' to search in the whole document scope");
			}
			return editorScopedOutlineRoot;
		} else {
			if (editorScopedOutlineRoot != wholeScopedOutlineRoot) {
				setInfoText("Press 'Ctrl+O' to search in the current editor scope");
			}
			if (wholeScopedOutlineRoot == null) {
				wholeScopedOutlineRoot = getSuperRoot(editor.getIntentContent());
			}
			return wholeScopedOutlineRoot;
		}
	}

	/**
	 * Toggle the quickOutline mode and reset the input. <br/>
	 * Indicates if this quickOutline will calculate its root with the local AST (for example a Section) or
	 * use the whole hierarchy (until Document is reached).
	 */
	public void toggleQuickOutlineMode() {
		IntentQuickOutlineControl.this
				.setConsiderOnlyLocalASTElements(!IntentQuickOutlineControl.this.considerOnlyLocalASTElements);
		IntentQuickOutlineControl.this.setInput(null);
	}

	/**
	 * Indicates if this quickOutline will calculate its root with the local AST (for example a Section) or
	 * use the whole hierarchy (until Document is reached).
	 * 
	 * @param considerOnlyLocalASTElements
	 *            Indicates if this quickOutline will calculate its root with the local AST (for example a
	 *            Section) or use the whole hierarchy (until Document is reached)
	 */
	public void setConsiderOnlyLocalASTElements(boolean considerOnlyLocalASTElements) {
		this.considerOnlyLocalASTElements = considerOnlyLocalASTElements;
	}

	/**
	 * Returns the super root of the AST (typically a IntentDocument).
	 * 
	 * @param content
	 *            the content to study
	 * @return the super root of the AST (typically a IntentDocument)
	 */
	private EObject getSuperRoot(EObject content) {

		// If we are already considering a document, we returns this document
		if (content instanceof IntentDocument) {
			return content;
		}

		// Otherwise, we try to get the IntentDocument by containment references
		EObject container = content;

		// We get the content's container until we find a IntentDocument
		while ((container != null) && !(container instanceof IntentDocument) && !(container instanceof Resource)) {
			container = container.eContainer();
		}

		// If then IntentDocument cannot been found (could happen as we use containment proxies)
		if (container == null) {
			container = getSuperRootFromIndex(container);

		}
		return container;
	}

	/**
	 * Returns the super root of the AST (typically a IntentDocument) using the Index.
	 * 
	 * @param content
	 *            the content to study
	 * @return the super root of the AST (typically a IntentDocument)
	 */
	private EObject getSuperRootFromIndex(EObject content) {
		EObject root = null;
		// We use the editor's documentProvider's adapter for getting the IntentDocument form the index
		RepositoryAdapter repositoryAdapter = ((IntentDocumentProvider)this.editor.getDocumentProvider())
				.getListenedElementsHandler().getRepositoryAdapter();
		Resource indexResource = repositoryAdapter.getResource(IntentLocations.GENERAL_INDEX_PATH);
		if (indexResource.getContents().size() > 0) {
			EObject indexRoot = indexResource.getContents().get(0);
			if (indexRoot instanceof IntentIndex) {
				IntentIndex index = (IntentIndex)indexRoot;
				if (index.getEntries().size() > 0) {
					root = index.getEntries().get(0).getReferencedElement();
				}
			}
		}
		if (root == null) {
			root = content;
		}
		return root;
	}

	/**
	 * Returns the KeyAdapter which will toggle the QuickOutline mode each time the right keySequence is
	 * pressed.
	 * 
	 * @return the KeyAdapter which will toggle the QuickOutline mode each time the right keySequence is
	 *         pressed
	 */
	private KeyAdapter getKeyAdapterForToggling() {
		if (togglingKeyAdapter == null) {
			togglingKeyAdapter = new KeyAdapter() {
				public void keyPressed(KeyEvent e) {
					int accelerator = SWTKeySupport.convertEventToUnmodifiedAccelerator(e);
					KeySequence keySequence = KeySequence.getInstance(SWTKeySupport
							.convertAcceleratorToKeyStroke(accelerator));

					try {
						KeySequence expectedKeySequence = KeySequence.getInstance(KEY_SEQUENCE_FOR_TOGGLING);
						if (expectedKeySequence.equals(keySequence)) {
							toggleQuickOutlineMode();
						}
					} catch (ParseException e1) {
						// We simply don't toggle the quickOutline
					}

				}
			};
		}
		return togglingKeyAdapter;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.text.IInformationControl#setInformation(java.lang.String)
	 */
	public void setInformation(String information) {
		// As we are implementing IInformationControlExtension2, this method will never not be called
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.text.IInformationControlExtension2#setInput(java.lang.Object)
	 */
	public void setInput(Object input) {

		IntentOutlineInformationHolder newInputHolder = new IntentOutlineInformationHolder(getQuickOutlineRoot(),
				true);
		if (this.considerOnlyLocalASTElements) {
			treeViewer.setSelection(null);
		}
		treeViewer.setInput(newInputHolder);
		treeViewer.expandToLevel(2);

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.text.IInformationControl#setLocation(org.eclipse.swt.graphics.Point)
	 */
	public void setLocation(Point location) {
		// Only override the shell's location if it's not persisted by the PopupDialog
		if (!getPersistLocation()) {
			getShell().setLocation(location);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.text.IInformationControl#setSize(int, int)
	 */
	public void setSize(int width, int height) {
		getShell().setSize(width, height);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.text.IInformationControl#setSizeConstraints(int, int)
	 */
	public void setSizeConstraints(int maxWidth, int maxHeight) {
		// We'll use the dialog's size
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.text.IInformationControl#setVisible(boolean)
	 */
	public void setVisible(boolean visible) {

		if (visible) {
			open();
		} else {
			saveDialogBounds(getShell());
			getShell().setVisible(false);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.swt.events.DisposeListener#widgetDisposed(org.eclipse.swt.events.DisposeEvent)
	 */
	public void widgetDisposed(DisposeEvent event) {
		adapterFactory = null;
		filteredTree = null;
		treeViewer = null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.dialogs.PopupDialog#hasInfoArea()
	 */
	@Override
	protected boolean hasInfoArea() {
		return true;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.dialogs.PopupDialog#createDialogArea(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		createTreeViewer(parent);
		// We add a keyAdapter to the treeViewer and the search input for detecting M1+O
		treeViewer.getControl().addKeyListener(getKeyAdapterForToggling());
		filteredTree.getFilterControl().addKeyListener(getKeyAdapterForToggling());
		addDisposeListener(this);
		return treeViewer.getControl();
	}

	/**
	 * Creates the outline's tree viewer.
	 * 
	 * @param parent
	 *            parent composite.
	 */
	protected void createTreeViewer(Composite parent) {
		createFilteredTree(parent);
		treeViewer = filteredTree.getViewer();

		final Tree tree = treeViewer.getTree();

		tree.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent event) {
				if (event.character == SWT.CR || event.character == SWT.KEYPAD_CR) {
					TreeItem[] selection = tree.getSelection();
					Object selected = selection[0].getData();
					if (selected instanceof IntentGenericElement) {
						IntentGenericElement element = (IntentGenericElement)selection[0].getData();
						editor.selectRange(element);
						dispose();
					}
				} else {
					if (event.character == SWT.ESC) {
						dispose();
					}

				}
			}

		});

		tree.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDoubleClick(MouseEvent event) {
				if (tree.equals(event.getSource())) {
					if (tree.getSelectionCount() != 1 || event.button != 1) {
						return;
					}

					TreeItem[] selection = tree.getSelection();

					if (selection[0].getData() instanceof IntentGenericElement) {
						IntentGenericElement element = (IntentGenericElement)selection[0].getData();
						editor.selectRange(element);
						dispose();
					}
				}
			}
		});

		treeViewer.setContentProvider(new OutlineContentProvider(getAdapterFactory(), getQuickOutlineRoot(),
				true));
		treeViewer.setLabelProvider(new IntentOutlinePageLabelProvider(getAdapterFactory()));

		// We want to remove everything that's not an IntentGenericElement from the outline view
		treeViewer.addFilter(new ViewerFilter() {
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer,
			 *      java.lang.Object, java.lang.Object)
			 */
			@Override
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return element instanceof IntentGenericElement;
			}
		});
	}

	/**
	 * Externalized here due to the number of "catch" clauses the reflective call to a constructor requires.
	 * 
	 * @param parent
	 *            Parent composite of the filtered tree.
	 */
	private void createFilteredTree(Composite parent) {
		Constructor<FilteredTree> filteredTreeConstructor = null;
		try {
			filteredTreeConstructor = FilteredTree.class.getConstructor(Composite.class, int.class,
					PatternFilter.class, boolean.class);
			filteredTree = filteredTreeConstructor.newInstance(parent, SWT.SINGLE | SWT.H_SCROLL
					| SWT.V_SCROLL, new QuickOutlinePatternFilter(), true);

			// We add a listener that ask the editor to deactivate the quickOutline context
			filteredTree.addDisposeListener(new DisposeListener() {

				public void widgetDisposed(DisposeEvent e) {
					// TODO Handle this outline has been disposed
				}
			});
		} catch (NoSuchMethodException e) {
			// Eclipse < 3.5
			try {
				filteredTreeConstructor = FilteredTree.class.getConstructor(Composite.class, int.class,
						PatternFilter.class);
				filteredTree = filteredTreeConstructor.newInstance(parent, SWT.SINGLE | SWT.H_SCROLL
						| SWT.V_SCROLL, new QuickOutlinePatternFilter());
			} catch (NoSuchMethodException ee) {
				// shouldn't happen
				IntentEditorActivator.getDefault().getLog()
						.log(new Status(IStatus.ERROR, IntentEditorActivator.PLUGIN_ID, ee.getMessage()));
			} catch (IllegalArgumentException ee) {
				// shouldn't happen
				IntentEditorActivator.getDefault().getLog()
						.log(new Status(IStatus.ERROR, IntentEditorActivator.PLUGIN_ID, ee.getMessage()));
			} catch (InstantiationException ee) {
				// shouldn't happen
				IntentEditorActivator.getDefault().getLog()
						.log(new Status(IStatus.ERROR, IntentEditorActivator.PLUGIN_ID, ee.getMessage()));
			} catch (IllegalAccessException ee) {
				// shouldn't happen
				IntentEditorActivator.getDefault().getLog()
						.log(new Status(IStatus.ERROR, IntentEditorActivator.PLUGIN_ID, ee.getMessage()));
			} catch (InvocationTargetException ee) {
				// shouldn't happen
				IntentEditorActivator.getDefault().getLog()
						.log(new Status(IStatus.ERROR, IntentEditorActivator.PLUGIN_ID, ee.getMessage()));
			}
		} catch (IllegalArgumentException e) {
			IntentEditorActivator.getDefault().getLog()
					.log(new Status(IStatus.ERROR, IntentEditorActivator.PLUGIN_ID, e.getMessage()));
		} catch (InstantiationException e) {
			IntentEditorActivator.getDefault().getLog()
					.log(new Status(IStatus.ERROR, IntentEditorActivator.PLUGIN_ID, e.getMessage()));
		} catch (IllegalAccessException e) {
			IntentEditorActivator.getDefault().getLog()
					.log(new Status(IStatus.ERROR, IntentEditorActivator.PLUGIN_ID, e.getMessage()));
		} catch (InvocationTargetException e) {
			IntentEditorActivator.getDefault().getLog()
					.log(new Status(IStatus.ERROR, IntentEditorActivator.PLUGIN_ID, e.getMessage()));
		}
	}

	/**
	 * Returns the adapter factory used by this viewer.
	 * 
	 * @return The adapter factory used by this viewer.
	 */
	protected AdapterFactory getAdapterFactory() {
		if (adapterFactory == null) {
			List<AdapterFactory> factories = new ArrayList<AdapterFactory>();
			factories.add(new IntentOutlinePageItemProviderAdapterFactory(true));
			factories.add(new ResourceItemProviderAdapterFactory());
			factories.add(new EcoreItemProviderAdapterFactory());
			factories.add(new ReflectiveItemProviderAdapterFactory());
			adapterFactory = new ComposedAdapterFactory(factories);
		}
		return adapterFactory;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.text.IInformationControl#addDisposeListener(org.eclipse.swt.events.DisposeListener)
	 */
	public void removeDisposeListener(DisposeListener listener) {
		getShell().removeDisposeListener(listener);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.text.IInformationControl#removeFocusListener(org.eclipse.swt.events.FocusListener)
	 */
	public void removeFocusListener(FocusListener listener) {
		getShell().removeFocusListener(listener);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.text.IInformationControl#setBackgroundColor(org.eclipse.swt.graphics.Color)
	 */
	public void setBackgroundColor(Color background) {
		applyBackgroundColor(background, getContents());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.text.IInformationControl#setFocus()
	 */
	public void setFocus() {
		getShell().forceFocus();
		filteredTree.setFocus();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.text.IInformationControl#setForegroundColor(org.eclipse.swt.graphics.Color)
	 */
	public void setForegroundColor(Color foreground) {
		applyForegroundColor(foreground, getContents());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.text.IInformationControlExtension#hasContents()
	 */
	public boolean hasContents() {
		// FIXME check TreeViewer filtered content and return false if no visible children
		return true;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.text.IInformationControl#computeSizeHint()
	 */
	public Point computeSizeHint() {
		return getShell().getSize();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.text.IInformationControl#dispose()
	 */
	public void dispose() {
		filteredTree.dispose();
		close();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.text.IInformationControl#addDisposeListener(org.eclipse.swt.events.DisposeListener)
	 */
	public void addDisposeListener(DisposeListener listener) {
		getShell().addDisposeListener(listener);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.text.IInformationControl#isFocusControl()
	 */
	public boolean isFocusControl() {
		return getShell() == Display.getCurrent().getActiveShell();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.text.IInformationControl#addFocusListener(org.eclipse.swt.events.FocusListener)
	 */
	public void addFocusListener(FocusListener listener) {
		getShell().addFocusListener(listener);
	}

}
