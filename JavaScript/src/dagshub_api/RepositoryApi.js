/*
 * DagsHub API
 * The api docs are made with SwaggerUI using the OpenAPI 3 specification. 
 *
 * OpenAPI spec version: 0.1.0
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
import {CreateRepo} from '../model/CreateRepo';
import {MigrateRepo} from '../model/MigrateRepo';

/**
* Repository service.
* @module dagshub_api/RepositoryApi
* @version 0.1.0
*/
export class RepositoryApi {

    /**
    * Constructs a new RepositoryApi. 
    * @alias module:dagshub_api/RepositoryApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instanc
    e} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }

    /**
     * Callback function to receive the result of the createOrgRepo operation.
     * @callback moduledagshub_api/RepositoryApi~createOrgRepoCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Create in organization
     * Create a new repository in this organization. The authenticated user must be an **owner** of the specified organization.
     * @param {String} orgname A DagsHub organization name
     * @param {Object} opts Optional parameters
     * @param {module:model/CreateRepo} opts.body 
     * @param {module:dagshub_api/RepositoryApi~createOrgRepoCallback} callback The callback function, accepting three arguments: error, data, response
     */
    createOrgRepo(orgname, opts, callback) {
      opts = opts || {};
      let postBody = opts['body'];
      // verify the required parameter 'orgname' is set
      if (orgname === undefined || orgname === null) {
        throw new Error("Missing the required parameter 'orgname' when calling createOrgRepo");
      }

      let pathParams = {
        'orgname': orgname
      };
      let queryParams = {
        
      };
      let headerParams = {
        
      };
      let formParams = {
        
      };

      let authNames = ['basicAuth', 'tokenAuth'];
      let contentTypes = ['application/json'];
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/org/{orgname}/repos', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the createRepo operation.
     * @callback moduledagshub_api/RepositoryApi~createRepoCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Create
     * Create a new repository for the authenticated user.
     * @param {Object} opts Optional parameters
     * @param {module:model/CreateRepo} opts.body 
     * @param {module:dagshub_api/RepositoryApi~createRepoCallback} callback The callback function, accepting three arguments: error, data, response
     */
    createRepo(opts, callback) {
      opts = opts || {};
      let postBody = opts['body'];

      let pathParams = {
        
      };
      let queryParams = {
        
      };
      let headerParams = {
        
      };
      let formParams = {
        
      };

      let authNames = ['basicAuth', 'tokenAuth'];
      let contentTypes = ['application/json'];
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/user/repos', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the listMyRepos operation.
     * @callback moduledagshub_api/RepositoryApi~listMyReposCallback
     * @param {String} error Error message, if any.
     * @param {Object{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * List your repositories
     * List repositories that are accessible to the authenticated user.  This includes repositories owned by the authenticated user, repositories where the authenticated user is a collaborator, and repositories that the authenticated user has access to through an organization membership. 
     * @param {module:dagshub_api/RepositoryApi~listMyReposCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    listMyRepos(callback) {
      
      let postBody = null;

      let pathParams = {
        
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
      let returnType = Object;

      return this.apiClient.callApi(
        '/user/repos', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the listOrgRepos operation.
     * @callback moduledagshub_api/RepositoryApi~listOrgReposCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * List organization repositories
     * List repositories that are accessible to the authenticated user.
     * @param {String} orgname A DagsHub organization name
     * @param {module:dagshub_api/RepositoryApi~listOrgReposCallback} callback The callback function, accepting three arguments: error, data, response
     */
    listOrgRepos(orgname, callback) {
      
      let postBody = null;
      // verify the required parameter 'orgname' is set
      if (orgname === undefined || orgname === null) {
        throw new Error("Missing the required parameter 'orgname' when calling listOrgRepos");
      }

      let pathParams = {
        'orgname': orgname
      };
      let queryParams = {
        
      };
      let headerParams = {
        
      };
      let formParams = {
        
      };

      let authNames = ['basicAuth', 'tokenAuth'];
      let contentTypes = [];
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/orgs/{orgname}/repos', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the listUserRepos operation.
     * @callback moduledagshub_api/RepositoryApi~listUserReposCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * List user repositories
     * List public repositories for the specified user.
     * @param {String} username A DagsHub username
     * @param {module:dagshub_api/RepositoryApi~listUserReposCallback} callback The callback function, accepting three arguments: error, data, response
     */
    listUserRepos(username, callback) {
      
      let postBody = null;
      // verify the required parameter 'username' is set
      if (username === undefined || username === null) {
        throw new Error("Missing the required parameter 'username' when calling listUserRepos");
      }

      let pathParams = {
        'username': username
      };
      let queryParams = {
        
      };
      let headerParams = {
        
      };
      let formParams = {
        
      };

      let authNames = ['basicAuth', 'tokenAuth'];
      let contentTypes = [];
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/users/{username}/repos', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the migrateRepo operation.
     * @callback moduledagshub_api/RepositoryApi~migrateRepoCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Migrate repository
     * Migrate a repository from other Git hosting sources for the authenticated user.  To migrate a repository for a organization, the authenticated user must be a **owner** of the specified organization. 
     * @param {Object} opts Optional parameters
     * @param {module:model/MigrateRepo} opts.body 
     * @param {module:dagshub_api/RepositoryApi~migrateRepoCallback} callback The callback function, accepting three arguments: error, data, response
     */
    migrateRepo(opts, callback) {
      opts = opts || {};
      let postBody = opts['body'];

      let pathParams = {
        
      };
      let queryParams = {
        
      };
      let headerParams = {
        
      };
      let formParams = {
        
      };

      let authNames = ['basicAuth', 'tokenAuth'];
      let contentTypes = ['application/json'];
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/repos/migrate', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the search operation.
     * @callback moduledagshub_api/RepositoryApi~searchCallback
     * @param {String} error Error message, if any.
     * @param {Object{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Search repositories
     * @param {String} q 
     * @param {Object} opts Optional parameters
     * @param {Number} opts.uid User ID to specify search whose repositories. Default is 0 and search all repositories (default to <.>)
     * @param {Number} opts.limit Maximum number of repositories in search results. (default to <.>)
     * @param {Number} opts.page Page number. Default is 1. (default to <.>)
     * @param {module:dagshub_api/RepositoryApi~searchCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    search(q, opts, callback) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'q' is set
      if (q === undefined || q === null) {
        throw new Error("Missing the required parameter 'q' when calling search");
      }

      let pathParams = {
        
      };
      let queryParams = {
        'q': q,'uid': opts['uid'],'limit': opts['limit'],'page': opts['page']
      };
      let headerParams = {
        
      };
      let formParams = {
        
      };

      let authNames = ['basicAuth', 'tokenAuth'];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = Object;

      return this.apiClient.callApi(
        '/repos/search', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

}