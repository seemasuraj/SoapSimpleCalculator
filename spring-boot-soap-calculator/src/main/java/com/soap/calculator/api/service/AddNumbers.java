package com.soap.calculator.api.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/*
 * Bean created to perform addition operation
 */
@Service
public class AddNumbers {
	
	public long calculate(Long a, Long b) {
		return a+b;
	}

}
