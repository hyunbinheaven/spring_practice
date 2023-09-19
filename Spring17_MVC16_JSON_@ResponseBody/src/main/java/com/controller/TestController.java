package com.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dto.LoginDTO;

@Controller
public class TestController {
	
	@RequestMapping(value= {"/main"})
	public String main() {
		
		return "main";
	}
	
	@RequestMapping(value= {"/xxx"})
	public LoginDTO xxx() {
		
		LoginDTO dto = new LoginDTO();
		dto.setUserid("홍길동");
		dto.setPasswd("1234");
		
		return dto;
	}
	
	@RequestMapping(value= {"/yyy"})
	@ResponseBody
	public LoginDTO yyy() {
		
		LoginDTO dto = new LoginDTO();
		dto.setUserid("홍길동");
		dto.setPasswd("1234");
		
		return dto;
	}
	
	@RequestMapping(value= {"/zzz"})
	@ResponseBody
	public ArrayList<LoginDTO> zzz() {
		
		ArrayList<LoginDTO> list = new ArrayList<LoginDTO>();
		
		list.add(new LoginDTO("Aaa1", "1234"));
		list.add(new LoginDTO("Aaa2", "1234"));
		list.add(new LoginDTO("Aaa3", "1234"));
		
		return list;
	}
}
