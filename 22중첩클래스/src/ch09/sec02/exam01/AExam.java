package ch09.sec02.exam01;

public class AExam {

	public static void main(String[] args) {
		A a = new A();
		A.B b = a.new B();
	}

}
// 인스턴스 멤버클래스 B는 A클래스 내부에서 사용 -> private 접근 제한을 갖는 것이 일반적
// B객체는 A클래스 내부 어디에서나 생성할 수는 없고, 인스턴수변수 field, 생성자, 메소드안에서 생성가능
class A{ // 외부 클래스
	class B{}// 중첩 클래스 / 인스턴스 멤버 클래스
	// 인스턴스 변수(필드)값으로 B객체를 생성해서 주소 대입
	B field = new B();

	public A() {
		B b = new B();
	}
	
	void method() {
		B b = new B();
	}
}
