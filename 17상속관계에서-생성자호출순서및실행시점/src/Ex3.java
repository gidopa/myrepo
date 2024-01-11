
public class Ex3 {
	public static void main(String[] args) {
		E e = new E();
	}
}
class D{
	private int d;
	
	public D() {
	}
	public D(int d) {
		this.d=d;
	}
}
class E extends D{
	private int e;
	public E() {
		
	}
	public E(int e) {
		this.e =e;
	}
}

/*
  Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
	Implicit super constructor D() is undefined. Must explicitly invoke another constructor
	Implicit super constructor D() is undefined. Must explicitly invoke another constructor

	서브클래스 E의 기본 생성자와 짝을 이루는 D의 기본생성자가 없으므로 호출이 불가능
 */
