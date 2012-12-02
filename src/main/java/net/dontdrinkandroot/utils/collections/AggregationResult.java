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

public class AggregationResult {

	private double sum = 0;

	private double min = Double.MAX_VALUE;

	private double max = Double.MIN_VALUE;

	private double avg = 0;

	private double mean = 0;

	private int size;


	public final double getSum() {

		return this.sum;
	}


	public final void setSum(final double sum) {

		this.sum = sum;
	}


	public final double getMin() {

		return this.min;
	}


	public final void setMin(final double min) {

		this.min = min;
	}


	public final double getMax() {

		return this.max;
	}


	public final void setMax(final double max) {

		this.max = max;
	}


	public final double getAvg() {

		return this.avg;
	}


	public final void setAvg(final double avg) {

		this.avg = avg;
	}


	public final double getMean() {

		return this.mean;
	}


	public final void setMean(final double mean) {

		this.mean = mean;
	}


	public final void setSize(final int size) {

		this.size = size;
	}


	public final int getSize() {

		return this.size;
	}


	@Override
	public final String toString() {

		return String.format(
				"size: %d, min: %.2f, max: %.2f, sum: %.2f, avg: %.2f, mean: %.2f",
				this.size,
				this.min,
				this.max,
				this.sum,
				this.avg,
				this.mean
		);
	}

}
