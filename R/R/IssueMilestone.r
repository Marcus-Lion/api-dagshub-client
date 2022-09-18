# DagsHub API
#
# The api docs are made with SwaggerUI using the OpenAPI 3 specification. 
#
# OpenAPI spec version: 0.1.0
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git

#' IssueMilestone Class
#'
#' @field id 
#' @field title 
#' @field description 
#' @field state 
#' @field open_issues 
#' @field closed_issues 
#' @field closed_at 
#' @field due_on 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
IssueMilestone <- R6::R6Class(
  'IssueMilestone',
  public = list(
    `id` = NULL,
    `title` = NULL,
    `description` = NULL,
    `state` = NULL,
    `open_issues` = NULL,
    `closed_issues` = NULL,
    `closed_at` = NULL,
    `due_on` = NULL,
    initialize = function(`id`, `title`, `description`, `state`, `open_issues`, `closed_issues`, `closed_at`, `due_on`){
      if (!missing(`id`)) {
        stopifnot(is.numeric(`id`), length(`id`) == 1)
        self$`id` <- `id`
      }
      if (!missing(`title`)) {
        stopifnot(is.character(`title`), length(`title`) == 1)
        self$`title` <- `title`
      }
      if (!missing(`description`)) {
        stopifnot(is.character(`description`), length(`description`) == 1)
        self$`description` <- `description`
      }
      if (!missing(`state`)) {
        stopifnot(is.character(`state`), length(`state`) == 1)
        self$`state` <- `state`
      }
      if (!missing(`open_issues`)) {
        stopifnot(is.numeric(`open_issues`), length(`open_issues`) == 1)
        self$`open_issues` <- `open_issues`
      }
      if (!missing(`closed_issues`)) {
        stopifnot(is.numeric(`closed_issues`), length(`closed_issues`) == 1)
        self$`closed_issues` <- `closed_issues`
      }
      if (!missing(`closed_at`)) {
        stopifnot(is.character(`closed_at`), length(`closed_at`) == 1)
        self$`closed_at` <- `closed_at`
      }
      if (!missing(`due_on`)) {
        stopifnot(is.character(`due_on`), length(`due_on`) == 1)
        self$`due_on` <- `due_on`
      }
    },
    toJSON = function() {
      IssueMilestoneObject <- list()
      if (!is.null(self$`id`)) {
        IssueMilestoneObject[['id']] <- self$`id`
      }
      if (!is.null(self$`title`)) {
        IssueMilestoneObject[['title']] <- self$`title`
      }
      if (!is.null(self$`description`)) {
        IssueMilestoneObject[['description']] <- self$`description`
      }
      if (!is.null(self$`state`)) {
        IssueMilestoneObject[['state']] <- self$`state`
      }
      if (!is.null(self$`open_issues`)) {
        IssueMilestoneObject[['open_issues']] <- self$`open_issues`
      }
      if (!is.null(self$`closed_issues`)) {
        IssueMilestoneObject[['closed_issues']] <- self$`closed_issues`
      }
      if (!is.null(self$`closed_at`)) {
        IssueMilestoneObject[['closed_at']] <- self$`closed_at`
      }
      if (!is.null(self$`due_on`)) {
        IssueMilestoneObject[['due_on']] <- self$`due_on`
      }

      IssueMilestoneObject
    },
    fromJSON = function(IssueMilestoneJson) {
      IssueMilestoneObject <- jsonlite::fromJSON(IssueMilestoneJson)
      if (!is.null(IssueMilestoneObject$`id`)) {
        self$`id` <- IssueMilestoneObject$`id`
      }
      if (!is.null(IssueMilestoneObject$`title`)) {
        self$`title` <- IssueMilestoneObject$`title`
      }
      if (!is.null(IssueMilestoneObject$`description`)) {
        self$`description` <- IssueMilestoneObject$`description`
      }
      if (!is.null(IssueMilestoneObject$`state`)) {
        self$`state` <- IssueMilestoneObject$`state`
      }
      if (!is.null(IssueMilestoneObject$`open_issues`)) {
        self$`open_issues` <- IssueMilestoneObject$`open_issues`
      }
      if (!is.null(IssueMilestoneObject$`closed_issues`)) {
        self$`closed_issues` <- IssueMilestoneObject$`closed_issues`
      }
      if (!is.null(IssueMilestoneObject$`closed_at`)) {
        self$`closed_at` <- IssueMilestoneObject$`closed_at`
      }
      if (!is.null(IssueMilestoneObject$`due_on`)) {
        self$`due_on` <- IssueMilestoneObject$`due_on`
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "id": %d,
           "title": %s,
           "description": %s,
           "state": %s,
           "open_issues": %d,
           "closed_issues": %d,
           "closed_at": %s,
           "due_on": %s
        }',
        self$`id`,
        self$`title`,
        self$`description`,
        self$`state`,
        self$`open_issues`,
        self$`closed_issues`,
        self$`closed_at`,
        self$`due_on`
      )
    },
    fromJSONString = function(IssueMilestoneJson) {
      IssueMilestoneObject <- jsonlite::fromJSON(IssueMilestoneJson)
      self$`id` <- IssueMilestoneObject$`id`
      self$`title` <- IssueMilestoneObject$`title`
      self$`description` <- IssueMilestoneObject$`description`
      self$`state` <- IssueMilestoneObject$`state`
      self$`open_issues` <- IssueMilestoneObject$`open_issues`
      self$`closed_issues` <- IssueMilestoneObject$`closed_issues`
      self$`closed_at` <- IssueMilestoneObject$`closed_at`
      self$`due_on` <- IssueMilestoneObject$`due_on`
    }
  )
)
