package ch07.sec05.exam01;
/*
 	final 메소드
 	- 메소드 선언 시 final 키워드를 붙히면 이 메소드는 최종적인 메소드이므로 오버라이딩 불가능
*/

public class Car {
	public int speed;
	
	public void speedUp() {
		speed += 1;
	}
	public final void stop() {
		System.out.println("차를 멈춤");
		speed = 0;
	}
	
	public static void main(String[] args) {

	}

}


