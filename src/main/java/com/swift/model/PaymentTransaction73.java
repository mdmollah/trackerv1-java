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
 * Contains details on the payment transaction.
 */
@ApiModel(description = "Contains details on the payment transaction.")
public class PaymentTransaction73 {
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

  public PaymentTransaction73 transactionIdentification(String transactionIdentification) {
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

  public PaymentTransaction73 transactionStatus(PaymentStatus3 transactionStatus) {
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

  public PaymentTransaction73 initiationTime(String initiationTime) {
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

  public PaymentTransaction73 completionTime(String completionTime) {
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

  public PaymentTransaction73 lastUpdateTime(String lastUpdateTime) {
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

  public PaymentTransaction73 paymentEvent(List<PaymentEvent1> paymentEvent) {
    this.paymentEvent = paymentEvent;
    return this;
  }

  public PaymentTransaction73 addPaymentEventItem(PaymentEvent1 paymentEventItem) {
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
    PaymentTransaction73 paymentTransaction73 = (PaymentTransaction73) o;
    return Objects.equals(this.transactionIdentification, paymentTransaction73.transactionIdentification) &&
        Objects.equals(this.transactionStatus, paymentTransaction73.transactionStatus) &&
        Objects.equals(this.initiationTime, paymentTransaction73.initiationTime) &&
        Objects.equals(this.completionTime, paymentTransaction73.completionTime) &&
        Objects.equals(this.lastUpdateTime, paymentTransaction73.lastUpdateTime) &&
        Objects.equals(this.paymentEvent, paymentTransaction73.paymentEvent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionIdentification, transactionStatus, initiationTime, completionTime, lastUpdateTime, paymentEvent);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentTransaction73 {\n");
    
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

