package ThreadMethod;

public class ThreadEX11_1 {

	public static void main(String[] args) {
		Thread t1 = new Thread(new MyThread("t1"));
		Thread t2 = new Thread(new MyThread("t2"));
		Thread t3 = new Thread(new MyThread("t3"));
		t1.start();
		t2.start();
		t3.start();
		t1.suspend();
	}

}
class MyThread implements Runnable{
	boolean suspended = false;
	boolean stopped = false;
	Thread thread;
	
	public MyThread(String name) {
		thread = new Thread(this,name);
	}
	void start() {
		thread.start();
		}
	void stop() {
		stopped = true;
		}
	void suspend() {
		suspended = true;
		thread.interrupt(); // 스레드 작업중단
	}
	void resume() {
		suspended =false;
		thread.interrupt();
	}
	@Override
	public void run() {
		while(!stopped) {
			try {
				if(!stopped) {
				Thread.sleep(1000);
				}else {
					//현재 실행중인 자기자신의 스레드를 중단해 다른스레드에 일을 양보함
					Thread.yield();
				}
				System.out.println(Thread.currentThread().getName()+ " : 출력");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}	

