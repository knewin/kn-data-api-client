package com.knewin.data.client;

import java.lang.reflect.Type;

import com.google.gson.reflect.TypeToken;
import com.knewin.data.client.info.DataResponseInfo;
import com.knewin.data.client.info.TvDataInfo;
import com.knewin.data.client.info.TvRequestInfo;

/**
 * Class responsible for requesting tv documents from web service.
 *
 * @since 1.5.0
 */
public class TvDataRequest extends MediaDataRequest<TvRequestInfo, TvDataInfo> {

	@Override
	protected Type getTypeToken() {
		return new TypeToken<DataResponseInfo<TvDataInfo>>() {
		}.getType();
	}
}
