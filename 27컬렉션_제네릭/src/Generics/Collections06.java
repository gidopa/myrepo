package Generics;

import java.util.Vector;
import java.util.List;
/*
	백터 객체 생성시 제네릭 타입 파라미터를 통해 벡터내의 데이터 객체의 타입을 지정한다
	Vector의 get 메소드를 호출해도 반환타입, 파라미터 타입 등이 타입 파라미터의 타입으로 바뀌기때문에 업/다운캐스팅 안해도 됨
*/


public class Collections06 {

	public static void main(String[] args) {
		/*
			Vec 객체 생성시 String으로 제네릭타입 명시하면 Vector 클래스 내부에 타입이 결정 되지 않았던 E라고 적혀 있던 부분이 String으로 바뀐다
			
		*/
		List<String> vec = new Vector<String>();
		vec.add("Apple");
		vec.add("Banana");
		vec.add("Orange");

		String temp;
		for (int i = 0; i < vec.size(); i++) {
			temp = vec.get(i);
			System.out.println(temp.toUpperCase());
		}
		for(String value : vec) {
			System.out.println(value.toLowerCase());
		}

	}
}
