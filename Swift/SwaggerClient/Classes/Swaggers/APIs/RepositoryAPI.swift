//
// RepositoryAPI.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation
import Alamofire


open class RepositoryAPI {
    /**
     Create in organization

     - parameter orgname: (path) A DagsHub organization name 
     - parameter body: (body)  (optional)
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func createOrgRepo(orgname: String, body: CreateRepo? = nil, completion: @escaping ((_ data: Void?,_ error: Error?) -> Void)) {
        createOrgRepoWithRequestBuilder(orgname: orgname, body: body).execute { (response, error) -> Void in
            if error == nil {
                completion((), error)
            } else {
                completion(nil, error)
            }
        }
    }


    /**
     Create in organization
     - POST /org/{orgname}/repos

     - BASIC:
       - type: http
       - name: basicAuth
     - API Key:
       - type: apiKey token (QUERY)
       - name: tokenAuth
     - parameter orgname: (path) A DagsHub organization name 
     - parameter body: (body)  (optional)

     - returns: RequestBuilder<Void> 
     */
    open class func createOrgRepoWithRequestBuilder(orgname: String, body: CreateRepo? = nil) -> RequestBuilder<Void> {
        var path = "/org/{orgname}/repos"
        let orgnamePreEscape = "\(orgname)"
        let orgnamePostEscape = orgnamePreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{orgname}", with: orgnamePostEscape, options: .literal, range: nil)
        let URLString = SwaggerClientAPI.basePath + path
        let parameters = JSONEncodingHelper.encodingParameters(forEncodableObject: body)
        let url = URLComponents(string: URLString)


        let requestBuilder: RequestBuilder<Void>.Type = SwaggerClientAPI.requestBuilderFactory.getNonDecodableBuilder()

        return requestBuilder.init(method: "POST", URLString: (url?.string ?? URLString), parameters: parameters, isBody: true)
    }
    /**
     Create

     - parameter body: (body)  (optional)
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func createRepo(body: CreateRepo? = nil, completion: @escaping ((_ data: Void?,_ error: Error?) -> Void)) {
        createRepoWithRequestBuilder(body: body).execute { (response, error) -> Void in
            if error == nil {
                completion((), error)
            } else {
                completion(nil, error)
            }
        }
    }


    /**
     Create
     - POST /user/repos

     - BASIC:
       - type: http
       - name: basicAuth
     - API Key:
       - type: apiKey token (QUERY)
       - name: tokenAuth
     - parameter body: (body)  (optional)

     - returns: RequestBuilder<Void> 
     */
    open class func createRepoWithRequestBuilder(body: CreateRepo? = nil) -> RequestBuilder<Void> {
        let path = "/user/repos"
        let URLString = SwaggerClientAPI.basePath + path
        let parameters = JSONEncodingHelper.encodingParameters(forEncodableObject: body)
        let url = URLComponents(string: URLString)


        let requestBuilder: RequestBuilder<Void>.Type = SwaggerClientAPI.requestBuilderFactory.getNonDecodableBuilder()

        return requestBuilder.init(method: "POST", URLString: (url?.string ?? URLString), parameters: parameters, isBody: true)
    }
    /**
     Get repository information

     - parameter username: (path) A DagsHub username 
     - parameter repo: (path) name of the repository 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func getRepo(username: String, repo: String, completion: @escaping ((_ data: Void?,_ error: Error?) -> Void)) {
        getRepoWithRequestBuilder(username: username, repo: repo).execute { (response, error) -> Void in
            if error == nil {
                completion((), error)
            } else {
                completion(nil, error)
            }
        }
    }


    /**
     Get repository information
     - GET /repos/{username}/{repo}
     - 

     - BASIC:
       - type: http
       - name: basicAuth
     - API Key:
       - type: apiKey token (QUERY)
       - name: tokenAuth
     - parameter username: (path) A DagsHub username 
     - parameter repo: (path) name of the repository 

     - returns: RequestBuilder<Void> 
     */
    open class func getRepoWithRequestBuilder(username: String, repo: String) -> RequestBuilder<Void> {
        var path = "/repos/{username}/{repo}"
        let usernamePreEscape = "\(username)"
        let usernamePostEscape = usernamePreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{username}", with: usernamePostEscape, options: .literal, range: nil)
        let repoPreEscape = "\(repo)"
        let repoPostEscape = repoPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{repo}", with: repoPostEscape, options: .literal, range: nil)
        let URLString = SwaggerClientAPI.basePath + path
        let parameters: [String:Any]? = nil
        let url = URLComponents(string: URLString)


