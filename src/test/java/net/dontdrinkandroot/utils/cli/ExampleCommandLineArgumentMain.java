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

import java.io.File;


public class ExampleCommandLineArgumentMain extends CommandLineArgumentMain {

	@CommandLineArgument(description = "String Property")
	private String stringProperty;

	@CommandLineArgument(description = "Boolean Property")
	private Boolean booleanProperty;

	@CommandLineArgument(description = "Integer Property")
	private Integer integerProperty;

	@CommandLineArgument(description = "Long Property")
	private Long longProperty;

	@CommandLineArgument(description = "Double Property")
	private Double doubleProperty;

	@CommandLineArgument(description = "Float Property")
	private Float floatProperty;

	@CommandLineArgument(description = "File Property", name = "file", required = true)
	private File fileProperty;

	private boolean ran = false;


	@Override
	public void run() {

		this.ran = true;
	}


	@Override
	protected boolean handleFailure(CommandLineArgumentParser parser) {

		parser.printErrors();
		parser.printUsage();

		return true;
	}


	public String getStringProperty() {

		return this.stringProperty;
	}


	public void setStringProperty(String stringProperty) {

		this.stringProperty = stringProperty;
	}


	public Boolean getBooleanProperty() {

		return this.booleanProperty;
	}


	public void setBooleanProperty(Boolean booleanProperty) {

		this.booleanProperty = booleanProperty;
	}


	public Integer getIntegerProperty() {

		return this.integerProperty;
	}


	public void setIntegerProperty(Integer integerProperty) {

		this.integerProperty = integerProperty;
	}


	public Long getLongProperty() {

		return this.longProperty;
	}


	public void setLongProperty(Long longProperty) {

		this.longProperty = longProperty;
	}


	public Double getDoubleProperty() {

		return this.doubleProperty;
	}


	public void setDoubleProperty(Double doubleProperty) {

		this.doubleProperty = doubleProperty;
	}


	public Float getFloatProperty() {

		return this.floatProperty;
	}


	public void setFloatProperty(Float floatProperty) {

		this.floatProperty = floatProperty;
	}


	public File getFileProperty() {

		return this.fileProperty;
	}


	public void setFileProperty(File fileProperty) {

		this.fileProperty = fileProperty;
	}


	public boolean isRan() {

		return this.ran;
	}


	public void setRan(boolean ran) {

		this.ran = ran;
	}

}
