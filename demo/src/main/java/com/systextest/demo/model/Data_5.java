package com.systextest.demo.model;

import java.util.HashMap;
import java.util.Map;

public class Data_5 {
	private String eaudittimestamp;
	private String description;
	private int rowstamp;
	private int capitalized;
	private String sysvalue;
	private String about;
	private String itemnum;
	private int rotating;
	private String eaudittype;
	private String lastchangerequest;
	private String issueunit;
	private int inspectionrequired;
	private String refpack;
	private int hasshelflife;
	
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return "123";
//	}
	
	public Map<String, Object> getMap(){
		Map<String, Object> mpMap = new HashMap<>();
		mpMap.put("spi:eaudittimestamp", eaudittimestamp);
		mpMap.put("spi:description", description);
		mpMap.put("spi:rowstamp", rowstamp);
		mpMap.put("spi:capitalized", capitalized);
		mpMap.put("spi:sysvalue", sysvalue);
		mpMap.put("rdf:about", about);
		mpMap.put("spi:itemnum", itemnum);
		mpMap.put("spi:rotating", rotating);
		mpMap.put("spi:eaudittype", eaudittype);
		mpMap.put("spi:lastchangerequest", lastchangerequest);
		mpMap.put("spi:issueunit", issueunit);
		mpMap.put("spi:inspectionrequired", inspectionrequired);
		mpMap.put("spi:refpack", refpack);
		mpMap.put("spi:hasshelflife", hasshelflife);
		return mpMap;
	}
	public String getEaudittimestamp() {
		return eaudittimestamp;
	}
	public void setEaudittimestamp(String eaudittimestamp) {
		this.eaudittimestamp = eaudittimestamp;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getRowstamp() {
		return rowstamp;
	}
	public void setRowstamp(Integer rowstamp) {
		this.rowstamp = rowstamp;
	}
	public int getCapitalized() {
		return capitalized;
	}
	public void setCapitalized(int capitalized) {
		this.capitalized = capitalized;
	}
	public String getSysvalue() {
		return sysvalue;
	}
	public void setSysvalue(String sysvalue) {
		this.sysvalue = sysvalue;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	public String getItemnum() {
		return itemnum;
	}
	public void setItemnum(String itemnum) {
		this.itemnum = itemnum;
	}
	public int getRotating() {
		return rotating;
	}
	public void setRotating(int rotating) {
		this.rotating = rotating;
	}
	public String getEaudittype() {
		return eaudittype;
	}
	public void setEaudittype(String eaudittype) {
		this.eaudittype = eaudittype;
	}
	public String getLastchangerequest() {
		return lastchangerequest;
	}
	public void setLastchangerequest(String lastchangerequest) {
		this.lastchangerequest = lastchangerequest;
	}
	public String getIssueunit() {
		return issueunit;
	}
	public void setIssueunit(String issueunit) {
		this.issueunit = issueunit;
	}
	public int getInspectionrequired() {
		return inspectionrequired;
	}
	public void setInspectionrequired(int inspectionrequired) {
		this.inspectionrequired = inspectionrequired;
	}
	public String getRefpack() {
		return refpack;
	}
	public void setRefpack(String refpack) {
		this.refpack = refpack;
	}
	public int getHasshelflife() {
		return hasshelflife;
	}
	public void setHasshelflife(int hasshelflife) {
		this.hasshelflife = hasshelflife;
	}
	public void setRowstamp(int rowstamp) {
		this.rowstamp = rowstamp;
	}
	
}
