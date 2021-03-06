/*
 * RData.java
 *
 * Copyright (C) 2010-2016, Microsoft Corporation
 *
 * This program is licensed to you under the terms of Version 2.0 of the
 * Apache License. This program is distributed WITHOUT
 * ANY EXPRESS OR IMPLIED WARRANTY, INCLUDING THOSE OF NON-INFRINGEMENT,
 * MERCHANTABILITY OR FITNESS FOR A PARTICULAR PURPOSE. Please refer to the
 * Apache License 2.0 (http://www.apache.org/licenses/LICENSE-2.0) for more details.
 *
 */
package com.revo.deployr.client.data;

/**
 * Defines the common interface shared by all RData.
 */
public interface RData {

    /**
     * Gets the underlying R object name of this RData.
     *
     * @return String name
     */
    public String getName();

    /**
     * Gets the underlying DeployR type of this RData.
     *
     * @return String type
     */
    public String getType();

    /**
     * Gets the underlying R class of this RData.
     *
     * @return String rclass
     */
    public String getRclass();
}
