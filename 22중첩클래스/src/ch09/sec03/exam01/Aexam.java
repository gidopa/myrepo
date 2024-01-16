package ch09.sec03.exam01;
/*
	정적 멤버 중첩 클래스B는 A클래스 외부에서 A와 함께 사용되는 경우도 많음
	주로 deafult 또는 public으로 사용. B객체는 A클래스 내부 어디든 객체 생성 가능
*/
public class Aexam {

	public static void main(String[] args) {
		// A객체 생성 없이 외부 클래스명으로 B객체 생성가능
		A.B b = new A.B();
	}

}
// B객체 생성
class A{
	static class B{
		
	}
	B field1 = new B();
	static B field2 = new B();
	
	public A() {
		B b = new B();
	}
	//인스턴스 메소드
	void method1() {
		B b = new B();
	}
	// 정적메소드
	static void method2() {
		B b = new B();
	}
}
