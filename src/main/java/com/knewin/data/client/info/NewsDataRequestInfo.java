package com.knewin.data.client.info;

import java.util.Set;

import com.google.gson.annotations.SerializedName;

/**
 * Class that stores query data to request news from web service.
 * 
 * @since 1.0.0
 * 
 */
public class NewsDataRequestInfo {

	private String key;

	private String query;

	private NewsQueryFilter filter;

	@SerializedName("newsId")
	private Set<Long> newsIdList;

	private Set<String> fields;

	private String gmt;

	private boolean groupSimilar;

	private int offset;

	private NewsQuerySort sort;


	/**
	 * Get the news fields that should be returned.
	 * 
	 * @return the news fields that should be returned
	 */
	public Set<String> getFields() {
		return fields;
	}


	/**
	 * Get the {@link NewsQueryFilter} instance.
	 * 
	 * @return the {@link NewsQueryFilter} instance
	 */
	public NewsQueryFilter getFilter() {
		return filter;
	}


	/**
	 * Get the GMT code.
	 * 
	 * @return the GMT code
	 */
	public String getGmt() {
		return gmt;
	}


	/**
	 * Get if it should group similar news.
	 * 
	 * @return true if it should group similar news, and false otherwise
	 */
	public boolean getGroupSimilar() {
		return groupSimilar;
	}


	/**
	 * Get the client's key.
	 * 
	 * @return the client's key
	 */
	public String getKey() {
		return key;
	}


	/**
	 * Get the list of news identification list.
	 * 
	 * @return the list of news identification list
	 */
	public Set<Long> getNewsIdList() {
		return newsIdList;
	}


	/**
	 * Get the offset.
	 * 
	 * @return the offset
	 */
	public int getOffset() {
		return offset;
	}


	/**
	 * Get the query.
	 * 
	 * @return the query
	 */
	public String getQuery() {
		return query;
	}


	/**
	 * Get the {@link NewsQuerySort} instance.
	 * 
	 * @return the {@link NewsQuerySort} instance
	 */
	public NewsQuerySort getSort() {
		return sort;
	}


	/**
	 * Set a list of fields to be returned.
	 * 
	 * @param fields a list of fields
	 */
	public void setFields(final Set<String> fields) {
		this.fields = fields;
	}


	/**
	 * Set a {@link NewsQueryFilter} instance.
	 * 
	 * @param filter a {@link NewsQueryFilter} instance
	 */
	public void setFilter(NewsQueryFilter filter) {
		this.filter = filter;
	}


	/**
	 * Get the GMT code.
	 * 
	 * @param gmt the GMT code
	 */
	public void setGmt(final String gmt) {
		this.gmt = gmt;
	}


	/**
	 * Set if it should group similar news.
	 * 
	 * @param groupSimilar true if it should group similar news, and false otherwise
	 */
	public void setGroupSimilar(final boolean groupSimilar) {
		this.groupSimilar = groupSimilar;
	}


	/**
	 * Set the client's key.
	 * 
	 * @param key the client's key
	 */
	public void setKey(final String key) {
		this.key = key;
	}


	/**
	 * Set the news identification list.
	 * 
	 * @param newsIdList the news identification list
	 */
	public void setNewsIdList(final Set<Long> newsIdList) {
		this.newsIdList = newsIdList;
	}


	/**
	 * Set the offset.
	 * 
	 * @param offset the offset
	 */
	public void setOffset(final int offset) {
		this.offset = offset;
	}


	/**
	 * Set the query.
	 * 
	 * @param query the query
	 */
	public void setQuery(String query) {
		this.query = query;
	}


	/**
	 * Set a {@link NewsQuerySort} instance.
	 * 
	 * @param sort a {@link NewsQuerySort} instance
	 */
	public void setSort(final NewsQuerySort sort) {
		this.sort = sort;
	}


	@Override
	public String toString() {
		return "NewsDataRequestInfo [key=" + key + ", query=" + query + ", filter=" + filter + ", newsIdList=" + newsIdList
			+ ", fields=" + fields + ", gmt=" + gmt + ", groupSimilar=" + groupSimilar + ", offset=" + offset + ", sort="
			+ sort + "]";
	}

}
