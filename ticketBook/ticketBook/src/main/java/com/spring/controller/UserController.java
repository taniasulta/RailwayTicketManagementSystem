package com.spring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.spring.service.UserService;



@RestController
@RequestMapping("user")
public class UserController {

	
	@Autowired
	UserService userService;
	
	@RequestMapping("/registerpage")
	public ModelAndView registerpage() {
		return new ModelAndView("user/register");
	}
	
	
	@RequestMapping("/register")
	public ModelAndView register(HttpServletRequest request) {
		userService.register(request);
		return new ModelAndView("index");
	}
	

}
