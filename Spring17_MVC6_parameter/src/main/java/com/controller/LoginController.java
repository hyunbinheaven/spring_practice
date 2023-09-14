package com.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dto.LoginDTO;

@Controller
public class LoginController {

	@GetMapping("/loginForm")
	public String home() {
		
		return "loginForm"; // /WEB-INF/views/loginForm.jsp 로 포워드 요청된다.
	}
	
	@GetMapping("/login")
	public String login(@RequestParam Map<String, String> m) {
		// 사용자 입력 데이터 얻기
		System.out.println(m);
		return "loginForm"; 
	}
	
	@GetMapping("/login5")
	public String login5(LoginDTO dto) {
		// 사용자 입력 데이터 얻기
		System.out.println(dto);
		return "loginForm"; 
	}
	
	
	/*
	   요청 파라미터명과 저장할 변수명이 일치하면 
	   요청 파라미터명을 생략할 수 있다.
	*/
	@GetMapping("/login4")
	public String login4(@RequestParam  String userid,
			            @RequestParam("passwd")  String pw) {
		// 사용자 입력 데이터 얻기
		System.out.println(userid+" " + pw);
		return "loginForm"; 
	}
	/*
	 *  @RequestParam 사용 주의점
	 *   - 반드시 요청 파라미터가 존재해야 함 (필수)
	 *   - 필수사항을 옵션으로 변경 가능 (required = false)
	 *   - required = false 지정해서 예외 대신 null 받음
	 *     null 대신 기본값으로 설정 가능
	 */
	@GetMapping("/login3")
	public String login3(@RequestParam(value="userid2", 
	                                  required = false,
	                                  defaultValue = "hello"
			                          )  String id,
			            @RequestParam("passwd")  String pw) {
		// 사용자 입력 데이터 얻기
		System.out.println(id+" " + pw);
		return "loginForm"; 
	}
	
	
	
	
	
	@GetMapping("/login2")
	public String login2(@RequestParam("userid")  String id,
			            @RequestParam("passwd")  String pw) {
		// 사용자 입력 데이터 얻기
		System.out.println(id+" " + pw);
		return "loginForm"; 
	}
	
	@GetMapping("/login1")
	public String login1(HttpServletRequest request) {
		// 사용자 입력 데이터 얻기
		String userid = request.getParameter("userid");
		String passwd = request.getParameter("passwd");
		
		
		System.out.println(userid+" " + passwd);
		return "loginForm"; 
	}
	@PostMapping("/login")
	public String login1_1(HttpServletRequest request) {
		// 사용자 입력 데이터 얻기
		String userid = request.getParameter("userid");
		String passwd = request.getParameter("passwd");
		System.out.println(userid+" " + passwd);
		return "loginForm"; 
	}
}
