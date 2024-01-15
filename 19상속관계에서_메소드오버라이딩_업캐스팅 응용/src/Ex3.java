/*
  메소드 오버라이딩
  - 상속관계에서 부모 클래스 메소드를 재정의
 */
// parentPrn을 오버라이딩 해놓으면
// Child로 생성된 객체는 슈퍼 객체의 메소드가 은닉되어 상속받지 못하고 접근해서 사용 x
public class Ex3 {

	public static void main(String[] args) {
		Child1 child1 = new Child1();
		child1.parentPrn();
		
	}

}

class Parent1{
	public void parentPrn() {
		System.out.println("부모클래스 : parentPrn 메소드");
	}
}

class Child1 extends Parent1{
	public void childPrn() {
		System.out.println("자식클래스 : childPrn 메소드");
	}
	public void parentPrn() {
		super.parentPrn();
		System.out.println("자식클래스 : parentPrn 메소드");
	}
}
