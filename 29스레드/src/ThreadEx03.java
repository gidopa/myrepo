//메인스레드(주스레드,main메소드)를 작성해 놓은 클래스
public class ThreadEx03 {
	//메인스레드. 하는일 : 보조스레드 객체 생성, 0.5초 간격으로 .을 10번 반복해서 출력
	public static void main(String[] args) throws InterruptedException {
		System.out.println("대가리노예 시작");
		ThreadDemo1 t1 = new ThreadDemo1("t1");
		for(int i=0;i<10;i++) {
			System.out.println(".");
			Thread.sleep(500);
		}
		
		System.out.println("대가리노예 끝");
	}

}

class ThreadDemo1 implements Runnable{
	private int count;
	Thread thread;
	
	public ThreadDemo1(String name) {
		thread = new Thread(this, name);
		thread.start();
	
	}

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName());
		}
		
	}
	
	
}


