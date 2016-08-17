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

import java.io.InputStream;
import java.io.OutputStream;


/**
 * ByteArrayOutputStream implementation that doesn't synchronize methods and doesn't copy the data on toByteArray().
 * Source: http://javatechniques.com/blog/faster-deep-copies-of-java-objects/
 */
public class FastByteArrayOutputStream extends OutputStream
{

	/**
	 * Buffer and size
	 */
	protected byte[] buf = null;

	protected int size = 0;


	/**
	 * Constructs a stream with buffer capacity size 5K
	 */
	public FastByteArrayOutputStream()
	{
		this(5 * 1024);
	}

	/**
	 * Constructs a stream with the given initial size
	 */
	public FastByteArrayOutputStream(int initSize)
	{
		this.size = 0;
		this.buf = new byte[initSize];
	}

	/**
	 * Ensures that we have a large enough buffer for the given size.
	 */
	private void verifyBufferSize(int sz)
	{
		if (sz > this.buf.length) {
			byte[] old = this.buf;
			this.buf = new byte[Math.max(sz, 2 * this.buf.length)];
			System.arraycopy(old, 0, this.buf, 0, old.length);
			old = null;
		}
	}

	public int getSize()
	{
		return this.size;
	}

	/**
	 * Returns the byte array containing the written data. Note that this array will almost always be larger than the
	 * amount of data actually written.
	 */
	public byte[] getByteArray()
	{
		return this.buf;
	}

	@Override
	public final void write(byte b[])
	{
		this.verifyBufferSize(this.size + b.length);
		System.arraycopy(b, 0, this.buf, this.size, b.length);
		this.size += b.length;
	}

	@Override
	public final void write(byte b[], int off, int len)
	{
		this.verifyBufferSize(this.size + len);
		System.arraycopy(b, off, this.buf, this.size, len);
		this.size += len;
	}

	@Override
	public final void write(int b)
	{
		this.verifyBufferSize(this.size + 1);
		this.buf[this.size++] = (byte) b;
	}

	public void reset()
	{
		this.size = 0;
	}

	/**
	 * Returns a ByteArrayInputStream for reading back the written data
	 */
	public InputStream getInputStream()
	{
		return new FastByteArrayInputStream(this.buf, this.size);
	}
}
