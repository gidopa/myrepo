// 업캐스팅 슈퍼클래스 자료형참조변수에 여러개 서브클래스의 객체메모리에 주소를 대입해 저장
/*
		8byte b var = long type 
		int a 변수를 b 메모리에 저장할때는 개발자가 직접 형변환 안해도 ㄱㅊ
*/
/*
	참조자료형의 형변환

*/
public class Ex2 {

	public static void main(String[] args) {
		int a = 10; // 4byte
		double b = 20; // 8byte
		b = a;
		System.out.println(b);
		
		Child c = new Child();
		c.paretPrn();
		Parent p ;
		p = null ;
		p = (Parent)c; // 업캐스팅 생략가능 
		p.paretPrn(); // 메모리는 주소는 c의 주소이지만 참조자료형이 Parent라 Parent의 멤버에만 접근 가능
		
	}

}
class Parent{
	public void paretPrn() {
		System.out.println("슈퍼클래스의 parentPrn()");
	}
}
class Child extends Parent{
	public void childPrn() {
		System.out.println("서브클래스의 childPrn()");
	}
}
