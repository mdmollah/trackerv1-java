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
 * Specifies one or more agents involved in a transaction, with their role.
 */
@ApiModel(description = "Specifies one or more agents involved in a transaction, with their role.")
public class AgentType1 {
  @SerializedName("any_bic")
  private List<String> anyBic = new ArrayList<String>();

  @SerializedName("role")
  private PaymentsPartyType1Code role = null;

  public AgentType1 anyBic(List<String> anyBic) {
    this.anyBic = anyBic;
    return this;
  }

  public AgentType1 addAnyBicItem(String anyBicItem) {
    this.anyBic.add(anyBicItem);
    return this;
  }

   /**
   * Code allocated to a financial or non-financial institution by the ISO 9362 Registration Authority, as described in ISO 9362 \&quot;Banking - Banking telecommunication messages - Business identifier code (BIC)\&quot;.
   * @return anyBic
  **/
  @ApiModelProperty(required = true, value = "Code allocated to a financial or non-financial institution by the ISO 9362 Registration Authority, as described in ISO 9362 \"Banking - Banking telecommunication messages - Business identifier code (BIC)\".")
  public List<String> getAnyBic() {
    return anyBic;
  }

  public void setAnyBic(List<String> anyBic) {
    this.anyBic = anyBic;
  }

  public AgentType1 role(PaymentsPartyType1Code role) {
    this.role = role;
    return this;
  }

   /**
   * Get role
   * @return role
  **/
  @ApiModelProperty(required = true, value = "")
  public PaymentsPartyType1Code getRole() {
    return role;
  }

  public void setRole(PaymentsPartyType1Code role) {
    this.role = role;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentType1 agentType1 = (AgentType1) o;
    return Objects.equals(this.anyBic, agentType1.anyBic) &&
        Objects.equals(this.role, agentType1.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anyBic, role);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentType1 {\n");
    
    sb.append("    anyBic: ").append(toIndentedString(anyBic)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
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

