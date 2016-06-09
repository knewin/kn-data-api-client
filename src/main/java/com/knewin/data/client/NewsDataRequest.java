package com.knewin.data.client;

import org.apache.http.impl.client.CloseableHttpClient;

import com.knewin.data.client.info.DataResponseInfo;
import com.knewin.data.client.info.NewsDataInfo;
import com.knewin.data.client.info.NewsDataRequestInfo;

/**
 * Class responsible for requesting news from web service.
 * 
 * @since 1.0.0
 * 
 */
public class NewsDataRequest extends DataRequest<NewsDataRequestInfo, NewsDataInfo> {

	/**
	 * Request news from web service.
	 * 
	 * @param requestInfo a {@link NewsDataRequest} instance
	 * @param url the web service URL
	 * @param httpClient a {@link CloseableHttpClient} instance
	 * 
	 * @return a {@link DataResponseInfo} instance
	 * 
	 * @throws DataRequestException error when requesting data from web service
	 * 
	 * @deprecated Use {@link NewsDataRequest#request(NewsDataRequestInfo, String, CloseableHttpClient)}
	 */
	@Deprecated
	public DataResponseInfo<NewsDataInfo> getNews(final NewsDataRequestInfo requestInfo, final String url,
		final CloseableHttpClient httpClient) throws DataRequestException {
		return super.request(requestInfo, url, httpClient);
	}


	/**
	 * Request news from web service.
	 * 
	 * @param requestInfo a {@link NewsDataRequest} instance
	 * @param url the web service URL
	 * 
	 * @return a {@link DataResponseInfo} instance
	 * 
	 * @throws DataRequestException error when requesting data from web service
	 * 
	 * @deprecated Use {@link NewsDataRequest#request(NewsDataRequestInfo, String, CloseableHttpClient)}
	 */
	@Deprecated
	public DataResponseInfo<NewsDataInfo> getNews(final NewsDataRequestInfo requestInfo, final String url) throws DataRequestException {
		return super.request(requestInfo, url);
	}

}
