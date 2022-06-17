package com.soap.calculator.api.endpoint;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.util.ReflectionTestUtils;

import com.soap.calculator.api.calculations.CalculationRequest;
import com.soap.calculator.api.calculations.CalculationResponse;
import com.soap.calculator.api.service.AddNumbers;
import com.soap.calculator.api.service.CalculatorService;
import com.soap.calculator.api.service.DivideNumbers;
import com.soap.calculator.api.service.MultiplyNumbers;
import com.soap.calculator.api.service.SubtractNumbers;

@ExtendWith(MockitoExtension.class)
public class CalculatorIndicatorEndpointTest {
	
	private CalculatorIndicatorEndpoint endPoint;
	
	private CalculatorService service;

	private AddNumbers add;

	private SubtractNumbers subtract;

	private MultiplyNumbers multiply;

	private DivideNumbers divide;
	
	private CalculationRequest request;
		
	@BeforeEach
    public void setUp() {
		endPoint = new CalculatorIndicatorEndpoint();
		service = new CalculatorService();
		add = new AddNumbers();
		subtract = new SubtractNumbers();
		multiply = new MultiplyNumbers();
		divide = new DivideNumbers();
		ReflectionTestUtils.setField(service, "add", add);
		ReflectionTestUtils.setField(service, "subtract", subtract);
		ReflectionTestUtils.setField(service, "multiply", multiply);
		ReflectionTestUtils.setField(service, "divide", divide);
		ReflectionTestUtils.setField(endPoint, "service", service);
		request = new CalculationRequest();
    	request.setInput1(30L);
		request.setInput2(5L);
    	request.setOperation("add");
	}
	
	@Test
    public void getAdditionResultTest() {
		CalculationResponse response = endPoint.getAdditionResult(request);
		assertEquals(35L, response.getResult());
    	assertEquals("Successful", response.getOperationMessage());
	}

}
