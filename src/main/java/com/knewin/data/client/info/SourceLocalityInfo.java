package com.knewin.data.client.info;

/**
 * Class that store the source locality info.
 *
 * @since 1.6.0
 */
public class SourceLocalityInfo {

	private String country;

	private String countryAcronym;

	private String state;

	private String stateAcronym;


	public String getCountry() {
		return country;
	}


	public void setCountry(final String country) {
		this.country = country;
	}


	public String getCountryAcronym() {
		return countryAcronym;
	}


	public void setCountryAcronym(final String countryAcronym) {
		this.countryAcronym = countryAcronym;
	}


	public String getState() {
		return state;
	}


	public void setState(final String state) {
		this.state = state;
	}


	public String getStateAcronym() {
		return stateAcronym;
	}


	public void setStateAcronym(final String stateAcronym) {
		this.stateAcronym = stateAcronym;
	}


	@Override
	public String toString() {
		return "SourceLocalityInfo [country=" + country + ", countryAcronym=" + countryAcronym + ", state=" + state
			+ ", stateAcronym=" + stateAcronym + "]";
	}

}
