package Generics;
//주제 : 정해진 자료형만 처리하는 클래스

import lombok.Getter;
import lombok.Setter;

public class GenericTest01 {

	public static void main(String[] args) {
		TestClass tc = new TestClass();
		tc.setMember(3);
		System.out.println(tc.getMember());
//		tc.setMember(3.4); // 실수형은 에러
		
	}

}
@Setter
@Getter
class TestClass{
	private int member;
	
}
