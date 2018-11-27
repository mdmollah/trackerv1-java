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
 * Specifies ranged amounts, for a specific currency and type of amount.
 */
@ApiModel(description = "Specifies ranged amounts, for a specific currency and type of amount.")
public class AmountType1 {
  @SerializedName("type")
  private TypeOfAmount8Code type = null;

  @SerializedName("currency")
  private String currency = null;

  @SerializedName("from_amount")
  private String fromAmount = null;

  @SerializedName("to_amount")
  private String toAmount = null;

  public AmountType1 type(TypeOfAmount8Code type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "")
  public TypeOfAmount8Code getType() {
    return type;
  }

  public void setType(TypeOfAmount8Code type) {
    this.type = type;
  }

  public AmountType1 currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Code allocated to a currency, by a maintenance agency, under an international identification scheme as described in the latest edition of the international standard ISO 4217 \&quot;Codes for the representation of currencies and funds\&quot;. Valid currency codes are registered with the ISO 4217 Maintenance Agency, and consist of three contiguous letters.
   * @return currency
  **/
  @ApiModelProperty(value = "Code allocated to a currency, by a maintenance agency, under an international identification scheme as described in the latest edition of the international standard ISO 4217 \"Codes for the representation of currencies and funds\". Valid currency codes are registered with the ISO 4217 Maintenance Agency, and consist of three contiguous letters.")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public AmountType1 fromAmount(String fromAmount) {
    this.fromAmount = fromAmount;
    return this;
  }

   /**
   * Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot.[LF]Note: a zero amount is considered a positive amount.
   * @return fromAmount
  **/
  @ApiModelProperty(required = true, value = "Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot.[LF]Note: a zero amount is considered a positive amount.")
  public String getFromAmount() {
    return fromAmount;
  }

  public void setFromAmount(String fromAmount) {
    this.fromAmount = fromAmount;
  }

  public AmountType1 toAmount(String toAmount) {
    this.toAmount = toAmount;
    return this;
  }

   /**
   * Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot.[LF]Note: a zero amount is considered a positive amount.
   * @return toAmount
  **/
  @ApiModelProperty(required = true, value = "Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot.[LF]Note: a zero amount is considered a positive amount.")
  public String getToAmount() {
    return toAmount;
  }

  public void setToAmount(String toAmount) {
    this.toAmount = toAmount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AmountType1 amountType1 = (AmountType1) o;
    return Objects.equals(this.type, amountType1.type) &&
        Objects.equals(this.currency, amountType1.currency) &&
        Objects.equals(this.fromAmount, amountType1.fromAmount) &&
        Objects.equals(this.toAmount, amountType1.toAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, currency, fromAmount, toAmount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AmountType1 {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    fromAmount: ").append(toIndentedString(fromAmount)).append("\n");
    sb.append("    toAmount: ").append(toIndentedString(toAmount)).append("\n");
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

