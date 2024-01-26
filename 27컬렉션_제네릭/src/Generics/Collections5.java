package Generics;

import java.util.List;
import java.util.Vector;
/*
	Vector의 객체가 Object 타입이라 모든 종류의 객체가 저장가능
	이 벡터의 객체를 사용할때 모든 타입은 전부 Object -> 다른 특정 클래스의 메소드 호출하거나 다른 클래스의 자료형 참조변수에 저장하려면 다운캐스팅이 필수적임
	이걸 해결하고자 제네릭 기법이 나옴
	
*/
public class Collections5 {
	public static void main(String[] args) {
		List vector = new Vector();
		//Vector배열에 문자열만 저장한다
		vector.add("Apple");
		vector.add("Banana");
		vector.add("Orange");
		
		//다운캐스팅을하여 저장할 String 변수
		String temp;
		for(int i=0;i<vector.size();i++) {
			// Object obj = vector.get(i);
			// temp = (String) obj;
			temp = (String)vector.get(i); // 다운캐스팅 안하면 컴파일 에러남
			// 다운캐스팅으로 String의 메소드 호출가능
			System.out.println(temp.toUpperCase());
		}
	}
}
