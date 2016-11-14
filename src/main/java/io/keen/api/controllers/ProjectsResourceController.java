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

public class ProjectsResourceController extends BaseController {    
    //private static variables for the singleton pattern
    private static Object syncObject = new Object();
    private static ProjectsResourceController instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the ProjectsResourceController class 
     */
    public static ProjectsResourceController getInstance() {
        synchronized (syncObject) {
            if (null == instance) {
                instance = new ProjectsResourceController();
            }
        }
        return instance;
    }

    /**
     * Returns the projects accessible to the API user, as well as links to project sub-resources for discovery.
     * @param    version    Required parameter: Example: 
     * @return    Returns the List<GetProjectAccessibleResponse> response from the API call 
     */
    public List<GetProjectAccessibleResponse> getProjectsResource(
                final String version
    ) throws Throwable {
        APICallBackCatcher<List<GetProjectAccessibleResponse>> callback = new APICallBackCatcher<List<GetProjectAccessibleResponse>>();
        getProjectsResourceAsync(version, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Returns the projects accessible to the API user, as well as links to project sub-resources for discovery.
     * @param    version    Required parameter: Example: 
     * @return    Returns the void response from the API call 
     */
    public void getProjectsResourceAsync(
                final String version,
                final APICallBack<List<GetProjectAccessibleResponse>> callBack
    ) {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/{version}/projects");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5469361994868703333L;
            {
                    put( "version", version );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5265598020605770576L;
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
                            List<GetProjectAccessibleResponse> _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<List<GetProjectAccessibleResponse>>(){});

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