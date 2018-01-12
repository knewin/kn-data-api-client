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
	private String json;


	/**
	 * @param cause the exception cause
	 * @param json the malformed json
	 */
	public ParseException(Throwable cause, String json) {
		super(cause);
		this.json = json;
	}


	/**
	 * @return the malformed json
	 */
	public String getJson() {
		return json;
	}
}
