package ch09.sec04.exam04;

// 로컬 중첩클래스 내부에 만들어지는 로컬 변수를 
// 로컬 중첩클래스에서 사용할 경우 로컬 변수는 final특성을 갖게 되므로
// 값을 읽을수만 있고 수정X. 중첩 클래스 내부에서 값을 변경하지 못하게 제한하기 떄문
// 로컬 변수에 final 키워드를 추가해서 상수임을 명확히 할 수 있음
public class A {
	
	public void method1(int arg) { // final int arg
		int var = 1; // final int var = 1;
		class B{
			void method2() {
				System.out.println("arg : "+arg);
				System.out.println("var ; "+var);
				// var = 3; 불가능
			}
			
		}
		B b = new B();
		b.method2();
	
	}	

}
