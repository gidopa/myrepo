package ex1;
//배열의 없는 index위치에 값을 사용하거나 저장할 경우 발생하는 ArrayIndexOutOfBoundsException
//문자열 형태의 숫자가 아닌데 숫자로 변경하려할때 발생하는 NumberFormatException
public class ExceptionHandlingExam4 {

	public static void main(String[] args) {
		try {
			String[] arr = {"100","1oo"};
			for(int i = 0; i<arr.length;i++) {
				System.out.println(Integer.parseInt(arr[i])); 
			}
			
		}catch (NumberFormatException e) {
			e.printStackTrace();
		}catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		try {
			String[] arr = {"100","50"};
			for(int i = 0; i<3;i++) {
				System.out.println(Integer.parseInt(arr[i])); 
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
