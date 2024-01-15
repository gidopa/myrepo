package ch08.sec02;

public class RemoteControllExample {

	public static void main(String[] args) {
		//인터페이스로 업캐스팅이 가능하다
		//부모 인터페이스 = RemoteControl
		//자식 클래스 = Television
		
		//업캐스팅
		//부모인터페이스자료형  참조변수선언 = 자식객체생성;
		RemoteControl rc = new Television();
					  rc.turnOn(); //오버라이딩된 메소드 호출
					  rc.setVolume(5);//인터페이스자료형의 참조변수rc로 오버라이딩 된 메소드 호출 가능
					//rc.turnOff();//  인터페이스 자료형의 참조변수rc로 오버라이딩 된 메소드 호출 가능 
		
					  //디폴트 메소드 호출
					  rc.setMute(true);
					  rc.setMute(false);
					  
					  
					  System.out.println("-------------------------------");
					  
		//업캐스팅
					  rc = new Audio();
					  rc.turnOn(); //오버라이딩된 메소드 호출
					  rc.setVolume(5);
					 //rc.turnOff();
		              
					  //디폴트 메소드 호출
					  rc.setMute(true);
					  rc.setMute(false);
					  
					  
					  
		//상수는 구현 객체와 관련 없는 인터페이스 소속멤버이므로 
		//인터페이스명으로 바로 접근해서 상수에 저장된 값을 읽어 올 수 있다
		//문법
		//인터페이스명.상수명
		System.out.println("리모콘 최대볼륨 : " +  RemoteControl.MAX_VOLUME);		
		System.out.println("리모콘 최소볼륨 : " +  RemoteControl.MIN_VOLUME);
		
					  
		System.out.println("-----------------------------------------------");
		
		//정적 메소드 호출  (인터페이스 내부에 만들어 놓은)
		//인터페이스명.정적메소드명();
		RemoteControl.changeBattery();
		
		
		
					  
	}

}










