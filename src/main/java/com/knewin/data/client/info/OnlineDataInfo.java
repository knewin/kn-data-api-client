package com.knewin.data.client.info;

/**
 * Class that stores online data.
 * 
 * @since 1.5.0
 *
 */
public abstract class OnlineDataInfo extends DataInfo {

	private String originalUrl;

	private String url;

	private String author;

	private String title;

	private String subtitle;

	private String category;

	private String hat;

	private String locality;

	private String domain;


	public String getOriginalUrl() {
		return this.originalUrl;
	}


	public void setOriginalUrl(final String originalUrl) {
		this.originalUrl = originalUrl;
	}


	public String getUrl() {
		return this.url;
	}


	public void setUrl(final String url) {
		this.url = url;
	}


	public String getAuthor() {
		return this.author;
	}


	public void setAuthor(final String author) {
		this.author = author;
	}


	public String getTitle() {
		return this.title;
	}


	public void setTitle(final String title) {
		this.title = title;
	}


	public String getSubtitle() {
		return this.subtitle;
	}


	public void setSubtitle(final String subtitle) {
		this.subtitle = subtitle;
	}


	public String getCategory() {
		return this.category;
	}


	public void setCategory(final String category) {
		this.category = category;
	}


	public String getHat() {
		return this.hat;
	}


	public void setHat(final String hat) {
		this.hat = hat;
	}


	public String getLocality() {
		return this.locality;
	}


	public void setLocality(final String locality) {
		this.locality = locality;
	}


	public String getDomain() {
		return this.domain;
	}


	public void setDomain(final String domain) {
		this.domain = domain;
	}

}
