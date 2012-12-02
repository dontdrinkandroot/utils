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
package net.dontdrinkandroot.utils.lang.math;

/**
 * Provides extra functionality for Java Number classes.
 * 
 * @author Philip W. Sorst
 * 
 */
public class NumberUtils extends org.apache.commons.lang3.math.NumberUtils {

	/**
	 * Disabled constructor, utility class.
	 */
	protected NumberUtils() {

	}


	/**
	 * Get the null safe intValue of a Number. Defaults to 0.
	 * 
	 * @param number
	 *            The Number to convert.
	 * @return The null safe intValue. Defaults to 0.
	 */
	public static int intValue(final Number number) {

		if (number == null) {
			return 0;
		}

		return number.intValue();
	}


	/**
	 * Get the null safe doubleValue of a Number. Defaults to 0.
	 * 
	 * @param number
	 *            The Number to convert.
	 * @return The null safe doubleValue. Defaults to 0.
	 */
	public static double doubleValue(final Number number) {

		if (number == null) {
			return 0d;
		}

		return number.doubleValue();
	}


	/**
	 * Get the null safe byteValue of a Number. Defaults to 0.
	 * 
	 * @param number
	 *            The Number to convert.
	 * @return The null safe byteValue. Defaults to 0.
	 */
	public static byte byteValue(final Number number) {

		if (number == null) {
			return 0;
		}

		return number.byteValue();
	}


	/**
	 * Get the null safe longValue of a Number. Defaults to 0.
	 * 
	 * @param number
	 *            The Number to convert.
	 * @return The null safe longValue. Defaults to 0.
	 */
	public static long longValue(final Number number) {

		if (number == null) {
			return 0;
		}

		return number.longValue();
	}


	/**
	 * Get the null safe shortValue of a Number. Defaults to 0.
	 * 
	 * @param number
	 *            The Number to convert.
	 * @return The null safe shortValue. Defaults to 0.
	 */
	public static short shortValue(final Number number) {

		if (number == null) {
			return 0;
		}

		return number.shortValue();
	}


	/**
	 * Get the null safe floatValue of a Number. Defaults to 0.
	 * 
	 * @param number
	 *            The Number to convert.
	 * @return The null safe floatValue. Defaults to 0.
	 */
	public static float floatValue(final Number number) {

		if (number == null) {
			return 0;
		}

		return number.floatValue();
	}


	public static int limit(int value, int min, int max) {

		if (min > max) {
			throw new IllegalArgumentException("min > max");
		}

		return Math.max(Math.min(value, max), min);
	}


	public static long limit(long value, long min, long max) {

		if (min > max) {
			throw new IllegalArgumentException("min > max");
		}

		return Math.max(Math.min(value, max), min);
	}


	public static float limit(float value, float min, float max) {

		if (min > max) {
			throw new IllegalArgumentException("min > max");
		}

		return Math.max(Math.min(value, max), min);
	}


	public static double limit(double value, double min, double max) {

		if (min > max) {
			throw new IllegalArgumentException("min > max");
		}

		return Math.max(Math.min(value, max), min);
	}


	public static int compare(int lhs, int rhs) {

		if (lhs < rhs) {
			return -1;
		}

		if (lhs > rhs) {
			return +1;
		}

		return 0;
	}

}
