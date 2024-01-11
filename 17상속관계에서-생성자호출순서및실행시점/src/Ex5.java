/*
  서브클래스 I의 생성자호출 -> super(5) -> 슈퍼클래스의 int 5를 받는 생성자 호출 -> 생성자 실행  
  super : 슈퍼클래스의 객체 메모리의 주소를 기억
  용도 : 서브객체 내부에서 슈퍼객체 멤버접근시 사용
  
  super() : 서브 객체 내부에서 슈퍼객체의 생성자를 호출하는 호출구문
  참고. 슈퍼 클래스 생성자 내부 첫라인에 슈퍼클래스의 생성자 호출하도록 super()작성
  	   개발자가 명시하지 않으면 자동적으로 첫줄에 들어감
*/
public class Ex5 {

	public static void main(String[] args) {
		I i = new I();
	}

}
class H{
	private int a;
	public H() {
		System.out.println("기본생성자H");
	}
	public H(int x) {
		System.out.println("x를 받는 생성자H, x : "+x);
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	
	
}
class I extends H{
	public I() {
		
		super(5);
		System.out.println("기본생성자I");
	}
	public I(int y) {
		super(y);
		System.out.println("y를 받는 생성자I, y : "+y);
	}
}
