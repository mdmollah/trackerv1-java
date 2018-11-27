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
 * Specifies the type of amount.
 */
@JsonAdapter(TypeOfAmount8Code.Adapter.class)
public enum TypeOfAmount8Code {
  
  CONF("CONF"),
  
  INST("INST");

  private String value;

  TypeOfAmount8Code(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TypeOfAmount8Code fromValue(String text) {
    for (TypeOfAmount8Code b : TypeOfAmount8Code.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<TypeOfAmount8Code> {
    @Override
    public void write(final JsonWriter jsonWriter, final TypeOfAmount8Code enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public TypeOfAmount8Code read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return TypeOfAmount8Code.fromValue(String.valueOf(value));
    }
  }
}

