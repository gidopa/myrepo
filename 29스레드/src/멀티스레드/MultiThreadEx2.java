package 멀티스레드;

import javax.swing.JOptionPane;
//플래그변수 : 조건 판단을 위해 참, 거짓 중 하나의 값을 저장 할 변수

public class MultiThreadEx2 {
	
	public static void main(String[] args) {
		InputThread t1 = new InputThread("t1");
		InputThread1 t2 = new InputThread1("t2");
		
	}
	//다이얼로그에 10초안에 입력하면 true 아니면 false
	//다른 보조작업스레드 객체들이 공용으로 사용하기 위한 플래그변수
	static boolean inputCehck = false;
	
}

class InputThread implements Runnable{
	Thread thread;
	
	public InputThread(String name) {
		thread = new Thread(this, name);
		thread.start();
	}

	@Override
	public void run() {
		String input = JOptionPane.showInputDialog("10초안에 입력하세요");
		System.out.println("입력 내용은 " +input);
		if(input != null) {
			MultiThreadEx2.inputCehck = true;
		}
		
	}
	
}

class InputThread1 implements Runnable{
	Thread thread;
	public InputThread1(String name) {
		thread = new Thread(this, name);
		thread.start();		
	}
	@Override
	public void run() {
		for(int i=1;i<11;i++) {
			if(MultiThreadEx2.inputCehck == true) {
				return;
			}
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		System.out.println("10초 동안 입력하지 않아 강제종료");
		System.exit(0);
	}
	
	
}
