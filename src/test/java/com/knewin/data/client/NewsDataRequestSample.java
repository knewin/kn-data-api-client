package com.knewin.data.client;

import java.io.IOException;

import com.knewin.data.client.info.DataResponseInfo;
import com.knewin.data.client.info.NewsDataInfo;
import com.knewin.data.client.info.NewsDataRequestInfo;

/**
 * Class that implements an example of how to get news from web service.
 * 
 * @since 1.0.0
 */
public class NewsDataRequestSample {

	/**
	 * Show an example of how to call the web service to get news.
	 * 
	 * @param args [0] the client's key; [1] the query
	 * 
	 * @throws IOException error in case of problems to request news
	 */
	public static void main(final String[] args) throws IOException {
		final String key = args[0];
		final String query = args[1];

		final NewsDataRequestInfo requestInfo = new NewsDataRequestInfo();
		requestInfo.setKey(key);
		requestInfo.setQuery(query);

		final NewsDataRequest newsDataRequest = new NewsDataRequest();
		final DataResponseInfo<NewsDataInfo> responseInfo = newsDataRequest
			.getNews(requestInfo, "http://data.knewin.com/news");

		System.out.println("Número de notícias encontradas: " + responseInfo.getNumDocs());

		System.out.println("Títulos das notícias recuperadas");
		responseInfo.getHits().forEach(newsDataInfo -> System.out.println("   - " + newsDataInfo.getTitle()));
	}

}
