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
package net.dontdrinkandroot.utils.lang;

import junit.framework.Assert;
import org.apache.commons.collections15.Transformer;
import org.apache.commons.collections15.functors.NOPTransformer;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class StringUtilsTest
{
    @Test
    public void testIterableJoin()
    {
        List<String> parts = new ArrayList<String>();
        parts.add("a");
        parts.add("bee");
        parts.add("cee");

        Transformer<String, String> transformer = NOPTransformer.getInstance();
        CharSequence result = StringUtils.join(parts, ",", transformer);

        Assert.assertEquals("a,bee,cee", result.toString());
    }

    @Test
    public void testArrayJoin()
    {
        String[] parts = new String[3];
        parts[0] = "a";
        parts[1] = "bee";
        parts[2] = "cee";

        Transformer<String, String> transformer = NOPTransformer.getInstance();
        CharSequence result = StringUtils.join(parts, ",", transformer);

        Assert.assertEquals("a,bee,cee", result.toString());
    }
}
