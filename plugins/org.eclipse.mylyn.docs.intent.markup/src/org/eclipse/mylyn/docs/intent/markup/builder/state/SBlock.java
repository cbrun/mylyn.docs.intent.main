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
package org.eclipse.mylyn.docs.intent.markup.builder.state;

import java.util.Stack;

import org.eclipse.mylyn.docs.intent.markup.builder.BuilderState;
import org.eclipse.mylyn.docs.intent.markup.builder.operation.HasAttributeCopyAttributes;
import org.eclipse.mylyn.docs.intent.markup.builder.state.utils.CharacterEscapedAnalyser;
import org.eclipse.mylyn.docs.intent.markup.markup.Block;
import org.eclipse.mylyn.docs.intent.markup.markup.Entity;
import org.eclipse.mylyn.docs.intent.markup.markup.Formatting;
import org.eclipse.mylyn.docs.intent.markup.markup.Image;
import org.eclipse.mylyn.docs.intent.markup.markup.Link;
import org.eclipse.mylyn.docs.intent.markup.markup.ListItem;
import org.eclipse.mylyn.docs.intent.markup.markup.ListType;
import org.eclipse.mylyn.docs.intent.markup.markup.MarkupFactory;
import org.eclipse.mylyn.docs.intent.markup.markup.Text;
import org.eclipse.mylyn.wikitext.core.parser.Attributes;
import org.eclipse.mylyn.wikitext.core.parser.DocumentBuilder.BlockType;
import org.eclipse.mylyn.wikitext.core.parser.DocumentBuilder.SpanType;
import org.eclipse.mylyn.wikitext.core.parser.LinkAttributes;

