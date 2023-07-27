package com.spring.lc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.lc.api.UserRegistrationDTO;

@Controller
public class RegistrationController {
	
	@RequestMapping("/register")
	public String showRegistrationPage(@ModelAttribute("userReg") UserRegistrationDTO userDTO) {
		
		return "user-registration-page";
	}
	
	@RequestMapping("/registration-success")
	public String registrationSuccess(@ModelAttribute("dto") UserRegistrationDTO userDTO) {
		return "registration-success";
	}

}
