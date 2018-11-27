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
public class PaymentTransaction72 {
  @SerializedName("transaction_identification")
  private String transactionIdentification = null;

  @SerializedName("my_institution")
  private String myInstitution = null;

  @SerializedName("role")
  private PaymentsPartyType2Code role = null;

  @SerializedName("event_time")
  private String eventTime = null;

  @SerializedName("transaction_status")
  private PaymentStatus3 transactionStatus = null;

  @SerializedName("previous_instructing_agent")
  private String previousInstructingAgent = null;

  @SerializedName("agents")
  private List<PaymentEvent2> agents = new ArrayList<PaymentEvent2>();

  @SerializedName("creditor_agent")
  private String creditorAgent = null;

  @SerializedName("initiation_time")
  private String initiationTime = null;

  @SerializedName("completion_time")
  private String completionTime = null;

  @SerializedName("instructed_amount")
  private ActiveOrHistoricCurrencyAndAmount instructedAmount = null;

  @SerializedName("last_update_time")
  private String lastUpdateTime = null;

  public PaymentTransaction72 transactionIdentification(String transactionIdentification) {
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

  public PaymentTransaction72 myInstitution(String myInstitution) {
    this.myInstitution = myInstitution;
    return this;
  }

   /**
   * Specifies an institution that is owned by the sender, for which the sender can ask payment transaction details.
   * @return myInstitution
  **/
  @ApiModelProperty(required = true, value = "Specifies an institution that is owned by the sender, for which the sender can ask payment transaction details.")
  public String getMyInstitution() {
    return myInstitution;
  }

  public void setMyInstitution(String myInstitution) {
    this.myInstitution = myInstitution;
  }

  public PaymentTransaction72 role(PaymentsPartyType2Code role) {
    this.role = role;
    return this;
  }

   /**
   * Get role
   * @return role
  **/
  @ApiModelProperty(required = true, value = "")
  public PaymentsPartyType2Code getRole() {
    return role;
  }

  public void setRole(PaymentsPartyType2Code role) {
    this.role = role;
  }

  public PaymentTransaction72 eventTime(String eventTime) {
    this.eventTime = eventTime;
    return this;
  }

   /**
   * Time determined by the Role that the entity defined in MyInstitution is playing in this transaction.
   * @return eventTime
  **/
  @ApiModelProperty(required = true, value = "Time determined by the Role that the entity defined in MyInstitution is playing in this transaction.")
  public String getEventTime() {
    return eventTime;
  }

  public void setEventTime(String eventTime) {
    this.eventTime = eventTime;
  }

  public PaymentTransaction72 transactionStatus(PaymentStatus3 transactionStatus) {
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

  public PaymentTransaction72 previousInstructingAgent(String previousInstructingAgent) {
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

  public PaymentTransaction72 agents(List<PaymentEvent2> agents) {
    this.agents = agents;
    return this;
  }

  public PaymentTransaction72 addAgentsItem(PaymentEvent2 agentsItem) {
    this.agents.add(agentsItem);
    return this;
  }

   /**
   * Identifies the agents currently participating in a transaction.
   * @return agents
  **/
  @ApiModelProperty(required = true, value = "Identifies the agents currently participating in a transaction.")
  public List<PaymentEvent2> getAgents() {
    return agents;
  }

  public void setAgents(List<PaymentEvent2> agents) {
    this.agents = agents;
  }

  public PaymentTransaction72 creditorAgent(String creditorAgent) {
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

  public PaymentTransaction72 initiationTime(String initiationTime) {
    this.initiationTime = initiationTime;
    return this;
  }

   /**
   * Date and Time at which the message enters the Gpi system.
   * @return initiationTime
  **/
  @ApiModelProperty(required = true, value = "Date and Time at which the message enters the Gpi system.")
  public String getInitiationTime() {
    return initiationTime;
  }

  public void setInitiationTime(String initiationTime) {
    this.initiationTime = initiationTime;
  }

  public PaymentTransaction72 completionTime(String completionTime) {
    this.completionTime = completionTime;
    return this;
  }

   /**
   * Time at which the Instructed Bank reports that the transaction has been completed. [CR][LF]Date and time based on the creation date of the status confirmation containing a final status ACSC.
   * @return completionTime
  **/
  @ApiModelProperty(value = "Time at which the Instructed Bank reports that the transaction has been completed. [CR][LF]Date and time based on the creation date of the status confirmation containing a final status ACSC.")
  public String getCompletionTime() {
    return completionTime;
  }

  public void setCompletionTime(String completionTime) {
    this.completionTime = completionTime;
  }

  public PaymentTransaction72 instructedAmount(ActiveOrHistoricCurrencyAndAmount instructedAmount) {
    this.instructedAmount = instructedAmount;
    return this;
  }

   /**
   * Get instructedAmount
   * @return instructedAmount
  **/
  @ApiModelProperty(required = true, value = "")
  public ActiveOrHistoricCurrencyAndAmount getInstructedAmount() {
    return instructedAmount;
  }

  public void setInstructedAmount(ActiveOrHistoricCurrencyAndAmount instructedAmount) {
    this.instructedAmount = instructedAmount;
  }

  public PaymentTransaction72 lastUpdateTime(String lastUpdateTime) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentTransaction72 paymentTransaction72 = (PaymentTransaction72) o;
    return Objects.equals(this.transactionIdentification, paymentTransaction72.transactionIdentification) &&
        Objects.equals(this.myInstitution, paymentTransaction72.myInstitution) &&
        Objects.equals(this.role, paymentTransaction72.role) &&
        Objects.equals(this.eventTime, paymentTransaction72.eventTime) &&
        Objects.equals(this.transactionStatus, paymentTransaction72.transactionStatus) &&
        Objects.equals(this.previousInstructingAgent, paymentTransaction72.previousInstructingAgent) &&
        Objects.equals(this.agents, paymentTransaction72.agents) &&
        Objects.equals(this.creditorAgent, paymentTransaction72.creditorAgent) &&
        Objects.equals(this.initiationTime, paymentTransaction72.initiationTime) &&
        Objects.equals(this.completionTime, paymentTransaction72.completionTime) &&
        Objects.equals(this.instructedAmount, paymentTransaction72.instructedAmount) &&
        Objects.equals(this.lastUpdateTime, paymentTransaction72.lastUpdateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionIdentification, myInstitution, role, eventTime, transactionStatus, previousInstructingAgent, agents, creditorAgent, initiationTime, completionTime, instructedAmount, lastUpdateTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentTransaction72 {\n");
    
    sb.append("    transactionIdentification: ").append(toIndentedString(transactionIdentification)).append("\n");
    sb.append("    myInstitution: ").append(toIndentedString(myInstitution)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
    sb.append("    transactionStatus: ").append(toIndentedString(transactionStatus)).append("\n");
    sb.append("    previousInstructingAgent: ").append(toIndentedString(previousInstructingAgent)).append("\n");
    sb.append("    agents: ").append(toIndentedString(agents)).append("\n");
    sb.append("    creditorAgent: ").append(toIndentedString(creditorAgent)).append("\n");
    sb.append("    initiationTime: ").append(toIndentedString(initiationTime)).append("\n");
    sb.append("    completionTime: ").append(toIndentedString(completionTime)).append("\n");
    sb.append("    instructedAmount: ").append(toIndentedString(instructedAmount)).append("\n");
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

