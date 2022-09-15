/*
 * DagsHub API
 * The api docs are made with SwaggerUI using the OpenAPI 3 specification. 
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
 * CreateRepo
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-09-15T14:10:11.850684Z[GMT]")
public class CreateRepo {
  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("private")
  private Boolean _private = false;

  @SerializedName("auto_init")
  private Boolean autoInit = false;

  @SerializedName("gitignores")
  private String gitignores = null;

  /**
   * Desired LICENSE template to apply. Use the name of the template.
   */
  @JsonAdapter(LicenseEnum.Adapter.class)
  public enum LicenseEnum {
    APACHE_LICENSE_2_0("Apache License 2.0"),
    MIT_LICENSE("MIT License"),
    ABSTYLES_LICENSE("Abstyles License"),
    ACADEMIC_FREE_LICENSE_V1_1("Academic Free License v1.1"),
    ACADEMIC_FREE_LICENSE_V1_2("Academic Free License v1.2"),
    ACADEMIC_FREE_LICENSE_V2_0("Academic Free License v2.0"),
    ACADEMIC_FREE_LICENSE_V2_1("Academic Free License v2.1"),
    ACADEMIC_FREE_LICENSE_V3_0("Academic Free License v3.0"),
    AFFERO_GENERAL_PUBLIC_LICENSE_V1_0("Affero General Public License v1.0"),
    APACHE_LICENSE_1_0("Apache License 1.0"),
    APACHE_LICENSE_1_1("Apache License 1.1"),
    ARTISTIC_LICENSE_1_0("Artistic License 1.0"),
    ARTISTIC_LICENSE_2_0("Artistic License 2.0"),
    BSD_2_CLAUSE_LICENSE("BSD 2-clause License"),
    BSD_3_CLAUSE_LICENSE("BSD 3-clause License"),
    BSD_4_CLAUSE_LICENSE("BSD 4-clause License"),
    CREATIVE_COMMONS_CC0_1_0_UNIVERSAL("Creative Commons CC0 1.0 Universal"),
    ECLIPSE_PUBLIC_LICENSE_1_0("Eclipse Public License 1.0"),
    EDUCATIONAL_COMMUNITY_LICENSE_V1_0("Educational Community License v1.0"),
    EDUCATIONAL_COMMUNITY_LICENSE_V2_0("Educational Community License v2.0"),
    GNU_AFFERO_GENERAL_PUBLIC_LICENSE_V3_0("GNU Affero General Public License v3.0"),
    GNU_FREE_DOCUMENTATION_LICENSE_V1_1("GNU Free Documentation License v1.1"),
    GNU_FREE_DOCUMENTATION_LICENSE_V1_2("GNU Free Documentation License v1.2"),
    GNU_FREE_DOCUMENTATION_LICENSE_V1_3("GNU Free Documentation License v1.3"),
    GNU_GENERAL_PUBLIC_LICENSE_V1_0("GNU General Public License v1.0"),
    GNU_GENERAL_PUBLIC_LICENSE_V2_0("GNU General Public License v2.0"),
    GNU_GENERAL_PUBLIC_LICENSE_V3_0("GNU General Public License v3.0"),
    GNU_LESSER_GENERAL_PUBLIC_LICENSE_V2_1("GNU Lesser General Public License v2.1"),
    GNU_LESSER_GENERAL_PUBLIC_LICENSE_V3_0("GNU Lesser General Public License v3.0"),
    GNU_LIBRARY_GENERAL_PUBLIC_LICENSE_V2_0("GNU Library General Public License v2.0"),
    ISC_LICENSE("ISC license"),
    MOZILLA_PUBLIC_LICENSE_1_0("Mozilla Public License 1.0"),
    MOZILLA_PUBLIC_LICENSE_1_1("Mozilla Public License 1.1"),
    MOZILLA_PUBLIC_LICENSE_2_03("Mozilla Public License 2.03");

    private String value;

    LicenseEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static LicenseEnum fromValue(String input) {
      for (LicenseEnum b : LicenseEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<LicenseEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LicenseEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public LicenseEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return LicenseEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("license")
  private LicenseEnum license = null;

  @SerializedName("readme")
  private String readme = "Default";

  public CreateRepo name(String name) {
    this.name = name;
    return this;
  }

   /**
   * name of the repository
   * @return name
  **/
  @Schema(example = "repo-name", required = true, description = "name of the repository")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreateRepo description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A short description of the repository
   * @return description
  **/
  @Schema(description = "A short description of the repository")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CreateRepo _private(Boolean _private) {
    this._private = _private;
    return this;
  }

   /**
   * Either true to create a private repository, or false to create a public one.
   * @return _private
  **/
  @Schema(description = "Either true to create a private repository, or false to create a public one.")
  public Boolean isPrivate() {
    return _private;
  }

  public void setPrivate(Boolean _private) {
    this._private = _private;
  }

  public CreateRepo autoInit(Boolean autoInit) {
    this.autoInit = autoInit;
    return this;
  }

   /**
   * Pass true to create an initial commit with README, .gitignore and LICENSE.
   * @return autoInit
  **/
  @Schema(description = "Pass true to create an initial commit with README, .gitignore and LICENSE.")
  public Boolean isAutoInit() {
    return autoInit;
  }

  public void setAutoInit(Boolean autoInit) {
    this.autoInit = autoInit;
  }

  public CreateRepo gitignores(String gitignores) {
    this.gitignores = gitignores;
    return this;
  }

   /**
   * Desired language .gitignore templates to apply. Use the name of the templates.
   * @return gitignores
  **/
  @Schema(example = "Go, Sublime Text", description = "Desired language .gitignore templates to apply. Use the name of the templates.")
  public String getGitignores() {
    return gitignores;
  }

  public void setGitignores(String gitignores) {
    this.gitignores = gitignores;
  }

  public CreateRepo license(LicenseEnum license) {
    this.license = license;
    return this;
  }

   /**
   * Desired LICENSE template to apply. Use the name of the template.
   * @return license
  **/
  @Schema(example = "MIT License", description = "Desired LICENSE template to apply. Use the name of the template.")
  public LicenseEnum getLicense() {
    return license;
  }

  public void setLicense(LicenseEnum license) {
    this.license = license;
  }

  public CreateRepo readme(String readme) {
    this.readme = readme;
    return this;
  }

   /**
   * Desired README template to apply. Use the name of the template.
   * @return readme
  **/
  @Schema(description = "Desired README template to apply. Use the name of the template.")
  public String getReadme() {
    return readme;
  }

  public void setReadme(String readme) {
    this.readme = readme;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateRepo createRepo = (CreateRepo) o;
    return Objects.equals(this.name, createRepo.name) &&
        Objects.equals(this.description, createRepo.description) &&
        Objects.equals(this._private, createRepo._private) &&
        Objects.equals(this.autoInit, createRepo.autoInit) &&
        Objects.equals(this.gitignores, createRepo.gitignores) &&
        Objects.equals(this.license, createRepo.license) &&
        Objects.equals(this.readme, createRepo.readme);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, _private, autoInit, gitignores, license, readme);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateRepo {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    _private: ").append(toIndentedString(_private)).append("\n");
    sb.append("    autoInit: ").append(toIndentedString(autoInit)).append("\n");
    sb.append("    gitignores: ").append(toIndentedString(gitignores)).append("\n");
    sb.append("    license: ").append(toIndentedString(license)).append("\n");
    sb.append("    readme: ").append(toIndentedString(readme)).append("\n");
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
