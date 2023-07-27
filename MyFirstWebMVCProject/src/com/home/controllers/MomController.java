package com.home.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MomController {
	
	@ResponseBody
	@RequestMapping("/sugar")
	public String giveSugar() {
		System.out.println("Giving Sugar....");
		return "Ok...Here is your sugar";
	} 
	
	@ResponseBody
	@RequestMapping(method = RequestMethod.GET,value="/food")
	public String giveFood() {
		System.out.println("Giving Food....");
		return "Ok...Here is your food";
	}

}
  