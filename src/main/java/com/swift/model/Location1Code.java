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
 * Specifies the location of the search
 */
@JsonAdapter(Location1Code.Adapter.class)
public enum Location1Code {
  
  OTHR("OTHR"),
  
  MYIN("MYIN");

  private String value;

  Location1Code(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Location1Code fromValue(String text) {
    for (Location1Code b : Location1Code.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<Location1Code> {
    @Override
    public void write(final JsonWriter jsonWriter, final Location1Code enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Location1Code read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return Location1Code.fromValue(String.valueOf(value));
    }
  }
}

