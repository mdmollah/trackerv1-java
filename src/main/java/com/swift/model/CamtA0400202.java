/*
 * Tracker API V1
 * Move your app forward with the gpi API
 *
 * OpenAPI spec version: 1.2.37
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.swift.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.swift.model.GetChangedPaymentTransactionsResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Generated by SWIFT Standards 2017-03-22 00:13:52
 */
@ApiModel(description = "Generated by SWIFT Standards 2017-03-22 00:13:52")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-26T11:46:38.130-05:00")
public class CamtA0400202 {
  @SerializedName("get_changed_payment_transactions_response")
  private GetChangedPaymentTransactionsResponse getChangedPaymentTransactionsResponse = null;

  public CamtA0400202 getChangedPaymentTransactionsResponse(GetChangedPaymentTransactionsResponse getChangedPaymentTransactionsResponse) {
    this.getChangedPaymentTransactionsResponse = getChangedPaymentTransactionsResponse;
    return this;
  }

   /**
   * Get getChangedPaymentTransactionsResponse
   * @return getChangedPaymentTransactionsResponse
  **/
  @ApiModelProperty(value = "")
  public GetChangedPaymentTransactionsResponse getGetChangedPaymentTransactionsResponse() {
    return getChangedPaymentTransactionsResponse;
  }

  public void setGetChangedPaymentTransactionsResponse(GetChangedPaymentTransactionsResponse getChangedPaymentTransactionsResponse) {
    this.getChangedPaymentTransactionsResponse = getChangedPaymentTransactionsResponse;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CamtA0400202 camtA0400202 = (CamtA0400202) o;
    return Objects.equals(this.getChangedPaymentTransactionsResponse, camtA0400202.getChangedPaymentTransactionsResponse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(getChangedPaymentTransactionsResponse);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CamtA0400202 {\n");
    
    sb.append("    getChangedPaymentTransactionsResponse: ").append(toIndentedString(getChangedPaymentTransactionsResponse)).append("\n");
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
