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
 * Contains details on the status of a payment.
 */
@ApiModel(description = "Contains details on the status of a payment.")
public class StatusDetails1 {
  @SerializedName("originator")
  private String originator = null;

  @SerializedName("funds_available")
  private String fundsAvailable = null;

  @SerializedName("transaction_status")
  private PaymentStatus3 transactionStatus = null;

  @SerializedName("forwarded_agent")
  private String forwardedAgent = null;

  @SerializedName("confirmed_amount")
  private ActiveOrHistoricCurrencyAndAmount confirmedAmount = null;

  @SerializedName("foreign_exchange_details")
  private ForeignExchangeTerms32 foreignExchangeDetails = null;

  @SerializedName("charge_amount")
  private List<ActiveOrHistoricCurrencyAndAmount> chargeAmount = null;

  public StatusDetails1 originator(String originator) {
    this.originator = originator;
    return this;
  }

   /**
   * Party that issues the status.
   * @return originator
  **/
  @ApiModelProperty(required = true, value = "Party that issues the status.")
  public String getOriginator() {
    return originator;
  }

  public void setOriginator(String originator) {
    this.originator = originator;
  }

  public StatusDetails1 fundsAvailable(String fundsAvailable) {
    this.fundsAvailable = fundsAvailable;
    return this;
  }

   /**
   * Date and time at which the funds are available,  as reported in the ACSC status update.
   * @return fundsAvailable
  **/
  @ApiModelProperty(value = "Date and time at which the funds are available,  as reported in the ACSC status update.")
  public String getFundsAvailable() {
    return fundsAvailable;
  }

  public void setFundsAvailable(String fundsAvailable) {
    this.fundsAvailable = fundsAvailable;
  }

  public StatusDetails1 transactionStatus(PaymentStatus3 transactionStatus) {
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

  public StatusDetails1 forwardedAgent(String forwardedAgent) {
    this.forwardedAgent = forwardedAgent;
    return this;
  }

   /**
   * Specifies the BIC of the entity to which the entity reporting the status has forwarded the payment transaction.[CR][LF]This element must be used in case the status is ACSP/000 or ACSP/001.
   * @return forwardedAgent
  **/
  @ApiModelProperty(value = "Specifies the BIC of the entity to which the entity reporting the status has forwarded the payment transaction.[CR][LF]This element must be used in case the status is ACSP/000 or ACSP/001.")
  public String getForwardedAgent() {
    return forwardedAgent;
  }

  public void setForwardedAgent(String forwardedAgent) {
    this.forwardedAgent = forwardedAgent;
  }

  public StatusDetails1 confirmedAmount(ActiveOrHistoricCurrencyAndAmount confirmedAmount) {
    this.confirmedAmount = confirmedAmount;
    return this;
  }

   /**
   * Get confirmedAmount
   * @return confirmedAmount
  **/
  @ApiModelProperty(required = true, value = "")
  public ActiveOrHistoricCurrencyAndAmount getConfirmedAmount() {
    return confirmedAmount;
  }

  public void setConfirmedAmount(ActiveOrHistoricCurrencyAndAmount confirmedAmount) {
    this.confirmedAmount = confirmedAmount;
  }

  public StatusDetails1 foreignExchangeDetails(ForeignExchangeTerms32 foreignExchangeDetails) {
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

  public StatusDetails1 chargeAmount(List<ActiveOrHistoricCurrencyAndAmount> chargeAmount) {
    this.chargeAmount = chargeAmount;
    return this;
  }

  public StatusDetails1 addChargeAmountItem(ActiveOrHistoricCurrencyAndAmount chargeAmountItem) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusDetails1 statusDetails1 = (StatusDetails1) o;
    return Objects.equals(this.originator, statusDetails1.originator) &&
        Objects.equals(this.fundsAvailable, statusDetails1.fundsAvailable) &&
        Objects.equals(this.transactionStatus, statusDetails1.transactionStatus) &&
        Objects.equals(this.forwardedAgent, statusDetails1.forwardedAgent) &&
        Objects.equals(this.confirmedAmount, statusDetails1.confirmedAmount) &&
        Objects.equals(this.foreignExchangeDetails, statusDetails1.foreignExchangeDetails) &&
        Objects.equals(this.chargeAmount, statusDetails1.chargeAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(originator, fundsAvailable, transactionStatus, forwardedAgent, confirmedAmount, foreignExchangeDetails, chargeAmount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusDetails1 {\n");
    
    sb.append("    originator: ").append(toIndentedString(originator)).append("\n");
    sb.append("    fundsAvailable: ").append(toIndentedString(fundsAvailable)).append("\n");
    sb.append("    transactionStatus: ").append(toIndentedString(transactionStatus)).append("\n");
    sb.append("    forwardedAgent: ").append(toIndentedString(forwardedAgent)).append("\n");
    sb.append("    confirmedAmount: ").append(toIndentedString(confirmedAmount)).append("\n");
    sb.append("    foreignExchangeDetails: ").append(toIndentedString(foreignExchangeDetails)).append("\n");
    sb.append("    chargeAmount: ").append(toIndentedString(chargeAmount)).append("\n");
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

