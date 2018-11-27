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
 * This API is a payment transaction search to get transaction-level information regarding all payments that match the search criteria. To have full information of a given payment transaction, the GetPaymentTransactionDetailsRequest can be used.[CR][LF]Examples of use cases are:[CR][LF]•[TAB]Investigation by a participating institution based on criteria given by a customer, such as instructed amount, time of initiation[CR][LF]•[TAB]Flow monitoring, for instance to find payments that are \&quot;stuck\&quot; for which the institution is the beneficiary institution[CR][LF]•[TAB]Feed a dashboard - give all payment transactions with their last status[CR][LF]
 */
@ApiModel(description = "This API is a payment transaction search to get transaction-level information regarding all payments that match the search criteria. To have full information of a given payment transaction, the GetPaymentTransactionDetailsRequest can be used.[CR][LF]Examples of use cases are:[CR][LF]•[TAB]Investigation by a participating institution based on criteria given by a customer, such as instructed amount, time of initiation[CR][LF]•[TAB]Flow monitoring, for instance to find payments that are \"stuck\" for which the institution is the beneficiary institution[CR][LF]•[TAB]Feed a dashboard - give all payment transactions with their last status[CR][LF]")
public class GetPaymentTransactionsRequest {
  @SerializedName("my_institution")
  private List<String> myInstitution = new ArrayList<String>();

  @SerializedName("time_window")
  private DateTimePeriodDetails timeWindow = null;

  @SerializedName("agent")
  private List<AgentType1> agent = null;

  @SerializedName("location")
  private Location1Code location = null;

  @SerializedName("transaction_status")
  private List<PaymentStatus3> transactionStatus = null;

  @SerializedName("amount")
  private AmountType1 amount = null;

  @SerializedName("event")
  private PaymentTransactionState1Code event = null;

  @SerializedName("maximum_number")
  private String maximumNumber = null;

  @SerializedName("more")
  private String more = null;

  public GetPaymentTransactionsRequest myInstitution(List<String> myInstitution) {
    this.myInstitution = myInstitution;
    return this;
  }

  public GetPaymentTransactionsRequest addMyInstitutionItem(String myInstitutionItem) {
    this.myInstitution.add(myInstitutionItem);
    return this;
  }

   /**
   * Specifies an institution that is owned by the sender, for which the sender can ask payment transaction details.
   * @return myInstitution
  **/
  @ApiModelProperty(required = true, value = "Specifies an institution that is owned by the sender, for which the sender can ask payment transaction details.")
  public List<String> getMyInstitution() {
    return myInstitution;
  }

  public void setMyInstitution(List<String> myInstitution) {
    this.myInstitution = myInstitution;
  }

  public GetPaymentTransactionsRequest timeWindow(DateTimePeriodDetails timeWindow) {
    this.timeWindow = timeWindow;
    return this;
  }

   /**
   * Get timeWindow
   * @return timeWindow
  **/
  @ApiModelProperty(required = true, value = "")
  public DateTimePeriodDetails getTimeWindow() {
    return timeWindow;
  }

  public void setTimeWindow(DateTimePeriodDetails timeWindow) {
    this.timeWindow = timeWindow;
  }

  public GetPaymentTransactionsRequest agent(List<AgentType1> agent) {
    this.agent = agent;
    return this;
  }

  public GetPaymentTransactionsRequest addAgentItem(AgentType1 agentItem) {
    if (this.agent == null) {
      this.agent = new ArrayList<AgentType1>();
    }
    this.agent.add(agentItem);
    return this;
  }

   /**
   * Identifies agent(s) involved in a payment transaction.
   * @return agent
  **/
  @ApiModelProperty(value = "Identifies agent(s) involved in a payment transaction.")
  public List<AgentType1> getAgent() {
    return agent;
  }

  public void setAgent(List<AgentType1> agent) {
    this.agent = agent;
  }

