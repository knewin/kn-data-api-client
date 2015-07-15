package com.knewin.data.client.info;

import java.util.ArrayList;
import java.util.Collection;

import com.google.gson.annotations.SerializedName;

/**
 * Class that stores news data.
 * 
 * @since 1.0.0
 * 
 */
public class NewsDataInfo extends DataInfo {

	private String domain;

	private String title;

	private String subtitle;

	private String author;

	private String content;

	private Collection<NewsDataInfo> similar = null;

	@SerializedName("image_hits")
	private Collection<ImageNewsDataInfo> imageHits = null;

	private String category;

	private String hat;

	private String locality;

	private String page;

	private String originalUrl;


	/**
	 * Adds a similar doc to the list of similar docs.
	 * 
	 * @param newDoc the similar doc.
	 */
	public void addSimilar(final NewsDataInfo newDoc) {
		if (this.similar == null) {
			this.similar = new ArrayList<>();
		}
		this.similar.add(newDoc);
	}


	/**
	 * Get the author.
	 * 
	 * @return the author
	 */
	public String getAuthor() {
		return this.author;
	}


	/**
	 * Get the category.
	 * 
	 * @return the category
	 */
	public String getCategory() {
		return this.category;
	}


	/**
	 * Get the content.
	 * 
	 * @return the content
	 */
	public String getContent() {
		return this.content;
	}


	/**
	 * Get the domain.
	 * 
	 * @return the domain
	 */
	public String getDomain() {
		return this.domain;
	}


	/**
	 * Get the hat.
	 * 
	 * @return the hat
	 */
	public String getHat() {
		return this.hat;
	}


	/**
	 * Get a list of {@link ImageNewsDataInfo} instances.
	 * 
	 * @return a list of images
	 */
	public Collection<ImageNewsDataInfo> getImageHits() {
		return this.imageHits;
	}


	/**
	 * Get the locality.
	 * 
	 * @return the locality
	 */
	public String getLocality() {
		return this.locality;
	}


	/**
	 * Get the page.
	 * 
	 * @return the page
	 */
	public String getPage() {
		return this.page;
	}


	/**
	 * Get a list of similar news.
	 * 
	 * @return a list of similar news
	 */
	public Collection<NewsDataInfo> getSimilar() {
		return this.similar;
	}


	/**
	 * Get the subtitle.
	 * 
	 * @return the subtitle
	 */
	public String getSubtitle() {
		return this.subtitle;
	}


	/**
	 * The the title.
	 * 
	 * @return the title
	 */
	public String getTitle() {
		return this.title;
	}


	public String getOriginalUrl() {
		return this.originalUrl;
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
	 * Set the content.
	 * 
	 * @param content the content
	 */
	public void setContent(final String content) {
		this.content = content;
	}


	/**
	 * Set the domain.
	 * 
	 * @param domain the domain
	 */
	public void setDomain(final String domain) {
		this.domain = domain;
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
	 * Set a list of {@link ImageNewsDataInfo} instances.
	 * 
	 * @param imageHits a list of images
	 */
	public void setImageHits(final Collection<ImageNewsDataInfo> imageHits) {
		this.imageHits = imageHits;
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
	 * Set the page.
	 * 
	 * @param page the page
	 */
	public void setPage(final String page) {
		this.page = page;
	}


	/**
	 * Set a list of similar news.
	 * 
	 * @param similar a list of similar news
	 */
	public void setSimilar(final Collection<NewsDataInfo> similar) {
		this.similar = similar;
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


	public void setOriginalUrl(final String originalUrl) {
		this.originalUrl = originalUrl;
	}


	@Override
	public String toString() {
		return "NewsDataInfo [domain=" + this.domain + ", title=" + this.title + ", subtitle=" + this.subtitle + ", author="
			+ this.author + ", content=" + this.content + ", similar=" + this.similar + ", imageHits=" + this.imageHits
			+ ", category=" + this.category + ", hat=" + this.hat + ", locality=" + this.locality + ", page=" + this.page
			+ "]";
	}

}
