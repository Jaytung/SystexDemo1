package com.systextest.demo.model;


public class Data_8 {
	private String measureunitid;
	private String description;
	private String about;
	
	@Override
	public String toString() {
		return "Data_8 [measureunitid=" + measureunitid + ", description=" + description + ", about=" + about + "]";
	}

	public String getMeasureunitid() {
		return measureunitid;
	}
	
	public void setMeasureunitid(String measureunitid) {
		this.measureunitid = measureunitid;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getAbout() {
		return about;
	}
	
	public void setAbout(String about) {
		this.about = about;
	}

}