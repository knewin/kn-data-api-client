package com.knewin.data.client.info;

/**
 * Class that stores query data to request info from web service.
 *
 * @since 1.5.0
 */
public abstract class DataRequestInfo {

	private int offset;


	public int getOffset() {
		return this.offset;
	}


	public void setOffset(final int offset) {
		this.offset = offset;
	}

}
