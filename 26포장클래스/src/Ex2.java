
public class Ex2 {

	public static void main(String[] args) {
	/*Integer 클래스 학습
		생성자 종류 2가지
		1.정수값을 매개변수로 받아서 저장하는 생성자
		2.문자열을 매개변수로 받아서 저장하는 생성자
		
	*/	
		String str = "20";
		Integer num1 = new Integer(10);
		Integer num2 = new Integer(str);
		int sum = num1 + num2; 
	/*
	 	Integer클래스의 메소드 호출
	 	int intValue() : Integer객체메리의 변수에 저장된 정수값을 반환
	 	2,8,16진수로 변환하는 to Binary/Octal/Hex String
	 	double doubleValue() : Integer객체메리의 변수에 저장된 정수값을 실수로 반환
	 	parseInt() : 숫자형 string을 int형으로 반환
	*/
		System.out.println(num1.intValue());
		System.out.println(num2.intValue());
		System.out.println("sum 30을 2진수로 변환 -> " + Integer.toBinaryString(sum));
		System.out.println("sum 30을 8진수로 변환 -> " + Integer.toOctalString(sum));
		System.out.println("sum 30을 16진수로 변환 -> " + Integer.toHexString(sum));
		Integer num3 = new Integer(30);
		System.out.println(num3.doubleValue());
		System.out.println(Integer.parseInt(str));
		System.out.println(Boolean.parseBoolean("true"));
	}

}
