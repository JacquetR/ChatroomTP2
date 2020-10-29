package com.tp2.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class tp2UIcontroller {

	@RequestMapping("/")
	public ModelAndView index() {
		ModelAndView view = new ModelAndView("home");
		return view;
	}

	@RequestMapping("/user")
	public ModelAndView user() {
		ModelAndView view = new ModelAndView("user");
		return view;
	}

	@RequestMapping("/chatroom")
	public ModelAndView chatroom() {
		ModelAndView view = new ModelAndView("chatroom");
		return view;
	}
}