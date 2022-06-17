package com.soap.calculator.api.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import com.soap.calculator.api.calculations.CalculationRequest;
import com.soap.calculator.api.calculations.CalculationResponse;
import com.soap.calculator.api.service.CalculatorService;

@Endpoint
public class CalculatorIndicatorEndpoint {
	
	private static final String NAMESPACE = "http://www.soap.com/calculator/api/calculations";
	
	@Autowired
	private CalculatorService service;
	
	@PayloadRoot(namespace = NAMESPACE, localPart = "CalculationRequest")
	@ResponsePayload
	public CalculationResponse getAdditionResult(@RequestPayload CalculationRequest request) {
		return service.calculateResult(request);
		
	}

}
