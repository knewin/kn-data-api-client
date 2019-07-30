package com.knewin.data.client.info;

import java.util.Set;

public class VideoRequestFilter {

	private Set<Integer> sourceIds;

	private Set<String> languages;

	private String category;

	private String locality;

	private Set<SourceLocality> sourceLocalities;

	private String sincePublished;

	private String untilPublished;

	private String sinceCrawled;

	private String untilCrawled;

	private String sinceUniversal;

	private String untilUniversal;


	private VideoRequestFilter(Builder builder) {
		sourceIds = builder.sourceIds;
		languages = builder.languages;
		category = builder.category;
		locality = builder.locality;
		sourceLocalities = builder.sourceLocalities;
		sincePublished = builder.sincePublished;
		untilPublished = builder.untilPublished;
		sinceCrawled = builder.sinceCrawled;
		untilCrawled = builder.untilCrawled;
		sinceUniversal = builder.sinceUniversal;
		untilUniversal = builder.untilUniversal;
	}


	public VideoRequestFilter() {
	}


	public Set<Integer> getSourceIds() {
		return sourceIds;
	}


	public void setSourceIds(Set<Integer> sourceIds) {
		this.sourceIds = sourceIds;
	}


	public Set<String> getLanguages() {
		return languages;
	}


	public void setLanguages(Set<String> languages) {
		this.languages = languages;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public String getLocality() {
		return locality;
	}


	public void setLocality(String locality) {
		this.locality = locality;
	}


	public Set<SourceLocality> getSourceLocalities() {
		return sourceLocalities;
	}


	public void setSourceLocalities(Set<SourceLocality> sourceLocalities) {
		this.sourceLocalities = sourceLocalities;
	}


	public String getSincePublished() {
		return sincePublished;
	}


	public void setSincePublished(String sincePublished) {
		this.sincePublished = sincePublished;
	}


	public String getUntilPublished() {
		return untilPublished;
	}


	public void setUntilPublished(String untilPublished) {
		this.untilPublished = untilPublished;
	}


	public String getSinceCrawled() {
		return sinceCrawled;
	}


	public void setSinceCrawled(String sinceCrawled) {
		this.sinceCrawled = sinceCrawled;
	}


	public String getUntilCrawled() {
		return untilCrawled;
	}


	public void setUntilCrawled(String untilCrawled) {
		this.untilCrawled = untilCrawled;
	}


	public String getSinceUniversal() {
		return sinceUniversal;
	}


	public void setSinceUniversal(String sinceUniversal) {
		this.sinceUniversal = sinceUniversal;
	}


	public String getUntilUniversal() {
		return untilUniversal;
	}


	public void setUntilUniversal(String untilUniversal) {
		this.untilUniversal = untilUniversal;
	}


	@Override
	public String toString() {
		return "VideoRequestFilter [sourceIds=" + sourceIds + ", languages=" + languages + ", category=" + category
			+ ", locality=" + locality + ", sourceLocalities=" + sourceLocalities + ", sincePublished=" + sincePublished
			+ ", untilPublished=" + untilPublished + ", sinceCrawled=" + sinceCrawled + ", untilCrawled=" + untilCrawled
			+ ", sinceUniversal=" + sinceUniversal + ", untilUniversal=" + untilUniversal + "]";
	}


	public static Builder builder() {
		return new Builder();
	}

	public static final class Builder {

		private Set<Integer> sourceIds;

		private Set<String> languages;

		private String category;

		private String locality;

		private Set<SourceLocality> sourceLocalities;

		private String sincePublished;

		private String untilPublished;

		private String sinceCrawled;

		private String untilCrawled;

		private String sinceUniversal;

		private String untilUniversal;


		private Builder() {
		}


		public Builder withSourceIds(Set<Integer> sourceIds) {
			this.sourceIds = sourceIds;
			return this;
		}


		public Builder withLanguages(Set<String> languages) {
			this.languages = languages;
			return this;
		}


		public Builder withCategory(String category) {
			this.category = category;
			return this;
		}


		public Builder withLocality(String locality) {
			this.locality = locality;
			return this;
		}


		public Builder withSourceLocalities(Set<SourceLocality> sourceLocalities) {
			this.sourceLocalities = sourceLocalities;
			return this;
		}


		public Builder withSincePublished(String sincePublished) {
			this.sincePublished = sincePublished;
			return this;
		}


		public Builder withUntilPublished(String untilPublished) {
			this.untilPublished = untilPublished;
			return this;
		}


		public Builder withSinceCrawled(String sinceCrawled) {
			this.sinceCrawled = sinceCrawled;
			return this;
		}


		public Builder withUntilCrawled(String untilCrawled) {
			this.untilCrawled = untilCrawled;
			return this;
		}


		public Builder withSinceUniversal(String sinceUniversal) {
			this.sinceUniversal = sinceUniversal;
			return this;
		}


		public Builder withUntilUniversal(String untilUniversal) {
			this.untilUniversal = untilUniversal;
			return this;
		}


		public VideoRequestFilter build() {
			return new VideoRequestFilter(this);
		}
	}

}
