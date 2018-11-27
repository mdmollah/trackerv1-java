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
 * Specifies the status of a single payment transaction.
 */
@JsonAdapter(TransactionIndividualStatus4Code.Adapter.class)
public enum TransactionIndividualStatus4Code {
  
  RJCT("RJCT"),
  
  ACSP("ACSP"),
  
  ACSC("ACSC");

  private String value;

  TransactionIndividualStatus4Code(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TransactionIndividualStatus4Code fromValue(String text) {
    for (TransactionIndividualStatus4Code b : TransactionIndividualStatus4Code.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<TransactionIndividualStatus4Code> {
    @Override
    public void write(final JsonWriter jsonWriter, final TransactionIndividualStatus4Code enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public TransactionIndividualStatus4Code read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return TransactionIndividualStatus4Code.fromValue(String.valueOf(value));
    }
  }
}

