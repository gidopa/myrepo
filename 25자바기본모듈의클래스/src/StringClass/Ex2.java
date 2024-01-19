package StringClass;

public class Ex2 {

	public static void main(String[] args) {
		//String 클래스에서 제공하는 equals,subString
		String str = "Hello World";
		String str1 = "Hello World";
		String str2 = "House";
		
		System.out.println(str.substring(4));
		System.out.println(str.substring(4,5));
		System.out.println(str.equals(str1));
		System.out.println(str.equals(str2));
		System.out.println("Hi How21 Are you21".indexOf('2',10));
		
		//String 클래스에서 제공하는 trim(), concat()
		//trim 
		// -전체 문자열중 양쪽 공백 문자열이 있으면 없앤 문자열을 반환
		System.out.println("    Hi   hello     ".trim());
		String unicodeWhitespace = " \u2005Hello, \u2005\u2006\u2007\u2008 World! ";

        // strip 메소드 사용
        String stripped = unicodeWhitespace.strip();

        // trim 메소드 사용
        String trimmed = unicodeWhitespace.trim();

        System.out.println("Original: '" + unicodeWhitespace + "'");
        System.out.println("Stripped: '" + stripped + "'");
        System.out.println("Trimmed: '" + trimmed + "'");
		//concat
		//	- 두개의 문자열을 이어 줌
		
		System.out.println("Hi".concat(" Hello"));
		
		//+산술연산자로 각 Sring을 합쳐서 하나의 새로운 String 객체를 만들 수 있다. concat과 같음 
		System.out.println("Hi" + " Hello");
	}

}
