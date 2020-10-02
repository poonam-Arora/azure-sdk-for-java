// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.indexes.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.search.documents.indexes.models.AnalyzedTokenInfo;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The result of testing an analyzer on text. */
@Fluent
public final class AnalyzeResult {
    /*
     * The list of tokens returned by the analyzer specified in the request.
     */
    @JsonProperty(value = "tokens", required = true)
    private List<AnalyzedTokenInfo> tokens;

    /**
     * Creates an instance of AnalyzeResult class.
     *
     * @param tokens the tokens value to set.
     */
    @JsonCreator
    public AnalyzeResult(@JsonProperty(value = "tokens", required = true) List<AnalyzedTokenInfo> tokens) {
        this.tokens = tokens;
    }

    /**
     * Get the tokens property: The list of tokens returned by the analyzer specified in the request.
     *
     * @return the tokens value.
     */
    public List<AnalyzedTokenInfo> getTokens() {
        return this.tokens;
    }
}
