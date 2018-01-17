package com.knewin.data.client.info.media;

/**
 * Represents a transcribed word.
 */
public class Word {

	private Double begin;

	private Double end;

	private String word;


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


	public String getWord() {
		return word;
	}


	public void setWord(final String word) {
		this.word = word;
	}

}
