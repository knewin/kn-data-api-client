package com.knewin.data.client.info;

import java.util.Set;

/**
 * Class that stores query data to request media from web service.
 *
 * @param <F> the media filter
 *
 * @since 1.5.0
 */
public abstract class MediaRequestInfo<F extends MediaRequestFilter> implements DataRequestInfo {

	protected String key;

	protected String query;

	protected int offset;

	protected F filter;

	protected String gmt;

	protected RequestSort sort;

	protected Set<Long> ids;

	protected Boolean showTimes;

	protected Boolean matchedTerms;

	protected String matchedTermsQuery;


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


	public F getFilter() {
		return filter;
	}


	public void setFilter(F filter) {
		this.filter = filter;
	}


	public String getGmt() {
		return gmt;
	}


	public void setGmt(String gmt) {
		this.gmt = gmt;
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


	public Boolean getShowTimes() {
		return showTimes;
	}


	public void setShowTimes(Boolean showTimes) {
		this.showTimes = showTimes;
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

}
