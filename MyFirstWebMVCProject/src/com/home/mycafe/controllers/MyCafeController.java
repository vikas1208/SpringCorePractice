package com.home.mycafe.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyCafeController {

	@RequestMapping("/cafe")
	public String myCafe(Model model) {
		String name="Vikas";
		model.addAttribute("myName", name);
		return "welcome-page";
	}
	
	@RequestMapping("/processOrder")
	public String processFood(HttpServletRequest request, Model model) {
		
		String orderedFood =request.getParameter("foodType");
		model.addAttribute("myOrderedFood", orderedFood);
		return "order-success";
	}
}
