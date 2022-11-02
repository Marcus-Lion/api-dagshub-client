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
 * @param config 
 * @param events 
 * @param active Weather the hook is actually triggered on pushes or not. Ignore this field to leave it unchanged.
 */
case class HooksIdBody (
  config: Option[WebhookConfig] = None,
  events: Option[WebhookEvents] = None,
  active: Option[Boolean] = None
)
