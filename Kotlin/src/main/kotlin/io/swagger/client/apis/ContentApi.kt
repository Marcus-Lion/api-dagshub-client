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

import io.swagger.client.models.Files

import dagshub_api.infrastructure.*

class ContentApi(basePath: kotlin.String = "https://dagshub.com/api/v1/") : ApiClient(basePath) {

    /**
     * Download archive
     * This method returns archive by given format.
     * @param username A DagsHub username 
     * @param repo name of the repository 
     * @param ref The name of the commit/branch/tag 
     * @param format The format of archive, either .zip or .tar.gz 
     * @return void
     */
    fun getArchive(username: kotlin.String, repo: kotlin.String, ref: kotlin.String, format: kotlin.String): Unit {
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/repos/{username}/{repo}/archive/{ref}/{format}".replace("{" + "username" + "}", "$username").replace("{" + "repo" + "}", "$repo").replace("{" + "ref" + "}", "$ref").replace("{" + "format" + "}", "$format"), query = localVariableQuery
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
     * List data in a repository folder
     * List files, commit sha1, and versioning type for a folder in repository.  To get sizes add to the query param &#x60;include_size&#x3D;true&#x60;. May result slower response. 
     * @param owner owner of the repository 
     * @param repo name of the repository 
     * @param branch branch of the repository 
     * @param path path of a folder in the repository 
     * @param includeSize  (optional, default to false)
     * @return Files
     */
    @Suppress("UNCHECKED_CAST")
    fun getContent(owner: kotlin.String, repo: kotlin.String, branch: kotlin.String, path: kotlin.String, includeSize: kotlin.Boolean? = null): Files {
        val localVariableQuery: MultiValueMap = mapOf("include_size" to listOf("$includeSize"))
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/repos/{owner}/{repo}/content/{branch}/{path}".replace("{" + "owner" + "}", "$owner").replace("{" + "repo" + "}", "$repo").replace("{" + "branch" + "}", "$branch").replace("{" + "path" + "}", "$path"), query = localVariableQuery
        )
        val response = request<Files>(
                localVariableConfig
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as Files
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * Download raw content
     * This method returns the raw content of a file.
     * @param username A DagsHub username 
     * @param repo name of the repository 
     * @param ref The name of the commit/branch/tag 
     * @param path The content path 
     * @return void
     */
    fun getRaw(username: kotlin.String, repo: kotlin.String, ref: kotlin.String, path: kotlin.String): Unit {
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/repos/{username}/{repo}/raw/{ref}/{path}".replace("{" + "username" + "}", "$username").replace("{" + "repo" + "}", "$repo").replace("{" + "ref" + "}", "$ref").replace("{" + "path" + "}", "$path"), query = localVariableQuery
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
     * Upload data to a repository
     * 
     * @param owner owner of the repository 
     * @param repo name of the repository 
     * @param branch branch of the repository 
     * @param path path of a folder in the repository 
     * @param commitSummary  (optional)
     * @param commitMessage  (optional)
     * @param commitChoice  (optional)
     * @param lastCommit  (optional)
     * @param newBranchName  (optional)
     * @param versioning  (optional)
     * @param files  (optional)
     * @return void
     */
    fun uploadContent(owner: kotlin.String, repo: kotlin.String, branch: kotlin.String, path: kotlin.String, commitSummary: kotlin.String? = null, commitMessage: kotlin.String? = null, commitChoice: kotlin.String? = null, lastCommit: kotlin.String? = null, newBranchName: kotlin.String? = null, versioning: kotlin.String? = null, files: kotlin.String? = null): Unit {
        val localVariableBody: kotlin.Any? = mapOf("commit_summary" to "$commitSummary", "commit_message" to "$commitMessage", "commit_choice" to "$commitChoice", "last_commit" to "$lastCommit", "new_branch_name" to "$newBranchName", "versioning" to "$versioning", "files" to "$files")
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String, kotlin.String> = mapOf("Content-Type" to "multipart/form-data")
        val localVariableConfig = RequestConfig(
                RequestMethod.PUT,
                "/repos/{owner}/{repo}/content/{branch}/{path}".replace("{" + "owner" + "}", "$owner").replace("{" + "repo" + "}", "$repo").replace("{" + "branch" + "}", "$branch").replace("{" + "path" + "}", "$path"), query = localVariableQuery, headers = localVariableHeaders
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
}