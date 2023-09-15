package com.controller;

import java.util.ArrayList;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dto.LoginDTO;

@Controller
public class TestController {
	
	@RequestMapping("/xxx")
	public String home(HttpServletRequest request) {
		
		// 모델 저장
		request.setAttribute("userid", "홍길동");
		return "hello";
	}
	
	@RequestMapping("/yyy")
	public String yyy(Model m) { // Model m = new Model()
		
		// 모델 저장
		m.addAttribute("userid", "홍길동");
		return "hello";
	}
	
	@RequestMapping("/zzz")
	public String zzz(Map<String, String> map) {
		
		// 모델 저장
		map.put("userid", "홍길동");
		return "hello";
	}
	
	@RequestMapping("/aaa")
	public String aaa(@ModelAttribute("login")LoginDTO dto) {		
		// 모델 저장
		dto.setUserid("hong");
		dto.setPasswd("1234");
		return "hello2";
	}
	
	@RequestMapping("/bbb")
	public String bbb(@ModelAttribute("list") ArrayList<LoginDTO> xxx) {		

		xxx.add(new LoginDTO("aa","123"));
		xxx.add(new LoginDTO("bb","123"));
		return "hello3";
	}
	
	@RequestMapping("/ccc")
	public ModelAndView ccc() {		
		ModelAndView mav = new ModelAndView();
		// 뷰 정보
		mav.setViewName("hello");
		// 모델 정보
		mav.addObject("userid","홍길동");
		return mav;
	}
	
	
}
