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
 * @param id 
 * @param number 
 * @param user 
 * @param title 
 * @param body 
 * @param labels 
 * @param milestone 
 * @param assignee 
 * @param state 
 * @param comments 
 * @param createdAt 
 * @param updatedAt 
 * @param pullRequest 
 * @param closed 
 */
case class Issue (
  id: Option[Integer] = None,
  number: Option[Integer] = None,
  user: Option[User] = None,
  title: Title,
  body: Body,
  labels: List[Issue_labels],
  milestone: Issue_milestone,
  assignee: Issue_assignee,
  state: Option[String] = None,
  comments: Option[Integer] = None,
  createdAt: Option[String] = None,
  updatedAt: Option[String] = None,
  pullRequest: Option[Any] = None,
  closed: Boolean
)

