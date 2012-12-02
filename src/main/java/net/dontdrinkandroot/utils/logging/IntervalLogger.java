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
package net.dontdrinkandroot.utils.logging;

import org.slf4j.Logger;


public class IntervalLogger {

	private final Logger logger;

	private final long interval;

	private long lastOutput;


	public IntervalLogger(final Logger logger, final long interval) {

		this.logger = logger;
		this.interval = interval;
		this.lastOutput = System.currentTimeMillis();
	}


	public final void info(final String msg) {

		final long now = System.currentTimeMillis();
		if (now - this.lastOutput > this.interval) {
			this.logger.info(msg);
			this.lastOutput = now;
		}
	}

}
