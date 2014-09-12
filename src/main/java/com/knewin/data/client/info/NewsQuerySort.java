package com.knewin.data.client.info;

/**
 * Class that contains the sort definition to be used when returning news from web service.
 * 
 * @since 1.0.0
 * 
 */
public class NewsQuerySort {

	private String field;

	private String order;


	/**
	 * Get the field name to be used to sort. <br>
	 * <br>
	 * <code>
	 * Possible values are:
	 * 	<ul> 
	 * 		<li>published_date: the published date</li>
	 * 		<li>crawled_date: the date when the doc was collected</li>
	 * 		<li>frequency: based on the amount of words</li>
	 * 	</ul>
	 * </code>
	 * 
	 * @return the field name
	 */
	public String getField() {
		return field;
	}


	/**
	 * Get the order definition.<br>
	 * <br>
	 * <code>
	 * Possible values are:
	 * 	<ul> 
	 * 		<li>asc: to ascending order</li>
	 * 		<li>desc: to descending order</li>
	 * 	</ul>
	 * </code>
	 * 
	 * @return the order definition
	 */
	public String getOrder() {
		return order;
	}


	/**
	 * Set the field to be used to sort.<br>
	 * <br>
	 * <code>
	 * Possible values are:
	 * 	<ul> 
	 * 		<li>published_date: the published date</li>
	 * 		<li>crawled_date: the date when the doc was collected</li>
	 * 		<li>frequency: based on the amount of words</li>
	 * 	</ul>
	 * </code>
	 * 
	 * @param field the field to be used to sort
	 */
	public void setField(final String field) {
		this.field = field;
	}


	/**
	 * Set the order definition.<br>
	 * <br>
	 * <code>
	 * Possible values are:
	 * 	<ul> 
	 * 		<li>asc: to ascending order</li>
	 * 		<li>desc: to descending order</li>
	 * 	</ul>
	 * </code>
	 * 
	 * @param order the order definition
	 */
	public void setOrder(final String order) {
		this.order = order;
	}


	@Override
	public String toString() {
		return "NewsQuerySort [field=" + field + ", order=" + order + "]";
	}

}
