package ex1;
/*
	printLength()메소드는 문자열의 문자개수를 리턴하는 메소드
	이때 문자열
*/
public class ExceptionHandlingExam {

	public static void main(String[] args) {
		printLength(null);
		
	}
	
	public static void printLength(String str) {
		System.out.println(str.length());
	}
}
