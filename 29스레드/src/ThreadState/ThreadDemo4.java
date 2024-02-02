package ThreadState;

public class ThreadDemo4 {

	public static void main(String[] args) {
		ThreadDemo3 t3 = new ThreadDemo3();
		Thread t1 = new Thread(new ThreadDemo3());
		t1.start();
		System.out.println("hi");
		// 새로운 보조작업스레드 객체에 만들어져 있는 run메소드가 아니라 
		// main 내부에서 run메소드를 호출하는 스레드 작업을 하는것임
		t3.run();
		/*
			start()메소드 호출 시 보조작업스레드가 생성되어 실행되고
			run()메소드를 콜 스택에 올릭 호출하게 됨
			
			run()메소드를 직접 호출하면 보조작업스레드에서 실행하는게 아니고
			main스레드에서 생성된 객체의 run()메소드만 호출하는것
		*/
	}

}
