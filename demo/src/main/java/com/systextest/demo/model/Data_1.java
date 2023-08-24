package com.systextest.demo.model;

import lombok.Data;

@Data
public class Data_1 {
    private String location;
    private String startdate;
    private String enddate;
    private String hasshelflife;
    private String ABC;
    private String fromBin;
    private String toBin;
    private String stockCheck;
    private String stockSort;
    private String baltype_a;
    private String baltype_b;
    private String baltype_c;
    private String binnum;
    private String description;
    private String capitalized;
    private String orgid;
    private String invbalancesid;
    private String physcnt;
    private String about;
    private String curbal;
    private String lotnum;
    private String itemnum;
    private String rotating;
    private String report_date;
    private String issueunit;
    private String useby;



    @Override
    public String toString() {
        String fromBinPrefix="bin_"+fromBin.length();
        String toBinPrefix="bin_"+toBin.length();

        return "Data_1{" +
                "spi:location='" + location + '\'' +
                ", spi:startdate='" + startdate + '\'' +
                ", spi:enddate='" + enddate + '\'' +
                ", spi:hasshelflife='" + hasshelflife + '\'' +
                ", "+fromBinPrefix + fromBin + '\'' +
                ", "+toBinPrefix + toBin + '\'' +
                ", spi:stockCheck='" + stockCheck + '\'' +
                ", spi:stockSort='" + stockSort + '\'' +
                ", spi:baltype_a='" + baltype_a + '\'' +
                ", spi:baltype_b='" + baltype_b + '\'' +
                ", spi:baltype_c='" + baltype_c + '\'' +
                ", spi:binnum='" + binnum + '\'' +
                ", spi:description='" + description + '\'' +
                ", spi:capitalized='" + capitalized + '\'' +
                ", spi:orgid='" + orgid + '\'' +
                ", spi:invbalancesid='" + invbalancesid + '\'' +
                ", spi:physcnt='" + physcnt + '\'' +
                ", rdf:about='" + about + '\'' +
                ", spi:curbal='" + curbal + '\'' +
                ", spi:lotnum='" + lotnum + '\'' +
                ", spi:itemnum='" + itemnum + '\'' +
                ", spi:rotating='" + rotating + '\'' +
                ", spi:report_date='" + report_date + '\'' +
                ", spi:issueunit='" + issueunit + '\'' +
                ", spi:useby='" + useby + '\'' +
                '}';
    }
}
