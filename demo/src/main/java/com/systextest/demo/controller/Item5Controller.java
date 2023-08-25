package com.systextest.demo.controller;

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import javax.servlet.http.HttpServletRequest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.systextest.demo.model.Data_5;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/maximo/oslc/os")
public class Item5Controller {

//	private static final Logger logger = LogManager.getLogger(Item5Controller.class);
	private static final Logger logger = Logger.getLogger(Item5Controller.class);
	private static final ObjectMapper objectMapper = new ObjectMapper();
	@GetMapping("/item")
	public ModelAndView getItem() throws JsonProcessingException{
		Data_5 item = new Data_5();
			item.setEaudittimestamp("2023/97/9311:14:35");
			item.setDescription("GAUGE,pressure,forEDN,WIKA63SC8-108");
			item.setRowstamp(415999848);
			item.setCapitalized(0);
			item.setSysvalue("DXX");
			item.setAbout("http://localhost/maximo/osic/os/thsrc_a_item/_RDAyLWINDMt/DIwiv--");
			item.setItemnum("D92-UL93-8203");
			item.setRotating(9);
			item.setEaudittype("U");
			item.setLastchangerequest("");
			item.setIssueunit("EA");
			item.setInspectionrequired(0);
			item.setRefpack("");
			item.setHasshelflife(0);
			// Get the HttpServletRequest
	        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest();

	        // Get the request URL and other relevant information
	        String requestUrl = request.getRequestURL().toString();
	        String queryString = request.getQueryString();
	        String fullUrl = (queryString == null) ? requestUrl : requestUrl + "?" + queryString;

	        // Log the URL
	        logger.info("[Item5]"+"Frontend request URL: " + fullUrl);
			logger.info(objectMapper.writeValueAsString(item.getMap()));
//			logger.info("Response JSON: {}", item);
//			logger.info("Response JSON: {}", objectMapper.writeValueAsString(item));
//			logger.info(objectMapper.writeValueAsString(item));
			ModelAndView modelAndView = new ModelAndView("result5"); // Specify the HTML file name without the extension
//	        modelAndView.addObject("jsonData", storeRoom); // Pass the JSON data to the view
	        modelAndView.addObject("jsonData", item.getMap());
			return modelAndView;
	}
	@GetMapping("/items")
	public List<Data_5> getItems() throws JsonProcessingException{
		List<Data_5> itemList = new ArrayList<>();
		
		Data_5 item1 = new Data_5();
		item1.setEaudittimestamp("2023/97/9311:14:35");
		item1.setDescription("GAUGE,pressure,forEDN,WIKA63SC8-108");
		item1.setRowstamp(415999848);
		item1.setCapitalized(0);
		item1.setSysvalue("DXX");
		item1.setAbout("http://localhost/maximo/osic/os/thsrc_a_item/_RDAyLWINDMt/DIwiv--");
		item1.setItemnum("D92-UL93-8203");
		item1.setRotating(9);
		item1.setEaudittype("U");
		item1.setLastchangerequest("");
		item1.setIssueunit("EA");
		item1.setInspectionrequired(0);
		item1.setRefpack("");
		item1.setHasshelflife(0);
		itemList.add(item1);
		
		Data_5 item2 = new Data_5();
		item2.setEaudittimestamp("2023/97/9311:14:35");
		item2.setDescription("GAUGE,pressure,forEDN,WIKA63SC8-108");
		item2.setRowstamp(415999848);
		item2.setCapitalized(0);
		item2.setSysvalue("DXX");
		item2.setAbout("http://localhost/maximo/osic/os/thsrc_a_item/_RDAyLWINDMt/DIwiv--");
		item2.setItemnum("D92-UL93-8203");
		item2.setRotating(9);
		item2.setEaudittype("U");
		item2.setLastchangerequest("");
		item2.setIssueunit("EA");
		item2.setInspectionrequired(0);
		item2.setRefpack("");
		item2.setHasshelflife(0);
		itemList.add(item2);
		logger.info(objectMapper.writeValueAsString(itemList));
//		logger.info("Response JSON: {}", item2);
//		logger.info("Response JSON: {}", objectMapper.writeValueAsString(item2));
		return itemList;
	}
	
}
