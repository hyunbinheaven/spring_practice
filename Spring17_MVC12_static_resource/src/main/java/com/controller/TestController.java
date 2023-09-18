package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

	// http://localhost:8090/app/
	@GetMapping("/")
	public String home() {
		
		return "main"; // /WEB-INF/views/loginForm.jsp 로 포워드 요청된다.
	}

}
