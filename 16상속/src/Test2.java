// 같은 패키지에서 접근제어자를 이용해 멤버 만들고 사용 실습

public class Test2 {

	public static void main(String[] args) {
//		StringBuilder sb = new StringBuilder();
	
		Sub sub = new Sub();
		sub.print();
		
		new Super();
	}

}

class Super{
	
	Sub sub = new Sub();
	
	public int num1 = 10;
	protected int num2 = 20;
	int num3 = 30;
	private int num4 = 40;

	

	
	public int getNum() {
		return this.num4;
	}
}
class Sub extends Super{
	private int num5;
	
	public void print() {
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(getNum());
		System.out.println(num5);
		}
	}

