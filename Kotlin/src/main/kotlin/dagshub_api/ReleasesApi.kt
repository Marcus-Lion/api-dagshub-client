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


import dagshub-api.infrastructure.*

class ReleasesApi(basePath: kotlin.String = "http://dagshub.com/api/v1/") : ApiClient(basePath) {

    /**
     * List Releases
     * 
     * @param owner owner of the repository 
     * @param repo name of the repository 
     * @return void
     */
    fun listReleases(owner: kotlin.String, repo: kotlin.String): Unit {
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/repos/{owner}/{repo}/releases".replace("{" + "owner" + "}", "$owner").replace("{" + "repo" + "}", "$repo"), query = localVariableQuery
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
