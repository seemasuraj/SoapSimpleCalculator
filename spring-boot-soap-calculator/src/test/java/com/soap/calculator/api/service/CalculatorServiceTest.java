package com.soap.calculator.api.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.util.ReflectionTestUtils;

import com.soap.calculator.api.calculations.CalculationRequest;
import com.soap.calculator.api.calculations.CalculationResponse;

@ExtendWith(MockitoExtension.class)
public class CalculatorServiceTest {
	
	private CalculatorService service;
	
	private AddNumbers add;
	
	private SubtractNumbers subtract;

	private MultiplyNumbers multiply;

	private DivideNumbers divide;
	
	private CalculationRequest request;
		
	@BeforeEach
    public void setUp() {
		service = new CalculatorService();
		add = new AddNumbers();
		subtract = new SubtractNumbers();
		multiply = new MultiplyNumbers();
		divide = new DivideNumbers();
		ReflectionTestUtils.setField(service, "add", add);
		ReflectionTestUtils.setField(service, "subtract", subtract);
		ReflectionTestUtils.setField(service, "multiply", multiply);
		ReflectionTestUtils.setField(service, "divide", divide);
		request = new CalculationRequest();
    	request.setInput1(30L);
		request.setInput2(5L);
	}

    @Test
    public void testcalculateResultForAddition() {
    	
    	request.setOperation("add");
    	CalculationResponse response = service.calculateResult(request);
    	assertEquals(35L, response.getResult());
    	assertEquals("Successful", response.getOperationMessage());
    }
    
    @Test
    public void testcalculateResultForSubtract() {
    	request.setOperation("subtract");
    	CalculationResponse response = service.calculateResult(request);
    	assertEquals(25L, response.getResult());
    	assertEquals("Successful", response.getOperationMessage());
    }
    
    @Test
    public void testcalculateResultForMultiply() {
    	request.setOperation("multiply");
    	CalculationResponse response = service.calculateResult(request);
    	assertEquals(150L, response.getResult());
    	assertEquals("Successful", response.getOperationMessage());
    }
    
    @Test
    public void testcalculateResultForDivide() {
    	request.setOperation("divide");
    	CalculationResponse response = service.calculateResult(request);
    	assertEquals(6L, response.getResult());
    	assertEquals("Successful", response.getOperationMessage());
    }
    
    @Test
    public void testcalculateResultForWrongOperation() {
    	request.setOperation("test");
    	CalculationResponse response = service.calculateResult(request);
    	assertEquals(0L, response.getResult());
    	assertNotEquals("Successful", response.getOperationMessage());
    }
    
    @Test
    public void testcalculateResultForException() {
    	CalculationRequest requestDivide = new CalculationRequest();
    	requestDivide.setOperation("divide");
    	requestDivide.setInput1(30L);
    	requestDivide.setInput2(0L);
    	CalculationResponse response = service.calculateResult(requestDivide);
    	assertEquals(0L, response.getResult());
    	assertNotEquals("Successful", response.getOperationMessage());
    }

}
