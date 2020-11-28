package com.tp2.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class UIcontroller {

	@RequestMapping("/")
	public ModelAndView index() {
		return new ModelAndView("home");		 
	}

	@RequestMapping("/user")
	public ModelAndView user() {
		return new ModelAndView("user");		
	}

	@RequestMapping("/chatroom")
	public ModelAndView chatroom() {
		return new ModelAndView("chatroom");
	}
}