package MathClass;

public class MathEx1 {

	public static void main(String[] args) {
		/*
			pulbic static int abs(int num) 
			절댓값을 리턴해주는 메소드
			
			public static double ceil(double d)
			- 매개변수 d의 값을 소수좀 첫번째 자리에서 올림하여 반환 음수의 실수값도 처리.
			
			Math.floor(double a): 주어진 숫자 이하의 가장 큰 정수를 반환
			Math.round(double a): 주어진 숫자를 반올림한 정수를 반환
			Math.pow(double a, double b): a의 b 제곱을 
			Math.sqrt(double a): 주어진 숫자의 제곱근을 반환
			
			public static int max(int n,int m)
			- 최댓값을 반환하는 메소드
			
			public static int min(int n,int m)
			- 최솟값을 반환하는 메소드
			
			 (int) (Math.random() * (m - n + 1)) + n  -> n~m사이의 정수 반환
			 
			
		*/
		System.out.println(Math.abs(-13));
		System.out.println(Math.ceil(-0.8));
		System.out.println(Math.max(3, 7));
		System.out.println(Math.min(-6.8, -5.9));
		System.out.println((int)(Math.random()*6) + 200);	
		System.out.println(Math.pow(3.5, 4.8));
		System.out.println(Math.pow(3, 3));
		System.out.println(Math.sqrt(9));
	}

}
