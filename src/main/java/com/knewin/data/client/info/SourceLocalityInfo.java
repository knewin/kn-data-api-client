package com.knewin.data.client.info;

/**
 * Class that store the source locality info.
 *
 * @since 1.6.0
 */
public class SourceLocalityInfo {

	private String country;

	private String state;


	public String getCountry() {
		return this.country;
	}


	public void setCountry(final String country) {
		this.country = country;
	}


	public String getState() {
		return this.state;
	}


	public void setState(final String state) {
		this.state = state;
	}


	@Override
	public String toString() {
		return "SourceLocalityInfo [country=" + this.country + ", state=" + this.state + "]";
	}

}
