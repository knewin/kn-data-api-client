package com.knewin.data.client;

import java.io.IOException;

/**
 * Signals that an I/O exception of some request has occurred.
 *
 */
public class DataRequestException extends IOException {

	private static final long serialVersionUID = 7746564795008403705L;


	/**
	 * @see IOException#IOException(Throwable)
	 * 
	 * @param cause the exception cause
	 */
	public DataRequestException(final Throwable cause) {
		super(cause);
	}


	/**
	 * @see IOException#IOException(String)
	 * 
	 * @param message the detail message
	 */
	public DataRequestException(final String message) {
		super(message);
	}

}
