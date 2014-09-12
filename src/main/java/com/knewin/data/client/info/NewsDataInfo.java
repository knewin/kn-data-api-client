package com.knewin.data.client.info;

import java.util.ArrayList;
import java.util.Collection;

import com.google.gson.annotations.SerializedName;

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


	/**
	 * Default constructor.
	 */
	public NewsDataInfo() {
	}


	/**
	 * @return the domain
	 */
	public String getDomain() {
		return domain;
	}


	/**
	 * @param domain the domain to set
	 */
	public void setDomain(String domain) {
		this.domain = domain;
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
	 * @return the content
	 */
	public String getContent() {
		return content;
	}


	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}


	/**
	 * @return the similar
	 */
	public Collection<NewsDataInfo> getSimilar() {
		return similar;
	}


	/**
	 * @param similar the similar to set
	 */
	public void setSimilar(Collection<NewsDataInfo> similar) {
		this.similar = similar;
	}


	/**
	 * @return the imageHits
	 */
	public Collection<ImageNewsDataInfo> getImageHits() {
		return imageHits;
	}


	/**
	 * @param imageHits the imageHits to set
	 */
	public void setImageHits(Collection<ImageNewsDataInfo> imageHits) {
		this.imageHits = imageHits;
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
	 * @return the page
	 */
	public String getPage() {
		return page;
	}


	/**
	 * @param page the page to set
	 */
	public void setPage(String page) {
		this.page = page;
	}


	/**
	 * Adds a similar doc to the list of similar docs.
	 * 
	 * @param newDoc the similar doc.
	 */
	public void addSimilar(NewsDataInfo newDoc) {
		if (similar == null) {
			similar = new ArrayList<>();
		}
		similar.add(newDoc);
	}
}
