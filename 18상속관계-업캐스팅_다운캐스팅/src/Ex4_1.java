
public class Ex4_1 {

	public static void main(String[] args) {
		Parent2 p2 = new Child2();
		p2.paretPrn();
		Child2 c2 = (Child2)p2;
		c2.paretPrn();
		c2.childPrn();
		// 다운 캐스팅의 잘못된 예
		// 슈퍼객체메모리를 서브클래스자료형의 참조변수로 접근하려고 시도한 잘못된 예
		Parent2 p3 = new Parent2();  // 업캐스팅이 아님 -> 예외 발생
		Child2 c3 = (Child2)p3;
		c3.paretPrn();
		c3.childPrn();
		
		Child2 c4;
		String str = new String("안녕");
		// c4 = (Child2)str;   상속관계가 아니라서 캐스팅 x
		Object obj = new Parent2();
		Parent2 p5 = (Parent2)obj;
		p5.paretPrn();
	}

}
class Parent2{
	public void paretPrn() {
		System.out.println("슈퍼클래스의 parentPrn()");
	}
}
class Child2 extends Parent2{
	public void childPrn() {
		System.out.println("서브클래스의 childPrn()");
	}
}
