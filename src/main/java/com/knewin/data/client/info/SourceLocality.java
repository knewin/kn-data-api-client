package com.knewin.data.client.info;

/**
 * Class that contains the source locality filter information.
 * 
 * @since 1.0.5
 */
public class SourceLocality {

	private Boolean inclusive;

	private String country;

	private String state;

	private String city;


	/**
	 * Get the inclusive filter.
	 * 
	 * @return the inclusive filter
	 */
	public Boolean getInclusive() {
		return this.inclusive;
	}


	/**
	 * Set the inclusive filter.
	 * 
	 * @param inclusive <code>true</code> if this source locality should be added to the filter and <code>false</code> otherwise
	 */
	public void setInclusive(final Boolean inclusive) {
		this.inclusive = inclusive;
	}


	/**
	 * Get the country name.
	 * 
	 * @return the country name
	 */
	public String getCountry() {
		return this.country;
	}


	/**
	 * Set the country name.
	 * 
	 * @param country the country name
	 */
	public void setCountry(final String country) {
		this.country = country;
	}


	/**
	 * Get the state name.
	 * 
	 * @return the state name
	 */
	public String getState() {
		return this.state;
	}


	/**
	 * Set the state name.
	 * 
	 * @param state the state name
	 */
	public void setState(final String state) {
		this.state = state;
	}


	/**
	 * Get the city name.
	 * 
	 * @return the city name
	 */
	public String getCity() {
		return this.city;
	}


	/**
	 * Set the city name.
	 * 
	 * @param city the city name
	 */
	public void setCity(final String city) {
		this.city = city;
	}


	@Override
	public String toString() {
		return "SourceLocality [inclusive=" + this.inclusive + ", country=" + this.country + ", state=" + this.state + ", city="
			+ this.city + "]";
	}

}
