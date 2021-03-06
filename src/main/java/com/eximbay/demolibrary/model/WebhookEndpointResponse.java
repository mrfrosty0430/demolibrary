/*
 * Cloud Payment API
 * Eximbay Cloud Payment API
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.eximbay.demolibrary.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * WebhookEndpointResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-12-10T05:33:55.380Z[GMT]")
public class WebhookEndpointResponse {
  @SerializedName("id")
  private String id = null;

  @SerializedName("application")
  private String application = null;

  @SerializedName("created")
  private String created = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("events")
  private List<String> events = null;

  @SerializedName("mode")
  private Boolean mode = null;

  @SerializedName("metadata")
  private Map<String, Object> metadata = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("url")
  private String url = null;

  @SerializedName("secret")
  private String secret = null;

  public WebhookEndpointResponse id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public WebhookEndpointResponse application(String application) {
    this.application = application;
    return this;
  }

   /**
   * Get application
   * @return application
  **/
  @Schema(description = "")
  public String getApplication() {
    return application;
  }

  public void setApplication(String application) {
    this.application = application;
  }

  public WebhookEndpointResponse created(String created) {
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @Schema(description = "")
  public String getCreated() {
    return created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  public WebhookEndpointResponse description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public WebhookEndpointResponse events(List<String> events) {
    this.events = events;
    return this;
  }

  public WebhookEndpointResponse addEventsItem(String eventsItem) {
    if (this.events == null) {
      this.events = new ArrayList<String>();
    }
    this.events.add(eventsItem);
    return this;
  }

   /**
   * Get events
   * @return events
  **/
  @Schema(description = "")
  public List<String> getEvents() {
    return events;
  }

  public void setEvents(List<String> events) {
    this.events = events;
  }

  public WebhookEndpointResponse mode(Boolean mode) {
    this.mode = mode;
    return this;
  }

   /**
   * Get mode
   * @return mode
  **/
  @Schema(description = "")
  public Boolean isMode() {
    return mode;
  }

  public void setMode(Boolean mode) {
    this.mode = mode;
  }

  public WebhookEndpointResponse metadata(Map<String, Object> metadata) {
    this.metadata = metadata;
    return this;
  }

  public WebhookEndpointResponse putMetadataItem(String key, Object metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<String, Object>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @Schema(description = "")
  public Map<String, Object> getMetadata() {
    return metadata;
  }

  public void setMetadata(Map<String, Object> metadata) {
    this.metadata = metadata;
  }

  public WebhookEndpointResponse status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public WebhookEndpointResponse url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @Schema(description = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public WebhookEndpointResponse secret(String secret) {
    this.secret = secret;
    return this;
  }

   /**
   * Get secret
   * @return secret
  **/
  @Schema(description = "")
  public String getSecret() {
    return secret;
  }

  public void setSecret(String secret) {
    this.secret = secret;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookEndpointResponse webhookEndpointResponse = (WebhookEndpointResponse) o;
    return Objects.equals(this.id, webhookEndpointResponse.id) &&
        Objects.equals(this.application, webhookEndpointResponse.application) &&
        Objects.equals(this.created, webhookEndpointResponse.created) &&
        Objects.equals(this.description, webhookEndpointResponse.description) &&
        Objects.equals(this.events, webhookEndpointResponse.events) &&
        Objects.equals(this.mode, webhookEndpointResponse.mode) &&
        Objects.equals(this.metadata, webhookEndpointResponse.metadata) &&
        Objects.equals(this.status, webhookEndpointResponse.status) &&
        Objects.equals(this.url, webhookEndpointResponse.url) &&
        Objects.equals(this.secret, webhookEndpointResponse.secret);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, application, created, description, events, mode, metadata, status, url, secret);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookEndpointResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
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
