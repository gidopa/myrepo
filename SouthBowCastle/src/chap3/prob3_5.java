package chap3;

public class prob3_5 {
	public static void main(String[] args) {
		makeOne re1 = new makeOne(333);
		System.out.println(re1.method());
		
	}
}
class makeOne{
	int num;
	public makeOne(int num) {
		this.num = num;
	}
	public int method() {
		return ((this.num / 10) * 10 +1);
	}
}
