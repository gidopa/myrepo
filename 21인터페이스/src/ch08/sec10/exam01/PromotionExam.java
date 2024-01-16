package ch08.sec10.exam01;

public class PromotionExam {

	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a = b; // 자동형변환 (업캐스팅)
//		a = c;
//		a = d;
//		a = e;
		a.ew();
		B bb = (B)a;
		bb.ws();
	}

}
interface A{
	void ew();
}
class B implements A{
	public void ew() {
		System.out.println("hd");
	}
	void ws() {
		System.out.println("gd");
	}
}
class C implements A{
	public void ew() {
		System.out.println("hd");
	}
}
class D extends B{
	
}
class E extends C{
	
}

