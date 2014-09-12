package com.knewin.data.client.info;

import com.google.gson.annotations.SerializedName;

public class VideoDataInfo extends DataInfo {

	@SerializedName("video_url")
	private String videoUrl;

	private String title;

	private String subtitle;

	private String description;

	private String category;

	private String keywords;

	private String locality;

	private String author;

	private String hat;

	@SerializedName("start_image")
	private String startImage;

	private Integer duration;


	/**
	 * @return the videoUrl
	 */
	public String getVideoUrl() {
		return videoUrl;
	}


	/**
	 * @param videoUrl the videoUrl to set
	 */
	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
	}


	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}


	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}


	/**
	 * @return the subtitle
	 */
	public String getSubtitle() {
		return subtitle;
	}


	/**
	 * @param subtitle the subtitle to set
	 */
	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}


	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}


	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}


	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}


	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}


	/**
	 * @return the keywords
	 */
	public String getKeywords() {
		return keywords;
	}


	/**
	 * @param keywords the keywords to set
	 */
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}


	/**
	 * @return the locality
	 */
	public String getLocality() {
		return locality;
	}


	/**
	 * @param locality the locality to set
	 */
	public void setLocality(String locality) {
		this.locality = locality;
	}


	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}


	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}


	/**
	 * @return the hat
	 */
	public String getHat() {
		return hat;
	}


	/**
	 * @param hat the hat to set
	 */
	public void setHat(String hat) {
		this.hat = hat;
	}


	/**
	 * @return the startImage
	 */
	public String getStartImage() {
		return startImage;
	}


	/**
	 * @param startImage the startImage to set
	 */
	public void setStartImage(String startImage) {
		this.startImage = startImage;
	}


	/**
	 * @return the duration
	 */
	public Integer getDuration() {
		return duration;
	}


	/**
	 * @param duration the duration to set
	 */
	public void setDuration(Integer duration) {
		this.duration = duration;
	}
}
