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
public class NewsDataInfo extends OnlineDataInfo {

	private String content;

	@SerializedName("content_length")
	private Integer contentLength;

	private Collection<NewsDataInfo> similar;

	@SerializedName("image_hits")
	private Collection<ImageNewsDataInfo> imageHits;

	private String page;


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


	public String getContent() {
		return this.content;
	}


	public void setContent(final String content) {
		this.content = content;
	}


	public Integer getContentLength() {
		return this.contentLength;
	}


	public void setContentLength(Integer contentLength) {
		this.contentLength = contentLength;
	}


	public Collection<NewsDataInfo> getSimilar() {
		return this.similar;
	}


	public void setSimilar(final Collection<NewsDataInfo> similar) {
		this.similar = similar;
	}


	public Collection<ImageNewsDataInfo> getImageHits() {
		return this.imageHits;
	}


	public void setImageHits(final Collection<ImageNewsDataInfo> imageHits) {
		this.imageHits = imageHits;
	}


	public String getPage() {
		return this.page;
	}


	public void setPage(final String page) {
		this.page = page;
	}


	@Override
	public String toString() {
		return "NewsDataInfo [content=" + this.content + ", contentLength=" + this.contentLength + ", similar=" + this.similar
			+ ", imageHits=" + this.imageHits + ", page=" + this.page + ", getOriginalUrl()=" + getOriginalUrl()
			+ ", getUrl()=" + getUrl() + ", getAuthor()=" + getAuthor() + ", getTitle()=" + getTitle() + ", getSubtitle()="
			+ getSubtitle() + ", getCategory()=" + getCategory() + ", getHat()=" + getHat() + ", getLocality()="
			+ getLocality() + ", getDomain()=" + getDomain() + ", getCrawledDate()=" + getCrawledDate() + ", getId()="
			+ getId() + ", getLanguage()=" + getLanguage() + ", getPublishedDate()=" + getPublishedDate()
			+ ", getSource()=" + getSource() + ", getSourceId()=" + getSourceId() + ", getSourceLocalities()="
			+ getSourceLocalities() + ", getTerms()=" + getTerms() + "]";
	}

}
