/**
 * DagsHub API
 * This API provides a way to retrive & interact with data about DagsHub repositories, users, issues, webhooks and more. The API is also used by the [DagsHub Direct Data Access streaming client](https://github.com/DagsHub/client) to stream content from a repository for easier and faster training. 
 *
 * OpenAPI spec version: 1.0.2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */
package io.swagger.client.models


/**
 * 
 * @param commitSummary 
 * @param commitMessage 
 * @param commitChoice 
 * @param lastCommit If omitted, **only new files** will be accepted.     Otherwise, the request is accepted only if **the tip of the branch is the same as `last_commit`** at the moment of processing the request.  This is done to prevent accidental conflicting changes. To get the latest commit you can use the [branches API](#operations-Branches-getBranch) 
 * @param newBranchName 
 * @param versioning 
 * @param files This property can be sent multiple times to upload multiple files.
 */
data class PutFile (

    val commitSummary: kotlin.String? = null,
    val commitMessage: kotlin.String? = null,
    val commitChoice: PutFile.CommitChoice,
    /* If omitted, **only new files** will be accepted.     Otherwise, the request is accepted only if **the tip of the branch is the same as `last_commit`** at the moment of processing the request.  This is done to prevent accidental conflicting changes. To get the latest commit you can use the [branches API](#operations-Branches-getBranch)  */
    val lastCommit: kotlin.String? = null,
    val newBranchName: kotlin.String? = null,
    val versioning: PutFile.Versioning? = null,
    /* This property can be sent multiple times to upload multiple files. */
    val files: kotlin.String
) {
    /**
    * 
    * Values: DIRECT,COMMITTONEWBRANCH
    */
    enum class CommitChoice(val value: kotlin.String){
        DIRECT("direct"),
        COMMITTONEWBRANCH("commit-to-new-branch");
    }
    /**
    * 
    * Values: AUTO,DVC,GIT
    */
    enum class Versioning(val value: kotlin.String){
        AUTO("auto"),
        DVC("dvc"),
        GIT("git");
    }
}