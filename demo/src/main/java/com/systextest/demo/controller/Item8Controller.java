package com.systextest.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.systextest.demo.model.Data_8;

@RestController
@RequestMapping("/maximo/oslc/os")
public class Item8Controller {
	private static final Logger logger = Logger.getLogger(Item8Controller.class);
	@GetMapping("/THSRC_ITEM_ISSUEUNIT")
	public ModelAndView getStoreroom() throws JsonProcessingException {
		List<Data_8> listData = new ArrayList<>();
		Data_8 storeRoom1=new Data_8();
		storeRoom1.setMeasureunitid("SQ M");
		storeRoom1.setDescription("Square Meters//平方公尺");
		storeRoom1.setAbout("https://localhost/maximo/oslc/os/thsrc_item_issueunit/_U1EgTQ--");
		listData.add(storeRoom1);
		Data_8 storeRoom2=new Data_8();
		storeRoom2.setMeasureunitid("PACK");
		storeRoom2.setDescription("PACK//包");
		storeRoom2.setAbout("https://localhost/maximo/oslc/os/thsrc_item_issueunit/_UEFDSw--");
		listData.add(storeRoom2);
		Data_8 storeRoom3=new Data_8();
		storeRoom3.setMeasureunitid("支");
		storeRoom3.setDescription("支");
		storeRoom3.setAbout("https://localhost/maximo/oslc/os/thsrc_item_issueunit/_5p5v");
		listData.add(storeRoom3);
		Data_8 storeRoom4=new Data_8();
		storeRoom4.setMeasureunitid("人時");
		storeRoom4.setDescription("人時");
		storeRoom4.setAbout("https://localhost/maximo/oslc/os/thsrc_item_issueunit/_5Lq65pmC");
		listData.add(storeRoom4);
		ModelAndView modelAndView = new ModelAndView("result8");

		logger.info(listData.toString());
        modelAndView.addObject("jsonData", listData);
        return modelAndView;
	}
	
}
