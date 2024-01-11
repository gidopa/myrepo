// 상속관계에서 서브클래스 객체 생성시 생성자 호출 및 실행 시점
/*
  new 연산자에 의해 서브클래스의 객체가 생성될때
  - 슈퍼클래스 생성자와 서브클래스 생성자가 모두 호출,실행
  호출 C - B - A 실행 A - B - C  
*/
public class Ex1 {

	public static void main(String[] args) {
		 C c = new C();
	}

}
class A{
	public A() {
		System.out.println("생성자A");
	}
}
class B extends A{
	public B() {
		System.out.println("생성자B");
	}
	
}
class C extends B{
	public C() {
		System.out.println("생성자C");
	}
}
