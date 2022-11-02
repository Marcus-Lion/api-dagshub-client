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
package io.swagger.client.model


/**
 * @param title 
 * @param body 
 * @param assignee 
 * @param milestone 
 * @param labels 
 * @param closed 
 */
case class PostIssue (
  title: Option[./components/schemas/Title.yaml] = None,
  body: Option[./components/schemas/Body.yaml] = None,
  assignee: Option[./components/schemas/Assignee.yaml] = None,
  milestone: Option[./components/schemas/Milestone.yaml] = None,
  labels: Option[./components/schemas/Labels.yaml] = None,
  closed: Option[./components/schemas/Closed.yaml] = None
)

