package ThreadMethod;
/*
	Thread 클래스의 isAlive()메소드
	- 해당 스레드가 현재 실행중인지 여부를 확인하는 메소드 
	- 실행중이면 true 종료된 상태면 false
	
	isAlive() 동작
		1. 실행중인 스레드 : 스레드가 start()메소드를 호출하여 시작한 후 run()메소드가 종료되기 전까지 스레드는 실행중인 상태
		2. 종료된 스레드 : 스레드의 run()의 기능이 종료된 상태 이때 isAlive호출 시 false반환
		주의할점은 isAlive() 호출한 순간과 실제 스레드의 실행상태가 일치하지 않을 수 있다는 단점이 있다
		스레드의 실행상태는 실제 스레드 스케줄러에 의해 결정되며 호출시점에 따라 isAlive메소드의 반환값이 달라질 수 있음
*/
public class ThreadEx12 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("main start");
		ThreadDemo6 t1 = new ThreadDemo6("t1");
		ThreadDemo6 t2 = new ThreadDemo6("t2");
		ThreadDemo6 t3 = new ThreadDemo6("t3");
		do {
			System.out.println(".");
			Thread.sleep(100);
			//보조스레드 객체들의 종료시점을 메인 스레드로 유도해 .을 출력
		}while(t1.isAlive() || t2.isAlive() || t3.isAlive());
		System.out.println("main out");
	}

}
class ThreadDemo6 extends Thread{
	int count;
	
	public ThreadDemo6(String name) {
		super(name);
		this.start();
	}

	@Override
	public void run() {
		System.out.println(this.getName() + " 시작");
		//0.5초 간격으로 휴식하면서 현재 실행중인 스레드 이름과 1씩 증가된 count변수값 출력
		try {
			do {
				Thread.sleep(500);
				System.out.println(this.getName()+", count is " + this.count);
				count++;
			}while(count<10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(this.getName() + " 끝");
	}
	
	
	
}
