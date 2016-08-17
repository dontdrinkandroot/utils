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
package net.dontdrinkandroot.utils.lang;

import java.util.Date;
import java.util.Hashtable;
import java.util.Vector;

import org.junit.Assert;
import org.junit.Assume;
import org.junit.Test;


public class SerializationUtilsTest
{

	@Test
	public void clonePerformanceTest()
	{
		Assume.assumeTrue(false);

		/*
		 * Make a reasonable large test object. Note that this doesn't do anything useful -- it is simply intended to be
		 * large, have several levels of references, and be somewhat random. We start with a hashtable and add vectors
		 * to it, where each element in the vector is a Date object (initialized to the current time), a semi-random
		 * string, and a (circular) reference back to the object itself. In this case the resulting object produces a
		 * serialized representation that is approximate 700K.
		 */
		Hashtable<Integer, Vector<Object[]>> obj = new Hashtable<Integer, Vector<Object[]>>();
		for (int i = 0; i < 100; i++) {
			Vector<Object[]> v = new Vector<Object[]>();
			for (int j = 0; j < 100; j++) {
				v.addElement(new Object[] { new Date(), "A random number: " + Math.random(), obj });
			}
			obj.put(new Integer(i), v);
		}

		int iterations = 1000;

		/* Make copies of the object using the unoptimized version of the deep copy utility. */
		long unoptimizedTime = 0L;
		for (int i = 0; i < iterations; i++) {
			long start = System.currentTimeMillis();
			Object copy = SerializationUtils.clone(obj);
			unoptimizedTime += System.currentTimeMillis() - start;

			/* Avoid having GC run while we are timing... */
			copy = null;
			System.gc();
		}

		/* Repeat with the optimized version */
		long optimizedTime = 0L;
		for (int i = 0; i < iterations; i++) {
			long start = System.currentTimeMillis();
			Object copy = SerializationUtils.fastClone(obj);
			optimizedTime += System.currentTimeMillis() - start;

			/* Avoid having GC run while we are timing... */
			copy = null;
			System.gc();
		}

		System.out.println("Unoptimized time: " + unoptimizedTime);
		System.out.println("  Optimized time: " + optimizedTime);
	}

	@Test
	public void testFastClone()
	{
		Assert.assertEquals("Test", SerializationUtils.fastClone("Test"));
	}

}
