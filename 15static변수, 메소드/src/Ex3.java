/* 
 멤버 변수의 초기화 방법
	1. 명시적 초기화 - 대입 연산자 = 으로 초기화
	2. 생성자 이용
	3. 초기화 블럭 이용
	   초기화 블럭의 종류 2가지
	   1) 클래스 초기화 블럭 : 클래스변수 초기화
	   	static { 클래스변수 초기화 }
	   2) 인스턴스 초기화 블럭 : 인스턴스 변수 초기화
	   { 인스턴스 변수 초기화 }
*/
public class Ex3 {

	public static void main(String[] args) {
		System.out.println("main메소드, 객체생성");
		Ex3 a = new Ex3();
		
		System.out.println("main메소드, 객체생성");
		Ex3 b = new Ex3();
	}

	//1. 명시적 초기화
	int door = 4;
	//2. 생성자
	Ex3(){
		this.door = 10;
		System.out.println("생성자로 초기화");
	}
	// 3. 초기화 블럭
	static {
		//door=100;
		System.out.println("클래스 초기화 블럭");
	}
	{
		System.out.println("인스턴스 초기화 블럭");
	}
	
}
/*
 Ex3 클래스 실행될때 JVM 메모리 로딩 시 호출 순서
 1. static 클래스 초기화 블럭
 2. 메인 메소드
 3. 객체 생성할때 인스턴스 초기화블럭
 4. 생성자 
 클래스 초기화 블럭은 맨 처음 한번만 수행
 */
