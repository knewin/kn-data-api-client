package com.knewin.data.client.info;

/**
 * Class that contains the sort definition.
 *
 * @since 1.5.0
 */
public class RequestSort {

	private String field;

	private String order;


	public String getField() {
		return this.field;
	}


	public void setField(final String field) {
		this.field = field;
	}


	public String getOrder() {
		return this.order;
	}


	public void setOrder(final String order) {
		this.order = order;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((this.field == null) ? 0 : this.field.hashCode());
		result = prime * result + ((this.order == null) ? 0 : this.order.hashCode());
		return result;
	}


	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		final RequestSort other = (RequestSort) obj;
		if (this.field == null) {
			if (other.field != null) {
				return false;
			}
		} else if (!this.field.equals(other.field)) {
			return false;
		}
		if (this.order == null) {
			if (other.order != null) {
				return false;
			}
		} else if (!this.order.equals(other.order)) {
			return false;
		}
		return true;
	}

}
