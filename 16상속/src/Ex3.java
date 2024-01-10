
public class Ex3 {
	
	public static void main(String[] args) {
		A a = new A();
		a.p =5;
		a.setN(4);
		B b = new B();
		b.p=5;
		b.setM(3);
		b.setN(5);
		System.out.println(b.toString());
		
	}
}
class A{
	public int p;
	private int n;
	
	public void setN(int n) {
		this.n=n;
	}
	public int getN() {
		return n;
	}
}
class B extends A{
	private int m;
	
	public int getM() {
		return m;
	}
	
	public int setM(int m) {
		 return this.m=m;
	}
	public String toString() {
		return "n=" + getN() + ", m=" + m; 
	}
}

