
public class Date07 {
	public static void main(String[] args) {
		/*
		 * 참고
		 * 문자 상수는 각 문자에 대응되는 10진수 정수값 형태로 2진수로 변환되어 변수 메모리에 저장
		 * 유니코드 : 문자와 1:1 대응관계에 있는 10진수 정수값
		 * 
		 * 암기하면 유용한 유니코드값
		 * A -> 65
		 * a -> 97
		 * 정수형태의 문자 0 -> 48
		 */
	// 2바이트 크기의 한 문자를 정수형태로 변형해 저장할 x라는변수 선어
		char x = 'A';
		System.out.println(x + "->" + (int)x);
		
		x='0';
		System.out.println(x + "->" + (int)x);
				
		x='a';
		System.out.println(x + "->" + (int)x);
		
		x=0; // null 문자
		System.out.println(x + "->" + (int)x);
	}
}
