package com.example.demo.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourceCodeConstraintValidator implements ConstraintValidator<CourceCode, String> {
	
	private String coursePrefix;

	@Override
	public void initialize(CourceCode constraintAnnotation) {
		// TODO Auto-generated method stub
		ConstraintValidator.super.initialize(constraintAnnotation);
		coursePrefix =  constraintAnnotation.value();
	}
	
	
	
	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		boolean result;
		
		if(value != null) {
			
			result = value.startsWith(coursePrefix);
		}else {
			result = true;
		}
		
		return result;
	}


	
	
	
	

}
