/*
 * Copyright 2016 Netflix, Inc.
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *        http://www.apache.org/licenses/LICENSE-2.0
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.netflix.metacat.common.server.connectors.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

/**
 * Partition save response.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class PartitionsSaveResponse {
    /** List of added partition names. */
    private List<String> added;
    /** List of updated partition names. */
    private List<String> updated;

    /**
     * Default constructor.
     */
    public PartitionsSaveResponse() {
        added = new ArrayList<>();
        updated = new ArrayList<>();
    }
}