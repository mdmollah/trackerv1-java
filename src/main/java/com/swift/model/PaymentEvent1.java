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
 * Contains information coming from the related MT 199 or MT 103, or the StatusConfirmationUpdate.
 */
@ApiModel(description = "Contains information coming from the related MT 199 or MT 103, or the StatusConfirmationUpdate.")
public class PaymentEvent1 {
  @SerializedName("network_reference")
  private String networkReference = null;

  @SerializedName("message_name_identification")
  private String messageNameIdentification = null;

  @SerializedName("business_service")
  private String businessService = null;

  @SerializedName("valid")
  private Boolean valid = null;

  @SerializedName("invalidity_reason")
  private String invalidityReason = null;

  @SerializedName("invalidity_description")
  private String invalidityDescription = null;

  @SerializedName("sender_reference")
  private String senderReference = null;

  @SerializedName("instruction_identification")
  private String instructionIdentification = null;

  @SerializedName("transaction_status")
  private PaymentStatus3 transactionStatus = null;

  @SerializedName("forwarded_agent")
  private String forwardedAgent = null;

  @SerializedName("funds_available")
  private String fundsAvailable = null;

  @SerializedName("from")
  private String from = null;

  @SerializedName("to")
  private String to = null;

  @SerializedName("originator")
  private String originator = null;

  @SerializedName("creditor_agent")
  private String creditorAgent = null;

  @SerializedName("previous_instructing_agent")
  private String previousInstructingAgent = null;

  @SerializedName("sender_acknowledgement_receipt")
  private String senderAcknowledgementReceipt = null;

  @SerializedName("received_date")
  private String receivedDate = null;

  @SerializedName("instructed_amount")
  private ActiveOrHistoricCurrencyAndAmount instructedAmount = null;

  @SerializedName("confirmed_amount")
  private ActiveOrHistoricCurrencyAndAmount confirmedAmount = null;

  @SerializedName("interbank_settlement_amount")
  private ActiveCurrencyAndAmount interbankSettlementAmount = null;

  @SerializedName("interbank_settlement_date")
  private String interbankSettlementDate = null;

  @SerializedName("charge_bearer")
  private ChargeBearerType3Code chargeBearer = null;

  @SerializedName("charge_amount")
  private List<ActiveOrHistoricCurrencyAndAmount> chargeAmount = null;

  @SerializedName("foreign_exchange_details")
  private ForeignExchangeTerms32 foreignExchangeDetails = null;

  @SerializedName("update_payment")
  private String updatePayment = null;

  @SerializedName("duplicate_message_reference")
  private String duplicateMessageReference = null;

  @SerializedName("copied_business_service")
  private String copiedBusinessService = null;

  @SerializedName("last_update_time")
  private String lastUpdateTime = null;

  public PaymentEvent1 networkReference(String networkReference) {
    this.networkReference = networkReference;
    return this;
  }

   /**
   * Reference assigned by the network when sending the payment.
   * @return networkReference
  **/
  @ApiModelProperty(required = true, value = "Reference assigned by the network when sending the payment.")
  public String getNetworkReference() {
    return networkReference;
  }

  public void setNetworkReference(String networkReference) {
    this.networkReference = networkReference;
  }

  public PaymentEvent1 messageNameIdentification(String messageNameIdentification) {
    this.messageNameIdentification = messageNameIdentification;
    return this;
  }

   /**
   * Specifies the original message name identifier to which the message refers.
   * @return messageNameIdentification
  **/
  @ApiModelProperty(required = true, value = "Specifies the original message name identifier to which the message refers.")
  public String getMessageNameIdentification() {
    return messageNameIdentification;
  }

  public void setMessageNameIdentification(String messageNameIdentification) {
    this.messageNameIdentification = messageNameIdentification;
  }

