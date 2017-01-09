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
package net.dontdrinkandroot.utils.cli;

import java.io.File;
import java.lang.reflect.Field;
import java.util.*;
import java.util.Map.Entry;

/**
 * @author Philip Washington Sorst <philip@sorst.net>
 */
public class CommandLineArgumentParser
{
    private boolean parsed = false;

    private final Object annotatedObject;

    private Map<String, CommandLineArgument> annotatedArguments;

    private Map<String, Field> fields;

    private StringBuffer errors;

    public CommandLineArgumentParser(final Object annotatedObject)
    {
        this.annotatedObject = annotatedObject;
    }

    public final void evaluateArguments(final String[] args)
    {
        if (!this.parsed) {
            this.parse();
        }

        this.errors = new StringBuffer();

        final Set<String> requiredNames = this.findRequiredNames();

        for (int i = 0; i < args.length; i++) {

            if (!args[i].startsWith("-")) {

                this.errors.append("Unknown argument '" + args[i] + "'\n");
            } else {

                final String name = args[i].substring(1, args[i].length());

                if (!this.annotatedArguments.containsKey(name)) {

                    this.errors.append("Unknown argument '" + name + "'\n");
                } else {

                    final Field field = this.fields.get(name);
                    field.setAccessible(true);

                    if (this.isBoolean(field)) {

                        this.setBoolean(field);
                        requiredNames.remove(name);
                    } else {

                        // TODO: could be out of bounds
                        final String value = args[i + 1];
                        if (this.isString(field)) {

                            this.setString(field, value);
                            requiredNames.remove(name);
                        } else if (this.isInt(field)) {

                            this.setInt(field, value);
                            requiredNames.remove(name);
                        } else if (this.isFile(field)) {

                            this.setFile(field, value);
                            requiredNames.remove(name);
                        } else if (this.isDouble(field)) {

                            this.setDouble(field, value);
                            requiredNames.remove(name);
                        } else if (this.isFloat(field)) {

                            this.setFloat(field, value);
                            requiredNames.remove(name);
                        } else if (this.isLong(field)) {

                            this.setLong(field, value);
                            requiredNames.remove(name);
                        } else {

                            this.errors.append(String.format(
                                    "Dont' know how to parse %s with value %s for argument '%s'\n",
                                    field.getType().toString(),
                                    value,
                                    name
                            ));
                        }
                        i++;
                    }
                }
            }
        }

        if (!requiredNames.isEmpty()) {
            for (final String requiredName : requiredNames) {
                this.errors.append("Missing required argument '" + requiredName + "'\n");
            }
        }
    }

    public final boolean hasErrors()
    {
        if (this.errors == null) {
            return false;
        }

        final String errorString = this.errors.toString();

        return !errorString.equals("");
    }

    public final void printErrors()
    {
        System.out.println(this.errors);
    }

    public final void printUsage()
    {
        if (!this.parsed) {
            this.parse();
        }

        final List<String> sortedNames = new ArrayList<String>(this.annotatedArguments.keySet());
        Collections.sort(sortedNames);

        int maxNameLength = 0;
        int maxTypeLength = 0;
        for (final Entry<String, Field> entry : this.fields.entrySet()) {
            final String name = entry.getKey();
            final Field field = entry.getValue();
            if (name.length() > maxNameLength) {
                maxNameLength = name.length();
            }
            if (field.getType().getSimpleName().length() > maxTypeLength) {
                maxTypeLength = field.getType().getSimpleName().length();
            }
        }

        final StringBuffer usage = new StringBuffer("Usage:\n");
        for (final String name : sortedNames) {
            final Field field = this.fields.get(name);
            final CommandLineArgument annotation = this.annotatedArguments.get(name);
            usage.append(String.format("-%-" + maxNameLength + "s %-" + (maxTypeLength + 2) + "s : %s", name, "<"
                    + field.getType().getSimpleName() + ">", annotation.description()));
            if (annotation.required()) {
                usage.append(" (required)");
            }
            usage.append("\n");
        }

        System.out.println(usage);
    }

    private Set<String> findRequiredNames()
    {
        final Set<String> requiredNames = new HashSet<String>();
        for (final Entry<String, CommandLineArgument> entry : this.annotatedArguments.entrySet()) {
            if (entry.getValue().required()) {
                requiredNames.add(entry.getKey());
            }
        }

        return requiredNames;
    }

    private boolean isBoolean(final Field field)
    {
        return boolean.class.isAssignableFrom(field.getType()) || Boolean.class.isAssignableFrom(field.getType());
    }

    private boolean isFile(final Field field)
    {
        return File.class.isAssignableFrom(field.getType());
    }

    private boolean isDouble(final Field field)
    {
        return double.class.isAssignableFrom(field.getType()) || Double.class.isAssignableFrom(field.getType());
    }

    private boolean isInt(final Field field)
    {
        return int.class.isAssignableFrom(field.getType()) || Integer.class.isAssignableFrom(field.getType());
    }

    private boolean isLong(final Field field)
    {
        return long.class.isAssignableFrom(field.getType()) || Long.class.isAssignableFrom(field.getType());
    }

    private boolean isFloat(final Field field)
    {
        return float.class.isAssignableFrom(field.getType()) || Float.class.isAssignableFrom(field.getType());
    }

    private boolean isString(final Field field)
    {
        return String.class.isAssignableFrom(field.getType());
    }

    private void parse()
    {
        this.annotatedArguments = new HashMap<String, CommandLineArgument>();
        this.fields = new HashMap<String, Field>();

        // TODO check for duplicate name declarations
        for (final Field field : this.annotatedObject.getClass().getDeclaredFields()) {
            final CommandLineArgument annotation = field.getAnnotation(CommandLineArgument.class);
            if (annotation != null) {
                String name = field.getName();
                if (annotation.name() != null && !annotation.name().equals("")) {
                    name = annotation.name();
                }
                this.annotatedArguments.put(name, annotation);
                this.fields.put(name, field);
            }
        }

        this.parsed = true;
    }

    private void setBoolean(final Field field)
    {
        this.setField(field, true);
    }

    private void setFile(final Field field, final String value)
    {
        this.setField(field, new File(value));
    }

    private void setInt(final Field field, final String value)
    {
        this.setField(field, Integer.valueOf(value));
    }

    private void setDouble(final Field field, final String value)
    {
        this.setField(field, Double.valueOf(value));
    }

    private void setFloat(final Field field, final String value)
    {
        this.setField(field, Float.valueOf(value));
    }

    private void setLong(final Field field, final String value)
    {
        this.setField(field, Long.valueOf(value));
    }

    private void setString(final Field field, final String value)
    {
        this.setField(field, value);
    }

    private void setField(Field field, Object value)
    {
        try {

            field.setAccessible(true);
            field.set(this.annotatedObject, value);
        } catch (final IllegalArgumentException e) {
            this.errors.append(e.getMessage() + "\n");
        } catch (final IllegalAccessException e) {
            this.errors.append(e.getMessage() + "\n");
        }
    }
}
