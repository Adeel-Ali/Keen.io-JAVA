/*
 * KeenIoLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 11/14/2016
 */
package io.keen.api.models;

import java.util.*;

public class GetProjectAccessibleResponseBuilder {
    //the instance to build
    private GetProjectAccessibleResponse getProjectAccessibleResponse;

    /**
     * Default constructor to initialize the instance
     */
    public GetProjectAccessibleResponseBuilder() {
        getProjectAccessibleResponse = new GetProjectAccessibleResponse();
    }

    public GetProjectAccessibleResponseBuilder apiKey(String apiKey) {
        getProjectAccessibleResponse.setApiKey(apiKey);
        return this;
    }

    public GetProjectAccessibleResponseBuilder events(List<String> events) {
        getProjectAccessibleResponse.setEvents(events);
        return this;
    }

    public GetProjectAccessibleResponseBuilder eventsUrl(String eventsUrl) {
        getProjectAccessibleResponse.setEventsUrl(eventsUrl);
        return this;
    }

    public GetProjectAccessibleResponseBuilder id(String id) {
        getProjectAccessibleResponse.setId(id);
        return this;
    }

    public GetProjectAccessibleResponseBuilder name(String name) {
        getProjectAccessibleResponse.setName(name);
        return this;
    }

    public GetProjectAccessibleResponseBuilder organizationId(String organizationId) {
        getProjectAccessibleResponse.setOrganizationId(organizationId);
        return this;
    }

    public GetProjectAccessibleResponseBuilder partnersUrl(String partnersUrl) {
        getProjectAccessibleResponse.setPartnersUrl(partnersUrl);
        return this;
    }

    public GetProjectAccessibleResponseBuilder queriesUrl(String queriesUrl) {
        getProjectAccessibleResponse.setQueriesUrl(queriesUrl);
        return this;
    }

    public GetProjectAccessibleResponseBuilder savedQueries(List<String> savedQueries) {
        getProjectAccessibleResponse.setSavedQueries(savedQueries);
        return this;
    }

    public GetProjectAccessibleResponseBuilder savedQueriesUrl(String savedQueriesUrl) {
        getProjectAccessibleResponse.setSavedQueriesUrl(savedQueriesUrl);
        return this;
    }

    public GetProjectAccessibleResponseBuilder url(String url) {
        getProjectAccessibleResponse.setUrl(url);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GetProjectAccessibleResponse build() {
        return getProjectAccessibleResponse;
    }
}