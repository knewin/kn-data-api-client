package com.knewin.data.client.info;

import java.util.Set;

/**
 * Class that stores query data to request radio from web service.
 *
 * @since 1.5.0
 */
public class RadioRequestInfo extends MediaRequestInfo<RadioRequestFilter> {

	private RadioRequestInfo(Builder builder) {
		key = builder.key;
		query = builder.query;
		offset = builder.offset;
		filter = builder.filter;
		gmt = builder.gmt;
		sort = builder.sort;
		ids = builder.ids;
		showTimes = builder.showTimes;
		matchedTerms = builder.matchedTerms;
		matchedTermsQuery = builder.matchedTermsQuery;
	}


	public RadioRequestInfo() {
	}


	@Override
	public String toString() {
		return "RadioRequestInfo [getKey()=" + getKey() + ", getQuery()=" + getQuery() + ", getOffset()=" + getOffset()
			+ ", getFilter()=" + getFilter() + ", getGmt()=" + getGmt() + ", getSort()=" + getSort() + ", getIds()="
			+ getIds() + ", getShowTimes()=" + getShowTimes() + ", getMatchedTerms()=" + getMatchedTerms()
			+ ", getMatchedTermsQuery()=" + getMatchedTermsQuery() + "]";
	}


	public static Builder builder() {
		return new Builder();
	}

	public static final class Builder {

		private String key;

		private String query;

		private int offset;

		private RadioRequestFilter filter;

		private String gmt;

		private RequestSort sort;

		private Set<Long> ids;

		private Boolean showTimes;

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


		public Builder withFilter(RadioRequestFilter filter) {
			this.filter = filter;
			return this;
		}


		public Builder withGmt(String gmt) {
			this.gmt = gmt;
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


		public Builder withShowTimes(Boolean showTimes) {
			this.showTimes = showTimes;
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


		public RadioRequestInfo build() {
			return new RadioRequestInfo(this);
		}
	}

}
