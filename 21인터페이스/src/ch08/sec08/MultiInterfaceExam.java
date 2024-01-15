package ch08.sec08;
/*
	
*/
public class MultiInterfaceExam {

	public static void main(String[] args) {
		RemoteControl rc = new SmartTv();
		//RemoteControl 인터페이스에 만들어 놓은 추상메소드만 호출가능 !
		rc.turnOn();
		SmartTv stv = new SmartTv();
		stv.search(null);
		
	}

}
interface RemoteControl{
	void turnOn();
	void turnOff();
}
interface Searchable{
	void search(String url);
	
}
//RemoteControl과 Searchable 두 인터페이스를 부모로 하는 자식 SmartTv 클래스
class SmartTv implements RemoteControl,Searchable{

	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다");	
	}

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다");
	}

}

