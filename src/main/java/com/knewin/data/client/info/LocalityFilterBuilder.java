package com.knewin.data.client.info;

import java.util.ArrayList;
import java.util.Collection;
import java.util.StringJoiner;
import java.util.stream.Collectors;

/**
 * Build the locality filter and join whith the query.
 *
 */
public final class LocalityFilterBuilder {

	private String query;

	private Collection<SourceLocality> localities;


	private LocalityFilterBuilder() {
	}


	/**
	 * @return a new instance
	 */
	public static LocalityFilterBuilder create() {
		return new LocalityFilterBuilder();
	}


	/**
	 * @return the new query
	 */
	public String build() {
		if (this.localities == null || this.localities.isEmpty()) {
			return this.query;
		}

		final Collection<String> queries = new ArrayList<>();
		if (this.query != null && this.query.trim().length() > 0) {
			queries.add("(" + this.query + ")");
		}

		this.buildIncluseFilter(queries);
		this.buildExclusiveFilter(queries);

		if (queries.size() == 1) {
			return queries.iterator().next();
		} else if (queries.size() > 1) {
			return queries.stream().collect(Collectors.joining(" AND "));
		}
		return this.query;
	}


	private void buildExclusiveFilter(final Collection<String> queries) {
		final Collection<String> exclusiveLocalities = this.localities.stream()
			.filter(s -> s.getInclusive() != null && !s.getInclusive().booleanValue()).map(this::toLocalityFilterQuery)
			.collect(Collectors.toList());
		if (exclusiveLocalities.size() == 1) {
			queries.add(exclusiveLocalities.iterator().next());
		} else if (exclusiveLocalities.size() > 1) {
			queries.add(exclusiveLocalities.stream().collect(Collectors.joining(" -", " -", "")));
		}
	}


	private void buildIncluseFilter(final Collection<String> queries) {
		final Collection<String> inclusiveLocalities = this.localities.stream()
			.filter(s -> s.getInclusive() == null || s.getInclusive().booleanValue()).map(this::toLocalityFilterQuery)
			.collect(Collectors.toList());
		if (inclusiveLocalities.size() == 1) {
			queries.add(inclusiveLocalities.iterator().next());
		} else if (inclusiveLocalities.size() > 1) {
			queries.add(inclusiveLocalities.stream().collect(Collectors.joining(" OR ", "(", ")")));
		}
	}


	/**
	 * @param query the query
	 * @return this instance
	 */
	public LocalityFilterBuilder withQuery(final String query) {
		this.query = query;
		return this;
	}


	/**
	 * @param localities the localities
	 * @return this instance
	 */
	public LocalityFilterBuilder withLocalities(final Collection<SourceLocality> localities) {
		this.localities = localities;
		return this;
	}


	private String toLocalityFilterQuery(final SourceLocality filter) {
		final StringJoiner andClause = new StringJoiner(" AND ", "(", ")");
		andClause.add(String.format("%s:\"%s\"", "source_country", filter.getCountry()));
		if (filter.getState() != null) {
			andClause.add(String.format("%s:\"%s\"", "source_state", filter.getState()));
		}
		if (filter.getCity() != null) {
			andClause.add(String.format("%s:\"%s\"", "source_city", filter.getCity()));
		}
		return andClause.toString();
	}

}
