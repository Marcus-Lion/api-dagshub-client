# DagsHub API
#
# The api docs are made with SwaggerUI using the OpenAPI 3 specification. 
#
# OpenAPI spec version: 1.0.1
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git

#' Milestone Class
#'
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
Milestone <- R6::R6Class(
  'Milestone',
  public = list(
    initialize = function(){
    },
    toJSON = function() {
      MilestoneObject <- list()

      MilestoneObject
    },
    fromJSON = function(MilestoneJson) {
      MilestoneObject <- jsonlite::fromJSON(MilestoneJson)
    },
    toJSONString = function() {
       sprintf(
        '{
        }',
      )
    },
    fromJSONString = function(MilestoneJson) {
      MilestoneObject <- jsonlite::fromJSON(MilestoneJson)
    }
  )
)
