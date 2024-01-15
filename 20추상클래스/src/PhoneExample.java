/*
	추상?
	사전적의미로 추상은 실체 간의 공통되는 특성을 추출한 것
	
	추상클래스란?
	객체 생성 x, 공통적 변수나 메소드를 추출해서 선언한 미완성 클래스를 추상클래스라고함.
	추상메소드 - 구현부가 없는 메소드, 추상메소드를 하나라도 포함하면 추상클래스라고함.
	상속시켜주기 위해 선언. 실체 클래스는 추상클래스를 상속받아 변수나 메소드 사용.(오버라이딩)
	
	Bird, Tiger, Eagle 등의 실체 클래스에서 공통의 변수나 메소드를 따로 선언한 Animal을 만들고 이것을 상속받아 실체클래스를 만들 수 있음
	public abstract class 클래스명{}
*/


public class PhoneExample {

	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone("철수");
		sp.turnOn();
		sp.internetSearch();
	}

}
// 추상클래스는 변수,메소드 선언가능 
// 서브객체가 생성될때 super()로 추상클래스의 생성자호출 
// 생성자도 반드시 있어야함.
abstract class Phone{
	String owner;
	Phone(String owner) {
		this.owner = owner;
	}
	void turnOn() {
		System.out.println("폰을 킴");
	}
	void turnOff() {
		System.out.println("폰을 끔");
	}
}
class SmartPhone extends Phone{
	public SmartPhone(String owner) {
		super(owner);
	}
	void internetSearch() {
		System.out.println("인터넷 검색");
	}
}


