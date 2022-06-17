package com.rest.calculator.api.services;

import org.springframework.stereotype.Service;

import com.soap.calculator.api.calculations.CalculationIndicatorService;
import com.soap.calculator.api.calculations.CalculationRequest;
import com.soap.calculator.api.calculations.CalculationResponse;

/*
 * Service class which will call the Soap service to get the calculation result by passing the request
 */
@Service
public class RestCalculatorServiceImpl implements RestCalculatorService {
	
	@Override
	public CalculationResponse getAddition(CalculationRequest request) {
		CalculationIndicatorService service = new CalculationIndicatorService();
		return service.getCalculationIndicatorSoap11().calculation(request);

	}

}
