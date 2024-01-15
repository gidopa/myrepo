package ch08.sec09;
/*
	인터페이스간의 상속
	- 인터페이스도 다른 인터페이스를 상속 할 수 있으며, 클래스와 달리 다중상속 허용
	interface 자식인터페이스 extends 부모인터페이스1, 인터페이스2{
		부모인터페이스 1로부터 상속받은 멤버들 사용가능
		부모인터페이스 1로부터 상속받은 멤버들 사용가능
		
		자식 인터페이스의 구현 클래스는 자식인터페이스의 메소드뿐아니라
		부모인터페이스의 모든 추상메소드를 재정의 해야한다 
		구현 객체는 다음과 같이 자식 및 부모인터페이스 참조변수에 저장될 수 있다>
		자식인터페이스자료형 참조변수 = new 구현된자식객체();
		부모인터페이스자료형 참조변수 = new 구현된자식객체();
		부모인터페이스자료형 참조변수 = new 구현된자식객체();
	}
*/
public class ExtendsExample {

	public static void main(String[] args) {
		interfaceImpl impl = new interfaceImpl();
		InterfaceA ia = impl;
		ia.methodA();
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
		// InterfaceC 부모인터페이스는 다른 인터페이스의 추상메소드를 상속받아 새롭게 만든 인터페이스기 때문에
		// 생성된 객체가 InterfaceImpl일지라도 모두 ic로 접근해서 호출할 수 있다
	}

}

interface InterfaceA{	
	void methodA();
}
interface InterfaceB{	
	void methodB();
}
interface InterfaceC extends InterfaceA, InterfaceB{
	void methodC();
} 
// interfaceC를 구현받아 설계한 InterfaceCImpl
class interfaceImpl implements InterfaceC{

	@Override
	public void methodA() {
		System.out.println("InterfaceA");
	}

	@Override
	public void methodB() {
		System.out.println("InterfaceB");
	}

	@Override
	public void methodC() {
		System.out.println("InterfaceC");
	}
	
	
	
}
