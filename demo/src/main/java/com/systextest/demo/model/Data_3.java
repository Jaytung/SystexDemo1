package com.systextest.demo.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lombok.Data;

@Data
public class Data_3 {
	
    private String binnum = "01-G04";
    private String description =  "Channel Service Unit/Data Service Unit//通道/資料服務接收器";
    private String location = "LD";
    private int capitalized = 1;
    private String transdate = "2021/06/30";
    private int invbalancesid = 402161;
    private double physcnt = 2.0;
    private String about = "http://localhost/maximo/oslc/os/thsrc_wpss_countingl/_NDAyMTYx";
    private String trans_type = "TR-OUT";
    private double curbal = 0.0;
    private String lotnum = "";
    private String itemnum = "COM-ATPP-RP38";
    private int rotating = 1;
    private String report_date = "2023/07/06 16:27:31";
    private String issueenit = "SET";
    private String physcntdate = "2021/06/20";
    private int hasshelflife = 0;
    private String useby = "";

//    public String toString() {
//        return  "'\n" + "rdfs:member{" + "\n" +
//                "spi:binnum='" + binnum + '\'' + "\n" +
//                ", spi:description='" + description + '\'' + "\n" +
//                ", spi:location='" + location + '\'' + "\n" +
//                ", spi:capitalized=" + capitalized + "\n" +
//                ", spi:transdate='" + transdate + '\'' + "\n" +
//                ", spi:invbalancesid=" + invbalancesid + "\n" +
//                ", spi:physcnt=" + physcnt + "\n" +
//                ", rdf:about='" + about + '\'' + "\n" +
//                ", spi:trans_type='" + trans_type + '\'' + "\n" +
//                ", spi:curbal=" + curbal + "\n" +
//                ", spi:lotnum='" + lotnum + '\'' + "\n" +
//                ", spi:itemnum='" + itemnum + '\'' + "\n" +
//                ", spi:rotating=" + rotating + "'\n" +
//                ", spi:report_date='" + report_date + '\'' + "\n" +
//                ", spi:issueenit='" + issueenit + '\'' + "\n" +
//                ", spi:physcntdate='" + physcntdate + '\'' + "\n" +
//                ", spi:hasshelflife=" + hasshelflife + "\n" +
//                ", spi:useby='" + useby + '\'' + "\n" +
//                '}';
//    }
    
    public Map<String , Map<String, Object>> getMap(){
    	Map<String , Map<String, Object>> dataList = new HashMap<>();
    	
    	Map<String, Object> Mydata = new HashMap<>();
    	Mydata.put("spi:binnum", binnum);
    	Mydata.put("spi:description", description);
    	Mydata.put("spi:location", location);
    	Mydata.put("spi:capitalized", capitalized);
    	Mydata.put("spi:transdate", transdate);
    	Mydata.put("spi:invbalancesid", invbalancesid);
    	Mydata.put("spi:physcnt", physcnt);
    	Mydata.put("rdf:about", about);
    	Mydata.put("spi:trans_type", trans_type);
    	Mydata.put("spi:curbal", curbal);
    	Mydata.put("spi:lotnum", lotnum);
    	Mydata.put("spi:itemnum", itemnum);
    	Mydata.put("spi:rotating", rotating);
    	Mydata.put("spi:report_date", report_date);
    	Mydata.put("spi:issueenit", issueenit);
    	Mydata.put("spi:physcntdate", physcntdate);
    	Mydata.put("spi:hasshelflife", hasshelflife);
    	Mydata.put("spi:useby", useby);
    	
    	dataList.put("rdfs:member" , Mydata);
    	return dataList;
    }

	@Override
	public String toString() {
		return "Data_3 [binnum=" + binnum + ", description=" + description + ", location=" + location + ", capitalized="
				+ capitalized + ", transdate=" + transdate + ", invbalancesid=" + invbalancesid + ", physcnt=" + physcnt
				+ ", about=" + about + ", trans_type=" + trans_type + ", curbal=" + curbal + ", lotnum=" + lotnum
				+ ", itemnum=" + itemnum + ", rotating=" + rotating + ", report_date=" + report_date + ", issueenit="
				+ issueenit + ", physcntdate=" + physcntdate + ", hasshelflife=" + hasshelflife + ", useby=" + useby
				+ "]";
	}
	
    // Getter 和 Setter 方法
 
    public String getBinnum() {
        return binnum;
    }

    public void setBinnum(String binnum) {
        this.binnum = binnum;
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

    public int getCapitalized() {
        return capitalized;
    }

    public void setCapitalized(int capitalized) {
        this.capitalized = capitalized;
    }

    public String getTransdate() {
        return transdate;
    }

    public void setTransdate(String transdate) {
        this.transdate = transdate;
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

    public String getTrans_type() {
        return trans_type;
    }

    public void setTrans_type(String trans_type) {
        this.trans_type = trans_type;
    }

    public double getCurbal() {
        return curbal;
    }

    public void setCurbal(double curbal) {
        this.curbal = curbal;
    }

    public String getLotnum() {
        return lotnum;
    }

    public void setLotnum(String lotnum) {
        this.lotnum = lotnum;
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

    public int getHasshelflife() {
        return hasshelflife;
    }

    public void setHasshelflife(int hasshelflife) {
        this.hasshelflife = hasshelflife;
    }

    public String getUseby() {
        return useby;
    }

    public void setUseby(String useby) {
        this.useby = useby;
    }
    
    
}
