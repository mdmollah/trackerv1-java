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
 * Information needed to process a currency exchange or conversion.
 */
@ApiModel(description = "Information needed to process a currency exchange or conversion.")
public class ForeignExchangeTerms32 {
  @SerializedName("from_currency")
  private String fromCurrency = null;

  @SerializedName("to_currency")
  private String toCurrency = null;

  @SerializedName("exchange_rate")
  private String exchangeRate = null;

  public ForeignExchangeTerms32 fromCurrency(String fromCurrency) {
    this.fromCurrency = fromCurrency;
    return this;
  }

   /**
   * A code allocated to a currency by a Maintenance Agency under an international identification scheme, as described in the latest edition of the international standard ISO 4217 \&quot;Codes for the representation of currencies and funds\&quot;.
   * @return fromCurrency
  **/
  @ApiModelProperty(required = true, value = "A code allocated to a currency by a Maintenance Agency under an international identification scheme, as described in the latest edition of the international standard ISO 4217 \"Codes for the representation of currencies and funds\".")
  public String getFromCurrency() {
    return fromCurrency;
  }

  public void setFromCurrency(String fromCurrency) {
    this.fromCurrency = fromCurrency;
  }

  public ForeignExchangeTerms32 toCurrency(String toCurrency) {
    this.toCurrency = toCurrency;
    return this;
  }

   /**
   * A code allocated to a currency by a Maintenance Agency under an international identification scheme, as described in the latest edition of the international standard ISO 4217 \&quot;Codes for the representation of currencies and funds\&quot;.
   * @return toCurrency
  **/
  @ApiModelProperty(required = true, value = "A code allocated to a currency by a Maintenance Agency under an international identification scheme, as described in the latest edition of the international standard ISO 4217 \"Codes for the representation of currencies and funds\".")
  public String getToCurrency() {
    return toCurrency;
  }

  public void setToCurrency(String toCurrency) {
    this.toCurrency = toCurrency;
  }

  public ForeignExchangeTerms32 exchangeRate(String exchangeRate) {
    this.exchangeRate = exchangeRate;
    return this;
  }

   /**
   * Rate expressed as a decimal, eg, 0.7 is 7/10 and 70%.
   * @return exchangeRate
  **/
  @ApiModelProperty(required = true, value = "Rate expressed as a decimal, eg, 0.7 is 7/10 and 70%.")
  public String getExchangeRate() {
    return exchangeRate;
  }

  public void setExchangeRate(String exchangeRate) {
    this.exchangeRate = exchangeRate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ForeignExchangeTerms32 foreignExchangeTerms32 = (ForeignExchangeTerms32) o;
    return Objects.equals(this.fromCurrency, foreignExchangeTerms32.fromCurrency) &&
        Objects.equals(this.toCurrency, foreignExchangeTerms32.toCurrency) &&
        Objects.equals(this.exchangeRate, foreignExchangeTerms32.exchangeRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromCurrency, toCurrency, exchangeRate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ForeignExchangeTerms32 {\n");
    
    sb.append("    fromCurrency: ").append(toIndentedString(fromCurrency)).append("\n");
    sb.append("    toCurrency: ").append(toIndentedString(toCurrency)).append("\n");
    sb.append("    exchangeRate: ").append(toIndentedString(exchangeRate)).append("\n");
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

