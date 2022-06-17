package com.soap.calculator.api.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/*
 * Bean created to perform divide operation
 */
@Service
public class DivideNumbers {
	
	public long calculate(Long a, Long b) {
		return a/b;
	}

}
