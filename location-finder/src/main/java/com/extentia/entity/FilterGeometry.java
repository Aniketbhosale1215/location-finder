/**
 * 
 */
package com.extentia.entity;

/**
 * @author Aniket.Bhosale
 *
 */
public class FilterGeometry {

	private FilterLocation location;
	private FilterViewport viewport;

	public FilterLocation getLocation() {
		return location;
	}

	public void setLocation(FilterLocation location) {
		this.location = location;
	}

	public FilterViewport getViewport() {
		return viewport;
	}

	public void setViewport(FilterViewport viewport) {
		this.viewport = viewport;
	}

	@Override
	public String toString() {
		return "FilterGeometry [location=" + location + ", viewport=" + viewport + "]";
	}

}
