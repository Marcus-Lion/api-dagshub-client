# DagsHub API
#
# This API provides a way to retrive & interact with data about DagsHub repositories, users, issues, webhooks and more. The API is also used by the [DagsHub Direct Data Access streaming client](https://github.com/DagsHub/client) to stream content from a repository for easier and faster training. 
#
# OpenAPI spec version: 1.0.2
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git
#' @title Content operations
#' @description dagshub_api.Content
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
#' get_archive Download archive
#'
#'
#' get_content List data in a repository folder
#'
#'
#' get_raw Download raw content
#'
#'
#' upload_content Upload data to a repository
#'
#' }
#'
#' @export
ContentApi <- R6::R6Class(
  'ContentApi',
  public = list(
    userAgent = "Swagger-Codegen/1.0.3/r",
    apiClient = NULL,
    initialize = function(apiClient){
      if (!missing(apiClient)) {
        self$apiClient <- apiClient
      }
      else {
        self$apiClient <- ApiClient$new()
      }
    },
    get_archive = function(owner, repo, ref, format, ...){
      args <- list(...)
      queryParams <- list()
      headerParams <- character()

      urlPath <- "/repos/{owner}/{repo}/archive/{ref}{format}"
      if (!missing(`owner`)) {
        urlPath <- gsub(paste0("\\{", "owner", "\\}"), `owner`, urlPath)
      }

      if (!missing(`repo`)) {
        urlPath <- gsub(paste0("\\{", "repo", "\\}"), `repo`, urlPath)
      }

      if (!missing(`ref`)) {
        urlPath <- gsub(paste0("\\{", "ref", "\\}"), `ref`, urlPath)
      }

      if (!missing(`format`)) {
        urlPath <- gsub(paste0("\\{", "format", "\\}"), `format`, urlPath)
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
    get_content = function(owner, repo, branch, path, include_size, ...){
      args <- list(...)
      queryParams <- list()
      headerParams <- character()

      if (!missing(`include_size`)) {
        queryParams['include_size'] <- include_size
      }

      urlPath <- "/repos/{owner}/{repo}/content/{branch}/{path}"
      if (!missing(`owner`)) {
        urlPath <- gsub(paste0("\\{", "owner", "\\}"), `owner`, urlPath)
      }

      if (!missing(`repo`)) {
        urlPath <- gsub(paste0("\\{", "repo", "\\}"), `repo`, urlPath)
      }

      if (!missing(`branch`)) {
        urlPath <- gsub(paste0("\\{", "branch", "\\}"), `branch`, urlPath)
      }

      if (!missing(`path`)) {
        urlPath <- gsub(paste0("\\{", "path", "\\}"), `path`, urlPath)
      }

      resp <- self$apiClient$callApi(url = paste0(self$apiClient$basePath, urlPath),
                                 method = "GET",
                                 queryParams = queryParams,
                                 headerParams = headerParams,
                                 body = body,
                                 ...)
      
      if (httr::status_code(resp) >= 200 && httr::status_code(resp) <= 299) {
        returnObject <- Files$new()
        result <- returnObject$fromJSON(httr::content(resp, "text", encoding = "UTF-8"))
        Response$new(returnObject, resp)
      } else if (httr::status_code(resp) >= 400 && httr::status_code(resp) <= 499) {
        Response$new("API client error", resp)
      } else if (httr::status_code(resp) >= 500 && httr::status_code(resp) <= 599) {
        Response$new("API server error", resp)
      }

    }
    get_raw = function(owner, repo, ref, path, ...){
      args <- list(...)
      queryParams <- list()
      headerParams <- character()

      urlPath <- "/repos/{owner}/{repo}/raw/{ref}/{path}"
      if (!missing(`owner`)) {
        urlPath <- gsub(paste0("\\{", "owner", "\\}"), `owner`, urlPath)
      }

      if (!missing(`repo`)) {
        urlPath <- gsub(paste0("\\{", "repo", "\\}"), `repo`, urlPath)
      }

      if (!missing(`ref`)) {
        urlPath <- gsub(paste0("\\{", "ref", "\\}"), `ref`, urlPath)
      }

      if (!missing(`path`)) {
        urlPath <- gsub(paste0("\\{", "path", "\\}"), `path`, urlPath)
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
    upload_content = function(owner, repo, branch, path, commit_summary, commit_message, commit_choice, last_commit, new_branch_name, versioning, files, ...){
      args <- list(...)
      queryParams <- list()
      headerParams <- character()

      body <- list(
          "commit_summary" = commit_summary,
          "commit_message" = commit_message,
          "commit_choice" = commit_choice,
          "last_commit" = last_commit,
          "new_branch_name" = new_branch_name,
          "versioning" = versioning,
          "files" = files
      )

      urlPath <- "/repos/{owner}/{repo}/content/{branch}/{path}"
      if (!missing(`owner`)) {
        urlPath <- gsub(paste0("\\{", "owner", "\\}"), `owner`, urlPath)
      }

      if (!missing(`repo`)) {
        urlPath <- gsub(paste0("\\{", "repo", "\\}"), `repo`, urlPath)
      }

      if (!missing(`branch`)) {
        urlPath <- gsub(paste0("\\{", "branch", "\\}"), `branch`, urlPath)
      }

      if (!missing(`path`)) {
        urlPath <- gsub(paste0("\\{", "path", "\\}"), `path`, urlPath)
      }

      resp <- self$apiClient$callApi(url = paste0(self$apiClient$basePath, urlPath),
                                 method = "PUT",
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
  )
)
