package 스레드기본;

/*
	스레드는 크게 2종류로 나뉨
	1. 일반 스레드(독립스레드 : main스레드 및 다른 보조작업 스레드)
	   직접 개발자에 의해 제어 되는 스레드
	2. 데몬 스레드(일반 스레드에 의해 실행되는 종속 스레드)
	   일반 스레드의 작업을 돕는 보조적 역할을 하는 스레드
	   
	데몬 스레드
	- 일반스레드가 모두 종료되면 데몬스레드는 강제로 따라 종료
	- 일반스레드를 생성한다음 실행전에 setDaemon(true); 를 호출하면 일반스레드가 데몬스레드화 해서 만들 수 있다.
	어떤 2개의 스레드가 있다고 할때.. 
	하나의 스레드가 종료될때 나머지 일반 스레드를 데몬스레드로 만들고 자동종료되게 하기
*/
public class ThreadEx09 {

	public static void main(String[] args) throws InterruptedException {
		//일반 T클래스(run메소드 구현)의 객체 생성 후 객체의 주소를 Thread클래스 객채 생성시 생성자로 전달
		//실제 일반보조작업 스레드 객체 생성
		Thread thread = new Thread(new T());
		//보조작업스레드를 데몬화
		thread.setDaemon(true);
		thread.start();
		for(int i =0;i<20;i++) {
			Thread.sleep(1000);
			System.out.println(i);
			if(i==5) {
				T.autoSave = true;
			}
		}
		System.out.println("main out");
	}

}

class T implements Runnable {
	static boolean autoSave = false;
	Thread thread ;
	
	public T() {
		thread = new Thread(this);
	}
	// 작업파일을 자동저장하는 기능
	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (autoSave) {
				autoSave();
			}
		}
	}

	public void autoSave() {
		if (autoSave) {
			System.out.println("자동저장");
		}
	}

}