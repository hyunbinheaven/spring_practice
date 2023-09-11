import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.service.UserService;

public class TestMain {

	public static void main(String[] args) {
		ApplicationContext ctx = 
				new GenericXmlApplicationContext("classpath:com/config/user.xml");
		
		// singleton 은 하나의 인스턴스로 여러 사용자가 사용하기 때문에 공유된다.
		UserService service = 
				ctx.getBean("service", UserService.class);
		List<String> list = service.list();
		System.out.println(list);
	}

}
