package com.knewin.data.client.info;

import java.util.Set;

/**
 * Class that stores query data to request tv from web service.
 *
 * @since 1.5.0
 */
public class TvRequestInfo extends MediaRequestInfo<TvRequestFilter> {

	private TvRequestInfo(final Builder builder) {
		key = builder.key;
		query = builder.query;
		offset = builder.offset;
		filter = builder.filter;
		gmt = builder.gmt;
		sort = builder.sort;
		ids = builder.ids;
		showTimes = builder.showTimes;
		matchedTerms = builder.matchedTerms;
	}


	public TvRequestInfo() {
	}


	@Override
	public String toString() {
		return "TvRequestInfo [key=" + key + ", query=" + query + ", offset=" + offset + ", filter=" + filter + ", gmt=" + gmt
			+ ", sort=" + sort + ", ids=" + ids + ", showTimes=" + showTimes + ", matchedTerms=" + matchedTerms + "]";
	}


	public static Builder builder() {
		return new Builder();
	}

	public static final class Builder {

		private String key;

		private String query;

		private int offset;

		private TvRequestFilter filter;

		private String gmt;

		private RequestSort sort;

		private Set<Long> ids;

		private Boolean showTimes;

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


		public Builder withFilter(final TvRequestFilter filter) {
			this.filter = filter;
			return this;
		}


		public Builder withGmt(final String gmt) {
			this.gmt = gmt;
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


		public Builder withShowTimes(final Boolean showTimes) {
			this.showTimes = showTimes;
			return this;
		}


		public Builder withMatchedTerms(final Boolean matchedTerms) {
			this.matchedTerms = matchedTerms;
			return this;
		}


		public TvRequestInfo build() {
			return new TvRequestInfo(this);
		}
	}

}
