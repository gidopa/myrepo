/*
	변수의 종류
	1. 클래스 변수(static)
	클래스가 올라가는 JVM메모리의 Method 영역에 메모리를 할당 받는 변수
	클래스 하나당 변수메모리가 영역을 차지 하는 변수
	객체 생성없이 class명.으로 접근 가능 ex)Math.pow
	여러 객체가 공용으로 사용할 값을 저장할 변수
	2. 인스턴스(객체) 변수
	static이 없는 변수
	객체를 생성할 때마다 객체 내부에 만들어지는 변수
	객체가 생성될때마다 JVM Heap 영역에 객체 메모리가 올라가며 이 메모리안에 만들어 짐
	3. 지역 변수
	메소드내에서 만든 변수
	// 객체 들이 공유받아서 사용할 목적으로 만들어 줌
*/
public class Ex1 {

	public static void main(String[] args) {
		System.out.println(Test.y);
		Test t = new Test(3);
		System.out.println(t.x);
		System.out.println(Test.y);
		System.out.println(Test.y);
		Test t1 = new Test(10);
		System.out.println(Test.y);
		System.out.println(Test.getY());
		System.out.println(t1.x);
		System.out.println(t.x);
		
	}

}

class Test{
	// 인스턴스 변수
	int x;
	static int y;
	
	// 생성자
	// 매개변수로 정수 하나를 전달 받아 x,y에 각각 누적할 생성자
	public Test(){}
	public Test(int x) {
		this.x+=x;
		y+=x;
	}
	public static int getY() {
		return y;
	}
	public static void setY(int y) {
		Test.y = y;
	}
	
	
	
}
