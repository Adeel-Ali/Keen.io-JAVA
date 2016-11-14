/*
 * KeenIoLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 11/14/2016
 */
package io.keen.api.controllers;

import java.io.*;
import java.util.*;
import java.util.concurrent.*;
import com.fasterxml.jackson.core.type.TypeReference;

import io.keen.api.*;
import io.keen.api.models.*;
import io.keen.api.exceptions.*;
import io.keen.api.http.client.HttpClient;
import io.keen.api.http.client.HttpContext;
import io.keen.api.http.request.HttpRequest;
import io.keen.api.http.response.HttpResponse;
import io.keen.api.http.response.HttpStringResponse;
import io.keen.api.http.client.APICallBack;
import io.keen.api.controllers.syncwrapper.APICallBackCatcher;

public class SelectUniqueResourceController extends BaseController {    
    //private static variables for the singleton pattern
    private static Object syncObject = new Object();
    private static SelectUniqueResourceController instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the SelectUniqueResourceController class 
     */
    public static SelectUniqueResourceController getInstance() {
        synchronized (syncObject) {
            if (null == instance) {
                instance = new SelectUniqueResourceController();
            }
        }
        return instance;
    }

    /**
     *  returns a list of UNIQUE resources in the event collection matching the given criteria. The response will be a simple JSON object with one key: result, which maps to an array of unique property values.
     * @param    GetSelectUniqueResourceInput    Object containing request parameters
     * @return    Returns the SelectUniqueResourceResponse response from the API call 
     */
    public SelectUniqueResourceResponse getSelectUniqueResource(
                final GetSelectUniqueResourceInput input
    ) throws Throwable {
        APICallBackCatcher<SelectUniqueResourceResponse> callback = new APICallBackCatcher<SelectUniqueResourceResponse>();
        getSelectUniqueResourceAsync(input, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     *  returns a list of UNIQUE resources in the event collection matching the given criteria. The response will be a simple JSON object with one key: result, which maps to an array of unique property values.
     * @param    GetSelectUniqueResourceInput    Object containing request parameters
     * @return    Returns the void response from the API call 
     */
    public void getSelectUniqueResourceAsync(
                final GetSelectUniqueResourceInput input,
                final APICallBack<SelectUniqueResourceResponse> callBack
    ) {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/{version}/projects/{project_id}/queries/select_unique");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5493143748461443644L;
            {
                    put( "project_id", input.getProjectId() );
                    put( "version", input.getVersion() );
            }});

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5029205268705047967L;
            {
                    put( "event_collection", input.getEventCollection() );
                    put( "target_property", input.getTargetProperty() );
                    put( "filters", input.getFilters() );
                    put( "group_by", input.getGroupBy() );
                    put( "interval", input.getInterval() );
                    put( "timeframe", input.getTimeframe() );
                    put( "timezone", input.getTimezone() );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5546540377376905869L;
            {
                    put( "user-agent", "APIMATIC 2.0" );
                    put( "accept", "application/json" );
                    put( "Authorization", Configuration.authorization );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest _request = getClientInstance().get(_queryUrl, _headers, null);

        //invoke the callback before request if its not null
        if (getHttpCallBack() != null)
        {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        //invoke request and get response
        Runnable _responseTask = new Runnable() {
            public void run() {
                //make the API call
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {

                            //invoke the callback after response if its not null
                            if (getHttpCallBack() != null)	
                            {
                                getHttpCallBack().OnAfterResponse(_context);
                            }

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //extract result from the http response
                            String _responseBody = ((HttpStringResponse)_response).getBody();
                            SelectUniqueResourceResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<SelectUniqueResourceResponse>(){});

                            //let the caller know of the success
                            callBack.onSuccess(_context, _result);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(_context, error);
                        } catch (IOException ioException) {
                            //let the caller know of the caught IO Exception
                            callBack.onFailure(_context, ioException);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(_context, exception);
                        }
                    }
                    public void onFailure(HttpContext _context, Throwable _error) {
                        //invoke the callback after response if its not null
                        if (getHttpCallBack() != null)	
                            {
                            getHttpCallBack().OnAfterResponse(_context);
                        }

                        //let the caller know of the failure
                        callBack.onFailure(_context, _error);
                    }
                });
            }
        };

        //execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

}