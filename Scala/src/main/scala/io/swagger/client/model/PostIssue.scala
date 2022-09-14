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
  title: Option[Title] = None,
  body: Option[Body] = None,
  assignee: Option[Assignee] = None,
  milestone: Option[Milestone] = None,
  labels: Option[Labels] = None,
  closed: Option[Closed] = None
)

