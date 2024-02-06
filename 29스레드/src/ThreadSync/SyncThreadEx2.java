package ThreadSync;

import java.util.Stack;

/*
	스레드 동기화 처리 2번째 예제(자판기)
	음료수를 제공하는 공급자 스레드가 자판기에 음료를 공급하면 자판기에서 음료를 구입해 먹는 소비자 스레드
	자판기(공유데이터가 저장되는 객체 메모리)   
*/
public class SyncThreadEx2 {

	public static void main(String[] args) {
		AutoMachine autoMachine = new AutoMachine();
		new Thread(new Producer(autoMachine), "공급자").start();
		new Thread(new Consumer(autoMachine), "소비자").start();
		
	}

}
class AutoMachine{
	Stack store = new Stack();
	//소비자 스레드가 자판기에서 음료수를 뽑아마심
	public synchronized String getDrink() throws InterruptedException {//어떤 음료수를 뽑아 먹는지 반환
		//자판기 공간에 들어오지 않고 소비자 스레드 기다리게 하기
		this.wait();
		return store.pop().toString();
	}
	// 공급자가 자판기에 음료 채워넣음
	public synchronized void putDrink(String drink) {
		//음료수를 공급했으니 대기하고 있는 소비자 스레드 객체의 일을 다시 수행하라고 명령하는 메소드 wait와 같이 씀
		this.notify();
		store.push(drink); 
	}
}
class Producer implements Runnable{
	private AutoMachine autoMachine;
	public Producer(AutoMachine autoMachine) {
		this.autoMachine = autoMachine;
	}
	@Override
	public void run() {
		for(int i =0;i<9;i++) {
			System.out.println(Thread.currentThread().getName()+" : 음료수 No."+i+"를 채움");
			autoMachine.putDrink("음료수 No."+i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
class Consumer implements Runnable{
	private AutoMachine autoMachine;
	
	public Consumer(AutoMachine autoMachine) {
		this.autoMachine = autoMachine;
	}

	@Override
	public void run() {
		for(int i=0;i<9;i++) {
			try {
				System.out.println(Thread.currentThread().getName()+" : " + autoMachine.getDrink() + "를 꺼내 먹음");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}


