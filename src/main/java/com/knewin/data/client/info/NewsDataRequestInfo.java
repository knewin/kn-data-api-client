package com.knewin.data.client.info;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.google.gson.annotations.SerializedName;

/**
 * Class that stores query data to request news from web service.
 *
 * @since 1.0.0
 *
 */
public class NewsDataRequestInfo implements DataRequestInfo {

	private String key;

	private String query;

	private int offset;

	private Integer limit;

	private NewsQueryFilter filter;

	@SerializedName("newsId")
	private Set<Long> newsIdList;

	private Set<String> fields;

	private String gmt;

	private boolean groupSimilar;

	private Boolean showOriginalUrl;

	private NewsQuerySort sort;

	private String defaultOperator;

	private Boolean matchedTerms;

	private transient Map<String, String> headers = new HashMap<String, String>(1);

	private NewsDataRequestInfo(final Builder builder) {
		key = builder.key;
		query = builder.query;
		offset = builder.offset;
		limit = builder.limit;
		filter = builder.filter;
		newsIdList = builder.newsIdList;
		fields = builder.fields;
		gmt = builder.gmt;
		groupSimilar = builder.groupSimilar;
		showOriginalUrl = builder.showOriginalUrl;
		sort = builder.sort;
		defaultOperator = builder.defaultOperator;
		matchedTerms = builder.matchedTerms;
	}


	public NewsDataRequestInfo() {
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


	public Integer getLimit() {
		return limit;
	}


	public void setLimit(final Integer limit) {
		this.limit = limit;
	}


	public NewsQueryFilter getFilter() {
		return filter;
	}


	public void setFilter(final NewsQueryFilter filter) {
		this.filter = filter;
	}


	public Set<Long> getNewsIdList() {
		return newsIdList;
	}


	public void setNewsIdList(final Set<Long> newsIdList) {
		this.newsIdList = newsIdList;
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


	public boolean isGroupSimilar() {
		return groupSimilar;
	}


	public void setGroupSimilar(final boolean groupSimilar) {
		this.groupSimilar = groupSimilar;
	}


	public Boolean getShowOriginalUrl() {
		return showOriginalUrl;
	}


	public void setShowOriginalUrl(final Boolean showOriginalUrl) {
		this.showOriginalUrl = showOriginalUrl;
	}


	public NewsQuerySort getSort() {
		return sort;
	}


	public void setSort(final NewsQuerySort sort) {
		this.sort = sort;
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


	public void addHeader(final String name, final String value) {
		headers.put(name, value);
	}


	@Override
	public Map<String, String> getHeaders() {
		return headers == null ? Collections.emptyMap() : headers;
	}


	@Override
	public String toString() {
		return "NewsDataRequestInfo [key=" + key + ", query=" + query + ", offset=" + offset + ", limit=" + limit + ", filter="
			+ filter + ", newsIdList=" + newsIdList + ", fields=" + fields + ", gmt=" + gmt + ", groupSimilar="
			+ groupSimilar + ", showOriginalUrl=" + showOriginalUrl + ", sort=" + sort + ", defaultOperator="
			+ defaultOperator + ", matchedTerms=" + matchedTerms + "]";
	}


	public static Builder builder() {
		return new Builder();
	}

	public static final class Builder {

		private String key;

		private String query;

		private int offset;

		private Integer limit;

		private NewsQueryFilter filter;

		private Set<Long> newsIdList;

		private Set<String> fields;

		private String gmt;

		private boolean groupSimilar;

		private Boolean showOriginalUrl;

		private NewsQuerySort sort;

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


		public Builder withLimit(final Integer limit) {
			this.limit = limit;
			return this;
		}


		public Builder withFilter(final NewsQueryFilter filter) {
			this.filter = filter;
			return this;
		}


		public Builder withNewsIdList(final Set<Long> newsIdList) {
			this.newsIdList = newsIdList;
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


		public Builder withGroupSimilar(final boolean groupSimilar) {
			this.groupSimilar = groupSimilar;
			return this;
		}


		public Builder withShowOriginalUrl(final Boolean showOriginalUrl) {
			this.showOriginalUrl = showOriginalUrl;
			return this;
		}


		public Builder withSort(final NewsQuerySort sort) {
			this.sort = sort;
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


		public NewsDataRequestInfo build() {
			return new NewsDataRequestInfo(this);
		}
	}

}
