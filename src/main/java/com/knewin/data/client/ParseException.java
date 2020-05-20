package com.knewin.data.client;

/**
 * This exception is raised when Gson attempts to read (or write) a malformed JSON element.
 *
 */
public class ParseException extends RuntimeException {

	private static final long serialVersionUID = -4979381746948337035L;

	/**
	 * The malformed JSON string.
	 */
	private final String json;

	public ParseException(final String message, final Throwable cause, final String json) {
		super(message, cause);
		this.json = json;
	}


	/**
	 * @return the malformed json
	 */
	public String getJson() {
		return json;
	}
}
