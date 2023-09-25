package com.exam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DeptController {
    // http://localhost:8090/app/main
	@GetMapping("/main")
	public String main() {
		System.out.println("DeptController>>>>>99999");
		return "hello";   // /WEB-INF/views/hello.jsp
	}
	
}
