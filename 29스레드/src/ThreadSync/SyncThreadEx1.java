package ThreadSync;
/*
	스레드 동기화가 발생하는 문제
	- 다수의 스레드가 하나의 공유데이터에 동시에 접근해서 사용할 경우 
	  그 공유 데이터 사용에 관한 동기화문제 발생
	동기화처리
	- 스레드들 사이의 작업시기를 맞추어서 똑같은 데이터를 유지 
	synchronized 키워드 이용
*/
public class SyncThreadEx1 {
	public static void main(String[] args) {
		Toilet toilet = new Toilet();
		Family father = new Family(toilet, "father");
		Family mother = new Family(toilet, "mother");
		Family brother = new Family(toilet, "brother");
		Family sister = new Family(toilet, "sister");
		Family me = new Family(toilet, "me");
		father.start();
		mother.start();
		brother.start();
		sister.start();
		me.start();
	}
}
/*
	synchronized 키워드
	- 자바에서 스레드 동기화를 위한 키워드
	- synchronized 키워드와 함께 작성된 메소드는 특정 보조스레드가 메소드를 호출해 일처리를
      시작하기 전에 락을 걸고 소유하며, 락을 소유하지 못한 다른 스레드들은 synchronized 블록앞에 락을 소유할때까지 대기 
*/
class Toilet{
	public synchronized void openDoor(String name) { // 화장실로 들어오는 가족스레드 객체의 이름을 매개변수로 받는다
		System.out.println(name+" 화장실 들어옴");
		//화장실 쓰는 시간 반복해서 출력
		for(int i=0;i<100000000;i++) {
			//만번이 될때마다 똥싸는 효과 출력
			if(i == 10000 ) {
				System.out.println(name + " : 끙");
			}
		}
		System.out.println(name + " : 시원하노");
	}
}
//가족 구성원들을 보조스레드로 만드는 클래스
class Family extends Thread{
	Toilet toilet;
	//가족의 구성원들 중에서 한사람의 이름을 저장할 변수
	String who;
	public Family(Toilet toilet, String who) {
		this.toilet = toilet;
		this.who = who;
	}
	//화장실 문으로 특정 가족객체가 들어가는 동작을 표현하는 일
	@Override
	public void run() {
		toilet.openDoor(who);
	}
	
	
}
