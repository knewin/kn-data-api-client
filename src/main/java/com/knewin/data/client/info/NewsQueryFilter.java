package com.knewin.data.client.info;

import java.util.LinkedHashSet;
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

	private transient Set<SourceLocality> sourceLocalities = new LinkedHashSet<>();

	@SerializedName("sinceUniversal")
	private String universalSinceDate;

	@SerializedName("untilUniversal")
	private String universalUntilDate;

	private EditedNewsFilter edited;

	private NewsQueryFilter(final Builder builder) {
		sourceIdList = builder.sourceIdList;
		language = builder.language;
		category = builder.category;
		locality = builder.locality;
		crawledSinceDate = builder.crawledSinceDate;
		crawledUntilDate = builder.crawledUntilDate;
		publishedSinceDate = builder.publishedSinceDate;
		publishedUntilDate = builder.publishedUntilDate;
		sourceLocality = builder.sourceLocality;
		sourceLocalities = builder.sourceLocalities;
		universalSinceDate = builder.universalSinceDate;
		universalUntilDate = builder.universalUntilDate;
		edited = builder.edited;
	}


	public NewsQueryFilter() {
	}


	/**
	 * Adds a {@link SourceLocality}.
	 *
	 * @param sourceLocality a {@link SourceLocality} instance
	 */
	public void addSourceLocality(final SourceLocality sourceLocality) {
		sourceLocalities.add(sourceLocality);
	}


	/**
	 * Get the category filter.
	 *
	 * @return the category filter
	 */
	public String getCategory() {
		return category;
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
		return crawledSinceDate;
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
		return crawledUntilDate;
	}


	/**
	 * Set a list of languages.
	 *
	 * @return a list of languages
	 */
	public Set<String> getLanguage() {
		return language;
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
	 * Get the published since date. <br>
	 * <br>
	 * <code>
	 * 	Format: YYYY-MM-DDThh:mm:ssTZD (eg., 1997-07-16T19:20:30+0300)
	 * </code>
	 *
	 * @return the published since date
	 */
	public String getPublishedSinceDate() {
		return publishedSinceDate;
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
		return publishedUntilDate;
	}


	/**
	 * Get a list of source identification list.
	 *
	 * @return a list of source identification list
	 */

	public Set<Integer> getSourceIdList() {
		return sourceIdList;
	}


	/**
	 * Get the {@link SourceLocality} instance.
	 *
	 * @return the {@link SourceLocality} instance
	 */
	SourceLocality getSourceLocality() {
		return sourceLocality;
	}


	/**
	 * Gets a collection of {@link SourceLocality}'s.
	 *
	 * @return the {@link SourceLocality}'s
	 */
	public Set<SourceLocality> getSourceLocalities() {
		return sourceLocalities;
	}


	/**
	 * Get the universal since date. <br>
	 * <br>
	 * <code>
	 * 	Format: YYYY-MM-DDThh:mm:ssTZD (eg., 1997-07-16T19:20:30+0300)
	 * </code>
	 *
	 * @return the universal since date
	 */
	public String getUniversalSinceDate() {
		return universalSinceDate;
	}


	/**
	 * Get the until universal date.<br>
	 * <br>
	 * <code>
	 * 	Format: YYYY-MM-DDThh:mm:ssTZD (e.g., 1997-07-16T19:20:30+0300)
	 * </code>
	 *
	 * @return the until universal date
	 */
	public String getUniversalUntilDate() {
		return universalUntilDate;
	}


	public EditedNewsFilter getEdited() {
		return edited;
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
	void setSourceLocality(final SourceLocality sourceLocality) {
		this.sourceLocality = sourceLocality;
	}


	/**
	 * Set the universal since date.<br>
	 * <br>
	 * <code>
	 * 	Format: YYYY-MM-DDThh:mm:ssTZD (e.g., 1997-07-16T19:20:30+0300)
	 * </code>
	 *
	 * @param universalSinceDate the universal since date
	 */
	public void setUniversalSinceDate(final String universalSinceDate) {
		this.universalSinceDate = universalSinceDate;
	}


	/**
	 * Set the universal until date.<br>
	 * <br>
	 * <code>
	 * 	Format: YYYY-MM-DDThh:mm:ssTZD (e.g., 1997-07-16T19:20:30+0300)
	 * </code>
	 *
	 * @param universalUntilDate the universal until date
	 */
	public void setUniversalUntilDate(final String universalUntilDate) {
		this.universalUntilDate = universalUntilDate;
	}


	public void setEdited(final EditedNewsFilter edited) {
		this.edited = edited;
	}


	@Override
	public String toString() {
		return "NewsQueryFilter [sourceIdList=" + sourceIdList + ", language=" + language + ", category=" + category
			+ ", locality=" + locality + ", crawledSinceDate=" + crawledSinceDate + ", crawledUntilDate="
			+ crawledUntilDate + ", publishedSinceDate=" + publishedSinceDate + ", publishedUntilDate="
			+ publishedUntilDate + ", sourceLocality=" + sourceLocality + ", universalSinceDate=" + universalSinceDate
			+ ", universalUntilDate=" + universalUntilDate + ", edited=" + edited + "]";
	}


	public static Builder builder() {
		return new Builder();
	}

	public static final class Builder {

		private Set<Integer> sourceIdList;

		private Set<String> language;

		private String category;

		private String locality;

		private String crawledSinceDate;

		private String crawledUntilDate;

		private String publishedSinceDate;

		private String publishedUntilDate;

		private SourceLocality sourceLocality;

		private Set<SourceLocality> sourceLocalities;

		private String universalSinceDate;

		private String universalUntilDate;

		private EditedNewsFilter edited;

		private Builder() {
		}


		public Builder withSourceIdList(final Set<Integer> sourceIdList) {
			this.sourceIdList = sourceIdList;
			return this;
		}


		public Builder withLanguage(final Set<String> language) {
			this.language = language;
			return this;
		}


		public Builder withCategory(final String category) {
			this.category = category;
			return this;
		}


		public Builder withLocality(final String locality) {
			this.locality = locality;
			return this;
		}


		public Builder withCrawledSinceDate(final String crawledSinceDate) {
			this.crawledSinceDate = crawledSinceDate;
			return this;
		}


		public Builder withCrawledUntilDate(final String crawledUntilDate) {
			this.crawledUntilDate = crawledUntilDate;
			return this;
		}


		public Builder withPublishedSinceDate(final String publishedSinceDate) {
			this.publishedSinceDate = publishedSinceDate;
			return this;
		}


		public Builder withPublishedUntilDate(final String publishedUntilDate) {
			this.publishedUntilDate = publishedUntilDate;
			return this;
		}


		public Builder withSourceLocality(final SourceLocality sourceLocality) {
			this.sourceLocality = sourceLocality;
			return this;
		}


		public Builder withSourceLocalities(final Set<SourceLocality> sourceLocalities) {
			this.sourceLocalities = sourceLocalities;
			return this;
		}


		public Builder withUniversalSinceDate(final String universalSinceDate) {
			this.universalSinceDate = universalSinceDate;
			return this;
		}


		public Builder withUniversalUntilDate(final String universalUntilDate) {
			this.universalUntilDate = universalUntilDate;
			return this;
		}


		public Builder withEdited(final EditedNewsFilter edited) {
			this.edited = edited;
			return this;
		}


		public NewsQueryFilter build() {
			return new NewsQueryFilter(this);
		}
	}

}
