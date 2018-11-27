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
 * This API is a status confirmation update to inform the tracker about the updated status of a given payment.
 */
@ApiModel(description = "This API is a status confirmation update to inform the tracker about the updated status of a given payment.")
public class UpdatePaymentStatusRequest {
  @SerializedName("from")
  private String from = null;

  @SerializedName("business_service")
  private String businessService = null;

  @SerializedName("transaction_identification")
  private String transactionIdentification = null;

  @SerializedName("instruction_identification")
  private String instructionIdentification = null;

  @SerializedName("payment_status")
  private PaymentStatusType1Choice paymentStatus = null;

  public UpdatePaymentStatusRequest from(String from) {
    this.from = from;
    return this;
  }

   /**
   * The sending MessagingEndpoint that has created this Business Message for the receiving MessagingEndpoint that will process this Business Message.[CR][LF][CR][LF]Note[TAB]the sending MessagingEndpoint might be different from the sending address potentially contained in the transport header (as defined in the transport layer).
   * @return from
  **/
  @ApiModelProperty(required = true, value = "The sending MessagingEndpoint that has created this Business Message for the receiving MessagingEndpoint that will process this Business Message.[CR][LF][CR][LF]Note[TAB]the sending MessagingEndpoint might be different from the sending address potentially contained in the transport header (as defined in the transport layer).")
  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public UpdatePaymentStatusRequest businessService(String businessService) {
    this.businessService = businessService;
    return this;
  }

   /**
   * Specifies the business service agreed between the two MessagingEndpoints under which rules this Business Message is exchanged.[CR][LF] To be used when there is a choice of processing services or processing service levels.[CR][LF]Example: 001
   * @return businessService
  **/
  @ApiModelProperty(required = true, value = "Specifies the business service agreed between the two MessagingEndpoints under which rules this Business Message is exchanged.[CR][LF] To be used when there is a choice of processing services or processing service levels.[CR][LF]Example: 001")
  public String getBusinessService() {
    return businessService;
  }

  public void setBusinessService(String businessService) {
    this.businessService = businessService;
  }

  public UpdatePaymentStatusRequest transactionIdentification(String transactionIdentification) {
    this.transactionIdentification = transactionIdentification;
    return this;
  }

   /**
   * Contains the unique end to end transaction reference (UETR). [CR][LF]Format is lowercase separated by hyphens.
   * @return transactionIdentification
  **/
  @ApiModelProperty(required = true, value = "Contains the unique end to end transaction reference (UETR). [CR][LF]Format is lowercase separated by hyphens.")
  public String getTransactionIdentification() {
    return transactionIdentification;
  }

  public void setTransactionIdentification(String transactionIdentification) {
    this.transactionIdentification = transactionIdentification;
  }

  public UpdatePaymentStatusRequest instructionIdentification(String instructionIdentification) {
    this.instructionIdentification = instructionIdentification;
    return this;
  }

   /**
   * Unique identification, as assigned by an instructing party for an instructed party, to unambiguously identify the instruction.[LF][LF]Usage: The instruction identification is a point to point reference that can be used between the instructing party and the instructed party to refer to the individual instruction. It can be included in several messages related to the instruction.
   * @return instructionIdentification
  **/
  @ApiModelProperty(required = true, value = "Unique identification, as assigned by an instructing party for an instructed party, to unambiguously identify the instruction.[LF][LF]Usage: The instruction identification is a point to point reference that can be used between the instructing party and the instructed party to refer to the individual instruction. It can be included in several messages related to the instruction.")
  public String getInstructionIdentification() {
    return instructionIdentification;
  }

  public void setInstructionIdentification(String instructionIdentification) {
    this.instructionIdentification = instructionIdentification;
  }

  public UpdatePaymentStatusRequest paymentStatus(PaymentStatusType1Choice paymentStatus) {
    this.paymentStatus = paymentStatus;
    return this;
  }

   /**
   * Get paymentStatus
   * @return paymentStatus
  **/
  @ApiModelProperty(required = true, value = "")
  public PaymentStatusType1Choice getPaymentStatus() {
    return paymentStatus;
  }

  public void setPaymentStatus(PaymentStatusType1Choice paymentStatus) {
    this.paymentStatus = paymentStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdatePaymentStatusRequest updatePaymentStatusRequest = (UpdatePaymentStatusRequest) o;
    return Objects.equals(this.from, updatePaymentStatusRequest.from) &&
        Objects.equals(this.businessService, updatePaymentStatusRequest.businessService) &&
        Objects.equals(this.transactionIdentification, updatePaymentStatusRequest.transactionIdentification) &&
        Objects.equals(this.instructionIdentification, updatePaymentStatusRequest.instructionIdentification) &&
        Objects.equals(this.paymentStatus, updatePaymentStatusRequest.paymentStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, businessService, transactionIdentification, instructionIdentification, paymentStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePaymentStatusRequest {\n");
    
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    businessService: ").append(toIndentedString(businessService)).append("\n");
    sb.append("    transactionIdentification: ").append(toIndentedString(transactionIdentification)).append("\n");
    sb.append("    instructionIdentification: ").append(toIndentedString(instructionIdentification)).append("\n");
    sb.append("    paymentStatus: ").append(toIndentedString(paymentStatus)).append("\n");
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

