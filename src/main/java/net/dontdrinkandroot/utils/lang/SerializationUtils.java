/*
 * Copyright (C) 2012-2017 Philip W. Sorst <philip@sorst.net>
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

import org.apache.commons.lang3.SerializationException;

import java.io.*;

/**
 * @author Philip Washington Sorst <philip@sorst.net>
 */
public class SerializationUtils extends org.apache.commons.lang3.SerializationUtils
{
    @SuppressWarnings("unchecked")
    public static <T extends Serializable> T fastClone(T object)
    {
        Object obj = null;
        try {

            /* Write the object out to a byte array */
            FastByteArrayOutputStream fbos = new FastByteArrayOutputStream();
            ObjectOutputStream out = new ObjectOutputStream(fbos);
            out.writeObject(object);
            out.flush();
            out.close();

            /* Retrieve an input stream from the byte array and read a copy of the object back in. */
            ObjectInputStream in = new ObjectInputStream(fbos.getInputStream());
            obj = in.readObject();
        } catch (IOException e) {
            throw new SerializationException(e);
        } catch (ClassNotFoundException cnfe) {
            throw new SerializationException(cnfe);
        }

        return (T) obj;
    }

    /**
     * Convenience method that does not require the input to implement Serializable. Of course it
     * still needs to be serializable.
     *
     * @see SerializationUtils#serialize(Serializable, OutputStream)
     */
    public static void serialize(Object obj, OutputStream outputStream)
    {
        SerializationUtils.serialize((Serializable) obj, outputStream);
    }

    /**
     * Convenience method that does not require the input to implement Serializable. Of course it
     * still needs to be serializable.
     *
     * @see SerializationUtils#serialize(Serializable)
     */
    public static byte[] serialize(Object obj)
    {
        return SerializationUtils.serialize((Serializable) obj);
    }
}
