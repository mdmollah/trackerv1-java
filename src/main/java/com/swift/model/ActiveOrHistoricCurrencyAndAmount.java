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
 * A number of monetary units specified in an active or a historic currency where the unit of currency is explicit and compliant with ISO 4217.
 */
@ApiModel(description = "A number of monetary units specified in an active or a historic currency where the unit of currency is explicit and compliant with ISO 4217.")
public class ActiveOrHistoricCurrencyAndAmount {
  @SerializedName("$")
  private String value = null;

  @SerializedName("@currency")
  private String currency = null;

  public ActiveOrHistoricCurrencyAndAmount value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(value = "")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public ActiveOrHistoricCurrencyAndAmount currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * A code allocated to a currency by a Maintenance Agency under an international identification scheme, as described in the latest edition of the international standard ISO 4217 \&quot;Codes for the representation of currencies and funds\&quot;.
   * @return currency
  **/
  @ApiModelProperty(value = "A code allocated to a currency by a Maintenance Agency under an international identification scheme, as described in the latest edition of the international standard ISO 4217 \"Codes for the representation of currencies and funds\".")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActiveOrHistoricCurrencyAndAmount activeOrHistoricCurrencyAndAmount = (ActiveOrHistoricCurrencyAndAmount) o;
    return Objects.equals(this.value, activeOrHistoricCurrencyAndAmount.value) &&
        Objects.equals(this.currency, activeOrHistoricCurrencyAndAmount.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, currency);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActiveOrHistoricCurrencyAndAmount {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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

