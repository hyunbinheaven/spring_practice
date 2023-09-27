package com.exam.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	// 요청 URL: http://localhost:8090/app/board/num/10
	// 요청 URL: http://localhost:8090/app/board/10 ==> num 값을 10 이용해서 GET(select) 할 의도
	@GetMapping("/board/{num}")
	public String aaa(@PathVariable("num")String num) {
		System.out.println("@GetMapping - 조회용"+num);
		return "get";
	}
	
	// 요청 URL: http://localhost:8090/app/board2/10/hong
	// 요청 URL: http://localhost:8090/app/board2/10/kim
	@PostMapping("/board2/{num}/{username}")
	public String bbb(@PathVariable("num")String num,@PathVariable("username")String username) {
		System.out.println("@PostMapping - 저장용"+num+"\t"+username);
		return "post";
	}
	
	// 요청 URL: http://localhost:8090/app/board2/20/kim ==> num값 20 username값 kim 이용해서 PUT(update) 할 의도
	// 20을 찾아서 kim으로 바꿔라.
	@PutMapping("/board2/{num}/{username}")
	public String ccc(@PathVariable("num")String num,@PathVariable("username")String username) {
		System.out.println("@PutMapping - 수정용"+num+"\t"+username);
		return "put";
	}
	
	// 요청 URL: http://localhost:8090/app/board/10 ==> num 값을 10 이용해서 Delete 할 의도
	@DeleteMapping("/board/{num}")
	public String ddd(@PathVariable("num")String num) {
		System.out.println("@DeleteMapping - 삭제용"+num);
		return "delete";
	}
	
}
