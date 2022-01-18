package com.knewin.data.client;

import java.lang.reflect.Type;

import com.google.gson.reflect.TypeToken;
import com.knewin.data.client.info.DataResponseInfo;
import com.knewin.data.client.info.RadioDataInfo;
import com.knewin.data.client.info.RadioRequestInfo;

/**
 * Class responsible for requesting radio documents from web service.
 *
 * @since 1.5.0
 */
public class RadioDataRequest extends MediaDataRequest<RadioRequestInfo, RadioDataInfo> {

	@Override
	protected Type getTypeToken() {
		return new TypeToken<DataResponseInfo<RadioDataInfo>>() {
		}.getType();
	}

}
