/**
 * DagsHub API
 * The api docs are made with SwaggerUI using the OpenAPI 3 specification. 
 *
 * OpenAPI spec version: 0.1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */
package io.swagger.client.model


/**
 * @param id 
 * @param login 
 * @param fullName 
 * @param avatarUrl 
 * @param username 
 */
case class User (
  id: Option[Integer] = None,
  login: Option[String] = None,
  fullName: Option[String] = None,
  avatarUrl: Option[String] = None,
  username: Option[String] = None
)

