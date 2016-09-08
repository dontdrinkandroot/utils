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
package net.dontdrinkandroot.utils.resource;

import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;


public class CachedFileResource extends StreamableWebResource
{

    private final File file;

    private Long expiry;

    private String fileName;

    public CachedFileResource(final File file)
    {
        this.file = file;
    }

    @Override
    public void write(final OutputStream os) throws IOException
    {
        final FileInputStream fis = new FileInputStream(this.file);
        IOUtils.copy(fis, os);
        IOUtils.closeQuietly(fis);
    }

    @Override
    public Integer getErrorCode()
    {
        if (!this.file.exists()) {
            return 404;
        }

        return null;
    }

    @Override
    public String getErrorMessage()
    {
        if (!this.file.exists()) {
            return "Not found";
        }

        return null;
    }

    @Override
    public String getFileName()
    {
        return this.fileName;
    }

    @Override
    public String getContentType()
    {
        try {
            return Files.probeContentType(this.file.toPath());
        } catch (IOException e) {
            return null;
        }
    }

    @Override
    public String getTextEncoding()
    {
        return null;
    }

    @Override
    public Long getContentLength()
    {
        return this.file.length();
    }

    @Override
    public Long getLastModified()
    {
        return this.file.lastModified();
    }

    @Override
    public Long getExpiry()
    {
        return this.expiry;
    }

    public StreamableWebResource setExpiry(final Long expiry)
    {
        this.expiry = expiry;

        return this;
    }

    public void setFileName(final String fileName)
    {
        this.fileName = fileName;
    }
}
