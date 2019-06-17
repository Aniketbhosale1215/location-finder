/**
 * 
 */
package com.extentia.entity;

/**
 * @author Aniket.Bhosale
 *
 */
public class DetailViewport {

	private DetailNortheast northeast;
	private DetailSouthwest southwest;

	public DetailNortheast getNortheast() {
		return northeast;
	}

	public void setNortheast(DetailNortheast northeast) {
		this.northeast = northeast;
	}

	public DetailSouthwest getSouthwest() {
		return southwest;
	}

	public void setSouthwest(DetailSouthwest southwest) {
		this.southwest = southwest;
	}

	@Override
	public String toString() {
		return "DetailViewport [northeast=" + northeast + ", southwest=" + southwest + "]";
	}

}
