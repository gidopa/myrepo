/*
	-Runnable 인터페이스 내부에 만들어져 있는 추상메소드 run을 오버라이딩한 클래스를 만들고
	만든 클래스의 객체를 생성해 주소를 Thread클래스의 객체 생성시 생성자로 전달해 new Thread(일반클래스객체주소);
*/
package 스레드기본;

public class Test_1 implements Runnable {
	//실제 보조 작업 스레드 객체를 생성해 객체의 주소를 저장시킬 참조변수 선언
	Thread thread;
	public Test_1(String name) {
	//아래의 main메소드 내부에서 Test_1일반클래스에대한 객체 생성 시 생성자로 보조 스레드의 이름을 전달해 받아서 저장
		thread = new Thread(this, name);
		//보조 작업 스레드 객체에 만들어져있는 run()메소드 실행되게 호출
		thread.start();
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
			/*
				Thread.currentThread()메소드
				- 현재 실행중인 보조스레드의 객체메모리의 주소를 반환
				- static 메소드, 언제든지 호출할 수 있다.
				- 반환타입은 Thread 클래스 타입으로 반환.
				Thread.getName()
				- 보조스레드의 객체의 인스턴스변수 ! 스레드 이름을 반환하는 메소드
				- 참고로 보조스레드 이름을 변경할때는 setName()
				
			*/				   //thread.getName() 도 가능
			System.out.println(Thread.currentThread().getName() + " : " + sum);
		}
	}

	public static void main(String[] args) {
		Test_1 t1 = new Test_1("t1");
		Test_1 t2 = new Test_1("t2");
	}

}
