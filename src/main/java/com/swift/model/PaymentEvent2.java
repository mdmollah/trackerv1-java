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
 * Contains elements identifying an event belonging to the transaction.
 */
@ApiModel(description = "Contains elements identifying an event belonging to the transaction.")
public class PaymentEvent2 {
  @SerializedName("from")
  private String from = null;

  @SerializedName("to")
  private String to = null;

  @SerializedName("transaction_status")
  private PaymentStatus3 transactionStatus = null;

  @SerializedName("forwarded_agent")
  private String forwardedAgent = null;

  @SerializedName("received")
  private Boolean received = null;

  public PaymentEvent2 from(String from) {
    this.from = from;
    return this;
  }

   /**
   * The sending MessagingEndpoint that has created this Business Message for the receiving MessagingEndpoint that will process this Business Message.[CR][LF][CR][LF]Note[TAB]the sending MessagingEndpoint might be different from the sending address potentially contained in the transport header (as defined in the transport layer).
   * @return from
  **/
  @ApiModelProperty(value = "The sending MessagingEndpoint that has created this Business Message for the receiving MessagingEndpoint that will process this Business Message.[CR][LF][CR][LF]Note[TAB]the sending MessagingEndpoint might be different from the sending address potentially contained in the transport header (as defined in the transport layer).")
  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public PaymentEvent2 to(String to) {
    this.to = to;
    return this;
  }

   /**
   * The MessagingEndpoint designated by the sending MessagingEndpoint to be the recipient who will ultimately process this Business Message.[CR][LF][CR][LF]Note the receiving MessagingEndpoint might be different from the receiving address potentially contained in the transport header (as defined in the transport layer).
   * @return to
  **/
  @ApiModelProperty(value = "The MessagingEndpoint designated by the sending MessagingEndpoint to be the recipient who will ultimately process this Business Message.[CR][LF][CR][LF]Note the receiving MessagingEndpoint might be different from the receiving address potentially contained in the transport header (as defined in the transport layer).")
  public String getTo() {
    return to;
  }

  public void setTo(String to) {
    this.to = to;
  }

  public PaymentEvent2 transactionStatus(PaymentStatus3 transactionStatus) {
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

  public PaymentEvent2 forwardedAgent(String forwardedAgent) {
    this.forwardedAgent = forwardedAgent;
    return this;
  }

   /**
   * Specifies the BIC of the entity to which the entity reporting the status has forwarded the payment transaction.
   * @return forwardedAgent
  **/
  @ApiModelProperty(value = "Specifies the BIC of the entity to which the entity reporting the status has forwarded the payment transaction.")
  public String getForwardedAgent() {
    return forwardedAgent;
  }

  public void setForwardedAgent(String forwardedAgent) {
    this.forwardedAgent = forwardedAgent;
  }

  public PaymentEvent2 received(Boolean received) {
    this.received = received;
    return this;
  }

   /**
   * Indicates whether a payment has been received or not.
   * @return received
  **/
  @ApiModelProperty(required = true, value = "Indicates whether a payment has been received or not.")
  public Boolean isReceived() {
    return received;
  }

  public void setReceived(Boolean received) {
    this.received = received;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentEvent2 paymentEvent2 = (PaymentEvent2) o;
    return Objects.equals(this.from, paymentEvent2.from) &&
        Objects.equals(this.to, paymentEvent2.to) &&
        Objects.equals(this.transactionStatus, paymentEvent2.transactionStatus) &&
        Objects.equals(this.forwardedAgent, paymentEvent2.forwardedAgent) &&
        Objects.equals(this.received, paymentEvent2.received);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, to, transactionStatus, forwardedAgent, received);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentEvent2 {\n");
    
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    transactionStatus: ").append(toIndentedString(transactionStatus)).append("\n");
    sb.append("    forwardedAgent: ").append(toIndentedString(forwardedAgent)).append("\n");
    sb.append("    received: ").append(toIndentedString(received)).append("\n");
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

