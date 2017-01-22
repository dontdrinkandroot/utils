/*
 * Copyright (C) 2012-2017 Philip W. Sorst <philip@sorst.net>
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
package net.dontdrinkandroot.utils.resource;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CachedFileResourceTest
{
    @Test
    public void testExisting() throws IOException
    {
        File file = new File(this.getClass().getClassLoader().getResource("DomUtilsTest.xml").getFile());
        CachedFileResource fileResource = new CachedFileResource(file);
        fileResource.setFileName("DomUtilsTest.xml");
        fileResource.setExpiry(new Long(60 * 60 * 1000));
        Assert.assertNull(fileResource.getTextEncoding());
        Assert.assertEquals("DomUtilsTest.xml", fileResource.getFileName());
        Assert.assertNull(fileResource.getErrorCode());
        Assert.assertNull(fileResource.getErrorMessage());
        Assert.assertEquals("application/xml", fileResource.getContentType());
        Assert.assertEquals(new Long(1143), fileResource.getContentLength());
        Assert.assertNotNull(fileResource.getLastModified());
        Assert.assertEquals(new Long(3600000), fileResource.getExpiry());
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        fileResource.write(bos);
        Assert.assertEquals(1143, bos.size());
    }

    @Test
    public void testMissing()
    {
        CachedFileResource fileResource = new CachedFileResource(new File("/tmp/test.png"));
        Assert.assertEquals(new Integer(404), fileResource.getErrorCode());
        Assert.assertEquals("Not found", fileResource.getErrorMessage());
        Assert.assertEquals("image/png", fileResource.getContentType());
        try {
            fileResource.write(new ByteArrayOutputStream());
            Assert.fail("IOException expected");
        } catch (IOException e) {
            Assert.assertTrue(e instanceof FileNotFoundException);
        }
    }
}
