package com.systextest.demo.model;

import java.util.HashMap;
import java.util.Map;

public class Data_4 {
	private String curbalchgadate = "";
	private String datemoved = "2023/09/09 14:31:23";
	private String assettag = "415015";
	private String bin = "01";
	private String description = "Locking Device, 900/Z2//止動裝置 900/Z2";
	private String assetnum = "SIG-SMLD-000713";
    private String binnum = "01-G";
    private String location = "LD";
    private int capitalized = 1;
    private int invbalancesid = 28065;
    private double physcnt = 1.0;
    private String about = "http://localhost/maximo/oslc/os/thsrc_wpss_rot/_MjgwNjU-";
    private double curbal = 1.0;
    private String itemnum = "SIG-SMRO-LD06";
    private int rotating = 1;
    private String report_date = "2023/07/06 16:30:23";
    private String issueenit = "SET";
    private String physcntdate = "2019/10/22 15:07:05";
    

//    public String toString() {
//        return "'\n" +
//               "rdfs:member{" + "\n" +
//               "spi:curbalchgadate='" + curbalchgadate + '\'' + "\n" +
//               ", spi:binnum='" + binnum + '\'' + "\n" +
//               ", spi:datemoved='" + datemoved + '\'' + "\n" +
//               ", spi:assettag='" + assettag + '\'' + "\n" +
//               ", spi:description='" + description + '\'' + "\n" +
//               ", spi:location='" + location + '\'' + "\n" +
//               ", spi:capitalized=" + capitalized + "\n" +
//               ", spi:invbalancesid=" + invbalancesid + "\n" +
//               ", spi:physcnt=" + physcnt + "\n" +
//               ", rdf:about='" + about + '\'' + "\n" +
//               ", spi:curbal=" + curbal + "\n" +
//               ", spi:itemnum='" + itemnum + '\'' + "\n" +
//               ", spi:rotating=" + rotating + "'\n" +
//               ", spi:bin='" + bin + '\'' + "\n" +
//               ", spi:report_date='" + report_date + '\'' + "\n" +
//               ", spi:issueenit='" + issueenit + '\'' + "\n" +
//               ", spi:assetnum='" + assetnum + '\'' + "\n" +
//               ", spi:physcntdate='" + physcntdate + '\'' + "\n" +
//               '}';
//    }
    
    public Map<String , Map<String, Object>> getMap(){
    	Map<String , Map<String, Object>> dataList = new HashMap<>();
    	
    	Map<String, Object> Mydata = new HashMap<>();
    	Mydata.put("spi:curbalchgadate", curbalchgadate);
    	Mydata.put("spi:binnum", binnum);
    	Mydata.put("spi:datemoved", datemoved);
    	Mydata.put("spi:assettag", assettag);
    	Mydata.put("spi:description", description);
    	Mydata.put("spi:location", location);
    	Mydata.put("spi:capitalized", capitalized);
    	Mydata.put("spi:invbalancesid", invbalancesid);
    	Mydata.put("spi:physcnt", physcnt);
    	Mydata.put("rdf:about", about);
    	Mydata.put("spi:curbal", curbal);
    	Mydata.put("spi:itemnum", itemnum);
    	Mydata.put("spi:rotating", rotating);
    	Mydata.put("spi:bin", bin);
    	Mydata.put("spi:report_date", report_date);
    	Mydata.put("spi:issueenit", issueenit);
    	Mydata.put("spi:assetnum", assetnum);
    	Mydata.put("spi:physcntdate", physcntdate);
    	dataList.put("rdfs:member" , Mydata);
    	return dataList;
    }
    
    @Override
	public String toString() {
		return "Data_4 [curbalchgadate=" + curbalchgadate + ", datemoved=" + datemoved + ", assettag=" + assettag
				+ ", bin=" + bin + ", description=" + description + ", assetnum=" + assetnum + ", binnum=" + binnum
				+ ", location=" + location + ", capitalized=" + capitalized + ", invbalancesid=" + invbalancesid
				+ ", physcnt=" + physcnt + ", about=" + about + ", curbal=" + curbal + ", itemnum=" + itemnum
				+ ", rotating=" + rotating + ", report_date=" + report_date + ", issueenit=" + issueenit
				+ ", physcntdate=" + physcntdate + "]";
	}
    
	// Getter 和 Setter 方法
    public String getDdescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public String getCurbalchgadate() {
        return curbalchgadate;
    }

    public void setCurbalchgadate(String curbalchgadate) {
        this.curbalchgadate = curbalchgadate;
    }
    public String getDatemoved() {
        return datemoved;
    }

    public void setDatemoved(String datemoved) {
        this.datemoved = datemoved;
    }

    public String getAssettag() {
        return assettag;
    }

    public void setAssettag(String assettag) {
        this.assettag = assettag;
    }

    public String getBin() {
        return bin;
    }

    public void setBin(String bin) {
        this.bin = bin;
    }

    public String getAssetnum() {
        return assetnum;
    }

    public void setAssetnum(String assetnum) {
        this.assetnum = assetnum;
    }
    
    public String getBinnum() {
        return binnum;
    }

    public void setBinnum(String binnum) {
        this.binnum = binnum;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getCapitalized() {
        return capitalized;
    }

    public void setCapitalized(int capitalized) {
        this.capitalized = capitalized;
    }

    public int getInvbalancesid() {
        return invbalancesid;
    }

    public void setInvbalancesid(int invbalancesid) {
        this.invbalancesid = invbalancesid;
    }

    public double getPhyscnt() {
        return physcnt;
    }

    public void setPhyscnt(double physcnt) {
        this.physcnt = physcnt;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }
    
    public double getCurbal() {
        return curbal;
    }

    public void setCurbal(double curbal) {
        this.curbal = curbal;
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

    public String getReport_date() {
        return report_date;
    }

    public void setReport_date(String report_date) {
        this.report_date = report_date;
    }

    public String getIssueenit() {
        return issueenit;
    }

    public void setIssueenit(String issueenit) {
        this.issueenit = issueenit;
    }

    public String getPhyscntdate() {
        return physcntdate;
    }

    public void setPhyscntdate(String physcntdate) {
        this.physcntdate = physcntdate;
    }

}
