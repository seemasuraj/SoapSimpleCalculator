package com.soap.calculator.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soap.calculator.api.calculations.CalculationRequest;
import com.soap.calculator.api.calculations.CalculationResponse;

/*
 * service class created to call the operation on the basis of operation passed in the request
 */
@Service
public class CalculatorService {
	
	@Autowired
	private AddNumbers add;
	@Autowired
	private SubtractNumbers subtract;
	@Autowired
	private MultiplyNumbers multiply;
	@Autowired
	private DivideNumbers divide;
	
	/*
	 * Calculate request will call the corresponding operation on the basis of request and return the result
	 */
	public CalculationResponse calculateResult(CalculationRequest request) {
		Long result=null;
		String msg="Successful";
		try {
		if(request.getOperation().equalsIgnoreCase("add")) {
			result=add.calculate(request.getInput1(), request.getInput2());
			
		}else if(request.getOperation().equalsIgnoreCase("subtract")) {
			result=subtract.calculate(request.getInput1(), request.getInput2());

		}else if(request.getOperation().equalsIgnoreCase("Multiply")) {
			result=multiply.calculate(request.getInput1(), request.getInput2());

		}else if(request.getOperation().equalsIgnoreCase("divide")) {
			result=divide.calculate(request.getInput1(), request.getInput2());
		}else {
			result=0L;
			msg="Not a Valid Input for operation";
		}
		}catch(ArithmeticException ex) {
			result=0L;
			msg="encounter ArithmeticException: " +ex.getLocalizedMessage()+". Please provide valid inputs for " +request.getOperation()+ " operation.";
		}

		CalculationResponse response = new CalculationResponse();
		response.setResult(result);
		response.setOperationMessage(msg);
		return response;
	}
	
}
