package com.example.demo.model;


import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.example.demo.validation.CourceCode;

public class CustomerAO {
	
	@NotNull(message= "is required")
	@Size(min = 1, message= "is required")
	private String fName ;
	
	@NotNull(message= "is required")
	@Size(min = 1, message= "is required")
	private String lName ;
	
	@NotNull(message= "is required")
	@Min(value = 0, message="it shold be greater than 0")
	@Max(value = 20, message="it shold be less than 20")
	private Integer pass;
	
//	validate depend on the regular expression
	@Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "it should be five digits")
	private String postalCode;
	
//	custom annotation
	@CourceCode(value = "RIHAB", message = "Must start with RIHAB")
	private String courceCode;
	
	
	public String getCourceCode() {
		return courceCode;
	}
	public void setCourceCode(String courceCode) {
		this.courceCode = courceCode;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public Integer getPass() {
		return pass;
	}
	public void setPass(Integer pass) {
		this.pass = pass;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
	
	
	
	
	

}
