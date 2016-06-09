package com.knewin.data.client.info;

import java.util.Set;

import com.google.gson.annotations.SerializedName;

/**
 * Class that stores query data to request news from web service.
 * 
 * @since 1.0.0
 * 
 */
public class NewsDataRequestInfo extends DataRequestInfo {

	private String key;

	private String query;

	private NewsQueryFilter filter;

	@SerializedName("newsId")
	private Set<Long> newsIdList;

	private Set<String> fields;

	private String gmt;

	private boolean groupSimilar;

	private Boolean showOriginalUrl;

	private NewsQuerySort sort;

	private String defaultOperator;


	/**
	 * Get the default operator.
	 * 
	 * @return the default operator
	 */
	public String getDefaultOperator() {
		return this.defaultOperator;
	}


	/**
	 * Get the news fields that should be returned.
	 * 
	 * @return the news fields that should be returned
	 */
	public Set<String> getFields() {
		return this.fields;
	}


	/**
	 * Get the {@link NewsQueryFilter} instance.
	 * 
	 * @return the {@link NewsQueryFilter} instance
	 */
	public NewsQueryFilter getFilter() {
		return this.filter;
	}


	/**
	 * Get the GMT code.
	 * 
	 * @return the GMT code
	 */
	public String getGmt() {
		return this.gmt;
	}


	/**
	 * Get if it should group similar news.
	 * 
	 * @return true if it should group similar news, and false otherwise
	 */
	public boolean getGroupSimilar() {
		return this.groupSimilar;
	}


	/**
	 * Get the client's key.
	 * 
	 * @return the client's key
	 */
	public String getKey() {
		return this.key;
	}


	/**
	 * Get the list of news identification list.
	 * 
	 * @return the list of news identification list
	 */
	public Set<Long> getNewsIdList() {
		return this.newsIdList;
	}


	/**
	 * Get the query.
	 * 
	 * @return the query
	 */
	public String getQuery() {
		return this.query;
	}


	public Boolean getShowOriginalUrl() {
		return this.showOriginalUrl;
	}


	/**
	 * Get the {@link NewsQuerySort} instance.
	 * 
	 * @return the {@link NewsQuerySort} instance
	 */
	public NewsQuerySort getSort() {
		return this.sort;
	}


	/**
	 * Set the default operator.
	 * 
	 * @param defaultOperator the default operator
	 */
	public void setDefaultOperator(final String defaultOperator) {
		this.defaultOperator = defaultOperator;
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
	public void setFilter(final NewsQueryFilter filter) {
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
	 * Set the query.
	 * 
	 * @param query the query
	 */
	public void setQuery(final String query) {
		this.query = query;
	}


	public void setShowOriginalUrl(final Boolean showOriginalUrl) {
		this.showOriginalUrl = showOriginalUrl;
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
		return "NewsDataRequestInfo [key=" + this.key + ", query=" + this.query + ", filter=" + this.filter + ", newsIdList="
			+ this.newsIdList + ", fields=" + this.fields + ", gmt=" + this.gmt + ", groupSimilar=" + this.groupSimilar
			+ ", showOriginalUrl=" + this.showOriginalUrl + ", sort=" + this.sort + ", defaultOperator=" + this.defaultOperator
			+ ", getOffset()=" + this.getOffset() + "]";
	}

}
