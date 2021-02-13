package com.rutu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;

@Controller 
public class ApplicationController {
	/*
	 * @ResponseBody//since we want to directly show the text on screen without any
	 * jsp file
	 * 
	 * @RequestMapping("/") public String hello() { return "Hello from Spring Boot";
	 * }
	 */
	@RequestMapping("/welcome")
	public String Welcome() {
		return "welcomepage";
	}

}
