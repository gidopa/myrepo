/*
	private 메소드
	- 인터페이스의 상수,추상메소드, 디폴트메소드, 정적메소드는 모두 public 접근제어자.
	이 멤버들을 선언할때는 public 생략가능 , 컴파일러가 알아서 붙힌다
	또한 인터페이스에 외부에서 접근할 수 없도록 private 메소드 선언도 가능
	
	구분
	private 메소드 		구현객체가  필요한 메소드
	private 정적 메소드	구현객체가 필요없는 메소드
	
	private 메소드는 디폴트 메소드안에서만 호출이 가능한 반면
	private 정적 메소드는 디폴트 메소드 뿐 아니라 정적메소드 안에서도 호출이 가능
	private 메소드의 용도는 디폴트와 정적메소드들의 중복코드를 줄이기 위함
*/
public class ServiceExam {

	public static void main(String[] args) {
		Service service = new ServiceImpl();
		service.deafultMethod1();
		System.out.println();
		service.defaultMethod2();
		System.out.println();
		Service.staticMethod1();
		
	}

}

interface Service{
	// 디폴트 메소드
	default void deafultMethod1() {
		System.out.println("defaultMethod1 종속코드");
		// private 메소드 호출
		deafultCommon();
	}
	default void defaultMethod2() {
		System.out.println("defaultMethod2 종속코드");
		// private 메소드 호출
		deafultCommon();
	}
	
	private void deafultCommon() {
		System.out.println("defaultMethod 중복코드 A");
		System.out.println("deafultMethod 중복코드 B");
	}
	
	//정적 메소드
	static void staticMethod1() {
		System.out.println("staticMethod1 종속코드");
		//private static 정적메소드 호출
		staticCommon();
	}
	
	static void staticMethod2() {
		System.out.println("staticMethod2 종속코드");
		//private static 정적메소드 호출
		staticCommon();
	}
	
	private static void staticCommon() {
		System.out.println("staticMethod 중복코드C");
		System.out.println("staticMethod 중복코드D");
	}
	
}

class ServiceImpl implements Service{
	
	
	
}
