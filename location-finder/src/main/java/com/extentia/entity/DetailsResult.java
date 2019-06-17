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
public class DetailsResult {

	private List<DetailAddress> address_components;
	private String adr_address;
	private String formatted_address;
	private DetailGeometry geometry;
	private String icon;
	private String id;
	private String name;
	private List<DetailPhoto> photos;
	private String place_id;
	private String reference;
	private String scope;
	private String[] types;
	private String url;
	private int utc_offset;
	private String vicinity;
	private String website;

	public List<DetailAddress> getAddress_components() {
		return address_components;
	}

	public void setAddress_components(List<DetailAddress> address_components) {
		this.address_components = address_components;
	}

	public String getAdr_address() {
		return adr_address;
	}

	public void setAdr_address(String adr_address) {
		this.adr_address = adr_address;
	}

	public String getFormatted_address() {
		return formatted_address;
	}

	public void setFormatted_address(String formatted_address) {
		this.formatted_address = formatted_address;
	}

	public DetailGeometry getGeometry() {
		return geometry;
	}

	public void setGeometry(DetailGeometry geometry) {
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

	public List<DetailPhoto> getPhotos() {
		return photos;
	}

	public void setPhotos(List<DetailPhoto> photos) {
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

	public String getScope() {
		return scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public String[] getTypes() {
		return types;
	}

	public void setTypes(String[] types) {
		this.types = types;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getUtc_offset() {
		return utc_offset;
	}

	public void setUtc_offset(int utc_offset) {
		this.utc_offset = utc_offset;
	}

	public String getVicinity() {
		return vicinity;
	}

	public void setVicinity(String vicinity) {
		this.vicinity = vicinity;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	@Override
	public String toString() {
		return "DetailsResult [address_components=" + address_components + ", adr_address=" + adr_address
				+ ", formatted_address=" + formatted_address + ", geometry=" + geometry + ", icon=" + icon + ", id="
				+ id + ", name=" + name + ", photos=" + photos + ", place_id=" + place_id + ", reference=" + reference
				+ ", scope=" + scope + ", types=" + Arrays.toString(types) + ", url=" + url + ", utc_offset="
				+ utc_offset + ", vicinity=" + vicinity + ", website=" + website + "]";
	}

}
