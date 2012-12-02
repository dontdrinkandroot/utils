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

import net.dontdrinkandroot.utils.lang.time.DateUtils;
import net.dontdrinkandroot.utils.oldprogressmonitor.ProgressMonitor;


/**
 * A {@link ProgressMonitor} implementation that outputs the progress to stdout on a single line. A
 * suppress duration specifies how long new updates are not printed.
 */
public class SingleLineConsoleMonitor extends AbstractProgressMonitor {

	/** The default line length. */
	private static final int DEFAULT_LINE_LENGTH = 80;

	/** Current suppress duration. */
	private long suppressDuration = DateUtils.MILLIS_PER_SECOND;

	/** Line length. */
	private int lineLength = SingleLineConsoleMonitor.DEFAULT_LINE_LENGTH;

	/** Timestamp when the last output has been written to stdout. */
	private long lastOutput = System.currentTimeMillis();


	/**
	 * Create a new {@link SingleLineConsoleMonitor} and initialize it. Default range is from 0 to
	 * 100. Default suppress duration is one second. Default line length is 80 characters;
	 */
	public SingleLineConsoleMonitor() {

		super();
	}


	/**
	 * Create a new {@link SingleLineConsoleMonitor} and initialize it with the specified suppress
	 * duration. Default line length is 80 characters. Default range is from 0 to 100.
	 * 
	 * @param suppressDuration
	 *            The suppress duration.
	 */
	public SingleLineConsoleMonitor(final long suppressDuration) {

		this.suppressDuration = suppressDuration;
	}


	/**
	 * Create a new {@link SingleLineConsoleMonitor} and initialize it with the specified suppress
	 * duration and line length. Default range is from 0 to 100.
	 * 
	 * @param suppressDuration
	 *            The suppress duration.
	 * @param lineLength
	 *            Line length to use.
	 */
	public SingleLineConsoleMonitor(final long suppressDuration, final int lineLength) {

		this.suppressDuration = suppressDuration;
		this.lineLength = lineLength;
	}


	@Override
	protected final void doMessageChanged() {

		this.outputAfterSuppress();
	}


	/**
	 * Only output to stdout after supress duration has expired.
	 */
	private void outputAfterSuppress() {

		if (System.currentTimeMillis() - this.lastOutput > this.suppressDuration) {
			String message = String.format("%3d%%: %s", this.getProgress(), this.getMessage());
			final int numFillCharacters = this.lineLength - message.length();
			for (int i = 0; i < numFillCharacters; i++) {
				message += " ";
			}
			System.out.print(message + "\r");
			this.lastOutput = System.currentTimeMillis();
		}
	}


	@Override
	protected final void doProgressChanged() {

		this.outputAfterSuppress();
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
