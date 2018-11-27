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
 * This API is a payment events response to a query to get invalid events for payment transactions within a given time frame. An event is either a payment or a status confirmation.[CR][LF]The API is typically used for support or audit purposes, where all invalid messages sent or received are retrievable by one API call.[CR][LF]
 */
@ApiModel(description = "This API is a payment events response to a query to get invalid events for payment transactions within a given time frame. An event is either a payment or a status confirmation.[CR][LF]The API is typically used for support or audit purposes, where all invalid messages sent or received are retrievable by one API call.[CR][LF]")
public class GetInvalidEventsResponse {
  @SerializedName("event")
  private List<PaymentEvent3> event = new ArrayList<PaymentEvent3>();

  public GetInvalidEventsResponse event(List<PaymentEvent3> event) {
    this.event = event;
    return this;
  }

  public GetInvalidEventsResponse addEventItem(PaymentEvent3 eventItem) {
    this.event.add(eventItem);
    return this;
  }

   /**
   * Each instance contains one payment event that matches the search criteria.
   * @return event
  **/
  @ApiModelProperty(required = true, value = "Each instance contains one payment event that matches the search criteria.")
  public List<PaymentEvent3> getEvent() {
    return event;
  }

  public void setEvent(List<PaymentEvent3> event) {
    this.event = event;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetInvalidEventsResponse getInvalidEventsResponse = (GetInvalidEventsResponse) o;
    return Objects.equals(this.event, getInvalidEventsResponse.event);
  }

  @Override
  public int hashCode() {
    return Objects.hash(event);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetInvalidEventsResponse {\n");
    
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
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

