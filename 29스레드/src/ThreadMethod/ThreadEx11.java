package ThreadMethod;
//yield()
public class ThreadEx11 {

	public static void main(String[] args) {
		new ThreadT("t1").start();
		new ThreadT("t2").start();
		new ThreadT("t3").start();
		
	}

}
class ThreadT extends Thread{
	int res =  0;
	
	public ThreadT(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		// 1. 100번 반복해서 0~99까지 res에 누적
		// 2. 현재 보조작업스레드가 실행중이면 해당스레드 이름을 얻어 출력하고 res값 출력
		for(int i=0;i<100;i++) {
			res += i;
			System.out.println(Thread.currentThread().getName() + " res : " + res);
			// 같은 우선순위에 있는 스레드에게 실행기회를 양보하는 메소드
			// 같은 우선순위의 스레드가 하나도 없으면 현재 실행중인 자신의 스레드를 다시 실행시킴
			// 휴식상태로 가지 않고 바로 대기상태로 전환
			// OS JVM내부의 스케쥴러에 의해 현재 실행되고 있는 스레드에 양보를 알리는 목적의 메소드로 
			// 스레드들의 작업 순서를 정하는 과정에서 랜덤으로 정하기 때문에 양보에 큰 효과를 볼 수 없다
			// yield메소드는 interrupt()메소드와 함께 사용해야 효과를 볼 수 있음.
			Thread.yield();
			
		}
	}
}
