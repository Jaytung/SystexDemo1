package com.systextest.demo.model;

import java.util.HashMap;
import java.util.Map;

public class Data_6 {
	private String description;
	private String location;
	private String about;
	
	public Map<String, Object> getMap(){
		Map<String, Object> mpMap = new HashMap<>();
		mpMap.put("spi:description", description);
		mpMap.put("spi:location", location);
		mpMap.put("rdf:about", about);
		
		return mpMap;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	
}