  public GetPaymentTransactionsRequest location(Location1Code location) {
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @ApiModelProperty(value = "")
  public Location1Code getLocation() {
    return location;
  }

  public void setLocation(Location1Code location) {
    this.location = location;
  }

  public GetPaymentTransactionsRequest transactionStatus(List<PaymentStatus3> transactionStatus) {
    this.transactionStatus = transactionStatus;
    return this;
  }

  public GetPaymentTransactionsRequest addTransactionStatusItem(PaymentStatus3 transactionStatusItem) {
    if (this.transactionStatus == null) {
      this.transactionStatus = new ArrayList<PaymentStatus3>();
    }
    this.transactionStatus.add(transactionStatusItem);
    return this;
  }

   /**
   * Specifies the status of a transaction, in a coded form.
   * @return transactionStatus
  **/
  @ApiModelProperty(value = "Specifies the status of a transaction, in a coded form.")
  public List<PaymentStatus3> getTransactionStatus() {
    return transactionStatus;
  }

  public void setTransactionStatus(List<PaymentStatus3> transactionStatus) {
    this.transactionStatus = transactionStatus;
  }

  public GetPaymentTransactionsRequest amount(AmountType1 amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(value = "")
  public AmountType1 getAmount() {
    return amount;
  }

  public void setAmount(AmountType1 amount) {
    this.amount = amount;
  }

  public GetPaymentTransactionsRequest event(PaymentTransactionState1Code event) {
    this.event = event;
    return this;
  }

   /**
   * Get event
   * @return event
  **/
  @ApiModelProperty(required = true, value = "")
  public PaymentTransactionState1Code getEvent() {
    return event;
  }

  public void setEvent(PaymentTransactionState1Code event) {
    this.event = event;
  }

  public GetPaymentTransactionsRequest maximumNumber(String maximumNumber) {
    this.maximumNumber = maximumNumber;
    return this;
  }

   /**
   * Number of objects represented as an integer.
   * @return maximumNumber
  **/
  @ApiModelProperty(required = true, value = "Number of objects represented as an integer.")
  public String getMaximumNumber() {
    return maximumNumber;
  }

  public void setMaximumNumber(String maximumNumber) {
    this.maximumNumber = maximumNumber;
  }

  public GetPaymentTransactionsRequest more(String more) {
    this.more = more;
    return this;
  }

   /**
   * Contains the token to get the next set of responses.
   * @return more
  **/
  @ApiModelProperty(value = "Contains the token to get the next set of responses.")
  public String getMore() {
    return more;
  }

  public void setMore(String more) {
    this.more = more;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetPaymentTransactionsRequest getPaymentTransactionsRequest = (GetPaymentTransactionsRequest) o;
    return Objects.equals(this.myInstitution, getPaymentTransactionsRequest.myInstitution) &&
        Objects.equals(this.timeWindow, getPaymentTransactionsRequest.timeWindow) &&
        Objects.equals(this.agent, getPaymentTransactionsRequest.agent) &&
        Objects.equals(this.location, getPaymentTransactionsRequest.location) &&
        Objects.equals(this.transactionStatus, getPaymentTransactionsRequest.transactionStatus) &&
        Objects.equals(this.amount, getPaymentTransactionsRequest.amount) &&
        Objects.equals(this.event, getPaymentTransactionsRequest.event) &&
        Objects.equals(this.maximumNumber, getPaymentTransactionsRequest.maximumNumber) &&
        Objects.equals(this.more, getPaymentTransactionsRequest.more);
  }

  @Override
  public int hashCode() {
    return Objects.hash(myInstitution, timeWindow, agent, location, transactionStatus, amount, event, maximumNumber, more);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPaymentTransactionsRequest {\n");
    
    sb.append("    myInstitution: ").append(toIndentedString(myInstitution)).append("\n");
    sb.append("    timeWindow: ").append(toIndentedString(timeWindow)).append("\n");
    sb.append("    agent: ").append(toIndentedString(agent)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    transactionStatus: ").append(toIndentedString(transactionStatus)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    maximumNumber: ").append(toIndentedString(maximumNumber)).append("\n");
    sb.append("    more: ").append(toIndentedString(more)).append("\n");
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

