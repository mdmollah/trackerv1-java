/*
 * Tracker API V1
 * Move your app forward with the gpi API
 *
 */


package com.swift.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * This API is the response to a payment query to get detailed information regarding a given payment transaction.[CR][LF]Examples of use cases are:[CR][LF]•[TAB]Debtor status check - debtor&#39;s agent or debtor wants to see the status[CR][LF]•[TAB]Creditor status check - creditor&#39;s agent or creditor wants to see the status[CR][LF]
 */
@ApiModel(description = "This API is the response to a payment query to get detailed information regarding a given payment transaction.[CR][LF]Examples of use cases are:[CR][LF]•[TAB]Debtor status check - debtor's agent or debtor wants to see the status[CR][LF]•[TAB]Creditor status check - creditor's agent or creditor wants to see the status[CR][LF]")
public class GetPaymentTransactionDetailsResponse {
  @SerializedName("transaction_identification")
  private String transactionIdentification = null;

  @SerializedName("transaction_status")
  private PaymentStatus3 transactionStatus = null;

  @SerializedName("initiation_time")
  private String initiationTime = null;

  @SerializedName("completion_time")
  private String completionTime = null;

  @SerializedName("last_update_time")
  private String lastUpdateTime = null;

  @SerializedName("payment_event")
  private List<PaymentEvent1> paymentEvent = new ArrayList<PaymentEvent1>();

  public GetPaymentTransactionDetailsResponse transactionIdentification(String transactionIdentification) {
    this.transactionIdentification = transactionIdentification;
    return this;
  }

   /**
   * Contains the unique end to end transaction reference (UETR) of a payment.
   * @return transactionIdentification
  **/
  @ApiModelProperty(required = true, value = "Contains the unique end to end transaction reference (UETR) of a payment.")
  public String getTransactionIdentification() {
    return transactionIdentification;
  }

  public void setTransactionIdentification(String transactionIdentification) {
    this.transactionIdentification = transactionIdentification;
  }

  public GetPaymentTransactionDetailsResponse transactionStatus(PaymentStatus3 transactionStatus) {
    this.transactionStatus = transactionStatus;
    return this;
  }

   /**
   * Get transactionStatus
   * @return transactionStatus
  **/
  @ApiModelProperty(required = true, value = "")
  public PaymentStatus3 getTransactionStatus() {
    return transactionStatus;
  }

  public void setTransactionStatus(PaymentStatus3 transactionStatus) {
    this.transactionStatus = transactionStatus;
  }

  public GetPaymentTransactionDetailsResponse initiationTime(String initiationTime) {
    this.initiationTime = initiationTime;
    return this;
  }

   /**
   * Date and Time at which the message enters the GPII system.
   * @return initiationTime
  **/
  @ApiModelProperty(required = true, value = "Date and Time at which the message enters the GPII system.")
  public String getInitiationTime() {
    return initiationTime;
  }

  public void setInitiationTime(String initiationTime) {
    this.initiationTime = initiationTime;
  }

  public GetPaymentTransactionDetailsResponse completionTime(String completionTime) {
    this.completionTime = completionTime;
    return this;
  }

   /**
   * Time at which the Instructed Bank reports that the transaction has been completed. [CR][LF]Date and time based on the creation date of the status confirmation containing a final status ACSC
   * @return completionTime
  **/
  @ApiModelProperty(value = "Time at which the Instructed Bank reports that the transaction has been completed. [CR][LF]Date and time based on the creation date of the status confirmation containing a final status ACSC")
  public String getCompletionTime() {
    return completionTime;
  }

  public void setCompletionTime(String completionTime) {
    this.completionTime = completionTime;
  }

  public GetPaymentTransactionDetailsResponse lastUpdateTime(String lastUpdateTime) {
    this.lastUpdateTime = lastUpdateTime;
    return this;
  }

   /**
   * Last date and time at which the status of this transaction was updated.
   * @return lastUpdateTime
  **/
  @ApiModelProperty(required = true, value = "Last date and time at which the status of this transaction was updated.")
  public String getLastUpdateTime() {
    return lastUpdateTime;
  }

  public void setLastUpdateTime(String lastUpdateTime) {
    this.lastUpdateTime = lastUpdateTime;
  }

  public GetPaymentTransactionDetailsResponse paymentEvent(List<PaymentEvent1> paymentEvent) {
    this.paymentEvent = paymentEvent;
    return this;
  }

  public GetPaymentTransactionDetailsResponse addPaymentEventItem(PaymentEvent1 paymentEventItem) {
    this.paymentEvent.add(paymentEventItem);
    return this;
  }

   /**
   * This groups the information of an event, i.e., of a payment message or status confirmation update. It is repeated as many times as there are events to be returned.
   * @return paymentEvent
  **/
  @ApiModelProperty(required = true, value = "This groups the information of an event, i.e., of a payment message or status confirmation update. It is repeated as many times as there are events to be returned.")
  public List<PaymentEvent1> getPaymentEvent() {
    return paymentEvent;
  }

  public void setPaymentEvent(List<PaymentEvent1> paymentEvent) {
    this.paymentEvent = paymentEvent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetPaymentTransactionDetailsResponse getPaymentTransactionDetailsResponse = (GetPaymentTransactionDetailsResponse) o;
    return Objects.equals(this.transactionIdentification, getPaymentTransactionDetailsResponse.transactionIdentification) &&
        Objects.equals(this.transactionStatus, getPaymentTransactionDetailsResponse.transactionStatus) &&
        Objects.equals(this.initiationTime, getPaymentTransactionDetailsResponse.initiationTime) &&
        Objects.equals(this.completionTime, getPaymentTransactionDetailsResponse.completionTime) &&
        Objects.equals(this.lastUpdateTime, getPaymentTransactionDetailsResponse.lastUpdateTime) &&
        Objects.equals(this.paymentEvent, getPaymentTransactionDetailsResponse.paymentEvent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionIdentification, transactionStatus, initiationTime, completionTime, lastUpdateTime, paymentEvent);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPaymentTransactionDetailsResponse {\n");
    
    sb.append("    transactionIdentification: ").append(toIndentedString(transactionIdentification)).append("\n");
    sb.append("    transactionStatus: ").append(toIndentedString(transactionStatus)).append("\n");
    sb.append("    initiationTime: ").append(toIndentedString(initiationTime)).append("\n");
    sb.append("    completionTime: ").append(toIndentedString(completionTime)).append("\n");
    sb.append("    lastUpdateTime: ").append(toIndentedString(lastUpdateTime)).append("\n");
    sb.append("    paymentEvent: ").append(toIndentedString(paymentEvent)).append("\n");
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

