package com.systextest.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import javax.servlet.http.HttpServletRequest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.systextest.demo.model.Data_7;

@RestController
@RequestMapping("/maximo/oslc/os")
public class Item7Controller {
	private static final Logger logger = Logger.getLogger(Item7Controller.class);
	@GetMapping("/THSRC_WPSS_INV")
	public ModelAndView getStoreroom() throws JsonProcessingException {
		
		List<Data_7> listData = new ArrayList<>();
		Data_7 storeRoom1=new Data_7();
		storeRoom1.setItemnum("BMS-BC01-0000");
		storeRoom1.setLocation("ZD");
		storeRoom1.setAbout("https://localhost/maximo.oslc.os.thsrc_wpss_inv/_Qk1TLUJDMDEtMDAwMA");
		listData.add(storeRoom1);
		Data_7 storeRoom2=new Data_7();
		storeRoom2.setItemnum("BMS-BC01-0501");
		storeRoom2.setLocation("LD");
		storeRoom2.setAbout("https://localhost/maximo.oslc.os.thsrc_wpss_inv/_Qk1TLUJDMDEtMDUwMQ");
		listData.add(storeRoom2);
		Data_7 storeRoom3=new Data_7();
		storeRoom3.setItemnum("BMS-BC01-0502");
		storeRoom3.setLocation("LD");
		storeRoom3.setAbout("https://localhost/maximo.oslc.os.thsrc_wpss_inv/_Qk1TLUJDMDEtMDUwMg");
		listData.add(storeRoom3);
		Data_7 storeRoom4=new Data_7();
		storeRoom4.setItemnum("BMS-BC07-0000");
		storeRoom4.setLocation("ZD");
		storeRoom4.setAbout("https://localhost/maximo.oslc.os.thsrc_wpss_inv/_Qk1TLUJDMDctMDAwMA");
		listData.add(storeRoom4);
		//return listData;
		
		/*List<Map<String, String>> listData = new ArrayList<>();

		Map<String, String> map1 = new HashMap<>();
		map1.put("spi:itemnum", "BMS-BC01-0000");
		map1.put("spi:location", "ZD");
		map1.put("rdf:about", "https://localhost/maximo.oslc.os.thsrc_wpss_inv/_Qk1TLUJDMDEtMDAwMA");
		listData.add(map1);

		Map<String, String> map2 = new HashMap<>();
		map2.put("spi:itemnum", "BMS-BC01-0501");
		map2.put("spi:location", "LD");
		map2.put("rdf:about", "https://localhost/maximo.oslc.os.thsrc_wpss_inv/_Qk1TLUJDMDEtMDUwMQ");
		listData.add(map2);

		Map<String, String> map3 = new HashMap<>();
		map3.put("spi:itemnum", "BMS-BC01-0502");
		map3.put("spi:location", "LD");
		map3.put("rdf:about", "https://localhost/maximo.oslc.os.thsrc_wpss_inv/_Qk1TLUJDMDEtMDUwMg");
		listData.add(map3);

		Map<String, String> map4 = new HashMap<>();
		map4.put("spi:itemnum", "BMS-BC07-0000");
		map4.put("spi:location", "ZD");
		map4.put("rdf:about", "https://localhost/maximo.oslc.os.thsrc_wpss_inv/_Qk1TLUJDMDctMDAwMA");
		listData.add(map4);

		JSONPObject a = new JSONPObject("rdfs:member", listData);
        
		return a;*/
		// Get the HttpServletRequest
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest();

        // Get the request URL and other relevant information
        String requestUrl = request.getRequestURL().toString();
        String queryString = request.getQueryString();
        String fullUrl = (queryString == null) ? requestUrl : requestUrl + "?" + queryString;

        // Log the URL
        logger.info("Frontend request URL: " + fullUrl);
		logger.info(listData.toString());
        ModelAndView modelAndView = new ModelAndView("result7");
        
        modelAndView.addObject("jsonData", listData);
        return modelAndView;
	}
	
	
}