/**
 * class defining the behaviors of the parser if the current element is a bloc.
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public class SBlock extends BuilderState {

	/**
	 * Block to manage for this SBlock.
	 */
	protected Block block;

	/**
	 * Current text, used to assign multiple format to the same text.
	 */
	protected Text currentText;

	/**
	 * Current Link, used to assign the link name after its creation.
	 */
	// private Link currentLink;

	/**
	 * Stack representing the current styles to apply to a text.
	 */
	protected Stack<Formatting> spanStack;

	/**
	 * SBlock constructor.
	 * 
	 * @param previous
	 *            previous state
	 * @param block
	 *            Model element to stock.
	 */
	public SBlock(BuilderState previous, Block block) {
		super(previous);
		this.block = block;
		spanStack = new Stack<Formatting>();
	}

	/**
	 * Adds all the format contained in the stack to the given text.
	 * 
	 * @param text
	 *            Text on which to apply the formats of the stack.
	 */
	protected void addAllFormatsFromStack(Text text) {
		if (!spanStack.isEmpty()) {
			for (Formatting format : spanStack) {
				text.getFormat().add(format);
			}
			// if the Text has currently the 'none' format
			if (text.getFormat().contains(Formatting.NONE)) {
				// we remove this default format, because a specific format is
				// required.
				text.getFormat().remove(Formatting.NONE);
			}
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.markup.builder.BuilderState#endBlock()
	 */
	@Override
	public BuilderState endBlock() {
		return previousState();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.markup.builder.BuilderState#beginBlock(org.eclipse.mylyn.wikitext.core.parser.DocumentBuilder.BlockType,
	 *      org.eclipse.mylyn.wikitext.core.parser.Attributes)
	 */
	@Override
	public BuilderState beginBlock(BlockType type, Attributes attributes) {
		BuilderState returnState = this;
		switch (type) {
			case QUOTE:
			case CODE:
				returnState = previousState().beginBlock(type, attributes);
				break;
			case BULLETED_LIST:
			case NUMERIC_LIST:
				// We create a listItem considered has a list of level 2
				ListItem newItem = MarkupFactory.eINSTANCE.createListItem();
				new HasAttributeCopyAttributes(newItem).setValues(attributes);
				if (type == BlockType.BULLETED_LIST) {
					newItem.setListType(ListType.BULLETED);
				} else {
					newItem.setListType(ListType.NUMERIC);
				}

				newItem.setIsList(true);
				if (block instanceof ListItem) {
					((ListItem)block).setIsList(true);
					newItem.setImbricationLevel(((ListItem)block).getImbricationLevel() + 1);
					((ListItem)block).getItems().add(newItem);
				}
				returnState = new SList(this, newItem);
				break;
			default:
				break;

		}
		return returnState;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.markup.builder.BuilderState#characters(java.lang.String)
	 */
	@Override
	public BuilderState characters(String text) {

		// We simply create the Text.
		Text txt = MarkupFactory.eINSTANCE.createText();
		txt.setData(text);

		// We also add to this text the current formats in use.
		addAllFormatsFromStack(txt);
		currentText = txt;
		block.getContent().add(txt);
		return new SText(this, txt);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.markup.builder.BuilderState#charactersUnescaped(java.lang.String)
	 */
	@Override
	public BuilderState charactersUnescaped(String literal) {
		BuilderState returnState = null;

		// If the unescaped character matches to a link declaration
		if (CharacterEscapedAnalyser.isLinkDeclaration(literal)) {
			Link newLink = MarkupFactory.eINSTANCE.createLink();
			newLink.setHrefOrHashName(CharacterEscapedAnalyser.getLinkHref(literal));
			newLink.setHasBeenDeclaredWithHTMLSyntax(true);
			String linkTitle = CharacterEscapedAnalyser.getLinkTitle(literal);
			// If the link has a title
			if (linkTitle.length() > 0) {
				// We create its attributes and initialize the Title value.
				Attributes linkAttributes = new Attributes();
				linkAttributes.setTitle(linkTitle);
				new HasAttributeCopyAttributes(newLink).setValues(linkAttributes);
			}

			// We create the Name block of the new link
			Block linkName = MarkupFactory.eINSTANCE.createBlock();
			newLink.setName(linkName);

			block.getContent().add(newLink);
			returnState = new SLink(this, newLink.getName(), newLink);
		}
		// If the unescaped characted matches to a LineBreak declaration
		if (CharacterEscapedAnalyser.isLineBreak(literal)) {
			// We create an empty text with a lineBreak.
			Text text = MarkupFactory.eINSTANCE.createText();
			text.setData("");
			text.setLineBreak(true);
			block.getContent().add(text);
			returnState = this;
		}

		// If the unescaped character matches to a tabulation declaration
		if (CharacterEscapedAnalyser.isTabulation(literal)) {
			Entity entity = MarkupFactory.eINSTANCE.createEntity();
			entity.setData("<dd/>");
			entity.setLineBreak(false);
			block.getContent().add(entity);
			returnState = this;
		}
		if (returnState != null) {
			return returnState;
		}
		return super.charactersUnescaped(literal);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.markup.builder.BuilderState#lineBreak()
	 */
	@Override
	public BuilderState lineBreak() {
		// If the last content of the block is a text, we set the lineBreak.
		if ((block.getContent().size() > 0)
				&& (block.getContent().get(block.getContent().size() - 1) instanceof Text)) {
			((Text)block.getContent().get(block.getContent().size() - 1)).setLineBreak(true);
		}
		return this;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.markup.builder.BuilderState#entityReference(java.lang.String)
	 */
	@Override
	public BuilderState entityReference(String entity) {

		Entity newEntity = MarkupFactory.eINSTANCE.createEntity();
		newEntity.setData(entity);
		addAllFormatsFromStack(newEntity);
		// if (currentLink != null) {
		// if (currentLink.getName() == null) {
		// Block bloc = MarkupFactory.eINSTANCE.createBlock();
		// currentLink.setName(bloc);
		// }
		// currentLink.getName().getContent().add(newEntity);
		// return this;
		// } else {
		block.getContent().add(newEntity);
		return new SText(this, newEntity);

		// }
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.markup.builder.BuilderState#beginSpan(org.eclipse.mylyn.wikitext.core.parser.DocumentBuilder.SpanType,
	 *      org.eclipse.mylyn.wikitext.core.parser.Attributes)
	 */
	@Override
	public BuilderState beginSpan(SpanType type, Attributes attributes) {
		BuilderState returnState = null;

		// If the spanType is LINK
		if (type == SpanType.LINK) {
			// we create a new Link with the given attributes
			LinkAttributes linkAttributes = (LinkAttributes)attributes;
			Link link = MarkupFactory.eINSTANCE.createLink();
			link.setHrefOrHashName(linkAttributes.getHref());
			link.setHasBeenDeclaredWithHTMLSyntax(false);
			new HasAttributeCopyAttributes(link).setValues(attributes);
			// We initialize the link content
			Block linkName = MarkupFactory.eINSTANCE.createBlock();
			link.setName(linkName);
			block.getContent().add(link);

			returnState = new SLink(this, linkName, link);

		} else {

			// We add this span in the format stack.
			if (!spanStack.contains(Formatting.get(type.name().toLowerCase()))) {
				spanStack.add(Formatting.get(type.name().toLowerCase()));
			}
			// If there is a current text with no data
			if ((currentText != null) && (currentText.getData() == null)) {
				// we add the format to this currentText
				currentText.getFormat().add(Formatting.get(type.name().toLowerCase()));
				// if the Text has currently the 'none' format
				if (currentText.getFormat().contains(Formatting.NONE)) {
					// we remove this default format, because a specific format
					// is required.
					currentText.getFormat().remove(Formatting.NONE);
				}
				returnState = new SText(this, currentText);
			} else {
				Text txt = MarkupFactory.eINSTANCE.createText();
				// if the Text has currently the 'none' format
				if (txt.getFormat().contains(Formatting.NONE)) {
					// we remove this default format, because a specific format
					// is required.
					txt.getFormat().remove(Formatting.NONE);
				}
				txt.getFormat().add(Formatting.get(type.name().toLowerCase()));
				// We also copy the formats of the stack
				addAllFormatsFromStack(txt);
				new HasAttributeCopyAttributes(txt).setValues(attributes);
				block.getContent().add(txt);
				currentText = txt;
				returnState = new SText(this, txt);
			}
		}
		return returnState;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.markup.builder.BuilderState#endSpan()
	 */
	@Override
	public BuilderState endSpan() {

		// We remove the last declared span.
		spanStack.pop();

		return this;
	};

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.markup.builder.BuilderState#image(org.eclipse.mylyn.wikitext.core.parser.Attributes,
	 *      java.lang.String)
	 */
	@Override
	public BuilderState image(Attributes attributes, String url) {
		Image img = MarkupFactory.eINSTANCE.createImage();
		img.setUrl(url);
		new HasAttributeCopyAttributes(img).setValues(attributes);
		block.getContent().add(img);
		return this;
	}
	
	@Override
	public BuilderState imageLink(Attributes attributes,
			Attributes imageAttributes, String href, String imageUrl) {
		Image img = MarkupFactory.eINSTANCE.createImage();
		img.setUrl(imageUrl);
		new HasAttributeCopyAttributes(img).setValues(attributes);
		block.getContent().add(img);
		return this;

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.markup.builder.BuilderState#link(org.eclipse.mylyn.wikitext.core.parser.Attributes,
	 *      java.lang.String, java.lang.String)
	 */
	@Override
	public BuilderState link(Attributes attributes, String hrefOrHashName, String text) {
		Link lnk = MarkupFactory.eINSTANCE.createLink();
		lnk.setHrefOrHashName(hrefOrHashName);

		Text linkNameContent = MarkupFactory.eINSTANCE.createText();
		linkNameContent.setData(text);
		Block linkName = MarkupFactory.eINSTANCE.createBlock();
		linkName.getContent().add(linkNameContent);
		lnk.setName(linkName);
		lnk.setHasBeenDeclaredWithHTMLSyntax(false);
		new HasAttributeCopyAttributes(lnk).setValues(attributes);
		block.getContent().add(lnk);
		return super.link(attributes, hrefOrHashName, text);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.mylyn.docs.intent.markup.builder.BuilderState#endHeading()
	 */
	@Override
	public BuilderState endHeading() {
		return previousState();
	}
}
