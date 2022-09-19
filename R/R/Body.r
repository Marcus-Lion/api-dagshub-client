# DagsHub API
#
# The api docs are made with SwaggerUI using the OpenAPI 3 specification. 
#
# OpenAPI spec version: 1.0.1
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git

#' Body Class
#'
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
Body <- R6::R6Class(
  'Body',
  public = list(
    initialize = function(){
    },
    toJSON = function() {
      BodyObject <- list()

      BodyObject
    },
    fromJSON = function(BodyJson) {
      BodyObject <- jsonlite::fromJSON(BodyJson)
    },
    toJSONString = function() {
       sprintf(
        '{
        }',
      )
    },
    fromJSONString = function(BodyJson) {
      BodyObject <- jsonlite::fromJSON(BodyJson)
    }
  )
)
