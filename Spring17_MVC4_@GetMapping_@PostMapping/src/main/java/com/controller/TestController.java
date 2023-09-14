package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TestController {

	@GetMapping("/loginForm")
    public String loginForm(){
    	System.out.println("@GetMapping.loginForm");
    	return "/WEB-INF/views/loginForm.jsp";
    }

	@PostMapping("/login")
    public String login(){
    	System.out.println("@PostMapping.login");
    	return "/WEB-INF/views/main.jsp";
    }
	
}
