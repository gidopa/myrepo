package Generics;

import lombok.Getter;
import lombok.Setter;

/*
	제네릭 메소드
	- 제네릭 타입을 가지는 메소드
	- 제네릭 타입이 메소드 선언부에 명시됨.
	- 형식
		public <T> 리턴타입 메소드명(){}
	-예
		public <T> Box<T> boxing(T t){ }
		- 제네릭타입 T는 매개변수의 값이 어떤 타입이냐에 따라 컴파일 과정에서 구체적 타입으로 대체
		1. Box<Integer> box 1 = boxing(100);
*/
public class GenericTest04 {
	
	public static void main(String[] args) {
		Box<Integer> box =boxing(30);
		System.out.println(box.getT());
		Box<String> box2 = boxing("시이발");
		System.out.println(box2.getT());
	}
	
	public static <T> Box<T> boxing(T t){
		Box<T> box = new Box<>();
		box.setT(t);
		return box;
	}

}
@Getter
@Setter
class Box<T>{
	private T t;
	
}
