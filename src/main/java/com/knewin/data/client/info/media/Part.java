package com.knewin.data.client.info.media;

import java.util.List;

import com.google.gson.annotations.SerializedName;

/**
 * Represents each transcribed part (phrase).
 */
public class Part {

	@SerializedName("displaytext")
	private String displayText;

	private Double begin;

	private Double end;

	private List<Word> words;


	public String getDisplayText() {
		return displayText;
	}


	public void setDisplayText(final String displayText) {
		this.displayText = displayText;
	}


	public Double getBegin() {
		return begin;
	}


	public void setBegin(final Double begin) {
		this.begin = begin;
	}


	public Double getEnd() {
		return end;
	}


	public void setEnd(final Double end) {
		this.end = end;
	}


	public List<Word> getWords() {
		return words;
	}


	public void setWords(final List<Word> words) {
		this.words = words;
	}


	@Override
	public String toString() {
		return "Part [displayText=" + displayText + "]";
	}

}
