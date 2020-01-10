/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2018_06_01_preview.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * API Export result Blob Uri.
 */
public class ApiExportResultInner {
    /**
     * Link to the Storage Blob containing the result of the export operation.
     * The Blob Uri is only valid for 5 minutes.
     */
    @JsonProperty(value = "link")
    private String link;

    /**
     * Get link to the Storage Blob containing the result of the export operation. The Blob Uri is only valid for 5 minutes.
     *
     * @return the link value
     */
    public String link() {
        return this.link;
    }

    /**
     * Set link to the Storage Blob containing the result of the export operation. The Blob Uri is only valid for 5 minutes.
     *
     * @param link the link value to set
     * @return the ApiExportResultInner object itself.
     */
    public ApiExportResultInner withLink(String link) {
        this.link = link;
        return this;
    }

}