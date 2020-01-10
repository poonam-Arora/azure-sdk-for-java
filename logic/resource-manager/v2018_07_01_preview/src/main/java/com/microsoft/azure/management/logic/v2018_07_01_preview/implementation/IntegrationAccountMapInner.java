/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2018_07_01_preview.implementation;

import com.microsoft.azure.management.logic.v2018_07_01_preview.MapType;
import com.microsoft.azure.management.logic.v2018_07_01_preview.IntegrationAccountMapPropertiesParametersSchema;
import org.joda.time.DateTime;
import com.microsoft.azure.management.logic.v2018_07_01_preview.ContentLink;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * The integration account map.
 */
@JsonFlatten
@SkipParentValidation
public class IntegrationAccountMapInner extends Resource {
    /**
     * The map type. Possible values include: 'NotSpecified', 'Xslt', 'Xslt20',
     * 'Xslt30', 'Liquid'.
     */
    @JsonProperty(value = "properties.mapType", required = true)
    private MapType mapType;

    /**
     * The parameters schema of integration account map.
     */
    @JsonProperty(value = "properties.parametersSchema")
    private IntegrationAccountMapPropertiesParametersSchema parametersSchema;

    /**
     * The created time.
     */
    @JsonProperty(value = "properties.createdTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime createdTime;

    /**
     * The changed time.
     */
    @JsonProperty(value = "properties.changedTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime changedTime;

    /**
     * The content.
     */
    @JsonProperty(value = "properties.content")
    private String content;

    /**
     * The content type.
     */
    @JsonProperty(value = "properties.contentType")
    private String contentType;

    /**
     * The content link.
     */
    @JsonProperty(value = "properties.contentLink", access = JsonProperty.Access.WRITE_ONLY)
    private ContentLink contentLink;

    /**
     * The metadata.
     */
    @JsonProperty(value = "properties.metadata")
    private Object metadata;

    /**
     * Get the map type. Possible values include: 'NotSpecified', 'Xslt', 'Xslt20', 'Xslt30', 'Liquid'.
     *
     * @return the mapType value
     */
    public MapType mapType() {
        return this.mapType;
    }

    /**
     * Set the map type. Possible values include: 'NotSpecified', 'Xslt', 'Xslt20', 'Xslt30', 'Liquid'.
     *
     * @param mapType the mapType value to set
     * @return the IntegrationAccountMapInner object itself.
     */
    public IntegrationAccountMapInner withMapType(MapType mapType) {
        this.mapType = mapType;
        return this;
    }

    /**
     * Get the parameters schema of integration account map.
     *
     * @return the parametersSchema value
     */
    public IntegrationAccountMapPropertiesParametersSchema parametersSchema() {
        return this.parametersSchema;
    }

    /**
     * Set the parameters schema of integration account map.
     *
     * @param parametersSchema the parametersSchema value to set
     * @return the IntegrationAccountMapInner object itself.
     */
    public IntegrationAccountMapInner withParametersSchema(IntegrationAccountMapPropertiesParametersSchema parametersSchema) {
        this.parametersSchema = parametersSchema;
        return this;
    }

    /**
     * Get the created time.
     *
     * @return the createdTime value
     */
    public DateTime createdTime() {
        return this.createdTime;
    }

    /**
     * Get the changed time.
     *
     * @return the changedTime value
     */
    public DateTime changedTime() {
        return this.changedTime;
    }

    /**
     * Get the content.
     *
     * @return the content value
     */
    public String content() {
        return this.content;
    }

    /**
     * Set the content.
     *
     * @param content the content value to set
     * @return the IntegrationAccountMapInner object itself.
     */
    public IntegrationAccountMapInner withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * Get the content type.
     *
     * @return the contentType value
     */
    public String contentType() {
        return this.contentType;
    }

    /**
     * Set the content type.
     *
     * @param contentType the contentType value to set
     * @return the IntegrationAccountMapInner object itself.
     */
    public IntegrationAccountMapInner withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * Get the content link.
     *
     * @return the contentLink value
     */
    public ContentLink contentLink() {
        return this.contentLink;
    }

    /**
     * Get the metadata.
     *
     * @return the metadata value
     */
    public Object metadata() {
        return this.metadata;
    }

    /**
     * Set the metadata.
     *
     * @param metadata the metadata value to set
     * @return the IntegrationAccountMapInner object itself.
     */
    public IntegrationAccountMapInner withMetadata(Object metadata) {
        this.metadata = metadata;
        return this;
    }

}