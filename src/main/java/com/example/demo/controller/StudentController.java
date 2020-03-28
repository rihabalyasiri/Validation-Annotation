package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Student;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@RequestMapping("/showForm")
	public String showForm(Model model) {
//		to pass data from controller to the view
		model.addAttribute("student",  new Student());
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute Student student) {
		
		return "student-confirm";
	}

}
