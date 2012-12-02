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
package net.dontdrinkandroot.utils.oldprogressmonitor;

import java.io.Serializable;

import net.dontdrinkandroot.utils.progressmonitor.ProgressStatus;


/**
 * A {@link ProgressMonitor} tracks the current progress of a longer lasting task.
 * 
 * @deprecated Use {@link net.dontdrinkandroot.utils.progressmonitor.ProgressMonitor} instead.
 */
@Deprecated
public interface ProgressMonitor extends Serializable {

	/**
	 * Retrieve the current progress percentage.
	 */
	Integer getProgress();


	/**
	 * Set the current progress percentage.
	 */
	void setProgress(int percent);


	/**
	 * Get the current progress message.
	 */
	String getMessage();


	/**
	 * Set the current progress message.
	 */
	void setMessage(String msg);


	/**
	 * Specify which range we are currently working on. This can be useful if a
	 * {@link ProgressMonitor} is shared among a larger set of tasks so each subtask can operate on
	 * a specific range. For example if the current range if from 0 to 50 and the progress is set to
	 * 50 the overall progress that can be retrieved by getProgress is 25.
	 * 
	 * @param start
	 *            The lower bound of the range.
	 * @param end
	 *            The upper bound of the range.
	 */
	void setRange(int start, int end);


	/**
	 * Get the lower bound of the current range.
	 */
	int getRangeStart();


	/**
	 * Get the upper bound of the current range.
	 */
	int getRangeEnd();


	/**
	 * Get the current progress status.
	 */
	ProgressStatus getProgressStatus();


	/**
	 * Flag to denote that the task has been done.
	 */
	boolean isDone();


	void setDone(boolean done);

}
