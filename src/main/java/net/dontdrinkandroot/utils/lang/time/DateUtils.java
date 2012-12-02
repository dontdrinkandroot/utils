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
package net.dontdrinkandroot.utils.lang.time;

import java.text.SimpleDateFormat;


public class DateUtils extends org.apache.commons.lang3.time.DateUtils {

	public static final int SECONDS_PER_MINUTE = 60;

	public static final int MINUTES_PER_HOUR = 60;

	public static final int HOURS_PER_DAY = 24;

	public static final int DAYS_PER_WEEK = 7;

	public static SimpleDateFormat RFC3339Format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");

}
