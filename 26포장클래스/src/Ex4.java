
public class Ex4 {

	public static void main(String[] args) {
		//JDK 5버전 이후부터 적용되는 오토박싱, 오토언박싱
		int n1 = 10;
		int n2;
		Integer num1;
		num1 = Integer.valueOf(n1);
		Integer num2 = new Integer(20); // 수동박싱
		
		num1 = n1; // 오토 박싱
		
		System.out.println(n1);
		System.out.println(num1.intValue());
		System.out.println(num1.toString());
		Integer num3 = 15; // 오토박싱
		n2 = num2; // 오토 언박싱
		System.out.println(num3.toString());
		System.out.println(n2);
		System.out.println();
		//-------------------------------------------------
		Integer it = 10;
		System.out.println(it.toString());
		int a = it;
		System.out.println(a);
		Double du = 3.14;
		System.out.println(du.toString());
		double b = du;
		System.out.println(b);
		System.out.println();
		// 오토박싱, 오토언박싱
		Integer c1 = 10;
		Integer c2 = 20;
		c1++;
		System.out.println(c1.toString());
		//순서1. c1이 오토언박싱
		//순서2. c1의 10이 int형 10으로 바뀌고
		//순서3. 바뀐 int형 10에 ++ 연산으로 11로 되고
		//순서4. 오토박싱으로 Integer 형 c1에 11 저장 
		c2 += 3;
		// c2 오토언박싱
		// c2 = c2 + 3 -> c2 = 23
		// c2 오토박싱
		System.out.println(c2.toString());
		int res = c1 + c2 ;
		System.out.println(res);
		
		
	}

}
