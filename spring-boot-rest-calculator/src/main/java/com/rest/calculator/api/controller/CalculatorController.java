package com.rest.calculator.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.calculator.api.services.RestCalculatorService;
import com.soap.calculator.api.calculations.CalculationRequest;
import com.soap.calculator.api.calculations.CalculationResponse;

/*
 * RestController will will call the service to get the calculation result
 */
@RestController
public class CalculatorController {
	
	@Autowired
	private RestCalculatorService service;
		
	@GetMapping("/getCalculatedResult")
	public CalculationResponse  getCalculationResult(@RequestBody CalculationRequest request) {
		return service.getAddition(request);
	}

}
