package com.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

// target인  UserService의 sayEcho() 메서드 호출 시 위빙되는 aspect 객체
@Aspect
public class AroundAspect {
	
	@Pointcut("execution(public String sayEcho())")
	public void xxx() {}
	
	// sayEcho() 호출해서 호출 전, 후, 정상적으로 리턴, 예외발생 모두 위빙됨.
	// throwing 속성에  sayEcho()메서드에서 예외가 발생했을때 예외를 저장할 변수 지정. catch(XXException e)
	@Around(value="xxx()")
	public Object method2(ProceedingJoinPoint pjp)throws Throwable { // afterThrowing 역할
		System.out.println("@Around.method2");
		System.out.println("before advice 역할");
		Object xxx = pjp.proceed(); // sayEcho() 호출하고 리턴값은 xxx에 저장
		System.out.println("after advice 역할");
		System.out.println("afterReturning advice 역할"+xxx);		
		return xxx; // sayEcho() 호출한 곳으로 리턴. main에서 받음
	}
	
	
	
//	// advice + pointcut 같이 표현
//	@AfterThrowing(pointcut="execution( * callEcho(..))",returning="yyy") // callEcho() 호출 후에 실행됨
//	public void method3(JoinPoint point, Object yyy) {
//		System.out.println("호출한 핵심기능 메서드명: "+ point.getSignature().getName());
//		System.out.println("AfterAspect.method3"+yyy);
//	}

}
