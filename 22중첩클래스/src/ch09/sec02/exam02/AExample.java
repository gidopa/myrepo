package ch09.sec02.exam02;
// 인스턴스 멤버클래스 B내부에는 일반클래스와 같이 변수,생성자 메소드 선언이 올 수 있음

public class AExample {

	public static void main(String[] args) {
		A a = new A();
		a.useB();
		
	}

}
class A{
	class  B{
		int field1 = 1;
		static int field2=2;
		
		public B() {
			System.out.println("B생성자");
		}
		void method1() {
			System.out.println("메소드1 실행");
			}
		static void method2() {
			System.out.println("정적 메소드2 실행");
		}
	}
	void useB() {
		B b = new B();
		System.out.println(b.field1);
		b.method1();
		B.method2();
		System.out.println(B.field2);
	}
	
}
