/**
 * DagsHub API
 * This API provides a way to retrive & interact with data about DagsHub repositories, users, issues, webhooks and more. The API is also used by the [DagsHub Direct Data Access streaming client](https://github.com/DagsHub/client) to stream content from a repository for easier and faster training. 
 *
 * OpenAPI spec version: 1.0.2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */
package io.swagger.client.apis

import io.swagger.client.models.CollaboratorsCollaboratorBody

import dagshub_api.infrastructure.*

class CollaboratorsApi(basePath: kotlin.String = "https://dagshub.com/api/v1/") : ApiClient(basePath) {

    /**
     * Add user as a collaborator
     * 
     * @param username A DagsHub username 
     * @param repo name of the repository 
     * @param collaborator collaborator username 
     * @param body  (optional)
     * @return void
     */
    fun addCollaborator(username: kotlin.String, repo: kotlin.String, collaborator: kotlin.String, body: CollaboratorsCollaboratorBody? = null): Unit {
        val localVariableBody: kotlin.Any? = body
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableConfig = RequestConfig(
                RequestMethod.PUT,
                "/repos/{username}/{repo}/collaborators/{collaborator}".replace("{" + "username" + "}", "$username").replace("{" + "repo" + "}", "$repo").replace("{" + "collaborator" + "}", "$collaborator"), query = localVariableQuery
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
     * Get collaborators
     * 
     * @param username A DagsHub username 
     * @param repo name of the repository 
     * @return void
     */
    fun getCollaborators(username: kotlin.String, repo: kotlin.String): Unit {
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/repos/{username}/{repo}/collaborators".replace("{" + "username" + "}", "$username").replace("{" + "repo" + "}", "$repo"), query = localVariableQuery
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
     * Delete collaborator
     * 
     * @return void
     */
    fun removeCollaborator(): Unit {
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableConfig = RequestConfig(
                RequestMethod.DELETE,
                "/repos/{username}/{repo}/collaborators/{collaborator}", query = localVariableQuery
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
