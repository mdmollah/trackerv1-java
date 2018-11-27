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
 * This API is the response to a delta query to get all payment update information starting from a given date and time. This API allows synchronization of a local database with the tracker database. [CR][LF]All use cases applicable for the get and search of payment transactions apply also for this API. [CR][LF]The use of the API to get the last changed payment transactions is driven by an architectural choice to feed a local database and to optimise the flow between the tracker and the API caller.[CR][LF]
 */
@ApiModel(description = "This API is the response to a delta query to get all payment update information starting from a given date and time. This API allows synchronization of a local database with the tracker database. [CR][LF]All use cases applicable for the get and search of payment transactions apply also for this API. [CR][LF]The use of the API to get the last changed payment transactions is driven by an architectural choice to feed a local database and to optimise the flow between the tracker and the API caller.[CR][LF]")
public class GetChangedPaymentTransactionsResponse {
  @SerializedName("payment_transaction")
  private List<PaymentTransaction73> paymentTransaction = null;

  @SerializedName("more")
  private String more = null;

  public GetChangedPaymentTransactionsResponse paymentTransaction(List<PaymentTransaction73> paymentTransaction) {
    this.paymentTransaction = paymentTransaction;
    return this;
  }

  public GetChangedPaymentTransactionsResponse addPaymentTransactionItem(PaymentTransaction73 paymentTransactionItem) {
    if (this.paymentTransaction == null) {
      this.paymentTransaction = new ArrayList<PaymentTransaction73>();
    }
    this.paymentTransaction.add(paymentTransactionItem);
    return this;
  }

   /**
   * contains the payment transactions that meet the search criteria.
   * @return paymentTransaction
  **/
  @ApiModelProperty(value = "contains the payment transactions that meet the search criteria.")
  public List<PaymentTransaction73> getPaymentTransaction() {
    return paymentTransaction;
  }

  public void setPaymentTransaction(List<PaymentTransaction73> paymentTransaction) {
    this.paymentTransaction = paymentTransaction;
  }

  public GetChangedPaymentTransactionsResponse more(String more) {
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
    GetChangedPaymentTransactionsResponse getChangedPaymentTransactionsResponse = (GetChangedPaymentTransactionsResponse) o;
    return Objects.equals(this.paymentTransaction, getChangedPaymentTransactionsResponse.paymentTransaction) &&
        Objects.equals(this.more, getChangedPaymentTransactionsResponse.more);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentTransaction, more);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetChangedPaymentTransactionsResponse {\n");
    
    sb.append("    paymentTransaction: ").append(toIndentedString(paymentTransaction)).append("\n");
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

