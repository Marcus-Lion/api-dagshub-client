//
// CommitsAPI.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation
import Alamofire


open class CommitsAPI {
    /**
     Get a single commit

     - parameter owner: (path) owner of the repository 
     - parameter repo: (path) name of the repository 
     - parameter sha: (path) a SHA1 of a commit 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func getCommit(owner: String, repo: String, sha: String, completion: @escaping ((_ data: Void?,_ error: Error?) -> Void)) {
        getCommitWithRequestBuilder(owner: owner, repo: repo, sha: sha).execute { (response, error) -> Void in
            if error == nil {
                completion((), error)
            } else {
                completion(nil, error)
            }
        }
    }


    /**
     Get a single commit
     - GET /repos/{owner}/{repo}/commits/{sha}
     - 

     - BASIC:
       - type: http
       - name: basicAuth
     - API Key:
       - type: apiKey token (QUERY)
       - name: tokenAuth
     - parameter owner: (path) owner of the repository 
     - parameter repo: (path) name of the repository 
     - parameter sha: (path) a SHA1 of a commit 

     - returns: RequestBuilder<Void> 
     */
    open class func getCommitWithRequestBuilder(owner: String, repo: String, sha: String) -> RequestBuilder<Void> {
        var path = "/repos/{owner}/{repo}/commits/{sha}"
        let ownerPreEscape = "\(owner)"
        let ownerPostEscape = ownerPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{owner}", with: ownerPostEscape, options: .literal, range: nil)
        let repoPreEscape = "\(repo)"
        let repoPostEscape = repoPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{repo}", with: repoPostEscape, options: .literal, range: nil)
        let shaPreEscape = "\(sha)"
        let shaPostEscape = shaPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{sha}", with: shaPostEscape, options: .literal, range: nil)
        let URLString = SwaggerClientAPI.basePath + path
        let parameters: [String:Any]? = nil
        let url = URLComponents(string: URLString)


        let requestBuilder: RequestBuilder<Void>.Type = SwaggerClientAPI.requestBuilderFactory.getNonDecodableBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }
    /**
     Get the SHA-1 of a commit reference

     - parameter owner: (path) owner of the repository 
     - parameter repo: (path) name of the repository 
     - parameter ref: (path) The name of the commit/branch/tag 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func getCommitSha1(owner: String, repo: String, ref: String, completion: @escaping ((_ data: String?,_ error: Error?) -> Void)) {
        getCommitSha1WithRequestBuilder(owner: owner, repo: repo, ref: ref).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Get the SHA-1 of a commit reference
     - GET /repos/{owner}/{repo}/commits/{ref}
     - 

     - BASIC:
       - type: http
       - name: basicAuth
     - API Key:
       - type: apiKey token (QUERY)
       - name: tokenAuth
     - examples: [{contentType=application/json, example=""}]
     - parameter owner: (path) owner of the repository 
     - parameter repo: (path) name of the repository 
     - parameter ref: (path) The name of the commit/branch/tag 

     - returns: RequestBuilder<String> 
     */
    open class func getCommitSha1WithRequestBuilder(owner: String, repo: String, ref: String) -> RequestBuilder<String> {
        var path = "/repos/{owner}/{repo}/commits/{ref}"
        let ownerPreEscape = "\(owner)"
        let ownerPostEscape = ownerPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{owner}", with: ownerPostEscape, options: .literal, range: nil)
        let repoPreEscape = "\(repo)"
        let repoPostEscape = repoPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{repo}", with: repoPostEscape, options: .literal, range: nil)
        let refPreEscape = "\(ref)"
        let refPostEscape = refPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{ref}", with: refPostEscape, options: .literal, range: nil)
        let URLString = SwaggerClientAPI.basePath + path
        let parameters: [String:Any]? = nil
        let url = URLComponents(string: URLString)


        let requestBuilder: RequestBuilder<String>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }
}
