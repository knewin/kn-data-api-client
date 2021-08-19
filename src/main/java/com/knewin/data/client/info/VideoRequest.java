package com.knewin.data.client.info;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
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

	private transient Map<String, String> headers = new HashMap<String, String>(1);

	private VideoRequest(final Builder builder) {
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
	}


	public VideoRequest() {
	}


	public String getKey() {
		return key;
	}


	public void setKey(final String key) {
		this.key = key;
	}


	public String getQuery() {
		return query;
	}


	public void setQuery(final String query) {
		this.query = query;
	}


	@Override
	public int getOffset() {
		return offset;
	}


	@Override
	public void setOffset(final int offset) {
		this.offset = offset;
	}


	public VideoRequestFilter getFilter() {
		return filter;
	}


	public void setFilter(final VideoRequestFilter filter) {
		this.filter = filter;
	}


	public RequestSort getSort() {
		return sort;
	}


	public void setSort(final RequestSort sort) {
		this.sort = sort;
	}


	public Set<Long> getIds() {
		return ids;
	}


	public void setIds(final Set<Long> ids) {
		this.ids = ids;
	}


	public Set<String> getFields() {
		return fields;
	}


	public void setFields(final Set<String> fields) {
		this.fields = fields;
	}


	public String getGmt() {
		return gmt;
	}


	public void setGmt(final String gmt) {
		this.gmt = gmt;
	}


	public String getDefaultOperator() {
		return defaultOperator;
	}


	public void setDefaultOperator(final String defaultOperator) {
		this.defaultOperator = defaultOperator;
	}


	public Boolean getMatchedTerms() {
		return matchedTerms;
	}


	public void setMatchedTerms(final Boolean matchedTerms) {
		this.matchedTerms = matchedTerms;
	}


	@Override
	public Map<String, String> getHeaders() {
		return headers == null ? Collections.emptyMap() : headers;
	}


	public void addHeader(final String name, final String value) {
		headers.put(name, value);
	}


	@Override
	public String toString() {
		return "VideoRequest [key=" + key + ", query=" + query + ", offset=" + offset + ", filter=" + filter + ", sort=" + sort
			+ ", ids=" + ids + ", fields=" + fields + ", gmt=" + gmt + ", defaultOperator=" + defaultOperator
			+ ", matchedTerms=" + matchedTerms + "]";
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

		private Builder() {
		}


		public Builder withKey(final String key) {
			this.key = key;
			return this;
		}


		public Builder withQuery(final String query) {
			this.query = query;
			return this;
		}


		public Builder withOffset(final int offset) {
			this.offset = offset;
			return this;
		}


		public Builder withFilter(final VideoRequestFilter filter) {
			this.filter = filter;
			return this;
		}


		public Builder withSort(final RequestSort sort) {
			this.sort = sort;
			return this;
		}


		public Builder withIds(final Set<Long> ids) {
			this.ids = ids;
			return this;
		}


		public Builder withFields(final Set<String> fields) {
			this.fields = fields;
			return this;
		}


		public Builder withGmt(final String gmt) {
			this.gmt = gmt;
			return this;
		}


		public Builder withDefaultOperator(final String defaultOperator) {
			this.defaultOperator = defaultOperator;
			return this;
		}


		public Builder withMatchedTerms(final Boolean matchedTerms) {
			this.matchedTerms = matchedTerms;
			return this;
		}


		public VideoRequest build() {
			return new VideoRequest(this);
		}
	}

}
