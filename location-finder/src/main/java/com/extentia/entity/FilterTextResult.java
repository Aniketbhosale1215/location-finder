/**
 * 
 */
package com.extentia.entity;

import java.util.Arrays;
import java.util.List;

/**
 * @author Aniket.Bhosale
 *
 */
public class FilterTextResult {

	private String formatted_address;
	private FilterGeometry geometry;
	private String icon;
	private String id;
	private String name;
	private List<FilterPhoto> photos;
	private String place_id;
	private String reference;
	private String[] types;
	public String getFormatted_address() {
		return formatted_address;
	}
	public void setFormatted_address(String formatted_address) {
		this.formatted_address = formatted_address;
	}
	public FilterGeometry getGeometry() {
		return geometry;
	}
	public void setGeometry(FilterGeometry geometry) {
		this.geometry = geometry;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<FilterPhoto> getPhotos() {
		return photos;
	}
	public void setPhotos(List<FilterPhoto> photos) {
		this.photos = photos;
	}
	public String getPlace_id() {
		return place_id;
	}
	public void setPlace_id(String place_id) {
		this.place_id = place_id;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public String[] getTypes() {
		return types;
	}
	public void setTypes(String[] types) {
		this.types = types;
	}
	@Override
	public String toString() {
		return "FilterTextResult [formatted_address=" + formatted_address + ", geometry=" + geometry + ", icon=" + icon
				+ ", id=" + id + ", name=" + name + ", place_id=" + place_id + ", reference=" + reference + ", types="
				+ Arrays.toString(types) + "]";
	}
		
}