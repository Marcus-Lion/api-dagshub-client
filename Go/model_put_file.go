/*
 * DagsHub API
 *
 * This API is used to interact with DagsHub. 
 *
 * API version: 1.0.0
 * Generated by: Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
 */
package swagger

type PutFile struct {
	CommitSummary string `json:"commit_summary,omitempty"`
	CommitMessage string `json:"commit_message"`
	CommitChoice string `json:"commit_choice,omitempty"`
	// if omitted only new files will be accepted
	LastCommit string `json:"last_commit,omitempty"`
	NewBranchName string `json:"new_branch_name,omitempty"`
	Versioning string `json:"versioning,omitempty"`
	Files []interface{} `json:"files,omitempty"`
}