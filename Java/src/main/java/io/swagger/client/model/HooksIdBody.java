/*
 * DagsHub API
 * The api docs are made with SwaggerUI using the OpenAPI 3 specification. 
 *
 * OpenAPI spec version: 0.1.0
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
import io.swagger.client.model.WebhookConfig;
import io.swagger.client.model.WebhookEvents;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * HooksIdBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-09-18T14:58:29.810868Z[GMT]")
public class HooksIdBody {
  @SerializedName("config")
  private WebhookConfig config = null;

  @SerializedName("events")
  private WebhookEvents events = null;

  @SerializedName("active")
  private Boolean active = null;

  public HooksIdBody config(WebhookConfig config) {
    this.config = config;
    return this;
  }

   /**
   * Get config
   * @return config
  **/
  @Schema(description = "")
  public WebhookConfig getConfig() {
    return config;
  }

  public void setConfig(WebhookConfig config) {
    this.config = config;
  }

  public HooksIdBody events(WebhookEvents events) {
    this.events = events;
    return this;
  }

   /**
   * Get events
   * @return events
  **/
  @Schema(description = "")
  public WebhookEvents getEvents() {
    return events;
  }

  public void setEvents(WebhookEvents events) {
    this.events = events;
  }

  public HooksIdBody active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Weather the hook is actually triggered on pushes or not. Ignore this field to leave it unchanged.
   * @return active
  **/
  @Schema(description = "Weather the hook is actually triggered on pushes or not. Ignore this field to leave it unchanged.")
  public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HooksIdBody hooksIdBody = (HooksIdBody) o;
    return Objects.equals(this.config, hooksIdBody.config) &&
        Objects.equals(this.events, hooksIdBody.events) &&
        Objects.equals(this.active, hooksIdBody.active);
  }

  @Override
  public int hashCode() {
    return Objects.hash(config, events, active);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HooksIdBody {\n");
    
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
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
