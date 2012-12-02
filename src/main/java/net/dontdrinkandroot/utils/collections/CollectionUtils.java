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

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;


public class CollectionUtils extends org.apache.commons.collections15.CollectionUtils {

	public static <T extends Number> AggregationResult aggregate(final Collection<T> collection) {

		if (collection.isEmpty()) {
			throw new IllegalArgumentException("Collection must not be empty");
		}

		final AggregationResult result = new AggregationResult();
		result.setSize(collection.size());
		double sum = 0;
		double min = Double.MAX_VALUE;
		double max = Double.MIN_VALUE;

		/* Determine min, max, sum */
		for (final T entry : collection) {
			if (entry != null) {
				final double value = entry.doubleValue();
				max = Math.max(max, value);
				min = Math.min(min, value);
				sum += value;
			}
		}
		result.setMin(min);
		result.setMax(max);
		result.setSum(sum);

		result.setAvg(sum / result.getSize());

		result.setMean(CollectionUtils.getMean(collection));

		return result;
	}


	public static <T extends Number> double getMean(final Collection<T> collection) {

		final int size = collection.size();

		final List<T> sorted = new ArrayList<T>(collection);
		Collections.sort(sorted, new Comparator<T>() {

			@Override
			public int compare(final T n1, final T n2) {

				return (int) Math.signum(n2.doubleValue() - n1.doubleValue());
			}
		});

		if (size % 2 == 0) {
			return (sorted.get(size / 2).doubleValue() + sorted.get(size / 2 - 1).doubleValue()) / 2;
		} else {
			return sorted.get(size / 2).doubleValue();
		}
	}


	public static <T> T first(Iterable<T> iterable) {

		return iterable.iterator().next();
	}


	/**
	 * Nullsafe check if a collection is empty.
	 * 
	 * @param obj
	 *            Null or a subclass of Collection.
	 * @throws IllegalArgumentException
	 *             Thrown if obj is not null and not an instance of Collection.
	 */
	public static boolean isEmpty(Object obj) {

		if (obj == null) {
			return true;
		}

		if (obj instanceof Collection) {
			return ((Collection<?>) obj).isEmpty();
		}

		throw new IllegalArgumentException("Given Object was not a collection");
	}


	public static <K, V> void addToMapList(K key, V value, Map<K, List<V>> map) {

		List<V> list = map.get(key);
		if (list == null) {
			list = new ArrayList<V>();
			map.put(key, list);
		}
		list.add(value);
	}


	public static <K, V> void addToMapSet(K key, V value, Map<K, Set<V>> map) {

		Set<V> set = map.get(key);
		if (set == null) {
			set = new HashSet<V>();
			map.put(key, set);
		}
		set.add(value);
	}


	public static <V> V getRandom(Collection<V> collection) {

		if (collection.isEmpty()) {
			return null;
		}

		int randIdx = (int) Math.round(Math.random() * (collection.size() - 1));
		int count = 0;
		Iterator<V> iterator = collection.iterator();
		while (iterator.hasNext()) {
			V current = iterator.next();
			if (count == randIdx) {
				return current;
			}
			count++;
		}

		throw new RuntimeException("Shouldn't happen");
	}


	public static <K, V extends Comparable<? super V>> SortedSet<Map.Entry<K, V>> entriesSortedByValues(Map<K, V> map) {

		SortedSet<Map.Entry<K, V>> sortedEntries = new TreeSet<Map.Entry<K, V>>(new Comparator<Map.Entry<K, V>>() {

			@Override
			public int compare(Map.Entry<K, V> e1, Map.Entry<K, V> e2) {

				int res = e1.getValue().compareTo(e2.getValue());
				/* Preserve items with equal values */
				return res != 0 ? res : 1;
			}
		});
		sortedEntries.addAll(map.entrySet());

		return sortedEntries;
	}


	public static <K, V extends Comparable<? super V>> SortedSet<Map.Entry<K, V>> entriesSortedByValuesInverse(
			Map<K, V> map) {

		SortedSet<Map.Entry<K, V>> sortedEntries = new TreeSet<Map.Entry<K, V>>(new Comparator<Map.Entry<K, V>>() {

			@Override
			public int compare(Map.Entry<K, V> e1, Map.Entry<K, V> e2) {

				int res = e2.getValue().compareTo(e1.getValue());
				/* Preserve items with equal values */
				return res != 0 ? res : -1;
			}
		});
		sortedEntries.addAll(map.entrySet());

		return sortedEntries;
	}

}
