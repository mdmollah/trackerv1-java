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
 * Specifies which party/parties will bear the charges associated with the processing of the payment transaction.
 */
@JsonAdapter(ChargeBearerType3Code.Adapter.class)
public enum ChargeBearerType3Code {
  
  SHAR("SHAR"),
  
  DEBT("DEBT"),
  
  CRED("CRED");

  private String value;

  ChargeBearerType3Code(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ChargeBearerType3Code fromValue(String text) {
    for (ChargeBearerType3Code b : ChargeBearerType3Code.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ChargeBearerType3Code> {
    @Override
    public void write(final JsonWriter jsonWriter, final ChargeBearerType3Code enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ChargeBearerType3Code read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ChargeBearerType3Code.fromValue(String.valueOf(value));
    }
  }
}

