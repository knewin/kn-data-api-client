package com.knewin.data.client.info;

import java.util.stream.Stream;

public enum EditedNewsFilter {

	SHOULD(null), MUST(true), MUST_NOT(false);

	private Boolean value;

	private EditedNewsFilter(final Boolean value) {
		this.value = value;
	}


	public static EditedNewsFilter of(final Boolean value) {
		return Stream.of(EditedNewsFilter.values()).filter(f -> f.value == value).findFirst().get();
	}
}
