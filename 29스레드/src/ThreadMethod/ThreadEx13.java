package ThreadMethod;

import java.util.Date;

/*
	Thread의 join()
	- 특정스레드가 종료되는것을 막아서 지연시켜주는 역할
	- 하나의 스레드가 다른 스레드의 작업이 완료 될때까지 기다릴 수 있도록 도와주는 기능의 메소드
	  즉, 한스레드가 join메소드를 호출한 다른 스레드의 작업이 완료될때까지 대기
	join()의 동작 순서
	 1. 메소드 호출 시 , 현재 실행중인 스레드는 지정된 스레드가 종료될 때까지 대기
	 2. 지정된 스레드가 종료되면 join 메소드를 호출한 스레드는 종료된 스레드의 후속작업을 실행
	 3. 만약 지정된 시간내에 스레드가 종료되지 않으면 join 메소드는 타임아웃이 발생하여 대기를 종료하고 호출 스레드는 정상적으로 실행
*/
public class ThreadEx13 implements Runnable {

	@Override
	public void run() {
		for(int i = 1; i<10;i++) {
			System.out.println(Thread.currentThread().getName() + ", " + i + ", " + new Date());
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new ThreadEx13()); //Thread-0
		Thread t2 = new Thread(new ThreadEx13()); //Thread-1
		t1.start();
		t2.start();
		//t1이 종료될때까지 기다렸다 main스레드 종료되게 하기 위해 호출
		t1.join();
		t2.join();
		// 특정 메인스레드가 종료되는 것을 표현하기 위해 출력
		System.out.println("메인이 종료됨");
	}

}
