package com.knewin.data.client.info;

import java.util.Set;

/**
 * Class that defines filters to be used in conjunction with the query to search for media.
 * 
 * @since 1.5.0
 */
public abstract class MediaRequestFilter {

	private Set<Integer> sourceIds;

	private Set<String> languages;

	private String sinceBroadcast;

	private String untilBroadcast;

	private String sinceCrawled;

	private String untilCrawled;


	public Set<Integer> getSourceIds() {
		return this.sourceIds;
	}


	public void setSourceIds(final Set<Integer> sourceIds) {
		this.sourceIds = sourceIds;
	}


	public Set<String> getLanguages() {
		return this.languages;
	}


	public void setLanguages(final Set<String> languages) {
		this.languages = languages;
	}


	public String getSinceBroadcast() {
		return this.sinceBroadcast;
	}


	public void setSinceBroadcast(final String sinceBroadcast) {
		this.sinceBroadcast = sinceBroadcast;
	}


	public String getUntilBroadcast() {
		return this.untilBroadcast;
	}


	public void setUntilBroadcast(final String untilBroadcast) {
		this.untilBroadcast = untilBroadcast;
	}


	public String getSinceCrawled() {
		return this.sinceCrawled;
	}


	public void setSinceCrawled(final String sinceCrawled) {
		this.sinceCrawled = sinceCrawled;
	}


	public String getUntilCrawled() {
		return this.untilCrawled;
	}


	public void setUntilCrawled(final String untilCrawled) {
		this.untilCrawled = untilCrawled;
	}


	@Override
	public String toString() {
		return "MediaRequestFilter [sourceIds=" + this.sourceIds + ", languages=" + this.languages + ", sinceBroadcast="
			+ this.sinceBroadcast + ", untilBroadcast=" + this.untilBroadcast + ", sinceCrawled=" + this.sinceCrawled
			+ ", untilCrawled=" + this.untilCrawled + "]";
	}

}
