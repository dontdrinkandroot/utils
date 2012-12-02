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
package net.dontdrinkandroot.utils;

import junit.framework.Assert;

import org.junit.Test;


public class SystemPropertiesTest {

	@Test
	public void test() {

		Assert.assertEquals(System.getProperty("file.encoding"), SystemProperties.getFileEncoding());
		Assert.assertEquals(System.getProperty("file.encoding.pkg"), SystemProperties.getFileEncodingPkg());
		Assert.assertEquals(System.getProperty("file.separator"), SystemProperties.getFileSeparator());
		Assert.assertEquals(System.getProperty("java.class.path"), SystemProperties.getJavaClassPath());
		Assert.assertEquals(System.getProperty("java.class.version"), SystemProperties.getJavaClassVersion());
		Assert.assertEquals(System.getProperty("java.compiler"), SystemProperties.getJavaCompiler());
		Assert.assertEquals(System.getProperty("java.home"), SystemProperties.getJavaHome());
		Assert.assertEquals(System.getProperty("java.io.tmpdir"), SystemProperties.getJavaIoTmpdir());
		Assert.assertEquals(System.getProperty("java.version"), SystemProperties.getJavaVersion());
		Assert.assertEquals(System.getProperty("java.vendor"), SystemProperties.getJavaVendor());
		Assert.assertEquals(System.getProperty("java.vendor.url"), SystemProperties.getJavaVendorUrl());
		Assert.assertEquals(System.getProperty("line.separator"), SystemProperties.getLineSeparator());
		Assert.assertEquals(System.getProperty("os.name"), SystemProperties.getOsName());
		Assert.assertEquals(System.getProperty("os.arch"), SystemProperties.getOsArch());
		Assert.assertEquals(System.getProperty("os.version"), SystemProperties.getOsVersion());
		Assert.assertEquals(System.getProperty("path.separator"), SystemProperties.getPathSeparator());
		Assert.assertEquals(System.getProperty("user.dir"), SystemProperties.getUserDir());
		Assert.assertEquals(System.getProperty("user.home"), SystemProperties.getUserHome());
		Assert.assertEquals(System.getProperty("user.language"), SystemProperties.getUserLanguage());
		Assert.assertEquals(System.getProperty("user.name"), SystemProperties.getUserName());
		Assert.assertEquals(System.getProperty("user.region"), SystemProperties.getUserRegion());
		Assert.assertEquals(System.getProperty("user.timezone"), SystemProperties.getUserTimezone());
	}
}