package com.aspect;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

// target인  UserService의 sayEcho() 메서드 호출 시 위빙되는 aspect 객체
@Aspect
public class AfterThrowingAspect {
	
	@Pointcut("execution(public String sayEcho())")
	public void xxx() {}
	
	// sayEcho() 호출해서 예외가 발생했을 때만 위빙됨.
	// throwing 속성에  sayEcho()메서드에서 예외가 발생했을때 예외를 저장할 변수 지정. catch(XXException e)
	@AfterThrowing(pointcut="xxx()", throwing="e")
	public void method2(Exception e) { // xxx에는 sayEcho()메서드가 리턴하는 값이 저장.
		System.out.println("AfterThrowing.method2"+"\t"+e.getMessage());
	}
	
	
	
//	// advice + pointcut 같이 표현
//	@AfterThrowing(pointcut="execution( * callEcho(..))",returning="yyy") // callEcho() 호출 후에 실행됨
//	public void method3(JoinPoint point, Object yyy) {
//		System.out.println("호출한 핵심기능 메서드명: "+ point.getSignature().getName());
//		System.out.println("AfterAspect.method3"+yyy);
//	}

}
