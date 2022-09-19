/**
 * DagsHub API
 * The api docs are made with SwaggerUI using the OpenAPI 3 specification. 
 *
 * OpenAPI spec version: 1.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */
package io.swagger.client.apis

import io.swagger.client.models.HooksIdBody
import io.swagger.client.models.RepoHooksBody

import dagshub_api.infrastructure.*

class WebhooksApi(basePath: kotlin.String = "http://dagshub.com/api/v1/") : ApiClient(basePath) {

    /**
     * Create a hook
     * 
     * @param owner owner of the repository 
     * @param repo name of the repository 
     * @param body  (optional)
     * @return void
     */
    fun createHook(owner: kotlin.String, repo: kotlin.String, body: RepoHooksBody? = null): Unit {
        val localVariableBody: kotlin.Any? = body
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableConfig = RequestConfig(
                RequestMethod.POST,
                "/repos/{owner}/{repo}/hooks".replace("{" + "owner" + "}", "$owner").replace("{" + "repo" + "}", "$repo"), query = localVariableQuery
        )
        val response = request<Any?>(
                localVariableConfig, localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> Unit
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * Delete a hook
     * 
     * @param owner owner of the repository 
     * @param repo name of the repository 
     * @param id  
     * @return void
     */
    fun deleteHook(owner: kotlin.String, repo: kotlin.String, id: kotlin.Int): Unit {
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableConfig = RequestConfig(
                RequestMethod.DELETE,
                "/repos/{owner}/{repo}/hooks/{id}".replace("{" + "owner" + "}", "$owner").replace("{" + "repo" + "}", "$repo").replace("{" + "id" + "}", "$id"), query = localVariableQuery
        )
        val response = request<Any?>(
                localVariableConfig
        )

        return when (response.responseType) {
            ResponseType.Success -> Unit
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * Edit a hook
     * 
     * @param owner owner of the repository 
     * @param repo name of the repository 
     * @param id  
     * @param body  (optional)
     * @return void
     */
    fun editHook(owner: kotlin.String, repo: kotlin.String, id: kotlin.Int, body: HooksIdBody? = null): Unit {
        val localVariableBody: kotlin.Any? = body
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableConfig = RequestConfig(
                RequestMethod.PATCH,
                "/repos/{owner}/{repo}/hooks/{id}".replace("{" + "owner" + "}", "$owner").replace("{" + "repo" + "}", "$repo").replace("{" + "id" + "}", "$id"), query = localVariableQuery
        )
        val response = request<Any?>(
                localVariableConfig, localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> Unit
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * List hooks
     * 
     * @param owner owner of the repository 
     * @param repo name of the repository 
     * @return void
     */
    fun listHooks(owner: kotlin.String, repo: kotlin.String): Unit {
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/repos/{owner}/{repo}/hooks".replace("{" + "owner" + "}", "$owner").replace("{" + "repo" + "}", "$repo"), query = localVariableQuery
        )
        val response = request<Any?>(
                localVariableConfig
        )

        return when (response.responseType) {
            ResponseType.Success -> Unit
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
}
