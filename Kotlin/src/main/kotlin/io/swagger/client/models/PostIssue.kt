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
package io.swagger.client.models

import io.swagger.client.models.Assignee
import io.swagger.client.models.Body
import io.swagger.client.models.Closed
import io.swagger.client.models.Labels
import io.swagger.client.models.Milestone
import io.swagger.client.models.Title

/**
 * 
 * @param title 
 * @param body 
 * @param assignee 
 * @param milestone 
 * @param labels 
 * @param closed 
 */
data class PostIssue (

    val title: Title? = null,
    val body: Body? = null,
    val assignee: Assignee? = null,
    val milestone: Milestone? = null,
    val labels: Labels? = null,
    val closed: Closed? = null
) {
}