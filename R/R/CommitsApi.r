# DagsHub API
#
# This API provides a way to retrive & interact with data about DagsHub repositories, users, issues, webhooks and more. The API is also used by the [DagsHub Direct Data Access streaming client](https://github.com/DagsHub/client) to stream content from a repository for easier and faster training. 
#
# OpenAPI spec version: 1.0.2
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git
#' @title Commits operations
#' @description dagshub_api.Commits
#'
#' @field path Stores url path of the request.
#' @field apiClient Handles the client-server communication.
#' @field userAgent Set the user agent of the request.
#'
#' @importFrom R6 R6Class
#'
#' @section Methods:
#' \describe{
#'
#' get_commit Get a single commit
#'
#'
#' get_commit_sha1 Get the SHA-1 of a commit reference
#'
#' }
#'
#' @export
CommitsApi <- R6::R6Class(
  'CommitsApi',
  public = list(
    userAgent = "Swagger-Codegen/1.0.2/r",
    apiClient = NULL,
    initialize = function(apiClient){
      if (!missing(apiClient)) {
        self$apiClient <- apiClient
      }
      else {
        self$apiClient <- ApiClient$new()
      }
    },
    get_commit = function(owner, repo, sha, ...){
      args <- list(...)
      queryParams <- list()
      headerParams <- character()

      urlPath <- "/repos/{owner}/{repo}/commits/{sha}"
      if (!missing(`owner`)) {
        urlPath <- gsub(paste0("\\{", "owner", "\\}"), `owner`, urlPath)
      }

      if (!missing(`repo`)) {
        urlPath <- gsub(paste0("\\{", "repo", "\\}"), `repo`, urlPath)
      }

      if (!missing(`sha`)) {
        urlPath <- gsub(paste0("\\{", "sha", "\\}"), `sha`, urlPath)
      }

      resp <- self$apiClient$callApi(url = paste0(self$apiClient$basePath, urlPath),
                                 method = "GET",
                                 queryParams = queryParams,
                                 headerParams = headerParams,
                                 body = body,
                                 ...)
      
      if (httr::status_code(resp) >= 200 && httr::status_code(resp) <= 299) {
        # void response, no need to return anything
      } else if (httr::status_code(resp) >= 400 && httr::status_code(resp) <= 499) {
        Response$new("API client error", resp)
      } else if (httr::status_code(resp) >= 500 && httr::status_code(resp) <= 599) {
        Response$new("API server error", resp)
      }

    }
    get_commit_sha1 = function(owner, repo, ref, ...){
      args <- list(...)
      queryParams <- list()
      headerParams <- character()

      urlPath <- "/repos/{owner}/{repo}/commits/{ref}"
      if (!missing(`owner`)) {
        urlPath <- gsub(paste0("\\{", "owner", "\\}"), `owner`, urlPath)
      }

      if (!missing(`repo`)) {
        urlPath <- gsub(paste0("\\{", "repo", "\\}"), `repo`, urlPath)
      }

      if (!missing(`ref`)) {
        urlPath <- gsub(paste0("\\{", "ref", "\\}"), `ref`, urlPath)
      }

      resp <- self$apiClient$callApi(url = paste0(self$apiClient$basePath, urlPath),
                                 method = "GET",
                                 queryParams = queryParams,
                                 headerParams = headerParams,
                                 body = body,
                                 ...)
      
      if (httr::status_code(resp) >= 200 && httr::status_code(resp) <= 299) {
        returnObject <- Character$new()
        result <- returnObject$fromJSON(httr::content(resp, "text", encoding = "UTF-8"))
        Response$new(returnObject, resp)
      } else if (httr::status_code(resp) >= 400 && httr::status_code(resp) <= 499) {
        Response$new("API client error", resp)
      } else if (httr::status_code(resp) >= 500 && httr::status_code(resp) <= 599) {
        Response$new("API server error", resp)
      }

    }
  )
)