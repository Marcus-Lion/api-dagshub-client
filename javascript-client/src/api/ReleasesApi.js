/*
 * DagsHub API
 * This API is used to interact with DagsHub. 
 *
 * OpenAPI spec version: 1.0.0
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 3.0.35
 *
 * Do not edit the class manually.
 *
 */
import {ApiClient} from "../ApiClient";

/**
* Releases service.
* @module api/ReleasesApi
* @version 1.0.0
*/
export class ReleasesApi {

    /**
    * Constructs a new ReleasesApi. 
    * @alias module:api/ReleasesApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instanc
    e} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }

    /**
     * Callback function to receive the result of the listReleases operation.
     * @callback moduleapi/ReleasesApi~listReleasesCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * List Releases
     * @param {String} owner owner of the repository
     * @param {String} repo name of the repository
     * @param {module:api/ReleasesApi~listReleasesCallback} callback The callback function, accepting three arguments: error, data, response
     */
    listReleases(owner, repo, callback) {
      
      let postBody = null;
      // verify the required parameter 'owner' is set
      if (owner === undefined || owner === null) {
        throw new Error("Missing the required parameter 'owner' when calling listReleases");
      }
      // verify the required parameter 'repo' is set
      if (repo === undefined || repo === null) {
        throw new Error("Missing the required parameter 'repo' when calling listReleases");
      }

      let pathParams = {
        'owner': owner,'repo': repo
      };
      let queryParams = {
        
      };
      let headerParams = {
        
      };
      let formParams = {
        
      };

      let authNames = ['basicAuth', 'tokenAuth'];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = null;

      return this.apiClient.callApi(
        '/repos/{owner}/{repo}/releases', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

}