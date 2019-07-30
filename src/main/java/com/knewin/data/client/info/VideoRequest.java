package com.knewin.data.client.info;

import java.util.Set;

public class VideoRequest implements DataRequestInfo {

	private String key;

	private String query;

	private int offset;

	private VideoRequestFilter filter;

	private RequestSort sort;

	private Set<Long> ids;

	private Set<String> fields;

	private String gmt;

	private String defaultOperator;

	private Boolean matchedTerms;

	private String matchedTermsQuery;


	private VideoRequest(Builder builder) {
		key = builder.key;
		query = builder.query;
		offset = builder.offset;
		filter = builder.filter;
		sort = builder.sort;
		ids = builder.ids;
		fields = builder.fields;
		gmt = builder.gmt;
		defaultOperator = builder.defaultOperator;
		matchedTerms = builder.matchedTerms;
		matchedTermsQuery = builder.matchedTermsQuery;
	}


	public VideoRequest() {
	}


	public String getKey() {
		return key;
	}


	public void setKey(String key) {
		this.key = key;
	}


	public String getQuery() {
		return query;
	}


	public void setQuery(String query) {
		this.query = query;
	}


	@Override
	public int getOffset() {
		return offset;
	}


	@Override
	public void setOffset(int offset) {
		this.offset = offset;
	}


	public VideoRequestFilter getFilter() {
		return filter;
	}


	public void setFilter(VideoRequestFilter filter) {
		this.filter = filter;
	}


	public RequestSort getSort() {
		return sort;
	}


	public void setSort(RequestSort sort) {
		this.sort = sort;
	}


	public Set<Long> getIds() {
		return ids;
	}


	public void setIds(Set<Long> ids) {
		this.ids = ids;
	}


	public Set<String> getFields() {
		return fields;
	}


	public void setFields(Set<String> fields) {
		this.fields = fields;
	}


	public String getGmt() {
		return gmt;
	}


	public void setGmt(String gmt) {
		this.gmt = gmt;
	}


	public String getDefaultOperator() {
		return defaultOperator;
	}


	public void setDefaultOperator(String defaultOperator) {
		this.defaultOperator = defaultOperator;
	}


	public Boolean getMatchedTerms() {
		return matchedTerms;
	}


	public void setMatchedTerms(Boolean matchedTerms) {
		this.matchedTerms = matchedTerms;
	}


	public String getMatchedTermsQuery() {
		return matchedTermsQuery;
	}


	public void setMatchedTermsQuery(String matchedTermsQuery) {
		this.matchedTermsQuery = matchedTermsQuery;
	}


	@Override
	public String toString() {
		return "VideoRequest [key=" + key + ", query=" + query + ", offset=" + offset + ", filter=" + filter + ", sort=" + sort
			+ ", ids=" + ids + ", fields=" + fields + ", gmt=" + gmt + ", defaultOperator=" + defaultOperator
			+ ", matchedTerms=" + matchedTerms + ", matchedTermsQuery=" + matchedTermsQuery + "]";
	}


	public static Builder builder() {
		return new Builder();
	}

	public static final class Builder {

		private String key;

		private String query;

		private int offset;

		private VideoRequestFilter filter;

		private RequestSort sort;

		private Set<Long> ids;

		private Set<String> fields;

		private String gmt;

		private String defaultOperator;

		private Boolean matchedTerms;

		private String matchedTermsQuery;


		private Builder() {
		}


		public Builder withKey(String key) {
			this.key = key;
			return this;
		}


		public Builder withQuery(String query) {
			this.query = query;
			return this;
		}


		public Builder withOffset(int offset) {
			this.offset = offset;
			return this;
		}


		public Builder withFilter(VideoRequestFilter filter) {
			this.filter = filter;
			return this;
		}


		public Builder withSort(RequestSort sort) {
			this.sort = sort;
			return this;
		}


		public Builder withIds(Set<Long> ids) {
			this.ids = ids;
			return this;
		}


		public Builder withFields(Set<String> fields) {
			this.fields = fields;
			return this;
		}


		public Builder withGmt(String gmt) {
			this.gmt = gmt;
			return this;
		}


		public Builder withDefaultOperator(String defaultOperator) {
			this.defaultOperator = defaultOperator;
			return this;
		}


		public Builder withMatchedTerms(Boolean matchedTerms) {
			this.matchedTerms = matchedTerms;
			return this;
		}


		public Builder withMatchedTermsQuery(String matchedTermsQuery) {
			this.matchedTermsQuery = matchedTermsQuery;
			return this;
		}


		public VideoRequest build() {
			return new VideoRequest(this);
		}
	}

}
