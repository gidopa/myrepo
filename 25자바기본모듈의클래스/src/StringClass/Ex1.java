package StringClass;
/*
	String 클래스
	- java.lang 패키지에 만들어져 있는 클래스
	- 문자열을 저장할 용도로 사용되는 클래스
	- 문자열을 저장 해놓으면 문자열이 변경되지 않음을 보장 함. (immutable)
	
	String 객체 생성 방법 
	방법 1. 문자열 리터럴 상수를 직접 변수에 저장해 객체를 생성
	String str = "Hello Wordl";
	방법 2. new 연산자를 이용해 객체 생성
	String str = new String("Hello World");
	방법 3. new 연산자와 함께 문자 배열을 매개변수로 전달받아 하나로 합친 문자열
	String str = new String({'J','A','V','A'})
	
	방법 1 -> 같은 문자열은 같은 레퍼런스
	방법 2 -> 다 다른 레퍼런스 
*/
public class Ex1 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("JAVA");
		String str = "Hello World";
		String str1  = "Hello World";
		String str2 = new String("Hello World");
		String str3 = new String("Hello World");
		char[] charArr = {'J','A','V','A'};
		String str4 = new String(charArr);
		String str5 = new String(sb);
		String str6 = "JAVA_Study";
		
		System.out.print("str == str 1 : ");
		System.out.println(str==str1);
		System.out.print("str == str 2 : ");
		System.out.println(str==str2);
		System.out.print("str.equals(str2) : ");
		System.out.println(str.equals(str2));
		System.out.print("str3 == str2 : ");
		System.out.println(str3==str2);
		System.out.println(str5);
		System.out.println(sb);
		System.out.print("str4.equals(sb) : ");
		System.out.println(str4.equals(sb)); 
		System.out.print("str4.equals(sb.toString()) : ");
		System.out.println(str4.equals(sb.toString()));
		System.out.println();
		System.out.println(str6.length());
		String[] token = str6.split("_");
		System.out.println(token[0]);
		System.out.println(token[1]);
		System.out.println(str6.charAt(0));
		System.out.println(str6.indexOf('S'));
		System.out.println(str2.concat(" "+str6)); // 두 문자열을 이어준다
		
	}

}
