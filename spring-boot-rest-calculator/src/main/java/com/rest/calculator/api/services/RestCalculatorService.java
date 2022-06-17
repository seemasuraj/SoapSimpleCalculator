package com.rest.calculator.api.services;

import com.soap.calculator.api.calculations.CalculationRequest;
import com.soap.calculator.api.calculations.CalculationResponse;

public interface RestCalculatorService {
	
	public CalculationResponse getAddition(CalculationRequest request);

}
