/*
 * KeenIoLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 11/14/2016
 */
package io.keen.api.models;

import java.util.*;

public class SelectUniqueResourceResponseBuilder {
    //the instance to build
    private SelectUniqueResourceResponse selectUniqueResourceResponse;

    /**
     * Default constructor to initialize the instance
     */
    public SelectUniqueResourceResponseBuilder() {
        selectUniqueResourceResponse = new SelectUniqueResourceResponse();
    }

    public SelectUniqueResourceResponseBuilder result(List<String> result) {
        selectUniqueResourceResponse.setResult(result);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public SelectUniqueResourceResponse build() {
        return selectUniqueResourceResponse;
    }
}