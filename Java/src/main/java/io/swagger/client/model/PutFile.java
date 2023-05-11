/*
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

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * PutFile
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-05-11T11:41:48.085831Z[Etc/UTC]")
public class PutFile {
  @SerializedName("commit_summary")
  private String commitSummary = null;

  @SerializedName("commit_message")
  private String commitMessage = null;

  /**
   * Gets or Sets commitChoice
   */
  @JsonAdapter(CommitChoiceEnum.Adapter.class)
  public enum CommitChoiceEnum {
    DIRECT("direct"),
    COMMIT_TO_NEW_BRANCH("commit-to-new-branch");

    private String value;

    CommitChoiceEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static CommitChoiceEnum fromValue(String input) {
      for (CommitChoiceEnum b : CommitChoiceEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<CommitChoiceEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CommitChoiceEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public CommitChoiceEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return CommitChoiceEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("commit_choice")
  private CommitChoiceEnum commitChoice = null;

  @SerializedName("last_commit")
  private String lastCommit = null;

  @SerializedName("new_branch_name")
  private String newBranchName = null;

  /**
   * Gets or Sets versioning
   */
  @JsonAdapter(VersioningEnum.Adapter.class)
  public enum VersioningEnum {
    AUTO("auto"),
    DVC("dvc"),
    GIT("git"),
    BUCKET("bucket");

    private String value;

    VersioningEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static VersioningEnum fromValue(String input) {
      for (VersioningEnum b : VersioningEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<VersioningEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final VersioningEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public VersioningEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return VersioningEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("versioning")
  private VersioningEnum versioning = VersioningEnum.AUTO;

  @SerializedName("files")
  private String files = null;

  public PutFile commitSummary(String commitSummary) {
    this.commitSummary = commitSummary;
    return this;
  }

   /**
   * Get commitSummary
   * @return commitSummary
  **/
  @Schema(description = "")
  public String getCommitSummary() {
    return commitSummary;
  }

  public void setCommitSummary(String commitSummary) {
    this.commitSummary = commitSummary;
  }

  public PutFile commitMessage(String commitMessage) {
    this.commitMessage = commitMessage;
    return this;
  }

   /**
   * Get commitMessage
   * @return commitMessage
  **/
  @Schema(example = "Upload file using API", description = "")
  public String getCommitMessage() {
    return commitMessage;
  }

  public void setCommitMessage(String commitMessage) {
    this.commitMessage = commitMessage;
  }

  public PutFile commitChoice(CommitChoiceEnum commitChoice) {
    this.commitChoice = commitChoice;
    return this;
  }

   /**
   * Get commitChoice
   * @return commitChoice
  **/
  @Schema(example = "direct", required = true, description = "")
  public CommitChoiceEnum getCommitChoice() {
    return commitChoice;
  }

  public void setCommitChoice(CommitChoiceEnum commitChoice) {
    this.commitChoice = commitChoice;
  }

  public PutFile lastCommit(String lastCommit) {
    this.lastCommit = lastCommit;
    return this;
  }

   /**
   * If omitted, **only new files** will be accepted.     Otherwise, the request is accepted only if **the tip of the branch is the same as &#x60;last_commit&#x60;** at the moment of processing the request.  This is done to prevent accidental conflicting changes. To get the latest commit you can use the [branches API](#operations-Branches-getBranch) 
   * @return lastCommit
  **/
  @Schema(description = "If omitted, **only new files** will be accepted.     Otherwise, the request is accepted only if **the tip of the branch is the same as `last_commit`** at the moment of processing the request.  This is done to prevent accidental conflicting changes. To get the latest commit you can use the [branches API](#operations-Branches-getBranch) ")
  public String getLastCommit() {
    return lastCommit;
  }

  public void setLastCommit(String lastCommit) {
    this.lastCommit = lastCommit;
  }

  public PutFile newBranchName(String newBranchName) {
    this.newBranchName = newBranchName;
    return this;
  }

   /**
   * Get newBranchName
   * @return newBranchName
  **/
  @Schema(example = "new-branch", description = "")
  public String getNewBranchName() {
    return newBranchName;
  }

  public void setNewBranchName(String newBranchName) {
    this.newBranchName = newBranchName;
  }

  public PutFile versioning(VersioningEnum versioning) {
    this.versioning = versioning;
    return this;
  }

   /**
   * Get versioning
   * @return versioning
  **/
  @Schema(description = "")
  public VersioningEnum getVersioning() {
    return versioning;
  }

  public void setVersioning(VersioningEnum versioning) {
    this.versioning = versioning;
  }

  public PutFile files(String files) {
    this.files = files;
    return this;
  }

   /**
   * This property can be sent multiple times to upload multiple files.
   * @return files
  **/
  @Schema(required = true, description = "This property can be sent multiple times to upload multiple files.")
  public String getFiles() {
    return files;
  }

  public void setFiles(String files) {
    this.files = files;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PutFile putFile = (PutFile) o;
    return Objects.equals(this.commitSummary, putFile.commitSummary) &&
        Objects.equals(this.commitMessage, putFile.commitMessage) &&
        Objects.equals(this.commitChoice, putFile.commitChoice) &&
        Objects.equals(this.lastCommit, putFile.lastCommit) &&
        Objects.equals(this.newBranchName, putFile.newBranchName) &&
        Objects.equals(this.versioning, putFile.versioning) &&
        Objects.equals(this.files, putFile.files);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commitSummary, commitMessage, commitChoice, lastCommit, newBranchName, versioning, files);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PutFile {\n");
    
    sb.append("    commitSummary: ").append(toIndentedString(commitSummary)).append("\n");
    sb.append("    commitMessage: ").append(toIndentedString(commitMessage)).append("\n");
    sb.append("    commitChoice: ").append(toIndentedString(commitChoice)).append("\n");
    sb.append("    lastCommit: ").append(toIndentedString(lastCommit)).append("\n");
    sb.append("    newBranchName: ").append(toIndentedString(newBranchName)).append("\n");
    sb.append("    versioning: ").append(toIndentedString(versioning)).append("\n");
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
