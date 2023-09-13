import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.DeptDTO;
import com.service.DeptService;

public class DeptMain {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext("classpath:com/config/spring_config.xml");
		
		DeptService service = ctx.getBean("deptService",DeptService.class);
		
		// 저장
//		DeptDTO xxx = new DeptDTO(13, "개발","서울");
//		int n = service.deptAdd(xxx);
		
		// 수정
//		DeptDTO xxx2 = new DeptDTO(13, "개발부","서울시");
//		int n2 = service.deptUpdate(xxx2);
		
		// 삭제
		int n3 = service.deptDelete(12);
		
		// 목록
		List<DeptDTO> list = service.deptList();
		for(DeptDTO dto : list) {
			System.out.println(dto);
		}
		
	}

}
