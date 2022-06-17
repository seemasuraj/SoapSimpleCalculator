package com.soap.calculator.api.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/*
 * Bean created to perform Multiply operation
 */

@Service
public class MultiplyNumbers {

	public long calculate(Long a, Long b) {
		return a*b;
	}
}
