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
 * WebhookEndpointUpdateRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-12-10T05:33:55.380Z[GMT]")
public class WebhookEndpointUpdateRequest {
  @SerializedName("events")
  private List<String> events = null;

  @SerializedName("url")
  private String url = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("metadata")
  private Map<String, Object> metadata = null;

  @SerializedName("disabled")
  private Boolean disabled = null;

  public WebhookEndpointUpdateRequest events(List<String> events) {
    this.events = events;
    return this;
  }

  public WebhookEndpointUpdateRequest addEventsItem(String eventsItem) {
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

  public WebhookEndpointUpdateRequest url(String url) {
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

  public WebhookEndpointUpdateRequest description(String description) {
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

  public WebhookEndpointUpdateRequest metadata(Map<String, Object> metadata) {
    this.metadata = metadata;
    return this;
  }

  public WebhookEndpointUpdateRequest putMetadataItem(String key, Object metadataItem) {
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

  public WebhookEndpointUpdateRequest disabled(Boolean disabled) {
    this.disabled = disabled;
    return this;
  }

   /**
   * Get disabled
   * @return disabled
  **/
  @Schema(description = "")
  public Boolean isDisabled() {
    return disabled;
  }

  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookEndpointUpdateRequest webhookEndpointUpdateRequest = (WebhookEndpointUpdateRequest) o;
    return Objects.equals(this.events, webhookEndpointUpdateRequest.events) &&
        Objects.equals(this.url, webhookEndpointUpdateRequest.url) &&
        Objects.equals(this.description, webhookEndpointUpdateRequest.description) &&
        Objects.equals(this.metadata, webhookEndpointUpdateRequest.metadata) &&
        Objects.equals(this.disabled, webhookEndpointUpdateRequest.disabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(events, url, description, metadata, disabled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookEndpointUpdateRequest {\n");
    
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
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
