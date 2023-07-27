package com.learn.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {
	
	@GetMapping("/home")
	public String homePage(ModelMap Model) {
		System.out.println("Vikas");
		return "index";
	}
}
