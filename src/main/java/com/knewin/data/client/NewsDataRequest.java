package com.knewin.data.client;

import org.apache.http.impl.client.CloseableHttpClient;

import com.knewin.data.client.info.DataResponseInfo;
import com.knewin.data.client.info.NewsDataInfo;
import com.knewin.data.client.info.NewsDataRequestInfo;
import com.knewin.data.client.info.NewsLocalityFilterTranslator;

/**
 * Class responsible for requesting news from web service.
 *
 * @since 1.0.0
 *
 */
public class NewsDataRequest extends DataRequest<NewsDataRequestInfo, NewsDataInfo> {

	@Override
	public DataResponseInfo<NewsDataInfo> request(final NewsDataRequestInfo requestInfo, final String url)
		throws DataRequestException {
		NewsLocalityFilterTranslator.create().withNewsDataRequestInfo(requestInfo).translate();
		return super.request(requestInfo, url);
	}


	@Override
	public DataResponseInfo<NewsDataInfo> request(final NewsDataRequestInfo requestInfo, final String url,
		final CloseableHttpClient httpClient) throws DataRequestException {
		NewsLocalityFilterTranslator.create().withNewsDataRequestInfo(requestInfo).translate();
		return super.request(requestInfo, url, httpClient);
	}

}
