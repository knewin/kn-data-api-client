package com.knewin.data.client.info;

import com.google.gson.annotations.SerializedName;

/**
 * Parent class that stores generic data.
 * 
 * @since 1.0.0
 * 
 */
public abstract class DataInfo {

	private Long id;

	private String url;

	@SerializedName("source_id")
	private Integer sourceId;

	private String source;

	@SerializedName("crawled_date")
	private String crawledDate;

	@SerializedName("published_date")
	private String publishedDate;

	@SerializedName("lang")
	private String language;


	/**
	 * Get the crawled date.
	 * 
	 * @return the crawled date
	 */
	public String getCrawledDate() {
		return crawledDate;
	}


	/**
	 * Get the identification.
	 * 
	 * @return the identification
	 */
	public Long getId() {
		return id;
	}


	/**
	 * Get the language.
	 * 
	 * @return the language
	 */
	public String getLanguage() {
		return language;
	}


	/**
	 * Get the published date.
	 * 
	 * @return the published date
	 */
	public String getPublishedDate() {
		return publishedDate;
	}


	/**
	 * Get the source name.
	 * 
	 * @return the source name
	 */
	public String getSource() {
		return source;
	}


	/**
	 * Get the source identification.
	 * 
	 * @return the source identification
	 */
	public Integer getSourceId() {
		return sourceId;
	}


	/**
	 * Get the URL.
	 * 
	 * @return the URL
	 */
	public String getUrl() {
		return url;
	}


	/**
	 * Set the crawled date.
	 * 
	 * @param crawledDate the crawled date
	 */
	public void setCrawledDate(final String crawledDate) {
		this.crawledDate = crawledDate;
	}


	/**
	 * Set the identification.
	 * 
	 * @param id the identification
	 */
	public void setId(final Long id) {
		this.id = id;
	}


	/**
	 * Set the language.
	 * 
	 * @param language the language
	 */
	public void setLanguage(final String language) {
		this.language = language;
	}


	/**
	 * Set the published date.
	 * 
	 * @param publishedDate the published date
	 */
	public void setPublishedDate(final String publishedDate) {
		this.publishedDate = publishedDate;
	}


	/**
	 * Set the source name.
	 * 
	 * @param source the source name
	 */
	public void setSource(final String source) {
		this.source = source;
	}


	/**
	 * Set the source identification.
	 * 
	 * @param sourceId the source identification
	 */
	public void setSourceId(final Integer sourceId) {
		this.sourceId = sourceId;
	}


	/**
	 * Set the URL.
	 * 
	 * @param url the URL
	 */
	public void setUrl(final String url) {
		this.url = url;
	}

}
