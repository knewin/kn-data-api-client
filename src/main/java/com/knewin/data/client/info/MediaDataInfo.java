package com.knewin.data.client.info;

/**
 * Class that stores media data.
 * 
 * @since 1.5.0
 *
 */
public abstract class MediaDataInfo extends DataInfo {

	private String mediaUrl;

	private String startTime;

	private String endTime;

	private Integer duration;

	private String content;


	public String getMediaUrl() {
		return this.mediaUrl;
	}


	public void setMediaUrl(final String mediaUrl) {
		this.mediaUrl = mediaUrl;
	}


	public String getStartTime() {
		return this.startTime;
	}


	public void setStartTime(final String startTime) {
		this.startTime = startTime;
	}


	public String getEndTime() {
		return this.endTime;
	}


	public void setEndTime(final String endTime) {
		this.endTime = endTime;
	}


	public Integer getDuration() {
		return this.duration;
	}


	public void setDuration(final Integer duration) {
		this.duration = duration;
	}


	public String getContent() {
		return this.content;
	}


	public void setContent(final String content) {
		this.content = content;
	}

}
