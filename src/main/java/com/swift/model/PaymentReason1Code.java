/*
 * Tracker API V1
 * Move your app forward with the gpi API
 *
 */

package com.swift.model;

import java.io.IOException;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Provides the reason for a specific Payment Status.
 */
@JsonAdapter(PaymentReason1Code.Adapter.class)
public enum PaymentReason1Code {
  
  G002("G002"),
  
  G004("G004"),
  
  G000("G000"),
  
  G001("G001"),
  
  G003("G003");

  private String value;

  PaymentReason1Code(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PaymentReason1Code fromValue(String text) {
    for (PaymentReason1Code b : PaymentReason1Code.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<PaymentReason1Code> {
    @Override
    public void write(final JsonWriter jsonWriter, final PaymentReason1Code enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PaymentReason1Code read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PaymentReason1Code.fromValue(String.valueOf(value));
    }
  }
}

