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
package net.dontdrinkandroot.utils.oldprogressmonitor.impl;

import java.util.logging.Level;

import net.dontdrinkandroot.utils.oldprogressmonitor.ProgressMonitor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * A {@link ProgressMonitor} that outputs the progress to a {@link Logger}. A suppress duration
 * specifies how long new updates are not logged. The log level is 'info'.
 */
public class LogMonitor extends AbstractProgressMonitor {

	/** Current suprress duration. */
	private long suppressDuration = 0;

	/** Timestamp when the last output has been written to stdout. */
	private long lastOutput = System.currentTimeMillis();

	/** The logger to log to. */
	private Logger logger = LoggerFactory.getLogger(this.getClass());


	/**
	 * Construct a LogMonitor with the {@link Logger} corresponding to this class and Log
	 * {@link Level} info. Default suppress duration is 0.
	 */
	public LogMonitor() {

		super();
	}


	@Override
	protected final void doMessageChanged() {

		this.doLogging();
	}


	/**
	 * Do the actual logging.
	 */
	private void doLogging() {

		if (System.currentTimeMillis() - this.lastOutput > this.suppressDuration) {
			this.logger.info("%d: %s", this.getProgress(), this.getMessage());
			this.lastOutput = System.currentTimeMillis();
		}

	}


	@Override
	protected final void doProgressChanged() {

		this.doLogging();
	}


	/**
	 * Set the logger to log to.
	 * 
	 * @param logger
	 *            The logger to log to.
	 */
	public final void setLogger(final Logger logger) {

		this.logger = logger;
	}


	/**
	 * Get the logger to log to.
	 * 
	 * @return The logger to log to.
	 */
	public final Logger getLogger() {

		return this.logger;
	}


	/**
	 * Get current suppress duration.
	 * 
	 * @return Current suppress duration.
	 */
	public final long getSuppressDuration() {

		return this.suppressDuration;
	}


	/**
	 * Set current suppress duration.
	 * 
	 * @param suppressDuration
	 *            Current suppress duration.
	 */
	public final void setSuppressDuration(final long suppressDuration) {

		this.suppressDuration = suppressDuration;
	}

}
