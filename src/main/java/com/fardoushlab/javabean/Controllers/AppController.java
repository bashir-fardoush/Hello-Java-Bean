package com.fardoushlab.javabean.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fardoushlab.javabean.model.User;

@Controller
public class AppController {
	
	@Autowired
	private User user;

	@GetMapping("/index")
	public String helloBean(Model model) {
		model.addAttribute("user",user);		
		return "index";
	}
	
	
	@GetMapping("/index2")
	public String hello(@RequestParam("username") String username, Model model) {
		user.setName(username);
		model.addAttribute("user",user);
		return "index";		
	}
	
}
