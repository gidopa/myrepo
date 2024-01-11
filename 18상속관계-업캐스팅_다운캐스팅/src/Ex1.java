/*
	자바언어의 특징 - 다형성
	다형성?
	다양한 형태를 가지는 성질
	ex) 오버로딩 
	업캐스팅 - 부모클래스의 참조변수 하나를 선언해서 여러 자식객체를 생성 후 모두 대입할 수 있는 것
	A a A- super B-sub C-sub D-sub
	a = new B();
	a = new C(); 
	다 가능
	슈퍼클래스 자료형의 참조변수에 서브클래스의 메모리 생성후 그 주소를 저장
	메소드를 하나만 만드려고 매개변수로 서브클래스의 객체를 받는 경우 
	class A 
	void upCasting(A a){}   B의 객체는 A b = new B();
							C의 객체는 A c = new C();
	이런식으로 매개변수의 타입을 고정해 매개변수로는 다 쓰면서 안의 세부 메모리는 B or C의 데이터를 갖다씀 !
	그래서 상속관계에서 업캐스팅이 가능 ! 
	업캐스팅해도  슈퍼클래스의 멤버만 사용가능하다 (형변환의 기능)
*/
public class Ex1 {

	public static void main(String[] args) {
		Tv tv = new Tv();
		Tv t = new CaptionTv();
		t.channelDown();
		CaptionTv c1 = new CaptionTv();
		t.power();
		t.channel = 3;
		t.channelUp();
//		t.text			 Tv 클래스의 참조변수이므로 서브클래스의 멤버에 대해서는 접근이 불가능함.
//		t.caption();
	}

}
class Tv{
	boolean power;
	int channel;
	
	public void power() {
		this.power = !power;
	}
	public void channelUp() {
		++channel;
	}
	public void channelDown() {
		--channel;
	}
}
class CaptionTv extends Tv{
	String text;
	
	public void Caption() {
		System.out.println("캡션기능");
	}
}

/*
	클래스간의 관계를 나타낸 그림 -> 상속계층도
			TV
			^
			|
		CaptionTv
*/






