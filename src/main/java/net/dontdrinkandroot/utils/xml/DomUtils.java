/**
 * Copyright (C) 2012 Philip W. Sorst <philip@sorst.net>
 * and individual contributors as indicated
 * by the @authors tag.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.dontdrinkandroot.utils.xml;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import net.dontdrinkandroot.utils.ISO_3166_1_alpha2;
import net.dontdrinkandroot.utils.lang.StringUtils;
import net.dontdrinkandroot.utils.lang.time.DateUtils;


public class DomUtils
{

	public static final Logger LOGGER = LoggerFactory.getLogger(DomUtils.class);


	/**
	 * Disabled constructor, utility class.
	 */
	protected DomUtils()
	{
		/* Noop */
	}

	/**
	 * Retrieve the element body as a string.
	 *
	 * @param element
	 *            The element to process.
	 * @return The element body as string or null.
	 */
	public static String toNonEmptyString(final Element element)
	{
		if (!DomUtils.checkPreconditions(element)) {
			return null;
		}

		return element.getTextContent();
	}

	public static String toNonEmptyString(final Element element, final String attributeName)
	{
		if (!DomUtils.checkAttributeProconditions(element, attributeName)) {
			return null;
		}

		final String text = element.getAttribute(attributeName);

		return text;
	}

	public static Integer toInteger(final Element element)
	{
		if (!DomUtils.checkPreconditions(element)) {
			return null;
		}

		try {

			return Integer.parseInt(element.getTextContent());

		} catch (final NumberFormatException e) {
			DomUtils.LOGGER.error("Parsing to Integer failed: " + e.getMessage());
			return null;
		}
	}

	public static Integer toInteger(final Element element, final String attributeName)
	{
		if (!DomUtils.checkAttributeProconditions(element, attributeName)) {
			return null;
		}

		try {

			return Integer.parseInt(element.getAttribute(attributeName));

		} catch (final NumberFormatException e) {
			DomUtils.LOGGER.error("Parsing " + attributeName + " to Integer failed: " + e.getMessage());
			return null;
		}
	}

	public static Long toLong(final Element element)
	{
		if (!DomUtils.checkPreconditions(element)) {
			return null;
		}

		try {

			return Long.parseLong(element.getTextContent());

		} catch (final NumberFormatException e) {
			DomUtils.LOGGER.error("Parsing to Long failed: " + e.getMessage());
			return null;
		}
	}

	public static Long toLong(final Element element, final String attributeName)
	{
		if (!DomUtils.checkAttributeProconditions(element, attributeName)) {
			return null;
		}

		try {

			return Long.parseLong(element.getAttribute(attributeName));

		} catch (final NumberFormatException e) {
			DomUtils.LOGGER.error("Parsing " + attributeName + " to Long failed: " + e.getMessage());
			return null;
		}
	}

	public static Float toFloat(final Element element)
	{
		if (!DomUtils.checkPreconditions(element)) {
			return null;
		}

		try {

			return Float.parseFloat(element.getTextContent());

		} catch (final NumberFormatException e) {
			DomUtils.LOGGER.error("Parsing to Float failed: " + e.getMessage());
			return null;
		}
	}

	public static Float toFloat(final Element element, final String attributeName)
	{
		if (!DomUtils.checkAttributeProconditions(element, attributeName)) {
			return null;
		}

		try {

			return Float.parseFloat(element.getAttribute(attributeName));

		} catch (final NumberFormatException e) {
			DomUtils.LOGGER.error("Parsing " + attributeName + " to Float failed: " + e.getMessage());
			return null;
		}
	}

	public static Double toDouble(final Element element)
	{
		if (!DomUtils.checkPreconditions(element)) {
			return null;
		}

		try {

			return Double.parseDouble(element.getTextContent());

		} catch (final NumberFormatException e) {
			DomUtils.LOGGER.error("Parsing to Double failed: " + e.getMessage());
			return null;
		}
	}

	public static Double toDouble(final Element element, final String attributeName)
	{
		if (!DomUtils.checkAttributeProconditions(element, attributeName)) {
			return null;
		}

		try {

			return Double.parseDouble(element.getAttribute(attributeName));

		} catch (final NumberFormatException e) {
			DomUtils.LOGGER.error("Parsing " + attributeName + " to Double failed: " + e.getMessage());
			return null;
		}
	}

	public static Boolean toBoolean(final Element element)
	{
		if (!DomUtils.checkPreconditions(element)) {
			return null;
		}

		final String text = element.getTextContent();

		return DomUtils.toBoolean(text);
	}

	public static Boolean toBoolean(final Element element, final String attributeName)
	{
		if (!DomUtils.checkAttributeProconditions(element, attributeName)) {
			return null;
		}

		final String text = element.getAttribute(attributeName);

		return DomUtils.toBoolean(text);

	}

	public static URL toURL(final Element element)
	{
		if (!DomUtils.checkPreconditions(element)) {
			return null;
		}

		try {

			return new URL(element.getTextContent());

		} catch (final MalformedURLException e) {
			DomUtils.LOGGER.error("Parsing URL failed: " + e.getMessage());
			return null;
		}
	}

	public static URL toHttpURL(final Element element)
	{
		if (!DomUtils.checkPreconditions(element)) {
			return null;
		}

		try {

			return new URL(element.getTextContent());

		} catch (final MalformedURLException e) {

			/* Some elements are missing protocol, try to fix */
			try {

				return new URL("http://" + element.getTextContent());

			} catch (final MalformedURLException e1) {
				DomUtils.LOGGER.error("Parsing http URL failed: " + e.getMessage());
				return null;
			}
		}
	}

	public static ISO_3166_1_alpha2 toCountry(final Element element)
	{
		if (!DomUtils.checkPreconditions(element)) {
			return null;
		}

		try {

			return ISO_3166_1_alpha2.valueOf(element.getTextContent());

		} catch (IllegalArgumentException e) {
			DomUtils.LOGGER.error("Couldn't parse Country: " + e.getMessage());
			return null;
		}
	}

	public static Date toDateFromSecondsTimestamp(final Element element, final String attName)
	{
		if (!DomUtils.checkAttributeProconditions(element, attName)) {
			return null;
		}

		try {

			return new Date(Long.parseLong(element.getAttribute(attName)) * DateUtils.MILLIS_PER_SECOND);

		} catch (final NumberFormatException e) {
			DomUtils.LOGGER.error("Parsing " + attName + " to Date failed: " + e.getMessage());
			return null;
		}

	}

	public static URI toURI(final Element element)
	{
		if (!DomUtils.checkPreconditions(element)) {
			return null;
		}

		try {

			return new URI(element.getTextContent());

		} catch (final URISyntaxException e) {
			DomUtils.LOGGER.error("Parsing to URI failed: " + e.getMessage());
		}

		return null;
	}

	/**
	 * Get a single child of an element by its tag name.
	 *
	 * @param element
	 *            The element to search the child for.
	 * @param name
	 *            The tag name of the child to search.
	 * @return The child if found or null.
	 */
	public static Element getChildByTagName(final Element element, final String name)
	{
		for (final Element child : DomUtils.getChildrenByTagName(element, name)) {
			return child;
		}

		return null;
	}

	/**
	 * Get the element text of a single child of an element by its tag name.
	 *
	 * @param element
	 *            The element to search the child for.
	 * @param name
	 *            The tag name of the child to search.
	 * @return The element text of the child if found or null if not found or the text is empty.
	 */
	public static String getElementText(final Element element, final String name)
	{
		final Element child = DomUtils.getChildByTagName(element, name);

		if (child != null) {
			final String content = child.getTextContent();
			if (StringUtils.isBlank(content)) {
				return null;
			}

			return content;
		}

		return null;
	}

	/**
	 * Get the attribute text of a single child of an element by its tag name.
	 *
	 * @param element
	 *            The element to search the child for.
	 * @param name
	 *            The tag name of the child to search.
	 * @param attrName
	 *            The name of the attribute.
	 * @return The attribute text of the child if found or null.
	 */
	public static String getAttributeText(final Element element, final String tagName, final String attrName)
	{
		final Element child = DomUtils.getChildByTagName(element, tagName);

		if (child != null) {
			if (child.hasAttribute(attrName)) {
				return child.getAttribute(attrName);
			}
		}

		return null;
	}

	/**
	 * Get the children of an element with a specified tag name.
	 *
	 * @param element
	 *            The element to search the children for.
	 * @param name
	 *            The tag name of the children to search for.
	 * @return A List of the matching children (can be empty of no children found).
	 */
	public static List<Element> getChildrenByTagName(final Element element, final String name)
	{
		final NodeList children = element.getChildNodes();

		final ArrayList<Element> filteredChildren = new ArrayList<Element>();

		for (int i = 0; i < children.getLength(); i++) {
			final Node currentChild = children.item(i);
			if (currentChild instanceof Element
					&& currentChild.getNodeType() == Node.ELEMENT_NODE
					&& ((Element) currentChild).getTagName().equals(name)) {
				filteredChildren.add((Element) currentChild);
			}
		}

		return filteredChildren;
	}

	/**
	 * Checks if the element is null or does only contain whitespace text.
	 *
	 * @param element
	 *            The element to check.
	 * @return True if the element can be processed.
	 */
	protected static boolean checkPreconditions(final Element element)
	{
		return element != null && !StringUtils.isBlank(element.getTextContent());
	}

	private static Boolean toBoolean(String text)
	{
		if ("1".equals(text) || text.equalsIgnoreCase("true") || text.equalsIgnoreCase("yes")) {
			return true;
		}

		if ("0".equals(text) || text.equalsIgnoreCase("false") || text.equalsIgnoreCase("no")) {
			return false;
		}

		return null;
	}

	/**
	 * Checks if the element is null or the attribute is not set or contains only whitespace text.
	 *
	 * @param element
	 *            The element to check.
	 * @param attributeName
	 *            The name of the attribute to check.
	 * @return True if the attribute can be processed.
	 */
	private static boolean checkAttributeProconditions(final Element element, final String attributeName)
	{
		return element != null
				&& element.hasAttribute(attributeName)
				&& !StringUtils.isBlank(element.getAttribute(attributeName));
	}
}
