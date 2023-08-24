package com.systextest.demo.controller;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.systextest.demo.model.*;

@RestController
@RequestMapping("/maximo/oslc/os")
public class Item3Controller {

	@Autowired
	private Data_3 data_3;

	private static final Logger logger = Logger.getLogger(Item3Controller.class);
	// http://localhost:8080/maximo/oslc/os/THSRC_WPSS_COUNTINGL?oslc.select=*&_dropnulls=0&oslc.where=location+in+%5B%22LD%22%2C%22WD%22%5D+and+transdate%3E%3D%222021%2F06%2F01%22+and+transdate%3C%3D%222022%2F07%2F31%22&_lid=WPSS_USER&_lpwd=Wpss12345
	@GetMapping("/THSRC_WPSS_COUNTINGL")
	public ModelAndView getData3(@RequestParam(value = "oslc.select", defaultValue = "*") String select,
			@RequestParam(value = "_dropnulls", defaultValue = "0") int dropNulls,
			@RequestParam(value = "oslc.where", defaultValue = "location+in+ LD,WD and transdate>=2021/06/01 and transdate<=2022/07/31") String where,
			@RequestParam(value = "_lid", defaultValue = "WPSS_USER") String lid,
			@RequestParam(value = "_lpwd", defaultValue = "Wpss12345") String lpwd) throws JsonProcessingException {

		Pattern locationPattern = Pattern.compile("\\[(.*?)\\]");
		Matcher locationMatcher = locationPattern.matcher(where);

		String locationConditions = "";
		String startDate = "";
		String endDate = "";
		if (locationMatcher.find()) {
			String extractedContent = locationMatcher.group(1);
			locationConditions = extractedContent.replace("\"", "");
		}

		// Extract time
		Pattern timePattern = Pattern.compile("transdate>=\"(.*?)\"\\s+and\\s+transdate<=\"(.*?)\"");
		Matcher timeMatcher = timePattern.matcher(where);

		if (timeMatcher.find()) {
			startDate = timeMatcher.group(1);
			endDate = timeMatcher.group(2);

		}

		if (!locationConditions.isEmpty()) {
			data_3.setLocation(locationConditions);
		}

//		System.out.println("oslc.select : " + select);
//		System.out.println("_dropnulls : " + dropNulls);
//		System.out.println("oslc.where : " + where);
//		System.out.println("_lid : " + lid);
//		System.out.println("_lpwd : " + lpwd);
//		System.out.println("Location: " + locationConditions);
//		System.out.println("Start Date: " + startDate);
//		System.out.println("End Date: " + endDate);
		logger.info(data_3.toString());
		
		
		ModelAndView modelAndView = new ModelAndView("result3"); // Specify the HTML file name without the extension
        modelAndView.addObject("jsonData", data_3.getMap()); // Pass the JSON data to the view
		return modelAndView;
	}

}
