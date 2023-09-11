import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class UserMain {

	public static void main(String[] args) {
		
		// 1. 이전 방식
//		UserService service = new UserService();
//		System.out.println(service.mesg());
		
		// 2. 스프링 방식
		/*
	 	 1) 빈 생성 (*.java)
		 2) 빈을 xml에 등록 ==> src/main/resources
		 3) ApplicationContext(빈) 에 xml을 알려줌.
		 4) ApplicationContext 가 xml에 등록된 빈 정보를 보고 자동생성 ~ 소멸 처리.
		 
		*/
		
		ApplicationContext ctx = new GenericXmlApplicationContext("classpath:com/config/user.xml",
																  "file:c\\5_spring_study\\user2.xml");
		
	}
	
}
