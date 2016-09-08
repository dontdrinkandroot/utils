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
package net.dontdrinkandroot.utils;

/**
 * Utility class to easily access standard java system properties.
 * 
 * @author Philip W. Sorst
 */
public class SystemProperties {

    /**
     * Utility class, disabled constructor.
     */
    protected SystemProperties()
    {

        /* Noop */
    }

    /**
     * The character encoding for the default locale.
     */
    public static String getFileEncoding()
    {

        return System.getProperty("file.encoding");
    }

    /**
     * The package that contains the converters that handle converting between local encodings and
     * Unicode.
     */
    public static String getFileEncodingPkg()
    {

        return System.getProperty("file.encoding.pkg");
    }

    /**
     * The platform-dependent file separator (e.g., "/" on UNIX, "\" for Windows).
     */
    public static String getFileSeparator()
    {

        return System.getProperty("file.separator");
    }

    /**
     * The value of the CLASSPATH environment variable
     */
    public static String getJavaClassPath()
    {

        return System.getProperty("java.class.path");
    }

    /**
     * The version of the Java API.
     */
    public static String getJavaClassVersion()
    {

        return System.getProperty("java.class.version");
    }

    /**
     * The just-in-time compiler to use, if any. The java interpreter provided with the JDK
     * initializes this property from the environment variable JAVA_COMPILER..
     */
    public static String getJavaCompiler()
    {

        return System.getProperty("java.compiler");
    }

    /**
     * The directory in which Java is installed.
     */
    public static String getJavaHome()
    {

        return System.getProperty("java.home");
    }

    /**
     * The directory in which java should create temporary files.
     */
    public static String getJavaIoTmpdir()
    {

        return System.getProperty("java.io.tmpdir");
    }

    /**
     * The version of the Java interpreter.
     */
    public static String getJavaVersion()
    {

        return System.getProperty("java.version");
    }

    /**
     * A vendor-specific string.
     */
    public static String getJavaVendor()
    {

        return System.getProperty("java.vendor");
    }

    /**
     * A vendor URL.
     */
    public static String getJavaVendorUrl()
    {

        return System.getProperty("java.vendor.url");
    }

    /**
     * The platform-dependent line separator (e.g., "\n" on UNIX, "\r\n" for Windows).
     */
    public static String getLineSeparator()
    {

        return System.getProperty("line.separator");
    }

    /**
     * The name of the operating system.
     */
    public static String getOsName()
    {

        return System.getProperty("os.name");
    }

    /**
     * The system architecture.
     */
    public static String getOsArch()
    {

        return System.getProperty("os.arch");
    }

    /**
     * The operating system version.
     */
    public static String getOsVersion()
    {

        return System.getProperty("os.version");
    }

    /**
     * The platform-dependent path separator (e.g., ":" on UNIX, "," for Windows).
     */
    public static String getPathSeparator()
    {

        return System.getProperty("path.separator");
    }

    /**
     * The current working directory when the properties were initialized.
     */
    public static String getUserDir()
    {

        return System.getProperty("user.dir");
    }

    /**
     * The home directory of the current user.
     */
    public static String getUserHome()
    {

        return System.getProperty("user.home");
    }

    /**
     * The two-letter language code of the default locale.
     */
    public static String getUserLanguage()
    {

        return System.getProperty("user.language");
    }

    /**
     * The username of the current user.
     */
    public static String getUserName()
    {

        return System.getProperty("user.name");
    }

    /**
     * The two-letter country code of the default locale.
     */
    public static String getUserRegion()
    {

        return System.getProperty("user.region");
    }

    /**
     * The default time zone.
     */
    public static String getUserTimezone()
    {

        return System.getProperty("user.timezone");
    }

}