        let requestBuilder: RequestBuilder<Void>.Type = SwaggerClientAPI.requestBuilderFactory.getNonDecodableBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }
    /**
     List your repositories

     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func listMyRepos(completion: @escaping ((_ data: Void?,_ error: Error?) -> Void)) {
        listMyReposWithRequestBuilder().execute { (response, error) -> Void in
            if error == nil {
                completion((), error)
            } else {
                completion(nil, error)
            }
        }
    }


    /**
     List your repositories
     - GET /user/repos

     - BASIC:
       - type: http
       - name: basicAuth
     - API Key:
       - type: apiKey token (QUERY)
       - name: tokenAuth
     - examples: [{contentType=application/json, example=[ {
  "id" : 2942,
  "owner" : {
    "id" : 23,
    "login" : "DagsHub",
    "full_name" : "DagsHub",
    "avatar_url" : "https://dagshub.com/avatars/23",
    "username" : "DagsHub"
  },
  "name" : "audio-datasets",
  "full_name" : "DagsHub/audio-datasets",
  "description" : "Open-source audio datasets hosted on DagsHub",
  "private" : false,
  "fork" : false,
  "parent" : null,
  "empty" : false,
  "mirror" : true,
  "size" : 10121216,
  "html_url" : "https://dagshub.com/DagsHub/audio-datasets",
  "ssh_url" : "ssh://git@dagshub.com:2200/DagsHub/audio-datasets.git",
  "clone_url" : "https://github.com/DAGsHub/audio-datasets.git",
  "website" : "",
  "stars_count" : 2,
  "forks_count" : 2,
  "watchers_count" : 7,
  "open_issues_count" : 11,
  "default_branch" : "main",
  "created_at" : "2021-10-05T16:02:42Z",
  "updated_at" : "2022-08-22T09:54:12Z",
  "permissions" : {
    "admin" : true,
    "push" : true,
    "pull" : true
  }
} ]}]

     - returns: RequestBuilder<Void> 
     */
    open class func listMyReposWithRequestBuilder() -> RequestBuilder<Void> {
        let path = "/user/repos"
        let URLString = SwaggerClientAPI.basePath + path
        let parameters: [String:Any]? = nil
        let url = URLComponents(string: URLString)


        let requestBuilder: RequestBuilder<Void>.Type = SwaggerClientAPI.requestBuilderFactory.getNonDecodableBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }
    /**
     List organization repositories

     - parameter orgname: (path) A DagsHub organization name 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func listOrgRepos(orgname: String, completion: @escaping ((_ data: Void?,_ error: Error?) -> Void)) {
        listOrgReposWithRequestBuilder(orgname: orgname).execute { (response, error) -> Void in
            if error == nil {
                completion((), error)
            } else {
                completion(nil, error)
            }
        }
    }


    /**
     List organization repositories
     - GET /orgs/{orgname}/repos

     - BASIC:
       - type: http
       - name: basicAuth
     - API Key:
       - type: apiKey token (QUERY)
       - name: tokenAuth
     - parameter orgname: (path) A DagsHub organization name 

     - returns: RequestBuilder<Void> 
     */
    open class func listOrgReposWithRequestBuilder(orgname: String) -> RequestBuilder<Void> {
        var path = "/orgs/{orgname}/repos"
        let orgnamePreEscape = "\(orgname)"
        let orgnamePostEscape = orgnamePreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{orgname}", with: orgnamePostEscape, options: .literal, range: nil)
        let URLString = SwaggerClientAPI.basePath + path
        let parameters: [String:Any]? = nil
        let url = URLComponents(string: URLString)


        let requestBuilder: RequestBuilder<Void>.Type = SwaggerClientAPI.requestBuilderFactory.getNonDecodableBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }
    /**
     List user repositories

     - parameter username: (path) A DagsHub username 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func listUserRepos(username: String, completion: @escaping ((_ data: Void?,_ error: Error?) -> Void)) {
        listUserReposWithRequestBuilder(username: username).execute { (response, error) -> Void in
            if error == nil {
                completion((), error)
            } else {
                completion(nil, error)
            }
        }
    }


    /**
     List user repositories
     - GET /users/{username}/repos

     - BASIC:
       - type: http
       - name: basicAuth
     - API Key:
       - type: apiKey token (QUERY)
       - name: tokenAuth
     - parameter username: (path) A DagsHub username 

     - returns: RequestBuilder<Void> 
     */
    open class func listUserReposWithRequestBuilder(username: String) -> RequestBuilder<Void> {
        var path = "/users/{username}/repos"
        let usernamePreEscape = "\(username)"
        let usernamePostEscape = usernamePreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{username}", with: usernamePostEscape, options: .literal, range: nil)
        let URLString = SwaggerClientAPI.basePath + path
        let parameters: [String:Any]? = nil
        let url = URLComponents(string: URLString)


