package com.knewin.data.client.info;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for {@link LocalityFilterBuilder}.
 *
 */
public class LocalityFilterBuilderTest {

	@Test
	public void testWithoutQueryAndNoLocality() {
		final String newQuery = LocalityFilterBuilder.create().build();
		Assert.assertNull(newQuery);
	}


	@Test
	public void testWithQueryAndNoLocality() {
		final String query = "some query";
		final String newQuery = LocalityFilterBuilder.create().withQuery(query).build();
		Assert.assertEquals("some query", newQuery);
	}


	@Test
	public void testWithoutQueryAndWithLocalities() {
		final List<SourceLocality> localities = Arrays.asList(this.buildLocality("Brasil", "Santa Catarina", "Florianopolis"),
			this.buildLocality("Brasil", "Parana"));
		final String newQuery = LocalityFilterBuilder.create().withLocalities(localities).build();
		Assert.assertEquals(
			"((source_country:\"Brasil\" AND source_state:\"Santa Catarina\" AND source_city:\"Florianopolis\") OR "
				+ "(source_country:\"Brasil\" AND source_state:\"Parana\"))",
			newQuery);
	}


	@Test
	public void testWithQueryAndOneLocality() {
		final String query = "some query";
		final List<SourceLocality> localities = Arrays.asList(this.buildLocality("bar1", "foo1"));
		final String newQuery = LocalityFilterBuilder.create().withQuery(query).withLocalities(localities).build();
		Assert.assertEquals("(some query) AND (source_country:\"bar1\" AND source_state:\"foo1\")", newQuery);
	}


	@Test
	public void testWithQueryAndWithLocalities() {
		final String query = "some query";
		final List<SourceLocality> localities = Arrays.asList(this.buildLocality("bar1", "foo1"),
			this.buildLocality("bar2", "foo2"));
		final String newQuery = LocalityFilterBuilder.create().withQuery(query).withLocalities(localities).build();
		Assert.assertEquals("(some query) AND ((source_country:\"bar1\" AND source_state:\"foo1\") OR "
			+ "(source_country:\"bar2\" AND source_state:\"foo2\"))", newQuery);
	}


	private SourceLocality buildLocality(final String country, final String state) {
		return this.buildLocality(country, state, (String) null);
	}


	private SourceLocality buildLocality(final String country, final String state, final String city) {
		final SourceLocality sourceLocality = new SourceLocality();
		sourceLocality.setCountry(country);
		sourceLocality.setState(state);
		sourceLocality.setCity(city);

		return sourceLocality;
	}

}
