/*
 * Celeborn Master REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: user@celeborn.apache.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.apache.celeborn.client.api;

import org.apache.celeborn.client.ApiCallback;
import org.apache.celeborn.client.ApiClient;
import org.apache.celeborn.client.ApiException;
import org.apache.celeborn.client.ApiResponse;
import org.apache.celeborn.client.Configuration;
import org.apache.celeborn.client.Pair;
import org.apache.celeborn.client.ProgressRequestBody;
import org.apache.celeborn.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.apache.celeborn.client.model.AppDiskUsageSnapshotResponse;
import org.apache.celeborn.client.model.ApplicationHostnameResponse;
import org.apache.celeborn.client.model.ApplicationsInfoResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ApplicationApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ApplicationApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ApplicationApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for getApplicationHostNames
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The request was successful. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getApplicationHostNamesCall(final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v1/applications/hostnames";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getApplicationHostNamesValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return getApplicationHostNamesCall(_callback);

    }

    /**
     * 
     * List the hostnames of the applications.
     * @return ApplicationHostnameResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The request was successful. </td><td>  -  </td></tr>
     </table>
     */
    public ApplicationHostnameResponse getApplicationHostNames() throws ApiException {
        ApiResponse<ApplicationHostnameResponse> localVarResp = getApplicationHostNamesWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * 
     * List the hostnames of the applications.
     * @return ApiResponse&lt;ApplicationHostnameResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The request was successful. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ApplicationHostnameResponse> getApplicationHostNamesWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getApplicationHostNamesValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<ApplicationHostnameResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * List the hostnames of the applications.
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The request was successful. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getApplicationHostNamesAsync(final ApiCallback<ApplicationHostnameResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getApplicationHostNamesValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<ApplicationHostnameResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getApplications
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The request was successful. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getApplicationsCall(final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v1/applications";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getApplicationsValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return getApplicationsCall(_callback);

    }

    /**
     * 
     * List the application information.
     * @return ApplicationsInfoResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The request was successful. </td><td>  -  </td></tr>
     </table>
     */
    public ApplicationsInfoResponse getApplications() throws ApiException {
        ApiResponse<ApplicationsInfoResponse> localVarResp = getApplicationsWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * 
     * List the application information.
     * @return ApiResponse&lt;ApplicationsInfoResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The request was successful. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ApplicationsInfoResponse> getApplicationsWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getApplicationsValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<ApplicationsInfoResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * List the application information.
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The request was successful. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getApplicationsAsync(final ApiCallback<ApplicationsInfoResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getApplicationsValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<ApplicationsInfoResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getApplicationsDiskUsage
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The request was successful. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getApplicationsDiskUsageCall(final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v1/applications/top_disk_usages";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getApplicationsDiskUsageValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return getApplicationsDiskUsageCall(_callback);

    }

    /**
     * 
     * List the application disk usage.
     * @return AppDiskUsageSnapshotResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The request was successful. </td><td>  -  </td></tr>
     </table>
     */
    public AppDiskUsageSnapshotResponse getApplicationsDiskUsage() throws ApiException {
        ApiResponse<AppDiskUsageSnapshotResponse> localVarResp = getApplicationsDiskUsageWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * 
     * List the application disk usage.
     * @return ApiResponse&lt;AppDiskUsageSnapshotResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The request was successful. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AppDiskUsageSnapshotResponse> getApplicationsDiskUsageWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getApplicationsDiskUsageValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<AppDiskUsageSnapshotResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * List the application disk usage.
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The request was successful. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getApplicationsDiskUsageAsync(final ApiCallback<AppDiskUsageSnapshotResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getApplicationsDiskUsageValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<AppDiskUsageSnapshotResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}