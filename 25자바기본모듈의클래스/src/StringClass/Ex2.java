package StringClass;

public class Ex2 {

	public static void main(String[] args) {
		//String 클래스에서 제공하는 equals,subString
		String str = "Hello World";
		String str1 = "Hello World";
		String str2 = "House";
		
		System.out.println("여기" + str.substring(4));
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
		
		/*
			String 클래스에서 제공하는 contains메소드, replace 메소드 
			1)contains - public boolean contains(CharSequence s)
			- CharSequence - String 
			전체 문자열중에서 s가 포함되어 있는지 확인해 있으면 true 없으면 false를 리턴하는 메소드
			2)replace - public String replace(CharSequence target, CharSequence replacement)
			전체 문자열에서 원하는 문자열을 찾아 치환한 후 치환된 전체 문자열 리턴
			
		*/
		String e = new String("필요없는문자열해당문자열필요없는문자열");
		System.out.println(e.contains("해당문자열"));
		System.out.println(e.contains("문자열 포함?"));
		System.out.println(e.contains("JAVA"));
		System.out.println(e.contains("해당 문자열"));
		
		String java = new String("I love JAVAC");
		System.out.println(java.replace('C', '!'));
		System.out.println(java.replace("JAVAC", "Python"));
		
		/*
		 toLowerCase(), toUpperCase(), valueOf메소드
		 모든 문자열을 대소문자로 바꿔줌
		*/
		String test = "Fucking Pochi";
		System.out.println(test.toLowerCase());
		System.out.println(test.toUpperCase());
		int num = 45;
		System.out.println(String.valueOf(num));
		char[] arr = {'a','b','c'};
		System.out.println(String.valueOf(arr));
		boolean a = true;
		System.out.println(String.valueOf(a));
		
		
		
	}

}
