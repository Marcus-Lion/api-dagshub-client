/**
 * DagsHub API
 * The api docs are made with SwaggerUI using the OpenAPI 3 specification. 
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */
package dagshub_api

import io.swagger.client.models.CreateRepo
import io.swagger.client.models.MigrateRepo

import dagshub-api.infrastructure.*

class RepositoryApi(basePath: kotlin.String = "http://dagshub.com/api/v1/") : ApiClient(basePath) {

    /**
     * Create in organization
     * Create a new repository in this organization. The authenticated user must be an **owner** of the specified organization.
     * @param orgname A DagsHub organization name 
     * @param body  (optional)
     * @return void
     */
    fun createOrgRepo(orgname: kotlin.String, body: CreateRepo? = null): Unit {
        val localVariableBody: kotlin.Any? = body
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableConfig = RequestConfig(
                RequestMethod.POST,
                "/org/{orgname}/repos".replace("{" + "orgname" + "}", "$orgname"), query = localVariableQuery
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
     * Create
     * Create a new repository for the authenticated user.
     * @param body  (optional)
     * @return void
     */
    fun createRepo(body: CreateRepo? = null): Unit {
        val localVariableBody: kotlin.Any? = body
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableConfig = RequestConfig(
                RequestMethod.POST,
                "/user/repos", query = localVariableQuery
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
     * List your repositories
     * List repositories that are accessible to the authenticated user.  This includes repositories owned by the authenticated user, repositories where the authenticated user is a collaborator, and repositories that the authenticated user has access to through an organization membership. 
     * @return kotlin.Any
     */
    @Suppress("UNCHECKED_CAST")
    fun listMyRepos(): kotlin.Any {
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/user/repos", query = localVariableQuery
        )
        val response = request<kotlin.Any>(
                localVariableConfig
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.Any
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * List organization repositories
     * List repositories that are accessible to the authenticated user.
     * @param orgname A DagsHub organization name 
     * @return void
     */
    fun listOrgRepos(orgname: kotlin.String): Unit {
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/orgs/{orgname}/repos".replace("{" + "orgname" + "}", "$orgname"), query = localVariableQuery
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
     * List user repositories
     * List public repositories for the specified user.
     * @param username A DagsHub username 
     * @return void
     */
    fun listUserRepos(username: kotlin.String): Unit {
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/users/{username}/repos".replace("{" + "username" + "}", "$username"), query = localVariableQuery
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
     * Migrate repository
     * Migrate a repository from other Git hosting sources for the authenticated user.  To migrate a repository for a organization, the authenticated user must be a **owner** of the specified organization. 
     * @param body  (optional)
     * @return void
     */
    fun migrateRepo(body: MigrateRepo? = null): Unit {
        val localVariableBody: kotlin.Any? = body
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableConfig = RequestConfig(
                RequestMethod.POST,
                "/repos/migrate", query = localVariableQuery
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
     * Search repositories
     * 
     * @param q  
     * @param uid User ID to specify search whose repositories. Default is 0 and search all repositories (optional, default to 0)
     * @param limit Maximum number of repositories in search results. (optional, default to 10)
     * @param page Page number. Default is 1. (optional, default to 1)
     * @return kotlin.Any
     */
    @Suppress("UNCHECKED_CAST")
    fun search(q: kotlin.String, uid: kotlin.Int? = null, limit: kotlin.Int? = null, page: kotlin.Int? = null): kotlin.Any {
        val localVariableQuery: MultiValueMap = mapOf("q" to listOf("$q"), "uid" to listOf("$uid"), "limit" to listOf("$limit"), "page" to listOf("$page"))
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/repos/search", query = localVariableQuery
        )
        val response = request<kotlin.Any>(
                localVariableConfig
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.Any
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
}
