/*
 * DagsHub API
 * This API is used to interact with DagsHub. 
 *
 * OpenAPI spec version: 1.0.0
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
 * MigrateRepo
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-09-11T10:15:43.663+03:00[Asia/Jerusalem]")
public class MigrateRepo {
  @SerializedName("clone_addr")
  private String cloneAddr = null;

  @SerializedName("auth_username")
  private String authUsername = null;

  @SerializedName("auth_password")
  private String authPassword = null;

  @SerializedName("uid")
  private Integer uid = null;

  @SerializedName("repo_name")
  private String repoName = null;

  @SerializedName("mirror")
  private Boolean mirror = false;

  @SerializedName("private")
  private Boolean _private = false;

  @SerializedName("description")
  private String description = null;

  public MigrateRepo cloneAddr(String cloneAddr) {
    this.cloneAddr = cloneAddr;
    return this;
  }

   /**
   * Remote Git address (HTTP/HTTPS URL or local path)
   * @return cloneAddr
  **/
  @Schema(required = true, description = "Remote Git address (HTTP/HTTPS URL or local path)")
  public String getCloneAddr() {
    return cloneAddr;
  }

  public void setCloneAddr(String cloneAddr) {
    this.cloneAddr = cloneAddr;
  }

  public MigrateRepo authUsername(String authUsername) {
    this.authUsername = authUsername;
    return this;
  }

   /**
   * Authorization username
   * @return authUsername
  **/
  @Schema(description = "Authorization username")
  public String getAuthUsername() {
    return authUsername;
  }

  public void setAuthUsername(String authUsername) {
    this.authUsername = authUsername;
  }

  public MigrateRepo authPassword(String authPassword) {
    this.authPassword = authPassword;
    return this;
  }

   /**
   * Authorization password
   * @return authPassword
  **/
  @Schema(description = "Authorization password")
  public String getAuthPassword() {
    return authPassword;
  }

  public void setAuthPassword(String authPassword) {
    this.authPassword = authPassword;
  }

  public MigrateRepo uid(Integer uid) {
    this.uid = uid;
    return this;
  }

   /**
   * User ID who takes ownership of this repository
   * @return uid
  **/
  @Schema(required = true, description = "User ID who takes ownership of this repository")
  public Integer getUid() {
    return uid;
  }

  public void setUid(Integer uid) {
    this.uid = uid;
  }

  public MigrateRepo repoName(String repoName) {
    this.repoName = repoName;
    return this;
  }

   /**
   * Name of the repository
   * @return repoName
  **/
  @Schema(example = "repo-name", description = "Name of the repository")
  public String getRepoName() {
    return repoName;
  }

  public void setRepoName(String repoName) {
    this.repoName = repoName;
  }

  public MigrateRepo mirror(Boolean mirror) {
    this.mirror = mirror;
    return this;
  }

   /**
   * Repository will be a mirror (connected repository).
   * @return mirror
  **/
  @Schema(description = "Repository will be a mirror (connected repository).")
  public Boolean isMirror() {
    return mirror;
  }

  public void setMirror(Boolean mirror) {
    this.mirror = mirror;
  }

  public MigrateRepo _private(Boolean _private) {
    this._private = _private;
    return this;
  }

   /**
   * Repository will be private.
   * @return _private
  **/
  @Schema(description = "Repository will be private.")
  public Boolean isPrivate() {
    return _private;
  }

  public void setPrivate(Boolean _private) {
    this._private = _private;
  }

  public MigrateRepo description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of the repository
   * @return description
  **/
  @Schema(example = "...", description = "Description of the repository")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MigrateRepo migrateRepo = (MigrateRepo) o;
    return Objects.equals(this.cloneAddr, migrateRepo.cloneAddr) &&
        Objects.equals(this.authUsername, migrateRepo.authUsername) &&
        Objects.equals(this.authPassword, migrateRepo.authPassword) &&
        Objects.equals(this.uid, migrateRepo.uid) &&
        Objects.equals(this.repoName, migrateRepo.repoName) &&
        Objects.equals(this.mirror, migrateRepo.mirror) &&
        Objects.equals(this._private, migrateRepo._private) &&
        Objects.equals(this.description, migrateRepo.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloneAddr, authUsername, authPassword, uid, repoName, mirror, _private, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MigrateRepo {\n");
    
    sb.append("    cloneAddr: ").append(toIndentedString(cloneAddr)).append("\n");
    sb.append("    authUsername: ").append(toIndentedString(authUsername)).append("\n");
    sb.append("    authPassword: ").append(toIndentedString(authPassword)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    repoName: ").append(toIndentedString(repoName)).append("\n");
    sb.append("    mirror: ").append(toIndentedString(mirror)).append("\n");
    sb.append("    _private: ").append(toIndentedString(_private)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