        let requestBuilder: RequestBuilder<Void>.Type = SwaggerClientAPI.requestBuilderFactory.getNonDecodableBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }
    /**
     Migrate repository

     - parameter body: (body)  (optional)
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func migrateRepo(body: MigrateRepo? = nil, completion: @escaping ((_ data: Void?,_ error: Error?) -> Void)) {
        migrateRepoWithRequestBuilder(body: body).execute { (response, error) -> Void in
            if error == nil {
                completion((), error)
            } else {
                completion(nil, error)
            }
        }
    }


    /**
     Migrate repository
     - POST /repos/migrate

     - BASIC:
       - type: http
       - name: basicAuth
     - API Key:
       - type: apiKey token (QUERY)
       - name: tokenAuth
     - parameter body: (body)  (optional)

     - returns: RequestBuilder<Void> 
     */
    open class func migrateRepoWithRequestBuilder(body: MigrateRepo? = nil) -> RequestBuilder<Void> {
        let path = "/repos/migrate"
        let URLString = SwaggerClientAPI.basePath + path
        let parameters = JSONEncodingHelper.encodingParameters(forEncodableObject: body)
        let url = URLComponents(string: URLString)


        let requestBuilder: RequestBuilder<Void>.Type = SwaggerClientAPI.requestBuilderFactory.getNonDecodableBuilder()

        return requestBuilder.init(method: "POST", URLString: (url?.string ?? URLString), parameters: parameters, isBody: true)
    }
    /**
     Search repositories

     - parameter q: (query)  
     - parameter uid: (query) User ID to specify search whose repositories. Default is 0 and search all repositories (optional, default to 0)
     - parameter limit: (query) Maximum number of repositories in search results. (optional, default to 10)
     - parameter page: (query) Page number. Default is 1. (optional, default to 1)
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func search(q: String, uid: Int? = nil, limit: Int? = nil, page: Int? = nil, completion: @escaping ((_ data: Void?,_ error: Error?) -> Void)) {
        searchWithRequestBuilder(q: q, uid: uid, limit: limit, page: page).execute { (response, error) -> Void in
            if error == nil {
                completion((), error)
            } else {
                completion(nil, error)
            }
        }
    }


    /**
     Search repositories
     - GET /repos/search
     - 

     - BASIC:
       - type: http
       - name: basicAuth
     - API Key:
       - type: apiKey token (QUERY)
       - name: tokenAuth
     - examples: [{contentType=application/json, example={
  "data" : [ {
    "id" : 1213,
    "owner" : {
      "id" : 6,
      "login" : "DAGsHub-Official",
      "full_name" : "DagsHub Official",
      "avatar_url" : "https://dagshub.com/avatars/6",
      "username" : "DAGsHub-Official"
    },
    "name" : "dagshub-docs",
    "full_name" : "DAGsHub-Official/dagshub-docs",
    "description" : "Official repo for DagsHub documentation.",
    "private" : false,
    "fork" : false,
    "parent" : null,
    "empty" : false,
    "mirror" : false,
    "size" : 458313728,
    "html_url" : "https://dagshub.com/DAGsHub-Official/dagshub-docs",
    "ssh_url" : "ssh://git@dagshub.com:2200/DAGsHub-Official/dagshub-docs.git",
    "clone_url" : "https://dagshub.com/DAGsHub-Official/dagshub-docs.git",
    "website" : "https://dagshub.com/docs",
    "stars_count" : 4,
    "forks_count" : 11,
    "watchers_count" : 1,
    "open_issues_count" : 2,
    "default_branch" : "main",
    "created_at" : "2021-02-23T11:53:45Z",
    "updated_at" : "2022-09-14T09:55:35Z"
  } ],
  "ok" : true
}}]
     - parameter q: (query)  
     - parameter uid: (query) User ID to specify search whose repositories. Default is 0 and search all repositories (optional, default to 0)
     - parameter limit: (query) Maximum number of repositories in search results. (optional, default to 10)
     - parameter page: (query) Page number. Default is 1. (optional, default to 1)

     - returns: RequestBuilder<Void> 
     */
    open class func searchWithRequestBuilder(q: String, uid: Int? = nil, limit: Int? = nil, page: Int? = nil) -> RequestBuilder<Void> {
        let path = "/repos/search"
        let URLString = SwaggerClientAPI.basePath + path
        let parameters: [String:Any]? = nil
        var url = URLComponents(string: URLString)
        url?.queryItems = APIHelper.mapValuesToQueryItems([
                        "q": q, 
                        "uid": uid?.encodeToJSON(), 
                        "limit": limit?.encodeToJSON(), 
                        "page": page?.encodeToJSON()
        ])


        let requestBuilder: RequestBuilder<Void>.Type = SwaggerClientAPI.requestBuilderFactory.getNonDecodableBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }
}
