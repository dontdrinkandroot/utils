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

import org.apache.commons.collections15.Transformer;

import java.util.Iterator;


/**
 * 
 * @author Philip W. Sorst
 */
public class StringUtils extends org.apache.commons.lang3.StringUtils {

    public static <T> CharSequence join(
            final Iterable<T> objects,
            final String seperator,
            final Transformer<T, String> toStringTransformer
    )
    {

        final StringBuffer sb = new StringBuffer();
        final Iterator<T> iterator = objects.iterator();
        while (iterator.hasNext()) {
            final T object = iterator.next();
            sb.append(toStringTransformer.transform(object));
            if (iterator.hasNext()) {
                sb.append(seperator);
            }
        }

        return sb;
    }

    public static <T> CharSequence join(
            final T[] objects,
            final String seperator,
            final Transformer<T, String> toStringTransformer
    )
    {

        final StringBuffer sb = new StringBuffer();
        for (int i = 0; i < objects.length; i++) {
            final T object = objects[i];
            sb.append(toStringTransformer.transform(object));
            if (i < objects.length - 1) {
                sb.append(seperator);
            }
        }

        return sb;
    }

}
