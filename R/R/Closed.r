# DagsHub API
#
# The api docs are made with SwaggerUI using the OpenAPI 3 specification. 
#
# OpenAPI spec version: 1.0.1
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git

#' Closed Class
#'
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
Closed <- R6::R6Class(
  'Closed',
  public = list(
    initialize = function(){
    },
    toJSON = function() {
      ClosedObject <- list()

      ClosedObject
    },
    fromJSON = function(ClosedJson) {
      ClosedObject <- jsonlite::fromJSON(ClosedJson)
    },
    toJSONString = function() {
       sprintf(
        '{
        }',
      )
    },
    fromJSONString = function(ClosedJson) {
      ClosedObject <- jsonlite::fromJSON(ClosedJson)
    }
  )
)
