package com.knewin.data.client.info;

import java.util.Map;

/**
 * Interface used to facilitate query objects definition.
 *
 * @since 1.5.0
 */
public interface DataRequestInfo {

	int getOffset();


	void setOffset(int offset);


	Map<String, String> getHeaders();
}
