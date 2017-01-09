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
package net.dontdrinkandroot.utils.lang.math;

import org.junit.Assert;
import org.junit.Test;

public class NumberUtilsTest
{
    @Test
    public void testLimit() throws Exception
    {
        /* Double */
        try {
            NumberUtils.limit(3d, 4d, 1d);
            throw new Exception("Exception expected");
        } catch (IllegalArgumentException e) {
            /* Expected */
        }
        Assert.assertEquals(3d, NumberUtils.limit(2d, 3d, 3d), 0d);
        Assert.assertEquals(2d, NumberUtils.limit(2d, -1d, 3d), 2d);
        Assert.assertEquals(2d, NumberUtils.limit(2d, -1d, 1d), 1d);
        Assert.assertEquals(2d, NumberUtils.limit(2d, 3d, 4d), 3d);

        /* Float */
        try {
            NumberUtils.limit(3f, 4f, 1f);
            throw new Exception("Exception expected");
        } catch (IllegalArgumentException e) {
            /* Expected */
        }
        Assert.assertEquals(3f, NumberUtils.limit(2f, 3f, 3f), 0f);
        Assert.assertEquals(2f, NumberUtils.limit(2f, -1f, 3f), 2f);
        Assert.assertEquals(2f, NumberUtils.limit(2f, -1f, 1f), 1f);
        Assert.assertEquals(2f, NumberUtils.limit(2f, 3f, 4f), 3f);

        /* Integer */
        try {
            NumberUtils.limit(3, 4, 1);
            throw new Exception("Exception expected");
        } catch (IllegalArgumentException e) {
            /* Expected */
        }
        Assert.assertEquals(3, NumberUtils.limit(2, 3, 3), 0);
        Assert.assertEquals(2, NumberUtils.limit(2, -1, 3), 2);
        Assert.assertEquals(2, NumberUtils.limit(2, -1, 1), 1);
        Assert.assertEquals(2, NumberUtils.limit(2, 3, 4), 3);

        /* Long */
        try {
            NumberUtils.limit(3L, 4L, 1L);
            throw new Exception("Exception expected");
        } catch (IllegalArgumentException e) {
            /* Expected */
        }
        Assert.assertEquals(3L, NumberUtils.limit(2L, 3L, 3L), 0L);
        Assert.assertEquals(2L, NumberUtils.limit(2L, -1L, 3L), 2L);
        Assert.assertEquals(2L, NumberUtils.limit(2L, -1L, 1L), 1L);
        Assert.assertEquals(2L, NumberUtils.limit(2L, 3L, 4L), 3L);
    }

    @Test
    public void testNullSafeValue()
    {
        /* byte */
        Assert.assertEquals(0, NumberUtils.byteValue(null));
        Assert.assertEquals(42, NumberUtils.byteValue(Byte.valueOf((byte) 42)));
        Assert.assertEquals(-1, NumberUtils.byteValue(Short.MAX_VALUE));
        Assert.assertEquals(-1, NumberUtils.byteValue(Integer.MAX_VALUE));
        Assert.assertEquals(-1, NumberUtils.byteValue(Long.MAX_VALUE));
        Assert.assertEquals(-1, NumberUtils.byteValue(Float.MAX_VALUE));
        Assert.assertEquals(-1, NumberUtils.byteValue(Double.MAX_VALUE));

        /* short */
        Assert.assertEquals(0, NumberUtils.shortValue(null));
        Assert.assertEquals(42, NumberUtils.shortValue(Short.valueOf((short) 42)));
        Assert.assertEquals(Short.MAX_VALUE, NumberUtils.shortValue(Short.MAX_VALUE));
        Assert.assertEquals(-1, NumberUtils.shortValue(Integer.MAX_VALUE));
        Assert.assertEquals(-1, NumberUtils.shortValue(Long.MAX_VALUE));
        Assert.assertEquals(-1, NumberUtils.shortValue(Float.MAX_VALUE));
        Assert.assertEquals(-1, NumberUtils.shortValue(Double.MAX_VALUE));

        /* int */
        Assert.assertEquals(0, NumberUtils.intValue(null));
        Assert.assertEquals(42, NumberUtils.intValue(Integer.valueOf(42)));
        Assert.assertEquals(Short.MAX_VALUE, NumberUtils.intValue(Short.MAX_VALUE));
        Assert.assertEquals(Integer.MAX_VALUE, NumberUtils.intValue(Integer.MAX_VALUE));
        Assert.assertEquals(-1, NumberUtils.intValue(Long.MAX_VALUE));
        Assert.assertEquals((int) Float.MAX_VALUE, NumberUtils.intValue(Float.MAX_VALUE));
        Assert.assertEquals((int) Double.MAX_VALUE, NumberUtils.intValue(Double.MAX_VALUE));

        /* long */
        Assert.assertEquals(0, NumberUtils.longValue(null));
        Assert.assertEquals(42, NumberUtils.longValue(Long.valueOf(42)));
        Assert.assertEquals(Short.MAX_VALUE, NumberUtils.longValue(Short.MAX_VALUE));
        Assert.assertEquals(Integer.MAX_VALUE, NumberUtils.longValue(Integer.MAX_VALUE));
        Assert.assertEquals(Long.MAX_VALUE, NumberUtils.longValue(Long.MAX_VALUE));
        Assert.assertEquals((long) Float.MAX_VALUE, NumberUtils.longValue(Float.MAX_VALUE));
        Assert.assertEquals((long) Double.MAX_VALUE, NumberUtils.longValue(Double.MAX_VALUE));

        /* float */
        Assert.assertEquals(0f, NumberUtils.floatValue(null), .00001f);
        Assert.assertEquals(42f, NumberUtils.floatValue(Float.valueOf(42f)), .00001f);
        Assert.assertEquals(Short.MAX_VALUE, NumberUtils.floatValue(Short.MAX_VALUE), .00001f);
        Assert.assertEquals(Integer.MAX_VALUE, NumberUtils.floatValue(Integer.MAX_VALUE), 1f);
        Assert.assertEquals(Long.MAX_VALUE, NumberUtils.floatValue(Long.MAX_VALUE), .00001f);
        Assert.assertEquals(Float.MAX_VALUE, NumberUtils.floatValue(Float.MAX_VALUE), .00001f);
        Assert.assertEquals(Float.POSITIVE_INFINITY, NumberUtils.floatValue(Double.MAX_VALUE), .00001f);

        /* double */
        Assert.assertEquals(0d, NumberUtils.doubleValue(null), .00001f);
        Assert.assertEquals(42d, NumberUtils.doubleValue(Double.valueOf(42f)), .00001f);
        Assert.assertEquals(Short.MAX_VALUE, NumberUtils.doubleValue(Short.MAX_VALUE), .00001f);
        Assert.assertEquals(Integer.MAX_VALUE, NumberUtils.doubleValue(Integer.MAX_VALUE), .00001f);
        Assert.assertEquals(Long.MAX_VALUE, NumberUtils.doubleValue(Long.MAX_VALUE), .00001f);
        Assert.assertEquals(Float.MAX_VALUE, NumberUtils.doubleValue(Float.MAX_VALUE), .00001f);
        Assert.assertEquals(Double.MAX_VALUE, NumberUtils.doubleValue(Double.MAX_VALUE), .00001f);
    }

    @Test
    public void testCompare()
    {
        Assert.assertEquals(-1, NumberUtils.compare(1, 2));
        Assert.assertEquals(0, NumberUtils.compare(2, 2));
        Assert.assertEquals(1, NumberUtils.compare(3, 2));
    }
}
