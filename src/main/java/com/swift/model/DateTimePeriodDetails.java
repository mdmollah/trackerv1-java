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
 * Time span defined by a start date and time, and an end date and time.
 */
@ApiModel(description = "Time span defined by a start date and time, and an end date and time.")
public class DateTimePeriodDetails {
  @SerializedName("from_date_time")
  private String fromDateTime = null;

  @SerializedName("to_date_time")
  private String toDateTime = null;

  public DateTimePeriodDetails fromDateTime(String fromDateTime) {
    this.fromDateTime = fromDateTime;
    return this;
  }

   /**
   * Get fromDateTime
   * @return fromDateTime
  **/
  @ApiModelProperty(required = true, value = "")
  public String getFromDateTime() {
    return fromDateTime;
  }

  public void setFromDateTime(String fromDateTime) {
    this.fromDateTime = fromDateTime;
  }

  public DateTimePeriodDetails toDateTime(String toDateTime) {
    this.toDateTime = toDateTime;
    return this;
  }

   /**
   * Get toDateTime
   * @return toDateTime
  **/
  @ApiModelProperty(required = true, value = "")
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
    DateTimePeriodDetails dateTimePeriodDetails = (DateTimePeriodDetails) o;
    return Objects.equals(this.fromDateTime, dateTimePeriodDetails.fromDateTime) &&
        Objects.equals(this.toDateTime, dateTimePeriodDetails.toDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromDateTime, toDateTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DateTimePeriodDetails {\n");
    
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

