package com.knewin.data.client.utils;

import java.io.IOException;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

public class TypeAdapterForOffsetDateTime extends TypeAdapter<OffsetDateTime> {

	@Override
	public void write(final JsonWriter out, final OffsetDateTime value) throws IOException {
		if (value == null) {
			out.nullValue();
		} else {
			out.value(value.toString());
		}
	}


	@Override
	public OffsetDateTime read(final JsonReader in) throws IOException {
		switch (in.peek()) {
		case STRING:
			return OffsetDateTime.parse(in.nextString());
		case NUMBER:
			return OffsetDateTime.ofInstant(Instant.ofEpochMilli(in.nextLong()), ZoneOffset.UTC);
		default:
			return null;
		}
	}

}
