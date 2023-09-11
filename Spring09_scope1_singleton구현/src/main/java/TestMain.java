
// 자바의 싱글톤 패턴 구현( singleton design pattern)
// UserService 를 한 번만 생성하게끔 구현

class UserService{
	//3) getInstance 메서드 외부에서 사용해야 되기  때문에 static 변수로 지정 
	private static UserService service;
	//1) 생성자를 private로 지정
	private UserService() {	
	}
	//2) 자기자신의 메서드에서 생성
	public static UserService getInstance() {
		//맨 처음 getInstance() 호출하면 null이기 때문에 if문이 실행되어 객체생성이 되고 service 변수에 100번지가 저장된다.
		// 두 번째 getInstance() 호출부터는 null이 아니기 때문에 if문 실행안되어 객체생성없이 그냥 service 값인 100 번지를 반환한다.
		if(service==null) {
		  service = new UserService();
		}
		return service;
	}
}
public class TestMain {
	public static void main(String[] args) {
       // 대표적인 싱글톤 객체: Calendar.getInstanc()
		UserService s1 = UserService.getInstance(); // 100번지
		UserService s2 = UserService.getInstance(); // 100번지
		UserService s3 = UserService.getInstance(); // 100번지
		
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s2 == s3);
		
	}

}
