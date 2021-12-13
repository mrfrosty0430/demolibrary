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
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * RefundRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-12-10T05:33:55.380Z[GMT]")
public class RefundRequest {
  @SerializedName("paymentIntent")
  private String paymentIntent = null;

  @SerializedName("amount")
  private BigDecimal amount = null;

  @SerializedName("metadata")
  private Map<String, Object> metadata = null;

  @SerializedName("reason")
  private String reason = null;

  public RefundRequest paymentIntent(String paymentIntent) {
    this.paymentIntent = paymentIntent;
    return this;
  }

   /**
   * Get paymentIntent
   * @return paymentIntent
  **/
  @Schema(description = "")
  public String getPaymentIntent() {
    return paymentIntent;
  }

  public void setPaymentIntent(String paymentIntent) {
    this.paymentIntent = paymentIntent;
  }

  public RefundRequest amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @Schema(description = "")
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public RefundRequest metadata(Map<String, Object> metadata) {
    this.metadata = metadata;
    return this;
  }

  public RefundRequest putMetadataItem(String key, Object metadataItem) {
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

  public RefundRequest reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * Get reason
   * @return reason
  **/
  @Schema(description = "")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RefundRequest refundRequest = (RefundRequest) o;
    return Objects.equals(this.paymentIntent, refundRequest.paymentIntent) &&
        Objects.equals(this.amount, refundRequest.amount) &&
        Objects.equals(this.metadata, refundRequest.metadata) &&
        Objects.equals(this.reason, refundRequest.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentIntent, amount, metadata, reason);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RefundRequest {\n");
    
    sb.append("    paymentIntent: ").append(toIndentedString(paymentIntent)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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
