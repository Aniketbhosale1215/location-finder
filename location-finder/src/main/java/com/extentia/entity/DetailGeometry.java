/**
 * 
 */
package com.extentia.entity;

/**
 * @author Aniket.Bhosale
 *
 */
public class DetailGeometry {

	private DetailLocation location;
	private DetailViewport viewport;

	public DetailLocation getLocation() {
		return location;
	}

	public void setLocation(DetailLocation location) {
		this.location = location;
	}

	public DetailViewport getViewport() {
		return viewport;
	}

	public void setViewport(DetailViewport viewport) {
		this.viewport = viewport;
	}

	@Override
	public String toString() {
		return "DetailGeometry []";
	}

}
