/*
  메소드 오버라이딩
  - 상속관계에서 부모 클래스 메소드를 재정의
 */
// parentPrn을 오버라이딩 해놓으면
// Child로 생성된 객체는 슈퍼 객체의 메소드가 은닉되어 상속받지 못하고 접근해서 사용 x
public class Ex1 {

	public static void main(String[] args) {
		Parent p = new Parent();
		p.parentPrn();
		Child c = new Child();
		c.childPrn();
		c.parentPrn();
		
	}

}

class Parent{
	public void parentPrn() {
		System.out.println("부모클래스 : parentPrn 메소드");
	}
}

class Child extends Parent{
	public void childPrn() {
		System.out.println("자식클래스 : childPrn 메소드");
	}
	public void parentPrn() {
		System.out.println("자식클래스 : parentPrn 메소드");
	}
}
