package com.extentia.entity;

public class Category {

	private String id;
	private String name;
	private String pluralName;
	private String shortName;
	private CategoryIcon icon;
	private String primary;

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

	public String getPluralName() {
		return pluralName;
	}

	public void setPluralName(String pluralName) {
		this.pluralName = pluralName;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public CategoryIcon getIcon() {
		return icon;
	}

	public void setIcon(CategoryIcon icon) {
		this.icon = icon;
	}

	public String getPrimary() {
		return primary;
	}

	public void setPrimary(String primary) {
		this.primary = primary;
	}

	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", pluralName=" + pluralName + ", shortName=" + shortName
				+ ", icon=" + icon + ", primary=" + primary + "]";
	}

}