  public PaymentEvent1 businessService(String businessService) {
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

  public PaymentEvent1 valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

   /**
   * Indicates if a payment is consistent (YES) or not (NO).
   * @return valid
  **/
  @ApiModelProperty(required = true, value = "Indicates if a payment is consistent (YES) or not (NO).")
  public Boolean isValid() {
    return valid;
  }

  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  public PaymentEvent1 invalidityReason(String invalidityReason) {
    this.invalidityReason = invalidityReason;
    return this;
  }

   /**
   * Contains the additional information in case the event is not a valid component of a payment transaction.
   * @return invalidityReason
  **/
  @ApiModelProperty(value = "Contains the additional information in case the event is not a valid component of a payment transaction.")
  public String getInvalidityReason() {
    return invalidityReason;
  }

  public void setInvalidityReason(String invalidityReason) {
    this.invalidityReason = invalidityReason;
  }

  public PaymentEvent1 invalidityDescription(String invalidityDescription) {
    this.invalidityDescription = invalidityDescription;
    return this;
  }

   /**
   * Contains a textual description as to why the event is not a valid component of a payments transaction.
   * @return invalidityDescription
  **/
  @ApiModelProperty(value = "Contains a textual description as to why the event is not a valid component of a payments transaction.")
  public String getInvalidityDescription() {
    return invalidityDescription;
  }

  public void setInvalidityDescription(String invalidityDescription) {
    this.invalidityDescription = invalidityDescription;
  }

  public PaymentEvent1 senderReference(String senderReference) {
    this.senderReference = senderReference;
    return this;
  }

   /**
   * Identification assigned by the sender of the Message.[CR][LF]For MT format this is the MUR.
   * @return senderReference
  **/
  @ApiModelProperty(value = "Identification assigned by the sender of the Message.[CR][LF]For MT format this is the MUR.")
  public String getSenderReference() {
    return senderReference;
  }

  public void setSenderReference(String senderReference) {
    this.senderReference = senderReference;
  }

  public PaymentEvent1 instructionIdentification(String instructionIdentification) {
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

  public PaymentEvent1 transactionStatus(PaymentStatus3 transactionStatus) {
    this.transactionStatus = transactionStatus;
    return this;
  }

   /**
   * Get transactionStatus
   * @return transactionStatus
  **/
  @ApiModelProperty(value = "")
  public PaymentStatus3 getTransactionStatus() {
    return transactionStatus;
  }

  public void setTransactionStatus(PaymentStatus3 transactionStatus) {
    this.transactionStatus = transactionStatus;
  }

  public PaymentEvent1 forwardedAgent(String forwardedAgent) {
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

  public PaymentEvent1 fundsAvailable(String fundsAvailable) {
    this.fundsAvailable = fundsAvailable;
    return this;
  }

   /**
   * Date and time at which the funds are available,  as reported in the ACSC status update.[CR][LF]Must only be used when TransactionStatus is \&quot;ACSC\&quot;.
   * @return fundsAvailable
  **/
  @ApiModelProperty(value = "Date and time at which the funds are available,  as reported in the ACSC status update.[CR][LF]Must only be used when TransactionStatus is \"ACSC\".")
  public String getFundsAvailable() {
    return fundsAvailable;
  }

  public void setFundsAvailable(String fundsAvailable) {
    this.fundsAvailable = fundsAvailable;
  }

  public PaymentEvent1 from(String from) {
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

  public PaymentEvent1 to(String to) {
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

  public PaymentEvent1 originator(String originator) {
    this.originator = originator;
    return this;
  }

   /**
   * Party that issues the status.
   * @return originator
  **/
  @ApiModelProperty(value = "Party that issues the status.")
  public String getOriginator() {
    return originator;
  }

  public void setOriginator(String originator) {
    this.originator = originator;
  }

  public PaymentEvent1 creditorAgent(String creditorAgent) {
    this.creditorAgent = creditorAgent;
    return this;
  }

   /**
   * Financial institution servicing an account for the creditor.
   * @return creditorAgent
  **/
  @ApiModelProperty(value = "Financial institution servicing an account for the creditor.")
  public String getCreditorAgent() {
    return creditorAgent;
  }

  public void setCreditorAgent(String creditorAgent) {
    this.creditorAgent = creditorAgent;
  }

  public PaymentEvent1 previousInstructingAgent(String previousInstructingAgent) {
    this.previousInstructingAgent = previousInstructingAgent;
    return this;
  }

   /**
   * Agent immediately prior to the instructing agent.
   * @return previousInstructingAgent
  **/
  @ApiModelProperty(value = "Agent immediately prior to the instructing agent.")
  public String getPreviousInstructingAgent() {
    return previousInstructingAgent;
  }

  public void setPreviousInstructingAgent(String previousInstructingAgent) {
    this.previousInstructingAgent = previousInstructingAgent;
  }

  public PaymentEvent1 senderAcknowledgementReceipt(String senderAcknowledgementReceipt) {
    this.senderAcknowledgementReceipt = senderAcknowledgementReceipt;
    return this;
  }

   /**
   * Date and time at which the sender acknowledged receipt of the message.
   * @return senderAcknowledgementReceipt
  **/
  @ApiModelProperty(required = true, value = "Date and time at which the sender acknowledged receipt of the message.")
  public String getSenderAcknowledgementReceipt() {
    return senderAcknowledgementReceipt;
  }

  public void setSenderAcknowledgementReceipt(String senderAcknowledgementReceipt) {
    this.senderAcknowledgementReceipt = senderAcknowledgementReceipt;
  }

  public PaymentEvent1 receivedDate(String receivedDate) {
    this.receivedDate = receivedDate;
    return this;
  }

   /**
   * Date and time at which the message was acknowledged by the receiver.
   * @return receivedDate
  **/
  @ApiModelProperty(value = "Date and time at which the message was acknowledged by the receiver.")
  public String getReceivedDate() {
    return receivedDate;
  }

  public void setReceivedDate(String receivedDate) {
    this.receivedDate = receivedDate;
  }

  public PaymentEvent1 instructedAmount(ActiveOrHistoricCurrencyAndAmount instructedAmount) {
    this.instructedAmount = instructedAmount;
    return this;
  }

   /**
   * Get instructedAmount
   * @return instructedAmount
  **/
  @ApiModelProperty(value = "")
  public ActiveOrHistoricCurrencyAndAmount getInstructedAmount() {
    return instructedAmount;
  }

  public void setInstructedAmount(ActiveOrHistoricCurrencyAndAmount instructedAmount) {
    this.instructedAmount = instructedAmount;
  }

  public PaymentEvent1 confirmedAmount(ActiveOrHistoricCurrencyAndAmount confirmedAmount) {
    this.confirmedAmount = confirmedAmount;
    return this;
  }

   /**
   * Get confirmedAmount
   * @return confirmedAmount
  **/
  @ApiModelProperty(value = "")
  public ActiveOrHistoricCurrencyAndAmount getConfirmedAmount() {
    return confirmedAmount;
  }

  public void setConfirmedAmount(ActiveOrHistoricCurrencyAndAmount confirmedAmount) {
    this.confirmedAmount = confirmedAmount;
  }

  public PaymentEvent1 interbankSettlementAmount(ActiveCurrencyAndAmount interbankSettlementAmount) {
    this.interbankSettlementAmount = interbankSettlementAmount;
    return this;
  }

   /**
   * Get interbankSettlementAmount
   * @return interbankSettlementAmount
  **/
  @ApiModelProperty(value = "")
  public ActiveCurrencyAndAmount getInterbankSettlementAmount() {
    return interbankSettlementAmount;
  }

  public void setInterbankSettlementAmount(ActiveCurrencyAndAmount interbankSettlementAmount) {
    this.interbankSettlementAmount = interbankSettlementAmount;
  }

  public PaymentEvent1 interbankSettlementDate(String interbankSettlementDate) {
    this.interbankSettlementDate = interbankSettlementDate;
    return this;
  }

   /**
   * Date on which the amount of money ceases to be available to the agent that owes it and when the amount of money becomes available to the agent to which it is due.
   * @return interbankSettlementDate
  **/
  @ApiModelProperty(value = "Date on which the amount of money ceases to be available to the agent that owes it and when the amount of money becomes available to the agent to which it is due.")
  public String getInterbankSettlementDate() {
    return interbankSettlementDate;
  }

  public void setInterbankSettlementDate(String interbankSettlementDate) {
    this.interbankSettlementDate = interbankSettlementDate;
  }

  public PaymentEvent1 chargeBearer(ChargeBearerType3Code chargeBearer) {
    this.chargeBearer = chargeBearer;
    return this;
  }

   /**
   * Get chargeBearer
   * @return chargeBearer
  **/
  @ApiModelProperty(value = "")
  public ChargeBearerType3Code getChargeBearer() {
    return chargeBearer;
  }

  public void setChargeBearer(ChargeBearerType3Code chargeBearer) {
    this.chargeBearer = chargeBearer;
  }

  public PaymentEvent1 chargeAmount(List<ActiveOrHistoricCurrencyAndAmount> chargeAmount) {
    this.chargeAmount = chargeAmount;
    return this;
  }

  public PaymentEvent1 addChargeAmountItem(ActiveOrHistoricCurrencyAndAmount chargeAmountItem) {
    if (this.chargeAmount == null) {
      this.chargeAmount = new ArrayList<ActiveOrHistoricCurrencyAndAmount>();
    }
    this.chargeAmount.add(chargeAmountItem);
    return this;
  }

   /**
   * Amount of money asked or paid for the charge.
   * @return chargeAmount
  **/
  @ApiModelProperty(value = "Amount of money asked or paid for the charge.")
  public List<ActiveOrHistoricCurrencyAndAmount> getChargeAmount() {
    return chargeAmount;
  }

  public void setChargeAmount(List<ActiveOrHistoricCurrencyAndAmount> chargeAmount) {
    this.chargeAmount = chargeAmount;
  }

  public PaymentEvent1 foreignExchangeDetails(ForeignExchangeTerms32 foreignExchangeDetails) {
    this.foreignExchangeDetails = foreignExchangeDetails;
    return this;
  }

   /**
   * Get foreignExchangeDetails
   * @return foreignExchangeDetails
  **/
  @ApiModelProperty(value = "")
  public ForeignExchangeTerms32 getForeignExchangeDetails() {
    return foreignExchangeDetails;
  }

  public void setForeignExchangeDetails(ForeignExchangeTerms32 foreignExchangeDetails) {
    this.foreignExchangeDetails = foreignExchangeDetails;
  }

  public PaymentEvent1 updatePayment(String updatePayment) {
    this.updatePayment = updatePayment;
    return this;
  }

   /**
   * Implements the correlation between a payment message and a status update on it. [CR][LF]Contains the network reference of the payment for which the status confirmation was applicable.
   * @return updatePayment
  **/
  @ApiModelProperty(value = "Implements the correlation between a payment message and a status update on it. [CR][LF]Contains the network reference of the payment for which the status confirmation was applicable.")
  public String getUpdatePayment() {
    return updatePayment;
  }

  public void setUpdatePayment(String updatePayment) {
    this.updatePayment = updatePayment;
  }

  public PaymentEvent1 duplicateMessageReference(String duplicateMessageReference) {
    this.duplicateMessageReference = duplicateMessageReference;
    return this;
  }

   /**
   * Network reference of the Payment that is the original recorded Payment.
   * @return duplicateMessageReference
  **/
  @ApiModelProperty(value = "Network reference of the Payment that is the original recorded Payment.")
  public String getDuplicateMessageReference() {
    return duplicateMessageReference;
  }

  public void setDuplicateMessageReference(String duplicateMessageReference) {
    this.duplicateMessageReference = duplicateMessageReference;
  }

  public PaymentEvent1 copiedBusinessService(String copiedBusinessService) {
    this.copiedBusinessService = copiedBusinessService;
    return this;
  }

   /**
   * Specifies the copied business service of the market infrastructure.
   * @return copiedBusinessService
  **/
  @ApiModelProperty(value = "Specifies the copied business service of the market infrastructure.")
  public String getCopiedBusinessService() {
    return copiedBusinessService;
  }

  public void setCopiedBusinessService(String copiedBusinessService) {
    this.copiedBusinessService = copiedBusinessService;
  }

  public PaymentEvent1 lastUpdateTime(String lastUpdateTime) {
    this.lastUpdateTime = lastUpdateTime;
    return this;
  }

   /**
   * Last date and time at which the status of this Payment event was updated.
   * @return lastUpdateTime
  **/
  @ApiModelProperty(required = true, value = "Last date and time at which the status of this Payment event was updated.")
  public String getLastUpdateTime() {
    return lastUpdateTime;
  }

  public void setLastUpdateTime(String lastUpdateTime) {
    this.lastUpdateTime = lastUpdateTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentEvent1 paymentEvent1 = (PaymentEvent1) o;
    return Objects.equals(this.networkReference, paymentEvent1.networkReference) &&
        Objects.equals(this.messageNameIdentification, paymentEvent1.messageNameIdentification) &&
        Objects.equals(this.businessService, paymentEvent1.businessService) &&
        Objects.equals(this.valid, paymentEvent1.valid) &&
        Objects.equals(this.invalidityReason, paymentEvent1.invalidityReason) &&
        Objects.equals(this.invalidityDescription, paymentEvent1.invalidityDescription) &&
        Objects.equals(this.senderReference, paymentEvent1.senderReference) &&
        Objects.equals(this.instructionIdentification, paymentEvent1.instructionIdentification) &&
        Objects.equals(this.transactionStatus, paymentEvent1.transactionStatus) &&
        Objects.equals(this.forwardedAgent, paymentEvent1.forwardedAgent) &&
        Objects.equals(this.fundsAvailable, paymentEvent1.fundsAvailable) &&
        Objects.equals(this.from, paymentEvent1.from) &&
        Objects.equals(this.to, paymentEvent1.to) &&
        Objects.equals(this.originator, paymentEvent1.originator) &&
        Objects.equals(this.creditorAgent, paymentEvent1.creditorAgent) &&
        Objects.equals(this.previousInstructingAgent, paymentEvent1.previousInstructingAgent) &&
        Objects.equals(this.senderAcknowledgementReceipt, paymentEvent1.senderAcknowledgementReceipt) &&
        Objects.equals(this.receivedDate, paymentEvent1.receivedDate) &&
        Objects.equals(this.instructedAmount, paymentEvent1.instructedAmount) &&
        Objects.equals(this.confirmedAmount, paymentEvent1.confirmedAmount) &&
        Objects.equals(this.interbankSettlementAmount, paymentEvent1.interbankSettlementAmount) &&
        Objects.equals(this.interbankSettlementDate, paymentEvent1.interbankSettlementDate) &&
        Objects.equals(this.chargeBearer, paymentEvent1.chargeBearer) &&
        Objects.equals(this.chargeAmount, paymentEvent1.chargeAmount) &&
        Objects.equals(this.foreignExchangeDetails, paymentEvent1.foreignExchangeDetails) &&
        Objects.equals(this.updatePayment, paymentEvent1.updatePayment) &&
        Objects.equals(this.duplicateMessageReference, paymentEvent1.duplicateMessageReference) &&
        Objects.equals(this.copiedBusinessService, paymentEvent1.copiedBusinessService) &&
        Objects.equals(this.lastUpdateTime, paymentEvent1.lastUpdateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(networkReference, messageNameIdentification, businessService, valid, invalidityReason, invalidityDescription, senderReference, instructionIdentification, transactionStatus, forwardedAgent, fundsAvailable, from, to, originator, creditorAgent, previousInstructingAgent, senderAcknowledgementReceipt, receivedDate, instructedAmount, confirmedAmount, interbankSettlementAmount, interbankSettlementDate, chargeBearer, chargeAmount, foreignExchangeDetails, updatePayment, duplicateMessageReference, copiedBusinessService, lastUpdateTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentEvent1 {\n");
    
    sb.append("    networkReference: ").append(toIndentedString(networkReference)).append("\n");
    sb.append("    messageNameIdentification: ").append(toIndentedString(messageNameIdentification)).append("\n");
    sb.append("    businessService: ").append(toIndentedString(businessService)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    invalidityReason: ").append(toIndentedString(invalidityReason)).append("\n");
    sb.append("    invalidityDescription: ").append(toIndentedString(invalidityDescription)).append("\n");
    sb.append("    senderReference: ").append(toIndentedString(senderReference)).append("\n");
    sb.append("    instructionIdentification: ").append(toIndentedString(instructionIdentification)).append("\n");
    sb.append("    transactionStatus: ").append(toIndentedString(transactionStatus)).append("\n");
    sb.append("    forwardedAgent: ").append(toIndentedString(forwardedAgent)).append("\n");
    sb.append("    fundsAvailable: ").append(toIndentedString(fundsAvailable)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    originator: ").append(toIndentedString(originator)).append("\n");
    sb.append("    creditorAgent: ").append(toIndentedString(creditorAgent)).append("\n");
    sb.append("    previousInstructingAgent: ").append(toIndentedString(previousInstructingAgent)).append("\n");
    sb.append("    senderAcknowledgementReceipt: ").append(toIndentedString(senderAcknowledgementReceipt)).append("\n");
    sb.append("    receivedDate: ").append(toIndentedString(receivedDate)).append("\n");
    sb.append("    instructedAmount: ").append(toIndentedString(instructedAmount)).append("\n");
    sb.append("    confirmedAmount: ").append(toIndentedString(confirmedAmount)).append("\n");
    sb.append("    interbankSettlementAmount: ").append(toIndentedString(interbankSettlementAmount)).append("\n");
    sb.append("    interbankSettlementDate: ").append(toIndentedString(interbankSettlementDate)).append("\n");
    sb.append("    chargeBearer: ").append(toIndentedString(chargeBearer)).append("\n");
    sb.append("    chargeAmount: ").append(toIndentedString(chargeAmount)).append("\n");
    sb.append("    foreignExchangeDetails: ").append(toIndentedString(foreignExchangeDetails)).append("\n");
    sb.append("    updatePayment: ").append(toIndentedString(updatePayment)).append("\n");
    sb.append("    duplicateMessageReference: ").append(toIndentedString(duplicateMessageReference)).append("\n");
    sb.append("    copiedBusinessService: ").append(toIndentedString(copiedBusinessService)).append("\n");
    sb.append("    lastUpdateTime: ").append(toIndentedString(lastUpdateTime)).append("\n");
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

