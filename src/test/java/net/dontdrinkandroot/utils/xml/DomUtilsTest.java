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

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

import net.dontdrinkandroot.utils.ISO_3166_1_alpha2;


public class DomUtilsTest
{

	private static Element ROOT;


	@BeforeClass
	public static void before() throws ParserConfigurationException, SAXException, IOException
	{
		final DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		final DocumentBuilder builder = factory.newDocumentBuilder();
		Document document = builder.parse(DomUtilsTest.class.getClassLoader().getResourceAsStream("DomUtilsTest.xml"));
		DomUtilsTest.ROOT = document.getDocumentElement();
	}

	@Test
	public void testToNonEmptyString()
	{
		Assert.assertNull(DomUtils.toNonEmptyString(DomUtils.getChildByTagName(DomUtilsTest.ROOT, "nonExisting")));

		Element testElement = DomUtils.getChildByTagName(DomUtilsTest.ROOT, "toNonEmptyString");

		Assert.assertNull(DomUtils.toNonEmptyString(DomUtils.getChildByTagName(testElement, "empty")));
		Assert.assertEquals("nonEmpty", DomUtils.toNonEmptyString(DomUtils.getChildByTagName(testElement, "nonEmpty")));

		Assert.assertNull(DomUtils.toNonEmptyString(DomUtils.getChildByTagName(testElement, "empty"), "text"));
		Assert.assertEquals(
				"nonEmpty",
				DomUtils.toNonEmptyString(DomUtils.getChildByTagName(testElement, "nonEmpty"), "text"));
	}

	@Test
	public void testToUrlAndToUri() throws MalformedURLException, URISyntaxException
	{
		Element testElement = DomUtils.getChildByTagName(DomUtilsTest.ROOT, "toUrl");

		/* toURL */
		Assert.assertNull(DomUtils.toURL(DomUtils.getChildByTagName(DomUtilsTest.ROOT, "nonExisting")));
		Assert.assertEquals(
				new URL("http://example.com"),
				DomUtils.toURL(DomUtils.getChildByTagName(testElement, "valid")));
		Assert.assertNull(DomUtils.toURL(DomUtils.getChildByTagName(testElement, "noProtocol")));

		/* toHttpURL */
		Assert.assertNull(DomUtils.toHttpURL(DomUtils.getChildByTagName(DomUtilsTest.ROOT, "nonExisting")));
		Assert.assertEquals(
				new URL("http://example.com"),
				DomUtils.toHttpURL(DomUtils.getChildByTagName(testElement, "valid")));
		Assert.assertEquals(
				new URL("http://example.com"),
				DomUtils.toHttpURL(DomUtils.getChildByTagName(testElement, "noProtocol")));
		Assert.assertNull(DomUtils.toHttpURL(DomUtils.getChildByTagName(testElement, "inValid")));

		/* toURI */
		Assert.assertNull(DomUtils.toURI(DomUtils.getChildByTagName(DomUtilsTest.ROOT, "nonExisting")));
		// Assert.assertNull(DomUtils.toURI(DomUtils.getChildByTagName(testElement, "noProtocol")));
		Assert.assertEquals(
				new URI("http://example.com"),
				DomUtils.toURI(DomUtils.getChildByTagName(testElement, "valid")));
		Assert.assertNull(DomUtils.toURI(DomUtils.getChildByTagName(testElement, "inValid")));
	}

	@Test
	public void testToNumbers()
	{
		Element testElement = DomUtils.getChildByTagName(DomUtilsTest.ROOT, "toNumbers");

		/* Integer */
		Assert.assertNull(DomUtils.toInteger(DomUtils.getChildByTagName(DomUtilsTest.ROOT, "nonExisting")));
		Assert.assertNull(DomUtils.toInteger(DomUtils.getChildByTagName(testElement, "inValid")));
		Assert.assertEquals(
				Integer.valueOf(42),
				DomUtils.toInteger(DomUtils.getChildByTagName(testElement, "integer")));

		Assert.assertNull(
				DomUtils.toInteger(DomUtils.getChildByTagName(DomUtilsTest.ROOT, "nonExisting"), "nonExisting"));
		Assert.assertNull(DomUtils.toInteger(DomUtils.getChildByTagName(testElement, "inValid"), "value"));
		Assert.assertEquals(
				Integer.valueOf(42),
				DomUtils.toInteger(DomUtils.getChildByTagName(testElement, "integer"), "value"));

		/* Long */
		Assert.assertNull(DomUtils.toLong(DomUtils.getChildByTagName(DomUtilsTest.ROOT, "nonExisting")));
		Assert.assertNull(DomUtils.toLong(DomUtils.getChildByTagName(testElement, "inValid")));
		Assert.assertEquals(
				Long.valueOf(21474836475L),
				DomUtils.toLong(DomUtils.getChildByTagName(testElement, "long")));

		Assert.assertNull(DomUtils.toLong(DomUtils.getChildByTagName(DomUtilsTest.ROOT, "nonExisting"), "nonExisting"));
		Assert.assertNull(DomUtils.toLong(DomUtils.getChildByTagName(testElement, "inValid"), "value"));
		Assert.assertEquals(
				Long.valueOf(21474836475L),
				DomUtils.toLong(DomUtils.getChildByTagName(testElement, "long"), "value"));

		/* Float */
		Assert.assertNull(DomUtils.toFloat(DomUtils.getChildByTagName(DomUtilsTest.ROOT, "nonExisting")));
		Assert.assertNull(DomUtils.toFloat(DomUtils.getChildByTagName(testElement, "inValid")));
		Assert.assertEquals(Float.valueOf(1.3f), DomUtils.toFloat(DomUtils.getChildByTagName(testElement, "float")));

		Assert.assertNull(
				DomUtils.toFloat(DomUtils.getChildByTagName(DomUtilsTest.ROOT, "nonExisting"), "nonExisting"));
		Assert.assertNull(DomUtils.toFloat(DomUtils.getChildByTagName(testElement, "inValid"), "value"));
		Assert.assertEquals(
				Float.valueOf(1.3f),
				DomUtils.toFloat(DomUtils.getChildByTagName(testElement, "float"), "value"));

		/* Double */
		Assert.assertNull(DomUtils.toDouble(DomUtils.getChildByTagName(DomUtilsTest.ROOT, "nonExisting")));
		Assert.assertNull(DomUtils.toDouble(DomUtils.getChildByTagName(testElement, "inValid")));
		Assert.assertEquals(
				Double.valueOf(1234.56),
				DomUtils.toDouble(DomUtils.getChildByTagName(testElement, "double")));

		Assert.assertNull(
				DomUtils.toDouble(DomUtils.getChildByTagName(DomUtilsTest.ROOT, "nonExisting"), "nonExisting"));
		Assert.assertNull(DomUtils.toDouble(DomUtils.getChildByTagName(testElement, "inValid"), "value"));
		Assert.assertEquals(
				Double.valueOf(1234.56),
				DomUtils.toDouble(DomUtils.getChildByTagName(testElement, "double"), "value"));
	}

