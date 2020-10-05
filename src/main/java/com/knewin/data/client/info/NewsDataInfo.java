package com.knewin.data.client.info;

import java.time.OffsetDateTime;
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

	private OffsetDateTime editedTime;

	private String origin;

	/**
	 * Adds a similar doc to the list of similar docs.
	 *
	 * @param newDoc the similar doc.
	 */
	public void addSimilar(final NewsDataInfo newDoc) {
		if (similar == null) {
			similar = new ArrayList<>();
		}
		similar.add(newDoc);
	}


	public String getContent() {
		return content;
	}


	public void setContent(final String content) {
		this.content = content;
	}


	public Integer getContentLength() {
		return contentLength;
	}


	public void setContentLength(final Integer contentLength) {
		this.contentLength = contentLength;
	}


	public Collection<NewsDataInfo> getSimilar() {
		return similar;
	}


	public void setSimilar(final Collection<NewsDataInfo> similar) {
		this.similar = similar;
	}


	public Collection<ImageNewsDataInfo> getImageHits() {
		return imageHits;
	}


	public void setImageHits(final Collection<ImageNewsDataInfo> imageHits) {
		this.imageHits = imageHits;
	}


	public String getPage() {
		return page;
	}


	public void setPage(final String page) {
		this.page = page;
	}


	public OffsetDateTime getEditedTime() {
		return editedTime;
	}


	public void setEditedTime(final OffsetDateTime editedTime) {
		this.editedTime = editedTime;
	}


	public String getOrigin() {
		return origin;
	}


	public void setOrigin(final String origin) {
		this.origin = origin;
	}


	@Override
	public String toString() {
		return "NewsDataInfo [content=" + content + ", contentLength=" + contentLength + ", similar=" + similar
			+ ", imageHits=" + imageHits + ", page=" + page + ", editedTime=" + editedTime + ", origin=" + origin
			+ ", getOriginalUrl()=" + getOriginalUrl() + ", getUrl()=" + getUrl() + ", getAuthor()=" + getAuthor()
			+ ", getTitle()=" + getTitle() + ", getSubtitle()=" + getSubtitle() + ", getCategory()=" + getCategory()
			+ ", getHat()=" + getHat() + ", getLocality()=" + getLocality() + ", getDomain()=" + getDomain()
			+ ", getCrawledDate()=" + getCrawledDate() + ", getId()=" + getId() + ", getLanguage()=" + getLanguage()
			+ ", getPublishedDate()=" + getPublishedDate() + ", getSource()=" + getSource() + ", getSourceId()="
			+ getSourceId() + ", getSourceLocalities()=" + getSourceLocalities() + ", getTerms()=" + getTerms() + "]";
	}

}
