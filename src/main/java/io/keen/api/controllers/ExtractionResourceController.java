/*
 * KeenIoLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 11/14/2016
 */
package io.keen.api.controllers;

import java.io.*;
import java.util.*;
import java.util.concurrent.*;

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

public class ExtractionResourceController extends BaseController {    
    //private static variables for the singleton pattern
    private static Object syncObject = new Object();
    private static ExtractionResourceController instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the ExtractionResourceController class 
     */
    public static ExtractionResourceController getInstance() {
        synchronized (syncObject) {
            if (null == instance) {
                instance = new ExtractionResourceController();
            }
        }
        return instance;
    }

    /**
     * creates an extraction request for full-form event data with all property values. See Data Extractions for more details. If the query string parameter email is specified, then the extraction will be processed asynchronously and an e-mail will be sent to the specified address when it completes. The email will include a link to a downloadable CSV file. If email is omitted, then the extraction will be processed in-line and JSON results will be returned in the GET request.
     * @param    GetExtractionResourceInput    Object containing request parameters
     * @return    Returns the DynamicResponse response from the API call 
     */
    public DynamicResponse getExtractionResource(
                final GetExtractionResourceInput input
    ) throws Throwable {
        APICallBackCatcher<DynamicResponse> callback = new APICallBackCatcher<DynamicResponse>();
        getExtractionResourceAsync(input, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * creates an extraction request for full-form event data with all property values. See Data Extractions for more details. If the query string parameter email is specified, then the extraction will be processed asynchronously and an e-mail will be sent to the specified address when it completes. The email will include a link to a downloadable CSV file. If email is omitted, then the extraction will be processed in-line and JSON results will be returned in the GET request.
     * @param    GetExtractionResourceInput    Object containing request parameters
     * @return    Returns the void response from the API call 
     */
    public void getExtractionResourceAsync(
                final GetExtractionResourceInput input,
                final APICallBack<DynamicResponse> callBack
    ) {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/{version}/projects/{project_id}/queries/extraction");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4945014043991010608L;
            {
                    put( "project_id", input.getProjectId() );
                    put( "version", input.getVersion() );
            }});

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4662287150945200312L;
            {
                    put( "event_collection", input.getEventCollection() );
                    put( "email", input.getEmail() );
                    put( "filters", input.getFilters() );
                    put( "latest", input.getLatest() );
                    put( "property_names", input.getPropertyNames() );
                    put( "timeframe", input.getTimeframe() );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4959348808996551099L;
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
                            DynamicResponse _result = new DynamicResponse(_response);

                            callBack.onSuccess(_context, _result);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(_context, error);
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