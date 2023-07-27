package com.spring.lc.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.lc.api.UserInfoDTO;

@Controller
public class LCAppController {
	
	@RequestMapping("/") 
	public String homePage(Model model) {
		// To show the default value to user
		UserInfoDTO userInfo = new UserInfoDTO();
		model.addAttribute("userInfo", userInfo);
		return "home-page"; 
	}
	
	@RequestMapping("/process-homepage")
	public String processHomePage(@Valid @ModelAttribute("userInfo") UserInfoDTO userInfoDTO, BindingResult result) {
		System.out.println(userInfoDTO.getTermCondition());
			if(result.hasErrors()) {
				System.out.println("My form has some errors");
			List<ObjectError> allError	= result.getAllErrors();
			for(Object temp: allError) {
				System.out.println(temp);
			}
				return "home-page";
			}
		return  "result-page";
	}
}
