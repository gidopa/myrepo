//예 ++, -- 의 선/후행처리

public class Opr06_1 {

	public static void main(String[] args) {
		int a =10, b=10;
		System.out.println(++a);
		System.out.println(b++);
		System.out.println(b);
		a=10; b=10;
		a = b = 10;
		int c;
		c = ++a;
		System.out.println("c의 값 : "+c+" / a의 값 : "+a);
		c = b++;
		System.out.println("c의 값 : "+c+" / b의 값 : " +b);
		
	}

}
