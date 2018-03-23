package com.knewin.data.client.info;

import java.util.List;

import com.knewin.data.client.info.media.Part;

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

	private String title;

	private String content;

	private List<Part> times;


	public String getMediaUrl() {
		return mediaUrl;
	}


	public void setMediaUrl(final String mediaUrl) {
		this.mediaUrl = mediaUrl;
	}


	public String getStartTime() {
		return startTime;
	}


	public void setStartTime(final String startTime) {
		this.startTime = startTime;
	}


	public String getEndTime() {
		return endTime;
	}


	public void setEndTime(final String endTime) {
		this.endTime = endTime;
	}


	public Integer getDuration() {
		return duration;
	}


	public void setDuration(final Integer duration) {
		this.duration = duration;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getContent() {
		return content;
	}


	public void setContent(final String content) {
		this.content = content;
	}


	public List<Part> getTimes() {
		return times;
	}


	public void setTimes(final List<Part> times) {
		this.times = times;
	}

}
