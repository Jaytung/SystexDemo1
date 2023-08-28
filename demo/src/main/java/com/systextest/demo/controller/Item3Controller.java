package com.systextest.demo.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.systextest.demo.model.*;

@RestController
@RequestMapping("/maximo/oslc/os")
public class Item3Controller {

	@Autowired
	private Data_3 data_3;

	private static final Logger logger = Logger.getLogger(Item3Controller.class);

	@GetMapping("/THSRC_WPSS_COUNTINGL")
	public ModelAndView getData3(
			@RequestParam(value = "oslc.select", defaultValue = "*") String select,
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
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes())
				.getRequest();

		String requestUrl = request.getRequestURL().toString();
		String queryString = request.getQueryString();
//        String fullUrl = (queryString == null) ? requestUrl : requestUrl + "?" + queryString;
		String URL = requestUrl + "?oslc.select=" + select + "&_dropnulls=" + dropNulls + "&oslc.where=" + where
				+ "&_lid=" + lid + "&_lpwd=" + lpwd;
		//System.out.println(URL);

//		System.out.println("oslc.select : " + select);
//		System.out.println("_dropnulls : " + dropNulls);
//		System.out.println("oslc.where : " + where);
//		System.out.println("_lid : " + lid);
//		System.out.println("_lpwd : " + lpwd);
//		System.out.println("Location: " + locationConditions);
//		System.out.println("Start Date: " + startDate);
//		System.out.println("End Date: " + endDate);

		logger.info("MAXIMO需協助開發程式支數-項目3 庫存(異動)盤點清冊: " + URL);
		logger.info("JSON: " + data_3.toString());
		ModelAndView modelAndView = new ModelAndView("result3");
		modelAndView.addObject("jsonData", data_3.getMap());
		return modelAndView;
	}

}
