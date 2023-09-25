package com.exam.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.exam.dto.LoginDTO;

@Controller
public class TestController {
	
	@GetMapping("/main")
	public String main() {
		return "main";
		
	}
	
	@PostMapping("/yyy")
	@ResponseBody
	public String yyy(@RequestBody LoginDTO dto) {
		System.out.println(dto);
		return "OK";
	}
	
	@PostMapping("/zzz")
	@ResponseBody
	public String zzz(@RequestBody ArrayList<LoginDTO> dto) {
		System.out.println(dto);
		return "OK";
	}
}
