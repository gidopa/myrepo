
public class C {

	public static void main(String[] args) {
		A a = new A();	/* a 객체 메모리 생성 
							----------------------------------
							주소 0x1
							a_met(B b){
							System.out.println("a_met execute");
							b.b_met();
							}
							---------------------------------
		 					*/
		B b = new B();  /* b 객체 메모리 생성
						---------------------------------
						주소 0x2
						b_met(){
						System.out.println("b_met execute");
						}
						-----------------------------------------
		*/
		a.a_met(b);		/* a_met(b){  -> a_met(0x2)
						a_met 실행
						System.out.println("a_met execute"); -> 실행 그 다음
						b.b_met(); -> 실행
						b -> 0x2 참조 후 b_met 실행 
						System.out.println("b_met execute"); 실행
						출력결과 
						a_met execute
						b_met execute
						}*/
	}

}

class A {
	
	
	void a_met(B b){
		System.out.println("a_met execute");
		b.b_met();
		}
}

class B {

	void b_met(){
		System.out.println("b_met execute");
	}
}

