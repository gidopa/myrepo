/*
 증감연산자 ++ --
 a = a + 1 , a = a - 1
 */
public class Opr06 {

	public static void main(String[] args) {
		
		int n = 5;
		System.out.println(n);
		n++;
		System.out.println(n);
	
		int y;
		int x = 10;
		y = x-- + 5 + --x;
		System.out.println("y 값 : "+y);
		System.out.println("x 값 : "+x);
		// x +5 -> x-- > --x -> x+5 + (--x)
		// x+5 수행 후 x--로 x 1 감소 그 이후 --x로 x 1감소 되고 +연산 수행
		
		// 중요 !
		int c = 1;
		System.out.println(c++);
		System.out.println(c);
		System.out.println(++c);
	}

}
