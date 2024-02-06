package ThreadStop;

//주제 : Thread클래스의 interrupt()메소드를 이용하여
//		현재 일을 하고 있는 스레드 객체 강제로 중지 시키기


//보조작업스레드 객체를 생성하기 위한 run추상메소드를 오버라이딩 해놓은 클래스 설계
class StopThreadDemo2 implements Runnable  {
	
	//보조작업스레드가 할일을 run메소드에 작성
	@Override
	public void run() {		
		try {
/*
	Thread.currentThread() 메소드  : 
	현재 실행(작업)중인 스레드 객체주소를 반환
	
	Thread.isInterrupted() 메소드 : 
	현재 보조작업스레드일을 중지 해라! 라는 명령을 했는지에 대한 검사 하는 메소드
	참고! 현재 보조작업스레드객체의 일을 중지해라! 라는 명령어는? interrupt()메소드를 호출한 것과 같다.		
						
*/			
			//현재 보조작업스레드 객체를 중지해라는 명령(intterupt();)을 내리지 않았으면 계속 반복해서 출력작업하기
			while(  !Thread.currentThread().isInterrupted() ) {
				//메세지를 출력하는일
				System.out.println("현재 보조작업스레드 객체는 작업중이다....");
				//보조작업스레드 객체 0.5초 휴식
				Thread.sleep(500);
			}
						
		}catch(Exception e) {
			System.out.println("interrupt()메소드를 이용하여 보조작업스레드 객체 강제 중지 시키기!");
		}finally {
			//while반복문의 실행이 끝나면 무조건 한번 출력되는 구문
			System.out.println("보조작업스레드객체는 현재 Dead.........");
		}
			
	}//run
	
}

public class StopThreadEx2 {

	//메인스레드 
	public static void main(String[] args)throws Exception {
		System.out.println("## interrupt()메소드를 이용한 보조작업스레드 객체 강제 중지 기능 시작");
		
		//보조작업스레드 객체 생성
		Thread thread = new Thread(  new StopThreadDemo2() );
		//보조작업스레드 객체 일시키기(start()메소드를 호출하여 JVM에게 run()메소드를 실행해라~~ 라고 알립니다.)
		thread.start();
		
		//메인스레드 1초 휴식 후 작업 해라
		Thread.sleep(1000);
		
		//현재 작업하고 있는 보조작업스레드 객체에게 run메소드의 일을 강제로 중지해라! 명령!
		thread.interrupt();
		

	}

}











