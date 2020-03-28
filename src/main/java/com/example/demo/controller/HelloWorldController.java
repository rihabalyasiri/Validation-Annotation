package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.FormAO;
import com.example.demo.model.Student;

@Controller
@RequestMapping("/hello")  // to add base URL
public class HelloWorldController {
	
	@RequestMapping("/form")
	public String showForm(@ModelAttribute FormAO form) {
		
		return "show-form";
	}
	
	@RequestMapping("/result")
	public String processForm(@ModelAttribute Student student) {
		
		return "process-form";
	}
	
	@RequestMapping("/model")
	public String shoutDude(@RequestParam("name") String theName,Model model,@ModelAttribute FormAO formAO) {
		
//		String theNameString = request.getParameter("name");
		theName = theName.toUpperCase();
		model.addAttribute("message",theName);
		
	
		
		return "process-form";
	}

}
