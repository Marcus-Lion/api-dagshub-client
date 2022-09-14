/*
 * DagsHub API
 *
 * The api docs are made with SwaggerUI using the OpenAPI 3 specification. 
 *
 * API version: 1.0.0
 * Generated by: Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
 */
package dagshub-api

type User struct {
	Id int32 `json:"id,omitempty"`
	Login string `json:"login,omitempty"`
	FullName string `json:"full_name,omitempty"`
	AvatarUrl string `json:"avatar_url,omitempty"`
	Username string `json:"username,omitempty"`
}
