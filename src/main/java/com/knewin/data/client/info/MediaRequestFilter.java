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

	private Boolean edited;

	public Set<Integer> getSourceIds() {
		return sourceIds;
	}


	public void setSourceIds(final Set<Integer> sourceIds) {
		this.sourceIds = sourceIds;
	}


	public Set<String> getLanguages() {
		return languages;
	}


	public void setLanguages(final Set<String> languages) {
		this.languages = languages;
	}


	public String getSinceBroadcast() {
		return sinceBroadcast;
	}


	public void setSinceBroadcast(final String sinceBroadcast) {
		this.sinceBroadcast = sinceBroadcast;
	}


	public String getUntilBroadcast() {
		return untilBroadcast;
	}


	public void setUntilBroadcast(final String untilBroadcast) {
		this.untilBroadcast = untilBroadcast;
	}


	public String getSinceCrawled() {
		return sinceCrawled;
	}


	public void setSinceCrawled(final String sinceCrawled) {
		this.sinceCrawled = sinceCrawled;
	}


	public String getUntilCrawled() {
		return untilCrawled;
	}


	public void setUntilCrawled(final String untilCrawled) {
		this.untilCrawled = untilCrawled;
	}


	public Boolean getEdited() {
		return edited;
	}


	public void setEdited(final Boolean edited) {
		this.edited = edited;
	}


	@Override
	public String toString() {
		return "MediaRequestFilter [sourceIds=" + sourceIds + ", languages=" + languages + ", sinceBroadcast=" + sinceBroadcast
			+ ", untilBroadcast=" + untilBroadcast + ", sinceCrawled=" + sinceCrawled + ", untilCrawled=" + untilCrawled
			+ ", edited=" + edited + "]";
	}

}
