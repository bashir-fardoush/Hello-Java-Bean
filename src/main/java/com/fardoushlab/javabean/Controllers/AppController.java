package com.fardoushlab.javabean.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

	@GetMapping("/index")
	public String helloBean() {
		
		return "index";
	}
	
	
//	@GetMapping("/index")
//	public String hello() {
//		
//		return "index";		
//	}
	
}
