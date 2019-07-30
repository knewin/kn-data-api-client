package com.knewin.data.client.info;

import java.util.Collection;

import com.google.gson.annotations.SerializedName;

/**
 * Parent class that stores generic data.
 *
 */
public abstract class DataInfo {

	private Long id;

	@SerializedName("source_id")
	private Integer sourceId;

	private String source;

	@SerializedName("crawled_date")
	private String crawledDate;

	@SerializedName("published_date")
	private String publishedDate;

	@SerializedName("lang")
	private String language;

	@SerializedName("source_locality")
	private Collection<SourceLocalityInfo> sourceLocalities;

	private Collection<String> terms;


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
	 * @return the source localities
	 */
	public Collection<SourceLocalityInfo> getSourceLocalities() {
		return sourceLocalities;
	}


	/**
	 * @return the matched terms
	 */
	public Collection<String> getTerms() {
		return terms;
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
	 * @param sourceLocalities the source localities
	 */
	public void setSourceLocalities(final Collection<SourceLocalityInfo> sourceLocalities) {
		this.sourceLocalities = sourceLocalities;
	}


	/**
	 * @param terms the matched terms
	 */
	public void setTerms(Collection<String> terms) {
		this.terms = terms;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}


	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		final DataInfo other = (DataInfo) obj;
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		return true;
	}

}
