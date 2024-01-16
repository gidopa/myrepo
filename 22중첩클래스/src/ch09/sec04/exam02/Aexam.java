package ch09.sec04.exam02;
//로컬 중첩 클래스?
// 바깥 클래스 내부에 만들긴 하지만 생성자나 메소드 내부에 만들어지는 클래스

public class Aexam {

	public static void main(String[] args) {
		
	}

}
class A{
	public A() {
		class B{
			B b = new B();
		}
	}
	void method() {
		class B{
			B b = new B();
		}
	}
	
}
