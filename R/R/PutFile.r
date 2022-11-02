# DagsHub API
#
# This API provides a way to retrive & interact with data about DagsHub repositories, users, issues, webhooks and more. The API is also used by the [DagsHub Direct Data Access streaming client](https://github.com/DagsHub/client) to stream content from a repository for easier and faster training. 
#
# OpenAPI spec version: 1.0.2
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git

#' PutFile Class
#'
#' @field commit_summary 
#' @field commit_message 
#' @field commit_choice 
#' @field last_commit 
#' @field new_branch_name 
#' @field versioning 
#' @field files 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PutFile <- R6::R6Class(
  'PutFile',
  public = list(
    `commit_summary` = NULL,
    `commit_message` = NULL,
    `commit_choice` = NULL,
    `last_commit` = NULL,
    `new_branch_name` = NULL,
    `versioning` = NULL,
    `files` = NULL,
    initialize = function(`commit_summary`, `commit_message`, `commit_choice`, `last_commit`, `new_branch_name`, `versioning`, `files`){
      if (!missing(`commit_summary`)) {
        stopifnot(is.character(`commit_summary`), length(`commit_summary`) == 1)
        self$`commit_summary` <- `commit_summary`
      }
      if (!missing(`commit_message`)) {
        stopifnot(is.character(`commit_message`), length(`commit_message`) == 1)
        self$`commit_message` <- `commit_message`
      }
      if (!missing(`commit_choice`)) {
        stopifnot(is.character(`commit_choice`), length(`commit_choice`) == 1)
        self$`commit_choice` <- `commit_choice`
      }
      if (!missing(`last_commit`)) {
        stopifnot(is.character(`last_commit`), length(`last_commit`) == 1)
        self$`last_commit` <- `last_commit`
      }
      if (!missing(`new_branch_name`)) {
        stopifnot(is.character(`new_branch_name`), length(`new_branch_name`) == 1)
        self$`new_branch_name` <- `new_branch_name`
      }
      if (!missing(`versioning`)) {
        stopifnot(is.character(`versioning`), length(`versioning`) == 1)
        self$`versioning` <- `versioning`
      }
      if (!missing(`files`)) {
        stopifnot(is.character(`files`), length(`files`) == 1)
        self$`files` <- `files`
      }
    },
    toJSON = function() {
      PutFileObject <- list()
      if (!is.null(self$`commit_summary`)) {
        PutFileObject[['commit_summary']] <- self$`commit_summary`
      }
      if (!is.null(self$`commit_message`)) {
        PutFileObject[['commit_message']] <- self$`commit_message`
      }
      if (!is.null(self$`commit_choice`)) {
        PutFileObject[['commit_choice']] <- self$`commit_choice`
      }
      if (!is.null(self$`last_commit`)) {
        PutFileObject[['last_commit']] <- self$`last_commit`
      }
      if (!is.null(self$`new_branch_name`)) {
        PutFileObject[['new_branch_name']] <- self$`new_branch_name`
      }
      if (!is.null(self$`versioning`)) {
        PutFileObject[['versioning']] <- self$`versioning`
      }
      if (!is.null(self$`files`)) {
        PutFileObject[['files']] <- self$`files`
      }

      PutFileObject
    },
    fromJSON = function(PutFileJson) {
      PutFileObject <- jsonlite::fromJSON(PutFileJson)
      if (!is.null(PutFileObject$`commit_summary`)) {
        self$`commit_summary` <- PutFileObject$`commit_summary`
      }
      if (!is.null(PutFileObject$`commit_message`)) {
        self$`commit_message` <- PutFileObject$`commit_message`
      }
      if (!is.null(PutFileObject$`commit_choice`)) {
        self$`commit_choice` <- PutFileObject$`commit_choice`
      }
      if (!is.null(PutFileObject$`last_commit`)) {
        self$`last_commit` <- PutFileObject$`last_commit`
      }
      if (!is.null(PutFileObject$`new_branch_name`)) {
        self$`new_branch_name` <- PutFileObject$`new_branch_name`
      }
      if (!is.null(PutFileObject$`versioning`)) {
        self$`versioning` <- PutFileObject$`versioning`
      }
      if (!is.null(PutFileObject$`files`)) {
        self$`files` <- PutFileObject$`files`
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "commit_summary": %s,
           "commit_message": %s,
           "commit_choice": %s,
           "last_commit": %s,
           "new_branch_name": %s,
           "versioning": %s,
           "files": %s
        }',
        self$`commit_summary`,
        self$`commit_message`,
        self$`commit_choice`,
        self$`last_commit`,
        self$`new_branch_name`,
        self$`versioning`,
        self$`files`
      )
    },
    fromJSONString = function(PutFileJson) {
      PutFileObject <- jsonlite::fromJSON(PutFileJson)
      self$`commit_summary` <- PutFileObject$`commit_summary`
      self$`commit_message` <- PutFileObject$`commit_message`
      self$`commit_choice` <- PutFileObject$`commit_choice`
      self$`last_commit` <- PutFileObject$`last_commit`
      self$`new_branch_name` <- PutFileObject$`new_branch_name`
      self$`versioning` <- PutFileObject$`versioning`
      self$`files` <- PutFileObject$`files`
    }
  )
)