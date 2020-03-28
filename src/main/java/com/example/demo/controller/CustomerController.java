package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.CustomerAO;

@Controller
public class CustomerController {
	
//	to trim String white space and let the user not pass the validation if wrote just white spaces
	@InitBinder
	public void initBinder(WebDataBinder webDataBinder) {
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		webDataBinder.registerCustomEditor(String.class,stringTrimmerEditor);
	}
	
	@GetMapping("/customerForm")
	public String applyCustomer(@ModelAttribute CustomerAO customerAO) {
		return "customer-form";
	}
	
	@PostMapping("/customerProcess")
	public String showCustomer(@Valid  CustomerAO customerAO, BindingResult bindingResult, Model model) {
//		bindingResult save all the errors from annotation validation
		if(bindingResult.hasErrors()) {
			return "customer-form";
		}
		
		return "customer-show";
	}

}
