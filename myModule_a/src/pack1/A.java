package pack1;
import pack3.C;
import pack2.B;
public class A {
	public void method() {
		System.out.println("A-Method");
	}
	public void getBMethod() {
		B b = new B();
		b.method();
	}
	public B getB() {
		B b = new B();
		return b;
	}
	public C getC() {
		return new C();
	}
}
