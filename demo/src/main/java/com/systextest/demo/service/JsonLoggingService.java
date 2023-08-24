package com.systextest.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class JsonLoggingService {
	private final Logger logger = LoggerFactory.getLogger(JsonLoggingService.class);
    public void logJsonData(Object jsonData) {
    	System.out.println("Received JSON data: " + jsonData);
        if (logger.isInfoEnabled()) {
//            String json = convertToJson(jsonData); // 使用合适的方式将对象转换为JSON字符串
            logger.info("JSON Data: {}", jsonData);
        }
    }

    private String convertToJson(Object object) {
		return null;
        // 使用合适的库将对象转换为JSON字符串，例如Jackson、Gson等
        // 返回JSON字符串
    }
}
