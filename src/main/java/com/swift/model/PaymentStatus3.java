/*
 * Tracker API V1
 * Move your app forward with the gpi API
 *
 */

package com.swift.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Indicates the payment transaction status and optionally the reason for that status.
 */
@ApiModel(description = "Indicates the payment transaction status and optionally the reason for that status.")
public class PaymentStatus3 {
  @SerializedName("status")
  private TransactionIndividualStatus4Code status = null;

  @SerializedName("reason")
  private PaymentReason1Code reason = null;

  public PaymentStatus3 status(TransactionIndividualStatus4Code status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(required = true, value = "")
  public TransactionIndividualStatus4Code getStatus() {
    return status;
  }

  public void setStatus(TransactionIndividualStatus4Code status) {
    this.status = status;
  }

  public PaymentStatus3 reason(PaymentReason1Code reason) {
    this.reason = reason;
    return this;
  }

   /**
   * Get reason
   * @return reason
  **/
  @ApiModelProperty(value = "")
  public PaymentReason1Code getReason() {
    return reason;
  }

  public void setReason(PaymentReason1Code reason) {
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
    PaymentStatus3 paymentStatus3 = (PaymentStatus3) o;
    return Objects.equals(this.status, paymentStatus3.status) &&
        Objects.equals(this.reason, paymentStatus3.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, reason);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentStatus3 {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

