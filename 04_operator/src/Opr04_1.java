/*
  문자 데이터의 비교
  문자데이터는 아스키코드로 저장, 문자의 대소비교 -> 사전식 순서 
  A -> 65 a ->97
  
 */
public class Opr04_1 {

	public static void main(String[] args) {
		char ch = 'w'; // ASCII -> 98
		String str;
		/*
		 * if(ch>='A' && ch<'Z') {
			System.out.println("대문자");
		}else if(ch>='a' && ch<='z'){
			System.out.println("소문자");
		}else {
			System.out.println("영어 아님");
		} 
		조건문
		*/
		boolean res = ch>='A' && ch<='Z';
		str = res ? "대문자" : "대문자 아님";
		System.out.println(ch + "문자는 " + str);
		// ds
	}

}
