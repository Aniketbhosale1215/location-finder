/**
 * 
 */
package com.extentia.entity;

import java.util.List;

/**
 * @author Aniket.Bhosale
 *
 */
public class Response {

	private List<Venue> venues;
	private String confident;

	public List<Venue> getVenues() {
		return venues;
	}

	public void setVenues(List<Venue> venues) {
		this.venues = venues;
	}

	public String getConfident() {
		return confident;
	}

	public void setConfident(String confident) {
		this.confident = confident;
	}

	@Override
	public String toString() {
		return "Response [confident=" + confident + "]";
	}

}
