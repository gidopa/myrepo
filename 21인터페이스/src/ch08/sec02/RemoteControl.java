package ch08.sec02;
/*
	인터페이스란?
		- 다른 클래스를 작성할때 기본이되는 추상메소드 틀을 제공하면서,
		  다른 클래스사이의 중간 매개 역할까지 담당하는 일종의 추상클래스를 의미 합니다.
		  단! 인터페이스는 클래스의 종류가 아니고 인터페이스만의 문법이다.
		  
		- 추상메소드와 상수로만 이루어져 있다.  
		  
		- 자바의 상속은 하나의 클래스는 하나의 클래스만 상속을 허용 하기때문에
		  하나 이상의 클래스의 멤버를 구현 받기 위해 인터페이스 가 나왔다
		  
		- 추상클래스 보다 더 추상화된 미완성 설계도.
		
		- 인터페이스는 다른 인터페이스를 상속할수 있다.그리고 다중 상속 허용합니다.
     
     인터페이스 만드는 문법
     		interface 인터페이스명 {   }   //default접근 제어자 사용하여 만듬
     public interface 인터페이스명 {   }   //public접근 제어자 사용하여 만듬
     
     인터페이스가 가지는 멤버들
     		interface 인터페이스명 {
     		
     			//public 상수선언
     			//public 추상메소드
     			//public 디폴트메소드
     			//public 정적 메소드 
     			//private 메소드
     			//private 정적 메소드 
     		}
 */
public interface RemoteControl {
	
	//interface안에 상수를 작성할때 final을 생략해도 된다.
	/* final */ int MAX_VOLUME = 10;  //상수 
	   final    int MIN_VOLUME = 0;   //상수 
	
	//public 추상 메소드
	//참고. interface안에 추상메소드를 작성할때 abstract을 생략해도 된다.
	public /* abstract*/  void turnOn();
	
						  void turnOff();
						  
						  void setVolume(int volume);
	
	/*
		인터페이스는 구현 클래스가 재정의해야 하는 public 추상메소드를 멤버로 가질수 있다.
		추상 메소드는 리턴타입, 메소드명, 매개변수만 기술되고  중괄호 {}를 붙이지 않는 메소드를 말한다
		public abstract를 생략하더라도 컴파일 과정에서 자동으로 붙게 된다.
	*/
						  
	/*					  
			디폴트 메소드 
			- 인터페이스에는 완전한 실행코드를 가진 디폴트 메소드를 선언할수 있다.
			  추상메소드는 실행부(중괄호 {})가 없지만,
			  디폴트 메소드는 실행부가 있다.
			  선언방법 
			  	public default 리턴타입 메소드명(매개변수,...){}					  
	*/					  
	 public default void setMute(boolean mute) {
		 	if(mute) {
		 		System.out.println("무음 처리합니다.");
		 		//추상메소드 호출하면서 상수 사용
		 		setVolume(MIN_VOLUME);
		 	}else {
		 		System.out.println("무음 해제합니다.");
		 	}
	 }
	 /*	
	 	정적메소드
	 		-  인터페이스에는 정적메소드도 선언이 가능하다.
	 		-  추상메소드와 디폴트 메소드는 구현 객체가 필요하지만,
	 		   정적메소드는 구현 객체가 없어도 인터페이스명만으로 호출할수 있다.
	 		   선언방법은 클래스 정적메소드(static 메소드)와 완전동일하다.	
	 	 		단, public을 생략하더라도 자동으로 컴파일 과정에서 붙는것이 차이점이다
	 
	 	    public | private  static  리턴타입  정적메소드명(매개변수,...) {   ...      }
	 */
	 
		//배터리를 교환하는 기능을 가진 changeBattery() 정적메소드를 선언해 보자
	 	static void changeBattery() {
	 		System.out.println("리모콘 건전지를 교환합니다.");
	 		
	 		//정적메소드 내부에서는 주의할점은
	 		//상수를 제외한 추상메소드, 디폴트메소드 ,private  메소드등을 호출할수 없다는 것입니다.
	 	}
						  
}

/*
	특정 인터페이스 내부에 만들 놓은 추상메소드를 강제로 오버라이딩해서
	새로운 자식클래스를 설계하는 문법
		
		class 자식클래스명  implements 인터페이스명 {
			
			인터페이스에 만들어 놓은 추상메소드 강제로 오버라이딩
			
			일반 메소드 
		}	 
*/
//implements : 인터페이스 안에 만들어 놓은 추상메소드를 강제로 재구현(오버라이딩) 함.

//해석 : Television새로운 자식클래스를 만들때 RemoteControl인터페이스 안에 만들어 놓은
//		추상메소드 turnOn을 메소드 오버라이딩해서 만들겠다.
class Television  implements RemoteControl {

	//변수
	private int volume;
	
	//RemoteControl인터페이스 내부에 만들어 놓은 추상메소드를 강제로 오버라이딩
	//참고. 재정의할때 주의할점은  인터페이스의 추상메소드는 기본적으로 pulbic접근제어자를 가지기 떄문에
	//	   public보다 더 낮은 접근제어자로 제정의 할수 없다. 그래서 재정의 되는 메소드는 모두 public이 추가됨
	@Override
	public void setVolume(int volume) {
		
		//인터페이스 상수를 이용해서 volume변수의 값을 제한 할수 있다
		if(volume > RemoteControl.MAX_VOLUME) {
			
			this.volume = RemoteControl.MAX_VOLUME;
			
		}else if(volume < RemoteControl.MIN_VOLUME) {
			
			this.volume = RemoteControl.MIN_VOLUME;
			
		}else {
			this.volume = volume;
		}
		System.out.println("현재 Tv 볼륨 : " + this.volume);	
	}//setVolume메소드 닫기 
	

	//RemoteControl인터페이스 내부에 만들어 놓은 추상메소드를 강제로 오버라이딩 
	@Override
	public void turnOn() {
		System.out.println("Tv를 켭니다.");
	}	
	@Override
	public void turnOff() {
		
		System.out.println("Tv를 끕니다.");
	}
	
}

//해석 : 새로운 자식클래스인 Audio클래스를 만들떄... 
//      RemoteControl인터페이스 내부의 추상메소드를 오버라이딩해서 만들겠다.
class Audio implements RemoteControl {
	//변수 
	private int volume;
	
	@Override
	public void turnOff() {
		//재구현
		System.out.println("Audio를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		//재구현
		if(volume > RemoteControl.MAX_VOLUME) {
			
			this.volume = RemoteControl.MAX_VOLUME;
			
		}else if(volume < RemoteControl.MIN_VOLUME) {
			
			this.volume = RemoteControl.MIN_VOLUME;
			
		}else {
			this.volume = volume;
		}
		System.out.println("현재 Audio볼륨 : " + volume);
	}

	@Override
	public void turnOn() {
		//재구현
		System.out.println("Audio를 켭니다.");
		
	}

	
	//추가로 변수(필드) 만들기
	private int memoryVolume;
	
	//default 메소드 오버라이딩
	//- 메소드 오버라이딩 시 주의할점은 public접근제어자는 반드시 붙여야 하고
	//  default 키워드는 생략 해야 한다.
	@Override
	public void setMute(boolean mute) {
		//재구현
		if(mute) {
			this.memoryVolume = this.volume;
			System.out.println("무음 처리합니다.");
			setVolume(RemoteControl.MIN_VOLUME);
		}else {
			System.out.println("무음 해제합니다.");
			//mute가 false일 경우, 워래 볼륨으로 복원하는 코드 
			setVolume(this.memoryVolume);
		}
	}	
}




















