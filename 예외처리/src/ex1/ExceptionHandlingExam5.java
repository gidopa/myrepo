package ex1;
//문자열 형태의 숫자가 아닌데 숫자로 변경하려할때 발생하는 NumberFormatException
//상위예외클래스 Exception 으로 처리 
public class ExceptionHandlingExam5 {

	public static void main(String[] args) {
		try {
			String[] arr = {"100","1oo",null,"200"};
			for(int i = 0; i<arr.length;i++) {
				System.out.println(Integer.parseInt(arr[i])); 
			}
			
			
		}catch(NumberFormatException | NullPointerException e) {
			e.printStackTrace();
		}
		catch (ArrayIndexOutOfBoundsException e) { // 일반예외 최고 부모 클래스 Exception의 매개변수를 가진 catch는 가장 아래쪽에 작성해 어떤 예외가 발생하던간에
			e.printStackTrace();	// 무조건 예외처리하여  프로그램이 끝까지 실행되도록 한다
		}
	}

}
