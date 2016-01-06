/*
 * RNumericVector.java
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

import java.util.List;

/**
 * Represents an R vector of numeric values.
 */
public interface RNumericVector extends RData {

    /**
     * Gets the List of Double values for this RData.
     *
     * @return List<Double> value
     * @see RData
     */
    public List<Double> getValue();
}
