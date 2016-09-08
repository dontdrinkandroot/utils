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

import org.junit.Assert;
import org.junit.Test;

import javax.xml.bind.annotation.XmlEnumValue;
import java.lang.reflect.Field;
import java.lang.reflect.Type;


public class ISO_3166_1_alpha2Test {

    @Test
    public void test()
    {

        ISO_3166_1_alpha2.DE.getName();

        Field[] fields = ISO_3166_1_alpha2.class.getDeclaredFields();
        for (Field field : fields) {
            String name = field.getName();
            Type type = field.getType();
            if (type.equals(ISO_3166_1_alpha2.class)) {
                Assert.assertEquals(2, name.length());
                XmlEnumValue xmlAnnotation = field.getAnnotation(XmlEnumValue.class);
                Assert.assertNotNull(xmlAnnotation);
                Assert.assertEquals(name, xmlAnnotation.value());
                // TODO: assert get name
            }
        }
    }
}
