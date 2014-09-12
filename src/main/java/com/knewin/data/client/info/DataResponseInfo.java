package com.knewin.data.client.info;

import java.util.ArrayList;
import java.util.Collection;

import com.google.gson.annotations.SerializedName;

/**
 * Class that stores results from querying web services.
 *
 * @param <T> the class that stores items returned
 * 
 * @since 1.0.0
 * 
 */
public class DataResponseInfo<T extends DataInfo> {

	@SerializedName("num_docs")
	private int numDocs;

	private int start;

	private int count;

	private int elapsedTime;

	private Collection<T> hits;


	/**
	 * The main constructor.
	 */
	public DataResponseInfo() {
		this.hits = new ArrayList<T>();
	}


	/**
	 * Add a document to a list of hits.
	 * 
	 * @param doc to be added in the list of hits
	 */
	public void addDoc(final T doc) {
		this.hits.add(doc);
	}


	/**
	 * Get the number of documents returned.
	 * 
	 * @return the number of documents returned
	 */
	public int getCount() {
		return count;
	}


	/**
	 * @return the elapsedTime
	 */
	public int getElapsedTime() {
		return elapsedTime;
	}


	/**
	 * Get the list of retrieved documents.
	 * 
	 * @return the list of retrieved documents
	 */
	public Collection<T> getHits() {
		return hits;
	}


	/**
	 * Get the amount of documents retrieved.
	 * 
	 * @return the amount of documents
	 */
	public int getNumDocs() {
		return this.numDocs;
	}


	/**
	 * Get the first position of retrieved doc.
	 * 
	 * @return the first doc position
	 */
	public int getStart() {
		return start;
	}


	/**
	 * Set the number of documents returned.
	 * 
	 * @param count the number of documents returned
	 */
	public void setCount(final int count) {
		this.count = count;
	}


	/**
	 * @param elapsedTime the elapsedTime to set
	 */
	public void setElapsedTime(int elapsedTime) {
		this.elapsedTime = elapsedTime;
	}


	/**
	 * Set the list of retrieved documents.
	 * 
	 * @param hits the list of retrieved documents
	 */
	public void setHits(final Collection<T> hits) {
		this.hits = hits;
	}


	/**
	 * Set the amount of documents retrieved.
	 * 
	 * @param numDocs the amount of documents
	 */
	public void setNumDocs(final int numDocs) {
		this.numDocs = numDocs;
	}


	/**
	 * Set the first document position.
	 * 
	 * @param start the first document position
	 */
	public void setStart(final int start) {
		this.start = start;
	}


	@Override
	public String toString() {
		return "DataResponseInfo [numDocs=" + numDocs + ", start=" + start + ", count=" + count + ", elapsedTime="
			+ elapsedTime + ", hits=" + hits + "]";
	}

}
