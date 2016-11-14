/*
 * KeenIoLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 11/14/2016
 */
package io.keen.api.models;

import java.util.*;

public class GetQueriesResourceInputBuilder {
    //the instance to build
    private GetQueriesResourceInput getQueriesResourceInput;

    /**
     * Default constructor to initialize the instance
     */
    public GetQueriesResourceInputBuilder() {
        getQueriesResourceInput = new GetQueriesResourceInput();
    }

    public GetQueriesResourceInputBuilder projectId(String projectId) {
        getQueriesResourceInput.setProjectId(projectId);
        return this;
    }

    public GetQueriesResourceInputBuilder version(String version) {
        getQueriesResourceInput.setVersion(version);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GetQueriesResourceInput build() {
        return getQueriesResourceInput;
    }
}