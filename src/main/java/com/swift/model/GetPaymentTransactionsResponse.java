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
 * This API is the response to a payment transaction search to get transaction-level information regarding all payments that match the search criteria.[CR][LF]Examples of use cases are:[CR][LF]•[TAB]Investigation by a participating institution based on criteria given by a customer, such as instructed amount, time of initiation[CR][LF]•[TAB]Flow monitoring, for instance to find payments that are \&quot;stuck\&quot; for which the institution is the beneficiary institution[CR][LF]•[TAB]Feed a dashboard - give all payment transactions with their last status[CR][LF]
 */
@ApiModel(description = "This API is the response to a payment transaction search to get transaction-level information regarding all payments that match the search criteria.[CR][LF]Examples of use cases are:[CR][LF]•[TAB]Investigation by a participating institution based on criteria given by a customer, such as instructed amount, time of initiation[CR][LF]•[TAB]Flow monitoring, for instance to find payments that are \"stuck\" for which the institution is the beneficiary institution[CR][LF]•[TAB]Feed a dashboard - give all payment transactions with their last status[CR][LF]")
public class GetPaymentTransactionsResponse {
  @SerializedName("payment_transaction")
  private List<PaymentTransaction72> paymentTransaction = new ArrayList<PaymentTransaction72>();

  @SerializedName("total_number")
  private String totalNumber = null;

  @SerializedName("more")
  private String more = null;

  public GetPaymentTransactionsResponse paymentTransaction(List<PaymentTransaction72> paymentTransaction) {
    this.paymentTransaction = paymentTransaction;
    return this;
  }

  public GetPaymentTransactionsResponse addPaymentTransactionItem(PaymentTransaction72 paymentTransactionItem) {
    this.paymentTransaction.add(paymentTransactionItem);
    return this;
  }

   /**
   * contains the payment transactions that meet the search criteria.
   * @return paymentTransaction
  **/
  @ApiModelProperty(required = true, value = "contains the payment transactions that meet the search criteria.")
  public List<PaymentTransaction72> getPaymentTransaction() {
    return paymentTransaction;
  }

  public void setPaymentTransaction(List<PaymentTransaction72> paymentTransaction) {
    this.paymentTransaction = paymentTransaction;
  }

  public GetPaymentTransactionsResponse totalNumber(String totalNumber) {
    this.totalNumber = totalNumber;
    return this;
  }

   /**
   * Contains the total number of returned result entries.
   * @return totalNumber
  **/
  @ApiModelProperty(required = true, value = "Contains the total number of returned result entries.")
  public String getTotalNumber() {
    return totalNumber;
  }

  public void setTotalNumber(String totalNumber) {
    this.totalNumber = totalNumber;
  }

  public GetPaymentTransactionsResponse more(String more) {
    this.more = more;
    return this;
  }

   /**
   * Contains a token to obtain the next set of responses. It indicates whether there are more results to retrieve, what timestamp to start from and how many more result entries are to be retrieved.
   * @return more
  **/
  @ApiModelProperty(value = "Contains a token to obtain the next set of responses. It indicates whether there are more results to retrieve, what timestamp to start from and how many more result entries are to be retrieved.")
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
    GetPaymentTransactionsResponse getPaymentTransactionsResponse = (GetPaymentTransactionsResponse) o;
    return Objects.equals(this.paymentTransaction, getPaymentTransactionsResponse.paymentTransaction) &&
        Objects.equals(this.totalNumber, getPaymentTransactionsResponse.totalNumber) &&
        Objects.equals(this.more, getPaymentTransactionsResponse.more);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentTransaction, totalNumber, more);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPaymentTransactionsResponse {\n");
    
    sb.append("    paymentTransaction: ").append(toIndentedString(paymentTransaction)).append("\n");
    sb.append("    totalNumber: ").append(toIndentedString(totalNumber)).append("\n");
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

