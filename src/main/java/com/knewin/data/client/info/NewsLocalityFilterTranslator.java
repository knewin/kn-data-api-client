package com.knewin.data.client.info;

import java.util.Set;

/**
 * Build the locality filter and join whith the query.
 *
 */
public final class NewsLocalityFilterTranslator {

	private NewsDataRequestInfo newsDataRequestInfo;


	private NewsLocalityFilterTranslator() {
	}


	/**
	 * @return a new instance
	 */
	public static NewsLocalityFilterTranslator create() {
		return new NewsLocalityFilterTranslator();
	}


	/**
	 *
	 */
	public void translate() {
		if (this.newsDataRequestInfo == null) {
			return;
		}
		final NewsQueryFilter filter = this.newsDataRequestInfo.getFilter();
		if (filter == null) {
			return;
		}
		final Set<SourceLocality> sourceLocalities = filter.getSourceLocalities();
		if (sourceLocalities != null && sourceLocalities.size() == 1) {
			filter.setSourceLocality(sourceLocalities.iterator().next());
		} else if (sourceLocalities != null && sourceLocalities.size() > 1) {
			this.newsDataRequestInfo.setQuery(LocalityFilterBuilder.create().withQuery(this.newsDataRequestInfo.getQuery())
				.withLocalities(sourceLocalities).build());
		}

	}


	/**
	 * @param newsDataRequestInfo the request info
	 * @return this instance
	 */
	public NewsLocalityFilterTranslator withNewsDataRequestInfo(final NewsDataRequestInfo newsDataRequestInfo) {
		this.newsDataRequestInfo = newsDataRequestInfo;
		return this;
	}

}
