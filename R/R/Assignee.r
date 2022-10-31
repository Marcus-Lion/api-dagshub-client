# DagsHub API
#
# This API provides a way to retrive & interact with data about DagsHub repositories, users, issues, webhooks and more. The API is also used by the [DagsHub Direct Data Access streaming client](https://github.com/DagsHub/client) to stream content from a repository for easier and faster training. 
#
# OpenAPI spec version: 1.0.2
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git

#' Assignee Class
#'
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
Assignee <- R6::R6Class(
  'Assignee',
  public = list(
    initialize = function(){
    },
    toJSON = function() {
      AssigneeObject <- list()

      AssigneeObject
    },
    fromJSON = function(AssigneeJson) {
      AssigneeObject <- jsonlite::fromJSON(AssigneeJson)
    },
    toJSONString = function() {
       sprintf(
        '{
        }',
      )
    },
    fromJSONString = function(AssigneeJson) {
      AssigneeObject <- jsonlite::fromJSON(AssigneeJson)
    }
  )
)
