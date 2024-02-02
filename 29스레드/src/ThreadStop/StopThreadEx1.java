package ThreadStop;
// flag 변수를 이용한 스레드 정지
public class StopThreadEx1 {

	public static void main(String[] args)throws Exception {
		System.out.println("## 플래그 변수를 이용한 스레드 중지 기능 시작");
		new StopThreadEx1().process();
	}
	
	public void process() throws InterruptedException{
		StopthreadDemo1 t1 = new StopthreadDemo1("t1");
		System.out.println(t1.thread.getName());
		Thread thread = new Thread(t1);
		thread.start();
		// 보조스레드 작업시키고 메인스레드 1초 중지
		Thread.sleep(1000);
		t1.stop();
	} 

}
class StopthreadDemo1 implements Runnable{
	Thread thread;
	private boolean isStop = false;

	public StopthreadDemo1(String name) {
		thread = new Thread(this,name);
	}
	@Override
	public void run() {
		// 플래그 변수에 저장된 값이 true일때만 반복해서 일을 함
		while(!isStop ) {
			System.out.println("스레드 동작중");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("스레드 뒤짐");
	}
	// 현재 작업하는 보조작업스레드가 중지되었다라고 판단할 값을 저장하는 기능의 메소드
	public void stop() {
		isStop = true;
	}
	
	
}
