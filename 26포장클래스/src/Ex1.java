/*
	자바의 자료형
	  1.기본자료형 - int, char, boolean, double, float, byte, short, long 
	  2.참조자료형 - 참조변수를 만들기 위한 클래스자료형
	
	포장클래스(Wrapper Class)?
	  - 기본자료형의 데이터를 객체메모리의 변수에 저장할때 사용하는 클래스
	  - 기본자료형에 대응되는 래퍼클래스를 제공
	  기본자료형					래퍼클래스
	  byte						Byte
	  char						Character
	  boolean					Boolean
	  double					Double
	  float						Float
	  short 					Short
	  long						Long
	  int						Integer
	 
	 기본자료형의 데이터를 객체메모리 변수에 저장시키는 이유
	 Object obj 같은 파라미터로 넘겨야할때 기본자료형도 객체로 만들어 넘김 -> 업캐스팅  
*/
// 주제 : 래퍼클래스 Integer 클래스 만들어보기 

import lombok.AllArgsConstructor;

public class Ex1 {

	public static void main(String[] args) {
		IntWrapper intWrapped = new IntWrapper(7);
		showData(intWrapped);
		showData(5);
	}
	public static void showData(Object obj) {
		System.out.println(obj.toString());
		
	}
}

@AllArgsConstructor
class IntWrapper{
	private int num;
	
	
	@Override
	public String toString() {
		return ""+this.num;
	}
}







