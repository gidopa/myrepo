package ex1;
/*
	printLength()메소드는 문자열의 문자개수를 리턴하는 메소드
	이때 문자열
*/
public class ExceptionHandlingExam2 {

	public static void main(String[] args) {
		try {
		printLength(null);
		
		}catch(NullPointerException e) {
			//발생한 예외 메세지 출력 가능
			//방법1.
			System.out.println(e.getMessage());
			//방법2.
			System.out.println(e.toString());
			//방법3.
			e.printStackTrace();
		}finally {
			System.out.println("finally");
		}
		System.out.println("프로그램 종료");
	}
	
	public static void printLength(String str) {
		System.out.println(str.length());
	}
}
