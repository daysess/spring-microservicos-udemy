package com.daysesoares.hrworker.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.daysesoares.hrworker.service.DBService;

@Configuration
public class TestConfig {
	
	@Autowired
	private DBService dbService;

	@Bean
	public Boolean inicializandoBDTest() {
		dbService.inicializandoBDTest();
		return true;
	}

}
