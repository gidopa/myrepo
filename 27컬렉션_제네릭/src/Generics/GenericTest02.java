package Generics;

import lombok.Getter;
import lombok.Setter;

// 모든 자료형을 처리하는 클래스, Object형으로 클래스를 설계함으로써 생기는 단점(업/다운 캐스팅)
public class GenericTest02 {

	public static void main(String[] args) {
		TestClass02 tc2 = new TestClass02();
		tc2.setMember(3);
		System.out.println(tc2.getMember());
		tc2.setMember(Double.valueOf(4.5));
		System.out.println(tc2.getMember());
		tc2.setMember("Hi Hello h");
		System.out.println(tc2.getMember());
		String str = (String)tc2.getMember();
		System.out.println(str.charAt(3));
	}

}
@Getter
@Setter
class TestClass02{
	private Object member;
}
