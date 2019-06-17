/**
 * 
 */
package com.extentia.entity;

/**
 * @author Aniket.Bhosale
 *
 */
public class FilterViewport {

	private FilterNortheast northeast;
	private FilterSouthwest southwest;

	public FilterNortheast getNortheast() {
		return northeast;
	}

	public void setNortheast(FilterNortheast northeast) {
		this.northeast = northeast;
	}

	public FilterSouthwest getSouthwest() {
		return southwest;
	}

	public void setSouthwest(FilterSouthwest southwest) {
		this.southwest = southwest;
	}

	@Override
	public String toString() {
		return "FilterViewport [northeast=" + northeast + ", southwest=" + southwest + "]";
	}

}
