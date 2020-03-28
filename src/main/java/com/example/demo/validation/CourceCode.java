package com.example.demo.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

// custom annotation
@Constraint(validatedBy = CourceCodeConstraintValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CourceCode {
	public String value() default "LUV";
	
	public String message() default "Must start with LUV";
	
	public Class<?>[] groups() default {};
	
	public Class<? extends Payload> [] payload() default {};
}
