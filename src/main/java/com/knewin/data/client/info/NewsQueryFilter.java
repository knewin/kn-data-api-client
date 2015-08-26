package com.knewin.data.client.info;

import java.util.Set;

import com.google.gson.annotations.SerializedName;

/**
 * Class that defines filters to be used in conjunction with the query to search for news. <br>
 * <br>
 * This class should be used to make calls through POST requests.
 * 
 * @since 1.0.0
 */
public class NewsQueryFilter {

	@SerializedName("sourceId")
	private Set<Integer> sourceIdList;

	private Set<String> language;

	private String category;

	private String locality;

	@SerializedName("sinceCrawled")
	private String crawledSinceDate;

	@SerializedName("untilCrawled")
	private String crawledUntilDate;

	@SerializedName("sincePublished")
	private String publishedSinceDate;

	@SerializedName("untilPublished")
	private String publishedUntilDate;

	private SourceLocality sourceLocality;


	/**
	 * Get the category filter.
	 * 
	 * @return the category filter
	 */
	public String getCategory() {
		return this.category;
	}


	/**
	 * Get the crawled since date.<br>
	 * <br>
	 * <code>
	 * 	Format: YYYY-MM-DDThh:mm:ssTZD (eg., 1997-07-16T19:20:30+0300)
	 * </code>
	 * 
	 * @return the crawled since date
	 */
	public String getCrawledSinceDate() {
		return this.crawledSinceDate;
	}


	/**
	 * Get the crawled until date.<br>
	 * <br>
	 * <code>
	 * 	Format: YYYY-MM-DDThh:mm:ssTZD (e.g., 1997-07-16T19:20:30+0300)
	 * </code>
	 * 
	 * @return the crawled until date
	 */
	public String getCrawledUntilDate() {
		return this.crawledUntilDate;
	}


	/**
	 * Set a list of languages.
	 * 
	 * @return a list of languages
	 */
	public Set<String> getLanguage() {
		return this.language;
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
	 * Get the published since date. <br>
	 * <br>
	 * <code>
	 * 	Format: YYYY-MM-DDThh:mm:ssTZD (eg., 1997-07-16T19:20:30+0300)
	 * </code>
	 * 
	 * @return the published since date
	 */
	public String getPublishedSinceDate() {
		return this.publishedSinceDate;
	}


	/**
	 * Get the until published date.<br>
	 * <br>
	 * <code>
	 * 	Format: YYYY-MM-DDThh:mm:ssTZD (e.g., 1997-07-16T19:20:30+0300)
	 * </code>
	 * 
	 * @return the until published date
	 */
	public String getPublishedUntilDate() {
		return this.publishedUntilDate;
	}


	/**
	 * Get a list of source identification list.
	 * 
	 * @return a list of source identification list
	 */

	public Set<Integer> getSourceIdList() {
		return this.sourceIdList;
	}


	/**
	 * Get the {@link SourceLocality} instance.
	 * 
	 * @return the {@link SourceLocality} instance
	 */
	public SourceLocality getSourceLocality() {
		return this.sourceLocality;
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
	 * Set the crawled since date.<br>
	 * <br>
	 * <code>
	 * 	Format: YYYY-MM-DDThh:mm:ssTZD (e.g., 1997-07-16T19:20:30+0300)
	 * </code>
	 * 
	 * @param crawledSinceDate the crawled since date
	 */
	public void setCrawledSinceDate(final String crawledSinceDate) {
		this.crawledSinceDate = crawledSinceDate;
	}


	/**
	 * Set the crawled until date.<br>
	 * <br>
	 * <code>
	 * 	Format: YYYY-MM-DDThh:mm:ssTZD (e.g., 1997-07-16T19:20:30+0300)
	 * </code>
	 * 
	 * @param crawledUntilDate the crawled until date
	 */
	public void setCrawledUntilDate(final String crawledUntilDate) {
		this.crawledUntilDate = crawledUntilDate;
	}


	/**
	 * Set the list of languages.
	 * 
	 * @param language the list of languages
	 */
	public void setLanguage(final Set<String> language) {
		this.language = language;
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
	 * Set the published since date. <br>
	 * <br>
	 * <code>
	 * 	Format: YYYY-MM-DDThh:mm:ssTZD (e.g., 1997-07-16T19:20:30+0300)
	 * </code>
	 * 
	 * @param publishedSinceDate the published since date
	 */
	public void setPublishedSinceDate(final String publishedSinceDate) {
		this.publishedSinceDate = publishedSinceDate;
	}


	/**
	 * Set the published until date.<br>
	 * <br>
	 * <code>
	 * 	Format: YYYY-MM-DDThh:mm:ssTZD (e.g., 1997-07-16T19:20:30+0300)
	 * </code>
	 * 
	 * @param publishedUntilDate the published until date
	 */
	public void setPublishedUntilDate(final String publishedUntilDate) {
		this.publishedUntilDate = publishedUntilDate;
	}


	/**
	 * Set the source identification list.
	 * 
	 * @param sourceIdList the source identification list
	 */
	public void setSourceIdList(final Set<Integer> sourceIdList) {
		this.sourceIdList = sourceIdList;
	}


	/**
	 * Set a {@link SourceLocality} instance.
	 * 
	 * @param sourceLocality a {@link SourceLocality} instance
	 */
	public void setSourceLocality(final SourceLocality sourceLocality) {
		this.sourceLocality = sourceLocality;
	}


	@Override
	public String toString() {
		return "NewsQueryFilter [sourceIdList=" + this.sourceIdList + ", language=" + this.language + ", category=" + this.category
			+ ", locality=" + this.locality + ", crawledSinceDate=" + this.crawledSinceDate + ", crawledUntilDate="
			+ this.crawledUntilDate + ", publishedSinceDate=" + this.publishedSinceDate + ", publishedUntilDate="
			+ this.publishedUntilDate + ", sourceLocality=" + this.sourceLocality + "]";
	}

}