	@Test
	public void testToBoolean()
	{
		Element testElement = DomUtils.getChildByTagName(DomUtilsTest.ROOT, "toBoolean");

		Assert.assertNull(DomUtils.toBoolean(DomUtils.getChildByTagName(DomUtilsTest.ROOT, "nonExisting")));
		Assert.assertNull(DomUtils.toBoolean(DomUtils.getChildByTagName(testElement, "inValid")));
		Assert.assertTrue(DomUtils.toBoolean(DomUtils.getChildByTagName(testElement, "true")));
		Assert.assertTrue(DomUtils.toBoolean(DomUtils.getChildByTagName(testElement, "yes")));
		Assert.assertTrue(DomUtils.toBoolean(DomUtils.getChildByTagName(testElement, "one")));
		Assert.assertFalse(DomUtils.toBoolean(DomUtils.getChildByTagName(testElement, "false")));
		Assert.assertFalse(DomUtils.toBoolean(DomUtils.getChildByTagName(testElement, "no")));
		Assert.assertFalse(DomUtils.toBoolean(DomUtils.getChildByTagName(testElement, "zero")));

		Assert.assertNull(
				DomUtils.toBoolean(DomUtils.getChildByTagName(DomUtilsTest.ROOT, "nonExisting"), "nonExisting"));
		Assert.assertNull(DomUtils.toBoolean(DomUtils.getChildByTagName(testElement, "inValid"), "value"));
		Assert.assertTrue(DomUtils.toBoolean(DomUtils.getChildByTagName(testElement, "true"), "value"));
		Assert.assertTrue(DomUtils.toBoolean(DomUtils.getChildByTagName(testElement, "yes"), "value"));
		Assert.assertTrue(DomUtils.toBoolean(DomUtils.getChildByTagName(testElement, "one"), "value"));
		Assert.assertFalse(DomUtils.toBoolean(DomUtils.getChildByTagName(testElement, "false"), "value"));
		Assert.assertFalse(DomUtils.toBoolean(DomUtils.getChildByTagName(testElement, "no"), "value"));
		Assert.assertFalse(DomUtils.toBoolean(DomUtils.getChildByTagName(testElement, "zero"), "value"));
	}

	@Test
	public void testToCountry()
	{
		Element testElement = DomUtils.getChildByTagName(DomUtilsTest.ROOT, "toCountry");

		Assert.assertNull(DomUtils.toCountry(DomUtils.getChildByTagName(testElement, "nonExisting")));
		Assert.assertNull(DomUtils.toCountry(DomUtils.getChildByTagName(testElement, "inValid")));
		Assert.assertEquals(ISO_3166_1_alpha2.DE, DomUtils.toCountry(DomUtils.getChildByTagName(testElement, "valid")));
	}

	@Test
	public void testToDateFromSecondsTimestamp()
	{
		Element testElement = DomUtils.getChildByTagName(DomUtilsTest.ROOT, "toDateFromSecondsTimestamp");

		Assert.assertNull(
				DomUtils.toDateFromSecondsTimestamp(
						DomUtils.getChildByTagName(testElement, "nonExisting"),
						"nonExisting"));
		Assert.assertNull(
				DomUtils.toDateFromSecondsTimestamp(DomUtils.getChildByTagName(testElement, "inValid"), "value"));
		Assert.assertEquals(1000000000000L, DomUtils
				.toDateFromSecondsTimestamp(DomUtils.getChildByTagName(testElement, "valid"), "value")
				.getTime());
	}

	@Test
	public final void testBasics() throws ParserConfigurationException, SAXException, IOException
	{
		Assert.assertEquals("eins", DomUtils.getElementText(DomUtilsTest.ROOT, "elementone"));
		Assert.assertEquals("test", DomUtils.getAttributeText(DomUtilsTest.ROOT, "elementone", "attr1"));

		Assert.assertEquals("zwei", DomUtils.getElementText(DomUtilsTest.ROOT, "elementtwo"));

		Assert.assertNull(DomUtils.getElementText(DomUtilsTest.ROOT, "elementsix"));
		Assert.assertNull(DomUtils.getElementText(DomUtilsTest.ROOT, "elementnine"));
		Assert.assertNull(DomUtils.getAttributeText(DomUtilsTest.ROOT, "elementtwo", "attrnull"));
	}
}
