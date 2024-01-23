/*
	박싱(수동박싱), 언박싱(수동언박싱)
*/
public class Ex3 {

	public static void main(String[] args) {
		/*
		 * 박싱? => 기본자료형의 데이터를 래퍼클래스의 객체로 만드는 것 
		 * 박싱방법 2가지 
		 *  1) 래퍼클래스의 생성자를 호출해 박싱 new Integer(4); 
		 *  2) 래퍼클래스에 만들어 놓은 메소드를 호출해 박싱 Integer.valueOf(10); 
		 * 언박싱? => 래퍼클래스의 객체를 기본자료형의 데이터로 만드는 것
		 * 언 박싱 방법
		 *  - 해당 래퍼 객체가 제공하는 메소드를 호출해 기본자료형의 값을 얻음
		 *   예) Integer.intValue()
		 */
		int n = 10;
		Integer num2 = n; // auto boxing
		Integer num = Integer.valueOf(n); // manual boxing
		System.out.println(num.intValue());  // manual unboxing
		int m = num2;  // auto unboxing
		System.out.println(m);
		
	}

}
