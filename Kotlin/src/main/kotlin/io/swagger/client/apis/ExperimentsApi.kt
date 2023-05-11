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

import io.swagger.client.models.EditExperimentPost
import io.swagger.client.models.ExperimentKeys

import dagshub_api.infrastructure.*

class ExperimentsApi(basePath: kotlin.String = "https://dagshub.com/api/v1") : ApiClient(basePath) {

    /**
     * Add label to experiment
     * 
     * @param owner owner of the repository 
     * @param repo name of the repository 
     * @param experimentKey a valid experiment key 
     * @param experimentLabel A label for the experiment, max 128 characters. 
     * @return void
     */
    fun addExperimentLabel(owner: kotlin.String, repo: kotlin.String, experimentKey: kotlin.String, experimentLabel: kotlin.String): Unit {
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableConfig = RequestConfig(
                RequestMethod.POST,
                "/repos/{owner}/{repo}/experiments/experiment/{experimentKey}/labels/{experimentLabel}".replace("{" + "owner" + "}", "$owner").replace("{" + "repo" + "}", "$repo").replace("{" + "experimentKey" + "}", "$experimentKey").replace("{" + "experimentLabel" + "}", "$experimentLabel"), query = localVariableQuery
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
     * Delete experiment
     * Support both git and MLflow experiments
     * @param owner owner of the repository 
     * @param repo name of the repository 
     * @param experimentKey a valid experiment key 
     * @return void
     */
    fun deleteExperiment(owner: kotlin.String, repo: kotlin.String, experimentKey: kotlin.String): Unit {
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableConfig = RequestConfig(
                RequestMethod.DELETE,
                "/repos/{owner}/{repo}/experiments/experiment/{experimentKey}".replace("{" + "owner" + "}", "$owner").replace("{" + "repo" + "}", "$repo").replace("{" + "experimentKey" + "}", "$experimentKey"), query = localVariableQuery
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
     * Delete experiment label
     * 
     * @param owner owner of the repository 
     * @param repo name of the repository 
     * @param experimentKey a valid experiment key 
     * @param experimentLabel A label for the experiment, max 128 characters. 
     * @return void
     */
    fun deleteExperimentLabel(owner: kotlin.String, repo: kotlin.String, experimentKey: kotlin.String, experimentLabel: kotlin.String): Unit {
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableConfig = RequestConfig(
                RequestMethod.DELETE,
                "/repos/{owner}/{repo}/experiments/experiment/{experimentKey}/labels/{experimentLabel}".replace("{" + "owner" + "}", "$owner").replace("{" + "repo" + "}", "$repo").replace("{" + "experimentKey" + "}", "$experimentKey").replace("{" + "experimentLabel" + "}", "$experimentLabel"), query = localVariableQuery
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
     * Edit experiment info
     * Edit experiment info, currently supports just changing experiment name.
     * @param owner owner of the repository 
     * @param repo name of the repository 
     * @param experimentKey a valid experiment key 
     * @param body  (optional)
     * @return void
     */
    fun editExperiment(owner: kotlin.String, repo: kotlin.String, experimentKey: kotlin.String, body: EditExperimentPost? = null): Unit {
        val localVariableBody: kotlin.Any? = body
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableConfig = RequestConfig(
                RequestMethod.POST,
                "/repos/{owner}/{repo}/experiments/experiment/{experimentKey}".replace("{" + "owner" + "}", "$owner").replace("{" + "repo" + "}", "$repo").replace("{" + "experimentKey" + "}", "$experimentKey"), query = localVariableQuery
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
     * Get experiment metrics for experiment
     * 
     * @param owner owner of the repository 
     * @param repo name of the repository 
     * @param body  (optional)
     * @return void
     */
    fun getExperimentMetrics(owner: kotlin.String, repo: kotlin.String, body: ExperimentKeys? = null): Unit {
        val localVariableBody: kotlin.Any? = body
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableConfig = RequestConfig(
                RequestMethod.POST,
                "/repos/{owner}/{repo}/experiments/metricsForExperiments".replace("{" + "owner" + "}", "$owner").replace("{" + "repo" + "}", "$repo"), query = localVariableQuery
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
     * List Experiments
     * Get a list of experiments in the given repository
     * @param owner owner of the repository 
     * @param repo name of the repository 
     * @return void
     */
    fun getExperiments(owner: kotlin.String, repo: kotlin.String): Unit {
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/repos/{owner}/{repo}/experiments".replace("{" + "owner" + "}", "$owner").replace("{" + "repo" + "}", "$repo"), query = localVariableQuery
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
