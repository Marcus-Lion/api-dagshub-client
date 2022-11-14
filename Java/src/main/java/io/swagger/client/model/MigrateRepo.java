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
 * MigrateRepo
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-11-03T14:39:16.361212Z[Etc/UTC]")
public class MigrateRepo {
  @SerializedName("clone_addr")
  private String cloneAddr = null;

  @SerializedName("auth_username")
  private String authUsername = null;

  @SerializedName("auth_password")
  private String authPassword = null;

  @SerializedName("user_id")
  private Integer userId = null;

  @SerializedName("repo_name")
  private String repoName = null;

  @SerializedName("mirror")
  private Boolean mirror = false;

  /**
   * Repository will be private or public.
   */
  @JsonAdapter(VisibilityEnum.Adapter.class)
  public enum VisibilityEnum {
    PRIVATE("private"),
    PUBLIC("public");

    private String value;

    VisibilityEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static VisibilityEnum fromValue(String input) {
      for (VisibilityEnum b : VisibilityEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<VisibilityEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final VisibilityEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public VisibilityEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return VisibilityEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("visibility")
  private VisibilityEnum visibility = false;

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

  public MigrateRepo userId(Integer userId) {
    this.userId = userId;
    return this;
  }

   /**
   * User ID who takes ownership of this repository
   * @return userId
  **/
  @Schema(required = true, description = "User ID who takes ownership of this repository")
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
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

  public MigrateRepo visibility(VisibilityEnum visibility) {
    this.visibility = visibility;
    return this;
  }

   /**
   * Repository will be private or public.
   * @return visibility
  **/
  @Schema(description = "Repository will be private or public.")
  public VisibilityEnum getVisibility() {
    return visibility;
  }

  public void setVisibility(VisibilityEnum visibility) {
    this.visibility = visibility;
  }

  public MigrateRepo description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of the repository
   * @return description
  **/
  @Schema(example = "This is a repository", description = "Description of the repository")
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
        Objects.equals(this.userId, migrateRepo.userId) &&
        Objects.equals(this.repoName, migrateRepo.repoName) &&
        Objects.equals(this.mirror, migrateRepo.mirror) &&
        Objects.equals(this.visibility, migrateRepo.visibility) &&
        Objects.equals(this.description, migrateRepo.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloneAddr, authUsername, authPassword, userId, repoName, mirror, visibility, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MigrateRepo {\n");
    
    sb.append("    cloneAddr: ").append(toIndentedString(cloneAddr)).append("\n");
    sb.append("    authUsername: ").append(toIndentedString(authUsername)).append("\n");
    sb.append("    authPassword: ").append(toIndentedString(authPassword)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    repoName: ").append(toIndentedString(repoName)).append("\n");
    sb.append("    mirror: ").append(toIndentedString(mirror)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
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
