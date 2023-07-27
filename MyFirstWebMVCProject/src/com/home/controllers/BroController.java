package com.home.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BroController {
	
	
	@RequestMapping("/cricket")
	public String getCricketBat() {
		return "MRFCricket";
	}
	
	@ResponseBody
	@RequestMapping("/football")
	public String getFootball() {
		return "Ok...Here is your football";
	}

}
