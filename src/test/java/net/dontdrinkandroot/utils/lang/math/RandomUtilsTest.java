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
package net.dontdrinkandroot.utils.lang.math;

import org.junit.Ignore;
import org.junit.Test;

public class RandomUtilsTest
{
    @Ignore
    @Test
    public void testPareto()
    {
        int iterations = 1000000;
        int smaller = 0;

        for (int i = 0; i < iterations; i++) {

            double rand = RandomUtils.pareto(.35);
            if (rand <= 100) {
                smaller++;
            }
        }

        System.out.println(smaller * 100 / iterations);
    }
}
