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

import com.systextest.demo.model.Data_6;

@RestController
@RequestMapping("/maximo/oslc/os")
public class Item6Controller {
	
//	private static final Logger logger = LogManager.getLogger(Data_6.class);
	private static final ObjectMapper objectMapper = new ObjectMapper();
	private static final Logger logger = Logger.getLogger(Item6Controller.class);
	@GetMapping("/storeroom")
	public ModelAndView getStoreroom() throws JsonProcessingException {
		Data_6 storeRoom = new Data_6();
		storeRoom.setDescription("Sub-Storeroom(Serviced&Repaired)(Huri)/Location:NangangStation/RSw");
		storeRoom.setLocation("SWDSP-NAG-RSW");
		storeRoom.setAbout("http://localhost/maximo/os1c/os/thsrc_storeroom/_U1dEUlAtTkFHLVOTVw--");
//		logger.info("Response JSON: {}", storeRoom);
//		logger.info("Response JSON: {}", objectMapper.writeValueAsString(storeRoom));
		ModelAndView modelAndView = new ModelAndView("result6"); // Specify the HTML file name without the extension
//        modelAndView.addObject("jsonData", storeRoom); // Pass the JSON data to the view
        modelAndView.addObject("jsonData", storeRoom.getMap());
     // Get the HttpServletRequest
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest();

        // Get the request URL and other relevant information
        String requestUrl = request.getRequestURL().toString();
        String queryString = request.getQueryString();
        String fullUrl = (queryString == null) ? requestUrl : requestUrl + "?" + queryString;

        // Log the URL
        logger.info("[Item5]"+"Frontend request URL: " + fullUrl);
		logger.info(objectMapper.writeValueAsString(storeRoom.getMap()));
		return modelAndView;
//		return storeRoom;
	}
	
//	@GetMapping("/user")
//    public String getItem(
//            @RequestParam("oslc.select") String oslcSelect,
//            @RequestParam("_dropnulls") String dropNulls,
//            @RequestParam("_lid") String lid,
//            @RequestParam("_lpwd") String lpwd) {
//
//        System.out.println("oslc.select: " + oslcSelect);
//        System.out.println("_dropnulls: " + dropNulls);
//        System.out.println("_lid: " + lid);
//        System.out.println("_lpwd: " + lpwd);
//
//        return "index";
//    }
}
