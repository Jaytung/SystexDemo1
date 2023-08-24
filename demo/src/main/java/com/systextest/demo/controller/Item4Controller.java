
package com.systextest.demo.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.systextest.demo.model.*;

@RestController
@RequestMapping("/maximo/oslc/os")
public class Item4Controller {
	@Autowired
	private Data_4 data_4;
	private static final Logger logger = Logger.getLogger(Item4Controller.class);
	
	// http://localhost:8080/maximo/oslc/os/THSRC_WPSS_ROT?oslc.select=*&_dropnulls=0&oslc.where=location+in+%5B%22LD%22%2C%22WD%22%5D+and+bin%3E%3D%2201%22+and+bin%3C%3D%2206%22&_lid=WPSS_USER&_lpwd=Wpss12345
	@GetMapping("/THSRC_WPSS_ROT")
	public ModelAndView getData4(@RequestParam(value = "oslc.select", defaultValue = "*") String select,
			@RequestParam(value = "_dropnulls", defaultValue = "0") int dropNulls,
			@RequestParam(value = "oslc.where", defaultValue = "location+in+[\"LD\",\"WD\"] and bin>=\"2021/06/01\" and bin<=\"2022/07/31\"") String where,
			@RequestParam(value = "_lid", defaultValue = "WPSS_USER") String lid,
			@RequestParam(value = "_lpwd", defaultValue = "Wpss12345") String lpwd) {

		// Extract location
		Pattern locationPattern = Pattern.compile("\\[(.*?)\\]");
		Matcher locationMatcher = locationPattern.matcher(where);

		String locationConditions = "";
		String startBin = "";
		String endBin = "";
		if (locationMatcher.find()) {
			String extractedContent = locationMatcher.group(1);
			locationConditions = extractedContent.replace("\"", "");
		}

		// Extract time
		Pattern BinPattern = Pattern.compile("bin>=\"(.*?)\"\\s+and\\s+bin<=\"(.*?)\"");
		Matcher BinMatcher = BinPattern.matcher(where);

		if (BinMatcher.find()) {
			startBin = BinMatcher.group(1);
			endBin = BinMatcher.group(2);

		}

		if (!locationConditions.isEmpty()) {
			data_4.setLocation(locationConditions);
		}

		

		logger.info(data_4.toString());
		ModelAndView modelAndView = new ModelAndView("result4"); // Specify the HTML file name without the extension
        modelAndView.addObject("jsonData", data_4.getMap()); // Pass the JSON data to the view
		return modelAndView;
	}

}