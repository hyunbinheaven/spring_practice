package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WorldController {
	
	// 요청 URL: http://localhost:8090/app/yyy
	@RequestMapping("/yyy")
	public String aaa() {
		
		System.out.println("WorldController.aaa");
		//forward
		return "/WEB-INF/views/aaa.jsp";
		
	}
}
