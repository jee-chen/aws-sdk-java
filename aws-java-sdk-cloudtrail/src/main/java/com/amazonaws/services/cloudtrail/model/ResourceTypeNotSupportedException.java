/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.cloudtrail.model;

/**
 * <p>
 * This exception is thrown when the specified resource type is not supported by CloudTrail.
 * </p>
 */
public class ResourceTypeNotSupportedException extends com.amazonaws.services.cloudtrail.model.AWSCloudTrailException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new ResourceTypeNotSupportedException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public ResourceTypeNotSupportedException(String message) {
        super(message);
    }

}
