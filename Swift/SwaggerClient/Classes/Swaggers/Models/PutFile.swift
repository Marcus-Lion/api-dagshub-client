//
// PutFile.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct PutFile: Codable {

    public enum CommitChoice: String, Codable { 
        case direct = "direct"
        case commitToNewBranch = "commit-to-new-branch"
    }
    public enum Versioning: String, Codable { 
        case auto = "auto"
        case dvc = "dvc"
        case git = "git"
    }
    public var commitSummary: String?
    public var commitMessage: String?
    public var commitChoice: CommitChoice
    /** If omitted, **only new files** will be accepted.     Otherwise, the request is accepted only if **the tip of the branch is the same as &#x60;last_commit&#x60;** at the moment of processing the request.  This is done to prevent accidental conflicting changes. To get the latest commit you can use the [branches API](#operations-Branches-getBranch)  */
    public var lastCommit: String?
    public var newBranchName: String?
    public var versioning: Versioning?
    /** This property can be sent multiple times to upload multiple files. */
    public var files: String

    public init(commitSummary: String? = nil, commitMessage: String? = nil, commitChoice: CommitChoice, lastCommit: String? = nil, newBranchName: String? = nil, versioning: Versioning? = nil, files: String) {
        self.commitSummary = commitSummary
        self.commitMessage = commitMessage
        self.commitChoice = commitChoice
        self.lastCommit = lastCommit
        self.newBranchName = newBranchName
        self.versioning = versioning
        self.files = files
    }

    public enum CodingKeys: String, CodingKey { 
        case commitSummary = "commit_summary"
        case commitMessage = "commit_message"
        case commitChoice = "commit_choice"
        case lastCommit = "last_commit"
        case newBranchName = "new_branch_name"
        case versioning
        case files
    }

}
