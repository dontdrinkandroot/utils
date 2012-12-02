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
package net.dontdrinkandroot.utils.pair;

import java.io.Serializable;
import java.util.Iterator;


public class Pair<T extends Serializable> implements Serializable, Iterable<T> {

	private static final long serialVersionUID = 1L;

	private T first;

	private T second;


	public Pair() {

	}


	public Pair(T first, T second) {

		this.first = first;
		this.second = second;
	}


	public T getFirst() {

		return this.first;
	}


	public void setFirst(T first) {

		this.first = first;
	}


	public T getSecond() {

		return this.second;
	}


	public void setSecond(T second) {

		this.second = second;
	}


	@Override
	public int hashCode() {

		final int prime = 31;
		int result = 1;
		result = prime * result + ((this.first == null) ? 0 : this.first.hashCode());
		result = prime * result + ((this.second == null) ? 0 : this.second.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {

		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		Pair<?> other = (Pair<?>) obj;
		if (this.first == null) {
			if (other.first != null) {
				return false;
			}
		} else if (!this.first.equals(other.first)) {
			return false;
		}
		if (this.second == null) {
			if (other.second != null) {
				return false;
			}
		} else if (!this.second.equals(other.second)) {
			return false;
		}
		return true;
	}


	@Override
	public Iterator<T> iterator() {

		return new Iterator<T>() {

			private boolean isFirst = true;


			@Override
			public boolean hasNext() {

				return this.isFirst;
			}


			@Override
			public T next() {

				if (this.isFirst) {
					this.isFirst = false;
					return Pair.this.first;
				} else {
					return Pair.this.second;
				}
			}


			@Override
			public void remove() {

				throw new UnsupportedOperationException();

			}
		};
	}

}
