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
package net.dontdrinkandroot.utils.cli;

public abstract class CommandLineArgumentMain {

	protected final void setupAndRun(final String[] args) {

		final CommandLineArgumentParser parser = new CommandLineArgumentParser(this);

		parser.evaluateArguments(args);

		if (parser.hasErrors()) {
			if (this.handleFailure(parser)) {
				return;
			}
		}

		boolean shallRun = true;
		try {
			this.setup();
		} catch (Exception e) {
			shallRun = this.setupFailed(e);
		}

		if (shallRun) {
			try {
				this.run();
			} catch (Exception e) {
				this.runFailed(e);
			}
		}
	}


	/**
	 * Handle exceptions thrown during setup.
	 * 
	 * @return True if the run method should be executed anyway, false otherwise.
	 */
	protected boolean setupFailed(Exception e) {

		e.printStackTrace();
		return false;
	}


	/**
	 * Handle exceptions thrown during run.
	 */
	protected void runFailed(Exception e) {

		e.printStackTrace();
	}


	/**
	 * @return If the failure has been handled and execution should stop.
	 */
	protected boolean handleFailure(CommandLineArgumentParser parser) {

		parser.printErrors();
		parser.printUsage();

		System.exit(-1);

		return true;
	}


	/**
	 * Hook where initialization can be performed after the arguments have been parsed
	 */
	protected void setup() throws Exception {

	}


	public abstract void run() throws Exception;

}
