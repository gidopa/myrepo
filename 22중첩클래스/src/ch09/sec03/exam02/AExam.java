package ch09.sec03.exam02;
// 정적 멤버 중첩클래스 B 내부에는 일반클래스와 같이
// 변수, 생성자, 메소드 선언을 할 수 있다
public class AExam {

	public static void main(String[] args) {
		A.B b =new A.B();
		System.out.println(A.B.field1);
		System.out.println(b.field2);
		b.method1();
		A.B.method2();
		
	}

}
class A{
	static class B{
		static int field1=1;
		int field2 = 2;
		
		public B() {
			System.out.println("생성자");
		}
		void method1() {
			System.out.println("메소드1");
		}
		static void method2() {
			System.out.println("메소드2");
		}
	}
}
