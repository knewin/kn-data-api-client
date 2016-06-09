package com.knewin.data.client;

import java.io.IOException;

import com.knewin.data.client.info.DataResponseInfo;
import com.knewin.data.client.info.TvDataInfo;
import com.knewin.data.client.info.TvRequestInfo;

/**
 * Class that implements an example of how to get tv documents from web service.
 * 
 * @since 1.5.0
 */
public final class TvDataRequestSample {

	private TvDataRequestSample() {

	}


	/**
	 * Show an example of how to call the web service to get documents.
	 * 
	 * @param args [0] the web service URL; [1] the client's key; [2] the query
	 * 
	 * @throws IOException error in case of problems to request documents
	 */
	public static void main(final String[] args) throws IOException {
		final String url = args[0];
		final String key = args[1];
		final String query = args[2];

		final TvRequestInfo requestInfo = new TvRequestInfo();
		requestInfo.setKey(key);
		requestInfo.setQuery(query);

		final TvDataRequest dataRequest = new TvDataRequest();
		final DataResponseInfo<TvDataInfo> responseInfo = dataRequest.request(requestInfo, url);

		System.out.println("Número de notícias encontradas: " + responseInfo.getNumDocs());

		System.out.println("Resumo do conteúdo das notícias recuperadas");
		responseInfo.getHits().forEach(tv -> System.out.println("   - " + truncate(tv.getContent(), 100).replaceAll("\n+", " ")));
	}


	private static String truncate(String text, final int maxLength) {
		if (text != null && text.length() > maxLength) {
			text = text.substring(0, maxLength);
		}
		return text == null ? "" : text;
	}

}
