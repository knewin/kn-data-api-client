package com.knewin.data.client.info;

/**
 * Class that stores query data to request media from web service.
 *
 * @param <F> the media filter
 * 
 * @since 1.5.0
 */
public abstract class MediaRequestInfo<F extends MediaRequestFilter> extends DataRequestInfo {

	private String key;

	private String query;

	private F filter;

	private String gmt;

	private RequestSort sort;


	public String getKey() {
		return this.key;
	}


	public void setKey(final String key) {
		this.key = key;
	}


	public String getQuery() {
		return this.query;
	}


	public void setQuery(final String query) {
		this.query = query;
	}


	public F getFilter() {
		return this.filter;
	}


	public void setFilter(final F filter) {
		this.filter = filter;
	}


	public String getGmt() {
		return this.gmt;
	}


	public void setGmt(final String gmt) {
		this.gmt = gmt;
	}


	public RequestSort getSort() {
		return this.sort;
	}


	public void setSort(final RequestSort sort) {
		this.sort = sort;
	}


	@Override
	public String toString() {
		return "MediaRequestInfo [key=" + this.key + ", query=" + this.query + ", filter=" + this.filter + ", gmt=" + this.gmt
			+ ", sort=" + this.sort + ", getOffset()=" + this.getOffset() + "]";
	}

}
