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
		return "NewsDataInfo [content=" + this.content + ", similar=" + this.similar + ", imageHits=" + this.imageHits
			+ ", page=" + this.page + ", getOriginalUrl()=" + this.getOriginalUrl() + ", getUrl()=" + this.getUrl()
			+ ", getAuthor()=" + this.getAuthor() + ", getTitle()=" + this.getTitle() + ", getSubtitle()="
			+ this.getSubtitle() + ", getCategory()=" + this.getCategory() + ", getHat()=" + this.getHat()
			+ ", getLocality()=" + this.getLocality() + ", getDomain()=" + this.getDomain() + ", getCrawledDate()="
			+ this.getCrawledDate() + ", getId()=" + this.getId() + ", getLanguage()=" + this.getLanguage()
			+ ", getPublishedDate()=" + this.getPublishedDate() + ", getSource()=" + this.getSource() + ", getSourceId()="
			+ this.getSourceId() + ", getSourceLocalities()=" + this.getSourceLocalities() + "]";
	}

}
