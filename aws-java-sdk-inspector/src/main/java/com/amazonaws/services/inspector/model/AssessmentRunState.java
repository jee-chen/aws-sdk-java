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
package com.amazonaws.services.inspector.model;

/**
 * 
 */
public enum AssessmentRunState {

    CREATED("CREATED"),
    START_DATA_COLLECTION_PENDING("START_DATA_COLLECTION_PENDING"),
    START_DATA_COLLECTION_IN_PROGRESS("START_DATA_COLLECTION_IN_PROGRESS"),
    COLLECTING_DATA("COLLECTING_DATA"),
    STOP_DATA_COLLECTION_PENDING("STOP_DATA_COLLECTION_PENDING"),
    DATA_COLLECTED("DATA_COLLECTED"),
    EVALUATING_RULES("EVALUATING_RULES"),
    FAILED("FAILED"),
    COMPLETED("COMPLETED"),
    COMPLETED_WITH_ERRORS("COMPLETED_WITH_ERRORS");

    private String value;

    private AssessmentRunState(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *        real value
     * @return AssessmentRunState corresponding to the value
     */
    public static AssessmentRunState fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (AssessmentRunState enumEntry : AssessmentRunState.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
