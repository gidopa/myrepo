package ex2;

public class ThrowsExam2 {

	public static void main(String[] args) {
		try{
			findClass();
			}catch (ClassNotFoundException e) {
				System.out.println("예외 발생");
				e.printStackTrace();
			}
		
	}
	public static void findClass()throws ClassNotFoundException {
		Class.forName("java.lang.String2");
		
	}

}
