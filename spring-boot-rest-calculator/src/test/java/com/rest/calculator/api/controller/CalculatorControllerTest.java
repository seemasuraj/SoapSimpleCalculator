package com.rest.calculator.api.controller;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.util.ReflectionTestUtils;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.rest.calculator.api.services.RestCalculatorService;
import com.soap.calculator.api.calculations.CalculationRequest;
import com.soap.calculator.api.calculations.CalculationResponse;

@RunWith(SpringRunner.class)
@WebMvcTest(value= CalculatorController.class)
public class CalculatorControllerTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private RestCalculatorService service;
	@MockBean
	CalculationRequest request;
	@MockBean
	CalculationResponse mockResponse;
	
	String exampleJson="{\"operation\":\"test\",\"input1\":35,\"input2\":5}";
	
	@Test
	public void getCalculationResultTest() throws Exception {
		Mockito.when(service.getAddition(request)).thenReturn((mockResponse));
		
		RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/getCalculatedResult").accept(MediaType.APPLICATION_JSON).content(exampleJson).contentType(MediaType.APPLICATION_JSON);

		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
		System.out.println(result.getResponse().getStatus());
		assertEquals(200, result.getResponse().getStatus());
	}

}