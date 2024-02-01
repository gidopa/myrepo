/*
	-Runnable 인터페이스 내부에 만들어져 있는 추상메소드 run을 오버라이딩한 클래스를 만들고
	만든 클래스의 객체를 생성해 주소를 Thread클래스의 객체 생성시 생성자로 전달해 new Thread(일반클래스객체주소);
*/
public class Test implements Runnable {
	String name;

	public Test(String name) {
		this.name = name;
	}

	// 보조스레드가 할 일을 작성할 run메소드(콜백메소드)
	@Override
	public void run() {
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(500); // 보조 작업스레드가 1초 동작안함
			} catch (InterruptedException e) { // 쉬는동안 다른 스레드가 인터럽트를 발생시키면
				e.printStackTrace();
			}
			sum += i;
			System.out.println(this.name + " : " + sum);
		}
	}

	public static void main(String[] args) {
		Thread t1 = new Thread(new Test("t1"));
		Thread t2 = new Thread(new Test("t2"));
		t1.start();
		t2.start();
	}

}
