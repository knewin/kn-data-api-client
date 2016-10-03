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
		return this.videoUrl;
	}


	public void setVideoUrl(final String videoUrl) {
		this.videoUrl = videoUrl;
	}


	public String getDescription() {
		return this.description;
	}


	public void setDescription(final String description) {
		this.description = description;
	}


	public String getKeywords() {
		return this.keywords;
	}


	public void setKeywords(final String keywords) {
		this.keywords = keywords;
	}


	public String getStartImage() {
		return this.startImage;
	}


	public void setStartImage(final String startImage) {
		this.startImage = startImage;
	}


	public Integer getDuration() {
		return this.duration;
	}


	public void setDuration(final Integer duration) {
		this.duration = duration;
	}


	@Override
	public String toString() {
		return "VideoDataInfo [videoUrl=" + this.videoUrl + ", description=" + this.description + ", keywords=" + this.keywords
			+ ", startImage=" + this.startImage + ", duration=" + this.duration + ", getOriginalUrl()="
			+ this.getOriginalUrl() + ", getUrl()=" + this.getUrl() + ", getAuthor()=" + this.getAuthor() + ", getTitle()="
			+ this.getTitle() + ", getSubtitle()=" + this.getSubtitle() + ", getCategory()=" + this.getCategory()
			+ ", getHat()=" + this.getHat() + ", getLocality()=" + this.getLocality() + ", getDomain()=" + this.getDomain()
			+ ", getCrawledDate()=" + this.getCrawledDate() + ", getId()=" + this.getId() + ", getLanguage()="
			+ this.getLanguage() + ", getPublishedDate()=" + this.getPublishedDate() + ", getSource()=" + this.getSource()
			+ ", getSourceId()=" + this.getSourceId() + ", getSourceLocalities()=" + this.getSourceLocalities() + "]";
	}

}
