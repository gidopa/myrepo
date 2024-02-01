/*
	start()는 JVM에게 보조스레드가 준비되었으니 run()호출해달라고 요청하는 메소드
	
	스레드는 실행시마다 CPU가 랜덤으로 스케쥴링하는데 우선순위를 부여하면 특정 보조스레드가 먼저 수행되게 할 수 있음
	주스레드로만 작업을 하면 순차적인 일처리를 하는데 주스레드에서 탄생한 보조자식스레드 객체들에게 일처리를 시키면 병행처리를 통해 빠르게 수행 가능
*/
public class ThreadEx01 extends Thread{

	public static void main(String[] args) {
		ThreadEx01 t1 = new ThreadEx01("t1"); // 보조스레드
		ThreadEx01 t2 = new ThreadEx01("t2"); // 보조스레드
		
		t1.start();
		t2.start();

	}
	public ThreadEx01(String name) {
		super(name); // Thread부모의 생성자를 호출해 전달한 매개변수의 값을 스레드 이름으로 저장
	}
	//콜백메소드 : 개발자가 호출하는게 아닌 컴파일러가 특정시점에 자동으로 호출해주는 메소드
	@Override
	public void run() {
		int sum=0;
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(1000); // 보조 작업스레드가 1초 동작안함
			} catch (InterruptedException e) { // 쉬는동안 다른 스레드가 인터럽트를 발생시키면 
				e.printStackTrace();
			}
			sum += i;
			// CPU가 점유한 보조스레드객체의 이름을 얻기위해 상속받은 getName()으로 리턴받음
			System.out.println(this.getName() + " : " + sum);
			
		}
	}
	
}
