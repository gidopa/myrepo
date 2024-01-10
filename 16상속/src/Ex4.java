// 슈퍼클래스와 자식클래스가 같은 패키지에 있는 경우 멤버에 접근 하는 예

public class Ex4 {

	public static void main(String[] args) {
		BB bb = new BB();
		bb.set();
		System.out.println(bb.get());
	}

}
class AA{
	// default 접근제어자 -> 같은 패키지면 모두 접근 가능
	int i;
	// protected 접근제어자 -> 같은 패키지의 클래스 + (다른 패키지라도)서브클래스 접근 가능
	protected int pro;
	// public 접근제어자 -> 전부 접근 가능
	public int pub;
	// private 접근제어자 -> 같은 클래스 내부에서만 접근 가능
	private int pri;
	
	public void setPri(int pri) {
		this.pri = pri;
	}
	public int getPri() {
		return this.pri;
	}
} 
class BB extends AA{
	
	void set() {
		// default,protected, public 접근제어자라 부모 객체의 i 변수에 접근 가능
		super.i = 1;
		pro = 3;
		pub = 4;
		// super.pri는 private이라 서브클래스에서도 접근 불가능 대신 public 메소드 get/set 이용
		super.setPri(2);
	}
	public String get() {
		
		return super.i + "," + super.pro + "," + super.pub + "," + super.getPri();
	}
	// 변수의 경우 private으로 작성 / 생성자,메소드, 클래스 -> 퍼블릭
	
	
}




