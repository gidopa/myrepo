
public class Date05 {
	public static void main(String[] args) {
//		int a = 23.7; int에 실수값 저장 x
		// float b = 23.7d;  컴파일 에러 
		// float b = 23.7; 자바는 default가 double 이라 23.7은 double 값으로 float 변수에 대입 못함
		double b = 23.7;
		float c = (float)23.7;
		float d = 23.7f;
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}
