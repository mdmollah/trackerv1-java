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
 * This API is a payment events query to get invalid events for payment transactions within a given time frame. An event is either a payment or a status confirmation.[CR][LF]The API is typically used for support or audit purposes, where all invalid messages sent or received are retrievable by one API call.[CR][LF]
 */
@ApiModel(description = "This API is a payment events query to get invalid events for payment transactions within a given time frame. An event is either a payment or a status confirmation.[CR][LF]The API is typically used for support or audit purposes, where all invalid messages sent or received are retrievable by one API call.[CR][LF]")
public class GetInvalidEventsRequest {
  @SerializedName("my_institution")
  private List<String> myInstitution = new ArrayList<String>();

  @SerializedName("from_date_time")
  private String fromDateTime = null;

  @SerializedName("to_date_time")
  private String toDateTime = null;

  public GetInvalidEventsRequest myInstitution(List<String> myInstitution) {
    this.myInstitution = myInstitution;
    return this;
  }

  public GetInvalidEventsRequest addMyInstitutionItem(String myInstitutionItem) {
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

  public GetInvalidEventsRequest fromDateTime(String fromDateTime) {
    this.fromDateTime = fromDateTime;
    return this;
  }

   /**
   * Date and time at which the range starts.
   * @return fromDateTime
  **/
  @ApiModelProperty(required = true, value = "Date and time at which the range starts.")
  public String getFromDateTime() {
    return fromDateTime;
  }

  public void setFromDateTime(String fromDateTime) {
    this.fromDateTime = fromDateTime;
  }

  public GetInvalidEventsRequest toDateTime(String toDateTime) {
    this.toDateTime = toDateTime;
    return this;
  }

   /**
   * Date and time at which the range ends.
   * @return toDateTime
  **/
  @ApiModelProperty(required = true, value = "Date and time at which the range ends.")
  public String getToDateTime() {
    return toDateTime;
  }

  public void setToDateTime(String toDateTime) {
    this.toDateTime = toDateTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetInvalidEventsRequest getInvalidEventsRequest = (GetInvalidEventsRequest) o;
    return Objects.equals(this.myInstitution, getInvalidEventsRequest.myInstitution) &&
        Objects.equals(this.fromDateTime, getInvalidEventsRequest.fromDateTime) &&
        Objects.equals(this.toDateTime, getInvalidEventsRequest.toDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(myInstitution, fromDateTime, toDateTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetInvalidEventsRequest {\n");
    
    sb.append("    myInstitution: ").append(toIndentedString(myInstitution)).append("\n");
    sb.append("    fromDateTime: ").append(toIndentedString(fromDateTime)).append("\n");
    sb.append("    toDateTime: ").append(toIndentedString(toDateTime)).append("\n");
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

