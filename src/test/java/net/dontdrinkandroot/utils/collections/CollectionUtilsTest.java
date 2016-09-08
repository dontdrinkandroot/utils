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
package net.dontdrinkandroot.utils.collections;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;
import java.util.Map.Entry;


public class CollectionUtilsTest
{

    @Test
    public void testGetRandom()
    {
        Collection<Integer> coll = new ArrayList<Integer>();
        Assert.assertNull(CollectionUtils.getRandom(coll));

        coll.add(1);
        Assert.assertEquals(Integer.valueOf(1), CollectionUtils.getRandom(coll));

        coll.add(2);
        Assert.assertTrue(coll.contains(CollectionUtils.getRandom(coll)));

        coll.add(3);
        Assert.assertTrue(coll.contains(CollectionUtils.getRandom(coll)));

        coll.add(4);
        Assert.assertTrue(coll.contains(CollectionUtils.getRandom(coll)));

        coll.add(5);
        Assert.assertTrue(coll.contains(CollectionUtils.getRandom(coll)));
    }

    @Test
    public void meanTest()
    {
        List<Integer> numbers = Arrays.asList(new Integer[]{1, 8, 5, 7, 3});
        Assert.assertEquals(5d, CollectionUtils.getMean(numbers), 0.0d);

        numbers = Arrays.asList(new Integer[]{1, 8, 2, 5, 7, 3});
        Assert.assertEquals(4d, CollectionUtils.getMean(numbers), 0.0d);
    }

    @Test(expected = IllegalArgumentException.class)
    public void meanTestWithNull()
    {
        CollectionUtils.getMean(Arrays.asList(new Integer[]{1, 8, 2, null, 7, 3}));
    }

    @Test
    public void testIsEmpty()
    {
        Assert.assertTrue(CollectionUtils.isEmpty(null));
        Assert.assertTrue(CollectionUtils.isEmpty(new ArrayList<Integer>()));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsEmptyNonCollection()
    {
        CollectionUtils.isEmpty("NotACollection");
    }

    @Test
    public void testFirst()
    {
        Assert.assertNull(CollectionUtils.first(new ArrayList<String>()));
        Assert.assertEquals("one", CollectionUtils.first(Arrays.asList(new String[]{"one"})));
        Assert.assertEquals("one", CollectionUtils.first(Arrays.asList(new String[]{"one", "two"})));
    }

    @Test
    public void testAddToMapList()
    {
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        CollectionUtils.addToMapList("one", "one", map);
        CollectionUtils.addToMapList("one", "two", map);
        CollectionUtils.addToMapList("two", "one", map);
        Assert.assertEquals(2, map.keySet().size());
        Assert.assertNotNull(map.get("one"));
        Assert.assertNotNull(map.get("two"));
        Assert.assertEquals(2, map.get("one").size());
        Assert.assertEquals(1, map.get("two").size());
        Assert.assertEquals("one", map.get("one").get(0));
        Assert.assertEquals("two", map.get("one").get(1));
        Assert.assertEquals("one", map.get("two").get(0));
    }

    @Test
    public void testAddToMapSet()
    {
        Map<String, Set<String>> map = new HashMap<String, Set<String>>();
        CollectionUtils.addToMapSet("one", "one", map);
        CollectionUtils.addToMapSet("one", "two", map);
        CollectionUtils.addToMapSet("two", "one", map);
        Assert.assertEquals(2, map.keySet().size());
        Assert.assertNotNull(map.get("one"));
        Assert.assertNotNull(map.get("two"));
        Assert.assertEquals(2, map.get("one").size());
        Assert.assertEquals(1, map.get("two").size());
        Assert.assertTrue(map.get("one").contains("one"));
        Assert.assertTrue(map.get("one").contains("two"));
        Assert.assertTrue(map.get("two").contains("one"));
    }

    @Test
    public void testEntriesSortedByValues()
    {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("one", 2);
        map.put("two", 1);
        map.put("three", 3);
        SortedSet<Entry<String, Integer>> entriesSortedByValues = CollectionUtils.entriesSortedByValues(map);
        Iterator<Entry<String, Integer>> iterator = entriesSortedByValues.iterator();
        Entry<String, Integer> entry;
        entry = iterator.next();
        Assert.assertEquals("two", entry.getKey());
        entry = iterator.next();
        Assert.assertEquals("one", entry.getKey());
        entry = iterator.next();
        Assert.assertEquals("three", entry.getKey());
    }

    @Test
    public void testEntriesSortedByValuesInverse()
    {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("one", 2);
        map.put("two", 1);
        map.put("three", 3);
        SortedSet<Entry<String, Integer>> entriesSortedByValues = CollectionUtils.entriesSortedByValuesInverse(map);
        Iterator<Entry<String, Integer>> iterator = entriesSortedByValues.iterator();
        Entry<String, Integer> entry;
        entry = iterator.next();
        Assert.assertEquals("three", entry.getKey());
        entry = iterator.next();
        Assert.assertEquals("one", entry.getKey());
        entry = iterator.next();
        Assert.assertEquals("two", entry.getKey());
    }
}
