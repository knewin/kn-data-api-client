package com.knewin.data.client.info;

import com.google.gson.annotations.SerializedName;

/**
 * Class that stores data about video.
 *
 * @since 1.0.0
 *
 */
public class VideoDataInfo extends OnlineDataInfo {

	@SerializedName("video_url")
	private String videoUrl;

	private String description;

	private String keywords;

	@SerializedName("start_image")
	private String startImage;

	private Integer duration;


	public String getVideoUrl() {
		return videoUrl;
	}


	public void setVideoUrl(final String videoUrl) {
		this.videoUrl = videoUrl;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(final String description) {
		this.description = description;
	}


	public String getKeywords() {
		return keywords;
	}


	public void setKeywords(final String keywords) {
		this.keywords = keywords;
	}


	public String getStartImage() {
		return startImage;
	}


	public void setStartImage(final String startImage) {
		this.startImage = startImage;
	}


	public Integer getDuration() {
		return duration;
	}


	public void setDuration(final Integer duration) {
		this.duration = duration;
	}


	@Override
	public String toString() {
		return "VideoDataInfo [videoUrl=" + videoUrl + ", description=" + description + ", keywords=" + keywords
			+ ", startImage=" + startImage + ", duration=" + duration + ", getOriginalUrl()=" + getOriginalUrl()
			+ ", getUrl()=" + getUrl() + ", getAuthor()=" + getAuthor() + ", getTitle()=" + getTitle() + ", getSubtitle()="
			+ getSubtitle() + ", getCategory()=" + getCategory() + ", getHat()=" + getHat() + ", getLocality()="
			+ getLocality() + ", getDomain()=" + getDomain() + ", getCrawledDate()=" + getCrawledDate() + ", getId()="
			+ getId() + ", getLanguage()=" + getLanguage() + ", getPublishedDate()=" + getPublishedDate()
			+ ", getSource()=" + getSource() + ", getSourceId()=" + getSourceId() + ", getSourceLocalities()="
			+ getSourceLocalities() + ", getTerms()=" + getTerms() + "]";
	}

}
