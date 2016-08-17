package net.dontdrinkandroot.utils.pair;

import java.util.Iterator;

import org.junit.Assert;
import org.junit.Test;


public class PairTest
{

	@Test
	public void testGettersSetters()
	{
		Pair<String> pair = new Pair<String>("first", "second");
		Assert.assertEquals("first", pair.getFirst());
		Assert.assertEquals("second", pair.getSecond());

		pair.setFirst("first2");
		Assert.assertEquals("first2", pair.getFirst());

		pair.setSecond("second2");
		Assert.assertEquals("second2", pair.getSecond());
	}

	@Test
	public void testIterator()
	{
		Pair<String> pair = new Pair<String>("first", "second");
		Iterator<String> iterator = pair.iterator();

		Assert.assertEquals("first", iterator.next());
		Assert.assertEquals("second", iterator.next());
		Assert.assertFalse(iterator.hasNext());
	}

	@Test
	public void testHashCodeAndEquals()
	{
		Pair<String> pair1 = new Pair<String>("first", "second");
		Pair<String> pair2 = new Pair<String>("first", "second");
		Assert.assertTrue(pair1.equals(pair2));
		Assert.assertTrue(pair2.equals(pair1));
		Assert.assertTrue(pair1.hashCode() == pair2.hashCode());
		Assert.assertTrue(pair2.hashCode() == pair1.hashCode());

		Assert.assertTrue(pair1.equals(pair1));
		Assert.assertFalse(pair1.equals(null));
		Assert.assertFalse(pair1.equals("test"));

		Pair<String> pair3 = new Pair<String>(null, "second");
		Pair<String> pair4 = new Pair<String>(null, "second");
		Assert.assertTrue(pair3.equals(pair4));
		Assert.assertFalse(pair3.equals(pair2));
		Assert.assertFalse(pair3.equals(pair1));
		Assert.assertTrue(pair4.equals(pair3));
		Assert.assertFalse(pair4.equals(pair2));
		Assert.assertFalse(pair4.equals(pair1));
		Assert.assertTrue(pair3.hashCode() == pair4.hashCode());
		Assert.assertTrue(pair4.hashCode() == pair3.hashCode());

		Pair<String> pair5 = new Pair<String>("first", null);
		Pair<String> pair6 = new Pair<String>("first", null);
		Assert.assertTrue(pair5.equals(pair6));
		Assert.assertFalse(pair5.equals(pair4));
		Assert.assertFalse(pair5.equals(pair3));
		Assert.assertFalse(pair5.equals(pair2));
		Assert.assertFalse(pair5.equals(pair1));
		Assert.assertTrue(pair6.equals(pair5));
		Assert.assertFalse(pair6.equals(pair4));
		Assert.assertFalse(pair6.equals(pair3));
		Assert.assertFalse(pair6.equals(pair2));
		Assert.assertFalse(pair6.equals(pair1));
		Assert.assertTrue(pair5.hashCode() == pair6.hashCode());
		Assert.assertTrue(pair6.hashCode() == pair5.hashCode());

		Pair<String> pair7 = new Pair<String>(null, null);
		Pair<String> pair8 = new Pair<String>(null, null);
		Assert.assertTrue(pair7.equals(pair8));
		Assert.assertFalse(pair7.equals(pair6));
		Assert.assertFalse(pair7.equals(pair5));
		Assert.assertFalse(pair7.equals(pair4));
		Assert.assertFalse(pair7.equals(pair3));
		Assert.assertFalse(pair7.equals(pair2));
		Assert.assertFalse(pair7.equals(pair1));
		Assert.assertTrue(pair8.equals(pair7));
		Assert.assertFalse(pair8.equals(pair6));
		Assert.assertFalse(pair8.equals(pair5));
		Assert.assertFalse(pair8.equals(pair4));
		Assert.assertFalse(pair8.equals(pair3));
		Assert.assertFalse(pair8.equals(pair2));
		Assert.assertFalse(pair8.equals(pair1));
		Assert.assertTrue(pair7.hashCode() == pair8.hashCode());
		Assert.assertTrue(pair8.hashCode() == pair7.hashCode());
	}
}
