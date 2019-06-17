/**
 * 
 */
package com.extentia.entity;

/**
 * @author Aniket.Bhosale
 *
 */
public class LocationResponse {

	private String formatted_address;
	private String name;
	private String place_id;

	public String getFormatted_address() {
		return formatted_address;
	}

	public void setFormatted_address(String formatted_address) {
		this.formatted_address = formatted_address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPlace_id() {
		return place_id;
	}

	public void setPlace_id(String place_id) {
		this.place_id = place_id;
	}

	@Override
	public String toString() {
		return "LocationResponse [formatted_address=" + formatted_address + ", name=" + name + ", place_id=" + place_id
				+ "]";
	}

}
