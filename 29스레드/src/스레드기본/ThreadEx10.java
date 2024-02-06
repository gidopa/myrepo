package 스레드기본;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ThreadEx10 {

	public static void main(String[] args) {
		new Thread(new ThreadDemo4("t1")).start();
		new ThreadDemo5("t2").start();
		
	}

}
class ThreadDemo4 implements Runnable{
	Thread thread;
	public ThreadDemo4(String name) {
		thread = new Thread(this, name);
	}
	@Override
	public void run() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
//현재 실행중인 모든 스레드에 대한 정보를 화면에 출력하는 일을 하는 보조작업 스레드
class ThreadDemo5 extends Thread{
	public ThreadDemo5(String name) {
		super(name);
	}
	@Override
	public void run() {
/*
	Thread클래스의 getAllStackTraces()메소드
	프로세스 내부에서 실행하는 모든 스레드에 대한 모든 정보를 얻을 수 있음
	Map인터페이스 타입의 자식객체를 반환 key가 Thread value는 스레드의 상태 기록을 갖는 StackTraceElement배열
*/
		//스택 메모리안의 현재 실행중인 Thread객체와 그 상태기록들이 저장된 HashMap
		Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces();
		//위 Map배열에 저장된 스레드(key)들만 HashSet배열에 담아 HashSet 배열자체를 반환
		Set set = map.keySet();
		//HashSet에 저장된 스레드객체들을 모두 꺼내 Iterator배열에 담아 Iterator 배열 자체를 반환
		Iterator iter = set.iterator();
		//JVM 스택안에 있는 스레드객체 순서를 설정하기 위한 변수
		int x=0;
		while(iter.hasNext()) {
			Thread thread = (Thread)iter.next();
			//현재 실행중인 스레드객체(key)를 이용해 HashMap에 저장된 상태정보를 꺼내옴
			StackTraceElement[] ste = (StackTraceElement[])map.get(thread);
			//thread.getThreadGroup().getName() : 현재 실행중인 스레드의 그룹객체의 이름 반환 
			//thread.isDaemon() : thread가 daemon이면 true 아니면 false 반환
			System.out.println(
					"["+(++x)+"] name : " + thread.getName() + ", group :" + thread.getThreadGroup().getName() + 
					", daemon : " + thread.isDaemon()
					);
			//StackTraceElement[] 배열에서 상태기록정보 출력
			for(int i=0;i<ste.length;i++) {
				System.out.println(ste[i]);
			}
			System.out.println();
		}
		
	}
}


/*
threadDemo5 현재 실행중인 스레드 객체의 정보 출력
[1] name : t2, group :main, daemon : false

자바 가상 머신(JVM)에서 객체의 finalize() 메서드를 호출하는 역할을 담당하는 특수한 스레드 
스레드는 가비지 컬렉터에 의해 수거되는 객체들의 finalize() 메서드를 순차적으로 실행
[2] name : Finalizer, group :system, daemon : true

자바 GUI(SWING)에서 이벤트 동작을 실행하기 위한 데몬스레드
[3] name : Attach Listener, group :system, daemon : true

[4] name : Common-Cleaner, group :InnocuousThreadGroup, daemon : true

[5] name : Signal Dispatcher, group :system, daemon : true

특정 작업이나 이벤트와 관련된 알림을 처리하는 스레드
[6] name : Notification Thread, group :system, daemon : true

ThreadDemo4 
[7] name : Thread-0, group :main, daemon : false

객체 참조를 위한 핸들러 약할을 하는 데몬스레드
[8] name : Reference Handler, group :system, daemon : true

*/
