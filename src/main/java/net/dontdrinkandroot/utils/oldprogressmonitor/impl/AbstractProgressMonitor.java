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

import net.dontdrinkandroot.utils.Percent;
import net.dontdrinkandroot.utils.oldprogressmonitor.ProgressMonitor;
import net.dontdrinkandroot.utils.progressmonitor.ProgressStatus;


/**
 * Abstract {@link ProgressMonitor} that implements very common functionality.
 */
public abstract class AbstractProgressMonitor implements ProgressMonitor {

	/** The current progress. */
	private final ProgressStatus progress;

	/** The current range lower bound. */
	private int start = Percent.ZERO;

	/** The current range uppder bound. */
	private int end = Percent.HUNDRED;

	private boolean done = false;


	/**
	 * Default Constructor. Initialize to defaults.
	 */
	public AbstractProgressMonitor() {

		this.progress = new ProgressStatus();
	}


	@Override
	public final String getMessage() {

		return this.progress.getMessage();
	}


	@Override
	public final Integer getProgress() {

		return this.progress.getProgress();
	}


	@Override
	public ProgressStatus getProgressStatus() {

		return this.progress;
	}


	@Override
	public final int getRangeEnd() {

		return this.end;
	}


	@Override
	public final int getRangeStart() {

		return this.start;
	}


	@Override
	public final void setMessage(final String msg) {

		if (msg == null) {
			this.progress.setMessage("");
		} else {
			this.progress.setMessage(msg);
		}
		this.doMessageChanged();
	}


	/**
	 * Hook that is invoked after the message has changed.
	 */
	protected void doMessageChanged() {

	}


	@Override
	public final void setProgress(final int percent) {

		final int normPercent = Math.max(Percent.ZERO, Math.min(Percent.HUNDRED, percent));
		/* Set adjusted by range */
		this.progress.setProgress(this.start + ((this.end - this.start) * normPercent / Percent.HUNDRED));
		this.doProgressChanged();
	}


	/**
	 * Hook that is invoked after the progress has changed.
	 */
	protected void doProgressChanged() {

	}


	@Override
	public final void setRange(final int start, final int end) {

		if (start > end) {
			throw new IllegalArgumentException("Start range must be lower equals end range.");
		}
		this.start = Math.max(Percent.ZERO, Math.min(Percent.HUNDRED, start));
		this.end = Math.max(Percent.ZERO, Math.min(Percent.HUNDRED, end));
	}


	@Override
	public boolean isDone() {

		return this.done;
	}


	public void setDone(boolean done) {

		this.done = done;
	}

}
