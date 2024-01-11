
public class Ex4 {

	public static void main(String[] args) {
		C c = new C();
		
		
		C c_up = new D();
//		c.receiveD(new D());
		c.receive(c_up);
		D d = (D)c_up;
		d.numD = 3;
		System.out.println(d.numD);
		c_up = new E();
		E e = (E)c_up;
		e.numE = 4;
		System.out.println(e.numE);
		
	
	}

}
class C{
	int numC ;
	
//	public void receiveD(D d) {
//		System.out.println(d);
//	}
//	public void receiveE(E e) {
//		System.out.println(e);
//	}
//	public void receiveF(F f) {
//		System.out.println(f);
//	} 			// 업캐스팅 -> C c로 받아서 객체는 D d , E e로 집어넣을거임
	public void receive(C c) {
		D d = null;
		E e  = null;
		if(c.equals(d)  ) {
			// 다운 캐스팅
			d = (D)c;
		}else if(c.equals(e)   ) {
			e = (E)c;
		}
		
	}
}
class D extends C{
	int numD;
	int numD2;
}
class E extends C{
	int numE;
	int numE2;
}
class F extends C{
	int numF;
	int numF2;
}
