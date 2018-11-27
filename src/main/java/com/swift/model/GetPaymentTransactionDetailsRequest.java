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
 * This API is a payment query to get detailed information regarding a given payment transaction. It requires the UETR to be known.[CR][LF]Examples of use cases are:[CR][LF]•[TAB]Debtor status check - debtor&#39;s agent or debtor wants to see the status[CR][LF]•[TAB]Creditor status check - creditor&#39;s agent or creditor wants to see the status[CR][LF]
 */
@ApiModel(description = "This API is a payment query to get detailed information regarding a given payment transaction. It requires the UETR to be known.[CR][LF]Examples of use cases are:[CR][LF]•[TAB]Debtor status check - debtor's agent or debtor wants to see the status[CR][LF]•[TAB]Creditor status check - creditor's agent or creditor wants to see the status[CR][LF]")
public class GetPaymentTransactionDetailsRequest {
  @SerializedName("my_institution")
  private List<String> myInstitution = new ArrayList<String>();

  @SerializedName("transaction_identification")
  private String transactionIdentification = null;

  public GetPaymentTransactionDetailsRequest myInstitution(List<String> myInstitution) {
    this.myInstitution = myInstitution;
    return this;
  }

  public GetPaymentTransactionDetailsRequest addMyInstitutionItem(String myInstitutionItem) {
    this.myInstitution.add(myInstitutionItem);
    return this;
  }

   /**
   * Specifies the institution which payments are requested.
   * @return myInstitution
  **/
  @ApiModelProperty(required = true, value = "Specifies the institution which payments are requested.")
  public List<String> getMyInstitution() {
    return myInstitution;
  }

  public void setMyInstitution(List<String> myInstitution) {
    this.myInstitution = myInstitution;
  }

  public GetPaymentTransactionDetailsRequest transactionIdentification(String transactionIdentification) {
    this.transactionIdentification = transactionIdentification;
    return this;
  }

   /**
   * Contains the unique end to end transaction reference (UETR) of a payment
   * @return transactionIdentification
  **/
  @ApiModelProperty(required = true, value = "Contains the unique end to end transaction reference (UETR) of a payment")
  public String getTransactionIdentification() {
    return transactionIdentification;
  }

  public void setTransactionIdentification(String transactionIdentification) {
    this.transactionIdentification = transactionIdentification;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetPaymentTransactionDetailsRequest getPaymentTransactionDetailsRequest = (GetPaymentTransactionDetailsRequest) o;
    return Objects.equals(this.myInstitution, getPaymentTransactionDetailsRequest.myInstitution) &&
        Objects.equals(this.transactionIdentification, getPaymentTransactionDetailsRequest.transactionIdentification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(myInstitution, transactionIdentification);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPaymentTransactionDetailsRequest {\n");
    
    sb.append("    myInstitution: ").append(toIndentedString(myInstitution)).append("\n");
    sb.append("    transactionIdentification: ").append(toIndentedString(transactionIdentification)).append("\n");
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

