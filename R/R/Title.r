# DagsHub API
#
# This API provides a way to retrive & interact with data about DagsHub repositories, users, issues, webhooks and more. The API is also used by the [DagsHub Direct Data Access streaming client](https://github.com/DagsHub/client) to stream content from a repository for easier and faster training. 
#
# OpenAPI spec version: 1.0.2
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git

#' Title Class
#'
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
Title <- R6::R6Class(
  'Title',
  public = list(
    initialize = function(){
    },
    toJSON = function() {
      TitleObject <- list()

      TitleObject
    },
    fromJSON = function(TitleJson) {
      TitleObject <- jsonlite::fromJSON(TitleJson)
    },
    toJSONString = function() {
       sprintf(
        '{
        }',
      )
    },
    fromJSONString = function(TitleJson) {
      TitleObject <- jsonlite::fromJSON(TitleJson)
    }
  )
)