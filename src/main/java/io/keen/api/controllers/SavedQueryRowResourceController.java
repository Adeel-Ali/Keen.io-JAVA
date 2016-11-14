/*
 * KeenIoLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 11/14/2016
 */
package io.keen.api.controllers;

import java.io.*;
import java.util.*;
import java.util.concurrent.*;
import com.fasterxml.jackson.core.JsonProcessingException;
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

public class SavedQueryRowResourceController extends BaseController {    
    //private static variables for the singleton pattern
    private static Object syncObject = new Object();
    private static SavedQueryRowResourceController instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the SavedQueryRowResourceController class 
     */
    public static SavedQueryRowResourceController getInstance() {
        synchronized (syncObject) {
            if (null == instance) {
                instance = new SavedQueryRowResourceController();
            }
        }
        return instance;
    }

    /**
     * DELETE just plain old deletes the Saved Query.
     * @param    DeleteSavedQueryRowResourceInput    Object containing request parameters
     * @return    Returns the DynamicResponse response from the API call 
     */
    public DynamicResponse deleteSavedQueryRowResource(
                final DeleteSavedQueryRowResourceInput input
    ) throws Throwable {
        APICallBackCatcher<DynamicResponse> callback = new APICallBackCatcher<DynamicResponse>();
        deleteSavedQueryRowResourceAsync(input, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * DELETE just plain old deletes the Saved Query.
     * @param    DeleteSavedQueryRowResourceInput    Object containing request parameters
     * @return    Returns the void response from the API call 
     */
    public void deleteSavedQueryRowResourceAsync(
                final DeleteSavedQueryRowResourceInput input,
                final APICallBack<DynamicResponse> callBack
    ) {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/{version}/projects/{project_id}/saved_queries/{saved_query_name}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4932335362876350135L;
            {
                    put( "project_id", input.getProjectId() );
                    put( "saved_query_name", input.getSavedQueryName() );
                    put( "version", input.getVersion() );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4835620749857606221L;
            {
                    put( "user-agent", "APIMATIC 2.0" );
                    put( "accept", "application/json" );
                    put( "Authorization", Configuration.authorization );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest _request = getClientInstance().delete(_queryUrl, _headers, null);

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

    /**
     * GET returns information about the specified Saved Query and includes links to child-resources.
     * @param    GetSavedQueryRowResourceInput    Object containing request parameters
     * @return    Returns the SavedQueriesListResourceResponse response from the API call 
     */
    public SavedQueriesListResourceResponse getSavedQueryRowResource(
                final GetSavedQueryRowResourceInput input
    ) throws Throwable {
        APICallBackCatcher<SavedQueriesListResourceResponse> callback = new APICallBackCatcher<SavedQueriesListResourceResponse>();
        getSavedQueryRowResourceAsync(input, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * GET returns information about the specified Saved Query and includes links to child-resources.
     * @param    GetSavedQueryRowResourceInput    Object containing request parameters
     * @return    Returns the void response from the API call 
     */
    public void getSavedQueryRowResourceAsync(
                final GetSavedQueryRowResourceInput input,
                final APICallBack<SavedQueriesListResourceResponse> callBack
    ) {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/{version}/projects/{project_id}/saved_queries/{saved_query_name}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4915584888977944628L;
            {
                    put( "project_id", input.getProjectId() );
                    put( "saved_query_name", input.getSavedQueryName() );
                    put( "version", input.getVersion() );
            }});

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5080682400847092307L;
            {
                    put( "analysis_type", input.getAnalysisType() );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5594112787918621394L;
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
                            SavedQueriesListResourceResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<SavedQueriesListResourceResponse>(){});

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

    /**
     * PUT either inserts a new Saved Query if it doesn?t already exist, or updates an existing Saved Query if it does exist.
     * @param    PutSavedQueryRowResourceInput    Object containing request parameters
     * @return    Returns the DynamicResponse response from the API call 
     */
    public DynamicResponse putSavedQueryRowResource(
                final PutSavedQueryRowResourceInput input
    ) throws Throwable {
        APICallBackCatcher<DynamicResponse> callback = new APICallBackCatcher<DynamicResponse>();
        putSavedQueryRowResourceAsync(input, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * PUT either inserts a new Saved Query if it doesn?t already exist, or updates an existing Saved Query if it does exist.
     * @param    PutSavedQueryRowResourceInput    Object containing request parameters
     * @return    Returns the void response from the API call 
     */
    public void putSavedQueryRowResourceAsync(
                final PutSavedQueryRowResourceInput input,
                final APICallBack<DynamicResponse> callBack
    ) throws JsonProcessingException {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/{version}/projects/{project_id}/saved_queries/{saved_query_name}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4931922943172257119L;
            {
                    put( "project_id", input.getProjectId() );
                    put( "saved_query_name", input.getSavedQueryName() );
                    put( "version", input.getVersion() );
            }});

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4683649994054591978L;
            {
                    put( "analysis_type", input.getAnalysisType() );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5327329381474430445L;
            {
                    put( "user-agent", "APIMATIC 2.0" );
                    put( "accept", "application/json" );
                    put( "Authorization", Configuration.authorization );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest _request = getClientInstance().putBody(_queryUrl, _headers, APIHelper.serialize(input.getBody()));

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