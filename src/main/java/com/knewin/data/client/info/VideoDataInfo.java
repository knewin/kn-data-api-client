package com.knewin.data.client.info;

import com.google.gson.annotations.SerializedName;

/**
 * Class that stores data about video.
 * 
 * @since 1.0.0
 * 
 */
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
	 * Get the author.
	 * 
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}


	/**
	 * Get the category.
	 * 
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}


	/**
	 * Get the description.
	 * 
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}


	/**
	 * Get the duration.
	 * 
	 * @return the duration
	 */
	public Integer getDuration() {
		return duration;
	}


	/**
	 * Get the hat.
	 * 
	 * @return the hat
	 */
	public String getHat() {
		return hat;
	}


	/**
	 * Get the keywords.
	 * 
	 * @return the keywords
	 */
	public String getKeywords() {
		return keywords;
	}


	/**
	 * Get the locality.
	 * 
	 * @return the locality
	 */
	public String getLocality() {
		return locality;
	}


	/**
	 * Get the start image URL.
	 * 
	 * @return the start image URL
	 */
	public String getStartImage() {
		return startImage;
	}


	/**
	 * Get the subtitle.
	 * 
	 * @return the subtitle
	 */
	public String getSubtitle() {
		return subtitle;
	}


	/**
	 * Get the title.
	 * 
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}


	/**
	 * Get the video URL.
	 * 
	 * @return the video URL
	 */
	public String getVideoUrl() {
		return videoUrl;
	}


	/**
	 * Set the author.
	 * 
	 * @param author the author
	 */
	public void setAuthor(final String author) {
		this.author = author;
	}


	/**
	 * Set the category.
	 * 
	 * @param category the category
	 */
	public void setCategory(final String category) {
		this.category = category;
	}


	/**
	 * Set the description.
	 * 
	 * @param description the description
	 */
	public void setDescription(final String description) {
		this.description = description;
	}


	/**
	 * Set the duration.
	 * 
	 * @param duration the duration
	 */
	public void setDuration(final Integer duration) {
		this.duration = duration;
	}


	/**
	 * Set the hat.
	 * 
	 * @param hat the hat
	 */
	public void setHat(final String hat) {
		this.hat = hat;
	}


	/**
	 * Set the keywords.
	 * 
	 * @param keywords the keywords
	 */
	public void setKeywords(final String keywords) {
		this.keywords = keywords;
	}


	/**
	 * Set the locality.
	 * 
	 * @param locality the locality
	 */
	public void setLocality(final String locality) {
		this.locality = locality;
	}


	/**
	 * Set the start image URL.
	 * 
	 * @param startImage the start image URL
	 */
	public void setStartImage(final String startImage) {
		this.startImage = startImage;
	}


	/**
	 * Set the subtitle.
	 * 
	 * @param subtitle the subtitle
	 */
	public void setSubtitle(final String subtitle) {
		this.subtitle = subtitle;
	}


	/**
	 * Set the title.
	 * 
	 * @param title the title
	 */
	public void setTitle(final String title) {
		this.title = title;
	}


	/**
	 * Set the video URL.
	 * 
	 * @param videoUrl the video URL
	 */
	public void setVideoUrl(final String videoUrl) {
		this.videoUrl = videoUrl;
	}


	@Override
	public String toString() {
		return "VideoDataInfo [videoUrl=" + videoUrl + ", title=" + title + ", subtitle=" + subtitle + ", description="
			+ description + ", category=" + category + ", keywords=" + keywords + ", locality=" + locality + ", author="
			+ author + ", hat=" + hat + ", startImage=" + startImage + ", duration=" + duration + "]";
	}

}
