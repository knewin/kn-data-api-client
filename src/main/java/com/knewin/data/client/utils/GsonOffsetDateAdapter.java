package com.knewin.data.client.utils;

import java.lang.reflect.Type;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class GsonOffsetDateAdapter implements JsonSerializer<OffsetDateTime>, JsonDeserializer<OffsetDateTime> {

	private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ISO_OFFSET_DATE_TIME;

	@Override
	public OffsetDateTime deserialize(final JsonElement json, final Type typeOfT, final JsonDeserializationContext context)
		throws JsonParseException {
		return OffsetDateTime.parse(json.getAsJsonPrimitive().getAsString(), DATE_TIME_FORMATTER);
	}


	@Override
	public JsonElement serialize(final OffsetDateTime dateTime, final Type typeOfSrc, final JsonSerializationContext context) {
		return new JsonPrimitive(dateTime.format(DATE_TIME_FORMATTER));
	}

}
