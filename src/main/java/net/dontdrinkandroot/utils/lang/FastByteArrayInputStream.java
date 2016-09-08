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


/**
 * ByteArrayInputStream implementation that does not synchronize methods. Source:
 * http://javatechniques.com/blog/faster-deep-copies-of-java-objects/
 */
public class FastByteArrayInputStream extends InputStream
{

    /**
     * Our byte buffer
     */
    protected byte[] buf = null;

    /**
     * Number of bytes that we can read from the buffer
     */
    protected int count = 0;

    /**
     * Number of bytes that have been read from the buffer
     */
    protected int pos = 0;

    public FastByteArrayInputStream(byte[] buf, int count)
    {
        this.buf = buf;
        this.count = count;
    }

    @Override
    public final int available()
    {
        return this.count - this.pos;
    }

    @Override
    public final int read()
    {
        return this.pos < this.count ? this.buf[this.pos++] & 0xff : -1;
    }

    @Override
    public final int read(byte[] b, int off, int len)
    {
        if (this.pos >= this.count) {
            return -1;
        }

        if (this.pos + len > this.count) {
            len = this.count - this.pos;
        }

        System.arraycopy(this.buf, this.pos, b, off, len);
        this.pos += len;
        return len;
    }

    @Override
    public final long skip(long n)
    {
        if (this.pos + n > this.count) {
            n = this.count - this.pos;
        }
        if (n < 0) {
            return 0;
        }
        this.pos += n;
        return n;
    }
}
