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
package net.dontdrinkandroot.utils.cli;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;


public class CommandLineArgumentMainTest
{

    @Test
    public void testRequiredFieldsMissing()
    {
        String[] args = new String[0];

        ExampleCommandLineArgumentMain main = new ExampleCommandLineArgumentMain();
        main.setupAndRun(args);
        Assert.assertFalse(main.isRan());
    }

    @Test
    public void testPassingRun()
    {
        String[] args = new String[]{
                "-file",
                "/tmp/test",
                "-booleanProperty",
                "-doubleProperty",
                "6.66",
                "-floatProperty",
                "3.33",
                "-integerProperty",
                "2",
                "-longProperty",
                "4",
                "-stringProperty",
                "test"};

        ExampleCommandLineArgumentMain main = new ExampleCommandLineArgumentMain();
        main.setupAndRun(args);
        Assert.assertTrue(main.isRan());

        Assert.assertEquals(Boolean.valueOf(true), main.getBooleanProperty());
        Assert.assertEquals(Double.valueOf(6.66), main.getDoubleProperty());
        Assert.assertEquals(new File("/tmp/test"), main.getFileProperty());
        Assert.assertEquals(Float.valueOf(3.33f), main.getFloatProperty());
        Assert.assertEquals(Integer.valueOf(2), main.getIntegerProperty());
        Assert.assertEquals(Long.valueOf(4), main.getLongProperty());
        Assert.assertEquals("test", main.getStringProperty());
    }

    @Test
    public void getSetOnlyRequired()
    {
        String[] args = new String[]{"-file", "/tmp/test",};

        ExampleCommandLineArgumentMain main = new ExampleCommandLineArgumentMain();
        main.setupAndRun(args);
        Assert.assertTrue(main.isRan());

        Assert.assertEquals(new File("/tmp/test"), main.getFileProperty());
        Assert.assertNull(main.getBooleanProperty());
        Assert.assertNull(main.getDoubleProperty());
        Assert.assertNull(main.getFloatProperty());
        Assert.assertNull(main.getIntegerProperty());
        Assert.assertNull(main.getLongProperty());
        Assert.assertNull(main.getStringProperty());
    }
}
