package com.systextest.demo.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.systextest.demo.model.*;


@Configuration
public class AppConfig {
    @Bean
    public Data_1 data1(){
        return new Data_1();
    }
    @Bean
    public Data_3 data_3() {
        return new Data_3();
    }

    @Bean
    public Data_4 data_4() {
        return new Data_4();
    }
}
