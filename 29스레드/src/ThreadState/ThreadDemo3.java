package ThreadState;

//보조 작업 스레드 클래스 설계
public class ThreadDemo3 implements Runnable {
	Thread thread;

	public ThreadDemo3() {
		thread = new Thread(this);
	}

	public void run() {
		throwException();
	}
	

	public void throwException() {
		try {
			throw new Exception();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
