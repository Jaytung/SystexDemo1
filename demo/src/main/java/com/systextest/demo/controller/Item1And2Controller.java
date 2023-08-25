package com.systextest.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.core.JsonProcessingException;

import org.apache.log4j.Logger;


import javax.servlet.http.HttpServletRequest;


@RestController
@RequestMapping("/maximo/oslc/os")
public class Item1And2Controller {


    private static final Logger logger = Logger.getLogger(Item1And2Controller.class);

    @GetMapping("/THSRC_WPSS_STO")
    public ModelAndView item1Method(
		@RequestParam(value = "oslc.select", defaultValue = "*") String select,
		@RequestParam(value = "_dropnulls", defaultValue = "0") int dropNulls,
		@RequestParam(value = "oslc.where", defaultValue = "location+in+ LD,WD and transdate>=2021/06/01 and transdate<=2022/07/31") String where,
		@RequestParam(value = "_lid", defaultValue = "WPSS_USER") String lid,
		@RequestParam(value = "_lpwd", defaultValue = "Wpss12345") String lpwd) throws JsonProcessingException {

    	return null;
    }
       /*     @RequestParam(value = "location") String location,
            @RequestParam(value = "startdate") String startdate,
            @RequestParam(value = "enddate") String enddate,
            @RequestParam(value = "hasshelflife") String hasshelflife,
            @RequestParam(value = "ABC") String ABC,
            @RequestParam(value = "fromBin") String fromBin,
            @RequestParam(value = "toBin") String toBin,
            @RequestParam(value = "stockCheck") String stockCheck,
            @RequestParam(value = "stockSort") String stockSort,
            HttpServletRequest request) {

        String requestURL = request.getRequestURL().toString();
        requestURL+="?location="+location+"&startdate="+startdate+"&enddate="+enddate+"&hasshelflife="
                +hasshelflife+"&ABC="+ABC+"&fromBin="+fromBin+"&toBin="+toBin+"&stockCheck="+stockCheck+
                "&stockSort="+stockSort;
        logger.info("請求url"+requestURL);

        Map<String, Object> jsonData = new HashMap<>();
        HashMap<String, String> item1 = new HashMap<>();

        hasshelflife = hasshelflife.toUpperCase().equals("Y") ? "1" : "0";
		String fromBinPrefix = "bin_" + fromBin.length();
		String toBinPrefix = "bin_" + toBin.length();

        String baltype_a = "";
        String baltype_b = "";
        String baltype_c = "";

        if (ABC.equalsIgnoreCase("A")) {
            baltype_a = "Y";
        } else if (ABC.equalsIgnoreCase("B")) {
            baltype_b = "Y";
        } else if (ABC.equalsIgnoreCase("C")) {
            baltype_c = "Y";
        }


        if (stockCheck.equalsIgnoreCase("A")) {

            item1.put("spi:location", location);
            item1.put("spi:physcntdate", enddate);
            item1.put("spi:hasshelflife", hasshelflife);
            item1.put("spi:baltype_a", baltype_a);
            item1.put("spi:baltype_b", baltype_b);
            item1.put("spi:baltype_c", baltype_c);
            item1.put("spi:" + fromBinPrefix, fromBin);
            item1.put("spi:" + toBinPrefix, toBin);
            // item1.put("spi:curbalchgdate", curbalchgadate);
            item1.put("spi:binnum", "12-L01-02A1");
            item1.put("spi:description",
                    "DIESEL EXHAUST FLUID, 2.5 gal, standardised as  AUS32 in ISO022241& DIN70070觸媒還原劑");
            item1.put("spi:capitalized", "0");
            item1.put("spi:orgid", "THSRC");
            item1.put("spi:invbalancesid", "388051");
            item1.put("spi:physcnt", "2.0");
            item1.put("rdf:about", "http://localhost/maximo/oslc/os/thsrc_wpss_sto/_Mzg4MDUx");
            item1.put("spi:curbal", "2.0");
            item1.put("spi:lotnum", "200401l1");
            item1.put("spi:itemnum", "WET-UTTK-0316");
            item1.put("spi:rotating", "0");
            item1.put("spi:report_date", "2023/07/12 11:43:50");
            item1.put("spi:issueunit", "TIN");
            item1.put("spi:useby", "2021/09/03");
            ModelAndView modelAndView = new ModelAndView("result1"); // Specify the HTML file name without the extension
            modelAndView.addObject("jsonData", item1); // Pass the JSON data to the view

            jsonData.put("rdfs:member", item1);
            logger.info("Method=item1Method()返回的資料"+item1);
            return modelAndView;
            //respond.put("rdfs:member", item1);
        } else if (stockCheck.equalsIgnoreCase("B")) {
            item1.put("spi:location", location);
            item1.put("spi:curbalchgadate", enddate);
            item1.put("spi:hasshelflife", hasshelflife);
            item1.put("spi:baltype_a", baltype_a);
            item1.put("spi:baltype_b", baltype_b);
            item1.put("spi:baltype_c", baltype_c);
            item1.put("spi:" + fromBinPrefix, fromBin);
            item1.put("spi:" + toBinPrefix, toBin);
            item1.put("spi:binnum", "01-R03-01E2");
            item1.put("spi:description", "Brush Support//電刷支撐");
            item1.put("spi:capitalized", "0");
            item1.put("spi:orgid", "THSRC");
            item1.put("spi:invbalancesid", "28020");
            item1.put("spi:physcnt", "173.0");
            item1.put("rdf:about", "http://localhost/maximo/oslc/os/thsrc_wpss_sto/MjgwMja");
            item1.put("spi:curbal", "172.0");
            item1.put("spi:lotnum", "090320C");
            item1.put("spi:itemnum", "RST-BGGD-0305");
            item1.put("spi:rotating", "0");
            item1.put("spi:report_date", "2023/07/12 12:03:21");
            item1.put("spi:issueunit", "EA");
            item1.put("spi:physcntdate", "2023/06/14");
            item1.put("spi:useby", "");
            // Specify the HTML file name without the extension
            ModelAndView modelAndView = new ModelAndView("result2");
            // Pass the JSON data to the view
            modelAndView.addObject("jsonData", item1);
            jsonData.put("rdfs:member", item1);
            logger.info("Method=item2Method()返回的資料"+item1);
            return modelAndView;
        } else {
            item1.put("Error", "資料有誤請重新填寫");
        }
        // Specify the HTML file name without the extension
        ModelAndView modelAndView = new ModelAndView("result1");
        // Pass the JSON data to the view
        modelAndView.addObject("jsonData", item1);
        return modelAndView;
    }*/
    //return JSON
    @GetMapping("/item1json")
    public Map<String, Object> item1Json(
            @RequestParam(value = "location") String location,
            @RequestParam(value = "startdate") String startdate,
            @RequestParam(value = "enddate") String enddate,
            @RequestParam(value = "hasshelflife") String hasshelflife,
            @RequestParam(value = "ABC") String ABC,
            @RequestParam(value = "fromBin") String fromBin,
            @RequestParam(value = "toBin") String toBin,
            @RequestParam(value = "stockCheck") String stockCheck,
            @RequestParam(value = "stockSort") String stockSort,
            HttpServletRequest request) {

        String requestURL = request.getRequestURL().toString();
        requestURL+="?location="+location+"&startdate="+startdate+"&enddate="+enddate+"&hasshelflife="
                +hasshelflife+"&ABC="+ABC+"&fromBin="+fromBin+"&toBin="+toBin+"&stockCheck="+stockCheck+
                "&stockSort="+stockSort;
        logger.info("請求url"+requestURL);

        Map<String, Object> jsonData = new HashMap<>();
        HashMap<String, String> item1 = new HashMap<>();

        hasshelflife = hasshelflife.toUpperCase().equals("Y") ? "1" : "0";
        String fromBinPrefix = "bin_" + fromBin.length();
        String toBinPrefix = "bin_" + toBin.length();

        String baltype_a = "";
        String baltype_b = "";
        String baltype_c = "";

        if (ABC.equalsIgnoreCase("A")) {
            baltype_a = "Y";
        } else if (ABC.equalsIgnoreCase("B")) {
            baltype_b = "Y";
        } else if (ABC.equalsIgnoreCase("C")) {
            baltype_c = "Y";
        }


        if (stockCheck.equalsIgnoreCase("A")) {

            item1.put("spi:location", location);
            item1.put("spi:physcntdate", enddate);
            item1.put("spi:hasshelflife", hasshelflife);
            item1.put("spi:baltype_a", baltype_a);
            item1.put("spi:baltype_b", baltype_b);
            item1.put("spi:baltype_c", baltype_c);
            item1.put("spi:" + fromBinPrefix, fromBin);
            item1.put("spi:" + toBinPrefix, toBin);
            // item1.put("spi:curbalchgdate", curbalchgadate);
            item1.put("spi:binnum", "12-L01-02A1");
            item1.put("spi:description",
                    "DIESEL EXHAUST FLUID, 2.5 gal, standardised as  AUS32 in ISO022241& DIN70070觸媒還原劑");
            item1.put("spi:capitalized", "0");
            item1.put("spi:orgid", "THSRC");
            item1.put("spi:invbalancesid", "388051");
            item1.put("spi:physcnt", "2.0");
            item1.put("rdf:about", "http://localhost/maximo/oslc/os/thsrc_wpss_sto/_Mzg4MDUx");
            item1.put("spi:curbal", "2.0");
            item1.put("spi:lotnum", "200401l1");
            item1.put("spi:itemnum", "WET-UTTK-0316");
            item1.put("spi:rotating", "0");
            item1.put("spi:report_date", "2023/07/12 11:43:50");
            item1.put("spi:issueunit", "TIN");
            item1.put("spi:useby", "2021/09/03");
            ModelAndView modelAndView = new ModelAndView("result1"); // Specify the HTML file name without the extension
            modelAndView.addObject("jsonData", item1); // Pass the JSON data to the view

            jsonData.put("rdfs:member", item1);
            logger.info("Method=item1Json()返回的資料"+jsonData);
            return jsonData;
            //respond.put("rdfs:member", item1);
        } else if (stockCheck.equalsIgnoreCase("B")) {
            item1.put("spi:location", location);
            item1.put("spi:curbalchgadate", enddate);
            item1.put("spi:hasshelflife", hasshelflife);
            item1.put("spi:baltype_a", baltype_a);
            item1.put("spi:baltype_b", baltype_b);
            item1.put("spi:baltype_c", baltype_c);
            item1.put("spi:" + fromBinPrefix, fromBin);
            item1.put("spi:" + toBinPrefix, toBin);
            item1.put("spi:binnum", "01-R03-01E2");
            item1.put("spi:description", "Brush Support//電刷支撐");
            item1.put("spi:capitalized", "0");
            item1.put("spi:orgid", "THSRC");
            item1.put("spi:invbalancesid", "28020");
            item1.put("spi:physcnt", "173.0");
            item1.put("rdf:about", "http://localhost/maximo/oslc/os/thsrc_wpss_sto/MjgwMja");
            item1.put("spi:curbal", "172.0");
            item1.put("spi:lotnum", "090320C");
            item1.put("spi:itemnum", "RST-BGGD-0305");
            item1.put("spi:rotating", "0");
            item1.put("spi:report_date", "2023/07/12 12:03:21");
            item1.put("spi:issueunit", "EA");
            item1.put("spi:physcntdate", "2023/06/14");
            item1.put("spi:useby", "");

            jsonData.put("rdfs:member", item1);
            logger.info("Method=item2Json()返回的資料"+jsonData);
            return jsonData;
        } else {
            item1.put("Error", "資料有誤請重新填寫");
            jsonData.put("Message:",item1);
        }

        return jsonData;
    }
}
