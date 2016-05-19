package com.knewin.data.client;

import java.io.IOException;

/**
 * Signals that an I/O exception of some request has occurred.
 *
 */
public class DataRequestException extends IOException {

	private static final long serialVersionUID = 7998494582801486759L;

	/**
	 * The request that generated the error. Can be an url if it was a GET method, or the
	 * message body in case of a POST.
	 */
	private String request;


	/**
	 * @see IOException#IOException(Throwable)
	 * 
	 * @param cause the exception cause
	 */
	public DataRequestException(final Throwable cause, final String request) {
		super(cause);
		this.request = request;
	}


	/**
	 * @see IOException#IOException(String)
	 * 
	 * @param message the detail message
	 */
	public DataRequestException(final String message) {
		super(message, null);
	}


	/**
	 * @see IOException#IOException(String)
	 * 
	 * @param message the detail message
	 */
	public DataRequestException(final String message, final String request) {
		super(message);
		this.request = request;
	}


	public void setRequest(final String request) {
		this.request = request;
	}


	public String getRequest() {
		return this.request;
	}

}
