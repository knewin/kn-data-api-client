package com.knewin.data.client;

import java.lang.reflect.Type;

import org.apache.http.impl.client.CloseableHttpClient;

import com.google.gson.reflect.TypeToken;
import com.knewin.data.client.info.DataResponseInfo;
import com.knewin.data.client.info.NewsDataInfo;
import com.knewin.data.client.info.SimilarNewsDataRequestInfo;

public class SimilarNewsDataRequest extends DataRequest<SimilarNewsDataRequestInfo, NewsDataInfo> {

	@Override
	public DataResponseInfo<NewsDataInfo> request(final SimilarNewsDataRequestInfo request, final String url)
		throws DataRequestException, ParseException {
		return super.request(request, url);
	}


	@Override
	public DataResponseInfo<NewsDataInfo> request(final SimilarNewsDataRequestInfo request, final String url,
		final CloseableHttpClient httpClient) throws DataRequestException, ParseException {
		return super.request(request, url, httpClient);
	}


	@Override
	protected Type getTypeToken() {
		return new TypeToken<DataResponseInfo<NewsDataInfo>>() {
		}.getType();
	}
}
