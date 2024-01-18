package ex1;
// ClassNotFoundException
public class ExceptionHandlingExam3 {
	public static void main(String[] args) {
		try {
			Class.forName("java.lang.String");
			Class.forName("java.lang.String2");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
