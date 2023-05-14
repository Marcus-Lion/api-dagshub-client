# DagsHub API
#
# This API provides a way to retrive & interact with data about DagsHub repositories, users, issues, webhooks and more. The API is also used by the [DagsHub Direct Data Access streaming client](https://github.com/DagsHub/client) to stream content from a repository for easier and faster training. 
#
# OpenAPI spec version: 1.0.2
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git

#' EditExperimentPost Class
#'
#' @field name 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
EditExperimentPost <- R6::R6Class(
  'EditExperimentPost',
  public = list(
    `name` = NULL,
    initialize = function(`name`){
      if (!missing(`name`)) {
        stopifnot(is.character(`name`), length(`name`) == 1)
        self$`name` <- `name`
      }
    },
    toJSON = function() {
      EditExperimentPostObject <- list()
      if (!is.null(self$`name`)) {
        EditExperimentPostObject[['name']] <- self$`name`
      }

      EditExperimentPostObject
    },
    fromJSON = function(EditExperimentPostJson) {
      EditExperimentPostObject <- jsonlite::fromJSON(EditExperimentPostJson)
      if (!is.null(EditExperimentPostObject$`name`)) {
        self$`name` <- EditExperimentPostObject$`name`
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "name": %s
        }',
        self$`name`
      )
    },
    fromJSONString = function(EditExperimentPostJson) {
      EditExperimentPostObject <- jsonlite::fromJSON(EditExperimentPostJson)
      self$`name` <- EditExperimentPostObject$`name`
    }
  )
)