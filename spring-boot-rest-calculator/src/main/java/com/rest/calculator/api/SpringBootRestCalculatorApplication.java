package com.rest.calculator.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rest.calculator.api.services.RestCalculatorService;

@SpringBootApplication

public class SpringBootRestCalculatorApplication {
	@Autowired
	private RestCalculatorService service;
	

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestCalculatorApplication.class, args);
	}
	
}
