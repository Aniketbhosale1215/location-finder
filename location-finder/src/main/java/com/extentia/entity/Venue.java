/**
 * 
 */
package com.extentia.entity;

import java.util.List;

/**
 * @author Aniket.Bhosale
 *
 */
public class Venue {

	private String id;
	private String name;
	private Location location;
	private List<Category> categories;
	private VenuePage venuePage;
	private String referralId;
	private String hasPerk;

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

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public List<Category> getCategories() {
		return categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}

	public VenuePage getVenuePage() {
		return venuePage;
	}

	public void setVenuePage(VenuePage venuePage) {
		this.venuePage = venuePage;
	}

	public String getReferralId() {
		return referralId;
	}

	public void setReferralId(String referralId) {
		this.referralId = referralId;
	}

	public String getHasPerk() {
		return hasPerk;
	}

	public void setHasPerk(String hasPerk) {
		this.hasPerk = hasPerk;
	}

	@Override
	public String toString() {
		return "Venue [id=" + id + ", name=" + name + ", location=" + location + ", categories=" + categories
				+ ", venuePage=" + venuePage + ", referralId=" + referralId + ", hasPerk=" + hasPerk + "]";
	}

}
