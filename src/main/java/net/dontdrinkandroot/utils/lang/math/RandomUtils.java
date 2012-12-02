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

public class RandomUtils {

	public static double PARETO_EIGHTY_PERCENT_UNDER_HUNDRED = .35;

	public static double PARETO_EIGHTY_PERCENT_UNDER_THOUSAND = 0.24;

	public static double PARETO_EIGHTY_PERCENT_UNDER_TENTHOUSAND = 0.18;

	public static double PARETO_EIGHTY_PERCENT_UNDER_TWENTYTHOUSAND = 0.165;

	public static double PARETO_EIGHTY_PERCENT_UNDER_HUNDREDTHOUSAND = 0.14;

	public static double PARETO_EIGHTY_PERCENT_UNDER_TWOHUNDREDTHOUSAND = 0.135;


	/**
	 * Taken from http://introcs.cs.princeton.edu/java/stdlib/.
	 * 
	 * <pre>
	 * 80% under 1000: 0.24
	 * 80% under 10000: 0.18
	 * 80% under 20000: 0.165
	 * 80% under 100000: 0.14
	 * 80% under 200000: 0.135
	 * </pre>
	 * 
	 * @param alpha
	 * @return
	 */
	public static double pareto(double alpha) {

		return Math.pow(1 - Math.random(), -1.0 / alpha) - 1.0;
	}

}
