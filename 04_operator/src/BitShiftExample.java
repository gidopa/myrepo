
public class BitShiftExample {
	public static void main(String[] args) {
		int num1 = 1;
		int res1 = num1 << 3;
		System.out.println(res1);
		// 0001 에서 1000이 되서 1이 8이 됨 
		int res2 = num1 * (int)Math.pow(2, 3);
		
		int num2 = -8;
		int res3 = num2 >> 3;
		System.out.println(res3);
		// -int >> n 연산은 2^n으로 나눈 값과 같음 
		int res5 = num2 / (int)Math.pow(2, 3);
		System.out.println(res5);
		System.out.println("-------------------------------");
		int n = 18;
		int res4 = n >> 3;
		System.out.println(res4);
		// 10010 >>3  => 00010
		

	}
}
