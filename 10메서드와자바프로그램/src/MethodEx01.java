

public class MethodEx01 {
/*
 - 메소드 이름 옆에 void면 return 값이 없다는 의미
 
*/
	public static void main(String[] args) {
		// main의 기능 : 프로그램의 시작
		Hello_func();
		System.out.println(Three());
		System.out.println(Plus(4,7));
		int a = Plus(5,3);
		System.out.println(a);
		Hello();
		System.out.println(Hello());

}
	public static void Hello_func() {  // 모든곳에서 접근 가능하고 리턴이 없는 Hello_func라는 이름의 class 메서드
		
		System.out.println("Hello World");
		
	}
	public static int Three() {		// 모든곳에서 접근 가능하고 리턴 타입이 int인 Three라는 이름의 class 메서드
		return 3;			//return은 반드시 하나의 값만 반환
	}
	public static int Plus(int x, int y) {	// 파라미터를 int x, int y로 받음
		return x+y;			// return값으로 인트형의 x+y값을 반환함
	}
	public static String Hello() {
		System.out.println("Hello World");
		return "return값";
	}

}
