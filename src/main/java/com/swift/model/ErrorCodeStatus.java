/*
 * Tracker API V1
 * Move your app forward with the gpi API
 *
 */


package com.swift.model;

import java.io.IOException;
import java.util.Objects;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import io.swagger.annotations.ApiModelProperty;

/**
 * ErrorCodeStatus
 */
public class ErrorCodeStatus {
  /**
   * Gets or Sets severity
   */
  @JsonAdapter(SeverityEnum.Adapter.class)
  public enum SeverityEnum {
    FATAL("Fatal"),
    
    TRANSIENT("Transient");

    private String value;

    SeverityEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SeverityEnum fromValue(String text) {
      for (SeverityEnum b : SeverityEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SeverityEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SeverityEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SeverityEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SeverityEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("severity")
  private SeverityEnum severity = null;

  /**
   * Gets or Sets code
   */
  @JsonAdapter(CodeEnum.Adapter.class)
  public enum CodeEnum {
    X001("X001"),
    
    X002("X002"),
    
    X003("X003"),
    
    X008("X008"),
    
    SW_GPI_INVALIDREQUEST("Sw.gpi.InvalidRequest"),
    
    SW_GPI_MANDATORYFIELDMISSING("Sw.gpi.MandatoryFieldMissing"),
    
    SW_GPI_MYINSTITUTIONAUTHORIZATIONFAILURE("Sw.gpi.MyInstitutionAuthorizationFailure"),
    
    SW_GPI_FROMAUTHORIZATIONFAILURE("Sw.gpi.FromAuthorizationFailure"),
    
    SW_GPI_NORESULTFOUND("Sw.gpi.NoResultFound"),
    
    SW_GPI_UNKNOWNTRANSACTION("Sw.gpi.UnknownTransaction"),
    
    SW_GPI_INVALIDRBACROLE("Sw.gpi.InvalidRBACRole"),
    
    SW_GPI_INTERNALERROR("Sw.gpi.InternalError"),
    
    SWAP001("SwAP001"),
    
    SWAP002("SwAP002"),
    
    SWAP003("SwAP003"),
    
    SWAP005("SwAP005"),
    
    SWAP006("SwAP006"),
    
    SWAP007("SwAP007"),
    
    SWAP008("SwAP008"),
    
    SWAP010("SwAP010"),
    
    SWAP009("SwAP009"),
    
    SWAP011("SwAP011"),
    
    SWAP099("SwAP099"),
    
    SWAP090("SwAP090");

    private String value;

    CodeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CodeEnum fromValue(String text) {
      for (CodeEnum b : CodeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<CodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CodeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CodeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("code")
  private CodeEnum code = null;

  @SerializedName("text")
  private String text = null;

  public ErrorCodeStatus severity(SeverityEnum severity) {
    this.severity = severity;
    return this;
  }

   /**
   * Get severity
   * @return severity
  **/
  @ApiModelProperty(required = true, value = "")
  public SeverityEnum getSeverity() {
    return severity;
  }

  public void setSeverity(SeverityEnum severity) {
    this.severity = severity;
  }

  public ErrorCodeStatus code(CodeEnum code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @ApiModelProperty(required = true, value = "")
  public CodeEnum getCode() {
    return code;
  }

  public void setCode(CodeEnum code) {
    this.code = code;
  }

  public ErrorCodeStatus text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Get text
   * @return text
  **/
  @ApiModelProperty(required = true, value = "")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorCodeStatus errorCodeStatus = (ErrorCodeStatus) o;
    return Objects.equals(this.severity, errorCodeStatus.severity) &&
        Objects.equals(this.code, errorCodeStatus.code) &&
        Objects.equals(this.text, errorCodeStatus.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(severity, code, text);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorCodeStatus {\n");
    
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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

