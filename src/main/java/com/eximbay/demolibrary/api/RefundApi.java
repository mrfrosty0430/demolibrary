/*
 * Cloud Payment API
 * Eximbay Cloud Payment API
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.eximbay.demolibrary.api;

import com.eximbay.demolibrary.ApiCallback;
import com.eximbay.demolibrary.ApiClient;
import com.eximbay.demolibrary.ApiException;
import com.eximbay.demolibrary.ApiResponse;
import com.eximbay.demolibrary.Configuration;
import com.eximbay.demolibrary.Pair;
import com.eximbay.demolibrary.ProgressRequestBody;
import com.eximbay.demolibrary.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.eximbay.demolibrary.model.RefundAllResponse;
import com.eximbay.demolibrary.model.RefundRequest;
import com.eximbay.demolibrary.model.RefundResponse;
import com.eximbay.demolibrary.model.RefundUpdateRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RefundApi {
    private ApiClient apiClient;

    public RefundApi() {
        this(Configuration.getDefaultApiClient());
    }

    public RefundApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for createRefund
     * @param body Payment Intent must be supplied (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createRefundCall(RefundRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/refund";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createRefundValidateBeforeCall(RefundRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling createRefund(Async)");
        }
        
        com.squareup.okhttp.Call call = createRefundCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Refund a charge
     * Create a refund to refund a charge by supplying a PaymentIntent object
     * @param body Payment Intent must be supplied (required)
     * @return RefundResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public RefundResponse createRefund(RefundRequest body) throws ApiException {
        ApiResponse<RefundResponse> resp = createRefundWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Refund a charge
     * Create a refund to refund a charge by supplying a PaymentIntent object
     * @param body Payment Intent must be supplied (required)
     * @return ApiResponse&lt;RefundResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<RefundResponse> createRefundWithHttpInfo(RefundRequest body) throws ApiException {
        com.squareup.okhttp.Call call = createRefundValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<RefundResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Refund a charge (asynchronously)
     * Create a refund to refund a charge by supplying a PaymentIntent object
     * @param body Payment Intent must be supplied (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createRefundAsync(RefundRequest body, final ApiCallback<RefundResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = createRefundValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RefundResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getAllRefunds
     * @param paymentIntent paymentIntent ID related to purchase (optional)
     * @param limit limit number of responses (optional)
     * @param before get all refunds before supplied refund ID (optional)
     * @param after get all refunds after supplied refund ID (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getAllRefundsCall(String paymentIntent, String limit, String before, String after, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/refund";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (paymentIntent != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("paymentIntent", paymentIntent));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
        if (before != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("before", before));
        if (after != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("after", after));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getAllRefundsValidateBeforeCall(String paymentIntent, String limit, String before, String after, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = getAllRefundsCall(paymentIntent, limit, before, after, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * View all refunds
     * View all your refunds
     * @param paymentIntent paymentIntent ID related to purchase (optional)
     * @param limit limit number of responses (optional)
     * @param before get all refunds before supplied refund ID (optional)
     * @param after get all refunds after supplied refund ID (optional)
     * @return RefundAllResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public RefundAllResponse getAllRefunds(String paymentIntent, String limit, String before, String after) throws ApiException {
        ApiResponse<RefundAllResponse> resp = getAllRefundsWithHttpInfo(paymentIntent, limit, before, after);
        return resp.getData();
    }

    /**
     * View all refunds
     * View all your refunds
     * @param paymentIntent paymentIntent ID related to purchase (optional)
     * @param limit limit number of responses (optional)
     * @param before get all refunds before supplied refund ID (optional)
     * @param after get all refunds after supplied refund ID (optional)
     * @return ApiResponse&lt;RefundAllResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<RefundAllResponse> getAllRefundsWithHttpInfo(String paymentIntent, String limit, String before, String after) throws ApiException {
        com.squareup.okhttp.Call call = getAllRefundsValidateBeforeCall(paymentIntent, limit, before, after, null, null);
        Type localVarReturnType = new TypeToken<RefundAllResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * View all refunds (asynchronously)
     * View all your refunds
     * @param paymentIntent paymentIntent ID related to purchase (optional)
     * @param limit limit number of responses (optional)
     * @param before get all refunds before supplied refund ID (optional)
     * @param after get all refunds after supplied refund ID (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAllRefundsAsync(String paymentIntent, String limit, String before, String after, final ApiCallback<RefundAllResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getAllRefundsValidateBeforeCall(paymentIntent, limit, before, after, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RefundAllResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getRefund
     * @param id the refund ID given when creating a new refund request (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getRefundCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/refund{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getRefundValidateBeforeCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getRefund(Async)");
        }
        
        com.squareup.okhttp.Call call = getRefundCall(id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Retrieve a refund object
     * Retrieve a refund object. You must have an existing refund object to retrieve it.
     * @param id the refund ID given when creating a new refund request (required)
     * @return RefundResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public RefundResponse getRefund(String id) throws ApiException {
        ApiResponse<RefundResponse> resp = getRefundWithHttpInfo(id);
        return resp.getData();
    }

    /**
     * Retrieve a refund object
     * Retrieve a refund object. You must have an existing refund object to retrieve it.
     * @param id the refund ID given when creating a new refund request (required)
     * @return ApiResponse&lt;RefundResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<RefundResponse> getRefundWithHttpInfo(String id) throws ApiException {
        com.squareup.okhttp.Call call = getRefundValidateBeforeCall(id, null, null);
        Type localVarReturnType = new TypeToken<RefundResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieve a refund object (asynchronously)
     * Retrieve a refund object. You must have an existing refund object to retrieve it.
     * @param id the refund ID given when creating a new refund request (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getRefundAsync(String id, final ApiCallback<RefundResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getRefundValidateBeforeCall(id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RefundResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateRefund
     * @param id the refund ID given when creating a new refund request (required)
     * @param body Only meta data can be supplied (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateRefundCall(String id, RefundUpdateRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/refund{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateRefundValidateBeforeCall(String id, RefundUpdateRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling updateRefund(Async)");
        }
        
        com.squareup.okhttp.Call call = updateRefundCall(id, body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Update a refund object
     * Update a refund object. You must have an existing refund object to update it.
     * @param id the refund ID given when creating a new refund request (required)
     * @param body Only meta data can be supplied (optional)
     * @return RefundResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public RefundResponse updateRefund(String id, RefundUpdateRequest body) throws ApiException {
        ApiResponse<RefundResponse> resp = updateRefundWithHttpInfo(id, body);
        return resp.getData();
    }

    /**
     * Update a refund object
     * Update a refund object. You must have an existing refund object to update it.
     * @param id the refund ID given when creating a new refund request (required)
     * @param body Only meta data can be supplied (optional)
     * @return ApiResponse&lt;RefundResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<RefundResponse> updateRefundWithHttpInfo(String id, RefundUpdateRequest body) throws ApiException {
        com.squareup.okhttp.Call call = updateRefundValidateBeforeCall(id, body, null, null);
        Type localVarReturnType = new TypeToken<RefundResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update a refund object (asynchronously)
     * Update a refund object. You must have an existing refund object to update it.
     * @param id the refund ID given when creating a new refund request (required)
     * @param body Only meta data can be supplied (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateRefundAsync(String id, RefundUpdateRequest body, final ApiCallback<RefundResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = updateRefundValidateBeforeCall(id, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RefundResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
